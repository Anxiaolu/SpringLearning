/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.softlab.springlearning1;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

/**
 * ①@Configuration声明当前类是一个配置类.
 * ②使用@componentScan,自动扫描报名下所有使用@Service,@component,@repository
 * ,和@Controller的类,并注册为Bean
 *
 * @author huanlu
 */
@Configurable
@ComponentScan("cn.edu.sdut.softlab.springlearning1")
public class DiConfig {

}
