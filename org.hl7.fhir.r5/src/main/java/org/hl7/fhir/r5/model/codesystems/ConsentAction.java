package org.hl7.fhir.r5.model.codesystems;

/*
 * #%L
 * org.hl7.fhir.r5
 * %%
 * Copyright (C) 2014 - 2019 Health Level 7
 * %%
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
 * #L%
 */

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Thu, Oct 17, 2019 09:42+1100 for FHIR v4.1.0


import org.hl7.fhir.exceptions.FHIRException;

public enum ConsentAction {

        /**
         * Gather retrieved information for storage
         */
        COLLECT, 
        /**
         * Retrieval without permitting collection, use or disclosure. e.g., no screen-scraping for collection, use or disclosure (view-only access)
         */
        ACCESS, 
        /**
         * Utilize the retrieved information
         */
        USE, 
        /**
         * Transfer retrieved information
         */
        DISCLOSE, 
        /**
         * Allow retrieval of a patient's information for the purpose of update or rectify
         */
        CORRECT, 
        /**
         * added to help the parsers
         */
        NULL;
        public static ConsentAction fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("collect".equals(codeString))
          return COLLECT;
        if ("access".equals(codeString))
          return ACCESS;
        if ("use".equals(codeString))
          return USE;
        if ("disclose".equals(codeString))
          return DISCLOSE;
        if ("correct".equals(codeString))
          return CORRECT;
        throw new FHIRException("Unknown ConsentAction code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case COLLECT: return "collect";
            case ACCESS: return "access";
            case USE: return "use";
            case DISCLOSE: return "disclose";
            case CORRECT: return "correct";
            default: return "?";
          }
        }
        public String getSystem() {
          return "http://terminology.hl7.org/CodeSystem/consentaction";
        }
        public String getDefinition() {
          switch (this) {
            case COLLECT: return "Gather retrieved information for storage";
            case ACCESS: return "Retrieval without permitting collection, use or disclosure. e.g., no screen-scraping for collection, use or disclosure (view-only access)";
            case USE: return "Utilize the retrieved information";
            case DISCLOSE: return "Transfer retrieved information";
            case CORRECT: return "Allow retrieval of a patient's information for the purpose of update or rectify";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case COLLECT: return "Collect";
            case ACCESS: return "Access";
            case USE: return "Use";
            case DISCLOSE: return "Disclose";
            case CORRECT: return "Access and Correct";
            default: return "?";
          }
    }


}

