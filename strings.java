public class strings{
	public static void main(String[] args) {
		String s = "Java";
		String u="Randoma";
		u=u.toLowerCase();
		String t =new String("Java");
		System.out.println(s==t);
		System.out.println(s.equals(t));

		System.out.println(s.substring(1,2));
		String x = "aeiou";
		int count=0;
		for(int i=0; i<u.length(); i++) {
			for(int j=0; j<x.length(); j++) {
				if(u.charAt(i)==x.charAt(j)) {
					count+=1;
				}
			}
		}
		System.out.println("Vowelcount:"+count);
		
	}
}