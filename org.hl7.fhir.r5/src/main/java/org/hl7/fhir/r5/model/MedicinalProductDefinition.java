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
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.model.api.annotation.SearchParamDefinition;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.ChildOrder;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Block;
/**
 * Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use).
 */
@ResourceDef(name="MedicinalProductDefinition", profile="http://hl7.org/fhir/StructureDefinition/MedicinalProductDefinition")
public class MedicinalProductDefinition extends DomainResource {

    @Block()
    public static class MedicinalProductDefinitionContactComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Allows the contact to be classified, for example QPPV, Pharmacovigilence Enquiry Information.
         */
        @Child(name = "type", type = {CodeableConcept.class}, order=1, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Allows the contact to be classified, for example QPPV, Pharmacovigilence Enquiry Information", formalDefinition="Allows the contact to be classified, for example QPPV, Pharmacovigilence Enquiry Information." )
        protected CodeableConcept type;

        /**
         * A product specific contact, person (in a role), or an organization.
         */
        @Child(name = "contact", type = {Organization.class, PractitionerRole.class}, order=2, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="A product specific contact, person (in a role), or an organization", formalDefinition="A product specific contact, person (in a role), or an organization." )
        protected Reference contact;

        private static final long serialVersionUID = -587616244L;

    /**
     * Constructor
     */
      public MedicinalProductDefinitionContactComponent() {
        super();
      }

    /**
     * Constructor
     */
      public MedicinalProductDefinitionContactComponent(Reference contact) {
        super();
        this.contact = contact;
      }

        /**
         * @return {@link #type} (Allows the contact to be classified, for example QPPV, Pharmacovigilence Enquiry Information.)
         */
        public CodeableConcept getType() { 
          if (this.type == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MedicinalProductDefinitionContactComponent.type");
            else if (Configuration.doAutoCreate())
              this.type = new CodeableConcept(); // cc
          return this.type;
        }

        public boolean hasType() { 
          return this.type != null && !this.type.isEmpty();
        }

        /**
         * @param value {@link #type} (Allows the contact to be classified, for example QPPV, Pharmacovigilence Enquiry Information.)
         */
        public MedicinalProductDefinitionContactComponent setType(CodeableConcept value) { 
          this.type = value;
          return this;
        }

        /**
         * @return {@link #contact} (A product specific contact, person (in a role), or an organization.)
         */
        public Reference getContact() { 
          if (this.contact == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MedicinalProductDefinitionContactComponent.contact");
            else if (Configuration.doAutoCreate())
              this.contact = new Reference(); // cc
          return this.contact;
        }

        public boolean hasContact() { 
          return this.contact != null && !this.contact.isEmpty();
        }

        /**
         * @param value {@link #contact} (A product specific contact, person (in a role), or an organization.)
         */
        public MedicinalProductDefinitionContactComponent setContact(Reference value) { 
          this.contact = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("type", "CodeableConcept", "Allows the contact to be classified, for example QPPV, Pharmacovigilence Enquiry Information.", 0, 1, type));
          children.add(new Property("contact", "Reference(Organization|PractitionerRole)", "A product specific contact, person (in a role), or an organization.", 0, 1, contact));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3575610: /*type*/  return new Property("type", "CodeableConcept", "Allows the contact to be classified, for example QPPV, Pharmacovigilence Enquiry Information.", 0, 1, type);
          case 951526432: /*contact*/  return new Property("contact", "Reference(Organization|PractitionerRole)", "A product specific contact, person (in a role), or an organization.", 0, 1, contact);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // CodeableConcept
        case 951526432: /*contact*/ return this.contact == null ? new Base[0] : new Base[] {this.contact}; // Reference
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3575610: // type
          this.type = castToCodeableConcept(value); // CodeableConcept
          return value;
        case 951526432: // contact
          this.contact = castToReference(value); // Reference
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type")) {
          this.type = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("contact")) {
          this.contact = castToReference(value); // Reference
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3575610:  return getType();
        case 951526432:  return getContact();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3575610: /*type*/ return new String[] {"CodeableConcept"};
        case 951526432: /*contact*/ return new String[] {"Reference"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
          this.type = new CodeableConcept();
          return this.type;
        }
        else if (name.equals("contact")) {
          this.contact = new Reference();
          return this.contact;
        }
        else
          return super.addChild(name);
      }

      public MedicinalProductDefinitionContactComponent copy() {
        MedicinalProductDefinitionContactComponent dst = new MedicinalProductDefinitionContactComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(MedicinalProductDefinitionContactComponent dst) {
        super.copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.contact = contact == null ? null : contact.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof MedicinalProductDefinitionContactComponent))
          return false;
        MedicinalProductDefinitionContactComponent o = (MedicinalProductDefinitionContactComponent) other_;
        return compareDeep(type, o.type, true) && compareDeep(contact, o.contact, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof MedicinalProductDefinitionContactComponent))
          return false;
        MedicinalProductDefinitionContactComponent o = (MedicinalProductDefinitionContactComponent) other_;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(type, contact);
      }

  public String fhirType() {
    return "MedicinalProductDefinition.contact";

  }

  }

    @Block()
    public static class MedicinalProductDefinitionNameComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * The full product name.
         */
        @Child(name = "productName", type = {StringType.class}, order=1, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="The full product name", formalDefinition="The full product name." )
        protected StringType productName;

        /**
         * Type of the product name, such as rINN or BAN.
         */
        @Child(name = "type", type = {Coding.class}, order=2, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Type of the product name, such as rINN or BAN", formalDefinition="Type of the product name, such as rINN or BAN." )
        protected Coding type;

        /**
         * Coding words or phrases of the name.
         */
        @Child(name = "namePart", type = {}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
        @Description(shortDefinition="Coding words or phrases of the name", formalDefinition="Coding words or phrases of the name." )
        protected List<MedicinalProductDefinitionNameNamePartComponent> namePart;

        /**
         * Country where the name applies.
         */
        @Child(name = "countryLanguage", type = {}, order=4, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
        @Description(shortDefinition="Country where the name applies", formalDefinition="Country where the name applies." )
        protected List<MedicinalProductDefinitionNameCountryLanguageComponent> countryLanguage;

        private static final long serialVersionUID = -393861059L;

    /**
     * Constructor
     */
      public MedicinalProductDefinitionNameComponent() {
        super();
      }

    /**
     * Constructor
     */
      public MedicinalProductDefinitionNameComponent(StringType productName) {
        super();
        this.productName = productName;
      }

        /**
         * @return {@link #productName} (The full product name.). This is the underlying object with id, value and extensions. The accessor "getProductName" gives direct access to the value
         */
        public StringType getProductNameElement() { 
          if (this.productName == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MedicinalProductDefinitionNameComponent.productName");
            else if (Configuration.doAutoCreate())
              this.productName = new StringType(); // bb
          return this.productName;
        }

        public boolean hasProductNameElement() { 
          return this.productName != null && !this.productName.isEmpty();
        }

        public boolean hasProductName() { 
          return this.productName != null && !this.productName.isEmpty();
        }

        /**
         * @param value {@link #productName} (The full product name.). This is the underlying object with id, value and extensions. The accessor "getProductName" gives direct access to the value
         */
        public MedicinalProductDefinitionNameComponent setProductNameElement(StringType value) { 
          this.productName = value;
          return this;
        }

        /**
         * @return The full product name.
         */
        public String getProductName() { 
          return this.productName == null ? null : this.productName.getValue();
        }

        /**
         * @param value The full product name.
         */
        public MedicinalProductDefinitionNameComponent setProductName(String value) { 
            if (this.productName == null)
              this.productName = new StringType();
            this.productName.setValue(value);
          return this;
        }

        /**
         * @return {@link #type} (Type of the product name, such as rINN or BAN.)
         */
        public Coding getType() { 
          if (this.type == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MedicinalProductDefinitionNameComponent.type");
            else if (Configuration.doAutoCreate())
              this.type = new Coding(); // cc
          return this.type;
        }

        public boolean hasType() { 
          return this.type != null && !this.type.isEmpty();
        }

        /**
         * @param value {@link #type} (Type of the product name, such as rINN or BAN.)
         */
        public MedicinalProductDefinitionNameComponent setType(Coding value) { 
          this.type = value;
          return this;
        }

        /**
         * @return {@link #namePart} (Coding words or phrases of the name.)
         */
        public List<MedicinalProductDefinitionNameNamePartComponent> getNamePart() { 
          if (this.namePart == null)
            this.namePart = new ArrayList<MedicinalProductDefinitionNameNamePartComponent>();
          return this.namePart;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public MedicinalProductDefinitionNameComponent setNamePart(List<MedicinalProductDefinitionNameNamePartComponent> theNamePart) { 
          this.namePart = theNamePart;
          return this;
        }

        public boolean hasNamePart() { 
          if (this.namePart == null)
            return false;
          for (MedicinalProductDefinitionNameNamePartComponent item : this.namePart)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public MedicinalProductDefinitionNameNamePartComponent addNamePart() { //3
          MedicinalProductDefinitionNameNamePartComponent t = new MedicinalProductDefinitionNameNamePartComponent();
          if (this.namePart == null)
            this.namePart = new ArrayList<MedicinalProductDefinitionNameNamePartComponent>();
          this.namePart.add(t);
          return t;
        }

        public MedicinalProductDefinitionNameComponent addNamePart(MedicinalProductDefinitionNameNamePartComponent t) { //3
          if (t == null)
            return this;
          if (this.namePart == null)
            this.namePart = new ArrayList<MedicinalProductDefinitionNameNamePartComponent>();
          this.namePart.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #namePart}, creating it if it does not already exist
         */
        public MedicinalProductDefinitionNameNamePartComponent getNamePartFirstRep() { 
          if (getNamePart().isEmpty()) {
            addNamePart();
          }
          return getNamePart().get(0);
        }

        /**
         * @return {@link #countryLanguage} (Country where the name applies.)
         */
        public List<MedicinalProductDefinitionNameCountryLanguageComponent> getCountryLanguage() { 
          if (this.countryLanguage == null)
            this.countryLanguage = new ArrayList<MedicinalProductDefinitionNameCountryLanguageComponent>();
          return this.countryLanguage;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public MedicinalProductDefinitionNameComponent setCountryLanguage(List<MedicinalProductDefinitionNameCountryLanguageComponent> theCountryLanguage) { 
          this.countryLanguage = theCountryLanguage;
          return this;
        }

        public boolean hasCountryLanguage() { 
          if (this.countryLanguage == null)
            return false;
          for (MedicinalProductDefinitionNameCountryLanguageComponent item : this.countryLanguage)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public MedicinalProductDefinitionNameCountryLanguageComponent addCountryLanguage() { //3
          MedicinalProductDefinitionNameCountryLanguageComponent t = new MedicinalProductDefinitionNameCountryLanguageComponent();
          if (this.countryLanguage == null)
            this.countryLanguage = new ArrayList<MedicinalProductDefinitionNameCountryLanguageComponent>();
          this.countryLanguage.add(t);
          return t;
        }

        public MedicinalProductDefinitionNameComponent addCountryLanguage(MedicinalProductDefinitionNameCountryLanguageComponent t) { //3
          if (t == null)
            return this;
          if (this.countryLanguage == null)
            this.countryLanguage = new ArrayList<MedicinalProductDefinitionNameCountryLanguageComponent>();
          this.countryLanguage.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #countryLanguage}, creating it if it does not already exist
         */
        public MedicinalProductDefinitionNameCountryLanguageComponent getCountryLanguageFirstRep() { 
          if (getCountryLanguage().isEmpty()) {
            addCountryLanguage();
          }
          return getCountryLanguage().get(0);
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("productName", "string", "The full product name.", 0, 1, productName));
          children.add(new Property("type", "Coding", "Type of the product name, such as rINN or BAN.", 0, 1, type));
          children.add(new Property("namePart", "", "Coding words or phrases of the name.", 0, java.lang.Integer.MAX_VALUE, namePart));
          children.add(new Property("countryLanguage", "", "Country where the name applies.", 0, java.lang.Integer.MAX_VALUE, countryLanguage));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -1491817446: /*productName*/  return new Property("productName", "string", "The full product name.", 0, 1, productName);
          case 3575610: /*type*/  return new Property("type", "Coding", "Type of the product name, such as rINN or BAN.", 0, 1, type);
          case 1840452894: /*namePart*/  return new Property("namePart", "", "Coding words or phrases of the name.", 0, java.lang.Integer.MAX_VALUE, namePart);
          case -141141746: /*countryLanguage*/  return new Property("countryLanguage", "", "Country where the name applies.", 0, java.lang.Integer.MAX_VALUE, countryLanguage);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1491817446: /*productName*/ return this.productName == null ? new Base[0] : new Base[] {this.productName}; // StringType
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // Coding
        case 1840452894: /*namePart*/ return this.namePart == null ? new Base[0] : this.namePart.toArray(new Base[this.namePart.size()]); // MedicinalProductDefinitionNameNamePartComponent
        case -141141746: /*countryLanguage*/ return this.countryLanguage == null ? new Base[0] : this.countryLanguage.toArray(new Base[this.countryLanguage.size()]); // MedicinalProductDefinitionNameCountryLanguageComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1491817446: // productName
          this.productName = castToString(value); // StringType
          return value;
        case 3575610: // type
          this.type = castToCoding(value); // Coding
          return value;
        case 1840452894: // namePart
          this.getNamePart().add((MedicinalProductDefinitionNameNamePartComponent) value); // MedicinalProductDefinitionNameNamePartComponent
          return value;
        case -141141746: // countryLanguage
          this.getCountryLanguage().add((MedicinalProductDefinitionNameCountryLanguageComponent) value); // MedicinalProductDefinitionNameCountryLanguageComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("productName")) {
          this.productName = castToString(value); // StringType
        } else if (name.equals("type")) {
          this.type = castToCoding(value); // Coding
        } else if (name.equals("namePart")) {
          this.getNamePart().add((MedicinalProductDefinitionNameNamePartComponent) value);
        } else if (name.equals("countryLanguage")) {
          this.getCountryLanguage().add((MedicinalProductDefinitionNameCountryLanguageComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1491817446:  return getProductNameElement();
        case 3575610:  return getType();
        case 1840452894:  return addNamePart(); 
        case -141141746:  return addCountryLanguage(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1491817446: /*productName*/ return new String[] {"string"};
        case 3575610: /*type*/ return new String[] {"Coding"};
        case 1840452894: /*namePart*/ return new String[] {};
        case -141141746: /*countryLanguage*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("productName")) {
          throw new FHIRException("Cannot call addChild on a primitive type MedicinalProductDefinition.productName");
        }
        else if (name.equals("type")) {
          this.type = new Coding();
          return this.type;
        }
        else if (name.equals("namePart")) {
          return addNamePart();
        }
        else if (name.equals("countryLanguage")) {
          return addCountryLanguage();
        }
        else
          return super.addChild(name);
      }

      public MedicinalProductDefinitionNameComponent copy() {
        MedicinalProductDefinitionNameComponent dst = new MedicinalProductDefinitionNameComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(MedicinalProductDefinitionNameComponent dst) {
        super.copyValues(dst);
        dst.productName = productName == null ? null : productName.copy();
        dst.type = type == null ? null : type.copy();
        if (namePart != null) {
          dst.namePart = new ArrayList<MedicinalProductDefinitionNameNamePartComponent>();
          for (MedicinalProductDefinitionNameNamePartComponent i : namePart)
            dst.namePart.add(i.copy());
        };
        if (countryLanguage != null) {
          dst.countryLanguage = new ArrayList<MedicinalProductDefinitionNameCountryLanguageComponent>();
          for (MedicinalProductDefinitionNameCountryLanguageComponent i : countryLanguage)
            dst.countryLanguage.add(i.copy());
        };
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof MedicinalProductDefinitionNameComponent))
          return false;
        MedicinalProductDefinitionNameComponent o = (MedicinalProductDefinitionNameComponent) other_;
        return compareDeep(productName, o.productName, true) && compareDeep(type, o.type, true) && compareDeep(namePart, o.namePart, true)
           && compareDeep(countryLanguage, o.countryLanguage, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof MedicinalProductDefinitionNameComponent))
          return false;
        MedicinalProductDefinitionNameComponent o = (MedicinalProductDefinitionNameComponent) other_;
        return compareValues(productName, o.productName, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(productName, type, namePart
          , countryLanguage);
      }

  public String fhirType() {
    return "MedicinalProductDefinition.name";

  }

  }

    @Block()
    public static class MedicinalProductDefinitionNameNamePartComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * A fragment of a product name.
         */
        @Child(name = "part", type = {StringType.class}, order=1, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="A fragment of a product name", formalDefinition="A fragment of a product name." )
        protected StringType part;

        /**
         * Idenifying type for this part of the name (e.g. strength part).
         */
        @Child(name = "type", type = {Coding.class}, order=2, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Idenifying type for this part of the name (e.g. strength part)", formalDefinition="Idenifying type for this part of the name (e.g. strength part)." )
        protected Coding type;

        private static final long serialVersionUID = -301533796L;

    /**
     * Constructor
     */
      public MedicinalProductDefinitionNameNamePartComponent() {
        super();
      }

    /**
     * Constructor
     */
      public MedicinalProductDefinitionNameNamePartComponent(StringType part, Coding type) {
        super();
        this.part = part;
        this.type = type;
      }

        /**
         * @return {@link #part} (A fragment of a product name.). This is the underlying object with id, value and extensions. The accessor "getPart" gives direct access to the value
         */
        public StringType getPartElement() { 
          if (this.part == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MedicinalProductDefinitionNameNamePartComponent.part");
            else if (Configuration.doAutoCreate())
              this.part = new StringType(); // bb
          return this.part;
        }

        public boolean hasPartElement() { 
          return this.part != null && !this.part.isEmpty();
        }

        public boolean hasPart() { 
          return this.part != null && !this.part.isEmpty();
        }

        /**
         * @param value {@link #part} (A fragment of a product name.). This is the underlying object with id, value and extensions. The accessor "getPart" gives direct access to the value
         */
        public MedicinalProductDefinitionNameNamePartComponent setPartElement(StringType value) { 
          this.part = value;
          return this;
        }

        /**
         * @return A fragment of a product name.
         */
        public String getPart() { 
          return this.part == null ? null : this.part.getValue();
        }

        /**
         * @param value A fragment of a product name.
         */
        public MedicinalProductDefinitionNameNamePartComponent setPart(String value) { 
            if (this.part == null)
              this.part = new StringType();
            this.part.setValue(value);
          return this;
        }

        /**
         * @return {@link #type} (Idenifying type for this part of the name (e.g. strength part).)
         */
        public Coding getType() { 
          if (this.type == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MedicinalProductDefinitionNameNamePartComponent.type");
            else if (Configuration.doAutoCreate())
              this.type = new Coding(); // cc
          return this.type;
        }

        public boolean hasType() { 
          return this.type != null && !this.type.isEmpty();
        }

        /**
         * @param value {@link #type} (Idenifying type for this part of the name (e.g. strength part).)
         */
        public MedicinalProductDefinitionNameNamePartComponent setType(Coding value) { 
          this.type = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("part", "string", "A fragment of a product name.", 0, 1, part));
          children.add(new Property("type", "Coding", "Idenifying type for this part of the name (e.g. strength part).", 0, 1, type));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3433459: /*part*/  return new Property("part", "string", "A fragment of a product name.", 0, 1, part);
          case 3575610: /*type*/  return new Property("type", "Coding", "Idenifying type for this part of the name (e.g. strength part).", 0, 1, type);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3433459: /*part*/ return this.part == null ? new Base[0] : new Base[] {this.part}; // StringType
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // Coding
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3433459: // part
          this.part = castToString(value); // StringType
          return value;
        case 3575610: // type
          this.type = castToCoding(value); // Coding
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("part")) {
          this.part = castToString(value); // StringType
        } else if (name.equals("type")) {
          this.type = castToCoding(value); // Coding
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3433459:  return getPartElement();
        case 3575610:  return getType();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3433459: /*part*/ return new String[] {"string"};
        case 3575610: /*type*/ return new String[] {"Coding"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("part")) {
          throw new FHIRException("Cannot call addChild on a primitive type MedicinalProductDefinition.part");
        }
        else if (name.equals("type")) {
          this.type = new Coding();
          return this.type;
        }
        else
          return super.addChild(name);
      }

      public MedicinalProductDefinitionNameNamePartComponent copy() {
        MedicinalProductDefinitionNameNamePartComponent dst = new MedicinalProductDefinitionNameNamePartComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(MedicinalProductDefinitionNameNamePartComponent dst) {
        super.copyValues(dst);
        dst.part = part == null ? null : part.copy();
        dst.type = type == null ? null : type.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof MedicinalProductDefinitionNameNamePartComponent))
          return false;
        MedicinalProductDefinitionNameNamePartComponent o = (MedicinalProductDefinitionNameNamePartComponent) other_;
        return compareDeep(part, o.part, true) && compareDeep(type, o.type, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof MedicinalProductDefinitionNameNamePartComponent))
          return false;
        MedicinalProductDefinitionNameNamePartComponent o = (MedicinalProductDefinitionNameNamePartComponent) other_;
        return compareValues(part, o.part, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(part, type);
      }

  public String fhirType() {
    return "MedicinalProductDefinition.name.namePart";

  }

  }

    @Block()
    public static class MedicinalProductDefinitionNameCountryLanguageComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Country code for where this name applies.
         */
        @Child(name = "country", type = {CodeableConcept.class}, order=1, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Country code for where this name applies", formalDefinition="Country code for where this name applies." )
        protected CodeableConcept country;

        /**
         * Jurisdiction code for where this name applies.
         */
        @Child(name = "jurisdiction", type = {CodeableConcept.class}, order=2, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Jurisdiction code for where this name applies", formalDefinition="Jurisdiction code for where this name applies." )
        protected CodeableConcept jurisdiction;

        /**
         * Language code for this name.
         */
        @Child(name = "language", type = {CodeableConcept.class}, order=3, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Language code for this name", formalDefinition="Language code for this name." )
        protected CodeableConcept language;

        private static final long serialVersionUID = 1627157564L;

    /**
     * Constructor
     */
      public MedicinalProductDefinitionNameCountryLanguageComponent() {
        super();
      }

    /**
     * Constructor
     */
      public MedicinalProductDefinitionNameCountryLanguageComponent(CodeableConcept country, CodeableConcept language) {
        super();
        this.country = country;
        this.language = language;
      }

        /**
         * @return {@link #country} (Country code for where this name applies.)
         */
        public CodeableConcept getCountry() { 
          if (this.country == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MedicinalProductDefinitionNameCountryLanguageComponent.country");
            else if (Configuration.doAutoCreate())
              this.country = new CodeableConcept(); // cc
          return this.country;
        }

        public boolean hasCountry() { 
          return this.country != null && !this.country.isEmpty();
        }

        /**
         * @param value {@link #country} (Country code for where this name applies.)
         */
        public MedicinalProductDefinitionNameCountryLanguageComponent setCountry(CodeableConcept value) { 
          this.country = value;
          return this;
        }

        /**
         * @return {@link #jurisdiction} (Jurisdiction code for where this name applies.)
         */
        public CodeableConcept getJurisdiction() { 
          if (this.jurisdiction == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MedicinalProductDefinitionNameCountryLanguageComponent.jurisdiction");
            else if (Configuration.doAutoCreate())
              this.jurisdiction = new CodeableConcept(); // cc
          return this.jurisdiction;
        }

        public boolean hasJurisdiction() { 
          return this.jurisdiction != null && !this.jurisdiction.isEmpty();
        }

        /**
         * @param value {@link #jurisdiction} (Jurisdiction code for where this name applies.)
         */
        public MedicinalProductDefinitionNameCountryLanguageComponent setJurisdiction(CodeableConcept value) { 
          this.jurisdiction = value;
          return this;
        }

        /**
         * @return {@link #language} (Language code for this name.)
         */
        public CodeableConcept getLanguage() { 
          if (this.language == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MedicinalProductDefinitionNameCountryLanguageComponent.language");
            else if (Configuration.doAutoCreate())
              this.language = new CodeableConcept(); // cc
          return this.language;
        }

        public boolean hasLanguage() { 
          return this.language != null && !this.language.isEmpty();
        }

        /**
         * @param value {@link #language} (Language code for this name.)
         */
        public MedicinalProductDefinitionNameCountryLanguageComponent setLanguage(CodeableConcept value) { 
          this.language = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("country", "CodeableConcept", "Country code for where this name applies.", 0, 1, country));
          children.add(new Property("jurisdiction", "CodeableConcept", "Jurisdiction code for where this name applies.", 0, 1, jurisdiction));
          children.add(new Property("language", "CodeableConcept", "Language code for this name.", 0, 1, language));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 957831062: /*country*/  return new Property("country", "CodeableConcept", "Country code for where this name applies.", 0, 1, country);
          case -507075711: /*jurisdiction*/  return new Property("jurisdiction", "CodeableConcept", "Jurisdiction code for where this name applies.", 0, 1, jurisdiction);
          case -1613589672: /*language*/  return new Property("language", "CodeableConcept", "Language code for this name.", 0, 1, language);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 957831062: /*country*/ return this.country == null ? new Base[0] : new Base[] {this.country}; // CodeableConcept
        case -507075711: /*jurisdiction*/ return this.jurisdiction == null ? new Base[0] : new Base[] {this.jurisdiction}; // CodeableConcept
        case -1613589672: /*language*/ return this.language == null ? new Base[0] : new Base[] {this.language}; // CodeableConcept
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 957831062: // country
          this.country = castToCodeableConcept(value); // CodeableConcept
          return value;
        case -507075711: // jurisdiction
          this.jurisdiction = castToCodeableConcept(value); // CodeableConcept
          return value;
        case -1613589672: // language
          this.language = castToCodeableConcept(value); // CodeableConcept
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("country")) {
          this.country = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("jurisdiction")) {
          this.jurisdiction = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("language")) {
          this.language = castToCodeableConcept(value); // CodeableConcept
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 957831062:  return getCountry();
        case -507075711:  return getJurisdiction();
        case -1613589672:  return getLanguage();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 957831062: /*country*/ return new String[] {"CodeableConcept"};
        case -507075711: /*jurisdiction*/ return new String[] {"CodeableConcept"};
        case -1613589672: /*language*/ return new String[] {"CodeableConcept"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("country")) {
          this.country = new CodeableConcept();
          return this.country;
        }
        else if (name.equals("jurisdiction")) {
          this.jurisdiction = new CodeableConcept();
          return this.jurisdiction;
        }
        else if (name.equals("language")) {
          this.language = new CodeableConcept();
          return this.language;
        }
        else
          return super.addChild(name);
      }

      public MedicinalProductDefinitionNameCountryLanguageComponent copy() {
        MedicinalProductDefinitionNameCountryLanguageComponent dst = new MedicinalProductDefinitionNameCountryLanguageComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(MedicinalProductDefinitionNameCountryLanguageComponent dst) {
        super.copyValues(dst);
        dst.country = country == null ? null : country.copy();
        dst.jurisdiction = jurisdiction == null ? null : jurisdiction.copy();
        dst.language = language == null ? null : language.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof MedicinalProductDefinitionNameCountryLanguageComponent))
          return false;
        MedicinalProductDefinitionNameCountryLanguageComponent o = (MedicinalProductDefinitionNameCountryLanguageComponent) other_;
        return compareDeep(country, o.country, true) && compareDeep(jurisdiction, o.jurisdiction, true)
           && compareDeep(language, o.language, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof MedicinalProductDefinitionNameCountryLanguageComponent))
          return false;
        MedicinalProductDefinitionNameCountryLanguageComponent o = (MedicinalProductDefinitionNameCountryLanguageComponent) other_;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(country, jurisdiction, language
          );
      }

  public String fhirType() {
    return "MedicinalProductDefinition.name.countryLanguage";

  }

  }

    @Block()
    public static class MedicinalProductDefinitionManufacturingBusinessOperationComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * The type of manufacturing operation e.g. manufacturing itself, re-packaging.
         */
        @Child(name = "operationType", type = {CodeableConcept.class}, order=1, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="The type of manufacturing operation e.g. manufacturing itself, re-packaging", formalDefinition="The type of manufacturing operation e.g. manufacturing itself, re-packaging." )
        protected CodeableConcept operationType;

        /**
         * Regulatory authorization reference number.
         */
        @Child(name = "authorisationReferenceNumber", type = {Identifier.class}, order=2, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Regulatory authorization reference number", formalDefinition="Regulatory authorization reference number." )
        protected Identifier authorisationReferenceNumber;

        /**
         * Regulatory authorization date.
         */
        @Child(name = "effectiveDate", type = {Period.class}, order=3, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Regulatory authorization date", formalDefinition="Regulatory authorization date." )
        protected Period effectiveDate;

        /**
         * To indicate if this proces is commercially confidential.
         */
        @Child(name = "confidentialityIndicator", type = {CodeableConcept.class}, order=4, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="To indicate if this proces is commercially confidential", formalDefinition="To indicate if this proces is commercially confidential." )
        protected CodeableConcept confidentialityIndicator;

        /**
         * The manufacturer or establishment associated with the process.
         */
        @Child(name = "manufacturer", type = {Organization.class}, order=5, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
        @Description(shortDefinition="The manufacturer or establishment associated with the process", formalDefinition="The manufacturer or establishment associated with the process." )
        protected List<Reference> manufacturer;

        /**
         * A regulator which oversees the operation.
         */
        @Child(name = "regulator", type = {Organization.class}, order=6, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="A regulator which oversees the operation", formalDefinition="A regulator which oversees the operation." )
        protected Reference regulator;

        private static final long serialVersionUID = -268651569L;

    /**
     * Constructor
     */
      public MedicinalProductDefinitionManufacturingBusinessOperationComponent() {
        super();
      }

        /**
         * @return {@link #operationType} (The type of manufacturing operation e.g. manufacturing itself, re-packaging.)
         */
        public CodeableConcept getOperationType() { 
          if (this.operationType == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MedicinalProductDefinitionManufacturingBusinessOperationComponent.operationType");
            else if (Configuration.doAutoCreate())
              this.operationType = new CodeableConcept(); // cc
          return this.operationType;
        }

        public boolean hasOperationType() { 
          return this.operationType != null && !this.operationType.isEmpty();
        }

        /**
         * @param value {@link #operationType} (The type of manufacturing operation e.g. manufacturing itself, re-packaging.)
         */
        public MedicinalProductDefinitionManufacturingBusinessOperationComponent setOperationType(CodeableConcept value) { 
          this.operationType = value;
          return this;
        }

        /**
         * @return {@link #authorisationReferenceNumber} (Regulatory authorization reference number.)
         */
        public Identifier getAuthorisationReferenceNumber() { 
          if (this.authorisationReferenceNumber == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MedicinalProductDefinitionManufacturingBusinessOperationComponent.authorisationReferenceNumber");
            else if (Configuration.doAutoCreate())
              this.authorisationReferenceNumber = new Identifier(); // cc
          return this.authorisationReferenceNumber;
        }

        public boolean hasAuthorisationReferenceNumber() { 
          return this.authorisationReferenceNumber != null && !this.authorisationReferenceNumber.isEmpty();
        }

        /**
         * @param value {@link #authorisationReferenceNumber} (Regulatory authorization reference number.)
         */
        public MedicinalProductDefinitionManufacturingBusinessOperationComponent setAuthorisationReferenceNumber(Identifier value) { 
          this.authorisationReferenceNumber = value;
          return this;
        }

        /**
         * @return {@link #effectiveDate} (Regulatory authorization date.)
         */
        public Period getEffectiveDate() { 
          if (this.effectiveDate == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MedicinalProductDefinitionManufacturingBusinessOperationComponent.effectiveDate");
            else if (Configuration.doAutoCreate())
              this.effectiveDate = new Period(); // cc
          return this.effectiveDate;
        }

        public boolean hasEffectiveDate() { 
          return this.effectiveDate != null && !this.effectiveDate.isEmpty();
        }

        /**
         * @param value {@link #effectiveDate} (Regulatory authorization date.)
         */
        public MedicinalProductDefinitionManufacturingBusinessOperationComponent setEffectiveDate(Period value) { 
          this.effectiveDate = value;
          return this;
        }

        /**
         * @return {@link #confidentialityIndicator} (To indicate if this proces is commercially confidential.)
         */
        public CodeableConcept getConfidentialityIndicator() { 
          if (this.confidentialityIndicator == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MedicinalProductDefinitionManufacturingBusinessOperationComponent.confidentialityIndicator");
            else if (Configuration.doAutoCreate())
              this.confidentialityIndicator = new CodeableConcept(); // cc
          return this.confidentialityIndicator;
        }

        public boolean hasConfidentialityIndicator() { 
          return this.confidentialityIndicator != null && !this.confidentialityIndicator.isEmpty();
        }

        /**
         * @param value {@link #confidentialityIndicator} (To indicate if this proces is commercially confidential.)
         */
        public MedicinalProductDefinitionManufacturingBusinessOperationComponent setConfidentialityIndicator(CodeableConcept value) { 
          this.confidentialityIndicator = value;
          return this;
        }

        /**
         * @return {@link #manufacturer} (The manufacturer or establishment associated with the process.)
         */
        public List<Reference> getManufacturer() { 
          if (this.manufacturer == null)
            this.manufacturer = new ArrayList<Reference>();
          return this.manufacturer;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public MedicinalProductDefinitionManufacturingBusinessOperationComponent setManufacturer(List<Reference> theManufacturer) { 
          this.manufacturer = theManufacturer;
          return this;
        }

        public boolean hasManufacturer() { 
          if (this.manufacturer == null)
            return false;
          for (Reference item : this.manufacturer)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Reference addManufacturer() { //3
          Reference t = new Reference();
          if (this.manufacturer == null)
            this.manufacturer = new ArrayList<Reference>();
          this.manufacturer.add(t);
          return t;
        }

        public MedicinalProductDefinitionManufacturingBusinessOperationComponent addManufacturer(Reference t) { //3
          if (t == null)
            return this;
          if (this.manufacturer == null)
            this.manufacturer = new ArrayList<Reference>();
          this.manufacturer.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #manufacturer}, creating it if it does not already exist
         */
        public Reference getManufacturerFirstRep() { 
          if (getManufacturer().isEmpty()) {
            addManufacturer();
          }
          return getManufacturer().get(0);
        }

        /**
         * @return {@link #regulator} (A regulator which oversees the operation.)
         */
        public Reference getRegulator() { 
          if (this.regulator == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MedicinalProductDefinitionManufacturingBusinessOperationComponent.regulator");
            else if (Configuration.doAutoCreate())
              this.regulator = new Reference(); // cc
          return this.regulator;
        }

        public boolean hasRegulator() { 
          return this.regulator != null && !this.regulator.isEmpty();
        }

        /**
         * @param value {@link #regulator} (A regulator which oversees the operation.)
         */
        public MedicinalProductDefinitionManufacturingBusinessOperationComponent setRegulator(Reference value) { 
          this.regulator = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("operationType", "CodeableConcept", "The type of manufacturing operation e.g. manufacturing itself, re-packaging.", 0, 1, operationType));
          children.add(new Property("authorisationReferenceNumber", "Identifier", "Regulatory authorization reference number.", 0, 1, authorisationReferenceNumber));
          children.add(new Property("effectiveDate", "Period", "Regulatory authorization date.", 0, 1, effectiveDate));
          children.add(new Property("confidentialityIndicator", "CodeableConcept", "To indicate if this proces is commercially confidential.", 0, 1, confidentialityIndicator));
          children.add(new Property("manufacturer", "Reference(Organization)", "The manufacturer or establishment associated with the process.", 0, java.lang.Integer.MAX_VALUE, manufacturer));
          children.add(new Property("regulator", "Reference(Organization)", "A regulator which oversees the operation.", 0, 1, regulator));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 91999553: /*operationType*/  return new Property("operationType", "CodeableConcept", "The type of manufacturing operation e.g. manufacturing itself, re-packaging.", 0, 1, operationType);
          case -1940839884: /*authorisationReferenceNumber*/  return new Property("authorisationReferenceNumber", "Identifier", "Regulatory authorization reference number.", 0, 1, authorisationReferenceNumber);
          case -930389515: /*effectiveDate*/  return new Property("effectiveDate", "Period", "Regulatory authorization date.", 0, 1, effectiveDate);
          case -1449404791: /*confidentialityIndicator*/  return new Property("confidentialityIndicator", "CodeableConcept", "To indicate if this proces is commercially confidential.", 0, 1, confidentialityIndicator);
          case -1969347631: /*manufacturer*/  return new Property("manufacturer", "Reference(Organization)", "The manufacturer or establishment associated with the process.", 0, java.lang.Integer.MAX_VALUE, manufacturer);
          case 414760449: /*regulator*/  return new Property("regulator", "Reference(Organization)", "A regulator which oversees the operation.", 0, 1, regulator);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 91999553: /*operationType*/ return this.operationType == null ? new Base[0] : new Base[] {this.operationType}; // CodeableConcept
        case -1940839884: /*authorisationReferenceNumber*/ return this.authorisationReferenceNumber == null ? new Base[0] : new Base[] {this.authorisationReferenceNumber}; // Identifier
        case -930389515: /*effectiveDate*/ return this.effectiveDate == null ? new Base[0] : new Base[] {this.effectiveDate}; // Period
        case -1449404791: /*confidentialityIndicator*/ return this.confidentialityIndicator == null ? new Base[0] : new Base[] {this.confidentialityIndicator}; // CodeableConcept
        case -1969347631: /*manufacturer*/ return this.manufacturer == null ? new Base[0] : this.manufacturer.toArray(new Base[this.manufacturer.size()]); // Reference
        case 414760449: /*regulator*/ return this.regulator == null ? new Base[0] : new Base[] {this.regulator}; // Reference
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 91999553: // operationType
          this.operationType = castToCodeableConcept(value); // CodeableConcept
          return value;
        case -1940839884: // authorisationReferenceNumber
          this.authorisationReferenceNumber = castToIdentifier(value); // Identifier
          return value;
        case -930389515: // effectiveDate
          this.effectiveDate = castToPeriod(value); // Period
          return value;
        case -1449404791: // confidentialityIndicator
          this.confidentialityIndicator = castToCodeableConcept(value); // CodeableConcept
          return value;
        case -1969347631: // manufacturer
          this.getManufacturer().add(castToReference(value)); // Reference
          return value;
        case 414760449: // regulator
          this.regulator = castToReference(value); // Reference
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("operationType")) {
          this.operationType = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("authorisationReferenceNumber")) {
          this.authorisationReferenceNumber = castToIdentifier(value); // Identifier
        } else if (name.equals("effectiveDate")) {
          this.effectiveDate = castToPeriod(value); // Period
        } else if (name.equals("confidentialityIndicator")) {
          this.confidentialityIndicator = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("manufacturer")) {
          this.getManufacturer().add(castToReference(value));
        } else if (name.equals("regulator")) {
          this.regulator = castToReference(value); // Reference
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 91999553:  return getOperationType();
        case -1940839884:  return getAuthorisationReferenceNumber();
        case -930389515:  return getEffectiveDate();
        case -1449404791:  return getConfidentialityIndicator();
        case -1969347631:  return addManufacturer(); 
        case 414760449:  return getRegulator();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 91999553: /*operationType*/ return new String[] {"CodeableConcept"};
        case -1940839884: /*authorisationReferenceNumber*/ return new String[] {"Identifier"};
        case -930389515: /*effectiveDate*/ return new String[] {"Period"};
        case -1449404791: /*confidentialityIndicator*/ return new String[] {"CodeableConcept"};
        case -1969347631: /*manufacturer*/ return new String[] {"Reference"};
        case 414760449: /*regulator*/ return new String[] {"Reference"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("operationType")) {
          this.operationType = new CodeableConcept();
          return this.operationType;
        }
        else if (name.equals("authorisationReferenceNumber")) {
          this.authorisationReferenceNumber = new Identifier();
          return this.authorisationReferenceNumber;
        }
        else if (name.equals("effectiveDate")) {
          this.effectiveDate = new Period();
          return this.effectiveDate;
        }
        else if (name.equals("confidentialityIndicator")) {
          this.confidentialityIndicator = new CodeableConcept();
          return this.confidentialityIndicator;
        }
        else if (name.equals("manufacturer")) {
          return addManufacturer();
        }
        else if (name.equals("regulator")) {
          this.regulator = new Reference();
          return this.regulator;
        }
        else
          return super.addChild(name);
      }

      public MedicinalProductDefinitionManufacturingBusinessOperationComponent copy() {
        MedicinalProductDefinitionManufacturingBusinessOperationComponent dst = new MedicinalProductDefinitionManufacturingBusinessOperationComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(MedicinalProductDefinitionManufacturingBusinessOperationComponent dst) {
        super.copyValues(dst);
        dst.operationType = operationType == null ? null : operationType.copy();
        dst.authorisationReferenceNumber = authorisationReferenceNumber == null ? null : authorisationReferenceNumber.copy();
        dst.effectiveDate = effectiveDate == null ? null : effectiveDate.copy();
        dst.confidentialityIndicator = confidentialityIndicator == null ? null : confidentialityIndicator.copy();
        if (manufacturer != null) {
          dst.manufacturer = new ArrayList<Reference>();
          for (Reference i : manufacturer)
            dst.manufacturer.add(i.copy());
        };
        dst.regulator = regulator == null ? null : regulator.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof MedicinalProductDefinitionManufacturingBusinessOperationComponent))
          return false;
        MedicinalProductDefinitionManufacturingBusinessOperationComponent o = (MedicinalProductDefinitionManufacturingBusinessOperationComponent) other_;
        return compareDeep(operationType, o.operationType, true) && compareDeep(authorisationReferenceNumber, o.authorisationReferenceNumber, true)
           && compareDeep(effectiveDate, o.effectiveDate, true) && compareDeep(confidentialityIndicator, o.confidentialityIndicator, true)
           && compareDeep(manufacturer, o.manufacturer, true) && compareDeep(regulator, o.regulator, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof MedicinalProductDefinitionManufacturingBusinessOperationComponent))
          return false;
        MedicinalProductDefinitionManufacturingBusinessOperationComponent o = (MedicinalProductDefinitionManufacturingBusinessOperationComponent) other_;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(operationType, authorisationReferenceNumber
          , effectiveDate, confidentialityIndicator, manufacturer, regulator);
      }

  public String fhirType() {
    return "MedicinalProductDefinition.manufacturingBusinessOperation";

  }

  }

    @Block()
    public static class MedicinalProductDefinitionSpecialDesignationComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Identifier for the designation, or procedure number.
         */
        @Child(name = "identifier", type = {Identifier.class}, order=1, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
        @Description(shortDefinition="Identifier for the designation, or procedure number", formalDefinition="Identifier for the designation, or procedure number." )
        protected List<Identifier> identifier;

        /**
         * The type of special designation, e.g. orphan drug, minor use.
         */
        @Child(name = "type", type = {CodeableConcept.class}, order=2, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="The type of special designation, e.g. orphan drug, minor use", formalDefinition="The type of special designation, e.g. orphan drug, minor use." )
        protected CodeableConcept type;

        /**
         * The intended use of the product, e.g. prevention, treatment.
         */
        @Child(name = "intendedUse", type = {CodeableConcept.class}, order=3, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="The intended use of the product, e.g. prevention, treatment", formalDefinition="The intended use of the product, e.g. prevention, treatment." )
        protected CodeableConcept intendedUse;

        /**
         * Condition for which the medicinal use applies.
         */
        @Child(name = "indication", type = {CodeableConcept.class, ClinicalUseIssue.class}, order=4, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Condition for which the medicinal use applies", formalDefinition="Condition for which the medicinal use applies." )
        protected Type indication;

        /**
         * For example granted, pending, expired or withdrawn.
         */
        @Child(name = "status", type = {CodeableConcept.class}, order=5, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="For example granted, pending, expired or withdrawn", formalDefinition="For example granted, pending, expired or withdrawn." )
        protected CodeableConcept status;

        /**
         * Date when the designation was granted.
         */
        @Child(name = "date", type = {DateTimeType.class}, order=6, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Date when the designation was granted", formalDefinition="Date when the designation was granted." )
        protected DateTimeType date;

        /**
         * Animal species for which this applies.
         */
        @Child(name = "species", type = {CodeableConcept.class}, order=7, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Animal species for which this applies", formalDefinition="Animal species for which this applies." )
        protected CodeableConcept species;

        private static final long serialVersionUID = -1316809207L;

    /**
     * Constructor
     */
      public MedicinalProductDefinitionSpecialDesignationComponent() {
        super();
      }

        /**
         * @return {@link #identifier} (Identifier for the designation, or procedure number.)
         */
        public List<Identifier> getIdentifier() { 
          if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
          return this.identifier;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public MedicinalProductDefinitionSpecialDesignationComponent setIdentifier(List<Identifier> theIdentifier) { 
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

        public MedicinalProductDefinitionSpecialDesignationComponent addIdentifier(Identifier t) { //3
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
         * @return {@link #type} (The type of special designation, e.g. orphan drug, minor use.)
         */
        public CodeableConcept getType() { 
          if (this.type == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MedicinalProductDefinitionSpecialDesignationComponent.type");
            else if (Configuration.doAutoCreate())
              this.type = new CodeableConcept(); // cc
          return this.type;
        }

        public boolean hasType() { 
          return this.type != null && !this.type.isEmpty();
        }

        /**
         * @param value {@link #type} (The type of special designation, e.g. orphan drug, minor use.)
         */
        public MedicinalProductDefinitionSpecialDesignationComponent setType(CodeableConcept value) { 
          this.type = value;
          return this;
        }

        /**
         * @return {@link #intendedUse} (The intended use of the product, e.g. prevention, treatment.)
         */
        public CodeableConcept getIntendedUse() { 
          if (this.intendedUse == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MedicinalProductDefinitionSpecialDesignationComponent.intendedUse");
            else if (Configuration.doAutoCreate())
              this.intendedUse = new CodeableConcept(); // cc
          return this.intendedUse;
        }

        public boolean hasIntendedUse() { 
          return this.intendedUse != null && !this.intendedUse.isEmpty();
        }

        /**
         * @param value {@link #intendedUse} (The intended use of the product, e.g. prevention, treatment.)
         */
        public MedicinalProductDefinitionSpecialDesignationComponent setIntendedUse(CodeableConcept value) { 
          this.intendedUse = value;
          return this;
        }

        /**
         * @return {@link #indication} (Condition for which the medicinal use applies.)
         */
        public Type getIndication() { 
          return this.indication;
        }

        /**
         * @return {@link #indication} (Condition for which the medicinal use applies.)
         */
        public CodeableConcept getIndicationCodeableConcept() throws FHIRException { 
          if (this.indication == null)
            this.indication = new CodeableConcept();
          if (!(this.indication instanceof CodeableConcept))
            throw new FHIRException("Type mismatch: the type CodeableConcept was expected, but "+this.indication.getClass().getName()+" was encountered");
          return (CodeableConcept) this.indication;
        }

        public boolean hasIndicationCodeableConcept() { 
          return this != null && this.indication instanceof CodeableConcept;
        }

        /**
         * @return {@link #indication} (Condition for which the medicinal use applies.)
         */
        public Reference getIndicationReference() throws FHIRException { 
          if (this.indication == null)
            this.indication = new Reference();
          if (!(this.indication instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but "+this.indication.getClass().getName()+" was encountered");
          return (Reference) this.indication;
        }

        public boolean hasIndicationReference() { 
          return this != null && this.indication instanceof Reference;
        }

        public boolean hasIndication() { 
          return this.indication != null && !this.indication.isEmpty();
        }

        /**
         * @param value {@link #indication} (Condition for which the medicinal use applies.)
         */
        public MedicinalProductDefinitionSpecialDesignationComponent setIndication(Type value) { 
          if (value != null && !(value instanceof CodeableConcept || value instanceof Reference))
            throw new Error("Not the right type for MedicinalProductDefinition.specialDesignation.indication[x]: "+value.fhirType());
          this.indication = value;
          return this;
        }

        /**
         * @return {@link #status} (For example granted, pending, expired or withdrawn.)
         */
        public CodeableConcept getStatus() { 
          if (this.status == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MedicinalProductDefinitionSpecialDesignationComponent.status");
            else if (Configuration.doAutoCreate())
              this.status = new CodeableConcept(); // cc
          return this.status;
        }

        public boolean hasStatus() { 
          return this.status != null && !this.status.isEmpty();
        }

        /**
         * @param value {@link #status} (For example granted, pending, expired or withdrawn.)
         */
        public MedicinalProductDefinitionSpecialDesignationComponent setStatus(CodeableConcept value) { 
          this.status = value;
          return this;
        }

        /**
         * @return {@link #date} (Date when the designation was granted.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
         */
        public DateTimeType getDateElement() { 
          if (this.date == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MedicinalProductDefinitionSpecialDesignationComponent.date");
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
         * @param value {@link #date} (Date when the designation was granted.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
         */
        public MedicinalProductDefinitionSpecialDesignationComponent setDateElement(DateTimeType value) { 
          this.date = value;
          return this;
        }

        /**
         * @return Date when the designation was granted.
         */
        public Date getDate() { 
          return this.date == null ? null : this.date.getValue();
        }

        /**
         * @param value Date when the designation was granted.
         */
        public MedicinalProductDefinitionSpecialDesignationComponent setDate(Date value) { 
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
         * @return {@link #species} (Animal species for which this applies.)
         */
        public CodeableConcept getSpecies() { 
          if (this.species == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create MedicinalProductDefinitionSpecialDesignationComponent.species");
            else if (Configuration.doAutoCreate())
              this.species = new CodeableConcept(); // cc
          return this.species;
        }

        public boolean hasSpecies() { 
          return this.species != null && !this.species.isEmpty();
        }

        /**
         * @param value {@link #species} (Animal species for which this applies.)
         */
        public MedicinalProductDefinitionSpecialDesignationComponent setSpecies(CodeableConcept value) { 
          this.species = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("identifier", "Identifier", "Identifier for the designation, or procedure number.", 0, java.lang.Integer.MAX_VALUE, identifier));
          children.add(new Property("type", "CodeableConcept", "The type of special designation, e.g. orphan drug, minor use.", 0, 1, type));
          children.add(new Property("intendedUse", "CodeableConcept", "The intended use of the product, e.g. prevention, treatment.", 0, 1, intendedUse));
          children.add(new Property("indication[x]", "CodeableConcept|Reference(ClinicalUseIssue)", "Condition for which the medicinal use applies.", 0, 1, indication));
          children.add(new Property("status", "CodeableConcept", "For example granted, pending, expired or withdrawn.", 0, 1, status));
          children.add(new Property("date", "dateTime", "Date when the designation was granted.", 0, 1, date));
          children.add(new Property("species", "CodeableConcept", "Animal species for which this applies.", 0, 1, species));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -1618432855: /*identifier*/  return new Property("identifier", "Identifier", "Identifier for the designation, or procedure number.", 0, java.lang.Integer.MAX_VALUE, identifier);
          case 3575610: /*type*/  return new Property("type", "CodeableConcept", "The type of special designation, e.g. orphan drug, minor use.", 0, 1, type);
          case -1618671268: /*intendedUse*/  return new Property("intendedUse", "CodeableConcept", "The intended use of the product, e.g. prevention, treatment.", 0, 1, intendedUse);
          case -501208668: /*indication[x]*/  return new Property("indication[x]", "CodeableConcept|Reference(ClinicalUseIssue)", "Condition for which the medicinal use applies.", 0, 1, indication);
          case -597168804: /*indication*/  return new Property("indication[x]", "CodeableConcept|Reference(ClinicalUseIssue)", "Condition for which the medicinal use applies.", 0, 1, indication);
          case -1094003035: /*indicationCodeableConcept*/  return new Property("indication[x]", "CodeableConcept|Reference(ClinicalUseIssue)", "Condition for which the medicinal use applies.", 0, 1, indication);
          case 803518799: /*indicationReference*/  return new Property("indication[x]", "CodeableConcept|Reference(ClinicalUseIssue)", "Condition for which the medicinal use applies.", 0, 1, indication);
          case -892481550: /*status*/  return new Property("status", "CodeableConcept", "For example granted, pending, expired or withdrawn.", 0, 1, status);
          case 3076014: /*date*/  return new Property("date", "dateTime", "Date when the designation was granted.", 0, 1, date);
          case -2008465092: /*species*/  return new Property("species", "CodeableConcept", "Animal species for which this applies.", 0, 1, species);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return this.identifier == null ? new Base[0] : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // CodeableConcept
        case -1618671268: /*intendedUse*/ return this.intendedUse == null ? new Base[0] : new Base[] {this.intendedUse}; // CodeableConcept
        case -597168804: /*indication*/ return this.indication == null ? new Base[0] : new Base[] {this.indication}; // Type
        case -892481550: /*status*/ return this.status == null ? new Base[0] : new Base[] {this.status}; // CodeableConcept
        case 3076014: /*date*/ return this.date == null ? new Base[0] : new Base[] {this.date}; // DateTimeType
        case -2008465092: /*species*/ return this.species == null ? new Base[0] : new Base[] {this.species}; // CodeableConcept
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1618432855: // identifier
          this.getIdentifier().add(castToIdentifier(value)); // Identifier
          return value;
        case 3575610: // type
          this.type = castToCodeableConcept(value); // CodeableConcept
          return value;
        case -1618671268: // intendedUse
          this.intendedUse = castToCodeableConcept(value); // CodeableConcept
          return value;
        case -597168804: // indication
          this.indication = castToType(value); // Type
          return value;
        case -892481550: // status
          this.status = castToCodeableConcept(value); // CodeableConcept
          return value;
        case 3076014: // date
          this.date = castToDateTime(value); // DateTimeType
          return value;
        case -2008465092: // species
          this.species = castToCodeableConcept(value); // CodeableConcept
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier")) {
          this.getIdentifier().add(castToIdentifier(value));
        } else if (name.equals("type")) {
          this.type = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("intendedUse")) {
          this.intendedUse = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("indication[x]")) {
          this.indication = castToType(value); // Type
        } else if (name.equals("status")) {
          this.status = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("date")) {
          this.date = castToDateTime(value); // DateTimeType
        } else if (name.equals("species")) {
          this.species = castToCodeableConcept(value); // CodeableConcept
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855:  return addIdentifier(); 
        case 3575610:  return getType();
        case -1618671268:  return getIntendedUse();
        case -501208668:  return getIndication();
        case -597168804:  return getIndication();
        case -892481550:  return getStatus();
        case 3076014:  return getDateElement();
        case -2008465092:  return getSpecies();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return new String[] {"Identifier"};
        case 3575610: /*type*/ return new String[] {"CodeableConcept"};
        case -1618671268: /*intendedUse*/ return new String[] {"CodeableConcept"};
        case -597168804: /*indication*/ return new String[] {"CodeableConcept", "Reference"};
        case -892481550: /*status*/ return new String[] {"CodeableConcept"};
        case 3076014: /*date*/ return new String[] {"dateTime"};
        case -2008465092: /*species*/ return new String[] {"CodeableConcept"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
          return addIdentifier();
        }
        else if (name.equals("type")) {
          this.type = new CodeableConcept();
          return this.type;
        }
        else if (name.equals("intendedUse")) {
          this.intendedUse = new CodeableConcept();
          return this.intendedUse;
        }
        else if (name.equals("indicationCodeableConcept")) {
          this.indication = new CodeableConcept();
          return this.indication;
        }
        else if (name.equals("indicationReference")) {
          this.indication = new Reference();
          return this.indication;
        }
        else if (name.equals("status")) {
          this.status = new CodeableConcept();
          return this.status;
        }
        else if (name.equals("date")) {
          throw new FHIRException("Cannot call addChild on a primitive type MedicinalProductDefinition.date");
        }
        else if (name.equals("species")) {
          this.species = new CodeableConcept();
          return this.species;
        }
        else
          return super.addChild(name);
      }

      public MedicinalProductDefinitionSpecialDesignationComponent copy() {
        MedicinalProductDefinitionSpecialDesignationComponent dst = new MedicinalProductDefinitionSpecialDesignationComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(MedicinalProductDefinitionSpecialDesignationComponent dst) {
        super.copyValues(dst);
        if (identifier != null) {
          dst.identifier = new ArrayList<Identifier>();
          for (Identifier i : identifier)
            dst.identifier.add(i.copy());
        };
        dst.type = type == null ? null : type.copy();
        dst.intendedUse = intendedUse == null ? null : intendedUse.copy();
        dst.indication = indication == null ? null : indication.copy();
        dst.status = status == null ? null : status.copy();
        dst.date = date == null ? null : date.copy();
        dst.species = species == null ? null : species.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof MedicinalProductDefinitionSpecialDesignationComponent))
          return false;
        MedicinalProductDefinitionSpecialDesignationComponent o = (MedicinalProductDefinitionSpecialDesignationComponent) other_;
        return compareDeep(identifier, o.identifier, true) && compareDeep(type, o.type, true) && compareDeep(intendedUse, o.intendedUse, true)
           && compareDeep(indication, o.indication, true) && compareDeep(status, o.status, true) && compareDeep(date, o.date, true)
           && compareDeep(species, o.species, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof MedicinalProductDefinitionSpecialDesignationComponent))
          return false;
        MedicinalProductDefinitionSpecialDesignationComponent o = (MedicinalProductDefinitionSpecialDesignationComponent) other_;
        return compareValues(date, o.date, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, type, intendedUse
          , indication, status, date, species);
      }

  public String fhirType() {
    return "MedicinalProductDefinition.specialDesignation";

  }

  }

    /**
     * Business identifier for this product. Could be an MPID.
     */
    @Child(name = "identifier", type = {Identifier.class}, order=0, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Business identifier for this product. Could be an MPID", formalDefinition="Business identifier for this product. Could be an MPID." )
    protected List<Identifier> identifier;

    /**
     * Regulatory type, e.g. Investigational or Authorized.
     */
    @Child(name = "type", type = {CodeableConcept.class}, order=1, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Regulatory type, e.g. Investigational or Authorized", formalDefinition="Regulatory type, e.g. Investigational or Authorized." )
    protected CodeableConcept type;

    /**
     * If this medicine applies to human or veterinary uses.
     */
    @Child(name = "domain", type = {Coding.class}, order=2, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="If this medicine applies to human or veterinary uses", formalDefinition="If this medicine applies to human or veterinary uses." )
    protected Coding domain;

    /**
     * General description of this product.
     */
    @Child(name = "description", type = {StringType.class}, order=3, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="General description of this product", formalDefinition="General description of this product." )
    protected StringType description;

    /**
     * The dose form for a single part product, or combined form of a multiple part product.
     */
    @Child(name = "combinedPharmaceuticalDoseForm", type = {CodeableConcept.class}, order=4, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="The dose form for a single part product, or combined form of a multiple part product", formalDefinition="The dose form for a single part product, or combined form of a multiple part product." )
    protected CodeableConcept combinedPharmaceuticalDoseForm;

    /**
     * General combined description of indication(s) for this product. See also MedicinalProductDefinitionIndication.
     */
    @Child(name = "indication", type = {MarkdownType.class}, order=5, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="General combined description of indication(s) for this product. See also MedicinalProductDefinitionIndication", formalDefinition="General combined description of indication(s) for this product. See also MedicinalProductDefinitionIndication." )
    protected MarkdownType indication;

    /**
     * The legal status of supply of the medicinal product as classified by the regulator.
     */
    @Child(name = "legalStatusOfSupply", type = {CodeableConcept.class}, order=6, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="The legal status of supply of the medicinal product as classified by the regulator", formalDefinition="The legal status of supply of the medicinal product as classified by the regulator." )
    protected CodeableConcept legalStatusOfSupply;

    /**
     * Whether the Medicinal Product is subject to additional monitoring for regulatory reasons.
     */
    @Child(name = "additionalMonitoringIndicator", type = {CodeableConcept.class}, order=7, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Whether the Medicinal Product is subject to additional monitoring for regulatory reasons", formalDefinition="Whether the Medicinal Product is subject to additional monitoring for regulatory reasons." )
    protected CodeableConcept additionalMonitoringIndicator;

    /**
     * Whether the Medicinal Product is subject to special measures for regulatory reasons.
     */
    @Child(name = "specialMeasure", type = {StringType.class}, order=8, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Whether the Medicinal Product is subject to special measures for regulatory reasons", formalDefinition="Whether the Medicinal Product is subject to special measures for regulatory reasons." )
    protected List<StringType> specialMeasure;

    /**
     * If authorised for use in children.
     */
    @Child(name = "paediatricUseIndicator", type = {CodeableConcept.class}, order=9, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="If authorised for use in children", formalDefinition="If authorised for use in children." )
    protected CodeableConcept paediatricUseIndicator;

    /**
     * Allows the product to be classified by various systems.
     */
    @Child(name = "productClassification", type = {CodeableConcept.class}, order=10, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Allows the product to be classified by various systems", formalDefinition="Allows the product to be classified by various systems." )
    protected List<CodeableConcept> productClassification;

    /**
     * Marketing status of the medicinal product, in contrast to marketing authorizaton.
     */
    @Child(name = "marketingStatus", type = {MarketingStatus.class}, order=11, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Marketing status of the medicinal product, in contrast to marketing authorizaton", formalDefinition="Marketing status of the medicinal product, in contrast to marketing authorizaton." )
    protected List<MarketingStatus> marketingStatus;

    /**
     * Pharmaceutical aspects of product.
     */
    @Child(name = "pharmaceuticalProduct", type = {AdministrableProductDefinition.class}, order=12, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Pharmaceutical aspects of product", formalDefinition="Pharmaceutical aspects of product." )
    protected List<Reference> pharmaceuticalProduct;

    /**
     * Package representation for the product.
     */
    @Child(name = "packagedMedicinalProduct", type = {PackagedProductDefinition.class}, order=13, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Package representation for the product", formalDefinition="Package representation for the product." )
    protected List<Reference> packagedMedicinalProduct;

    /**
     * The ingredients of this medicinal product - when not specified elsewhere. This is only needed if the ingredients are not specified by the pharmaceuticalProduct or packagedMedicinalProduct references above. In cases where those levels of detail are not used, the ingredients may be specified directly here.
     */
    @Child(name = "ingredient", type = {Ingredient.class}, order=14, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="The ingredients of this medicinal product - when not specified elsewhere. This is only needed if the ingredients are not specified by the pharmaceuticalProduct or packagedMedicinalProduct references above. In cases where those levels of detail are not used, the ingredients may be specified directly here", formalDefinition="The ingredients of this medicinal product - when not specified elsewhere. This is only needed if the ingredients are not specified by the pharmaceuticalProduct or packagedMedicinalProduct references above. In cases where those levels of detail are not used, the ingredients may be specified directly here." )
    protected List<Reference> ingredient;

    /**
     * Supporting documentation, typically for regulatory submission.
     */
    @Child(name = "attachedDocument", type = {DocumentReference.class}, order=15, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Supporting documentation, typically for regulatory submission", formalDefinition="Supporting documentation, typically for regulatory submission." )
    protected List<Reference> attachedDocument;

    /**
     * A master file for to the medicinal product (e.g. Pharmacovigilance System Master File).
     */
    @Child(name = "masterFile", type = {DocumentReference.class}, order=16, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="A master file for to the medicinal product (e.g. Pharmacovigilance System Master File)", formalDefinition="A master file for to the medicinal product (e.g. Pharmacovigilance System Master File)." )
    protected List<Reference> masterFile;

    /**
     * A product specific contact, person (in a role), or an organization.
     */
    @Child(name = "contact", type = {}, order=17, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="A product specific contact, person (in a role), or an organization", formalDefinition="A product specific contact, person (in a role), or an organization." )
    protected List<MedicinalProductDefinitionContactComponent> contact;

    /**
     * Clinical trials or studies that this product is involved in.
     */
    @Child(name = "clinicalTrial", type = {ResearchStudy.class}, order=18, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Clinical trials or studies that this product is involved in", formalDefinition="Clinical trials or studies that this product is involved in." )
    protected List<Reference> clinicalTrial;

    /**
     * The product's name, including full name and possibly coded parts.
     */
    @Child(name = "name", type = {}, order=19, min=1, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="The product's name, including full name and possibly coded parts", formalDefinition="The product's name, including full name and possibly coded parts." )
    protected List<MedicinalProductDefinitionNameComponent> name;

    /**
     * Reference to another product, e.g. for linking authorised to investigational product.
     */
    @Child(name = "crossReference", type = {Identifier.class}, order=20, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Reference to another product, e.g. for linking authorised to investigational product", formalDefinition="Reference to another product, e.g. for linking authorised to investigational product." )
    protected List<Identifier> crossReference;

    /**
     * An operation applied to the product, for manufacturing or adminsitrative purpose.
     */
    @Child(name = "manufacturingBusinessOperation", type = {}, order=21, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="An operation applied to the product, for manufacturing or adminsitrative purpose", formalDefinition="An operation applied to the product, for manufacturing or adminsitrative purpose." )
    protected List<MedicinalProductDefinitionManufacturingBusinessOperationComponent> manufacturingBusinessOperation;

    /**
     * Indicates if the medicinal product has an orphan designation for the treatment of a rare disease.
     */
    @Child(name = "specialDesignation", type = {}, order=22, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Indicates if the medicinal product has an orphan designation for the treatment of a rare disease", formalDefinition="Indicates if the medicinal product has an orphan designation for the treatment of a rare disease." )
    protected List<MedicinalProductDefinitionSpecialDesignationComponent> specialDesignation;

    private static final long serialVersionUID = 1392072167L;

  /**
   * Constructor
   */
    public MedicinalProductDefinition() {
      super();
    }

    /**
     * @return {@link #identifier} (Business identifier for this product. Could be an MPID.)
     */
    public List<Identifier> getIdentifier() { 
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      return this.identifier;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public MedicinalProductDefinition setIdentifier(List<Identifier> theIdentifier) { 
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

    public MedicinalProductDefinition addIdentifier(Identifier t) { //3
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
     * @return {@link #type} (Regulatory type, e.g. Investigational or Authorized.)
     */
    public CodeableConcept getType() { 
      if (this.type == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create MedicinalProductDefinition.type");
        else if (Configuration.doAutoCreate())
          this.type = new CodeableConcept(); // cc
      return this.type;
    }

    public boolean hasType() { 
      return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Regulatory type, e.g. Investigational or Authorized.)
     */
    public MedicinalProductDefinition setType(CodeableConcept value) { 
      this.type = value;
      return this;
    }

    /**
     * @return {@link #domain} (If this medicine applies to human or veterinary uses.)
     */
    public Coding getDomain() { 
      if (this.domain == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create MedicinalProductDefinition.domain");
        else if (Configuration.doAutoCreate())
          this.domain = new Coding(); // cc
      return this.domain;
    }

    public boolean hasDomain() { 
      return this.domain != null && !this.domain.isEmpty();
    }

    /**
     * @param value {@link #domain} (If this medicine applies to human or veterinary uses.)
     */
    public MedicinalProductDefinition setDomain(Coding value) { 
      this.domain = value;
      return this;
    }

    /**
     * @return {@link #description} (General description of this product.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() { 
      if (this.description == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create MedicinalProductDefinition.description");
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
     * @param value {@link #description} (General description of this product.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public MedicinalProductDefinition setDescriptionElement(StringType value) { 
      this.description = value;
      return this;
    }

    /**
     * @return General description of this product.
     */
    public String getDescription() { 
      return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value General description of this product.
     */
    public MedicinalProductDefinition setDescription(String value) { 
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
     * @return {@link #combinedPharmaceuticalDoseForm} (The dose form for a single part product, or combined form of a multiple part product.)
     */
    public CodeableConcept getCombinedPharmaceuticalDoseForm() { 
      if (this.combinedPharmaceuticalDoseForm == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create MedicinalProductDefinition.combinedPharmaceuticalDoseForm");
        else if (Configuration.doAutoCreate())
          this.combinedPharmaceuticalDoseForm = new CodeableConcept(); // cc
      return this.combinedPharmaceuticalDoseForm;
    }

    public boolean hasCombinedPharmaceuticalDoseForm() { 
      return this.combinedPharmaceuticalDoseForm != null && !this.combinedPharmaceuticalDoseForm.isEmpty();
    }

    /**
     * @param value {@link #combinedPharmaceuticalDoseForm} (The dose form for a single part product, or combined form of a multiple part product.)
     */
    public MedicinalProductDefinition setCombinedPharmaceuticalDoseForm(CodeableConcept value) { 
      this.combinedPharmaceuticalDoseForm = value;
      return this;
    }

    /**
     * @return {@link #indication} (General combined description of indication(s) for this product. See also MedicinalProductDefinitionIndication.). This is the underlying object with id, value and extensions. The accessor "getIndication" gives direct access to the value
     */
    public MarkdownType getIndicationElement() { 
      if (this.indication == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create MedicinalProductDefinition.indication");
        else if (Configuration.doAutoCreate())
          this.indication = new MarkdownType(); // bb
      return this.indication;
    }

    public boolean hasIndicationElement() { 
      return this.indication != null && !this.indication.isEmpty();
    }

    public boolean hasIndication() { 
      return this.indication != null && !this.indication.isEmpty();
    }

    /**
     * @param value {@link #indication} (General combined description of indication(s) for this product. See also MedicinalProductDefinitionIndication.). This is the underlying object with id, value and extensions. The accessor "getIndication" gives direct access to the value
     */
    public MedicinalProductDefinition setIndicationElement(MarkdownType value) { 
      this.indication = value;
      return this;
    }

    /**
     * @return General combined description of indication(s) for this product. See also MedicinalProductDefinitionIndication.
     */
    public String getIndication() { 
      return this.indication == null ? null : this.indication.getValue();
    }

    /**
     * @param value General combined description of indication(s) for this product. See also MedicinalProductDefinitionIndication.
     */
    public MedicinalProductDefinition setIndication(String value) { 
      if (value == null)
        this.indication = null;
      else {
        if (this.indication == null)
          this.indication = new MarkdownType();
        this.indication.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #legalStatusOfSupply} (The legal status of supply of the medicinal product as classified by the regulator.)
     */
    public CodeableConcept getLegalStatusOfSupply() { 
      if (this.legalStatusOfSupply == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create MedicinalProductDefinition.legalStatusOfSupply");
        else if (Configuration.doAutoCreate())
          this.legalStatusOfSupply = new CodeableConcept(); // cc
      return this.legalStatusOfSupply;
    }

    public boolean hasLegalStatusOfSupply() { 
      return this.legalStatusOfSupply != null && !this.legalStatusOfSupply.isEmpty();
    }

    /**
     * @param value {@link #legalStatusOfSupply} (The legal status of supply of the medicinal product as classified by the regulator.)
     */
    public MedicinalProductDefinition setLegalStatusOfSupply(CodeableConcept value) { 
      this.legalStatusOfSupply = value;
      return this;
    }

    /**
     * @return {@link #additionalMonitoringIndicator} (Whether the Medicinal Product is subject to additional monitoring for regulatory reasons.)
     */
    public CodeableConcept getAdditionalMonitoringIndicator() { 
      if (this.additionalMonitoringIndicator == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create MedicinalProductDefinition.additionalMonitoringIndicator");
        else if (Configuration.doAutoCreate())
          this.additionalMonitoringIndicator = new CodeableConcept(); // cc
      return this.additionalMonitoringIndicator;
    }

    public boolean hasAdditionalMonitoringIndicator() { 
      return this.additionalMonitoringIndicator != null && !this.additionalMonitoringIndicator.isEmpty();
    }

    /**
     * @param value {@link #additionalMonitoringIndicator} (Whether the Medicinal Product is subject to additional monitoring for regulatory reasons.)
     */
    public MedicinalProductDefinition setAdditionalMonitoringIndicator(CodeableConcept value) { 
      this.additionalMonitoringIndicator = value;
      return this;
    }

    /**
     * @return {@link #specialMeasure} (Whether the Medicinal Product is subject to special measures for regulatory reasons.)
     */
    public List<StringType> getSpecialMeasure() { 
      if (this.specialMeasure == null)
        this.specialMeasure = new ArrayList<StringType>();
      return this.specialMeasure;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public MedicinalProductDefinition setSpecialMeasure(List<StringType> theSpecialMeasure) { 
      this.specialMeasure = theSpecialMeasure;
      return this;
    }

    public boolean hasSpecialMeasure() { 
      if (this.specialMeasure == null)
        return false;
      for (StringType item : this.specialMeasure)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #specialMeasure} (Whether the Medicinal Product is subject to special measures for regulatory reasons.)
     */
    public StringType addSpecialMeasureElement() {//2 
      StringType t = new StringType();
      if (this.specialMeasure == null)
        this.specialMeasure = new ArrayList<StringType>();
      this.specialMeasure.add(t);
      return t;
    }

    /**
     * @param value {@link #specialMeasure} (Whether the Medicinal Product is subject to special measures for regulatory reasons.)
     */
    public MedicinalProductDefinition addSpecialMeasure(String value) { //1
      StringType t = new StringType();
      t.setValue(value);
      if (this.specialMeasure == null)
        this.specialMeasure = new ArrayList<StringType>();
      this.specialMeasure.add(t);
      return this;
    }

    /**
     * @param value {@link #specialMeasure} (Whether the Medicinal Product is subject to special measures for regulatory reasons.)
     */
    public boolean hasSpecialMeasure(String value) { 
      if (this.specialMeasure == null)
        return false;
      for (StringType v : this.specialMeasure)
        if (v.getValue().equals(value)) // string
          return true;
      return false;
    }

    /**
     * @return {@link #paediatricUseIndicator} (If authorised for use in children.)
     */
    public CodeableConcept getPaediatricUseIndicator() { 
      if (this.paediatricUseIndicator == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create MedicinalProductDefinition.paediatricUseIndicator");
        else if (Configuration.doAutoCreate())
          this.paediatricUseIndicator = new CodeableConcept(); // cc
      return this.paediatricUseIndicator;
    }

    public boolean hasPaediatricUseIndicator() { 
      return this.paediatricUseIndicator != null && !this.paediatricUseIndicator.isEmpty();
    }

    /**
     * @param value {@link #paediatricUseIndicator} (If authorised for use in children.)
     */
    public MedicinalProductDefinition setPaediatricUseIndicator(CodeableConcept value) { 
      this.paediatricUseIndicator = value;
      return this;
    }

    /**
     * @return {@link #productClassification} (Allows the product to be classified by various systems.)
     */
    public List<CodeableConcept> getProductClassification() { 
      if (this.productClassification == null)
        this.productClassification = new ArrayList<CodeableConcept>();
      return this.productClassification;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public MedicinalProductDefinition setProductClassification(List<CodeableConcept> theProductClassification) { 
      this.productClassification = theProductClassification;
      return this;
    }

    public boolean hasProductClassification() { 
      if (this.productClassification == null)
        return false;
      for (CodeableConcept item : this.productClassification)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public CodeableConcept addProductClassification() { //3
      CodeableConcept t = new CodeableConcept();
      if (this.productClassification == null)
        this.productClassification = new ArrayList<CodeableConcept>();
      this.productClassification.add(t);
      return t;
    }

    public MedicinalProductDefinition addProductClassification(CodeableConcept t) { //3
      if (t == null)
        return this;
      if (this.productClassification == null)
        this.productClassification = new ArrayList<CodeableConcept>();
      this.productClassification.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #productClassification}, creating it if it does not already exist
     */
    public CodeableConcept getProductClassificationFirstRep() { 
      if (getProductClassification().isEmpty()) {
        addProductClassification();
      }
      return getProductClassification().get(0);
    }

    /**
     * @return {@link #marketingStatus} (Marketing status of the medicinal product, in contrast to marketing authorizaton.)
     */
    public List<MarketingStatus> getMarketingStatus() { 
      if (this.marketingStatus == null)
        this.marketingStatus = new ArrayList<MarketingStatus>();
      return this.marketingStatus;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public MedicinalProductDefinition setMarketingStatus(List<MarketingStatus> theMarketingStatus) { 
      this.marketingStatus = theMarketingStatus;
      return this;
    }

    public boolean hasMarketingStatus() { 
      if (this.marketingStatus == null)
        return false;
      for (MarketingStatus item : this.marketingStatus)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public MarketingStatus addMarketingStatus() { //3
      MarketingStatus t = new MarketingStatus();
      if (this.marketingStatus == null)
        this.marketingStatus = new ArrayList<MarketingStatus>();
      this.marketingStatus.add(t);
      return t;
    }

    public MedicinalProductDefinition addMarketingStatus(MarketingStatus t) { //3
      if (t == null)
        return this;
      if (this.marketingStatus == null)
        this.marketingStatus = new ArrayList<MarketingStatus>();
      this.marketingStatus.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #marketingStatus}, creating it if it does not already exist
     */
    public MarketingStatus getMarketingStatusFirstRep() { 
      if (getMarketingStatus().isEmpty()) {
        addMarketingStatus();
      }
      return getMarketingStatus().get(0);
    }

    /**
     * @return {@link #pharmaceuticalProduct} (Pharmaceutical aspects of product.)
     */
    public List<Reference> getPharmaceuticalProduct() { 
      if (this.pharmaceuticalProduct == null)
        this.pharmaceuticalProduct = new ArrayList<Reference>();
      return this.pharmaceuticalProduct;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public MedicinalProductDefinition setPharmaceuticalProduct(List<Reference> thePharmaceuticalProduct) { 
      this.pharmaceuticalProduct = thePharmaceuticalProduct;
      return this;
    }

    public boolean hasPharmaceuticalProduct() { 
      if (this.pharmaceuticalProduct == null)
        return false;
      for (Reference item : this.pharmaceuticalProduct)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addPharmaceuticalProduct() { //3
      Reference t = new Reference();
      if (this.pharmaceuticalProduct == null)
        this.pharmaceuticalProduct = new ArrayList<Reference>();
      this.pharmaceuticalProduct.add(t);
      return t;
    }

    public MedicinalProductDefinition addPharmaceuticalProduct(Reference t) { //3
      if (t == null)
        return this;
      if (this.pharmaceuticalProduct == null)
        this.pharmaceuticalProduct = new ArrayList<Reference>();
      this.pharmaceuticalProduct.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #pharmaceuticalProduct}, creating it if it does not already exist
     */
    public Reference getPharmaceuticalProductFirstRep() { 
      if (getPharmaceuticalProduct().isEmpty()) {
        addPharmaceuticalProduct();
      }
      return getPharmaceuticalProduct().get(0);
    }

    /**
     * @return {@link #packagedMedicinalProduct} (Package representation for the product.)
     */
    public List<Reference> getPackagedMedicinalProduct() { 
      if (this.packagedMedicinalProduct == null)
        this.packagedMedicinalProduct = new ArrayList<Reference>();
      return this.packagedMedicinalProduct;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public MedicinalProductDefinition setPackagedMedicinalProduct(List<Reference> thePackagedMedicinalProduct) { 
      this.packagedMedicinalProduct = thePackagedMedicinalProduct;
      return this;
    }

    public boolean hasPackagedMedicinalProduct() { 
      if (this.packagedMedicinalProduct == null)
        return false;
      for (Reference item : this.packagedMedicinalProduct)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addPackagedMedicinalProduct() { //3
      Reference t = new Reference();
      if (this.packagedMedicinalProduct == null)
        this.packagedMedicinalProduct = new ArrayList<Reference>();
      this.packagedMedicinalProduct.add(t);
      return t;
    }

    public MedicinalProductDefinition addPackagedMedicinalProduct(Reference t) { //3
      if (t == null)
        return this;
      if (this.packagedMedicinalProduct == null)
        this.packagedMedicinalProduct = new ArrayList<Reference>();
      this.packagedMedicinalProduct.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #packagedMedicinalProduct}, creating it if it does not already exist
     */
    public Reference getPackagedMedicinalProductFirstRep() { 
      if (getPackagedMedicinalProduct().isEmpty()) {
        addPackagedMedicinalProduct();
      }
      return getPackagedMedicinalProduct().get(0);
    }

    /**
     * @return {@link #ingredient} (The ingredients of this medicinal product - when not specified elsewhere. This is only needed if the ingredients are not specified by the pharmaceuticalProduct or packagedMedicinalProduct references above. In cases where those levels of detail are not used, the ingredients may be specified directly here.)
     */
    public List<Reference> getIngredient() { 
      if (this.ingredient == null)
        this.ingredient = new ArrayList<Reference>();
      return this.ingredient;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public MedicinalProductDefinition setIngredient(List<Reference> theIngredient) { 
      this.ingredient = theIngredient;
      return this;
    }

    public boolean hasIngredient() { 
      if (this.ingredient == null)
        return false;
      for (Reference item : this.ingredient)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addIngredient() { //3
      Reference t = new Reference();
      if (this.ingredient == null)
        this.ingredient = new ArrayList<Reference>();
      this.ingredient.add(t);
      return t;
    }

    public MedicinalProductDefinition addIngredient(Reference t) { //3
      if (t == null)
        return this;
      if (this.ingredient == null)
        this.ingredient = new ArrayList<Reference>();
      this.ingredient.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #ingredient}, creating it if it does not already exist
     */
    public Reference getIngredientFirstRep() { 
      if (getIngredient().isEmpty()) {
        addIngredient();
      }
      return getIngredient().get(0);
    }

    /**
     * @return {@link #attachedDocument} (Supporting documentation, typically for regulatory submission.)
     */
    public List<Reference> getAttachedDocument() { 
      if (this.attachedDocument == null)
        this.attachedDocument = new ArrayList<Reference>();
      return this.attachedDocument;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public MedicinalProductDefinition setAttachedDocument(List<Reference> theAttachedDocument) { 
      this.attachedDocument = theAttachedDocument;
      return this;
    }

    public boolean hasAttachedDocument() { 
      if (this.attachedDocument == null)
        return false;
      for (Reference item : this.attachedDocument)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addAttachedDocument() { //3
      Reference t = new Reference();
      if (this.attachedDocument == null)
        this.attachedDocument = new ArrayList<Reference>();
      this.attachedDocument.add(t);
      return t;
    }

    public MedicinalProductDefinition addAttachedDocument(Reference t) { //3
      if (t == null)
        return this;
      if (this.attachedDocument == null)
        this.attachedDocument = new ArrayList<Reference>();
      this.attachedDocument.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #attachedDocument}, creating it if it does not already exist
     */
    public Reference getAttachedDocumentFirstRep() { 
      if (getAttachedDocument().isEmpty()) {
        addAttachedDocument();
      }
      return getAttachedDocument().get(0);
    }

    /**
     * @return {@link #masterFile} (A master file for to the medicinal product (e.g. Pharmacovigilance System Master File).)
     */
    public List<Reference> getMasterFile() { 
      if (this.masterFile == null)
        this.masterFile = new ArrayList<Reference>();
      return this.masterFile;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public MedicinalProductDefinition setMasterFile(List<Reference> theMasterFile) { 
      this.masterFile = theMasterFile;
      return this;
    }

    public boolean hasMasterFile() { 
      if (this.masterFile == null)
        return false;
      for (Reference item : this.masterFile)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addMasterFile() { //3
      Reference t = new Reference();
      if (this.masterFile == null)
        this.masterFile = new ArrayList<Reference>();
      this.masterFile.add(t);
      return t;
    }

    public MedicinalProductDefinition addMasterFile(Reference t) { //3
      if (t == null)
        return this;
      if (this.masterFile == null)
        this.masterFile = new ArrayList<Reference>();
      this.masterFile.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #masterFile}, creating it if it does not already exist
     */
    public Reference getMasterFileFirstRep() { 
      if (getMasterFile().isEmpty()) {
        addMasterFile();
      }
      return getMasterFile().get(0);
    }

    /**
     * @return {@link #contact} (A product specific contact, person (in a role), or an organization.)
     */
    public List<MedicinalProductDefinitionContactComponent> getContact() { 
      if (this.contact == null)
        this.contact = new ArrayList<MedicinalProductDefinitionContactComponent>();
      return this.contact;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public MedicinalProductDefinition setContact(List<MedicinalProductDefinitionContactComponent> theContact) { 
      this.contact = theContact;
      return this;
    }

    public boolean hasContact() { 
      if (this.contact == null)
        return false;
      for (MedicinalProductDefinitionContactComponent item : this.contact)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public MedicinalProductDefinitionContactComponent addContact() { //3
      MedicinalProductDefinitionContactComponent t = new MedicinalProductDefinitionContactComponent();
      if (this.contact == null)
        this.contact = new ArrayList<MedicinalProductDefinitionContactComponent>();
      this.contact.add(t);
      return t;
    }

    public MedicinalProductDefinition addContact(MedicinalProductDefinitionContactComponent t) { //3
      if (t == null)
        return this;
      if (this.contact == null)
        this.contact = new ArrayList<MedicinalProductDefinitionContactComponent>();
      this.contact.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #contact}, creating it if it does not already exist
     */
    public MedicinalProductDefinitionContactComponent getContactFirstRep() { 
      if (getContact().isEmpty()) {
        addContact();
      }
      return getContact().get(0);
    }

    /**
     * @return {@link #clinicalTrial} (Clinical trials or studies that this product is involved in.)
     */
    public List<Reference> getClinicalTrial() { 
      if (this.clinicalTrial == null)
        this.clinicalTrial = new ArrayList<Reference>();
      return this.clinicalTrial;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public MedicinalProductDefinition setClinicalTrial(List<Reference> theClinicalTrial) { 
      this.clinicalTrial = theClinicalTrial;
      return this;
    }

    public boolean hasClinicalTrial() { 
      if (this.clinicalTrial == null)
        return false;
      for (Reference item : this.clinicalTrial)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addClinicalTrial() { //3
      Reference t = new Reference();
      if (this.clinicalTrial == null)
        this.clinicalTrial = new ArrayList<Reference>();
      this.clinicalTrial.add(t);
      return t;
    }

    public MedicinalProductDefinition addClinicalTrial(Reference t) { //3
      if (t == null)
        return this;
      if (this.clinicalTrial == null)
        this.clinicalTrial = new ArrayList<Reference>();
      this.clinicalTrial.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #clinicalTrial}, creating it if it does not already exist
     */
    public Reference getClinicalTrialFirstRep() { 
      if (getClinicalTrial().isEmpty()) {
        addClinicalTrial();
      }
      return getClinicalTrial().get(0);
    }

    /**
     * @return {@link #name} (The product's name, including full name and possibly coded parts.)
     */
    public List<MedicinalProductDefinitionNameComponent> getName() { 
      if (this.name == null)
        this.name = new ArrayList<MedicinalProductDefinitionNameComponent>();
      return this.name;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public MedicinalProductDefinition setName(List<MedicinalProductDefinitionNameComponent> theName) { 
      this.name = theName;
      return this;
    }

    public boolean hasName() { 
      if (this.name == null)
        return false;
      for (MedicinalProductDefinitionNameComponent item : this.name)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public MedicinalProductDefinitionNameComponent addName() { //3
      MedicinalProductDefinitionNameComponent t = new MedicinalProductDefinitionNameComponent();
      if (this.name == null)
        this.name = new ArrayList<MedicinalProductDefinitionNameComponent>();
      this.name.add(t);
      return t;
    }

    public MedicinalProductDefinition addName(MedicinalProductDefinitionNameComponent t) { //3
      if (t == null)
        return this;
      if (this.name == null)
        this.name = new ArrayList<MedicinalProductDefinitionNameComponent>();
      this.name.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #name}, creating it if it does not already exist
     */
    public MedicinalProductDefinitionNameComponent getNameFirstRep() { 
      if (getName().isEmpty()) {
        addName();
      }
      return getName().get(0);
    }

    /**
     * @return {@link #crossReference} (Reference to another product, e.g. for linking authorised to investigational product.)
     */
    public List<Identifier> getCrossReference() { 
      if (this.crossReference == null)
        this.crossReference = new ArrayList<Identifier>();
      return this.crossReference;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public MedicinalProductDefinition setCrossReference(List<Identifier> theCrossReference) { 
      this.crossReference = theCrossReference;
      return this;
    }

    public boolean hasCrossReference() { 
      if (this.crossReference == null)
        return false;
      for (Identifier item : this.crossReference)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Identifier addCrossReference() { //3
      Identifier t = new Identifier();
      if (this.crossReference == null)
        this.crossReference = new ArrayList<Identifier>();
      this.crossReference.add(t);
      return t;
    }

    public MedicinalProductDefinition addCrossReference(Identifier t) { //3
      if (t == null)
        return this;
      if (this.crossReference == null)
        this.crossReference = new ArrayList<Identifier>();
      this.crossReference.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #crossReference}, creating it if it does not already exist
     */
    public Identifier getCrossReferenceFirstRep() { 
      if (getCrossReference().isEmpty()) {
        addCrossReference();
      }
      return getCrossReference().get(0);
    }

    /**
     * @return {@link #manufacturingBusinessOperation} (An operation applied to the product, for manufacturing or adminsitrative purpose.)
     */
    public List<MedicinalProductDefinitionManufacturingBusinessOperationComponent> getManufacturingBusinessOperation() { 
      if (this.manufacturingBusinessOperation == null)
        this.manufacturingBusinessOperation = new ArrayList<MedicinalProductDefinitionManufacturingBusinessOperationComponent>();
      return this.manufacturingBusinessOperation;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public MedicinalProductDefinition setManufacturingBusinessOperation(List<MedicinalProductDefinitionManufacturingBusinessOperationComponent> theManufacturingBusinessOperation) { 
      this.manufacturingBusinessOperation = theManufacturingBusinessOperation;
      return this;
    }

    public boolean hasManufacturingBusinessOperation() { 
      if (this.manufacturingBusinessOperation == null)
        return false;
      for (MedicinalProductDefinitionManufacturingBusinessOperationComponent item : this.manufacturingBusinessOperation)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public MedicinalProductDefinitionManufacturingBusinessOperationComponent addManufacturingBusinessOperation() { //3
      MedicinalProductDefinitionManufacturingBusinessOperationComponent t = new MedicinalProductDefinitionManufacturingBusinessOperationComponent();
      if (this.manufacturingBusinessOperation == null)
        this.manufacturingBusinessOperation = new ArrayList<MedicinalProductDefinitionManufacturingBusinessOperationComponent>();
      this.manufacturingBusinessOperation.add(t);
      return t;
    }

    public MedicinalProductDefinition addManufacturingBusinessOperation(MedicinalProductDefinitionManufacturingBusinessOperationComponent t) { //3
      if (t == null)
        return this;
      if (this.manufacturingBusinessOperation == null)
        this.manufacturingBusinessOperation = new ArrayList<MedicinalProductDefinitionManufacturingBusinessOperationComponent>();
      this.manufacturingBusinessOperation.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #manufacturingBusinessOperation}, creating it if it does not already exist
     */
    public MedicinalProductDefinitionManufacturingBusinessOperationComponent getManufacturingBusinessOperationFirstRep() { 
      if (getManufacturingBusinessOperation().isEmpty()) {
        addManufacturingBusinessOperation();
      }
      return getManufacturingBusinessOperation().get(0);
    }

    /**
     * @return {@link #specialDesignation} (Indicates if the medicinal product has an orphan designation for the treatment of a rare disease.)
     */
    public List<MedicinalProductDefinitionSpecialDesignationComponent> getSpecialDesignation() { 
      if (this.specialDesignation == null)
        this.specialDesignation = new ArrayList<MedicinalProductDefinitionSpecialDesignationComponent>();
      return this.specialDesignation;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public MedicinalProductDefinition setSpecialDesignation(List<MedicinalProductDefinitionSpecialDesignationComponent> theSpecialDesignation) { 
      this.specialDesignation = theSpecialDesignation;
      return this;
    }

    public boolean hasSpecialDesignation() { 
      if (this.specialDesignation == null)
        return false;
      for (MedicinalProductDefinitionSpecialDesignationComponent item : this.specialDesignation)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public MedicinalProductDefinitionSpecialDesignationComponent addSpecialDesignation() { //3
      MedicinalProductDefinitionSpecialDesignationComponent t = new MedicinalProductDefinitionSpecialDesignationComponent();
      if (this.specialDesignation == null)
        this.specialDesignation = new ArrayList<MedicinalProductDefinitionSpecialDesignationComponent>();
      this.specialDesignation.add(t);
      return t;
    }

    public MedicinalProductDefinition addSpecialDesignation(MedicinalProductDefinitionSpecialDesignationComponent t) { //3
      if (t == null)
        return this;
      if (this.specialDesignation == null)
        this.specialDesignation = new ArrayList<MedicinalProductDefinitionSpecialDesignationComponent>();
      this.specialDesignation.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #specialDesignation}, creating it if it does not already exist
     */
    public MedicinalProductDefinitionSpecialDesignationComponent getSpecialDesignationFirstRep() { 
      if (getSpecialDesignation().isEmpty()) {
        addSpecialDesignation();
      }
      return getSpecialDesignation().get(0);
    }

      protected void listChildren(List<Property> children) {
        super.listChildren(children);
        children.add(new Property("identifier", "Identifier", "Business identifier for this product. Could be an MPID.", 0, java.lang.Integer.MAX_VALUE, identifier));
        children.add(new Property("type", "CodeableConcept", "Regulatory type, e.g. Investigational or Authorized.", 0, 1, type));
        children.add(new Property("domain", "Coding", "If this medicine applies to human or veterinary uses.", 0, 1, domain));
        children.add(new Property("description", "string", "General description of this product.", 0, 1, description));
        children.add(new Property("combinedPharmaceuticalDoseForm", "CodeableConcept", "The dose form for a single part product, or combined form of a multiple part product.", 0, 1, combinedPharmaceuticalDoseForm));
        children.add(new Property("indication", "markdown", "General combined description of indication(s) for this product. See also MedicinalProductDefinitionIndication.", 0, 1, indication));
        children.add(new Property("legalStatusOfSupply", "CodeableConcept", "The legal status of supply of the medicinal product as classified by the regulator.", 0, 1, legalStatusOfSupply));
        children.add(new Property("additionalMonitoringIndicator", "CodeableConcept", "Whether the Medicinal Product is subject to additional monitoring for regulatory reasons.", 0, 1, additionalMonitoringIndicator));
        children.add(new Property("specialMeasure", "string", "Whether the Medicinal Product is subject to special measures for regulatory reasons.", 0, java.lang.Integer.MAX_VALUE, specialMeasure));
        children.add(new Property("paediatricUseIndicator", "CodeableConcept", "If authorised for use in children.", 0, 1, paediatricUseIndicator));
        children.add(new Property("productClassification", "CodeableConcept", "Allows the product to be classified by various systems.", 0, java.lang.Integer.MAX_VALUE, productClassification));
        children.add(new Property("marketingStatus", "MarketingStatus", "Marketing status of the medicinal product, in contrast to marketing authorizaton.", 0, java.lang.Integer.MAX_VALUE, marketingStatus));
        children.add(new Property("pharmaceuticalProduct", "Reference(AdministrableProductDefinition)", "Pharmaceutical aspects of product.", 0, java.lang.Integer.MAX_VALUE, pharmaceuticalProduct));
        children.add(new Property("packagedMedicinalProduct", "Reference(PackagedProductDefinition)", "Package representation for the product.", 0, java.lang.Integer.MAX_VALUE, packagedMedicinalProduct));
        children.add(new Property("ingredient", "Reference(Ingredient)", "The ingredients of this medicinal product - when not specified elsewhere. This is only needed if the ingredients are not specified by the pharmaceuticalProduct or packagedMedicinalProduct references above. In cases where those levels of detail are not used, the ingredients may be specified directly here.", 0, java.lang.Integer.MAX_VALUE, ingredient));
        children.add(new Property("attachedDocument", "Reference(DocumentReference)", "Supporting documentation, typically for regulatory submission.", 0, java.lang.Integer.MAX_VALUE, attachedDocument));
        children.add(new Property("masterFile", "Reference(DocumentReference)", "A master file for to the medicinal product (e.g. Pharmacovigilance System Master File).", 0, java.lang.Integer.MAX_VALUE, masterFile));
        children.add(new Property("contact", "", "A product specific contact, person (in a role), or an organization.", 0, java.lang.Integer.MAX_VALUE, contact));
        children.add(new Property("clinicalTrial", "Reference(ResearchStudy)", "Clinical trials or studies that this product is involved in.", 0, java.lang.Integer.MAX_VALUE, clinicalTrial));
        children.add(new Property("name", "", "The product's name, including full name and possibly coded parts.", 0, java.lang.Integer.MAX_VALUE, name));
        children.add(new Property("crossReference", "Identifier", "Reference to another product, e.g. for linking authorised to investigational product.", 0, java.lang.Integer.MAX_VALUE, crossReference));
        children.add(new Property("manufacturingBusinessOperation", "", "An operation applied to the product, for manufacturing or adminsitrative purpose.", 0, java.lang.Integer.MAX_VALUE, manufacturingBusinessOperation));
        children.add(new Property("specialDesignation", "", "Indicates if the medicinal product has an orphan designation for the treatment of a rare disease.", 0, java.lang.Integer.MAX_VALUE, specialDesignation));
      }

      @Override
      public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
        switch (_hash) {
        case -1618432855: /*identifier*/  return new Property("identifier", "Identifier", "Business identifier for this product. Could be an MPID.", 0, java.lang.Integer.MAX_VALUE, identifier);
        case 3575610: /*type*/  return new Property("type", "CodeableConcept", "Regulatory type, e.g. Investigational or Authorized.", 0, 1, type);
        case -1326197564: /*domain*/  return new Property("domain", "Coding", "If this medicine applies to human or veterinary uses.", 0, 1, domain);
        case -1724546052: /*description*/  return new Property("description", "string", "General description of this product.", 0, 1, description);
        case -1992898487: /*combinedPharmaceuticalDoseForm*/  return new Property("combinedPharmaceuticalDoseForm", "CodeableConcept", "The dose form for a single part product, or combined form of a multiple part product.", 0, 1, combinedPharmaceuticalDoseForm);
        case -597168804: /*indication*/  return new Property("indication", "markdown", "General combined description of indication(s) for this product. See also MedicinalProductDefinitionIndication.", 0, 1, indication);
        case -844874031: /*legalStatusOfSupply*/  return new Property("legalStatusOfSupply", "CodeableConcept", "The legal status of supply of the medicinal product as classified by the regulator.", 0, 1, legalStatusOfSupply);
        case 1935999744: /*additionalMonitoringIndicator*/  return new Property("additionalMonitoringIndicator", "CodeableConcept", "Whether the Medicinal Product is subject to additional monitoring for regulatory reasons.", 0, 1, additionalMonitoringIndicator);
        case 1001286245: /*specialMeasure*/  return new Property("specialMeasure", "string", "Whether the Medicinal Product is subject to special measures for regulatory reasons.", 0, java.lang.Integer.MAX_VALUE, specialMeasure);
        case -1019867160: /*paediatricUseIndicator*/  return new Property("paediatricUseIndicator", "CodeableConcept", "If authorised for use in children.", 0, 1, paediatricUseIndicator);
        case 1247936181: /*productClassification*/  return new Property("productClassification", "CodeableConcept", "Allows the product to be classified by various systems.", 0, java.lang.Integer.MAX_VALUE, productClassification);
        case 70767032: /*marketingStatus*/  return new Property("marketingStatus", "MarketingStatus", "Marketing status of the medicinal product, in contrast to marketing authorizaton.", 0, java.lang.Integer.MAX_VALUE, marketingStatus);
        case 443273260: /*pharmaceuticalProduct*/  return new Property("pharmaceuticalProduct", "Reference(AdministrableProductDefinition)", "Pharmaceutical aspects of product.", 0, java.lang.Integer.MAX_VALUE, pharmaceuticalProduct);
        case -361025513: /*packagedMedicinalProduct*/  return new Property("packagedMedicinalProduct", "Reference(PackagedProductDefinition)", "Package representation for the product.", 0, java.lang.Integer.MAX_VALUE, packagedMedicinalProduct);
        case -206409263: /*ingredient*/  return new Property("ingredient", "Reference(Ingredient)", "The ingredients of this medicinal product - when not specified elsewhere. This is only needed if the ingredients are not specified by the pharmaceuticalProduct or packagedMedicinalProduct references above. In cases where those levels of detail are not used, the ingredients may be specified directly here.", 0, java.lang.Integer.MAX_VALUE, ingredient);
        case -513945889: /*attachedDocument*/  return new Property("attachedDocument", "Reference(DocumentReference)", "Supporting documentation, typically for regulatory submission.", 0, java.lang.Integer.MAX_VALUE, attachedDocument);
        case -2039573762: /*masterFile*/  return new Property("masterFile", "Reference(DocumentReference)", "A master file for to the medicinal product (e.g. Pharmacovigilance System Master File).", 0, java.lang.Integer.MAX_VALUE, masterFile);
        case 951526432: /*contact*/  return new Property("contact", "", "A product specific contact, person (in a role), or an organization.", 0, java.lang.Integer.MAX_VALUE, contact);
        case 1232866243: /*clinicalTrial*/  return new Property("clinicalTrial", "Reference(ResearchStudy)", "Clinical trials or studies that this product is involved in.", 0, java.lang.Integer.MAX_VALUE, clinicalTrial);
        case 3373707: /*name*/  return new Property("name", "", "The product's name, including full name and possibly coded parts.", 0, java.lang.Integer.MAX_VALUE, name);
        case -986968341: /*crossReference*/  return new Property("crossReference", "Identifier", "Reference to another product, e.g. for linking authorised to investigational product.", 0, java.lang.Integer.MAX_VALUE, crossReference);
        case -171103255: /*manufacturingBusinessOperation*/  return new Property("manufacturingBusinessOperation", "", "An operation applied to the product, for manufacturing or adminsitrative purpose.", 0, java.lang.Integer.MAX_VALUE, manufacturingBusinessOperation);
        case -964310658: /*specialDesignation*/  return new Property("specialDesignation", "", "Indicates if the medicinal product has an orphan designation for the treatment of a rare disease.", 0, java.lang.Integer.MAX_VALUE, specialDesignation);
        default: return super.getNamedProperty(_hash, _name, _checkValid);
        }

      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return this.identifier == null ? new Base[0] : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // CodeableConcept
        case -1326197564: /*domain*/ return this.domain == null ? new Base[0] : new Base[] {this.domain}; // Coding
        case -1724546052: /*description*/ return this.description == null ? new Base[0] : new Base[] {this.description}; // StringType
        case -1992898487: /*combinedPharmaceuticalDoseForm*/ return this.combinedPharmaceuticalDoseForm == null ? new Base[0] : new Base[] {this.combinedPharmaceuticalDoseForm}; // CodeableConcept
        case -597168804: /*indication*/ return this.indication == null ? new Base[0] : new Base[] {this.indication}; // MarkdownType
        case -844874031: /*legalStatusOfSupply*/ return this.legalStatusOfSupply == null ? new Base[0] : new Base[] {this.legalStatusOfSupply}; // CodeableConcept
        case 1935999744: /*additionalMonitoringIndicator*/ return this.additionalMonitoringIndicator == null ? new Base[0] : new Base[] {this.additionalMonitoringIndicator}; // CodeableConcept
        case 1001286245: /*specialMeasure*/ return this.specialMeasure == null ? new Base[0] : this.specialMeasure.toArray(new Base[this.specialMeasure.size()]); // StringType
        case -1019867160: /*paediatricUseIndicator*/ return this.paediatricUseIndicator == null ? new Base[0] : new Base[] {this.paediatricUseIndicator}; // CodeableConcept
        case 1247936181: /*productClassification*/ return this.productClassification == null ? new Base[0] : this.productClassification.toArray(new Base[this.productClassification.size()]); // CodeableConcept
        case 70767032: /*marketingStatus*/ return this.marketingStatus == null ? new Base[0] : this.marketingStatus.toArray(new Base[this.marketingStatus.size()]); // MarketingStatus
        case 443273260: /*pharmaceuticalProduct*/ return this.pharmaceuticalProduct == null ? new Base[0] : this.pharmaceuticalProduct.toArray(new Base[this.pharmaceuticalProduct.size()]); // Reference
        case -361025513: /*packagedMedicinalProduct*/ return this.packagedMedicinalProduct == null ? new Base[0] : this.packagedMedicinalProduct.toArray(new Base[this.packagedMedicinalProduct.size()]); // Reference
        case -206409263: /*ingredient*/ return this.ingredient == null ? new Base[0] : this.ingredient.toArray(new Base[this.ingredient.size()]); // Reference
        case -513945889: /*attachedDocument*/ return this.attachedDocument == null ? new Base[0] : this.attachedDocument.toArray(new Base[this.attachedDocument.size()]); // Reference
        case -2039573762: /*masterFile*/ return this.masterFile == null ? new Base[0] : this.masterFile.toArray(new Base[this.masterFile.size()]); // Reference
        case 951526432: /*contact*/ return this.contact == null ? new Base[0] : this.contact.toArray(new Base[this.contact.size()]); // MedicinalProductDefinitionContactComponent
        case 1232866243: /*clinicalTrial*/ return this.clinicalTrial == null ? new Base[0] : this.clinicalTrial.toArray(new Base[this.clinicalTrial.size()]); // Reference
        case 3373707: /*name*/ return this.name == null ? new Base[0] : this.name.toArray(new Base[this.name.size()]); // MedicinalProductDefinitionNameComponent
        case -986968341: /*crossReference*/ return this.crossReference == null ? new Base[0] : this.crossReference.toArray(new Base[this.crossReference.size()]); // Identifier
        case -171103255: /*manufacturingBusinessOperation*/ return this.manufacturingBusinessOperation == null ? new Base[0] : this.manufacturingBusinessOperation.toArray(new Base[this.manufacturingBusinessOperation.size()]); // MedicinalProductDefinitionManufacturingBusinessOperationComponent
        case -964310658: /*specialDesignation*/ return this.specialDesignation == null ? new Base[0] : this.specialDesignation.toArray(new Base[this.specialDesignation.size()]); // MedicinalProductDefinitionSpecialDesignationComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1618432855: // identifier
          this.getIdentifier().add(castToIdentifier(value)); // Identifier
          return value;
        case 3575610: // type
          this.type = castToCodeableConcept(value); // CodeableConcept
          return value;
        case -1326197564: // domain
          this.domain = castToCoding(value); // Coding
          return value;
        case -1724546052: // description
          this.description = castToString(value); // StringType
          return value;
        case -1992898487: // combinedPharmaceuticalDoseForm
          this.combinedPharmaceuticalDoseForm = castToCodeableConcept(value); // CodeableConcept
          return value;
        case -597168804: // indication
          this.indication = castToMarkdown(value); // MarkdownType
          return value;
        case -844874031: // legalStatusOfSupply
          this.legalStatusOfSupply = castToCodeableConcept(value); // CodeableConcept
          return value;
        case 1935999744: // additionalMonitoringIndicator
          this.additionalMonitoringIndicator = castToCodeableConcept(value); // CodeableConcept
          return value;
        case 1001286245: // specialMeasure
          this.getSpecialMeasure().add(castToString(value)); // StringType
          return value;
        case -1019867160: // paediatricUseIndicator
          this.paediatricUseIndicator = castToCodeableConcept(value); // CodeableConcept
          return value;
        case 1247936181: // productClassification
          this.getProductClassification().add(castToCodeableConcept(value)); // CodeableConcept
          return value;
        case 70767032: // marketingStatus
          this.getMarketingStatus().add(castToMarketingStatus(value)); // MarketingStatus
          return value;
        case 443273260: // pharmaceuticalProduct
          this.getPharmaceuticalProduct().add(castToReference(value)); // Reference
          return value;
        case -361025513: // packagedMedicinalProduct
          this.getPackagedMedicinalProduct().add(castToReference(value)); // Reference
          return value;
        case -206409263: // ingredient
          this.getIngredient().add(castToReference(value)); // Reference
          return value;
        case -513945889: // attachedDocument
          this.getAttachedDocument().add(castToReference(value)); // Reference
          return value;
        case -2039573762: // masterFile
          this.getMasterFile().add(castToReference(value)); // Reference
          return value;
        case 951526432: // contact
          this.getContact().add((MedicinalProductDefinitionContactComponent) value); // MedicinalProductDefinitionContactComponent
          return value;
        case 1232866243: // clinicalTrial
          this.getClinicalTrial().add(castToReference(value)); // Reference
          return value;
        case 3373707: // name
          this.getName().add((MedicinalProductDefinitionNameComponent) value); // MedicinalProductDefinitionNameComponent
          return value;
        case -986968341: // crossReference
          this.getCrossReference().add(castToIdentifier(value)); // Identifier
          return value;
        case -171103255: // manufacturingBusinessOperation
          this.getManufacturingBusinessOperation().add((MedicinalProductDefinitionManufacturingBusinessOperationComponent) value); // MedicinalProductDefinitionManufacturingBusinessOperationComponent
          return value;
        case -964310658: // specialDesignation
          this.getSpecialDesignation().add((MedicinalProductDefinitionSpecialDesignationComponent) value); // MedicinalProductDefinitionSpecialDesignationComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier")) {
          this.getIdentifier().add(castToIdentifier(value));
        } else if (name.equals("type")) {
          this.type = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("domain")) {
          this.domain = castToCoding(value); // Coding
        } else if (name.equals("description")) {
          this.description = castToString(value); // StringType
        } else if (name.equals("combinedPharmaceuticalDoseForm")) {
          this.combinedPharmaceuticalDoseForm = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("indication")) {
          this.indication = castToMarkdown(value); // MarkdownType
        } else if (name.equals("legalStatusOfSupply")) {
          this.legalStatusOfSupply = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("additionalMonitoringIndicator")) {
          this.additionalMonitoringIndicator = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("specialMeasure")) {
          this.getSpecialMeasure().add(castToString(value));
        } else if (name.equals("paediatricUseIndicator")) {
          this.paediatricUseIndicator = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("productClassification")) {
          this.getProductClassification().add(castToCodeableConcept(value));
        } else if (name.equals("marketingStatus")) {
          this.getMarketingStatus().add(castToMarketingStatus(value));
        } else if (name.equals("pharmaceuticalProduct")) {
          this.getPharmaceuticalProduct().add(castToReference(value));
        } else if (name.equals("packagedMedicinalProduct")) {
          this.getPackagedMedicinalProduct().add(castToReference(value));
        } else if (name.equals("ingredient")) {
          this.getIngredient().add(castToReference(value));
        } else if (name.equals("attachedDocument")) {
          this.getAttachedDocument().add(castToReference(value));
        } else if (name.equals("masterFile")) {
          this.getMasterFile().add(castToReference(value));
        } else if (name.equals("contact")) {
          this.getContact().add((MedicinalProductDefinitionContactComponent) value);
        } else if (name.equals("clinicalTrial")) {
          this.getClinicalTrial().add(castToReference(value));
        } else if (name.equals("name")) {
          this.getName().add((MedicinalProductDefinitionNameComponent) value);
        } else if (name.equals("crossReference")) {
          this.getCrossReference().add(castToIdentifier(value));
        } else if (name.equals("manufacturingBusinessOperation")) {
          this.getManufacturingBusinessOperation().add((MedicinalProductDefinitionManufacturingBusinessOperationComponent) value);
        } else if (name.equals("specialDesignation")) {
          this.getSpecialDesignation().add((MedicinalProductDefinitionSpecialDesignationComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855:  return addIdentifier(); 
        case 3575610:  return getType();
        case -1326197564:  return getDomain();
        case -1724546052:  return getDescriptionElement();
        case -1992898487:  return getCombinedPharmaceuticalDoseForm();
        case -597168804:  return getIndicationElement();
        case -844874031:  return getLegalStatusOfSupply();
        case 1935999744:  return getAdditionalMonitoringIndicator();
        case 1001286245:  return addSpecialMeasureElement();
        case -1019867160:  return getPaediatricUseIndicator();
        case 1247936181:  return addProductClassification(); 
        case 70767032:  return addMarketingStatus(); 
        case 443273260:  return addPharmaceuticalProduct(); 
        case -361025513:  return addPackagedMedicinalProduct(); 
        case -206409263:  return addIngredient(); 
        case -513945889:  return addAttachedDocument(); 
        case -2039573762:  return addMasterFile(); 
        case 951526432:  return addContact(); 
        case 1232866243:  return addClinicalTrial(); 
        case 3373707:  return addName(); 
        case -986968341:  return addCrossReference(); 
        case -171103255:  return addManufacturingBusinessOperation(); 
        case -964310658:  return addSpecialDesignation(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return new String[] {"Identifier"};
        case 3575610: /*type*/ return new String[] {"CodeableConcept"};
        case -1326197564: /*domain*/ return new String[] {"Coding"};
        case -1724546052: /*description*/ return new String[] {"string"};
        case -1992898487: /*combinedPharmaceuticalDoseForm*/ return new String[] {"CodeableConcept"};
        case -597168804: /*indication*/ return new String[] {"markdown"};
        case -844874031: /*legalStatusOfSupply*/ return new String[] {"CodeableConcept"};
        case 1935999744: /*additionalMonitoringIndicator*/ return new String[] {"CodeableConcept"};
        case 1001286245: /*specialMeasure*/ return new String[] {"string"};
        case -1019867160: /*paediatricUseIndicator*/ return new String[] {"CodeableConcept"};
        case 1247936181: /*productClassification*/ return new String[] {"CodeableConcept"};
        case 70767032: /*marketingStatus*/ return new String[] {"MarketingStatus"};
        case 443273260: /*pharmaceuticalProduct*/ return new String[] {"Reference"};
        case -361025513: /*packagedMedicinalProduct*/ return new String[] {"Reference"};
        case -206409263: /*ingredient*/ return new String[] {"Reference"};
        case -513945889: /*attachedDocument*/ return new String[] {"Reference"};
        case -2039573762: /*masterFile*/ return new String[] {"Reference"};
        case 951526432: /*contact*/ return new String[] {};
        case 1232866243: /*clinicalTrial*/ return new String[] {"Reference"};
        case 3373707: /*name*/ return new String[] {};
        case -986968341: /*crossReference*/ return new String[] {"Identifier"};
        case -171103255: /*manufacturingBusinessOperation*/ return new String[] {};
        case -964310658: /*specialDesignation*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
          return addIdentifier();
        }
        else if (name.equals("type")) {
          this.type = new CodeableConcept();
          return this.type;
        }
        else if (name.equals("domain")) {
          this.domain = new Coding();
          return this.domain;
        }
        else if (name.equals("description")) {
          throw new FHIRException("Cannot call addChild on a primitive type MedicinalProductDefinition.description");
        }
        else if (name.equals("combinedPharmaceuticalDoseForm")) {
          this.combinedPharmaceuticalDoseForm = new CodeableConcept();
          return this.combinedPharmaceuticalDoseForm;
        }
        else if (name.equals("indication")) {
          throw new FHIRException("Cannot call addChild on a primitive type MedicinalProductDefinition.indication");
        }
        else if (name.equals("legalStatusOfSupply")) {
          this.legalStatusOfSupply = new CodeableConcept();
          return this.legalStatusOfSupply;
        }
        else if (name.equals("additionalMonitoringIndicator")) {
          this.additionalMonitoringIndicator = new CodeableConcept();
          return this.additionalMonitoringIndicator;
        }
        else if (name.equals("specialMeasure")) {
          throw new FHIRException("Cannot call addChild on a primitive type MedicinalProductDefinition.specialMeasure");
        }
        else if (name.equals("paediatricUseIndicator")) {
          this.paediatricUseIndicator = new CodeableConcept();
          return this.paediatricUseIndicator;
        }
        else if (name.equals("productClassification")) {
          return addProductClassification();
        }
        else if (name.equals("marketingStatus")) {
          return addMarketingStatus();
        }
        else if (name.equals("pharmaceuticalProduct")) {
          return addPharmaceuticalProduct();
        }
        else if (name.equals("packagedMedicinalProduct")) {
          return addPackagedMedicinalProduct();
        }
        else if (name.equals("ingredient")) {
          return addIngredient();
        }
        else if (name.equals("attachedDocument")) {
          return addAttachedDocument();
        }
        else if (name.equals("masterFile")) {
          return addMasterFile();
        }
        else if (name.equals("contact")) {
          return addContact();
        }
        else if (name.equals("clinicalTrial")) {
          return addClinicalTrial();
        }
        else if (name.equals("name")) {
          return addName();
        }
        else if (name.equals("crossReference")) {
          return addCrossReference();
        }
        else if (name.equals("manufacturingBusinessOperation")) {
          return addManufacturingBusinessOperation();
        }
        else if (name.equals("specialDesignation")) {
          return addSpecialDesignation();
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "MedicinalProductDefinition";

  }

      public MedicinalProductDefinition copy() {
        MedicinalProductDefinition dst = new MedicinalProductDefinition();
        copyValues(dst);
        return dst;
      }

      public void copyValues(MedicinalProductDefinition dst) {
        super.copyValues(dst);
        if (identifier != null) {
          dst.identifier = new ArrayList<Identifier>();
          for (Identifier i : identifier)
            dst.identifier.add(i.copy());
        };
        dst.type = type == null ? null : type.copy();
        dst.domain = domain == null ? null : domain.copy();
        dst.description = description == null ? null : description.copy();
        dst.combinedPharmaceuticalDoseForm = combinedPharmaceuticalDoseForm == null ? null : combinedPharmaceuticalDoseForm.copy();
        dst.indication = indication == null ? null : indication.copy();
        dst.legalStatusOfSupply = legalStatusOfSupply == null ? null : legalStatusOfSupply.copy();
        dst.additionalMonitoringIndicator = additionalMonitoringIndicator == null ? null : additionalMonitoringIndicator.copy();
        if (specialMeasure != null) {
          dst.specialMeasure = new ArrayList<StringType>();
          for (StringType i : specialMeasure)
            dst.specialMeasure.add(i.copy());
        };
        dst.paediatricUseIndicator = paediatricUseIndicator == null ? null : paediatricUseIndicator.copy();
        if (productClassification != null) {
          dst.productClassification = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : productClassification)
            dst.productClassification.add(i.copy());
        };
        if (marketingStatus != null) {
          dst.marketingStatus = new ArrayList<MarketingStatus>();
          for (MarketingStatus i : marketingStatus)
            dst.marketingStatus.add(i.copy());
        };
        if (pharmaceuticalProduct != null) {
          dst.pharmaceuticalProduct = new ArrayList<Reference>();
          for (Reference i : pharmaceuticalProduct)
            dst.pharmaceuticalProduct.add(i.copy());
        };
        if (packagedMedicinalProduct != null) {
          dst.packagedMedicinalProduct = new ArrayList<Reference>();
          for (Reference i : packagedMedicinalProduct)
            dst.packagedMedicinalProduct.add(i.copy());
        };
        if (ingredient != null) {
          dst.ingredient = new ArrayList<Reference>();
          for (Reference i : ingredient)
            dst.ingredient.add(i.copy());
        };
        if (attachedDocument != null) {
          dst.attachedDocument = new ArrayList<Reference>();
          for (Reference i : attachedDocument)
            dst.attachedDocument.add(i.copy());
        };
        if (masterFile != null) {
          dst.masterFile = new ArrayList<Reference>();
          for (Reference i : masterFile)
            dst.masterFile.add(i.copy());
        };
        if (contact != null) {
          dst.contact = new ArrayList<MedicinalProductDefinitionContactComponent>();
          for (MedicinalProductDefinitionContactComponent i : contact)
            dst.contact.add(i.copy());
        };
        if (clinicalTrial != null) {
          dst.clinicalTrial = new ArrayList<Reference>();
          for (Reference i : clinicalTrial)
            dst.clinicalTrial.add(i.copy());
        };
        if (name != null) {
          dst.name = new ArrayList<MedicinalProductDefinitionNameComponent>();
          for (MedicinalProductDefinitionNameComponent i : name)
            dst.name.add(i.copy());
        };
        if (crossReference != null) {
          dst.crossReference = new ArrayList<Identifier>();
          for (Identifier i : crossReference)
            dst.crossReference.add(i.copy());
        };
        if (manufacturingBusinessOperation != null) {
          dst.manufacturingBusinessOperation = new ArrayList<MedicinalProductDefinitionManufacturingBusinessOperationComponent>();
          for (MedicinalProductDefinitionManufacturingBusinessOperationComponent i : manufacturingBusinessOperation)
            dst.manufacturingBusinessOperation.add(i.copy());
        };
        if (specialDesignation != null) {
          dst.specialDesignation = new ArrayList<MedicinalProductDefinitionSpecialDesignationComponent>();
          for (MedicinalProductDefinitionSpecialDesignationComponent i : specialDesignation)
            dst.specialDesignation.add(i.copy());
        };
      }

      protected MedicinalProductDefinition typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof MedicinalProductDefinition))
          return false;
        MedicinalProductDefinition o = (MedicinalProductDefinition) other_;
        return compareDeep(identifier, o.identifier, true) && compareDeep(type, o.type, true) && compareDeep(domain, o.domain, true)
           && compareDeep(description, o.description, true) && compareDeep(combinedPharmaceuticalDoseForm, o.combinedPharmaceuticalDoseForm, true)
           && compareDeep(indication, o.indication, true) && compareDeep(legalStatusOfSupply, o.legalStatusOfSupply, true)
           && compareDeep(additionalMonitoringIndicator, o.additionalMonitoringIndicator, true) && compareDeep(specialMeasure, o.specialMeasure, true)
           && compareDeep(paediatricUseIndicator, o.paediatricUseIndicator, true) && compareDeep(productClassification, o.productClassification, true)
           && compareDeep(marketingStatus, o.marketingStatus, true) && compareDeep(pharmaceuticalProduct, o.pharmaceuticalProduct, true)
           && compareDeep(packagedMedicinalProduct, o.packagedMedicinalProduct, true) && compareDeep(ingredient, o.ingredient, true)
           && compareDeep(attachedDocument, o.attachedDocument, true) && compareDeep(masterFile, o.masterFile, true)
           && compareDeep(contact, o.contact, true) && compareDeep(clinicalTrial, o.clinicalTrial, true) && compareDeep(name, o.name, true)
           && compareDeep(crossReference, o.crossReference, true) && compareDeep(manufacturingBusinessOperation, o.manufacturingBusinessOperation, true)
           && compareDeep(specialDesignation, o.specialDesignation, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof MedicinalProductDefinition))
          return false;
        MedicinalProductDefinition o = (MedicinalProductDefinition) other_;
        return compareValues(description, o.description, true) && compareValues(indication, o.indication, true)
           && compareValues(specialMeasure, o.specialMeasure, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, type, domain
          , description, combinedPharmaceuticalDoseForm, indication, legalStatusOfSupply, additionalMonitoringIndicator
          , specialMeasure, paediatricUseIndicator, productClassification, marketingStatus, pharmaceuticalProduct
          , packagedMedicinalProduct, ingredient, attachedDocument, masterFile, contact, clinicalTrial
          , name, crossReference, manufacturingBusinessOperation, specialDesignation);
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.MedicinalProductDefinition;
   }

 /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>Business identifier for this product. Could be an MPID</b><br>
   * Type: <b>token</b><br>
   * Path: <b>MedicinalProductDefinition.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="identifier", path="MedicinalProductDefinition.identifier", description="Business identifier for this product. Could be an MPID", type="token" )
  public static final String SP_IDENTIFIER = "identifier";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>Business identifier for this product. Could be an MPID</b><br>
   * Type: <b>token</b><br>
   * Path: <b>MedicinalProductDefinition.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_IDENTIFIER);

 /**
   * Search parameter: <b>name</b>
   * <p>
   * Description: <b>The full product name</b><br>
   * Type: <b>string</b><br>
   * Path: <b>MedicinalProductDefinition.name.productName</b><br>
   * </p>
   */
  @SearchParamDefinition(name="name", path="MedicinalProductDefinition.name.productName", description="The full product name", type="string" )
  public static final String SP_NAME = "name";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>name</b>
   * <p>
   * Description: <b>The full product name</b><br>
   * Type: <b>string</b><br>
   * Path: <b>MedicinalProductDefinition.name.productName</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam NAME = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_NAME);

 /**
   * Search parameter: <b>name-language</b>
   * <p>
   * Description: <b>Language code for this name</b><br>
   * Type: <b>token</b><br>
   * Path: <b>MedicinalProductDefinition.name.countryLanguage.language</b><br>
   * </p>
   */
  @SearchParamDefinition(name="name-language", path="MedicinalProductDefinition.name.countryLanguage.language", description="Language code for this name", type="token" )
  public static final String SP_NAME_LANGUAGE = "name-language";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>name-language</b>
   * <p>
   * Description: <b>Language code for this name</b><br>
   * Type: <b>token</b><br>
   * Path: <b>MedicinalProductDefinition.name.countryLanguage.language</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam NAME_LANGUAGE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_NAME_LANGUAGE);


}

