package br.eti.kinoshita.ejb_tests.ejbs;

import javax.ejb.Local;
import javax.ejb.Stateless;

@Stateless(mappedName = "CatServiceImpl")
@Local(CatService.class)
public class CatServiceImpl implements CatService {

    @Override
    public String meow() {
        return "Miau"; // a portuguese cat meows...
    }

}
