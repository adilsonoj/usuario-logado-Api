package br.mil.mar.amrj.ad06.DAO;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.mil.mar.amrj.ad06.model.PermissaoAcesso;

@Repository
public class PermissaoAcessoDao {

	@PersistenceContext
	EntityManager manager;
	
	public Optional<PermissaoAcesso> getPermissao(String idSess) {
		return Optional.ofNullable(manager.find(PermissaoAcesso.class, idSess));
	}
}
