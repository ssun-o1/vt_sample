package com.sun.improve;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static com.sun.corba.se.impl.util.Version.PROJECT_NAME;


@RunWith(SpringRunner.class)
@SpringBootTest
class ImproveApplicationTests {

    private final static String DATABASE_NAME = "improve";
    private static String PROJECT_NAME = "improve";

    @Test
    void contextLoads() {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();
        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://39.97.106.72:3306/" + DATABASE_NAME + "?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=GMT%2B8");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        mpg.setDataSource(dsc);
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir") + "/";
        gc.setOutputDir(projectPath + PROJECT_NAME + "/src/main/java/");
        gc.setIdType(IdType.AUTO); // 组件生成策略，自增长id
        gc.setAuthor("2Mins_");//作者
        gc.setFileOverride(true); //覆盖现有的
        gc.setOpen(false); //是否生成后打开
        gc.setDateType(DateType.ONLY_DATE);
        mpg.setGlobalConfig(gc);
        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.sun.improve.mybatis"); //父包名，可以设置其他包

        mpg.setPackageInfo(pc);
        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true); //使用lombok
        strategy.setEntitySerialVersionUID(true);// 实体类的实现接口Serializable
        strategy.setRestControllerStyle(true); // @RestController
        strategy.setControllerMappingHyphenStyle(true);//驼峰转联字符
        strategy.setTablePrefix("tb_"); // 去掉表前缀实体类，如tb_Member转化过来就是Member
        mpg.setStrategy(strategy);

        mpg.execute();
    }


}
