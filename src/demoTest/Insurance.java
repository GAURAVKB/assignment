package demoTest;

import demoTest.HealthPolicy;
import demoTest.policy;
import demoTest.TravelInsurancePolicy;
import demoTest.VehiclePolicy;
import demoTest.HomePolicy;

import demoTest.Mycomparator;





import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Insurance {
	policy policies = new policy();
	 static int policyId =0;
	    static final int param = 0;
	    Map<Integer,List<policy>> hm = new HashMap<Integer,List<policy>>();
	    List<policy> list;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------WELCOME TO INSURANCE MANAGEMENT "
                + "SYSTEM------");
        Scanner scanchoice = new Scanner(System.in);
        
        System.out.println("----MENU----");
        System.out.println("1. ADD\n2. SEARCH\n3. SORT\n4. EXIT");
        System.out.println("Enter choice : ");
        int choice = scanchoice.nextInt();
        Insurance policy =  new Insurance();
        while (choice!=4)
        {
        switch ( choice )
        {
            case 1 : policy.add();
                break;
            case 2 : policy.search();
                break;
            case 3 : policy.sort();
                break;
            case 4 : System.exit(0);
                break;
            default : System.out.println("Oops !!!");
                break;
        }
        System.out.println("----MENU----");
        System.out.println("1. ADD\n2. SEARCH\n3.SORT\n  4. EXIT");
        System.out.println("Enter choice : ");
        choice = scanchoice.nextInt();
        }


	}
	void add(){
        list= new ArrayList<policy>();
        //datalist= new ArrayList<String>();
        Scanner sc = new Scanner( System.in );
        Scanner sc1 = new Scanner( System.in );
        System.out.println( "Enter the personal Details" );
        System.out.println( "Enter name " );
        String name = sc.nextLine();
        policies.setName(name);
        //policies.getName();
       // list.add(name);
        System.out.println("Enter Age");
        int age = Integer.parseInt(sc.nextLine());
        //policies.setAge(String.valueOf(age));
        policies.setAge(age);
       
        System.out.println("Address");
        //System.out.println();
        String address = sc.nextLine();
        policies.setAddress(address);
        //list.add(String.valueOf(address));
        System.out.println("Contact Number");
        int mob = sc.nextInt();
        policies.setContact(mob);
        //list.add(String.valueOf(mob));
        System.out.println();
        list.add(policies);
        System.out.println("----MENU for Policy type----");
        System.out.println("1. Home Policy\n2. Health Policy");
        System.out.println("3. vehicle policy\n4. travel Insurance");
        System.out.println("Enter choice for Policy  : ");
        int choice = sc.nextInt();
            
        HomePolicy homepolicy = new HomePolicy();
        HealthPolicy healthpolicy = new HealthPolicy();
        VehiclePolicy vehiclepolicy = new VehiclePolicy();
        TravelInsurancePolicy travelinsurance = new TravelInsurancePolicy();
        
        switch ( choice )
        {
            case 1 : 
               // datalist= new ArrayList<String>();
                policyId++;
                homepolicy.setPolicyId(policyId);
                System.out.println("Enter premium amount");
                homepolicy.setPremium_amt(sc.nextInt());
                //list.add("Premium_amount");
                //list.add(String.valueOf(homepolicy.getPremium_amt()));
                System.out.println("Enter Plot area");
                homepolicy.setPlot_area(sc.nextInt());
                //list.add("Plot_Area");
                //list.add(String.valueOf(homepolicy.getPlot_area()));
                //hm.put(policyId, list);
                list.add(homepolicy);
                System.out.println(list);
                hm.put(policyId, list);
                System.out.println("Successfully applied for the policy...");
                break;
            case 2 : 
                //datalist= new ArrayList<String>();
                policyId++;
                healthpolicy.setPolicyId(policyId);
                //policyId++;
                System.out.println("Enter premium amount");
                healthpolicy.setPremium_amount(sc.nextInt());
                //list.add("Premium Amount");
                sc.nextLine(); 
                //list.add(String.valueOf(healthpolicy.getPremium_amount()));
                System.out.println("Enter blood group");
                healthpolicy.setBlood_group(sc.nextLine());
                //list.add("Blood_group");
               // list.add(String.valueOf(healthpolicy.getBlood_group()));
                list.add(healthpolicy);
                hm.put(policyId, list);
                System.out.println("Successfully applied for the policy...");
                break;
            case 3 : 
                //datalist= new ArrayList<String>();
                policyId++;
                vehiclepolicy.setPolicyId(policyId);
                //policyId++;
                System.out.println("Enter vehicle number");
                vehiclepolicy.setVehicleNo(sc.nextInt());
                //list.add("Vehicle_number");
                //list.add(String.valueOf(vehiclepolicy.getVehicleNo()));
                System.out.println("Enter licence number");
                vehiclepolicy.setLicenceNo(sc.nextInt());
                //list.add("Licence_Number");
                //list.add(String.valueOf(vehiclepolicy.getLicenceNo()));
                System.out.println("Enter vehicle type");
                vehiclepolicy.setVehicleType(sc.nextLine());
                //list.add("Vehicle Type");
                //list.add(String.valueOf(vehiclepolicy.getVehicleType()));
                System.out.println("Enter premium amount");
                vehiclepolicy.setPremium_amt(sc.nextInt()); 
                //list.add("Premium_Amount");
               // list.add(String.valueOf(vehiclepolicy.getPremium_amt()));
                list.add(vehiclepolicy);
                hm.put(policyId, list);
                System.out.println("Successfully applied for the policy...");
                break;
            case 4 : 
               // datalist= new ArrayList<String>();
                policyId++;
                travelinsurance.setPolicyId(policyId);
               // policyId++;
                System.out.println("Enter type of travel");
                travelinsurance.setType_of_travel(sc.nextLine());
                //list.add("Type_Of_travel");
                //list.add(String.valueOf(travelinsurance.getType_of_travel()));
                System.out.println("Enter the destination");
                travelinsurance.setCountry_travelling_to(sc.nextLine());
                //list.add("Destination");
                //list.add(String.valueOf(travelinsurance.getCountry_travelling_to()));
                System.out.println("Enter date of departure");
                travelinsurance.setDeparture_date(sc.nextLine());
                //list.add("Date_of_Departure");
                //list.add(String.valueOf(travelinsurance.getDeparture_date()));
                System.out.println("Enter date of arrival");
                travelinsurance.setArrival_date(sc.nextLine());
                //list.add("Date_of_Arrival");
                //list.add(String.valueOf(travelinsurance.getArrival_date()));
                System.out.println("Enter the number of days");
                travelinsurance.setNo_of_days(sc.nextInt());
                //list.add("No_Of_Days");
                //list.add(String.valueOf(travelinsurance.getNo_of_days()));
                System.out.println("Enter premium amount");
                travelinsurance.setPremium_amt(sc.nextInt());
                //list.add("Premium_amount");
                //list.add(String.valueOf(travelinsurance.getPremium_amt()));
                list.add(travelinsurance);
                hm.put(policyId, list);
                System.out.println("Successfully applied for the policy...");
            default : System.out.println("Oops !!!");
                break;
        }
    }
	
	void search(){
        System.out.println("Enter the policy Id : ");
        Scanner scanchoice = new Scanner(System.in);
        int policyId = scanchoice.nextInt();
        for(Entry<Integer, List<policy>> ls : hm.entrySet()){
        int key = ls.getKey();
        if ( key == policyId )
        {
            List<policy> values = ls.getValue();
            System.out.println("Policy Id : "+key);
            System.out.println("Name : "+values.get(0));
            System.out.println("Age : "+values.get(1));
            /*System.out.println("Address : "+values.get(2));
            System.out.println("Contact No : "+values.get(3));*/
            /*for(int i =4;i<values.size()-1;i+=2){
                System.out.println(values.get(i)+"  "+values.get(i+1));
            }*/
           
            break;
        }
        else 
            System.out.println("Not found !!!");
        }
    }

    void sort(){

        List<Entry<Integer, List<policy>>> meList = (List<Entry<Integer, List<policy>>>) new ArrayList<>(hm.entrySet());
        //List<Map.Entry<String, List<String>>> meList = new ArrayList<>(hm.entrySet());
        Collections.sort(meList, new Mycomparator(param));

        for(Map.Entry me : meList) {
            System.out.println(me.getKey() + " = " + me.getValue());
        }
    }

  /* void sort2() {
        List<Map.Entry<Integer,List<Object>>> entries = new ArrayList<Map.Entry<Integer,List<Object>>>(hm.entrySet());

        Collections.sort(entries, new Comparator<Map.Entry<Integer,List<Object>>>() {
            public int compare(Map.Entry<Integer,List<Object>> l1, Map.Entry<Integer,List<Object>> l2) {
                return ((Integer) l1.getValue().get(0)).compareTo((Integer) l2.getValue().get(0));
            }
        });

        for (Entry<Integer, List<Object>> e : entries) {
            System.out.println(e.getKey() + " : [" + e.getValue().get(0)
                                          + ", " + e.getValue().get(1) + "]");
        }
    }*/


}
