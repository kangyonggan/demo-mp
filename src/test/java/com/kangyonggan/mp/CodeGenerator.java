package com.kangyonggan.mp;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.kangyonggan.mp.controller.BaseController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

/**
 * 代码生成器
 *
 * @author kyg
 */
public class CodeGenerator extends AbstractTest {

    /**
     * 表名
     */
    private static final String TABLE_NAME = "login_log";

    /**
     * 作者
     */
    private static final String AUTHOR = System.getProperty("user.name");

    @Autowired
    private Environment environment;

    /**
     * 1. 生成Model.java（lombok）、Mapper.xml、Mapper.java
     * 2. Controller继承BaseController
     */
    @Test
    public void codeGenerate() {
        AutoGenerator generator = new AutoGenerator();

        String projectPath = this.getClass().getResource("/").getPath();
        projectPath = projectPath.substring(0, projectPath.indexOf("target") - 1);
        String basePackage = CodeGenerator.class.getPackage().getName();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor(AUTHOR);
        gc.setOpen(false);
        gc.setBaseResultMap(true);
        gc.setBaseColumnList(true);
        gc.setFileOverride(true);
        generator.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDriverName(environment.getProperty("spring.datasource.driver-class-name"));
        dsc.setUrl(environment.getProperty("spring.datasource.url"));
        dsc.setUsername(environment.getProperty("spring.datasource.username"));
        dsc.setPassword(environment.getProperty("spring.datasource.password"));
        generator.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent(basePackage);
        generator.setPackageInfo(pc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setInclude(TABLE_NAME);
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);
        strategy.setSuperControllerClass(BaseController.class);
        strategy.setRestControllerStyle(true);
        generator.setStrategy(strategy);

        // 执行
        generator.execute();
    }
}
