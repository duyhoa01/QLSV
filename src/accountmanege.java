import java.util.ArrayList;

//import jdk.internal.org.jline.reader.impl.history.DefaultHistory;

public class accountmanege {
	ArrayList<account> arrayList=new ArrayList<account>();
	
	public void add(account a) {
		arrayList.add(a);
	}
	
	public accountmanege() {
		// TODO Auto-generated constructor stub
	}
	
	public account getat(int i) {
		return arrayList.get(i);
	}
	
	public int Size() {
		return arrayList.size();
	}
	
	public String getName(int i) {
		return arrayList.get(i).getName();
	}
	
	public String getPass(int i) {
		return arrayList.get(i).getPassword();
	}
}
