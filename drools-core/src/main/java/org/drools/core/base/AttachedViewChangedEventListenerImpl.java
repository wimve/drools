/*
 * Copyright 2010 JBoss Inc
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

package org.drools.core.base;

import org.kie.api.runtime.rule.AttachedViewChangedEventListener;

public class AttachedViewChangedEventListenerImpl
    implements
    AttachedViewChangedEventListener {

    public void close() {
        
//        try {
//            startOperation();
//            this.ruleBase.readLock();
//            this.lock.lock();
//            DroolsQuery queryObject = new DroolsQuery( query,
//                                                       arguments,
//                                                       new ExternalViewEventListenerAdapter(listener) );
//            InternalFactHandle handle = this.handleFactory.newFactHandle( queryObject,
//                                                                          this.getObjectTypeConfigurationRegistry().getObjectTypeConf( EntryPoint.DEFAULT,
//                                                                                                                                       queryObject ),
//                                                                          this );
//
//            insert( handle,
//                    queryObject,
//                    null,
//                    null,
//                    this.typeConfReg.getObjectTypeConf( this.entryPoint,
//                                                        queryObject ) );
//
//            this.handleFactory.destroyFactHandle( handle );
//
//        } finally {
//            this.lock.unlock();
//            this.ruleBase.readUnlock();
//            endOperation();
//        }
    }

}
