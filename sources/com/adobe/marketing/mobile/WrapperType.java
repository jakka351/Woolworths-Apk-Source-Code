package com.adobe.marketing.mobile;

/* loaded from: classes.dex */
public enum WrapperType {
    NONE("N"),
    /* JADX INFO: Fake field, exist only in values array */
    REACT_NATIVE("R"),
    /* JADX INFO: Fake field, exist only in values array */
    FLUTTER("F"),
    /* JADX INFO: Fake field, exist only in values array */
    CORDOVA("C"),
    /* JADX INFO: Fake field, exist only in values array */
    UNITY("U"),
    /* JADX INFO: Fake field, exist only in values array */
    XAMARIN("X");

    public final String d;

    /* renamed from: com.adobe.marketing.mobile.WrapperType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13165a;

        static {
            int[] iArr = new int[WrapperType.values().length];
            f13165a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13165a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13165a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13165a[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13165a[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13165a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    WrapperType(String str) {
        this.d = str;
    }
}
