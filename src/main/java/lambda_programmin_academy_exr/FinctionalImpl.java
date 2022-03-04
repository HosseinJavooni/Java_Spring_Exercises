package lambda_programmin_academy_exr;

public class FinctionalImpl implements Functional {
    @Override
    public int doSome(int a, int b) {
        System.out.println("this is functionalImpl");
        return a + b;
    }
}
