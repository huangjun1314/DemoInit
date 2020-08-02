package org.sang.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @MapperScan 注解中指定Mapper接口所在的位置，
 * 同时指定sqlSessionFactory的实例名，
 * 则该位置下的Mapper将使用sqlSessionFactory实例。
 *
 * 提供sqlSessionFactory的实例，直接创建出来，同时将DataSource的实例设置给sqlSessionFactory，
 * 这里创建的sqlSessionFactory实例也就是@MapperScan注解中sqlSessionFactoryRef参数指定的实例。
 *
 * 提供一个SqlSessionTemplate实例。
 * 这是一个线程安全类，主要用来管理MyBatis中的SqlSession操作
 * */

@Configuration
@MapperScan(value = "org.sang.mapper1", sqlSessionFactoryRef = "sqlSessionFactoryBean1")
public class MyBatisConfigOne {

    @Autowired
    @Qualifier("dsOne")
    DataSource dsOne;

    @Bean
    SqlSessionFactory sqlSessionFactoryBean1() throws Exception{
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dsOne);
        return factoryBean.getObject();
    }

    @Bean
    SqlSessionTemplate sqlSessionTemplate1() throws Exception{
        return new SqlSessionTemplate(sqlSessionFactoryBean1());
    }

}
