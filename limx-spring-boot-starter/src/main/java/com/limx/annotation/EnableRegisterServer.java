package com.limx.annotation;

import com.limx.config.ConfigMarker;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 启用自动配置类
 * 1、创建自动生成声明 new Object.var
 * 2、Alt+Insert     生成代码(如get,set方法,构造函数等)
 * 或者右键（Generate）
 * 3、Ctrl+Alt+T     生成try catch
 * 4、Alt+enter      （可以将代码封装成方法）
 * 5、CTRL+E      最近更改的代码
 * 6、Ctrl+Shift+J    整合两行为一行
 * 7、CTRL+ALT+L      格式化代码
 * 8、CTRL+ALT+I      自动缩进
 * 9、Ctrl+Shift+上下键  上下移动代码
 * 10、Ctrl+H 显示类结构图
 * 11、Ctrl+Q 显示注释文档
 * 12、Alt+1 快速打开或隐藏工程面板
 * 13、Alt+ left/right 切换代码视图
 * 14、ALT+ ↑/↓  在方法间快速移动定位
 *
 * @author 麦田科技 2021/9/1
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(ConfigMarker.class)
public @interface EnableRegisterServer {
}
