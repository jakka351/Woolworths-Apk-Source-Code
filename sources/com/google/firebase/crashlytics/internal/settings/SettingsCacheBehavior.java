package com.google.firebase.crashlytics.internal.settings;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
final class SettingsCacheBehavior {
    public static final SettingsCacheBehavior d;
    public static final SettingsCacheBehavior e;
    public static final SettingsCacheBehavior f;
    public static final /* synthetic */ SettingsCacheBehavior[] g;

    static {
        SettingsCacheBehavior settingsCacheBehavior = new SettingsCacheBehavior("USE_CACHE", 0);
        d = settingsCacheBehavior;
        SettingsCacheBehavior settingsCacheBehavior2 = new SettingsCacheBehavior("SKIP_CACHE_LOOKUP", 1);
        e = settingsCacheBehavior2;
        SettingsCacheBehavior settingsCacheBehavior3 = new SettingsCacheBehavior("IGNORE_CACHE_EXPIRATION", 2);
        f = settingsCacheBehavior3;
        g = new SettingsCacheBehavior[]{settingsCacheBehavior, settingsCacheBehavior2, settingsCacheBehavior3};
    }

    public static SettingsCacheBehavior valueOf(String str) {
        return (SettingsCacheBehavior) Enum.valueOf(SettingsCacheBehavior.class, str);
    }

    public static SettingsCacheBehavior[] values() {
        return (SettingsCacheBehavior[]) g.clone();
    }
}
