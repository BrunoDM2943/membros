package test.br.com.migresc.membros;

import static org.junit.Assert.*;

import br.com.migresc.membros.Membro;
import org.junit.Test;

public class PrimaryTest {

    @Test
    public void test(){
        Membro membro = new Membro();
        membro.setNome("Bruno");
        assertEquals("Bruno", membro.getNome());
    }

}
