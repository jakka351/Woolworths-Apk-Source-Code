package com.swrve.sdk.notifications.model;

/* loaded from: classes6.dex */
public class SwrveNotificationButton {
    private String action;
    private ActionType actionType;
    private String title;

    public enum ActionType {
        OPEN_URL,
        OPEN_APP,
        OPEN_CAMPAIGN,
        DISMISS
    }

    public String getAction() {
        return this.action;
    }

    public ActionType getActionType() {
        return this.actionType;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setActionType(ActionType actionType) {
        this.actionType = actionType;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
