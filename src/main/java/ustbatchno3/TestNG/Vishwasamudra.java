package ustbatchno3.TestNG;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Vishwasamudra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		
		vishwadetails tvm = new vishwadetails("Tvm",1600,800);
		vishwadetails chennai = new vishwadetails("Chennai",1800,1000);
		vishwadetails hyd = new vishwadetails("Hyderabad",2000,900);
		vishwadetails mumbai = new vishwadetails("Mumbai",2500,800);
		vishwadetails kochi = new vishwadetails("Kochi",1800,1200);
		
		System.out.println("Enter city : ");
		String cityy = n.nextLine();
		
		String city = cityy.toLowerCase();
		
		System.out.println("Enter sqft : ");
		int sqft = n.nextInt();
		
		List<vishwadetails> lst = Arrays.asList(tvm,chennai,hyd,mumbai,kochi);
		//lst.forEach(t->System.out.println(t));
		
		System.out.println("With or without material : (1 or 2 choose) : ");
		int ch = n.nextInt();
		
		int ans = vishwa(lst,ch,city,sqft);
		
		System.out.println(ans);
		
		n.close();
		
	}
	
	public static int vishwa(List<vishwadetails> lst, int ch,String city,int sqft) {
		List<vishwadetails> ls = lst.stream().filter(t->city.equals(t.getCity().toLowerCase())).toList();
		//ls.forEach(t->System.out.println("City : " + t.getCity() + "\nPrice with material : " + sqft*t.getPricewithmat() + "\nPrice without material : " +  sqft*t.getPricewithoutmat() + "\n"));
		int price=0;
		
		
		switch(ch) {
		case 1 : for(vishwadetails v : ls)
					price = v.getPricewithmat()*sqft;
				break;
				
		case 2 : for(vishwadetails v : ls)
					price = v.getPricewithoutmat()*sqft;
				break;
		default : System.out.println("break");price=3;
				break;
		}
		
		return price;
	}

}
