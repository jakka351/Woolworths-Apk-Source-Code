package com.adobe.marketing.mobile.services;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AppState {
    public static final /* synthetic */ AppState[] d = {new AppState("FOREGROUND", 0), new AppState("BACKGROUND", 1), new AppState("UNKNOWN", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    AppState EF5;

    public static AppState valueOf(String str) {
        return (AppState) Enum.valueOf(AppState.class, str);
    }

    public static AppState[] values() {
        return (AppState[]) d.clone();
    }
}
