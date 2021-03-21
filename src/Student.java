import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;

public class Student {
    private String idStudent;
    private FullName fullname;
    private  int age;
    private  double avg;
    private LocalDate birthday;

    public  Student()
    {
    }

    public Student(String idStudent, FullName fullname, int age, double avg,LocalDate birthday) {
        this.idStudent = idStudent;
        this.fullname = fullname;
        this.age = age;
        this.avg = avg;
        this.birthday=birthday;
    }

    public LocalDate setBirthday(String birthday) {
		LocalDate Birthday=LocalDate.parse(birthday);
		//DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/uuuu");
		//Birthday=formatter.format(Birthday);
		return Birthday;
	}
    
    public int setAge() {
            LocalDate nowDate=LocalDate.now();
            if(nowDate.getMonthValue()>birthday.getMonthValue()) {
            	return (nowDate.getYear()-birthday.getYear());
            } else if(nowDate.getMonthValue()==birthday.getMonthValue()&&
            		nowDate.getDayOfMonth()>=birthday.getDayOfMonth()) {
            	return (nowDate.getYear()-birthday.getYear());
            } else return (nowDate.getYear()-birthday.getYear()-1);
	}
    
    public void setFullName(String idStudent, String fullName, double avg,String birthday)
    {
        String[] names=fullName.split(" ");
        FullName myName=new FullName();
        myName.first=names[names.length-1];
        myName.last=names[0];
        myName.mid="";
        for(int i=1;i<names.length-1;i++){
            myName.mid+=" "+names[i];
        }
        this.fullname=myName;
        this.idStudent = idStudent;
        this.avg = avg;
        this.birthday=this.setBirthday(birthday);
        this.age=this.setAge();
    }
   
    public String getFullName(){
        String s="";
        s=fullname.last+fullname.mid+" "+fullname.first;
        return s;
    }

    public void Show()
    {
        fullname.Show();
        System.out.println("  "+this.idStudent+"  "+this.age+"  "+this.avg);
    }

    public double getAvg() {
        return avg;
    }

    public int getAge() {
        return age;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public class FullName{
        private String first;
        private String last;
        private String mid;
        public void Show()
        {
            System.out.print(" "+this.last+this.mid+" "+this.first);
        }
    }
}
