package br.mil.mar.amrj.ad06.controller;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.mil.mar.amrj.ad06.DAO.PermissaoAcessoDao;
import br.mil.mar.amrj.ad06.model.PermissaoAcesso;

@RestController
@RequestMapping(value = "/api/permissao/")
public class PermissaoAcessoController {
	
	@Autowired
	PermissaoAcessoDao permissaoDao;

	@GetMapping(value = "idSess")
	public ResponseEntity<Serializable> getPermissao(@RequestParam String idSess) {
		
		if(idSess == null || idSess.isEmpty())
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).build();
		
		Optional<PermissaoAcesso> permissao = permissaoDao.getPermissao(idSess);
		
		if(permissao.isPresent())
			return ResponseEntity.ok().body(permissao.get());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
}
