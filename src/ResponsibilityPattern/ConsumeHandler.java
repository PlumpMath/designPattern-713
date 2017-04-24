package ResponsibilityPattern;

/**
 * Created by kang on 17/4/24.
 */
abstract class ConsumeHandler {
    private ConsumeHandler nextHandler;

    public ConsumeHandler getNextHandler(){
        return nextHandler;
    }
    public  void setNextHandler(ConsumeHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    /**
     *
     * @param user 申请人
     * @param free 报销费用
     */
     public abstract void doHandler(String user,double free);

}
