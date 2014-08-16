/* Licensed under the Apache License, Version 2.0 (the "License");
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

package org.activiti.engine.impl.pvm;

import java.util.Map;



/**
 * @author Tom Baeyens
 */
public interface PvmExecution {

  void signal(String signalName, Object signalData);

  PvmActivity getActivity();
  
  boolean hasVariable(String variableName);
  void setVariable(String variableName, Object value);
  Object getVariable(String variableName);
    <T> T getVariable(String variableName, Class<T> variableClass);
  Map<String, Object> getVariables();
}
