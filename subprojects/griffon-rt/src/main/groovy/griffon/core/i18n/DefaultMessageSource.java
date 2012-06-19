/*
 * Copyright 2010-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package griffon.core.i18n;

import java.text.MessageFormat;
import java.util.*;

/**
 * @author Andres Almiray
 * @since 1.1.0
 */
public class DefaultMessageSource extends AbstractMessageSource {
    private final String basename;
    private final Map<Locale, ResourceBundle> bundles = new LinkedHashMap<Locale, ResourceBundle>();

    public DefaultMessageSource(String basename) {
        this.basename = basename;
    }

    public String getBasename() {
        return basename;
    }

    public String getMessage(String key, Object[] args, Locale locale) throws NoSuchMessageException {
        if (null == args) args = EMPTY_OBJECT_ARGS;
        if (null == locale) locale = Locale.getDefault();
        try {
            String message = getBundle(locale).getString(key);
            return MessageFormat.format(message, args);
        } catch (MissingResourceException e) {
            throw new NoSuchMessageException(key, locale);
        }
    }

    protected ResourceBundle getBundle(Locale locale) {
        if (null == locale) locale = Locale.getDefault();
        ResourceBundle rb = bundles.get(locale);
        if (null == rb) {
            rb = CompositeResourceBundle.create(basename, locale);
            bundles.put(locale, rb);
        }
        return rb;
    }
}
