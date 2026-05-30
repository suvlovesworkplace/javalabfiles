import nast.NastCollege;
import nast.engineering.EngineeringInfo;

public class Launchernast {

    public static void main(String[] args) {
            NastCollege clz = new NastCollege();
            EngineeringInfo e1 = new EngineeringInfo();
            String clzName =clz.getCollegeName();
            String stdName=clz.getStudentName();
            String lNumber = e1.getLiscenseNumber();
            String rInfo = e1.getRegistratoinInfo();

            System.out.println(clzName + " \n"+ stdName + " \n"+ lNumber + " \n"+ rInfo);
    }
}