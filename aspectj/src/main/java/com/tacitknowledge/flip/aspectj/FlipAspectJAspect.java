/*
 * Copyright 2012 Tacit Knowledge.
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
package com.tacitknowledge.flip.aspectj;

import org.aspectj.lang.annotation.Aspect;

/**
 * The default AspectJ aspect. When you configure the AspectJ specify this
 * aspect to intercept all methods annotated with {@link Flippable}.
 * 
 * @author ssoloviov
 */
@Aspect
public class FlipAspectJAspect extends FlipAbstractAspect {
    
    /**
     * Instantiates and returns the aspect to AspectJ.
     * 
     * @return the {@link FlipAspectJAspect} instance.
     */
    public static FlipAspectJAspect aspectOf() {
        return new FlipAspectJAspect();
    }    
    
}
