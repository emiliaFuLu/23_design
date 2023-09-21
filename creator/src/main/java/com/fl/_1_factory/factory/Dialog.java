package com.fl._1_factory.factory;

import com.fl._1_factory.buttons.Button;

/**
 * 工厂
 *
 * @author <a href="mailto:fulu@witsky.cn">FuLu</a>
 * @since 2023/9/21 14:09
 */
public abstract class Dialog {
    public void renderWindow() {
        // ... other code ...

        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    public abstract Button createButton();
}
 