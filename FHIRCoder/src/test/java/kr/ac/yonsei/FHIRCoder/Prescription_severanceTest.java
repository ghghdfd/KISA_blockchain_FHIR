package kr.ac.yonsei.FHIRCoder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Calendar;

import org.hl7.fhir.r4.model.Encounter;
import org.hl7.fhir.r4.model.Enumerations;
import org.hl7.fhir.r4.model.HumanName;
import org.hl7.fhir.r4.model.Identifier;
import org.hl7.fhir.r4.model.Narrative;
import org.hl7.fhir.r4.model.Organization;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Reference;
import org.hl7.fhir.r4.model.StringType;
import org.hl7.fhir.instance.model.api.IBaseDatatype;
import org.hl7.fhir.r4.model.Address;
import ca.uhn.fhir.context.FhirContext;

public class Prescription_severanceTest {
	public static void main(String[] args) {
		Prescription_severance pop = new Prescription_severance();
		
		Patient pt = new Patient();	
		
		List<HumanName> ptname = new ArrayList<HumanName>();
		HumanName lname = new HumanName();
		lname.setText("**");
		ptname.add(lname);
		HumanName fname = new HumanName();
		fname.setText("hwang");
		ptname.add(fname);
		pt.setName(ptname);
		
		List<Address> address = new ArrayList<Address>();
		Address adresss = new Address();
		adresss.setCountry("**도");
		adresss.setCity("**시");
		adresss.setDistrict("**동");
		address.add(adresss);
		pt.setAddress(address);
		pt.addTelecom().setSystem(org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem.PHONE).setValue("031-393-9372");
		
		pt.setGender(Enumerations.AdministrativeGender.MALE);
		
		List<Identifier> num = new ArrayList<Identifier>();
		Identifier numm = new Identifier();
		numm.setValue("950713-*******");
		num.add(numm);
		
		pt.setIdentifier(num);
		pop.setSubject(new Reference(pt));
		
		Narrative value = new Narrative();
		value.setDivAsString("<div>KISA 2020 블록체인 프로젝트; FHIR 프로파일링 약처방 내역 증명서(세브란스); Authored by Jaehoon Lee Date: 2020-07-20</div>");
		pop.setText(value);
		
		Calendar cal = Calendar.getInstance();
		cal.set(2020, Calendar.JUNE , 17);
		Date dat = new Date(cal.getTimeInMillis());
		pop.setDate(dat);
		
		StringType prescriptionperiod = new StringType();
		prescriptionperiod.fromStringValue("2020-06-17 ~ 2020-06-17");
		pop.setprescriptionperiod(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Period of prescription", (IBaseDatatype) prescriptionperiod));
		
		
		StringType prescriptiondate = new StringType();
		prescriptiondate.fromStringValue("2020-06-17");
		pop.setprescriptiondate(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Date of prescription", (IBaseDatatype) prescriptiondate));
		

		StringType medicine = new StringType();
		medicine.fromStringValue("셀셉트캅셀 250mg");
		pop.setmedicine(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Name of medicine", (IBaseDatatype) medicine));		

		StringType dose = new StringType();
		dose.fromStringValue("2C");
		pop.setdose(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Amount of daily dose", (IBaseDatatype) dose));		
		
		StringType dailydosecount = new StringType();
		dailydosecount.fromStringValue("2");
		pop.setdailydosecount(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Count of daily dose", (IBaseDatatype) dailydosecount));
		
		StringType medicationday = new StringType();
		medicationday.fromStringValue("90");
		pop.setmedicationday(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Day of medication", (IBaseDatatype) medicationday));		
		
		StringType totaldose = new StringType();
		totaldose.fromStringValue("360");
		pop.settotaldose(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Total amount of medication", (IBaseDatatype) totaldose));	
		
		FhirContext ctx = FhirContext.forR4();
		String string = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(pop);
		System.out.println(string);
	}


}
