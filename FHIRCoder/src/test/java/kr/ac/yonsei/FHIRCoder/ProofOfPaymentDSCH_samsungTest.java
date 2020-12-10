package kr.ac.yonsei.FHIRCoder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hl7.fhir.instance.model.api.IBaseDatatype;
import org.hl7.fhir.r4.model.Address;
import org.hl7.fhir.r4.model.Base;
import org.hl7.fhir.r4.model.ContactPoint;
import org.hl7.fhir.r4.model.Encounter;
import org.hl7.fhir.r4.model.Encounter.DiagnosisComponent;
import org.hl7.fhir.r4.model.ExplanationOfBenefit;
import org.hl7.fhir.r4.model.Extension;
import org.hl7.fhir.r4.model.HumanName;
import org.hl7.fhir.r4.model.Money;
import org.hl7.fhir.r4.model.Narrative;
import org.hl7.fhir.r4.model.Organization;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Reference;
import org.hl7.fhir.r4.model.Type;

import ca.uhn.fhir.context.FhirContext;

public class ProofOfPaymentDSCH_samsungTest {
	
	public static void main(String[] args) {
		ProofOfPaymentDSCH_samsung pop = new ProofOfPaymentDSCH_samsung();
		// 영수증번호
		pop.setId("DOC12345-2"); 
		
		// 환자 등록번호
		Patient pt = new Patient();
		pt.setId("00000");  
		
		// 환자이름
		List<HumanName> ptname = new ArrayList<HumanName>();
		HumanName lname = new HumanName();
		lname.setText("Hwang");
		ptname.add(lname);
		HumanName fname = new HumanName();
		fname.setText("**");
		ptname.add(fname);  
		pt.setName(ptname);
		
		pop.setSubject(new Reference(pt));
		
		// 수납일자 
		pop.setDate(new Date());
		
		// 설명 
		Narrative n = new Narrative();
		n.setDivAsString("<div>KISA 2020 블록체인 프로젝트; FHIR 프로파일링 진료비 계산 영수증; Authored by Jaehoon Lee Date: 2020-07-24</div>");
		pop.setText(n);
		
		// 요양기관종류
		Organization org = new Organization();
		org.setName("Samsung Hospital");
		
		// 사업자등록번호
		org.setId("213-82-05096");
		
		// 사업장 소재지
		List<Address> theAddress = new ArrayList<Address>();
		Address address = new Address();
		address.setText("서울시 강남구 일원로 81");
		theAddress.add(address);
		org.setAddress(theAddress );
		
		// 전화번호
		List<ContactPoint> theTelecom = new ArrayList<ContactPoint>();
		ContactPoint contact = new ContactPoint();
		contact.setValue("1599-3114");
		theTelecom.add(contact);
		org.setTelecom(theTelecom);
		
		// 내원기록 
		Encounter enc = new Encounter();
		enc.setServiceProviderTarget(org);
		enc.setId("5432");
		pop.setEncounter(new Reference(enc));
		
		//EOB
		Extension eobs = new Extension();
		List<Extension> theExtension = new ArrayList<Extension>();

		String[] urls = {"Visit"
				,"hospitalization_1"
				,"hospitalization_2"
				,"hospitalization_3"
				,"emergency"
				,"foodservice"
				,"medicationservice"
				,"medicationdispense"
				,"injectionservice"
				,"injectiondispense"
				,"anesthesia"
				,"procedure"
				,"test"
				,"imaging"
				,"radio"
				,"treatmentmaterial"
				,"rehab"
				,"mental"
				,"blood"
				,"ct"
				,"mri"
				,"pet"
				,"ultrasound"
				,"orthodontics"
				,"certification"
				,"mobilityaid"
				,"medicalcheckup"
				,"medicalquality"
				,"other"};

		int[] prices = {14354
				 ,0 
				 ,0 
				 ,0 
				 ,0 
				 ,0 
				 ,36 
				 ,0 
				 ,25626 
				 ,7397 
				 ,0 
				 ,6175 
				 ,29456 
				 ,0
				 ,0 
				 ,5894
				 ,0 
				 ,0 
				 ,0
				 ,0
				 ,0
				 ,0
				 ,0 
				 ,0 
				 ,0 
				 ,0 
				 ,8502 
				 ,0
				 };
		
		for (int i=0; i<prices.length; i++) {
			Extension e1 = new Extension("http://yonsei.ac.kr/eob/" +urls[i]);
			Money m = new Money();
			m.setValue(prices[i]);
			e1.setValue(m);
			theExtension.add(e1);
		}
		pop.setExtension(theExtension);
		
		Money paidtotal = new Money();
		paidtotal.setValue(34500);
		paidtotal.setCurrency("Korea Won");
		pop.setPaidtotal(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/paidtotal", paidtotal));

		Money paidbycreditcard = new Money();
		paidbycreditcard.setValue(13000);
		paidbycreditcard.setCurrency("Korea Won");
		pop.setPaidbycreditcard(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/paidbycreditcard", paidbycreditcard));

		FhirContext ctx = FhirContext.forR4();
		String string = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(pop);
		System.out.println(string);
	}


}
