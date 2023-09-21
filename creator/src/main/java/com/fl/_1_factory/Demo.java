package com.fl._1_factory;

import com.fl._1_factory.factory.Dialog;
import com.fl._1_factory.factory.HtmlDialog;
import com.fl._1_factory.factory.WindowsDialog;

/**
 * @author <a href="mailto:fulu@witsky.cn">FuLu</a>
 * @since 2023/9/21 14:23
 */
public class Demo {

    public static void main(String[] args) {
        Dialog dialog;

        if (System.getProperty("os.name").equals("Windows 11")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }

        dialog.renderWindow();
    }
}
 