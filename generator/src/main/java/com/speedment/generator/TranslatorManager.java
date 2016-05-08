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
package com.speedment.generator;

import com.speedment.runtime.config.Project;
import com.speedment.fika.codegen.Meta;
import com.speedment.fika.codegen.model.File;

/**
 *
 * @author pemi
 */
public interface TranslatorManager {

    public void accept(Project project);

    public int getFilesCreated();

    public void writeToFile(Project project, Meta<File, String> meta, boolean overwriteExisting);

}
