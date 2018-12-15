package com.yb.provider.service.providerservice.config;

        import org.springframework.boot.autoconfigure.AutoConfigureAfter;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;
        import tk.mybatis.spring.mapper.MapperScannerConfigurer;

@Configuration
//TODO 注意，由于MapperScannerConfigurer执行的比较早，所以必须有下面的注解(一定要加这句话，不然DataSourceConfig从配制中心打不到数据库信息)
@AutoConfigureAfter(MyBatisConfig.class)
public class MyBatisMapperScannerConfig {

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("com.yb.provider.service.providerservice.mapper");
        return mapperScannerConfigurer; }

}
