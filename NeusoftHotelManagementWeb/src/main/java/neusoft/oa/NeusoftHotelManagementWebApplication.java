package neusoft.oa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages= {"neusoft.oa.hr.mapper"})
public class NeusoftHotelManagementWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeusoftHotelManagementWebApplication.class, args);
	}

}
