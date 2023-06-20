package io.diablo73.blockchain.blockchaincommon.config;

import io.diablo73.blockchain.blockchaincommon.constants.BlockChainConstants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BlockChainConfigs {

	@Value("${blockChain.difficulty:4}")
	private void setDIFFICULTY(int difficulty) {
		BlockChainConstants.DIFFICULTY = difficulty;
	}
}
