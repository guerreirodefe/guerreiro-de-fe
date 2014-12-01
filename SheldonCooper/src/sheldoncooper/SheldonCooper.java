package sheldoncooper;

import javax.swing.JOptionPane;


public class SheldonCooper {

    public static void main(String[] args) 
    {
        
        Heroi h = new Heroi();
        
        h.setNome("Hulk");
        h.setEditora("Marvel");
        h.setDatap("1950");
        h.setPoder("Super Força");
        h.setAlterego("Dr.Bruce");
        h.setFavorito(false);
        
        Heroi ca = new Heroi();
        
        ca.setNome("Capitão América");
        ca.setEditora("Marvel");
        ca.setDatap("1940");
        ca.setPoder("Nunca envelhece");
        ca.setAlterego("Steve Roger");
        ca.setFavorito(false);
        
        Heroi hf = new Heroi();
        
        hf.setNome("Homem de ferro");
        hf.setEditora("Marvel");
        hf.setDatap("2010");
        hf.setPoder("Voar");
        hf.setAlterego("Tony Stark");
        hf.setFavorito(false);
        
        Vilao lo = new Vilao();
        
        lo.setNome("Loki");
        lo.setEditora("Marvel");
        lo.setDatap("2000");
        lo.setPoder("Mágia");
        lo.setInimigo("Thor");
        
        
        Heroi b = new Heroi();
        
        b.setNome("Batman");
        b.setEditora("DC");
        b.setDatap("");
        b.setPoder("Inteligência");
        b.setFavorito(false);
        b.setAlterego("Bruce");
        
        Heroi sm = new Heroi();
        
        sm.setNome("Super Homem");
        sm.setEditora("DC");
        sm.setDatap("1930");
        sm.setPoder("Visão a laser");
        sm.setFavorito(false);
        sm.setAlterego("Clark Cand");
        
        Heroi lv = new Heroi();
        
        lv.setNome("Lanterna verde");
        lv.setEditora("DC");
        lv.setDatap("1950");
        lv.setPoder("Anel");
        lv.setAlterego("Howard Jordan");
        lv.setFavorito(true);
        
        Vilao co = new Vilao();
        
        co.setNome("Coringa");
        co.setEditora("DC");
        co.setDatap("1940");
        co.setPoder("Artimanha");
        co.setInimigo("Batman");
        
        Vilao ll = new Vilao();
        
        ll.setNome("Lex Luthor");
        ll.setEditora("DC");
        ll.setDatap("1990");
        ll.setPoder("Dinheiro");
        ll.setInimigo("Super Homem");
        
        Filme vingadores = new Filme ();
        
        vingadores.setNome("Vingadores");
        
        vingadores.personagens.add(h);
        vingadores.personagens.add(ca);
        vingadores.personagens.add(hf);
        vingadores.personagens.add(lo);
        
        Filme superman = new Filme ();
        
        superman.setNome("Super Man vs Batman");
        
        superman.personagens.add(b);
        superman.personagens.add(sm);
        superman.personagens.add(lv);
        superman.personagens.add(co);
        superman.personagens.add(ll);
        
        JOptionPane.showMessageDialog(null, vingadores.listarTodos());
        JOptionPane.showMessageDialog(null, superman.listarTodos());
        
    }
    
}
