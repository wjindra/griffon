/*
 * Copyright 2008-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package griffon.pivot.support.adapters;

import griffon.core.CallableWithArgs;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class FormAdapterTest {
    private FormAdapter adapter = new FormAdapter();

    @Test
    public void testSectionInserted() {
        final boolean[] invoked = new boolean[1];
        CallableWithArgs<Void> callable = new CallableWithArgs<Void>() {
            public Void call(Object... args) {
                invoked[0] = true;
                return null;
            } 
        };

        assertNull(adapter.getSectionInserted());
        adapter.sectionInserted(null, 0);
        assertFalse(invoked[0]);

        adapter.setSectionInserted(callable);
        adapter.sectionInserted(null, 0);
        assertTrue(invoked[0]);
    }

    @Test
    public void testSectionsRemoved() {
        final boolean[] invoked = new boolean[1];
        CallableWithArgs<Void> callable = new CallableWithArgs<Void>() {
            public Void call(Object... args) {
                invoked[0] = true;
                return null;
            } 
        };

        assertNull(adapter.getSectionsRemoved());
        adapter.sectionsRemoved(null, 0, null);
        assertFalse(invoked[0]);

        adapter.setSectionsRemoved(callable);
        adapter.sectionsRemoved(null, 0, null);
        assertTrue(invoked[0]);
    }

    @Test
    public void testSectionHeadingChanged() {
        final boolean[] invoked = new boolean[1];
        CallableWithArgs<Void> callable = new CallableWithArgs<Void>() {
            public Void call(Object... args) {
                invoked[0] = true;
                return null;
            } 
        };

        assertNull(adapter.getSectionHeadingChanged());
        adapter.sectionHeadingChanged(null);
        assertFalse(invoked[0]);

        adapter.setSectionHeadingChanged(callable);
        adapter.sectionHeadingChanged(null);
        assertTrue(invoked[0]);
    }

    @Test
    public void testFieldInserted() {
        final boolean[] invoked = new boolean[1];
        CallableWithArgs<Void> callable = new CallableWithArgs<Void>() {
            public Void call(Object... args) {
                invoked[0] = true;
                return null;
            } 
        };

        assertNull(adapter.getFieldInserted());
        adapter.fieldInserted(null, 0);
        assertFalse(invoked[0]);

        adapter.setFieldInserted(callable);
        adapter.fieldInserted(null, 0);
        assertTrue(invoked[0]);
    }

    @Test
    public void testFieldsRemoved() {
        final boolean[] invoked = new boolean[1];
        CallableWithArgs<Void> callable = new CallableWithArgs<Void>() {
            public Void call(Object... args) {
                invoked[0] = true;
                return null;
            } 
        };

        assertNull(adapter.getFieldsRemoved());
        adapter.fieldsRemoved(null, 0, null);
        assertFalse(invoked[0]);

        adapter.setFieldsRemoved(callable);
        adapter.fieldsRemoved(null, 0, null);
        assertTrue(invoked[0]);
    }

}
