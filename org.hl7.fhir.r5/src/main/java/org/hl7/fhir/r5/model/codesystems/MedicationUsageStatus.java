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

public enum MedicationUsageStatus {

        /**
         * The medication is still being taken.
         */
        ACTIVE, 
        /**
         * The medication is no longer being taken.
         */
        COMPLETED, 
        /**
         * Some of the actions that are implied by the medication usage may have occurred.  For example, the patient may have taken some of the medication.  Clinical decision support systems should take this status into account.
         */
        ENTEREDINERROR, 
        /**
         * The medication may be taken at some time in the future.
         */
        INTENDED, 
        /**
         * Actions implied by the usage have been permanently halted, before all of them occurred. This should not be used if the statement was entered in error.
         */
        STOPPED, 
        /**
         * Actions implied by the usage have been temporarily halted, but are expected to continue later. May also be called 'suspended'.
         */
        ONHOLD, 
        /**
         * The state of the medication use is not currently known.
         */
        UNKNOWN, 
        /**
         * The medication was not consumed by the patient
         */
        NOTTAKEN, 
        /**
         * added to help the parsers
         */
        NULL;
        public static MedicationUsageStatus fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("active".equals(codeString))
          return ACTIVE;
        if ("completed".equals(codeString))
          return COMPLETED;
        if ("entered-in-error".equals(codeString))
          return ENTEREDINERROR;
        if ("intended".equals(codeString))
          return INTENDED;
        if ("stopped".equals(codeString))
          return STOPPED;
        if ("on-hold".equals(codeString))
          return ONHOLD;
        if ("unknown".equals(codeString))
          return UNKNOWN;
        if ("not-taken".equals(codeString))
          return NOTTAKEN;
        throw new FHIRException("Unknown MedicationUsageStatus code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case ACTIVE: return "active";
            case COMPLETED: return "completed";
            case ENTEREDINERROR: return "entered-in-error";
            case INTENDED: return "intended";
            case STOPPED: return "stopped";
            case ONHOLD: return "on-hold";
            case UNKNOWN: return "unknown";
            case NOTTAKEN: return "not-taken";
            default: return "?";
          }
        }
        public String getSystem() {
          return "http://hl7.org/fhir/CodeSystem/medication-usage-status";
        }
        public String getDefinition() {
          switch (this) {
            case ACTIVE: return "The medication is still being taken.";
            case COMPLETED: return "The medication is no longer being taken.";
            case ENTEREDINERROR: return "Some of the actions that are implied by the medication usage may have occurred.  For example, the patient may have taken some of the medication.  Clinical decision support systems should take this status into account.";
            case INTENDED: return "The medication may be taken at some time in the future.";
            case STOPPED: return "Actions implied by the usage have been permanently halted, before all of them occurred. This should not be used if the statement was entered in error.";
            case ONHOLD: return "Actions implied by the usage have been temporarily halted, but are expected to continue later. May also be called 'suspended'.";
            case UNKNOWN: return "The state of the medication use is not currently known.";
            case NOTTAKEN: return "The medication was not consumed by the patient";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case ACTIVE: return "Active";
            case COMPLETED: return "Completed";
            case ENTEREDINERROR: return "Entered in Error";
            case INTENDED: return "Intended";
            case STOPPED: return "Stopped";
            case ONHOLD: return "On Hold";
            case UNKNOWN: return "Unknown";
            case NOTTAKEN: return "Not Taken";
            default: return "?";
          }
    }


}

