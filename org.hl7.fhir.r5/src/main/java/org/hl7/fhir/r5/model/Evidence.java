package org.hl7.fhir.r5.model;

/*-
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

// Generated on Thu, Dec 13, 2018 14:07+1100 for FHIR v4.0.0
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.instance.model.api.ICompositeType;

import org.hl7.fhir.instance.model.api.IBaseDatatypeElement;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.r5.model.Enumerations.*;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.model.api.annotation.SearchParamDefinition;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.ChildOrder;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Block;
/**
 * This represents statistics, certainty, both the intended and actual population, and evidence variables.
 */
@ResourceDef(name="Evidence", profile="http://hl7.org/fhir/StructureDefinition/Evidence")
@ChildOrder(names={"url", "identifier", "version", "title", "status", "useContext", "date", "approvalDate", "lastReviewDate", "contributor", "relatedArtifact", "description", "assertion", "note", "referentGroup", "variableDefinition", "synthesisType", "studyType", "statistic", "distribution", "certainty"})
public class Evidence extends MetadataResource {

    @Block()
    public static class EvidenceReferentGroupComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Textual description of referent group.
         */
        @Child(name = "description", type = {MarkdownType.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Textual description of referent group", formalDefinition="Textual description of referent group." )
        protected MarkdownType description;

        /**
         * Footnotes and/or explanatory notes.
         */
        @Child(name = "note", type = {Annotation.class}, order=2, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Footnotes and/or explanatory notes", formalDefinition="Footnotes and/or explanatory notes." )
        protected List<Annotation> note;

        /**
         * Various information categories of group.
         */
        @Child(name = "evidenceSource", type = {Group.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Various information categories of group", formalDefinition="Various information categories of group." )
        protected Reference evidenceSource;

        /**
         * Non-actual group that is a set of characteristics.
         */
        @Child(name = "intendedGroup", type = {Group.class}, order=4, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Non-actual group that is a set of characteristics", formalDefinition="Non-actual group that is a set of characteristics." )
        protected Reference intendedGroup;

        /**
         * Indication of quality of match between intended group to actual group.
         */
        @Child(name = "directnessMatch", type = {CodeableConcept.class}, order=5, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="low | moderate | high | exact", formalDefinition="Indication of quality of match between intended group to actual group." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/directness")
        protected CodeableConcept directnessMatch;

        private static final long serialVersionUID = -444548956L;

    /**
     * Constructor
     */
      public EvidenceReferentGroupComponent() {
        super();
      }

        /**
         * @return {@link #description} (Textual description of referent group.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public MarkdownType getDescriptionElement() { 
          if (this.description == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EvidenceReferentGroupComponent.description");
            else if (Configuration.doAutoCreate())
              this.description = new MarkdownType(); // bb
          return this.description;
        }

        public boolean hasDescriptionElement() { 
          return this.description != null && !this.description.isEmpty();
        }

        public boolean hasDescription() { 
          return this.description != null && !this.description.isEmpty();
        }

        /**
         * @param value {@link #description} (Textual description of referent group.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public EvidenceReferentGroupComponent setDescriptionElement(MarkdownType value) { 
          this.description = value;
          return this;
        }

        /**
         * @return Textual description of referent group.
         */
        public String getDescription() { 
          return this.description == null ? null : this.description.getValue();
        }

        /**
         * @param value Textual description of referent group.
         */
        public EvidenceReferentGroupComponent setDescription(String value) { 
          if (value == null)
            this.description = null;
          else {
            if (this.description == null)
              this.description = new MarkdownType();
            this.description.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #note} (Footnotes and/or explanatory notes.)
         */
        public List<Annotation> getNote() { 
          if (this.note == null)
            this.note = new ArrayList<Annotation>();
          return this.note;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public EvidenceReferentGroupComponent setNote(List<Annotation> theNote) { 
          this.note = theNote;
          return this;
        }

        public boolean hasNote() { 
          if (this.note == null)
            return false;
          for (Annotation item : this.note)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Annotation addNote() { //3
          Annotation t = new Annotation();
          if (this.note == null)
            this.note = new ArrayList<Annotation>();
          this.note.add(t);
          return t;
        }

        public EvidenceReferentGroupComponent addNote(Annotation t) { //3
          if (t == null)
            return this;
          if (this.note == null)
            this.note = new ArrayList<Annotation>();
          this.note.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #note}, creating it if it does not already exist
         */
        public Annotation getNoteFirstRep() { 
          if (getNote().isEmpty()) {
            addNote();
          }
          return getNote().get(0);
        }

        /**
         * @return {@link #evidenceSource} (Various information categories of group.)
         */
        public Reference getEvidenceSource() { 
          if (this.evidenceSource == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EvidenceReferentGroupComponent.evidenceSource");
            else if (Configuration.doAutoCreate())
              this.evidenceSource = new Reference(); // cc
          return this.evidenceSource;
        }

        public boolean hasEvidenceSource() { 
          return this.evidenceSource != null && !this.evidenceSource.isEmpty();
        }

        /**
         * @param value {@link #evidenceSource} (Various information categories of group.)
         */
        public EvidenceReferentGroupComponent setEvidenceSource(Reference value) { 
          this.evidenceSource = value;
          return this;
        }

        /**
         * @return {@link #intendedGroup} (Non-actual group that is a set of characteristics.)
         */
        public Reference getIntendedGroup() { 
          if (this.intendedGroup == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EvidenceReferentGroupComponent.intendedGroup");
            else if (Configuration.doAutoCreate())
              this.intendedGroup = new Reference(); // cc
          return this.intendedGroup;
        }

        public boolean hasIntendedGroup() { 
          return this.intendedGroup != null && !this.intendedGroup.isEmpty();
        }

        /**
         * @param value {@link #intendedGroup} (Non-actual group that is a set of characteristics.)
         */
        public EvidenceReferentGroupComponent setIntendedGroup(Reference value) { 
          this.intendedGroup = value;
          return this;
        }

        /**
         * @return {@link #directnessMatch} (Indication of quality of match between intended group to actual group.)
         */
        public CodeableConcept getDirectnessMatch() { 
          if (this.directnessMatch == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EvidenceReferentGroupComponent.directnessMatch");
            else if (Configuration.doAutoCreate())
              this.directnessMatch = new CodeableConcept(); // cc
          return this.directnessMatch;
        }

        public boolean hasDirectnessMatch() { 
          return this.directnessMatch != null && !this.directnessMatch.isEmpty();
        }

        /**
         * @param value {@link #directnessMatch} (Indication of quality of match between intended group to actual group.)
         */
        public EvidenceReferentGroupComponent setDirectnessMatch(CodeableConcept value) { 
          this.directnessMatch = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("description", "markdown", "Textual description of referent group.", 0, 1, description));
          children.add(new Property("note", "Annotation", "Footnotes and/or explanatory notes.", 0, java.lang.Integer.MAX_VALUE, note));
          children.add(new Property("evidenceSource", "Reference(Group)", "Various information categories of group.", 0, 1, evidenceSource));
          children.add(new Property("intendedGroup", "Reference(Group)", "Non-actual group that is a set of characteristics.", 0, 1, intendedGroup));
          children.add(new Property("directnessMatch", "CodeableConcept", "Indication of quality of match between intended group to actual group.", 0, 1, directnessMatch));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -1724546052: /*description*/  return new Property("description", "markdown", "Textual description of referent group.", 0, 1, description);
          case 3387378: /*note*/  return new Property("note", "Annotation", "Footnotes and/or explanatory notes.", 0, java.lang.Integer.MAX_VALUE, note);
          case 324572498: /*evidenceSource*/  return new Property("evidenceSource", "Reference(Group)", "Various information categories of group.", 0, 1, evidenceSource);
          case -777873132: /*intendedGroup*/  return new Property("intendedGroup", "Reference(Group)", "Non-actual group that is a set of characteristics.", 0, 1, intendedGroup);
          case -2144864283: /*directnessMatch*/  return new Property("directnessMatch", "CodeableConcept", "Indication of quality of match between intended group to actual group.", 0, 1, directnessMatch);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1724546052: /*description*/ return this.description == null ? new Base[0] : new Base[] {this.description}; // MarkdownType
        case 3387378: /*note*/ return this.note == null ? new Base[0] : this.note.toArray(new Base[this.note.size()]); // Annotation
        case 324572498: /*evidenceSource*/ return this.evidenceSource == null ? new Base[0] : new Base[] {this.evidenceSource}; // Reference
        case -777873132: /*intendedGroup*/ return this.intendedGroup == null ? new Base[0] : new Base[] {this.intendedGroup}; // Reference
        case -2144864283: /*directnessMatch*/ return this.directnessMatch == null ? new Base[0] : new Base[] {this.directnessMatch}; // CodeableConcept
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1724546052: // description
          this.description = castToMarkdown(value); // MarkdownType
          return value;
        case 3387378: // note
          this.getNote().add(castToAnnotation(value)); // Annotation
          return value;
        case 324572498: // evidenceSource
          this.evidenceSource = castToReference(value); // Reference
          return value;
        case -777873132: // intendedGroup
          this.intendedGroup = castToReference(value); // Reference
          return value;
        case -2144864283: // directnessMatch
          this.directnessMatch = castToCodeableConcept(value); // CodeableConcept
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("description")) {
          this.description = castToMarkdown(value); // MarkdownType
        } else if (name.equals("note")) {
          this.getNote().add(castToAnnotation(value));
        } else if (name.equals("evidenceSource")) {
          this.evidenceSource = castToReference(value); // Reference
        } else if (name.equals("intendedGroup")) {
          this.intendedGroup = castToReference(value); // Reference
        } else if (name.equals("directnessMatch")) {
          this.directnessMatch = castToCodeableConcept(value); // CodeableConcept
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1724546052:  return getDescriptionElement();
        case 3387378:  return addNote(); 
        case 324572498:  return getEvidenceSource();
        case -777873132:  return getIntendedGroup();
        case -2144864283:  return getDirectnessMatch();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1724546052: /*description*/ return new String[] {"markdown"};
        case 3387378: /*note*/ return new String[] {"Annotation"};
        case 324572498: /*evidenceSource*/ return new String[] {"Reference"};
        case -777873132: /*intendedGroup*/ return new String[] {"Reference"};
        case -2144864283: /*directnessMatch*/ return new String[] {"CodeableConcept"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("description")) {
          throw new FHIRException("Cannot call addChild on a primitive type Evidence.description");
        }
        else if (name.equals("note")) {
          return addNote();
        }
        else if (name.equals("evidenceSource")) {
          this.evidenceSource = new Reference();
          return this.evidenceSource;
        }
        else if (name.equals("intendedGroup")) {
          this.intendedGroup = new Reference();
          return this.intendedGroup;
        }
        else if (name.equals("directnessMatch")) {
          this.directnessMatch = new CodeableConcept();
          return this.directnessMatch;
        }
        else
          return super.addChild(name);
      }

      public EvidenceReferentGroupComponent copy() {
        EvidenceReferentGroupComponent dst = new EvidenceReferentGroupComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(EvidenceReferentGroupComponent dst) {
        super.copyValues(dst);
        dst.description = description == null ? null : description.copy();
        if (note != null) {
          dst.note = new ArrayList<Annotation>();
          for (Annotation i : note)
            dst.note.add(i.copy());
        };
        dst.evidenceSource = evidenceSource == null ? null : evidenceSource.copy();
        dst.intendedGroup = intendedGroup == null ? null : intendedGroup.copy();
        dst.directnessMatch = directnessMatch == null ? null : directnessMatch.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof EvidenceReferentGroupComponent))
          return false;
        EvidenceReferentGroupComponent o = (EvidenceReferentGroupComponent) other_;
        return compareDeep(description, o.description, true) && compareDeep(note, o.note, true) && compareDeep(evidenceSource, o.evidenceSource, true)
           && compareDeep(intendedGroup, o.intendedGroup, true) && compareDeep(directnessMatch, o.directnessMatch, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof EvidenceReferentGroupComponent))
          return false;
        EvidenceReferentGroupComponent o = (EvidenceReferentGroupComponent) other_;
        return compareValues(description, o.description, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(description, note, evidenceSource
          , intendedGroup, directnessMatch);
      }

  public String fhirType() {
    return "Evidence.referentGroup";

  }

  }

    @Block()
    public static class EvidenceVariableDefinitionComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Description of the variable.
         */
        @Child(name = "description", type = {MarkdownType.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Description of the variable", formalDefinition="Description of the variable." )
        protected MarkdownType description;

        /**
         * Footnotes and/or explanatory notes.
         */
        @Child(name = "note", type = {Annotation.class}, order=2, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Footnotes and/or explanatory notes", formalDefinition="Footnotes and/or explanatory notes." )
        protected List<Annotation> note;

        /**
         * exposure | referenceExposure | measuredVariable | confounder.
         */
        @Child(name = "variableRole", type = {CodeableConcept.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="exposure | referenceExposure | measuredVariable | confounder", formalDefinition="exposure | referenceExposure | measuredVariable | confounder." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/variable-role")
        protected CodeableConcept variableRole;

        /**
         * Definition of the actual variable related to the statistic(s).
         */
        @Child(name = "actualDefinition", type = {EvidenceVariable.class}, order=4, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Definition of the actual variable related to the statistic(s)", formalDefinition="Definition of the actual variable related to the statistic(s)." )
        protected Reference actualDefinition;

        /**
         * Definition of the intended variable related to the Evidence.
         */
        @Child(name = "intendedDefinition", type = {EvidenceVariable.class}, order=5, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Definition of the intended variable related to the Evidence", formalDefinition="Definition of the intended variable related to the Evidence." )
        protected Reference intendedDefinition;

        /**
         * Indication of quality of match between intended variable to actual variable.
         */
        @Child(name = "directnessMatch", type = {CodeableConcept.class}, order=6, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="low | moderate | high | exact", formalDefinition="Indication of quality of match between intended variable to actual variable." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/directness")
        protected CodeableConcept directnessMatch;

        private static final long serialVersionUID = -1887907534L;

    /**
     * Constructor
     */
      public EvidenceVariableDefinitionComponent() {
        super();
      }

        /**
         * @return {@link #description} (Description of the variable.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public MarkdownType getDescriptionElement() { 
          if (this.description == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EvidenceVariableDefinitionComponent.description");
            else if (Configuration.doAutoCreate())
              this.description = new MarkdownType(); // bb
          return this.description;
        }

        public boolean hasDescriptionElement() { 
          return this.description != null && !this.description.isEmpty();
        }

        public boolean hasDescription() { 
          return this.description != null && !this.description.isEmpty();
        }

        /**
         * @param value {@link #description} (Description of the variable.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public EvidenceVariableDefinitionComponent setDescriptionElement(MarkdownType value) { 
          this.description = value;
          return this;
        }

        /**
         * @return Description of the variable.
         */
        public String getDescription() { 
          return this.description == null ? null : this.description.getValue();
        }

        /**
         * @param value Description of the variable.
         */
        public EvidenceVariableDefinitionComponent setDescription(String value) { 
          if (value == null)
            this.description = null;
          else {
            if (this.description == null)
              this.description = new MarkdownType();
            this.description.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #note} (Footnotes and/or explanatory notes.)
         */
        public List<Annotation> getNote() { 
          if (this.note == null)
            this.note = new ArrayList<Annotation>();
          return this.note;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public EvidenceVariableDefinitionComponent setNote(List<Annotation> theNote) { 
          this.note = theNote;
          return this;
        }

        public boolean hasNote() { 
          if (this.note == null)
            return false;
          for (Annotation item : this.note)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Annotation addNote() { //3
          Annotation t = new Annotation();
          if (this.note == null)
            this.note = new ArrayList<Annotation>();
          this.note.add(t);
          return t;
        }

        public EvidenceVariableDefinitionComponent addNote(Annotation t) { //3
          if (t == null)
            return this;
          if (this.note == null)
            this.note = new ArrayList<Annotation>();
          this.note.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #note}, creating it if it does not already exist
         */
        public Annotation getNoteFirstRep() { 
          if (getNote().isEmpty()) {
            addNote();
          }
          return getNote().get(0);
        }

        /**
         * @return {@link #variableRole} (exposure | referenceExposure | measuredVariable | confounder.)
         */
        public CodeableConcept getVariableRole() { 
          if (this.variableRole == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EvidenceVariableDefinitionComponent.variableRole");
            else if (Configuration.doAutoCreate())
              this.variableRole = new CodeableConcept(); // cc
          return this.variableRole;
        }

        public boolean hasVariableRole() { 
          return this.variableRole != null && !this.variableRole.isEmpty();
        }

        /**
         * @param value {@link #variableRole} (exposure | referenceExposure | measuredVariable | confounder.)
         */
        public EvidenceVariableDefinitionComponent setVariableRole(CodeableConcept value) { 
          this.variableRole = value;
          return this;
        }

        /**
         * @return {@link #actualDefinition} (Definition of the actual variable related to the statistic(s).)
         */
        public Reference getActualDefinition() { 
          if (this.actualDefinition == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EvidenceVariableDefinitionComponent.actualDefinition");
            else if (Configuration.doAutoCreate())
              this.actualDefinition = new Reference(); // cc
          return this.actualDefinition;
        }

        public boolean hasActualDefinition() { 
          return this.actualDefinition != null && !this.actualDefinition.isEmpty();
        }

        /**
         * @param value {@link #actualDefinition} (Definition of the actual variable related to the statistic(s).)
         */
        public EvidenceVariableDefinitionComponent setActualDefinition(Reference value) { 
          this.actualDefinition = value;
          return this;
        }

        /**
         * @return {@link #intendedDefinition} (Definition of the intended variable related to the Evidence.)
         */
        public Reference getIntendedDefinition() { 
          if (this.intendedDefinition == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EvidenceVariableDefinitionComponent.intendedDefinition");
            else if (Configuration.doAutoCreate())
              this.intendedDefinition = new Reference(); // cc
          return this.intendedDefinition;
        }

        public boolean hasIntendedDefinition() { 
          return this.intendedDefinition != null && !this.intendedDefinition.isEmpty();
        }

        /**
         * @param value {@link #intendedDefinition} (Definition of the intended variable related to the Evidence.)
         */
        public EvidenceVariableDefinitionComponent setIntendedDefinition(Reference value) { 
          this.intendedDefinition = value;
          return this;
        }

        /**
         * @return {@link #directnessMatch} (Indication of quality of match between intended variable to actual variable.)
         */
        public CodeableConcept getDirectnessMatch() { 
          if (this.directnessMatch == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EvidenceVariableDefinitionComponent.directnessMatch");
            else if (Configuration.doAutoCreate())
              this.directnessMatch = new CodeableConcept(); // cc
          return this.directnessMatch;
        }

        public boolean hasDirectnessMatch() { 
          return this.directnessMatch != null && !this.directnessMatch.isEmpty();
        }

        /**
         * @param value {@link #directnessMatch} (Indication of quality of match between intended variable to actual variable.)
         */
        public EvidenceVariableDefinitionComponent setDirectnessMatch(CodeableConcept value) { 
          this.directnessMatch = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("description", "markdown", "Description of the variable.", 0, 1, description));
          children.add(new Property("note", "Annotation", "Footnotes and/or explanatory notes.", 0, java.lang.Integer.MAX_VALUE, note));
          children.add(new Property("variableRole", "CodeableConcept", "exposure | referenceExposure | measuredVariable | confounder.", 0, 1, variableRole));
          children.add(new Property("actualDefinition", "Reference(EvidenceVariable)", "Definition of the actual variable related to the statistic(s).", 0, 1, actualDefinition));
          children.add(new Property("intendedDefinition", "Reference(EvidenceVariable)", "Definition of the intended variable related to the Evidence.", 0, 1, intendedDefinition));
          children.add(new Property("directnessMatch", "CodeableConcept", "Indication of quality of match between intended variable to actual variable.", 0, 1, directnessMatch));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -1724546052: /*description*/  return new Property("description", "markdown", "Description of the variable.", 0, 1, description);
          case 3387378: /*note*/  return new Property("note", "Annotation", "Footnotes and/or explanatory notes.", 0, java.lang.Integer.MAX_VALUE, note);
          case -372889326: /*variableRole*/  return new Property("variableRole", "CodeableConcept", "exposure | referenceExposure | measuredVariable | confounder.", 0, 1, variableRole);
          case -2019122815: /*actualDefinition*/  return new Property("actualDefinition", "Reference(EvidenceVariable)", "Definition of the actual variable related to the statistic(s).", 0, 1, actualDefinition);
          case -1749096482: /*intendedDefinition*/  return new Property("intendedDefinition", "Reference(EvidenceVariable)", "Definition of the intended variable related to the Evidence.", 0, 1, intendedDefinition);
          case -2144864283: /*directnessMatch*/  return new Property("directnessMatch", "CodeableConcept", "Indication of quality of match between intended variable to actual variable.", 0, 1, directnessMatch);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1724546052: /*description*/ return this.description == null ? new Base[0] : new Base[] {this.description}; // MarkdownType
        case 3387378: /*note*/ return this.note == null ? new Base[0] : this.note.toArray(new Base[this.note.size()]); // Annotation
        case -372889326: /*variableRole*/ return this.variableRole == null ? new Base[0] : new Base[] {this.variableRole}; // CodeableConcept
        case -2019122815: /*actualDefinition*/ return this.actualDefinition == null ? new Base[0] : new Base[] {this.actualDefinition}; // Reference
        case -1749096482: /*intendedDefinition*/ return this.intendedDefinition == null ? new Base[0] : new Base[] {this.intendedDefinition}; // Reference
        case -2144864283: /*directnessMatch*/ return this.directnessMatch == null ? new Base[0] : new Base[] {this.directnessMatch}; // CodeableConcept
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1724546052: // description
          this.description = castToMarkdown(value); // MarkdownType
          return value;
        case 3387378: // note
          this.getNote().add(castToAnnotation(value)); // Annotation
          return value;
        case -372889326: // variableRole
          this.variableRole = castToCodeableConcept(value); // CodeableConcept
          return value;
        case -2019122815: // actualDefinition
          this.actualDefinition = castToReference(value); // Reference
          return value;
        case -1749096482: // intendedDefinition
          this.intendedDefinition = castToReference(value); // Reference
          return value;
        case -2144864283: // directnessMatch
          this.directnessMatch = castToCodeableConcept(value); // CodeableConcept
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("description")) {
          this.description = castToMarkdown(value); // MarkdownType
        } else if (name.equals("note")) {
          this.getNote().add(castToAnnotation(value));
        } else if (name.equals("variableRole")) {
          this.variableRole = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("actualDefinition")) {
          this.actualDefinition = castToReference(value); // Reference
        } else if (name.equals("intendedDefinition")) {
          this.intendedDefinition = castToReference(value); // Reference
        } else if (name.equals("directnessMatch")) {
          this.directnessMatch = castToCodeableConcept(value); // CodeableConcept
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1724546052:  return getDescriptionElement();
        case 3387378:  return addNote(); 
        case -372889326:  return getVariableRole();
        case -2019122815:  return getActualDefinition();
        case -1749096482:  return getIntendedDefinition();
        case -2144864283:  return getDirectnessMatch();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1724546052: /*description*/ return new String[] {"markdown"};
        case 3387378: /*note*/ return new String[] {"Annotation"};
        case -372889326: /*variableRole*/ return new String[] {"CodeableConcept"};
        case -2019122815: /*actualDefinition*/ return new String[] {"Reference"};
        case -1749096482: /*intendedDefinition*/ return new String[] {"Reference"};
        case -2144864283: /*directnessMatch*/ return new String[] {"CodeableConcept"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("description")) {
          throw new FHIRException("Cannot call addChild on a primitive type Evidence.description");
        }
        else if (name.equals("note")) {
          return addNote();
        }
        else if (name.equals("variableRole")) {
          this.variableRole = new CodeableConcept();
          return this.variableRole;
        }
        else if (name.equals("actualDefinition")) {
          this.actualDefinition = new Reference();
          return this.actualDefinition;
        }
        else if (name.equals("intendedDefinition")) {
          this.intendedDefinition = new Reference();
          return this.intendedDefinition;
        }
        else if (name.equals("directnessMatch")) {
          this.directnessMatch = new CodeableConcept();
          return this.directnessMatch;
        }
        else
          return super.addChild(name);
      }

      public EvidenceVariableDefinitionComponent copy() {
        EvidenceVariableDefinitionComponent dst = new EvidenceVariableDefinitionComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(EvidenceVariableDefinitionComponent dst) {
        super.copyValues(dst);
        dst.description = description == null ? null : description.copy();
        if (note != null) {
          dst.note = new ArrayList<Annotation>();
          for (Annotation i : note)
            dst.note.add(i.copy());
        };
        dst.variableRole = variableRole == null ? null : variableRole.copy();
        dst.actualDefinition = actualDefinition == null ? null : actualDefinition.copy();
        dst.intendedDefinition = intendedDefinition == null ? null : intendedDefinition.copy();
        dst.directnessMatch = directnessMatch == null ? null : directnessMatch.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof EvidenceVariableDefinitionComponent))
          return false;
        EvidenceVariableDefinitionComponent o = (EvidenceVariableDefinitionComponent) other_;
        return compareDeep(description, o.description, true) && compareDeep(note, o.note, true) && compareDeep(variableRole, o.variableRole, true)
           && compareDeep(actualDefinition, o.actualDefinition, true) && compareDeep(intendedDefinition, o.intendedDefinition, true)
           && compareDeep(directnessMatch, o.directnessMatch, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof EvidenceVariableDefinitionComponent))
          return false;
        EvidenceVariableDefinitionComponent o = (EvidenceVariableDefinitionComponent) other_;
        return compareValues(description, o.description, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(description, note, variableRole
          , actualDefinition, intendedDefinition, directnessMatch);
      }

  public String fhirType() {
    return "Evidence.variableDefinition";

  }

  }

    @Block()
    public static class EvidenceCertaintyComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Textual description of certainty.
         */
        @Child(name = "description", type = {StringType.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Textual description of certainty", formalDefinition="Textual description of certainty." )
        protected StringType description;

        /**
         * Footnotes and/or explanatory notes.
         */
        @Child(name = "note", type = {Annotation.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Footnotes and/or explanatory notes", formalDefinition="Footnotes and/or explanatory notes." )
        protected Annotation note;

        /**
         * Rating of certainty.
         */
        @Child(name = "rating", type = {CodeableConcept.class}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Rating of certainty", formalDefinition="Rating of certainty." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/certainty-rating")
        protected List<CodeableConcept> rating;

        /**
         * Subcomponent of certainty.
         */
        @Child(name = "certaintySubcomponent", type = {}, order=4, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Subcomponent of certainty", formalDefinition="Subcomponent of certainty." )
        protected List<EvidenceCertaintyCertaintySubcomponentComponent> certaintySubcomponent;

        private static final long serialVersionUID = -1718011695L;

    /**
     * Constructor
     */
      public EvidenceCertaintyComponent() {
        super();
      }

        /**
         * @return {@link #description} (Textual description of certainty.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public StringType getDescriptionElement() { 
          if (this.description == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EvidenceCertaintyComponent.description");
            else if (Configuration.doAutoCreate())
              this.description = new StringType(); // bb
          return this.description;
        }

        public boolean hasDescriptionElement() { 
          return this.description != null && !this.description.isEmpty();
        }

        public boolean hasDescription() { 
          return this.description != null && !this.description.isEmpty();
        }

        /**
         * @param value {@link #description} (Textual description of certainty.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public EvidenceCertaintyComponent setDescriptionElement(StringType value) { 
          this.description = value;
          return this;
        }

        /**
         * @return Textual description of certainty.
         */
        public String getDescription() { 
          return this.description == null ? null : this.description.getValue();
        }

        /**
         * @param value Textual description of certainty.
         */
        public EvidenceCertaintyComponent setDescription(String value) { 
          if (Utilities.noString(value))
            this.description = null;
          else {
            if (this.description == null)
              this.description = new StringType();
            this.description.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #note} (Footnotes and/or explanatory notes.)
         */
        public Annotation getNote() { 
          if (this.note == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EvidenceCertaintyComponent.note");
            else if (Configuration.doAutoCreate())
              this.note = new Annotation(); // cc
          return this.note;
        }

        public boolean hasNote() { 
          return this.note != null && !this.note.isEmpty();
        }

        /**
         * @param value {@link #note} (Footnotes and/or explanatory notes.)
         */
        public EvidenceCertaintyComponent setNote(Annotation value) { 
          this.note = value;
          return this;
        }

        /**
         * @return {@link #rating} (Rating of certainty.)
         */
        public List<CodeableConcept> getRating() { 
          if (this.rating == null)
            this.rating = new ArrayList<CodeableConcept>();
          return this.rating;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public EvidenceCertaintyComponent setRating(List<CodeableConcept> theRating) { 
          this.rating = theRating;
          return this;
        }

        public boolean hasRating() { 
          if (this.rating == null)
            return false;
          for (CodeableConcept item : this.rating)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addRating() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.rating == null)
            this.rating = new ArrayList<CodeableConcept>();
          this.rating.add(t);
          return t;
        }

        public EvidenceCertaintyComponent addRating(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.rating == null)
            this.rating = new ArrayList<CodeableConcept>();
          this.rating.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #rating}, creating it if it does not already exist
         */
        public CodeableConcept getRatingFirstRep() { 
          if (getRating().isEmpty()) {
            addRating();
          }
          return getRating().get(0);
        }

        /**
         * @return {@link #certaintySubcomponent} (Subcomponent of certainty.)
         */
        public List<EvidenceCertaintyCertaintySubcomponentComponent> getCertaintySubcomponent() { 
          if (this.certaintySubcomponent == null)
            this.certaintySubcomponent = new ArrayList<EvidenceCertaintyCertaintySubcomponentComponent>();
          return this.certaintySubcomponent;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public EvidenceCertaintyComponent setCertaintySubcomponent(List<EvidenceCertaintyCertaintySubcomponentComponent> theCertaintySubcomponent) { 
          this.certaintySubcomponent = theCertaintySubcomponent;
          return this;
        }

        public boolean hasCertaintySubcomponent() { 
          if (this.certaintySubcomponent == null)
            return false;
          for (EvidenceCertaintyCertaintySubcomponentComponent item : this.certaintySubcomponent)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public EvidenceCertaintyCertaintySubcomponentComponent addCertaintySubcomponent() { //3
          EvidenceCertaintyCertaintySubcomponentComponent t = new EvidenceCertaintyCertaintySubcomponentComponent();
          if (this.certaintySubcomponent == null)
            this.certaintySubcomponent = new ArrayList<EvidenceCertaintyCertaintySubcomponentComponent>();
          this.certaintySubcomponent.add(t);
          return t;
        }

        public EvidenceCertaintyComponent addCertaintySubcomponent(EvidenceCertaintyCertaintySubcomponentComponent t) { //3
          if (t == null)
            return this;
          if (this.certaintySubcomponent == null)
            this.certaintySubcomponent = new ArrayList<EvidenceCertaintyCertaintySubcomponentComponent>();
          this.certaintySubcomponent.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #certaintySubcomponent}, creating it if it does not already exist
         */
        public EvidenceCertaintyCertaintySubcomponentComponent getCertaintySubcomponentFirstRep() { 
          if (getCertaintySubcomponent().isEmpty()) {
            addCertaintySubcomponent();
          }
          return getCertaintySubcomponent().get(0);
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("description", "string", "Textual description of certainty.", 0, 1, description));
          children.add(new Property("note", "Annotation", "Footnotes and/or explanatory notes.", 0, 1, note));
          children.add(new Property("rating", "CodeableConcept", "Rating of certainty.", 0, java.lang.Integer.MAX_VALUE, rating));
          children.add(new Property("certaintySubcomponent", "", "Subcomponent of certainty.", 0, java.lang.Integer.MAX_VALUE, certaintySubcomponent));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -1724546052: /*description*/  return new Property("description", "string", "Textual description of certainty.", 0, 1, description);
          case 3387378: /*note*/  return new Property("note", "Annotation", "Footnotes and/or explanatory notes.", 0, 1, note);
          case -938102371: /*rating*/  return new Property("rating", "CodeableConcept", "Rating of certainty.", 0, java.lang.Integer.MAX_VALUE, rating);
          case 1806398212: /*certaintySubcomponent*/  return new Property("certaintySubcomponent", "", "Subcomponent of certainty.", 0, java.lang.Integer.MAX_VALUE, certaintySubcomponent);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1724546052: /*description*/ return this.description == null ? new Base[0] : new Base[] {this.description}; // StringType
        case 3387378: /*note*/ return this.note == null ? new Base[0] : new Base[] {this.note}; // Annotation
        case -938102371: /*rating*/ return this.rating == null ? new Base[0] : this.rating.toArray(new Base[this.rating.size()]); // CodeableConcept
        case 1806398212: /*certaintySubcomponent*/ return this.certaintySubcomponent == null ? new Base[0] : this.certaintySubcomponent.toArray(new Base[this.certaintySubcomponent.size()]); // EvidenceCertaintyCertaintySubcomponentComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1724546052: // description
          this.description = castToString(value); // StringType
          return value;
        case 3387378: // note
          this.note = castToAnnotation(value); // Annotation
          return value;
        case -938102371: // rating
          this.getRating().add(castToCodeableConcept(value)); // CodeableConcept
          return value;
        case 1806398212: // certaintySubcomponent
          this.getCertaintySubcomponent().add((EvidenceCertaintyCertaintySubcomponentComponent) value); // EvidenceCertaintyCertaintySubcomponentComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("description")) {
          this.description = castToString(value); // StringType
        } else if (name.equals("note")) {
          this.note = castToAnnotation(value); // Annotation
        } else if (name.equals("rating")) {
          this.getRating().add(castToCodeableConcept(value));
        } else if (name.equals("certaintySubcomponent")) {
          this.getCertaintySubcomponent().add((EvidenceCertaintyCertaintySubcomponentComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1724546052:  return getDescriptionElement();
        case 3387378:  return getNote();
        case -938102371:  return addRating(); 
        case 1806398212:  return addCertaintySubcomponent(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1724546052: /*description*/ return new String[] {"string"};
        case 3387378: /*note*/ return new String[] {"Annotation"};
        case -938102371: /*rating*/ return new String[] {"CodeableConcept"};
        case 1806398212: /*certaintySubcomponent*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("description")) {
          throw new FHIRException("Cannot call addChild on a primitive type Evidence.description");
        }
        else if (name.equals("note")) {
          this.note = new Annotation();
          return this.note;
        }
        else if (name.equals("rating")) {
          return addRating();
        }
        else if (name.equals("certaintySubcomponent")) {
          return addCertaintySubcomponent();
        }
        else
          return super.addChild(name);
      }

      public EvidenceCertaintyComponent copy() {
        EvidenceCertaintyComponent dst = new EvidenceCertaintyComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(EvidenceCertaintyComponent dst) {
        super.copyValues(dst);
        dst.description = description == null ? null : description.copy();
        dst.note = note == null ? null : note.copy();
        if (rating != null) {
          dst.rating = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : rating)
            dst.rating.add(i.copy());
        };
        if (certaintySubcomponent != null) {
          dst.certaintySubcomponent = new ArrayList<EvidenceCertaintyCertaintySubcomponentComponent>();
          for (EvidenceCertaintyCertaintySubcomponentComponent i : certaintySubcomponent)
            dst.certaintySubcomponent.add(i.copy());
        };
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof EvidenceCertaintyComponent))
          return false;
        EvidenceCertaintyComponent o = (EvidenceCertaintyComponent) other_;
        return compareDeep(description, o.description, true) && compareDeep(note, o.note, true) && compareDeep(rating, o.rating, true)
           && compareDeep(certaintySubcomponent, o.certaintySubcomponent, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof EvidenceCertaintyComponent))
          return false;
        EvidenceCertaintyComponent o = (EvidenceCertaintyComponent) other_;
        return compareValues(description, o.description, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(description, note, rating
          , certaintySubcomponent);
      }

  public String fhirType() {
    return "Evidence.certainty";

  }

  }

    @Block()
    public static class EvidenceCertaintyCertaintySubcomponentComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Textual description of certainty subcomponent.
         */
        @Child(name = "description", type = {StringType.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Textual description of certainty subcomponent", formalDefinition="Textual description of certainty subcomponent." )
        protected StringType description;

        /**
         * Textual note of certainty subcomponent.
         */
        @Child(name = "note", type = {Annotation.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Textual note of certainty subcomponent", formalDefinition="Textual note of certainty subcomponent." )
        protected Annotation note;

        /**
         * Footnotes and/or explanatory notes.
         */
        @Child(name = "type", type = {CodeableConcept.class}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Footnotes and/or explanatory notes", formalDefinition="Footnotes and/or explanatory notes." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/certainty-subcomponent-type")
        protected List<CodeableConcept> type;

        /**
         * Rating of certainty subcomponent.
         */
        @Child(name = "rating", type = {CodeableConcept.class}, order=4, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Rating of certainty subcomponent", formalDefinition="Rating of certainty subcomponent." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/certainty-subcomponent-rating")
        protected List<CodeableConcept> rating;

        private static final long serialVersionUID = 2048436483L;

    /**
     * Constructor
     */
      public EvidenceCertaintyCertaintySubcomponentComponent() {
        super();
      }

        /**
         * @return {@link #description} (Textual description of certainty subcomponent.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public StringType getDescriptionElement() { 
          if (this.description == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EvidenceCertaintyCertaintySubcomponentComponent.description");
            else if (Configuration.doAutoCreate())
              this.description = new StringType(); // bb
          return this.description;
        }

        public boolean hasDescriptionElement() { 
          return this.description != null && !this.description.isEmpty();
        }

        public boolean hasDescription() { 
          return this.description != null && !this.description.isEmpty();
        }

        /**
         * @param value {@link #description} (Textual description of certainty subcomponent.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public EvidenceCertaintyCertaintySubcomponentComponent setDescriptionElement(StringType value) { 
          this.description = value;
          return this;
        }

        /**
         * @return Textual description of certainty subcomponent.
         */
        public String getDescription() { 
          return this.description == null ? null : this.description.getValue();
        }

        /**
         * @param value Textual description of certainty subcomponent.
         */
        public EvidenceCertaintyCertaintySubcomponentComponent setDescription(String value) { 
          if (Utilities.noString(value))
            this.description = null;
          else {
            if (this.description == null)
              this.description = new StringType();
            this.description.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #note} (Textual note of certainty subcomponent.)
         */
        public Annotation getNote() { 
          if (this.note == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create EvidenceCertaintyCertaintySubcomponentComponent.note");
            else if (Configuration.doAutoCreate())
              this.note = new Annotation(); // cc
          return this.note;
        }

        public boolean hasNote() { 
          return this.note != null && !this.note.isEmpty();
        }

        /**
         * @param value {@link #note} (Textual note of certainty subcomponent.)
         */
        public EvidenceCertaintyCertaintySubcomponentComponent setNote(Annotation value) { 
          this.note = value;
          return this;
        }

        /**
         * @return {@link #type} (Footnotes and/or explanatory notes.)
         */
        public List<CodeableConcept> getType() { 
          if (this.type == null)
            this.type = new ArrayList<CodeableConcept>();
          return this.type;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public EvidenceCertaintyCertaintySubcomponentComponent setType(List<CodeableConcept> theType) { 
          this.type = theType;
          return this;
        }

        public boolean hasType() { 
          if (this.type == null)
            return false;
          for (CodeableConcept item : this.type)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addType() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.type == null)
            this.type = new ArrayList<CodeableConcept>();
          this.type.add(t);
          return t;
        }

        public EvidenceCertaintyCertaintySubcomponentComponent addType(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.type == null)
            this.type = new ArrayList<CodeableConcept>();
          this.type.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #type}, creating it if it does not already exist
         */
        public CodeableConcept getTypeFirstRep() { 
          if (getType().isEmpty()) {
            addType();
          }
          return getType().get(0);
        }

        /**
         * @return {@link #rating} (Rating of certainty subcomponent.)
         */
        public List<CodeableConcept> getRating() { 
          if (this.rating == null)
            this.rating = new ArrayList<CodeableConcept>();
          return this.rating;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public EvidenceCertaintyCertaintySubcomponentComponent setRating(List<CodeableConcept> theRating) { 
          this.rating = theRating;
          return this;
        }

        public boolean hasRating() { 
          if (this.rating == null)
            return false;
          for (CodeableConcept item : this.rating)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addRating() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.rating == null)
            this.rating = new ArrayList<CodeableConcept>();
          this.rating.add(t);
          return t;
        }

        public EvidenceCertaintyCertaintySubcomponentComponent addRating(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.rating == null)
            this.rating = new ArrayList<CodeableConcept>();
          this.rating.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #rating}, creating it if it does not already exist
         */
        public CodeableConcept getRatingFirstRep() { 
          if (getRating().isEmpty()) {
            addRating();
          }
          return getRating().get(0);
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("description", "string", "Textual description of certainty subcomponent.", 0, 1, description));
          children.add(new Property("note", "Annotation", "Textual note of certainty subcomponent.", 0, 1, note));
          children.add(new Property("type", "CodeableConcept", "Footnotes and/or explanatory notes.", 0, java.lang.Integer.MAX_VALUE, type));
          children.add(new Property("rating", "CodeableConcept", "Rating of certainty subcomponent.", 0, java.lang.Integer.MAX_VALUE, rating));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -1724546052: /*description*/  return new Property("description", "string", "Textual description of certainty subcomponent.", 0, 1, description);
          case 3387378: /*note*/  return new Property("note", "Annotation", "Textual note of certainty subcomponent.", 0, 1, note);
          case 3575610: /*type*/  return new Property("type", "CodeableConcept", "Footnotes and/or explanatory notes.", 0, java.lang.Integer.MAX_VALUE, type);
          case -938102371: /*rating*/  return new Property("rating", "CodeableConcept", "Rating of certainty subcomponent.", 0, java.lang.Integer.MAX_VALUE, rating);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1724546052: /*description*/ return this.description == null ? new Base[0] : new Base[] {this.description}; // StringType
        case 3387378: /*note*/ return this.note == null ? new Base[0] : new Base[] {this.note}; // Annotation
        case 3575610: /*type*/ return this.type == null ? new Base[0] : this.type.toArray(new Base[this.type.size()]); // CodeableConcept
        case -938102371: /*rating*/ return this.rating == null ? new Base[0] : this.rating.toArray(new Base[this.rating.size()]); // CodeableConcept
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1724546052: // description
          this.description = castToString(value); // StringType
          return value;
        case 3387378: // note
          this.note = castToAnnotation(value); // Annotation
          return value;
        case 3575610: // type
          this.getType().add(castToCodeableConcept(value)); // CodeableConcept
          return value;
        case -938102371: // rating
          this.getRating().add(castToCodeableConcept(value)); // CodeableConcept
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("description")) {
          this.description = castToString(value); // StringType
        } else if (name.equals("note")) {
          this.note = castToAnnotation(value); // Annotation
        } else if (name.equals("type")) {
          this.getType().add(castToCodeableConcept(value));
        } else if (name.equals("rating")) {
          this.getRating().add(castToCodeableConcept(value));
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1724546052:  return getDescriptionElement();
        case 3387378:  return getNote();
        case 3575610:  return addType(); 
        case -938102371:  return addRating(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1724546052: /*description*/ return new String[] {"string"};
        case 3387378: /*note*/ return new String[] {"Annotation"};
        case 3575610: /*type*/ return new String[] {"CodeableConcept"};
        case -938102371: /*rating*/ return new String[] {"CodeableConcept"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("description")) {
          throw new FHIRException("Cannot call addChild on a primitive type Evidence.description");
        }
        else if (name.equals("note")) {
          this.note = new Annotation();
          return this.note;
        }
        else if (name.equals("type")) {
          return addType();
        }
        else if (name.equals("rating")) {
          return addRating();
        }
        else
          return super.addChild(name);
      }

      public EvidenceCertaintyCertaintySubcomponentComponent copy() {
        EvidenceCertaintyCertaintySubcomponentComponent dst = new EvidenceCertaintyCertaintySubcomponentComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(EvidenceCertaintyCertaintySubcomponentComponent dst) {
        super.copyValues(dst);
        dst.description = description == null ? null : description.copy();
        dst.note = note == null ? null : note.copy();
        if (type != null) {
          dst.type = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : type)
            dst.type.add(i.copy());
        };
        if (rating != null) {
          dst.rating = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : rating)
            dst.rating.add(i.copy());
        };
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof EvidenceCertaintyCertaintySubcomponentComponent))
          return false;
        EvidenceCertaintyCertaintySubcomponentComponent o = (EvidenceCertaintyCertaintySubcomponentComponent) other_;
        return compareDeep(description, o.description, true) && compareDeep(note, o.note, true) && compareDeep(type, o.type, true)
           && compareDeep(rating, o.rating, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof EvidenceCertaintyCertaintySubcomponentComponent))
          return false;
        EvidenceCertaintyCertaintySubcomponentComponent o = (EvidenceCertaintyCertaintySubcomponentComponent) other_;
        return compareValues(description, o.description, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(description, note, type
          , rating);
      }

  public String fhirType() {
    return "Evidence.certainty.certaintySubcomponent";

  }

  }

    /**
     * A formal identifier that is used to identify this summary when it is represented in other formats, or referenced in a specification, model, design or an instance.
     */
    @Child(name = "identifier", type = {Identifier.class}, order=0, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Additional identifier for the summary", formalDefinition="A formal identifier that is used to identify this summary when it is represented in other formats, or referenced in a specification, model, design or an instance." )
    protected List<Identifier> identifier;

    /**
     * The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.
     */
    @Child(name = "approvalDate", type = {DateType.class}, order=1, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="When the summary was approved by publisher", formalDefinition="The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage." )
    protected DateType approvalDate;

    /**
     * The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.
     */
    @Child(name = "lastReviewDate", type = {DateType.class}, order=2, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="When the summary was last reviewed", formalDefinition="The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date." )
    protected DateType lastReviewDate;

    /**
     * Contact detail and role for contributor to summary.
     */
    @Child(name = "contributor", type = {Contributor.class}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Contact detail and role for contributor to summary", formalDefinition="Contact detail and role for contributor to summary." )
    protected List<Contributor> contributor;

    /**
     * Link or citation to artifact associated with the summary.
     */
    @Child(name = "relatedArtifact", type = {RelatedArtifact.class}, order=4, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Link or citation to artifact associated with the summary", formalDefinition="Link or citation to artifact associated with the summary." )
    protected List<RelatedArtifact> relatedArtifact;

    /**
     * Declarative description of the Evidence.
     */
    @Child(name = "assertion", type = {MarkdownType.class}, order=5, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Declarative description of the Evidence", formalDefinition="Declarative description of the Evidence." )
    protected MarkdownType assertion;

    /**
     * Footnotes and/or explanatory notes.
     */
    @Child(name = "note", type = {Annotation.class}, order=6, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Footnotes and/or explanatory notes", formalDefinition="Footnotes and/or explanatory notes." )
    protected List<Annotation> note;

    /**
     * Group being referenced.
     */
    @Child(name = "referentGroup", type = {}, order=7, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Group being referenced", formalDefinition="Group being referenced." )
    protected EvidenceReferentGroupComponent referentGroup;

    /**
     * Evidence variable.
     */
    @Child(name = "variableDefinition", type = {}, order=8, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Evidence variable", formalDefinition="Evidence variable." )
    protected List<EvidenceVariableDefinitionComponent> variableDefinition;

    /**
     * The particular type of synthesis if this is a synthesis summary.
     */
    @Child(name = "synthesisType", type = {CodeableConcept.class}, order=9, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="The particular type of synthesis if this is a synthesis summary", formalDefinition="The particular type of synthesis if this is a synthesis summary." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/synthesis-type")
    protected CodeableConcept synthesisType;

    /**
     * The type of study that produced this summary.
     */
    @Child(name = "studyType", type = {CodeableConcept.class}, order=10, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="The type of study that produced this summary", formalDefinition="The type of study that produced this summary." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/study-type")
    protected CodeableConcept studyType;

    /**
     * The statistic value(s).
     */
    @Child(name = "statistic", type = {Statistic.class}, order=11, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Values and parameters for a single statistic", formalDefinition="The statistic value(s)." )
    protected List<Statistic> statistic;

    /**
     * Ordered distribution.
     */
    @Child(name = "distribution", type = {OrderedDistribution.class}, order=12, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="An ordered group of statistics", formalDefinition="Ordered distribution." )
    protected List<OrderedDistribution> distribution;

    /**
     * Level of certainty.
     */
    @Child(name = "certainty", type = {}, order=13, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Level of certainty", formalDefinition="Level of certainty." )
    protected List<EvidenceCertaintyComponent> certainty;

    private static final long serialVersionUID = -1740041871L;

  /**
   * Constructor
   */
    public Evidence() {
      super();
    }

  /**
   * Constructor
   */
    public Evidence(Enumeration<PublicationStatus> status, EvidenceReferentGroupComponent referentGroup) {
      super();
      this.status = status;
      this.referentGroup = referentGroup;
    }

    /**
     * @return {@link #url} (An absolute URI that is used to identify this evidence when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this summary is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the summary is stored on different servers.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public UriType getUrlElement() { 
      if (this.url == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Evidence.url");
        else if (Configuration.doAutoCreate())
          this.url = new UriType(); // bb
      return this.url;
    }

    public boolean hasUrlElement() { 
      return this.url != null && !this.url.isEmpty();
    }

    public boolean hasUrl() { 
      return this.url != null && !this.url.isEmpty();
    }

    /**
     * @param value {@link #url} (An absolute URI that is used to identify this evidence when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this summary is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the summary is stored on different servers.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public Evidence setUrlElement(UriType value) { 
      this.url = value;
      return this;
    }

    /**
     * @return An absolute URI that is used to identify this evidence when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this summary is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the summary is stored on different servers.
     */
    public String getUrl() { 
      return this.url == null ? null : this.url.getValue();
    }

    /**
     * @param value An absolute URI that is used to identify this evidence when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this summary is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the summary is stored on different servers.
     */
    public Evidence setUrl(String value) { 
      if (Utilities.noString(value))
        this.url = null;
      else {
        if (this.url == null)
          this.url = new UriType();
        this.url.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #identifier} (A formal identifier that is used to identify this summary when it is represented in other formats, or referenced in a specification, model, design or an instance.)
     */
    public List<Identifier> getIdentifier() { 
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      return this.identifier;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Evidence setIdentifier(List<Identifier> theIdentifier) { 
      this.identifier = theIdentifier;
      return this;
    }

    public boolean hasIdentifier() { 
      if (this.identifier == null)
        return false;
      for (Identifier item : this.identifier)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Identifier addIdentifier() { //3
      Identifier t = new Identifier();
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return t;
    }

    public Evidence addIdentifier(Identifier t) { //3
      if (t == null)
        return this;
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #identifier}, creating it if it does not already exist
     */
    public Identifier getIdentifierFirstRep() { 
      if (getIdentifier().isEmpty()) {
        addIdentifier();
      }
      return getIdentifier().get(0);
    }

    /**
     * @return {@link #version} (The identifier that is used to identify this version of the summary when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the summary author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public StringType getVersionElement() { 
      if (this.version == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Evidence.version");
        else if (Configuration.doAutoCreate())
          this.version = new StringType(); // bb
      return this.version;
    }

    public boolean hasVersionElement() { 
      return this.version != null && !this.version.isEmpty();
    }

    public boolean hasVersion() { 
      return this.version != null && !this.version.isEmpty();
    }

    /**
     * @param value {@link #version} (The identifier that is used to identify this version of the summary when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the summary author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public Evidence setVersionElement(StringType value) { 
      this.version = value;
      return this;
    }

    /**
     * @return The identifier that is used to identify this version of the summary when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the summary author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
     */
    public String getVersion() { 
      return this.version == null ? null : this.version.getValue();
    }

    /**
     * @param value The identifier that is used to identify this version of the summary when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the summary author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
     */
    public Evidence setVersion(String value) { 
      if (Utilities.noString(value))
        this.version = null;
      else {
        if (this.version == null)
          this.version = new StringType();
        this.version.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #title} (A short, descriptive, user-friendly title for the summary.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
     */
    public StringType getTitleElement() { 
      if (this.title == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Evidence.title");
        else if (Configuration.doAutoCreate())
          this.title = new StringType(); // bb
      return this.title;
    }

    public boolean hasTitleElement() { 
      return this.title != null && !this.title.isEmpty();
    }

    public boolean hasTitle() { 
      return this.title != null && !this.title.isEmpty();
    }

    /**
     * @param value {@link #title} (A short, descriptive, user-friendly title for the summary.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
     */
    public Evidence setTitleElement(StringType value) { 
      this.title = value;
      return this;
    }

    /**
     * @return A short, descriptive, user-friendly title for the summary.
     */
    public String getTitle() { 
      return this.title == null ? null : this.title.getValue();
    }

    /**
     * @param value A short, descriptive, user-friendly title for the summary.
     */
    public Evidence setTitle(String value) { 
      if (Utilities.noString(value))
        this.title = null;
      else {
        if (this.title == null)
          this.title = new StringType();
        this.title.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #status} (The status of this summary. Enables tracking the life-cycle of the content.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<PublicationStatus> getStatusElement() { 
      if (this.status == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Evidence.status");
        else if (Configuration.doAutoCreate())
          this.status = new Enumeration<PublicationStatus>(new PublicationStatusEnumFactory()); // bb
      return this.status;
    }

    public boolean hasStatusElement() { 
      return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() { 
      return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The status of this summary. Enables tracking the life-cycle of the content.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Evidence setStatusElement(Enumeration<PublicationStatus> value) { 
      this.status = value;
      return this;
    }

    /**
     * @return The status of this summary. Enables tracking the life-cycle of the content.
     */
    public PublicationStatus getStatus() { 
      return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status of this summary. Enables tracking the life-cycle of the content.
     */
    public Evidence setStatus(PublicationStatus value) { 
        if (this.status == null)
          this.status = new Enumeration<PublicationStatus>(new PublicationStatusEnumFactory());
        this.status.setValue(value);
      return this;
    }

    /**
     * @return {@link #useContext} (The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate evidence instances.)
     */
    public List<UsageContext> getUseContext() { 
      if (this.useContext == null)
        this.useContext = new ArrayList<UsageContext>();
      return this.useContext;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Evidence setUseContext(List<UsageContext> theUseContext) { 
      this.useContext = theUseContext;
      return this;
    }

    public boolean hasUseContext() { 
      if (this.useContext == null)
        return false;
      for (UsageContext item : this.useContext)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public UsageContext addUseContext() { //3
      UsageContext t = new UsageContext();
      if (this.useContext == null)
        this.useContext = new ArrayList<UsageContext>();
      this.useContext.add(t);
      return t;
    }

    public Evidence addUseContext(UsageContext t) { //3
      if (t == null)
        return this;
      if (this.useContext == null)
        this.useContext = new ArrayList<UsageContext>();
      this.useContext.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #useContext}, creating it if it does not already exist
     */
    public UsageContext getUseContextFirstRep() { 
      if (getUseContext().isEmpty()) {
        addUseContext();
      }
      return getUseContext().get(0);
    }

    /**
     * @return {@link #date} (The date  (and optionally time) when the summary was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the summary changes.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() { 
      if (this.date == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Evidence.date");
        else if (Configuration.doAutoCreate())
          this.date = new DateTimeType(); // bb
      return this.date;
    }

    public boolean hasDateElement() { 
      return this.date != null && !this.date.isEmpty();
    }

    public boolean hasDate() { 
      return this.date != null && !this.date.isEmpty();
    }

    /**
     * @param value {@link #date} (The date  (and optionally time) when the summary was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the summary changes.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public Evidence setDateElement(DateTimeType value) { 
      this.date = value;
      return this;
    }

    /**
     * @return The date  (and optionally time) when the summary was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the summary changes.
     */
    public Date getDate() { 
      return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value The date  (and optionally time) when the summary was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the summary changes.
     */
    public Evidence setDate(Date value) { 
      if (value == null)
        this.date = null;
      else {
        if (this.date == null)
          this.date = new DateTimeType();
        this.date.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #approvalDate} (The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.). This is the underlying object with id, value and extensions. The accessor "getApprovalDate" gives direct access to the value
     */
    public DateType getApprovalDateElement() { 
      if (this.approvalDate == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Evidence.approvalDate");
        else if (Configuration.doAutoCreate())
          this.approvalDate = new DateType(); // bb
      return this.approvalDate;
    }

    public boolean hasApprovalDateElement() { 
      return this.approvalDate != null && !this.approvalDate.isEmpty();
    }

    public boolean hasApprovalDate() { 
      return this.approvalDate != null && !this.approvalDate.isEmpty();
    }

    /**
     * @param value {@link #approvalDate} (The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.). This is the underlying object with id, value and extensions. The accessor "getApprovalDate" gives direct access to the value
     */
    public Evidence setApprovalDateElement(DateType value) { 
      this.approvalDate = value;
      return this;
    }

    /**
     * @return The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.
     */
    public Date getApprovalDate() { 
      return this.approvalDate == null ? null : this.approvalDate.getValue();
    }

    /**
     * @param value The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.
     */
    public Evidence setApprovalDate(Date value) { 
      if (value == null)
        this.approvalDate = null;
      else {
        if (this.approvalDate == null)
          this.approvalDate = new DateType();
        this.approvalDate.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #lastReviewDate} (The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.). This is the underlying object with id, value and extensions. The accessor "getLastReviewDate" gives direct access to the value
     */
    public DateType getLastReviewDateElement() { 
      if (this.lastReviewDate == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Evidence.lastReviewDate");
        else if (Configuration.doAutoCreate())
          this.lastReviewDate = new DateType(); // bb
      return this.lastReviewDate;
    }

    public boolean hasLastReviewDateElement() { 
      return this.lastReviewDate != null && !this.lastReviewDate.isEmpty();
    }

    public boolean hasLastReviewDate() { 
      return this.lastReviewDate != null && !this.lastReviewDate.isEmpty();
    }

    /**
     * @param value {@link #lastReviewDate} (The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.). This is the underlying object with id, value and extensions. The accessor "getLastReviewDate" gives direct access to the value
     */
    public Evidence setLastReviewDateElement(DateType value) { 
      this.lastReviewDate = value;
      return this;
    }

    /**
     * @return The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.
     */
    public Date getLastReviewDate() { 
      return this.lastReviewDate == null ? null : this.lastReviewDate.getValue();
    }

    /**
     * @param value The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.
     */
    public Evidence setLastReviewDate(Date value) { 
      if (value == null)
        this.lastReviewDate = null;
      else {
        if (this.lastReviewDate == null)
          this.lastReviewDate = new DateType();
        this.lastReviewDate.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #contributor} (Contact detail and role for contributor to summary.)
     */
    public List<Contributor> getContributor() { 
      if (this.contributor == null)
        this.contributor = new ArrayList<Contributor>();
      return this.contributor;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Evidence setContributor(List<Contributor> theContributor) { 
      this.contributor = theContributor;
      return this;
    }

    public boolean hasContributor() { 
      if (this.contributor == null)
        return false;
      for (Contributor item : this.contributor)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Contributor addContributor() { //3
      Contributor t = new Contributor();
      if (this.contributor == null)
        this.contributor = new ArrayList<Contributor>();
      this.contributor.add(t);
      return t;
    }

    public Evidence addContributor(Contributor t) { //3
      if (t == null)
        return this;
      if (this.contributor == null)
        this.contributor = new ArrayList<Contributor>();
      this.contributor.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #contributor}, creating it if it does not already exist
     */
    public Contributor getContributorFirstRep() { 
      if (getContributor().isEmpty()) {
        addContributor();
      }
      return getContributor().get(0);
    }

    /**
     * @return {@link #relatedArtifact} (Link or citation to artifact associated with the summary.)
     */
    public List<RelatedArtifact> getRelatedArtifact() { 
      if (this.relatedArtifact == null)
        this.relatedArtifact = new ArrayList<RelatedArtifact>();
      return this.relatedArtifact;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Evidence setRelatedArtifact(List<RelatedArtifact> theRelatedArtifact) { 
      this.relatedArtifact = theRelatedArtifact;
      return this;
    }

    public boolean hasRelatedArtifact() { 
      if (this.relatedArtifact == null)
        return false;
      for (RelatedArtifact item : this.relatedArtifact)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public RelatedArtifact addRelatedArtifact() { //3
      RelatedArtifact t = new RelatedArtifact();
      if (this.relatedArtifact == null)
        this.relatedArtifact = new ArrayList<RelatedArtifact>();
      this.relatedArtifact.add(t);
      return t;
    }

    public Evidence addRelatedArtifact(RelatedArtifact t) { //3
      if (t == null)
        return this;
      if (this.relatedArtifact == null)
        this.relatedArtifact = new ArrayList<RelatedArtifact>();
      this.relatedArtifact.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #relatedArtifact}, creating it if it does not already exist
     */
    public RelatedArtifact getRelatedArtifactFirstRep() { 
      if (getRelatedArtifact().isEmpty()) {
        addRelatedArtifact();
      }
      return getRelatedArtifact().get(0);
    }

    /**
     * @return {@link #description} (A free text natural language description of the evidence from a consumer's perspective.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public MarkdownType getDescriptionElement() { 
      if (this.description == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Evidence.description");
        else if (Configuration.doAutoCreate())
          this.description = new MarkdownType(); // bb
      return this.description;
    }

    public boolean hasDescriptionElement() { 
      return this.description != null && !this.description.isEmpty();
    }

    public boolean hasDescription() { 
      return this.description != null && !this.description.isEmpty();
    }

    /**
     * @param value {@link #description} (A free text natural language description of the evidence from a consumer's perspective.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public Evidence setDescriptionElement(MarkdownType value) { 
      this.description = value;
      return this;
    }

    /**
     * @return A free text natural language description of the evidence from a consumer's perspective.
     */
    public String getDescription() { 
      return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value A free text natural language description of the evidence from a consumer's perspective.
     */
    public Evidence setDescription(String value) { 
      if (value == null)
        this.description = null;
      else {
        if (this.description == null)
          this.description = new MarkdownType();
        this.description.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #assertion} (Declarative description of the Evidence.). This is the underlying object with id, value and extensions. The accessor "getAssertion" gives direct access to the value
     */
    public MarkdownType getAssertionElement() { 
      if (this.assertion == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Evidence.assertion");
        else if (Configuration.doAutoCreate())
          this.assertion = new MarkdownType(); // bb
      return this.assertion;
    }

    public boolean hasAssertionElement() { 
      return this.assertion != null && !this.assertion.isEmpty();
    }

    public boolean hasAssertion() { 
      return this.assertion != null && !this.assertion.isEmpty();
    }

    /**
     * @param value {@link #assertion} (Declarative description of the Evidence.). This is the underlying object with id, value and extensions. The accessor "getAssertion" gives direct access to the value
     */
    public Evidence setAssertionElement(MarkdownType value) { 
      this.assertion = value;
      return this;
    }

    /**
     * @return Declarative description of the Evidence.
     */
    public String getAssertion() { 
      return this.assertion == null ? null : this.assertion.getValue();
    }

    /**
     * @param value Declarative description of the Evidence.
     */
    public Evidence setAssertion(String value) { 
      if (value == null)
        this.assertion = null;
      else {
        if (this.assertion == null)
          this.assertion = new MarkdownType();
        this.assertion.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #note} (Footnotes and/or explanatory notes.)
     */
    public List<Annotation> getNote() { 
      if (this.note == null)
        this.note = new ArrayList<Annotation>();
      return this.note;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Evidence setNote(List<Annotation> theNote) { 
      this.note = theNote;
      return this;
    }

    public boolean hasNote() { 
      if (this.note == null)
        return false;
      for (Annotation item : this.note)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Annotation addNote() { //3
      Annotation t = new Annotation();
      if (this.note == null)
        this.note = new ArrayList<Annotation>();
      this.note.add(t);
      return t;
    }

    public Evidence addNote(Annotation t) { //3
      if (t == null)
        return this;
      if (this.note == null)
        this.note = new ArrayList<Annotation>();
      this.note.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #note}, creating it if it does not already exist
     */
    public Annotation getNoteFirstRep() { 
      if (getNote().isEmpty()) {
        addNote();
      }
      return getNote().get(0);
    }

    /**
     * @return {@link #referentGroup} (Group being referenced.)
     */
    public EvidenceReferentGroupComponent getReferentGroup() { 
      if (this.referentGroup == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Evidence.referentGroup");
        else if (Configuration.doAutoCreate())
          this.referentGroup = new EvidenceReferentGroupComponent(); // cc
      return this.referentGroup;
    }

    public boolean hasReferentGroup() { 
      return this.referentGroup != null && !this.referentGroup.isEmpty();
    }

    /**
     * @param value {@link #referentGroup} (Group being referenced.)
     */
    public Evidence setReferentGroup(EvidenceReferentGroupComponent value) { 
      this.referentGroup = value;
      return this;
    }

    /**
     * @return {@link #variableDefinition} (Evidence variable.)
     */
    public List<EvidenceVariableDefinitionComponent> getVariableDefinition() { 
      if (this.variableDefinition == null)
        this.variableDefinition = new ArrayList<EvidenceVariableDefinitionComponent>();
      return this.variableDefinition;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Evidence setVariableDefinition(List<EvidenceVariableDefinitionComponent> theVariableDefinition) { 
      this.variableDefinition = theVariableDefinition;
      return this;
    }

    public boolean hasVariableDefinition() { 
      if (this.variableDefinition == null)
        return false;
      for (EvidenceVariableDefinitionComponent item : this.variableDefinition)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public EvidenceVariableDefinitionComponent addVariableDefinition() { //3
      EvidenceVariableDefinitionComponent t = new EvidenceVariableDefinitionComponent();
      if (this.variableDefinition == null)
        this.variableDefinition = new ArrayList<EvidenceVariableDefinitionComponent>();
      this.variableDefinition.add(t);
      return t;
    }

    public Evidence addVariableDefinition(EvidenceVariableDefinitionComponent t) { //3
      if (t == null)
        return this;
      if (this.variableDefinition == null)
        this.variableDefinition = new ArrayList<EvidenceVariableDefinitionComponent>();
      this.variableDefinition.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #variableDefinition}, creating it if it does not already exist
     */
    public EvidenceVariableDefinitionComponent getVariableDefinitionFirstRep() { 
      if (getVariableDefinition().isEmpty()) {
        addVariableDefinition();
      }
      return getVariableDefinition().get(0);
    }

    /**
     * @return {@link #synthesisType} (The particular type of synthesis if this is a synthesis summary.)
     */
    public CodeableConcept getSynthesisType() { 
      if (this.synthesisType == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Evidence.synthesisType");
        else if (Configuration.doAutoCreate())
          this.synthesisType = new CodeableConcept(); // cc
      return this.synthesisType;
    }

    public boolean hasSynthesisType() { 
      return this.synthesisType != null && !this.synthesisType.isEmpty();
    }

    /**
     * @param value {@link #synthesisType} (The particular type of synthesis if this is a synthesis summary.)
     */
    public Evidence setSynthesisType(CodeableConcept value) { 
      this.synthesisType = value;
      return this;
    }

    /**
     * @return {@link #studyType} (The type of study that produced this summary.)
     */
    public CodeableConcept getStudyType() { 
      if (this.studyType == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Evidence.studyType");
        else if (Configuration.doAutoCreate())
          this.studyType = new CodeableConcept(); // cc
      return this.studyType;
    }

    public boolean hasStudyType() { 
      return this.studyType != null && !this.studyType.isEmpty();
    }

    /**
     * @param value {@link #studyType} (The type of study that produced this summary.)
     */
    public Evidence setStudyType(CodeableConcept value) { 
      this.studyType = value;
      return this;
    }

    /**
     * @return {@link #statistic} (The statistic value(s).)
     */
    public List<Statistic> getStatistic() { 
      if (this.statistic == null)
        this.statistic = new ArrayList<Statistic>();
      return this.statistic;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Evidence setStatistic(List<Statistic> theStatistic) { 
      this.statistic = theStatistic;
      return this;
    }

    public boolean hasStatistic() { 
      if (this.statistic == null)
        return false;
      for (Statistic item : this.statistic)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Statistic addStatistic() { //3
      Statistic t = new Statistic();
      if (this.statistic == null)
        this.statistic = new ArrayList<Statistic>();
      this.statistic.add(t);
      return t;
    }

    public Evidence addStatistic(Statistic t) { //3
      if (t == null)
        return this;
      if (this.statistic == null)
        this.statistic = new ArrayList<Statistic>();
      this.statistic.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #statistic}, creating it if it does not already exist
     */
    public Statistic getStatisticFirstRep() { 
      if (getStatistic().isEmpty()) {
        addStatistic();
      }
      return getStatistic().get(0);
    }

    /**
     * @return {@link #distribution} (Ordered distribution.)
     */
    public List<OrderedDistribution> getDistribution() { 
      if (this.distribution == null)
        this.distribution = new ArrayList<OrderedDistribution>();
      return this.distribution;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Evidence setDistribution(List<OrderedDistribution> theDistribution) { 
      this.distribution = theDistribution;
      return this;
    }

    public boolean hasDistribution() { 
      if (this.distribution == null)
        return false;
      for (OrderedDistribution item : this.distribution)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public OrderedDistribution addDistribution() { //3
      OrderedDistribution t = new OrderedDistribution();
      if (this.distribution == null)
        this.distribution = new ArrayList<OrderedDistribution>();
      this.distribution.add(t);
      return t;
    }

    public Evidence addDistribution(OrderedDistribution t) { //3
      if (t == null)
        return this;
      if (this.distribution == null)
        this.distribution = new ArrayList<OrderedDistribution>();
      this.distribution.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #distribution}, creating it if it does not already exist
     */
    public OrderedDistribution getDistributionFirstRep() { 
      if (getDistribution().isEmpty()) {
        addDistribution();
      }
      return getDistribution().get(0);
    }

    /**
     * @return {@link #certainty} (Level of certainty.)
     */
    public List<EvidenceCertaintyComponent> getCertainty() { 
      if (this.certainty == null)
        this.certainty = new ArrayList<EvidenceCertaintyComponent>();
      return this.certainty;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Evidence setCertainty(List<EvidenceCertaintyComponent> theCertainty) { 
      this.certainty = theCertainty;
      return this;
    }

    public boolean hasCertainty() { 
      if (this.certainty == null)
        return false;
      for (EvidenceCertaintyComponent item : this.certainty)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public EvidenceCertaintyComponent addCertainty() { //3
      EvidenceCertaintyComponent t = new EvidenceCertaintyComponent();
      if (this.certainty == null)
        this.certainty = new ArrayList<EvidenceCertaintyComponent>();
      this.certainty.add(t);
      return t;
    }

    public Evidence addCertainty(EvidenceCertaintyComponent t) { //3
      if (t == null)
        return this;
      if (this.certainty == null)
        this.certainty = new ArrayList<EvidenceCertaintyComponent>();
      this.certainty.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #certainty}, creating it if it does not already exist
     */
    public EvidenceCertaintyComponent getCertaintyFirstRep() { 
      if (getCertainty().isEmpty()) {
        addCertainty();
      }
      return getCertainty().get(0);
    }

      protected void listChildren(List<Property> children) {
        super.listChildren(children);
        children.add(new Property("url", "uri", "An absolute URI that is used to identify this evidence when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this summary is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the summary is stored on different servers.", 0, 1, url));
        children.add(new Property("identifier", "Identifier", "A formal identifier that is used to identify this summary when it is represented in other formats, or referenced in a specification, model, design or an instance.", 0, java.lang.Integer.MAX_VALUE, identifier));
        children.add(new Property("version", "string", "The identifier that is used to identify this version of the summary when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the summary author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.", 0, 1, version));
        children.add(new Property("title", "string", "A short, descriptive, user-friendly title for the summary.", 0, 1, title));
        children.add(new Property("status", "code", "The status of this summary. Enables tracking the life-cycle of the content.", 0, 1, status));
        children.add(new Property("useContext", "UsageContext", "The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate evidence instances.", 0, java.lang.Integer.MAX_VALUE, useContext));
        children.add(new Property("date", "dateTime", "The date  (and optionally time) when the summary was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the summary changes.", 0, 1, date));
        children.add(new Property("approvalDate", "date", "The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.", 0, 1, approvalDate));
        children.add(new Property("lastReviewDate", "date", "The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.", 0, 1, lastReviewDate));
        children.add(new Property("contributor", "Contributor", "Contact detail and role for contributor to summary.", 0, java.lang.Integer.MAX_VALUE, contributor));
        children.add(new Property("relatedArtifact", "RelatedArtifact", "Link or citation to artifact associated with the summary.", 0, java.lang.Integer.MAX_VALUE, relatedArtifact));
        children.add(new Property("description", "markdown", "A free text natural language description of the evidence from a consumer's perspective.", 0, 1, description));
        children.add(new Property("assertion", "markdown", "Declarative description of the Evidence.", 0, 1, assertion));
        children.add(new Property("note", "Annotation", "Footnotes and/or explanatory notes.", 0, java.lang.Integer.MAX_VALUE, note));
        children.add(new Property("referentGroup", "", "Group being referenced.", 0, 1, referentGroup));
        children.add(new Property("variableDefinition", "", "Evidence variable.", 0, java.lang.Integer.MAX_VALUE, variableDefinition));
        children.add(new Property("synthesisType", "CodeableConcept", "The particular type of synthesis if this is a synthesis summary.", 0, 1, synthesisType));
        children.add(new Property("studyType", "CodeableConcept", "The type of study that produced this summary.", 0, 1, studyType));
        children.add(new Property("statistic", "Statistic", "The statistic value(s).", 0, java.lang.Integer.MAX_VALUE, statistic));
        children.add(new Property("distribution", "OrderedDistribution", "Ordered distribution.", 0, java.lang.Integer.MAX_VALUE, distribution));
        children.add(new Property("certainty", "", "Level of certainty.", 0, java.lang.Integer.MAX_VALUE, certainty));
      }

      @Override
      public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
        switch (_hash) {
        case 116079: /*url*/  return new Property("url", "uri", "An absolute URI that is used to identify this evidence when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this summary is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the summary is stored on different servers.", 0, 1, url);
        case -1618432855: /*identifier*/  return new Property("identifier", "Identifier", "A formal identifier that is used to identify this summary when it is represented in other formats, or referenced in a specification, model, design or an instance.", 0, java.lang.Integer.MAX_VALUE, identifier);
        case 351608024: /*version*/  return new Property("version", "string", "The identifier that is used to identify this version of the summary when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the summary author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.", 0, 1, version);
        case 110371416: /*title*/  return new Property("title", "string", "A short, descriptive, user-friendly title for the summary.", 0, 1, title);
        case -892481550: /*status*/  return new Property("status", "code", "The status of this summary. Enables tracking the life-cycle of the content.", 0, 1, status);
        case -669707736: /*useContext*/  return new Property("useContext", "UsageContext", "The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate evidence instances.", 0, java.lang.Integer.MAX_VALUE, useContext);
        case 3076014: /*date*/  return new Property("date", "dateTime", "The date  (and optionally time) when the summary was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the summary changes.", 0, 1, date);
        case 223539345: /*approvalDate*/  return new Property("approvalDate", "date", "The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.", 0, 1, approvalDate);
        case -1687512484: /*lastReviewDate*/  return new Property("lastReviewDate", "date", "The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.", 0, 1, lastReviewDate);
        case -1895276325: /*contributor*/  return new Property("contributor", "Contributor", "Contact detail and role for contributor to summary.", 0, java.lang.Integer.MAX_VALUE, contributor);
        case 666807069: /*relatedArtifact*/  return new Property("relatedArtifact", "RelatedArtifact", "Link or citation to artifact associated with the summary.", 0, java.lang.Integer.MAX_VALUE, relatedArtifact);
        case -1724546052: /*description*/  return new Property("description", "markdown", "A free text natural language description of the evidence from a consumer's perspective.", 0, 1, description);
        case 1314395906: /*assertion*/  return new Property("assertion", "markdown", "Declarative description of the Evidence.", 0, 1, assertion);
        case 3387378: /*note*/  return new Property("note", "Annotation", "Footnotes and/or explanatory notes.", 0, java.lang.Integer.MAX_VALUE, note);
        case 2060829908: /*referentGroup*/  return new Property("referentGroup", "", "Group being referenced.", 0, 1, referentGroup);
        case -1807222545: /*variableDefinition*/  return new Property("variableDefinition", "", "Evidence variable.", 0, java.lang.Integer.MAX_VALUE, variableDefinition);
        case 672726254: /*synthesisType*/  return new Property("synthesisType", "CodeableConcept", "The particular type of synthesis if this is a synthesis summary.", 0, 1, synthesisType);
        case -1955265373: /*studyType*/  return new Property("studyType", "CodeableConcept", "The type of study that produced this summary.", 0, 1, studyType);
        case -2081261232: /*statistic*/  return new Property("statistic", "Statistic", "The statistic value(s).", 0, java.lang.Integer.MAX_VALUE, statistic);
        case -1580708220: /*distribution*/  return new Property("distribution", "OrderedDistribution", "Ordered distribution.", 0, java.lang.Integer.MAX_VALUE, distribution);
        case -1404142937: /*certainty*/  return new Property("certainty", "", "Level of certainty.", 0, java.lang.Integer.MAX_VALUE, certainty);
        default: return super.getNamedProperty(_hash, _name, _checkValid);
        }

      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 116079: /*url*/ return this.url == null ? new Base[0] : new Base[] {this.url}; // UriType
        case -1618432855: /*identifier*/ return this.identifier == null ? new Base[0] : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
        case 351608024: /*version*/ return this.version == null ? new Base[0] : new Base[] {this.version}; // StringType
        case 110371416: /*title*/ return this.title == null ? new Base[0] : new Base[] {this.title}; // StringType
        case -892481550: /*status*/ return this.status == null ? new Base[0] : new Base[] {this.status}; // Enumeration<PublicationStatus>
        case -669707736: /*useContext*/ return this.useContext == null ? new Base[0] : this.useContext.toArray(new Base[this.useContext.size()]); // UsageContext
        case 3076014: /*date*/ return this.date == null ? new Base[0] : new Base[] {this.date}; // DateTimeType
        case 223539345: /*approvalDate*/ return this.approvalDate == null ? new Base[0] : new Base[] {this.approvalDate}; // DateType
        case -1687512484: /*lastReviewDate*/ return this.lastReviewDate == null ? new Base[0] : new Base[] {this.lastReviewDate}; // DateType
        case -1895276325: /*contributor*/ return this.contributor == null ? new Base[0] : this.contributor.toArray(new Base[this.contributor.size()]); // Contributor
        case 666807069: /*relatedArtifact*/ return this.relatedArtifact == null ? new Base[0] : this.relatedArtifact.toArray(new Base[this.relatedArtifact.size()]); // RelatedArtifact
        case -1724546052: /*description*/ return this.description == null ? new Base[0] : new Base[] {this.description}; // MarkdownType
        case 1314395906: /*assertion*/ return this.assertion == null ? new Base[0] : new Base[] {this.assertion}; // MarkdownType
        case 3387378: /*note*/ return this.note == null ? new Base[0] : this.note.toArray(new Base[this.note.size()]); // Annotation
        case 2060829908: /*referentGroup*/ return this.referentGroup == null ? new Base[0] : new Base[] {this.referentGroup}; // EvidenceReferentGroupComponent
        case -1807222545: /*variableDefinition*/ return this.variableDefinition == null ? new Base[0] : this.variableDefinition.toArray(new Base[this.variableDefinition.size()]); // EvidenceVariableDefinitionComponent
        case 672726254: /*synthesisType*/ return this.synthesisType == null ? new Base[0] : new Base[] {this.synthesisType}; // CodeableConcept
        case -1955265373: /*studyType*/ return this.studyType == null ? new Base[0] : new Base[] {this.studyType}; // CodeableConcept
        case -2081261232: /*statistic*/ return this.statistic == null ? new Base[0] : this.statistic.toArray(new Base[this.statistic.size()]); // Statistic
        case -1580708220: /*distribution*/ return this.distribution == null ? new Base[0] : this.distribution.toArray(new Base[this.distribution.size()]); // OrderedDistribution
        case -1404142937: /*certainty*/ return this.certainty == null ? new Base[0] : this.certainty.toArray(new Base[this.certainty.size()]); // EvidenceCertaintyComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 116079: // url
          this.url = castToUri(value); // UriType
          return value;
        case -1618432855: // identifier
          this.getIdentifier().add(castToIdentifier(value)); // Identifier
          return value;
        case 351608024: // version
          this.version = castToString(value); // StringType
          return value;
        case 110371416: // title
          this.title = castToString(value); // StringType
          return value;
        case -892481550: // status
          value = new PublicationStatusEnumFactory().fromType(castToCode(value));
          this.status = (Enumeration) value; // Enumeration<PublicationStatus>
          return value;
        case -669707736: // useContext
          this.getUseContext().add(castToUsageContext(value)); // UsageContext
          return value;
        case 3076014: // date
          this.date = castToDateTime(value); // DateTimeType
          return value;
        case 223539345: // approvalDate
          this.approvalDate = castToDate(value); // DateType
          return value;
        case -1687512484: // lastReviewDate
          this.lastReviewDate = castToDate(value); // DateType
          return value;
        case -1895276325: // contributor
          this.getContributor().add(castToContributor(value)); // Contributor
          return value;
        case 666807069: // relatedArtifact
          this.getRelatedArtifact().add(castToRelatedArtifact(value)); // RelatedArtifact
          return value;
        case -1724546052: // description
          this.description = castToMarkdown(value); // MarkdownType
          return value;
        case 1314395906: // assertion
          this.assertion = castToMarkdown(value); // MarkdownType
          return value;
        case 3387378: // note
          this.getNote().add(castToAnnotation(value)); // Annotation
          return value;
        case 2060829908: // referentGroup
          this.referentGroup = (EvidenceReferentGroupComponent) value; // EvidenceReferentGroupComponent
          return value;
        case -1807222545: // variableDefinition
          this.getVariableDefinition().add((EvidenceVariableDefinitionComponent) value); // EvidenceVariableDefinitionComponent
          return value;
        case 672726254: // synthesisType
          this.synthesisType = castToCodeableConcept(value); // CodeableConcept
          return value;
        case -1955265373: // studyType
          this.studyType = castToCodeableConcept(value); // CodeableConcept
          return value;
        case -2081261232: // statistic
          this.getStatistic().add(castToStatistic(value)); // Statistic
          return value;
        case -1580708220: // distribution
          this.getDistribution().add(castToOrderedDistribution(value)); // OrderedDistribution
          return value;
        case -1404142937: // certainty
          this.getCertainty().add((EvidenceCertaintyComponent) value); // EvidenceCertaintyComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("url")) {
          this.url = castToUri(value); // UriType
        } else if (name.equals("identifier")) {
          this.getIdentifier().add(castToIdentifier(value));
        } else if (name.equals("version")) {
          this.version = castToString(value); // StringType
        } else if (name.equals("title")) {
          this.title = castToString(value); // StringType
        } else if (name.equals("status")) {
          value = new PublicationStatusEnumFactory().fromType(castToCode(value));
          this.status = (Enumeration) value; // Enumeration<PublicationStatus>
        } else if (name.equals("useContext")) {
          this.getUseContext().add(castToUsageContext(value));
        } else if (name.equals("date")) {
          this.date = castToDateTime(value); // DateTimeType
        } else if (name.equals("approvalDate")) {
          this.approvalDate = castToDate(value); // DateType
        } else if (name.equals("lastReviewDate")) {
          this.lastReviewDate = castToDate(value); // DateType
        } else if (name.equals("contributor")) {
          this.getContributor().add(castToContributor(value));
        } else if (name.equals("relatedArtifact")) {
          this.getRelatedArtifact().add(castToRelatedArtifact(value));
        } else if (name.equals("description")) {
          this.description = castToMarkdown(value); // MarkdownType
        } else if (name.equals("assertion")) {
          this.assertion = castToMarkdown(value); // MarkdownType
        } else if (name.equals("note")) {
          this.getNote().add(castToAnnotation(value));
        } else if (name.equals("referentGroup")) {
          this.referentGroup = (EvidenceReferentGroupComponent) value; // EvidenceReferentGroupComponent
        } else if (name.equals("variableDefinition")) {
          this.getVariableDefinition().add((EvidenceVariableDefinitionComponent) value);
        } else if (name.equals("synthesisType")) {
          this.synthesisType = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("studyType")) {
          this.studyType = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("statistic")) {
          this.getStatistic().add(castToStatistic(value));
        } else if (name.equals("distribution")) {
          this.getDistribution().add(castToOrderedDistribution(value));
        } else if (name.equals("certainty")) {
          this.getCertainty().add((EvidenceCertaintyComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 116079:  return getUrlElement();
        case -1618432855:  return addIdentifier(); 
        case 351608024:  return getVersionElement();
        case 110371416:  return getTitleElement();
        case -892481550:  return getStatusElement();
        case -669707736:  return addUseContext(); 
        case 3076014:  return getDateElement();
        case 223539345:  return getApprovalDateElement();
        case -1687512484:  return getLastReviewDateElement();
        case -1895276325:  return addContributor(); 
        case 666807069:  return addRelatedArtifact(); 
        case -1724546052:  return getDescriptionElement();
        case 1314395906:  return getAssertionElement();
        case 3387378:  return addNote(); 
        case 2060829908:  return getReferentGroup();
        case -1807222545:  return addVariableDefinition(); 
        case 672726254:  return getSynthesisType();
        case -1955265373:  return getStudyType();
        case -2081261232:  return addStatistic(); 
        case -1580708220:  return addDistribution(); 
        case -1404142937:  return addCertainty(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 116079: /*url*/ return new String[] {"uri"};
        case -1618432855: /*identifier*/ return new String[] {"Identifier"};
        case 351608024: /*version*/ return new String[] {"string"};
        case 110371416: /*title*/ return new String[] {"string"};
        case -892481550: /*status*/ return new String[] {"code"};
        case -669707736: /*useContext*/ return new String[] {"UsageContext"};
        case 3076014: /*date*/ return new String[] {"dateTime"};
        case 223539345: /*approvalDate*/ return new String[] {"date"};
        case -1687512484: /*lastReviewDate*/ return new String[] {"date"};
        case -1895276325: /*contributor*/ return new String[] {"Contributor"};
        case 666807069: /*relatedArtifact*/ return new String[] {"RelatedArtifact"};
        case -1724546052: /*description*/ return new String[] {"markdown"};
        case 1314395906: /*assertion*/ return new String[] {"markdown"};
        case 3387378: /*note*/ return new String[] {"Annotation"};
        case 2060829908: /*referentGroup*/ return new String[] {};
        case -1807222545: /*variableDefinition*/ return new String[] {};
        case 672726254: /*synthesisType*/ return new String[] {"CodeableConcept"};
        case -1955265373: /*studyType*/ return new String[] {"CodeableConcept"};
        case -2081261232: /*statistic*/ return new String[] {"Statistic"};
        case -1580708220: /*distribution*/ return new String[] {"OrderedDistribution"};
        case -1404142937: /*certainty*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("url")) {
          throw new FHIRException("Cannot call addChild on a primitive type Evidence.url");
        }
        else if (name.equals("identifier")) {
          return addIdentifier();
        }
        else if (name.equals("version")) {
          throw new FHIRException("Cannot call addChild on a primitive type Evidence.version");
        }
        else if (name.equals("title")) {
          throw new FHIRException("Cannot call addChild on a primitive type Evidence.title");
        }
        else if (name.equals("status")) {
          throw new FHIRException("Cannot call addChild on a primitive type Evidence.status");
        }
        else if (name.equals("useContext")) {
          return addUseContext();
        }
        else if (name.equals("date")) {
          throw new FHIRException("Cannot call addChild on a primitive type Evidence.date");
        }
        else if (name.equals("approvalDate")) {
          throw new FHIRException("Cannot call addChild on a primitive type Evidence.approvalDate");
        }
        else if (name.equals("lastReviewDate")) {
          throw new FHIRException("Cannot call addChild on a primitive type Evidence.lastReviewDate");
        }
        else if (name.equals("contributor")) {
          return addContributor();
        }
        else if (name.equals("relatedArtifact")) {
          return addRelatedArtifact();
        }
        else if (name.equals("description")) {
          throw new FHIRException("Cannot call addChild on a primitive type Evidence.description");
        }
        else if (name.equals("assertion")) {
          throw new FHIRException("Cannot call addChild on a primitive type Evidence.assertion");
        }
        else if (name.equals("note")) {
          return addNote();
        }
        else if (name.equals("referentGroup")) {
          this.referentGroup = new EvidenceReferentGroupComponent();
          return this.referentGroup;
        }
        else if (name.equals("variableDefinition")) {
          return addVariableDefinition();
        }
        else if (name.equals("synthesisType")) {
          this.synthesisType = new CodeableConcept();
          return this.synthesisType;
        }
        else if (name.equals("studyType")) {
          this.studyType = new CodeableConcept();
          return this.studyType;
        }
        else if (name.equals("statistic")) {
          return addStatistic();
        }
        else if (name.equals("distribution")) {
          return addDistribution();
        }
        else if (name.equals("certainty")) {
          return addCertainty();
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "Evidence";

  }

      public Evidence copy() {
        Evidence dst = new Evidence();
        copyValues(dst);
        return dst;
      }

      public void copyValues(Evidence dst) {
        super.copyValues(dst);
        dst.url = url == null ? null : url.copy();
        if (identifier != null) {
          dst.identifier = new ArrayList<Identifier>();
          for (Identifier i : identifier)
            dst.identifier.add(i.copy());
        };
        dst.version = version == null ? null : version.copy();
        dst.title = title == null ? null : title.copy();
        dst.status = status == null ? null : status.copy();
        if (useContext != null) {
          dst.useContext = new ArrayList<UsageContext>();
          for (UsageContext i : useContext)
            dst.useContext.add(i.copy());
        };
        dst.date = date == null ? null : date.copy();
        dst.approvalDate = approvalDate == null ? null : approvalDate.copy();
        dst.lastReviewDate = lastReviewDate == null ? null : lastReviewDate.copy();
        if (contributor != null) {
          dst.contributor = new ArrayList<Contributor>();
          for (Contributor i : contributor)
            dst.contributor.add(i.copy());
        };
        if (relatedArtifact != null) {
          dst.relatedArtifact = new ArrayList<RelatedArtifact>();
          for (RelatedArtifact i : relatedArtifact)
            dst.relatedArtifact.add(i.copy());
        };
        dst.description = description == null ? null : description.copy();
        dst.assertion = assertion == null ? null : assertion.copy();
        if (note != null) {
          dst.note = new ArrayList<Annotation>();
          for (Annotation i : note)
            dst.note.add(i.copy());
        };
        dst.referentGroup = referentGroup == null ? null : referentGroup.copy();
        if (variableDefinition != null) {
          dst.variableDefinition = new ArrayList<EvidenceVariableDefinitionComponent>();
          for (EvidenceVariableDefinitionComponent i : variableDefinition)
            dst.variableDefinition.add(i.copy());
        };
        dst.synthesisType = synthesisType == null ? null : synthesisType.copy();
        dst.studyType = studyType == null ? null : studyType.copy();
        if (statistic != null) {
          dst.statistic = new ArrayList<Statistic>();
          for (Statistic i : statistic)
            dst.statistic.add(i.copy());
        };
        if (distribution != null) {
          dst.distribution = new ArrayList<OrderedDistribution>();
          for (OrderedDistribution i : distribution)
            dst.distribution.add(i.copy());
        };
        if (certainty != null) {
          dst.certainty = new ArrayList<EvidenceCertaintyComponent>();
          for (EvidenceCertaintyComponent i : certainty)
            dst.certainty.add(i.copy());
        };
      }

      protected Evidence typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof Evidence))
          return false;
        Evidence o = (Evidence) other_;
        return compareDeep(identifier, o.identifier, true) && compareDeep(approvalDate, o.approvalDate, true)
           && compareDeep(lastReviewDate, o.lastReviewDate, true) && compareDeep(contributor, o.contributor, true)
           && compareDeep(relatedArtifact, o.relatedArtifact, true) && compareDeep(assertion, o.assertion, true)
           && compareDeep(note, o.note, true) && compareDeep(referentGroup, o.referentGroup, true) && compareDeep(variableDefinition, o.variableDefinition, true)
           && compareDeep(synthesisType, o.synthesisType, true) && compareDeep(studyType, o.studyType, true)
           && compareDeep(statistic, o.statistic, true) && compareDeep(distribution, o.distribution, true)
           && compareDeep(certainty, o.certainty, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof Evidence))
          return false;
        Evidence o = (Evidence) other_;
        return compareValues(approvalDate, o.approvalDate, true) && compareValues(lastReviewDate, o.lastReviewDate, true)
           && compareValues(assertion, o.assertion, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, approvalDate, lastReviewDate
          , contributor, relatedArtifact, assertion, note, referentGroup, variableDefinition
          , synthesisType, studyType, statistic, distribution, certainty);
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.Evidence;
   }

 /**
   * Search parameter: <b>date</b>
   * <p>
   * Description: <b>The evidence publication date</b><br>
   * Type: <b>date</b><br>
   * Path: <b>Evidence.date</b><br>
   * </p>
   */
  @SearchParamDefinition(name="date", path="Evidence.date", description="The evidence publication date", type="date" )
  public static final String SP_DATE = "date";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>date</b>
   * <p>
   * Description: <b>The evidence publication date</b><br>
   * Type: <b>date</b><br>
   * Path: <b>Evidence.date</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam DATE = new ca.uhn.fhir.rest.gclient.DateClientParam(SP_DATE);

 /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>External identifier for the evidence</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Evidence.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="identifier", path="Evidence.identifier", description="External identifier for the evidence", type="token" )
  public static final String SP_IDENTIFIER = "identifier";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>External identifier for the evidence</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Evidence.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_IDENTIFIER);

 /**
   * Search parameter: <b>context-quantity</b>
   * <p>
   * Description: <b>A quantity- or range-valued use context assigned to the evidence</b><br>
   * Type: <b>quantity</b><br>
   * Path: <b>Evidence.useContext.valueQuantity, Evidence.useContext.valueRange</b><br>
   * </p>
   */
  @SearchParamDefinition(name="context-quantity", path="(Evidence.useContext.value as Quantity) | (Evidence.useContext.value as Range)", description="A quantity- or range-valued use context assigned to the evidence", type="quantity" )
  public static final String SP_CONTEXT_QUANTITY = "context-quantity";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>context-quantity</b>
   * <p>
   * Description: <b>A quantity- or range-valued use context assigned to the evidence</b><br>
   * Type: <b>quantity</b><br>
   * Path: <b>Evidence.useContext.valueQuantity, Evidence.useContext.valueRange</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.QuantityClientParam CONTEXT_QUANTITY = new ca.uhn.fhir.rest.gclient.QuantityClientParam(SP_CONTEXT_QUANTITY);

 /**
   * Search parameter: <b>context-type-value</b>
   * <p>
   * Description: <b>A use context type and value assigned to the evidence</b><br>
   * Type: <b>composite</b><br>
   * Path: <b></b><br>
   * </p>
   */
  @SearchParamDefinition(name="context-type-value", path="Evidence.useContext", description="A use context type and value assigned to the evidence", type="composite", compositeOf={"context-type", "context"} )
  public static final String SP_CONTEXT_TYPE_VALUE = "context-type-value";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>context-type-value</b>
   * <p>
   * Description: <b>A use context type and value assigned to the evidence</b><br>
   * Type: <b>composite</b><br>
   * Path: <b></b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.TokenClientParam> CONTEXT_TYPE_VALUE = new ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.TokenClientParam>(SP_CONTEXT_TYPE_VALUE);

 /**
   * Search parameter: <b>context</b>
   * <p>
   * Description: <b>A use context assigned to the evidence</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Evidence.useContext.valueCodeableConcept</b><br>
   * </p>
   */
  @SearchParamDefinition(name="context", path="(Evidence.useContext.value as CodeableConcept)", description="A use context assigned to the evidence", type="token" )
  public static final String SP_CONTEXT = "context";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>context</b>
   * <p>
   * Description: <b>A use context assigned to the evidence</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Evidence.useContext.valueCodeableConcept</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CONTEXT = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_CONTEXT);

 /**
   * Search parameter: <b>description</b>
   * <p>
   * Description: <b>The description of the evidence</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Evidence.description</b><br>
   * </p>
   */
  @SearchParamDefinition(name="description", path="Evidence.description", description="The description of the evidence", type="string" )
  public static final String SP_DESCRIPTION = "description";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>description</b>
   * <p>
   * Description: <b>The description of the evidence</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Evidence.description</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam DESCRIPTION = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_DESCRIPTION);

 /**
   * Search parameter: <b>context-type</b>
   * <p>
   * Description: <b>A type of use context assigned to the evidence</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Evidence.useContext.code</b><br>
   * </p>
   */
  @SearchParamDefinition(name="context-type", path="Evidence.useContext.code", description="A type of use context assigned to the evidence", type="token" )
  public static final String SP_CONTEXT_TYPE = "context-type";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>context-type</b>
   * <p>
   * Description: <b>A type of use context assigned to the evidence</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Evidence.useContext.code</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CONTEXT_TYPE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_CONTEXT_TYPE);

 /**
   * Search parameter: <b>title</b>
   * <p>
   * Description: <b>The human-friendly name of the evidence</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Evidence.title</b><br>
   * </p>
   */
  @SearchParamDefinition(name="title", path="Evidence.title", description="The human-friendly name of the evidence", type="string" )
  public static final String SP_TITLE = "title";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>title</b>
   * <p>
   * Description: <b>The human-friendly name of the evidence</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Evidence.title</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam TITLE = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_TITLE);

 /**
   * Search parameter: <b>version</b>
   * <p>
   * Description: <b>The business version of the evidence</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Evidence.version</b><br>
   * </p>
   */
  @SearchParamDefinition(name="version", path="Evidence.version", description="The business version of the evidence", type="token" )
  public static final String SP_VERSION = "version";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>version</b>
   * <p>
   * Description: <b>The business version of the evidence</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Evidence.version</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam VERSION = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_VERSION);

 /**
   * Search parameter: <b>url</b>
   * <p>
   * Description: <b>The uri that identifies the evidence</b><br>
   * Type: <b>uri</b><br>
   * Path: <b>Evidence.url</b><br>
   * </p>
   */
  @SearchParamDefinition(name="url", path="Evidence.url", description="The uri that identifies the evidence", type="uri" )
  public static final String SP_URL = "url";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>url</b>
   * <p>
   * Description: <b>The uri that identifies the evidence</b><br>
   * Type: <b>uri</b><br>
   * Path: <b>Evidence.url</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.UriClientParam URL = new ca.uhn.fhir.rest.gclient.UriClientParam(SP_URL);

 /**
   * Search parameter: <b>context-type-quantity</b>
   * <p>
   * Description: <b>A use context type and quantity- or range-based value assigned to the evidence</b><br>
   * Type: <b>composite</b><br>
   * Path: <b></b><br>
   * </p>
   */
  @SearchParamDefinition(name="context-type-quantity", path="Evidence.useContext", description="A use context type and quantity- or range-based value assigned to the evidence", type="composite", compositeOf={"context-type", "context-quantity"} )
  public static final String SP_CONTEXT_TYPE_QUANTITY = "context-type-quantity";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>context-type-quantity</b>
   * <p>
   * Description: <b>A use context type and quantity- or range-based value assigned to the evidence</b><br>
   * Type: <b>composite</b><br>
   * Path: <b></b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.QuantityClientParam> CONTEXT_TYPE_QUANTITY = new ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.QuantityClientParam>(SP_CONTEXT_TYPE_QUANTITY);

 /**
   * Search parameter: <b>status</b>
   * <p>
   * Description: <b>The current status of the evidence</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Evidence.status</b><br>
   * </p>
   */
  @SearchParamDefinition(name="status", path="Evidence.status", description="The current status of the evidence", type="token" )
  public static final String SP_STATUS = "status";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>status</b>
   * <p>
   * Description: <b>The current status of the evidence</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Evidence.status</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam STATUS = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_STATUS);


}

