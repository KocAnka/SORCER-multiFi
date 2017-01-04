/*
 * Copyright 2009 the original author or authors.
 * Copyright 2009 SorcerSoft.org.
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

package sorcer.service.modeling;

import sorcer.service.*;

import java.rmi.RemoteException;

/**
 * An top-level common interface for all service Models in SORCER.
 *
 * @author Mike Sobolewski
 */
public interface ContextModel extends Model, Dependency {

    /**
     * Returns a model current response context.
     *
     * @return a current response context
     * @throws ContextException
     * @throws RemoteException
     */
    public Object getResult() throws ContextException, RemoteException;

    /**
     * Returns a requested evaluation context with a provided input context.
     *
     * @param inputContext a context for this evaluation
     * @return the result context of this evaluation
     * @throws ContextException
     * @throws RemoteException
     */
    public Context evaluate(Context inputContext) throws ContextException, RemoteException;

    /**
     * Sets a buider of this model to be used for replication when needed.
     *
     * @param signature
     */
    public void setBuilder(Signature signature);

    /**
     * Returns a model controller for this model.
     *
     * @return this model control strategy
     * @throws ModelException
     */
    public MogramStrategy getMogramStrategy();

}