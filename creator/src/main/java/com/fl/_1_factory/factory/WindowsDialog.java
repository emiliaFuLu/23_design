package com.fl._1_factory.factory;

import com.fl._1_factory.buttons.Button;
import com.fl._1_factory.buttons.WindowsButton;

/**
 * Windows 按钮生成工厂
 *
 * @author <a href="mailto:fulu@witsky.cn">FuLu</a>
 * @since 2023/9/21 14:23
 */
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}