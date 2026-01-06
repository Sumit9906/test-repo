import static test_repo.A.*;
public class B {
    void x(){
        y();
    }
    void y(){
        A.a();
    }
}
