/*
 * Copyright 2008-2014 the original author or authors.
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

package org.codehaus.griffon.gradle

import org.codehaus.griffon.gradle.tasks.AggregateCoberturaExtension
import org.codehaus.griffon.gradle.tasks.AggregateCoberturaMergeTask
import org.codehaus.griffon.gradle.tasks.AggregateCoberturaReportTask
import org.codehaus.griffon.gradle.tasks.GenerateBomTask
import org.gradle.api.Plugin
import org.gradle.api.Project

class GriffonBuildPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        AggregateCoberturaExtension coberturaExtension = project.extensions.create(AggregateCoberturaExtension.EXTENSION_NAME, AggregateCoberturaExtension, project)

        project.tasks.create(name: AggregateCoberturaMergeTask.TASK_NAME,
            description: 'Aggregates Cobertura data files',
            group: 'Reporting',
            type: AggregateCoberturaMergeTask, {
            extension = coberturaExtension
        })

        project.tasks.create(name: AggregateCoberturaReportTask.TASK_NAME,
            description: 'Aggregates Cobertura report files',
            group: 'Reporting',
            type: AggregateCoberturaReportTask, {
            extension = coberturaExtension
        })

        project.tasks.create(name: GenerateBomTask.TASK_NAME,
            description: 'Generates a BOM file',
            group: 'Publishing',
            type: GenerateBomTask)
    }
}
