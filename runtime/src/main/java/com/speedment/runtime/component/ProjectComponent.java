/**
 *
 * Copyright (c) 2006-2016, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.runtime.component;

import com.speedment.runtime.annotation.Api;
import com.speedment.runtime.config.Project;

/**
 * This Component interface is used for holding the current {@link Project} that is being
 * used by Speedment.
 *
 * @author Emil Forslund
 * @since 2.0
 */
@Api(version = "2.3")
public interface ProjectComponent extends Component {

    @Override
    default Class<ProjectComponent> getComponentClass() {
        return ProjectComponent.class;
    }

    /**
     * Returns the current {@link Project}.
     *
     * @return the current {@link Project}
     */
    Project getProject();

    /**
     * Sets the current {@link Project}.
     *
     * @param project to set
     */
    void setProject(Project project);
}
