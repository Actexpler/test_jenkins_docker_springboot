package com.example.demo.dataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @author wangzongcheng
 * @ClassName MainDataSourceConfiguration.java
 * @Description TODO
 * @createTime 2020-08-18- 16:19:00
 */
@MapperScan(basePackages = "com.example.demo.mapper", sqlSessionTemplateRef = "mainSqlSessionTemplate")
@Configuration
public class MainDataSourceConfiguration {
    @Bean(name = "mainDataSource")
    @ConfigurationProperties(prefix = "data.source.daily")
    @Primary
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    /**
     * 从配置文件中 读取mybatis.configuration 生成config
     * @return
     */
    @Bean(name = "mainConfig")
    @ConfigurationProperties(prefix = "mybatis.configuration")
    @Primary
    public org.apache.ibatis.session.Configuration globalConfiguration() {
        return new org.apache.ibatis.session.Configuration();
    }

    @Bean(name = "mainSqlSessionFactory")
    @Primary
    public SqlSessionFactory dbSqlSessionFactory(@Qualifier("mainDataSource")DataSource dataSource,
                                                 @Qualifier("mainConfig")org.apache.ibatis.session.Configuration config) throws  Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        //bean.setConfiguration(config);  //设置properties文件中的配置
        bean.setConfigLocation(new PathMatchingResourcePatternResolver().getResource("classpath:mybatis/mybatis-config.xml"));
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:mybatis/mapper/*.xml"));
//        bean.setTypeAliasesPackage("com.example.demo.pojo");
        return bean.getObject();
    }

    @Bean(name = "mainTransactionmanager")
    @Primary
    public DataSourceTransactionManager mainTransactionManager(@Qualifier("mainDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "mainSqlSessionTemplate")
    @Primary
    public SqlSessionTemplate dbSqlSessionTemplate(@Qualifier("mainSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
