package kr.ac.yonsei.FHIRCoder;

import org.hl7.fhir.r4.model.Composition;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Extension;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.util.ElementUtil;

//
//* 항목:
// * 연번호: Composition.id
// * 출생아 부 성명 : Composition.extension.Fathername
// * 출생아 부 연령 : Composition.extension.Fatherage
// * 출생아 부 직업 : Composition.extension.Fatherjob
// * 출생아 모 성명 : Composition.extension.Mothername
// * 출생아 모 연령 : Composition.extension.Motherage
// * 출생아 모 직업 : Composition.extension.Motherjob
// * 산모의 주소 : Composition.extension.Motheraddress
// * 출생장소 : Composition.extension.PlaceOfBirth
// * 출생일시 : Composition.extension.DateOfBirth
// * 출생아성명 : Composition.extension.Babyname
// * 출생아성별 : Composition.extension.Babygender
// * 출생아체중 : Composition.extension.Babyweight
// * 출생아신장 : Composition.extension.Babyheight
// * 임신기간 : Composition.extension.PregnancyPeriod
// * 다태: Composition.extension.Multiple
// * 대태출산중 본아의 출산순위: Composition.extension.Birthorderamongmultiple
// * 대태출산중 본아의 상태: Composition.extension.Babycondition
// * 출생아 신체상황: Composition.extension.Babyphysicalcondition
// * 출생아 건강상황: Composition.extension.Babyhealthcondition
// * 내용: Composition.extension.Content
// * 의사성명: Composition.extension.Provider
// * 면허번호: Composition.extension.Certificataion
//	 */



@ResourceDef(name="Composition", profile="http://yonsei.ac.kr/StructureDefinition/ ")
public class Birthcertificate_seoul extends Composition {

   private static final long serialVersionUID = 1L;

   /**
    * Each extension is defined in a field. Any valid HAPI Data Type
    * can be used for the field type. Note that the [name=""] attribute
    * in the @Child annotation needs to match the name for the bean accessor
    * and mutator methods.
    */
 
	@Child(name = "Fathername")   
	@Extension(url = "http://yonsei.ac.kr/Fathername", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Name of father")
	private org.hl7.fhir.r4.model.Extension Fathername;
	
	public org.hl7.fhir.r4.model.Extension getFathername() {
		return Fathername;
	}

	public void setFathername(org.hl7.fhir.r4.model.Extension Fathername) {
		this.Fathername = Fathername;
	}
	
	@Child(name = "Fatherage")   
	@Extension(url = "http://yonsei.ac.kr/Fatherage", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Age of father")
	private org.hl7.fhir.r4.model.Extension Fatherage;
	
	public org.hl7.fhir.r4.model.Extension getFatherage() {
		return Fatherage;
	}

	public void setFatherage(org.hl7.fhir.r4.model.Extension Fatherage) {
		this.Fatherage = Fatherage;
	}


	@Child(name = "Fatherjob")   
	@Extension(url = "http://yonsei.ac.kr/Fatherjob", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Job of father")
	private org.hl7.fhir.r4.model.Extension Fatherjob;
	
	public org.hl7.fhir.r4.model.Extension getFatherjob() {
		return Fatherjob;
	}

	public void setFatherjob(org.hl7.fhir.r4.model.Extension Fatherjob) {
		this.Fatherjob = Fatherjob;
	}
	
	@Child(name = "Mothername")   
	@Extension(url = "http://yonsei.ac.kr/Mothername", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Name of Mother")
	private org.hl7.fhir.r4.model.Extension Mothername;
	
	public org.hl7.fhir.r4.model.Extension getMothername() {
		return Mothername;
	}

	public void setMothername(org.hl7.fhir.r4.model.Extension Mothername) {
		this.Mothername = Mothername;
	}
	
	@Child(name = "Motherage")   
	@Extension(url = "http://yonsei.ac.kr/Motherage", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Age of Mother")
	private org.hl7.fhir.r4.model.Extension Motherage;
	
	public org.hl7.fhir.r4.model.Extension getMotherage() {
		return Motherage;
	}

	public void setMotherage(org.hl7.fhir.r4.model.Extension Motherage) {
		this.Motherage = Motherage;
	}
	
	@Child(name = "Motherjob")   
	@Extension(url = "http://yonsei.ac.kr/Motherjob", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Job of father")
	private org.hl7.fhir.r4.model.Extension Motherjob;
	
	public org.hl7.fhir.r4.model.Extension getMotherjob() {
		return Motherjob;
	}

	public void setMotherjob(org.hl7.fhir.r4.model.Extension Motherjob) {
		this.Motherjob = Motherjob;
	}
	
	
	@Child(name = "Motheraddress")   
	@Extension(url = "http://yonsei.ac.kr/Motheraddress", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Motheraddress")
	private org.hl7.fhir.r4.model.Extension Motheraddress;
	
	public org.hl7.fhir.r4.model.Extension getMotheraddress() {
		return Motheraddress;
	}

	public void setMotheraddress(org.hl7.fhir.r4.model.Extension Motheraddress) {
		this.Motheraddress = Motheraddress;
	}

	
	@Child(name = "PlaceOfBirth")   
	@Extension(url = "http://yonsei.ac.kr/PlaceOfBirth", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Place of Birth")
	private org.hl7.fhir.r4.model.Extension PlaceOfBirth;
	
	public org.hl7.fhir.r4.model.Extension getPlaceOfBirth() {
		return PlaceOfBirth;
	}

	public void setPlaceOfBirth(org.hl7.fhir.r4.model.Extension PlaceOfBirth) {
		this.PlaceOfBirth = PlaceOfBirth;
	}
	
	@Child(name = "DateOfBirth")   
	@Extension(url = "http://yonsei.ac.kr/DateOfBirth", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Relationship with requester")
	private org.hl7.fhir.r4.model.Extension DateOfBirth;
	
	public org.hl7.fhir.r4.model.Extension getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(org.hl7.fhir.r4.model.Extension DateOfBirth) {
		this.DateOfBirth = DateOfBirth;
	}
	
	
	@Child(name = "Babygender")   
	@Extension(url = "http://yonsei.ac.kr/Babygender", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "predicted period of disability")
	private org.hl7.fhir.r4.model.Extension Babygender;
	
	public org.hl7.fhir.r4.model.Extension getBabygender() {
		return Babygender;
	}

	public void setBabygender(org.hl7.fhir.r4.model.Extension Babygender) {
		this.Babygender = Babygender;
	}
	
	@Child(name = "Babyname")   
	@Extension(url = "http://yonsei.ac.kr/Babyname", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Babyheight of disability")
	private org.hl7.fhir.r4.model.Extension Babyname;
	
	public org.hl7.fhir.r4.model.Extension getBabyname() {
		return Babyname;
	}

	public void setBabyname(org.hl7.fhir.r4.model.Extension Babyname) {
		this.Babyname = Babyname;
	}
	
	@Child(name = "Babyweight")   
	@Extension(url = "http://yonsei.ac.kr/Babyweight", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Babyweight of certificate")
	private org.hl7.fhir.r4.model.Extension Babyweight;
	
	public org.hl7.fhir.r4.model.Extension getBabyweight() {
		return Babyweight;
	}

	public void setBabyweight(org.hl7.fhir.r4.model.Extension Babyweight) {
		this.Babyweight = Babyweight;
	}
	
	@Child(name = "Babyheight")   
	@Extension(url = "http://yonsei.ac.kr/Babyheight", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Babyheight of certificate")
	private org.hl7.fhir.r4.model.Extension Babyheight;
	
	public org.hl7.fhir.r4.model.Extension getBabyheight() {
		return Babyheight;
	}

	public void setBabyheight(org.hl7.fhir.r4.model.Extension Babyheight) {
		this.Babyheight = Babyheight;
	}
	
	
	@Child(name = "PregnancyPeriod")   
	@Extension(url = "http://yonsei.ac.kr/PregnancyPeriod", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "PregnancyPeriod")
	private org.hl7.fhir.r4.model.Extension PregnancyPeriod;
	
	public org.hl7.fhir.r4.model.Extension getPregnancyPeriod() {
		return PregnancyPeriod;
	}

	public void setPregnancyPeriod(org.hl7.fhir.r4.model.Extension PregnancyPeriod) {
		this.PregnancyPeriod = PregnancyPeriod;
	}
	
	
	
	@Child(name = "Multiple")   
	@Extension(url = "http://yonsei.ac.kr/Multiple", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Multiple")
	private org.hl7.fhir.r4.model.Extension Multiple;
	
	public org.hl7.fhir.r4.model.Extension getMultiple() {
		return Multiple;
	}

	public void setMultiple(org.hl7.fhir.r4.model.Extension Multiple) {
		this.Multiple = Multiple;
	}
	
	
	@Child(name = "Birthorderamongmultiple")   
	@Extension(url = "http://yonsei.ac.kr/Birthorderamongmultiple", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Birthorderamongmultiple")
	private org.hl7.fhir.r4.model.Extension Birthorderamongmultiple;
	
	public org.hl7.fhir.r4.model.Extension getBirthorderamongmultiple() {
		return Birthorderamongmultiple;
	}

	public void setBirthorderamongmultiple(org.hl7.fhir.r4.model.Extension Birthorderamongmultiple) {
		this.Birthorderamongmultiple = Birthorderamongmultiple;
	}
	
	
	
	@Child(name = "Babycondition")   
	@Extension(url = "http://yonsei.ac.kr/Babycondition", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Babycondition")
	private org.hl7.fhir.r4.model.Extension Babycondition;
	
	public org.hl7.fhir.r4.model.Extension getBabycondition() {
		return Babycondition;
	}

	public void setBabycondition(org.hl7.fhir.r4.model.Extension Babycondition) {
		this.Babycondition = Babycondition;
	}
	
	
	@Child(name = "Babyphysicalcondition")   
	@Extension(url = "http://yonsei.ac.kr/Babyphysicalcondition", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Babyphysicalcondition")
	private org.hl7.fhir.r4.model.Extension Babyphysicalcondition;
	
	public org.hl7.fhir.r4.model.Extension getBabyphysicalcondition() {
		return Babyphysicalcondition;
	}

	public void setBabyphysicalcondition(org.hl7.fhir.r4.model.Extension Babyphysicalcondition) {
		this.Babyphysicalcondition = Babyphysicalcondition;
	}
	
	
	@Child(name = "Babyhealthcondition")   
	@Extension(url = "http://yonsei.ac.kr/Babyhealthcondition", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Babyhealthcondition")
	private org.hl7.fhir.r4.model.Extension Babyhealthcondition;
	
	public org.hl7.fhir.r4.model.Extension getBabyhealthcondition() {
		return Babyhealthcondition;
	}

	public void setBabyhealthcondition(org.hl7.fhir.r4.model.Extension Babyhealthcondition) {
		this.Babyhealthcondition = Babyhealthcondition;
	}
	
	
	@Child(name = "Certification")   
	@Extension(url = "http://yonsei.ac.kr/Certification", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Number of Certification")
	private org.hl7.fhir.r4.model.Extension Certification;
	
	public org.hl7.fhir.r4.model.Extension getCertification() {
		return Certification;
	}

	public void setCertification(org.hl7.fhir.r4.model.Extension Certification) {
		this.Certification = Certification;
	}
	
	
	@Child(name = "Providername")   
	@Extension(url = "http://yonsei.ac.kr/Providername", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Name of provider")
	private org.hl7.fhir.r4.model.Extension Providername;
	
	public org.hl7.fhir.r4.model.Extension getProvidername() {
		return Providername;
	}

	public void setProvidername(org.hl7.fhir.r4.model.Extension Providername) {
		this.Providername = Providername;
	}
	
	
	@Child(name = "Content")   
	@Extension(url = "http://yonsei.ac.kr/Content", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Content")
	private org.hl7.fhir.r4.model.Extension Content;
	
	public org.hl7.fhir.r4.model.Extension getContent() {
		return Content;
	}

	public void setContent(org.hl7.fhir.r4.model.Extension Content) {
		this.Content = Content;
	}
	
	@Override
	public boolean isEmpty() {
		return super.isEmpty() && ElementUtil.isEmpty(Fathername,Fatherage,Mothername, Motherage, Motheraddress,PlaceOfBirth,
				DateOfBirth,Babygender,Babyname,Babyweight,Babyheight,PregnancyPeriod,Multiple,Birthorderamongmultiple,Babycondition,
				Babyphysicalcondition,Babyhealthcondition,Certification,Providername,Content);
		
	}
}