import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class ManageStudents {
    ArrayList<Student> studens=new ArrayList<>();
    public void Add(Student s)
    {
        studens.add(s);
    }
    public int lenght()
    {
        return studens.size();
    }
    public void Show()
    {
        for(int i=0;i<studens.size();i++){
            studens.get(i).Show();
        }
    }
    public void writeStudentFile(String filename) {
        File file=new File(filename);
        try {
            //FileWriter fileWriter = new FileWriter(file,true);
            PrintWriter printWriter=new PrintWriter(file);
            for (int i = 0; i < studens.size(); i++) {
                printWriter.println(studens.get(i).getIdStudent());
                printWriter.println(studens.get(i).getFullName());
                printWriter.println(studens.get(i).getAge());
                printWriter.println(studens.get(i).getAvg());
                //fileWriter.close();
            }
            printWriter.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public void readStudentFile(String filename) {
        File file= new File(filename);
        try {
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                var id=fileScanner.nextLine();
                var fullname=fileScanner.nextLine();
                var birthday=fileScanner.nextLine();
                //var age=Integer.parseInt(fileScanner.nextLine());
                var avg=Double.parseDouble(fileScanner.nextLine());
                Student s=new Student();
                s.setFullName(id,fullname,avg,birthday);
                studens.add(s);
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
