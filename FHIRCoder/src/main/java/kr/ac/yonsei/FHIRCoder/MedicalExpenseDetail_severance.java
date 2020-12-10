package kr.ac.yonsei.FHIRCoder;
import org.hl7.fhir.r4.model.Composition;

import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Extension;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.util.ElementUtil;

@ResourceDef(name="Composition", profile="http://yonsei.ac.kr/StructureDefinition/ ")
public class MedicalExpenseDetail_severance extends Composition {
	
   private static final long serialVersionUID = 1L;

   /**
    * Each extension is defined in a field. Any valid HAPI Data Type
    * can be used for the field type. Note that the [name=""] attribute
    * in the @Child annotation needs to match the name for the bean accessor
    * and mutator methods.
    */

	@Child(name = "Patienttype")   
	@Extension(url = "http://yonsei.ac.kr/Patienttype", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Type of patient")
	private org.hl7.fhir.r4.model.Extension Patienttype;
	
	public org.hl7.fhir.r4.model.Extension getPatienttype() {
		return Patienttype;
	}

	public void setPatienttype(org.hl7.fhir.r4.model.Extension Patienttype) {
		this.Patienttype = Patienttype;
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
	
	@Child(name = "treatmentperiod")   
	@Extension(url = "http://yonsei.ac.kr/treatmentperiod", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Period of treatment")
	private org.hl7.fhir.r4.model.Extension treatmentperiod;
	
	public org.hl7.fhir.r4.model.Extension gettreatmentperiod() {
		return treatmentperiod;
	}

	public void settreatmentperiod(org.hl7.fhir.r4.model.Extension treatmentperiod) {
		this.treatmentperiod = treatmentperiod;
	}
	
	
	@Child(name = "Room")   
	@Extension(url = "http://yonsei.ac.kr/Room", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "hospital room")
	private org.hl7.fhir.r4.model.Extension Room;
	
	public org.hl7.fhir.r4.model.Extension getRoom() {
		return Room;
	}

	public void setRoom(org.hl7.fhir.r4.model.Extension Room) {
		this.Room = Room;
	}
	
	@Child(name = "Issuer")   
	@Extension(url = "http://yonsei.ac.kr/Issuer", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Name of Issuer")
	private org.hl7.fhir.r4.model.Extension Issuer;
	
	public org.hl7.fhir.r4.model.Extension getIssuer() {
		return Issuer;
	}

	public void setIssuer(org.hl7.fhir.r4.model.Extension Issuer) {
		this.Issuer = Issuer;
	}

	@Child(name = "Issuedate")   
	@Extension(url = "http://yonsei.ac.kr/Issuedate", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Date of issue")
	private org.hl7.fhir.r4.model.Extension Issuedate;
	
	public org.hl7.fhir.r4.model.Extension getIssuedate() {
		return Issuedate;
	}

	public void setIssuedate(org.hl7.fhir.r4.model.Extension Issuedate) {
		this.Issuedate = Issuedate;
	}
	
	@Child(name = "Medicalinstitution")   
	@Extension(url = "http://yonsei.ac.kr/Medicalinstitution", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Number of Medicalinstitution")
	private org.hl7.fhir.r4.model.Extension Medicalinstitution;
	
	public org.hl7.fhir.r4.model.Extension getMedicalinstitution() {
		return Medicalinstitution;
	}

	public void setMedicalinstitution(org.hl7.fhir.r4.model.Extension Medicalinstitution) {
		this.Medicalinstitution = Medicalinstitution;
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
	

	@Child(name = "Remark")   
	@Extension(url = "http://yonsei.ac.kr/Remark", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Content of remark")
	private org.hl7.fhir.r4.model.Extension Remark;
	
	public org.hl7.fhir.r4.model.Extension getRemark() {
		return Remark;
	}

	public void setRemark(org.hl7.fhir.r4.model.Extension Remark) {
		this.Remark = Remark;
	}
	
   
   
    @Child(name = "item")   
	@Extension(url = "http://yonsei.ac.kr/item", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "item")
	private org.hl7.fhir.r4.model.Extension item;
	
	public org.hl7.fhir.r4.model.Extension getitem() {
	    if (item == null) 
	    	item = new org.hl7.fhir.r4.model.Extension();
		return item;
	}
	
	public void setitem(org.hl7.fhir.r4.model.Extension item) {
		this.item = item;
	}

	@Child(name = "Implementationdate")   
	@Extension(url = "http://yonsei.ac.kr/Implementationdate", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Implementationdate")
	private org.hl7.fhir.r4.model.Extension Implementationdate;
	
	public org.hl7.fhir.r4.model.Extension getImplementationdate() {
	    if (Implementationdate == null) 
	    	Implementationdate = new org.hl7.fhir.r4.model.Extension();
		return Implementationdate;
	}
	
	public void setImplementationdate(org.hl7.fhir.r4.model.Extension Implementationdate) {
		this.Implementationdate = Implementationdate;
	}
	
	@Child(name = "Receivingdate")   
	@Extension(url = "http://yonsei.ac.kr/Receivingdate", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Receivingdate")
	private org.hl7.fhir.r4.model.Extension Receivingdate;
	
	public org.hl7.fhir.r4.model.Extension getReceivingdate() {
	    if (Receivingdate == null) 
	    	Receivingdate = new org.hl7.fhir.r4.model.Extension();
		return Receivingdate;
	}
	
	public void setReceivingdate(org.hl7.fhir.r4.model.Extension Receivingdate) {
		this.Receivingdate = Receivingdate;
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
	
	@Child(name = "Name")   
	@Extension(url = "http://yonsei.ac.kr/Name", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Item name")
	private org.hl7.fhir.r4.model.Extension Name;
	
	public org.hl7.fhir.r4.model.Extension getName() {
	    if (Name == null) 
	    	Name = new org.hl7.fhir.r4.model.Extension();
		return Name;
	}
	
	public void setName(org.hl7.fhir.r4.model.Extension Name) {
		this.Name = Name;
	}
	
	@Child(name = "Price")   
	@Extension(url = "http://yonsei.ac.kr/Price", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "Price")
	private org.hl7.fhir.r4.model.Extension Price;
	
	public org.hl7.fhir.r4.model.Extension getPrice() {
	    if (Price == null) 
	    	Price = new org.hl7.fhir.r4.model.Extension();
		return Price;
	}
	
	public void setPrice(org.hl7.fhir.r4.model.Extension Price) {
		this.Price = Price;
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
	
	@Child(name = "fullpaidbypatient")   
	@Extension(url = "http://yonsei.ac.kr/fullpaidbypatient", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "full paid by patient")
	private org.hl7.fhir.r4.model.Extension fullpaidbypatient;
	public org.hl7.fhir.r4.model.Extension getfullpaidbypatient() {
		return fullpaidbypatient;
	}

	public void setfullpaidbypatient(org.hl7.fhir.r4.model.Extension fullpaidbypatient) {
		this.fullpaidbypatient = fullpaidbypatient;
	}
	
	
	@Child(name = "NonReimbursement")   
	@Extension(url = "http://yonsei.ac.kr/NonReimbursement", definedLocally=false, isModifier=false)
	@Description(shortDefinition = "full paid by patient")
	private org.hl7.fhir.r4.model.Extension NonReimbursement;
	
	public org.hl7.fhir.r4.model.Extension getNonReimbursement() {
		return NonReimbursement;
	}

	public void setNonReimbursement(org.hl7.fhir.r4.model.Extension NonReimbursement) {
		this.NonReimbursement = NonReimbursement;
	}
	
	
	@Override
	public boolean isEmpty() {
		return super.isEmpty() && ElementUtil.isEmpty(Patienttype,Department,treatmentperiod,Room,Issuedate,Issuer,Medicalinstitution,Providername,
				Certification,Remark,item,Implementationdate,Receivingdate,code,Name,Price,Count,Day,TotalPrice,paidbypatient,paidbyplan,fullpaidbypatient, NonReimbursement);
	}
}