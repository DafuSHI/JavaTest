import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;



public class Test {

	public static HashMap<String,String> common(HashMap<String,String> a,HashMap<String,String> b){
		HashMap<String,String> c = new HashMap<String,String>();
		for (Entry<String, String> entryA : a.entrySet()) {
			entryA.getKey();
			entryA.getValue();
			if(b.get(entryA.getKey())==entryA.getValue()){
				c.put(entryA.getKey(), entryA.getValue());
				System.out.println("good news,"+entryA.getKey()+"\t"+entryA.getValue()+" is put");
			}
		}
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String token = "95ccff2dab5f48cc932dfc1e9fe398a9";
		System.out.println("Hello world");
		HashMap<String,String> A = new HashMap<String,String>();
		if(A.isEmpty()){
			System.out.println("I'm vide!!!!!!!!!!!!");
		}
		A.put("hostname", "ci-lb-dmz-dns-l2-stealth-lb-l2-slave-dmz-1-2-aaa-v.cloud.arkea.com");
		A.put("process_name", "named");
		A.put("service", "bind");
		if(A.isEmpty()){
			System.out.println("I'm vide!!!!!!!!!!!!");
		}
		HashMap<String,String> B = new HashMap<String,String>();
		B.put("hostname", "ci-lb-dmz-dns-l2-stealth-l2-mstealth-1-aaa-v.cloud.arkea.com");
		B.put("process_name", "named");
		B.put("service", "bind");
		HashMap<String,String> C = new HashMap<String,String>();
		C.put("hostname", "ci-rpxy-dmz-dns-l2-stealth-lb-l2-slave-dmz-1-2-aaa-v.cloud.arkea.com");
		C.put("process_name", "named");
		C.put("service", "bind");
		HashMap<String,String> D = new HashMap<String,String>();
		D.putAll(A);
		D = common(D,B);
		D = common(D,C);
		for (Entry<String, String> entryD : D.entrySet()) {
			System.out.println(entryD.getKey()+" "+entryD.getValue());		
		}
		
	}

}
