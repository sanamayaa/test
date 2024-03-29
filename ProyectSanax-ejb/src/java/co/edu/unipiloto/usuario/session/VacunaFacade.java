/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.usuario.session;

import co.edu.unipiloto.usuario.entity.Vacuna;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jorge_j3qr4sd
 */
@Stateless
public class VacunaFacade extends AbstractFacade<Vacuna> implements VacunaFacadeLocal {

    @PersistenceContext(unitName = "UsuarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VacunaFacade() {
        super(Vacuna.class);
    }
    
}
