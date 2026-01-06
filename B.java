import static test_repo.A.*;
public class B {
    void x(){
        y();
        z();
    }
    void y(){
        A.a();
    }
    void z(){}
    
}
