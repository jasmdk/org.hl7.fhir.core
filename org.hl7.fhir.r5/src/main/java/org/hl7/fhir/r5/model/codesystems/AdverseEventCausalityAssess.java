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

public enum AdverseEventCausalityAssess {

        /**
         * i) Event or laboratory test abnormality, with plausible time relationship to drug intake; ii) Cannot be explained by disease or other drugs; iii) Response to withdrawal plausible (pharmacologically, pathologically); iv) Event definitive pharmacologically or phenomenologically (i.e. an objective and specific medical disorder or a recognized pharmacological phenomenon); or v) Re-challenge satisfactory, if necessary.
         */
        CERTAIN, 
        /**
         * i) Event or laboratory test abnormality, with reasonable time relationship to drug intake; ii) Unlikely to be attributed to disease or other drugs; iii) Response to withdrawal clinically reasonable; or iv) Re-challenge not required.
         */
        PROBABLYLIKELY, 
        /**
         * i) Event or laboratory test abnormality, with reasonable time relationship to drug intake; ii) Could also be explained by disease or other drugs; or iii) Information on drug withdrawal may be lacking or unclear.
         */
        POSSIBLE, 
        /**
         * i) Event or laboratory test abnormality, with a time to drug intake that makes a relationship improbable (but not impossible); or ii) Disease or other drugs provide plausible explanations.
         */
        UNLIKELY, 
        /**
         * i) Event or laboratory test abnormality; ii) More data for proper assessment needed; or iii) Additional data under examination.
         */
        CONDITIONALCLASSIFIED, 
        /**
         * i) Report suggesting an adverse reaction; ii) Cannot be judged because information is insufficient or contradictory; or iii) Data cannot be supplemented or verified.
         */
        UNASSESSABLEUNCLASSIFIABLE, 
        /**
         * added to help the parsers
         */
        NULL;
        public static AdverseEventCausalityAssess fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("certain".equals(codeString))
          return CERTAIN;
        if ("probably-likely".equals(codeString))
          return PROBABLYLIKELY;
        if ("possible".equals(codeString))
          return POSSIBLE;
        if ("unlikely".equals(codeString))
          return UNLIKELY;
        if ("conditional-classified".equals(codeString))
          return CONDITIONALCLASSIFIED;
        if ("unassessable-unclassifiable".equals(codeString))
          return UNASSESSABLEUNCLASSIFIABLE;
        throw new FHIRException("Unknown AdverseEventCausalityAssess code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case CERTAIN: return "certain";
            case PROBABLYLIKELY: return "probably-likely";
            case POSSIBLE: return "possible";
            case UNLIKELY: return "unlikely";
            case CONDITIONALCLASSIFIED: return "conditional-classified";
            case UNASSESSABLEUNCLASSIFIABLE: return "unassessable-unclassifiable";
            default: return "?";
          }
        }
        public String getSystem() {
          return "http://terminology.hl7.org/CodeSystem/adverse-event-causality-assess";
        }
        public String getDefinition() {
          switch (this) {
            case CERTAIN: return "i) Event or laboratory test abnormality, with plausible time relationship to drug intake; ii) Cannot be explained by disease or other drugs; iii) Response to withdrawal plausible (pharmacologically, pathologically); iv) Event definitive pharmacologically or phenomenologically (i.e. an objective and specific medical disorder or a recognized pharmacological phenomenon); or v) Re-challenge satisfactory, if necessary.";
            case PROBABLYLIKELY: return "i) Event or laboratory test abnormality, with reasonable time relationship to drug intake; ii) Unlikely to be attributed to disease or other drugs; iii) Response to withdrawal clinically reasonable; or iv) Re-challenge not required.";
            case POSSIBLE: return "i) Event or laboratory test abnormality, with reasonable time relationship to drug intake; ii) Could also be explained by disease or other drugs; or iii) Information on drug withdrawal may be lacking or unclear.";
            case UNLIKELY: return "i) Event or laboratory test abnormality, with a time to drug intake that makes a relationship improbable (but not impossible); or ii) Disease or other drugs provide plausible explanations.";
            case CONDITIONALCLASSIFIED: return "i) Event or laboratory test abnormality; ii) More data for proper assessment needed; or iii) Additional data under examination.";
            case UNASSESSABLEUNCLASSIFIABLE: return "i) Report suggesting an adverse reaction; ii) Cannot be judged because information is insufficient or contradictory; or iii) Data cannot be supplemented or verified.";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case CERTAIN: return "Certain";
            case PROBABLYLIKELY: return "Probably/Likely";
            case POSSIBLE: return "Possible";
            case UNLIKELY: return "Unlikely";
            case CONDITIONALCLASSIFIED: return "Conditional/Classified";
            case UNASSESSABLEUNCLASSIFIABLE: return "Unassessable/Unclassifiable";
            default: return "?";
          }
    }


}

