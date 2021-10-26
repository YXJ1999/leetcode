package dome;

public class SingletonPattern {
//    public SingletonPattern singletonPattern=new SingletonPattern();
//    private SingletonPattern(){
//    }
//    public SingletonPattern getSingletonPattern(){
//        return singletonPattern;
//    }
//******************************
//    public SingletonPattern singletonPattern;
//    public SingletonPattern(){
//
//    }
//    public synchronized SingletonPattern getSingletonPattern(){
//        if(singletonPattern==null){
//            singletonPattern=new SingletonPattern();
//        }
//        return singletonPattern;
//    }
// ***********************************
    public volatile SingletonPattern singletonPattern;
    public SingletonPattern(){
    }
    public SingletonPattern getSingletonPattern(){
        if(singletonPattern==null) {
            synchronized (SingletonPattern.class) {
                if (singletonPattern == null) {
                    singletonPattern = new SingletonPattern();
                }
            }
        }
        return singletonPattern;

    }
}
