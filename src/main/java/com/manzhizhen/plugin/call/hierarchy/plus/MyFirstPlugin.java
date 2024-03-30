package com.manzhizhen.plugin.call.hierarchy.plus;

import com.intellij.notification.*;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.MessageType;

public class MyFirstPlugin extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        System.out.println(e);
        // 获取或创建通知组
        NotificationGroup notificationGroup = new NotificationGroup("my_first", NotificationDisplayType.BALLOON, true);
        // 创建通知
        Notification notification = notificationGroup.createNotification("点击测试", MessageType.INFO);
        // 显示通知
        Notifications.Bus.notify(notification);
    }
}
