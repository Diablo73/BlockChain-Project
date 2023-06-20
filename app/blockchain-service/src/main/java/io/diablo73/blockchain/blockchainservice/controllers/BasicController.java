package io.diablo73.blockchain.blockchainservice.controllers;

import io.diablo73.blockchain.blockchaincommon.constants.APIPathConstants;
import io.diablo73.blockchain.blockchaincommon.constants.BlockChainConstants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class BasicController {

	@GetMapping({APIPathConstants.BLANK, APIPathConstants.DEFAULT_MESSAGE})
	public ResponseEntity<String> getDefaultMessage() {
		Date date = new Date();
		return new ResponseEntity<String>(
				"Welcome to the BlockChain Service Application!!!" +
						"<br>" +
						"Started Successfully at Time : " + date,
				HttpStatus.OK);
	}
}