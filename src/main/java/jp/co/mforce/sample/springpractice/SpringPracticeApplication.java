package jp.co.mforce.sample.springpractice;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPracticeApplication.class, args);
	}

	/**
	 * Thymeleaf Layout Dialect を有効にするための Bean 定義
	 *
	 * @return レイアウト定義
	 */
	@Bean
	public LayoutDialect layoutDialect() {
		return new LayoutDialect();
	}
}
