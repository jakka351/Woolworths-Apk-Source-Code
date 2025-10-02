package com.google.firebase.sessions;

import com.google.firebase.encoders.json.NumberedEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/firebase/sessions/LogEnvironment;", "Lcom/google/firebase/encoders/json/NumberedEnum;", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LogEnvironment implements NumberedEnum {
    public static final LogEnvironment e;
    public static final /* synthetic */ LogEnvironment[] f;
    public static final /* synthetic */ EnumEntries g;
    public final int d;

    static {
        LogEnvironment logEnvironment = new LogEnvironment("LOG_ENVIRONMENT_UNKNOWN", 0, 0);
        LogEnvironment logEnvironment2 = new LogEnvironment("LOG_ENVIRONMENT_AUTOPUSH", 1, 1);
        LogEnvironment logEnvironment3 = new LogEnvironment("LOG_ENVIRONMENT_STAGING", 2, 2);
        LogEnvironment logEnvironment4 = new LogEnvironment("LOG_ENVIRONMENT_PROD", 3, 3);
        e = logEnvironment4;
        LogEnvironment[] logEnvironmentArr = {logEnvironment, logEnvironment2, logEnvironment3, logEnvironment4};
        f = logEnvironmentArr;
        g = EnumEntriesKt.a(logEnvironmentArr);
    }

    public LogEnvironment(String str, int i, int i2) {
        this.d = i2;
    }

    public static LogEnvironment valueOf(String str) {
        return (LogEnvironment) Enum.valueOf(LogEnvironment.class, str);
    }

    public static LogEnvironment[] values() {
        return (LogEnvironment[]) f.clone();
    }

    @Override // com.google.firebase.encoders.json.NumberedEnum
    /* renamed from: g, reason: from getter */
    public final int getD() {
        return this.d;
    }
}
