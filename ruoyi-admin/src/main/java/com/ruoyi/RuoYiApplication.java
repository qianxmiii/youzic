package com.ruoyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author ruoyi
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class RuoYiApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(RuoYiApplication.class, args);
        System.out.println(" wechat_bot启动成功！         88                                88                              \n" +
                "                                         88                       ,d       88                       ,d     \n" +
                "                                         88                       88       88                       88     \n" +
                "8b      db      d8  ,adPPYba,  ,adPPYba, 88,dPPYba,  ,adPPYYba, MM88MMM    88,dPPYba,   ,adPPYba, MM88MMM  \n" +
                "`8b    d88b    d8' a8P_____88 a8\"     \"\" 88P'    \"8a \"\"     `Y8   88       88P'    \"8a a8\"     \"8a  88     \n" +
                " `8b  d8'`8b  d8'  8PP\"\"\"\"\"\"\" 8b         88       88 ,adPPPPP88   88       88       d8 8b       d8  88     \n" +
                "  `8bd8'  `8bd8'   \"8b,   ,aa \"8a,   ,aa 88       88 88,    ,88   88,      88b,   ,a8\" \"8a,   ,a8\"  88,    \n" +
                "    YP      YP      `\"Ybbd8\"'  `\"Ybbd8\"' 88       88 `\"8bbdP\"Y8   \"Y888    8Y\"Ybbd8\"'   `\"YbbdP\"'   \"Y888  ");
    }
}