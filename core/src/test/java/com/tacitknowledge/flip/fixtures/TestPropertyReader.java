/* Copyright 2012 Tacit Knowledge
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.tacitknowledge.flip.fixtures;

import com.tacitknowledge.flip.model.FeatureDescriptor;
import com.tacitknowledge.flip.properties.FlipProperty;
import com.tacitknowledge.flip.properties.PropertyReader;
import java.util.Properties;

/**
 *
 * @author Serghei Soloviov <ssoloviov@tacitknowledge.com>
 */
@FlipProperty(priority=2)
public class TestPropertyReader implements PropertyReader {

    public FeatureDescriptor getFeatureDescriptor(String name) {
        FeatureDescriptor result = new FeatureDescriptor();
        result.setName("feature-1");
        return result;
    }

    public void initialize(Properties config) {
        
    }
    
}
