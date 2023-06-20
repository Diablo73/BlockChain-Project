package io.diablo73.blockchain.blockchaincommon.models;

import io.diablo73.blockchain.blockchaincommon.constants.BlockChainConstants;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
public class Miner {

	private double reward;
	
	public void mine(Block block, BlockChain blockChain) {
		while (!isGoldenHash(block)) {
			block.incrementNonce();
			block.setHash(block.generateHash());
			print1Mil(block);
		}
		
		System.out.println("BLOCK has been mined.....");
		System.out.println("Hash : " + block.getHash());
		System.out.println("Block : " + block);

		blockChain.addBlock(block);
		reward += BlockChainConstants.MINER_REWARD;
	}

	public boolean isGoldenHash(Block block) {
		String leadingZeros = "0".repeat(BlockChainConstants.DIFFICULTY);
		return StringUtils.equals(block.getHash().substring(0, BlockChainConstants.DIFFICULTY), leadingZeros);
	}

	private void print1Mil(Block block) {
		if (block.getNonce() % 1000000 == 0) {
			System.out.println("Miner.print1Mil : " + block.getId() + " : nonce : " + block.getNonce());
		}
	}
}
