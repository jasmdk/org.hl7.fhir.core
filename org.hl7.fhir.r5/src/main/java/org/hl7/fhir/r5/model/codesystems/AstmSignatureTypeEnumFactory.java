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


import org.hl7.fhir.r5.model.EnumFactory;

public class AstmSignatureTypeEnumFactory implements EnumFactory<AstmSignatureType> {

  public AstmSignatureType fromCode(String codeString) throws IllegalArgumentException {
    if (codeString == null || "".equals(codeString))
      return null;
    if ("1.2.840.10065.1.12.1.1".equals(codeString))
      return AstmSignatureType.OID_1_2_840_10065_1_12_1_1;
    if ("1.2.840.10065.1.12.1.2".equals(codeString))
      return AstmSignatureType.OID_1_2_840_10065_1_12_1_2;
    if ("1.2.840.10065.1.12.1.3".equals(codeString))
      return AstmSignatureType.OID_1_2_840_10065_1_12_1_3;
    if ("1.2.840.10065.1.12.1.4".equals(codeString))
      return AstmSignatureType.OID_1_2_840_10065_1_12_1_4;
    if ("1.2.840.10065.1.12.1.5".equals(codeString))
      return AstmSignatureType.OID_1_2_840_10065_1_12_1_5;
    if ("1.2.840.10065.1.12.1.6".equals(codeString))
      return AstmSignatureType.OID_1_2_840_10065_1_12_1_6;
    if ("1.2.840.10065.1.12.1.7".equals(codeString))
      return AstmSignatureType.OID_1_2_840_10065_1_12_1_7;
    if ("1.2.840.10065.1.12.1.8".equals(codeString))
      return AstmSignatureType.OID_1_2_840_10065_1_12_1_8;
    if ("1.2.840.10065.1.12.1.9".equals(codeString))
      return AstmSignatureType.OID_1_2_840_10065_1_12_1_9;
    if ("1.2.840.10065.1.12.1.10".equals(codeString))
      return AstmSignatureType.OID_1_2_840_10065_1_12_1_10;
    if ("1.2.840.10065.1.12.1.11".equals(codeString))
      return AstmSignatureType.OID_1_2_840_10065_1_12_1_11;
    if ("1.2.840.10065.1.12.1.12".equals(codeString))
      return AstmSignatureType.OID_1_2_840_10065_1_12_1_12;
    if ("1.2.840.10065.1.12.1.13".equals(codeString))
      return AstmSignatureType.OID_1_2_840_10065_1_12_1_13;
    if ("1.2.840.10065.1.12.1.14".equals(codeString))
      return AstmSignatureType.OID_1_2_840_10065_1_12_1_14;
    if ("1.2.840.10065.1.12.1.15".equals(codeString))
      return AstmSignatureType.OID_1_2_840_10065_1_12_1_15;
    if ("1.2.840.10065.1.12.1.16".equals(codeString))
      return AstmSignatureType.OID_1_2_840_10065_1_12_1_16;
    if ("1.2.840.10065.1.12.1.17".equals(codeString))
      return AstmSignatureType.OID_1_2_840_10065_1_12_1_17;
    if ("1.2.840.10065.1.12.1.18".equals(codeString))
      return AstmSignatureType.OID_1_2_840_10065_1_12_1_18;
    throw new IllegalArgumentException("Unknown AstmSignatureType code '"+codeString+"'");
  }

  public String toCode(AstmSignatureType code) {
    if (code == AstmSignatureType.OID_1_2_840_10065_1_12_1_1)
      return "1.2.840.10065.1.12.1.1";
    if (code == AstmSignatureType.OID_1_2_840_10065_1_12_1_2)
      return "1.2.840.10065.1.12.1.2";
    if (code == AstmSignatureType.OID_1_2_840_10065_1_12_1_3)
      return "1.2.840.10065.1.12.1.3";
    if (code == AstmSignatureType.OID_1_2_840_10065_1_12_1_4)
      return "1.2.840.10065.1.12.1.4";
    if (code == AstmSignatureType.OID_1_2_840_10065_1_12_1_5)
      return "1.2.840.10065.1.12.1.5";
    if (code == AstmSignatureType.OID_1_2_840_10065_1_12_1_6)
      return "1.2.840.10065.1.12.1.6";
    if (code == AstmSignatureType.OID_1_2_840_10065_1_12_1_7)
      return "1.2.840.10065.1.12.1.7";
    if (code == AstmSignatureType.OID_1_2_840_10065_1_12_1_8)
      return "1.2.840.10065.1.12.1.8";
    if (code == AstmSignatureType.OID_1_2_840_10065_1_12_1_9)
      return "1.2.840.10065.1.12.1.9";
    if (code == AstmSignatureType.OID_1_2_840_10065_1_12_1_10)
      return "1.2.840.10065.1.12.1.10";
    if (code == AstmSignatureType.OID_1_2_840_10065_1_12_1_11)
      return "1.2.840.10065.1.12.1.11";
    if (code == AstmSignatureType.OID_1_2_840_10065_1_12_1_12)
      return "1.2.840.10065.1.12.1.12";
    if (code == AstmSignatureType.OID_1_2_840_10065_1_12_1_13)
      return "1.2.840.10065.1.12.1.13";
    if (code == AstmSignatureType.OID_1_2_840_10065_1_12_1_14)
      return "1.2.840.10065.1.12.1.14";
    if (code == AstmSignatureType.OID_1_2_840_10065_1_12_1_15)
      return "1.2.840.10065.1.12.1.15";
    if (code == AstmSignatureType.OID_1_2_840_10065_1_12_1_16)
      return "1.2.840.10065.1.12.1.16";
    if (code == AstmSignatureType.OID_1_2_840_10065_1_12_1_17)
      return "1.2.840.10065.1.12.1.17";
    if (code == AstmSignatureType.OID_1_2_840_10065_1_12_1_18)
      return "1.2.840.10065.1.12.1.18";
    return "?";
  }

    public String toSystem(AstmSignatureType code) {
      return code.getSystem();
      }

}

