package kr.ac.yonsei.FHIRCoder;
import org.hl7.fhir.r4.model.Composition;

import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Extension;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.util.ElementUtil;

@ResourceDef(name="Composition", profile="http://yonsei.ac.kr/StructureDefinition/ ")
public class MedicalExpenseDetail_seoul extends Composition {
	
   private static final long serialVersionUID = 1L;

   /**
    * Each extension is defined in a field. Any valid HAPI Data Type
    * can be used for the field type. Note that the [name=""] attribute
    * in the @Child annotation needs to match the name for the bean accessor
    * and mutator methods.
    */
   
    @Child(name = "Implementationdate")   
	@Extension(url = "http://yonsei.ac.kr/Implementationdate", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Implementationdate")
	private org.hl7.fhir.r4.model.Extension Implementationdate;
	
	public org.hl7.fhir.r4.model.Extension getImplementationdate() {

		return Implementationdate;
	}
	
	public void setImplementationdate(org.hl7.fhir.r4.model.Extension Implementationdate) {
		this.Implementationdate = Implementationdate;
	}
	
	@Child(name = "prescriptiondate")   
	@Extension(url = "http://yonsei.ac.kr/prescriptiondate", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "date of prescription")
	private org.hl7.fhir.r4.model.Extension prescriptiondate;
	
	public org.hl7.fhir.r4.model.Extension getprescriptiondate() {

		return prescriptiondate;
	}
	
	public void setprescriptiondate(org.hl7.fhir.r4.model.Extension prescriptiondate) {
		this.prescriptiondate = prescriptiondate;
	}
	
	@Child(name = "Department")   
	@Extension(url = "http://yonsei.ac.kr/Department", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Department of provider")
	private org.hl7.fhir.r4.model.Extension Department;
	
	public org.hl7.fhir.r4.model.Extension getDepartment() {
		return Department;
	}

	public void setDepartment(org.hl7.fhir.r4.model.Extension Department) {
		this.Department = Department;
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
	
	

	@Child(name = "classcode")   
	@Extension(url = "http://yonsei.ac.kr/classcode", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "classcode")
	private org.hl7.fhir.r4.model.Extension classcode;
	
	public org.hl7.fhir.r4.model.Extension getclasscode() {
		return classcode;
	}

	public void setclasscode(org.hl7.fhir.r4.model.Extension classcode) {
		this.classcode = classcode;
	}
	
	@Child(name = "Designation")   
	@Extension(url = "http://yonsei.ac.kr/Designation", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Designation")
	private org.hl7.fhir.r4.model.Extension Designation;
	
	public org.hl7.fhir.r4.model.Extension getDesignation() {
	    if (Designation == null) 
	    	Designation = new org.hl7.fhir.r4.model.Extension();
		return Designation;
	}
	
	public void setDesignation(org.hl7.fhir.r4.model.Extension Designation) {
		this.Designation = Designation;
	}
	 
	
	@Child(name = "Medicalexpensescode")   
	@Extension(url = "http://yonsei.ac.kr/Medicalexpensescode", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Medicalexpensescode")
	private org.hl7.fhir.r4.model.Extension Medicalexpensescode;
	
	public org.hl7.fhir.r4.model.Extension getMedicalexpensescode() {
		return Medicalexpensescode;
	}

	public void setMedicalexpensescode(org.hl7.fhir.r4.model.Extension Medicalexpensescode) {
		this.classcode = Medicalexpensescode;
	}
	
	
	
	@Child(name = "usage")   
	@Extension(url = "http://yonsei.ac.kr/usage", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Usage")
	private org.hl7.fhir.r4.model.Extension usage;
	
	public org.hl7.fhir.r4.model.Extension getusage() {
		return usage;
	}

	public void setusage(org.hl7.fhir.r4.model.Extension usage) {
		this.usage = usage;
	}
	

	@Child(name = "Count")   
	@Extension(url = "http://yonsei.ac.kr/Count", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Count")
	private org.hl7.fhir.r4.model.Extension Count;
	
	public org.hl7.fhir.r4.model.Extension getCount() {
	    if (Count == null) 
	    	Count = new org.hl7.fhir.r4.model.Extension();
		return Count;
	}
	
	public void setCount(org.hl7.fhir.r4.model.Extension Count) {
		this.Count = Count;
	}
	
	@Child(name = "Day")   
	@Extension(url = "http://yonsei.ac.kr/Day", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Day")
	private org.hl7.fhir.r4.model.Extension Day;
	
	public org.hl7.fhir.r4.model.Extension getDay() {
	    if (Day == null) 
	    	Day = new org.hl7.fhir.r4.model.Extension();
		return Day;
	}
	
	public void setDay(org.hl7.fhir.r4.model.Extension Day) {
		this.Day = Day;
	}
	
	@Child(name = "Unitprice")   
	@Extension(url = "http://yonsei.ac.kr/Unitprice", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Unitprice")
	private org.hl7.fhir.r4.model.Extension Unitprice;
	
	public org.hl7.fhir.r4.model.Extension getUnitprice() {
		return Unitprice;
	}

	public void setUnitprice(org.hl7.fhir.r4.model.Extension Unitprice) {
		this.Unitprice = Unitprice;
	}
	
	
	@Child(name = "paidbyplan")   
	@Extension(url = "http://yonsei.ac.kr/paidbyplan", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Amount paid by plan")
	private org.hl7.fhir.r4.model.Extension paidbyplan;
	
	public org.hl7.fhir.r4.model.Extension getPaidbyplan() {
	    if (paidbyplan == null) 
	    	paidbyplan = new org.hl7.fhir.r4.model.Extension();
		return paidbyplan;
	}
	
	public void setPaidbyplan(org.hl7.fhir.r4.model.Extension paidbyplan) {
		this.paidbyplan = paidbyplan;
	}
	
	
	@Child(name = "TotalPrice")   
	@Extension(url = "http://yonsei.ac.kr/TotalPrice", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Total Price")
	private org.hl7.fhir.r4.model.Extension TotalPrice;
	
	public org.hl7.fhir.r4.model.Extension getTotalPrice() {
	    if (TotalPrice == null) 
	    	TotalPrice = new org.hl7.fhir.r4.model.Extension();
		return TotalPrice;
	}
	
	public void setTotalPrice(org.hl7.fhir.r4.model.Extension TotalPrice) {
		this.TotalPrice = TotalPrice;
	}
	

	@Child(name = "paidbypatient")   
	@Extension(url = "http://yonsei.ac.kr/paidbypatient", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Amount paid by patient")
	private org.hl7.fhir.r4.model.Extension paidbypatient;
	
	public org.hl7.fhir.r4.model.Extension getPaidbypatient() {
	    if (paidbypatient == null) 
	    	paidbypatient = new org.hl7.fhir.r4.model.Extension();
		return paidbypatient;
	}
	
	public void setPaidbypatient(org.hl7.fhir.r4.model.Extension paidbypatient) {
		this.paidbypatient = paidbypatient;
	}

	@Child(name = "Optionalexpenses")   
	@Extension(url = "http://yonsei.ac.kr/Optionalexpenses", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "expenses of optional medical")
	private org.hl7.fhir.r4.model.Extension Optionalexpenses;
	
	public org.hl7.fhir.r4.model.Extension getOptionalexpenses() {
		return Optionalexpenses;
	}

	public void setOptionalexpenses(org.hl7.fhir.r4.model.Extension Optionalexpenses) {
		this.Optionalexpenses = Optionalexpenses;
	}
	
	
	@Child(name = "VAT")   
	@Extension(url = "http://yonsei.ac.kr/VAT", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "VAT")
	private org.hl7.fhir.r4.model.Extension VAT;
	
	public org.hl7.fhir.r4.model.Extension getIssuer() {
		return VAT;
	}

	public void setVAT(org.hl7.fhir.r4.model.Extension VAT) {
		this.VAT = VAT;
	}

	
	@Child(name = "Medicalexpensename")   
	@Extension(url = "http://yonsei.ac.kr/Medicalexpensename", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Medical expense name")
	private org.hl7.fhir.r4.model.Extension Medicalexpensename;
	
	public org.hl7.fhir.r4.model.Extension getMedicalexpensename() {
		return Medicalexpensename;
	}

	public void setMedicalexpensename(org.hl7.fhir.r4.model.Extension Medicalexpensename) {
		this.Medicalexpensename = Medicalexpensename;
	}
	
	
	@Child(name = "Code")   
	@Extension(url = "http://yonsei.ac.kr/code", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Code name")
	private org.hl7.fhir.r4.model.Extension code;
	
	public org.hl7.fhir.r4.model.Extension getcode() {
	    if (code == null) 
	    	code = new org.hl7.fhir.r4.model.Extension();
		return code;
	}
	
	public void setcode(org.hl7.fhir.r4.model.Extension code) {
		this.code = code;
	}


	
	@Override
	public boolean isEmpty() {
		return super.isEmpty() && ElementUtil.isEmpty(classcode,Designation,Department,Medicalexpensescode,usage,Providername,
				Unitprice,Optionalexpenses,VAT,Implementationdate,prescriptiondate,code,Medicalexpensename,Count,Day,TotalPrice,paidbypatient,paidbyplan);
	}
}