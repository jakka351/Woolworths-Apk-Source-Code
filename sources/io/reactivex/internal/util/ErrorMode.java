package io.reactivex.internal.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ErrorMode {
    public static final /* synthetic */ ErrorMode[] d = {new ErrorMode("IMMEDIATE", 0), new ErrorMode("BOUNDARY", 1), new ErrorMode("END", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    ErrorMode EF5;

    public static ErrorMode valueOf(String str) {
        return (ErrorMode) Enum.valueOf(ErrorMode.class, str);
    }

    public static ErrorMode[] values() {
        return (ErrorMode[]) d.clone();
    }
}
