package io.diablo73.blockchain.blockchaincommon.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class BlockChain {

	private List<Block> blockChain = new ArrayList<>();

	public void addBlock(Block block) {
		this.blockChain.add(block);
	}
	
	public int getSize() {
		return this.blockChain.size();
	}

	public Block getLatestBlock() {
		return this.blockChain.get(getSize() - 1);
	}
	
	@Override
	public String toString() {
		StringBuilder blockChainString = new StringBuilder();
		for (Block block : this.blockChain) {
			blockChainString.append(block.toString()).append("\n");
		}
		return blockChainString.toString();
	}
}
