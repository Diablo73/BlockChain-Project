package io.diablo73.blockchain.blockchaincommon.models;

import io.diablo73.blockchain.blockchaincommon.constants.BlockChainConstants;
import io.diablo73.common.utils.HashUtil;
import lombok.Data;

import java.util.Date;

@Data
public class Block {

	private int id;
	private int nonce;
	private long timeStamp;
	private String hash;
	private String previousHash;
	private String transaction;
	
	public Block(int id, String transaction, String previousHash) {
		this.id = id;
		this.transaction = transaction;
		this.previousHash = previousHash;
		this.timeStamp = new Date().getTime();
		this.hash = generateHash();
	}

	public String generateHash() {
		String dataToHash = id + BlockChainConstants.UNDERSCORE +
				timeStamp + BlockChainConstants.UNDERSCORE +
				previousHash + BlockChainConstants.UNDERSCORE +
				nonce + BlockChainConstants.UNDERSCORE +
				transaction;
		return HashUtil.generateSHA256Hash(dataToHash);
	}
	
	public void incrementNonce() {
		this.nonce++;
	}

	@Override
	public String toString() {
		return this.id + BlockChainConstants.UNDERSCORE + this.nonce + BlockChainConstants.UNDERSCORE + this.timeStamp
				+ BlockChainConstants.UNDERSCORE + this.hash + BlockChainConstants.UNDERSCORE + this.previousHash
				+ BlockChainConstants.UNDERSCORE + this.transaction;
	}
}
