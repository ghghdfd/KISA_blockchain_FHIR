package kr.ac.yonsei.FHIRCoder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Calendar;

import org.hl7.fhir.r4.model.Encounter;
import org.hl7.fhir.r4.model.Enumerations;
import org.hl7.fhir.r4.model.HumanName;
import org.hl7.fhir.r4.model.Narrative;
import org.hl7.fhir.r4.model.Organization;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Reference;
import org.hl7.fhir.r4.model.StringType;
import org.hl7.fhir.instance.model.api.IBaseDatatype;
import org.hl7.fhir.r4.model.Address;
import ca.uhn.fhir.context.FhirContext;

public class MedicalCertificate_samsungTest {
	public static void main(String[] args) {
		MedicalCertificate_samsung pop = new MedicalCertificate_samsung();
		
		pop.setId("2020-4***");
		
		Patient pt = new Patient();		
		List<HumanName> ptname = new ArrayList<HumanName>();
		HumanName lname = new HumanName();
		lname.setText("**");
		ptname.add(lname);
		HumanName fname = new HumanName();
		fname.setText("Hwang");
		ptname.add(fname);
		pt.setName(ptname);

		Calendar cal = Calendar.getInstance();
		cal.set(1995, Calendar.JULY ,13);
		Date dat = new Date(cal.getTimeInMillis());
		pt.setBirthDate(dat);
		
		pt.setGender(Enumerations.AdministrativeGender.MALE);
		
		
		List<Address> address = new ArrayList<Address>();
		Address adresss = new Address();
		adresss.setCountry("**도");
		adresss.setCity("**시");
		adresss.setDistrict("**동");
		address.add(adresss);
		pt.setAddress(address);
		
		pop.setSubject(new Reference (pt));
		
		Narrative value = new Narrative();
		value.setDivAsString("<div>KISA 2020 블록체인 프로젝트; FHIR 프로파일링 Medical Certificate(삼성서울); Authored by Jaehoon Lee Date: 2020-07-20</div>");
		pop.setText(value);
		
		Organization org = new Organization();
		org.setName("Samsung Medical Center");
		
		pop.setEncounter(new Reference(org));
	
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2020, Calendar.FEBRUARY , 11);
		Date dat2 = new Date(cal2.getTimeInMillis());
		pop.setDate(dat2);
		
		StringType ChartNumber = new StringType();
		ChartNumber.fromStringValue("ChartNumber");
		pop.setChartNumber(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/ChartNumber", (IBaseDatatype) ChartNumber));
		
		StringType Certainty = new StringType();
		Certainty.fromStringValue("Coclusion");
		pop.setCertainty(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Certainty of diagnosis", (IBaseDatatype) Certainty));
		
		StringType Diagnosis = new StringType();
		Diagnosis.fromStringValue("Malignant neoplasm of breast unspecified, left");
		pop.setDiagnosis(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Name of Diagnosis", (IBaseDatatype) Diagnosis));
		
		StringType ICD = new StringType();
		ICD.fromStringValue("C50.91");
		pop.setICD(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Diagnosis code", (IBaseDatatype) ICD));
		
		StringType Treatment = new StringType();
		Treatment.fromStringValue("She was admitted in hospital in 25th December, 2018 and discharged in 29th December.2018, She underwent a surgery (BCS+SLNB) as above on 25th December. 2018, Her final pathologic stage was Stage IIB. She received an adjuvant Radiotherapy, and has been on endocrine therapy with Tamoxifen 20 mg po qd and Goserelin 3.5 mg SQ injection q 4 weeks since 2019. 1. 29. At this moment, there is no evidence of disease recurrence. ");
		pop.setTreatment(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Treatment Content", (IBaseDatatype) Treatment));
		
		StringType DurationOfTreatment = new StringType();
		DurationOfTreatment.fromStringValue("DURATION OF TREATMENT");
		pop.setDurationOfTreatment(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Duration of treatment", (IBaseDatatype) DurationOfTreatment));
		
		StringType WrittenBy = new StringType();
		WrittenBy.fromStringValue("**LEE");
		pop.setWrittenBy(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Issue writer", (IBaseDatatype) WrittenBy));
		
	
		FhirContext ctx = FhirContext.forR4();
		String string = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(pop);
		System.out.println(string);
	}


}
