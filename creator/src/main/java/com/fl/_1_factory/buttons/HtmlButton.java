package com.fl._1_factory.buttons;

/**
 * 网页按钮实现类
 *
 * @author <a href="mailto:fulu@witsky.cn">FuLu</a>
 * @since 2023/9/21 14:07
 */
public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
 