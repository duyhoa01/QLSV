import javax.management.remote.SubjectDelegationPermission;

public class main {
    public static void main(String[] args) {
        ManageStudents M=new ManageStudents();
        M.readStudentFile("input.txt");
        M.Show();
        M.writeStudentFile("output.txt");
    }
}
