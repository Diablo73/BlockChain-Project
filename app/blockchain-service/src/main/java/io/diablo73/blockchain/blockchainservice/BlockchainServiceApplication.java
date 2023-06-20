package io.diablo73.blockchain.blockchainservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@Slf4j
@ComponentScan(basePackages = {"io.diablo73.blockchain.*"})
@SpringBootApplication
public class BlockchainServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlockchainServiceApplication.class, args);
	}

}
