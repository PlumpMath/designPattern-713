package ResponsibilityPattern;

/**
 * Created by kang on 17/4/24.
 */

/**
 * 经理报销
 */
public class ProjectHandler extends ConsumeHandler {


    @Override
    public void doHandler(String user, double free) {

        if (free<500){
            if (user.equals("lwx")){
                System.out.println("经理报销通过 "+ free);
            }else {
                System.out.println("报销不通过！");
            }
        }else if (getNextHandler()!=null){
            getNextHandler().doHandler(user,free);
        }

    }

}
