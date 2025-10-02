package com.scandit.datacapture.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.scandit.datacapture.core.e4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class EnumC0994e4 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0976c4 f18489a;
    public static final C0985d4 b;
    private static final /* synthetic */ EnumC0994e4[] c;

    static {
        C0976c4 c0976c4 = new C0976c4();
        f18489a = c0976c4;
        C0985d4 c0985d4 = new C0985d4();
        b = c0985d4;
        c = new EnumC0994e4[]{c0976c4, c0985d4};
    }

    private EnumC0994e4(String str, int i) {
    }

    public static EnumC0994e4 valueOf(String str) {
        return (EnumC0994e4) Enum.valueOf(EnumC0994e4.class, str);
    }

    public static EnumC0994e4[] values() {
        return (EnumC0994e4[]) c.clone();
    }

    public abstract S1 a();

    public /* synthetic */ EnumC0994e4(String str, int i, int i2) {
        this(str, i);
    }
}
