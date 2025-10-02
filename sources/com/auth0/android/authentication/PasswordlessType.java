package com.auth0.android.authentication;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PasswordlessType {
    public static final /* synthetic */ PasswordlessType[] d = {new PasswordlessType("WEB_LINK", 0), new PasswordlessType("ANDROID_LINK", 1), new PasswordlessType("CODE", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    PasswordlessType EF5;

    /* renamed from: com.auth0.android.authentication.PasswordlessType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13655a;

        static {
            int[] iArr = new int[PasswordlessType.values().length];
            f13655a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13655a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13655a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static PasswordlessType valueOf(String str) {
        return (PasswordlessType) Enum.valueOf(PasswordlessType.class, str);
    }

    public static PasswordlessType[] values() {
        return (PasswordlessType[]) d.clone();
    }
}
