package com.fl._1_factory.factory;

import com.fl._1_factory.buttons.Button;
import com.fl._1_factory.buttons.HtmlButton;

/**
 * 网页按钮生成工厂
 *
 * @author <a href="mailto:fulu@witsky.cn">FuLu</a>
 * @since 2023/9/21 14:10
 */
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
 