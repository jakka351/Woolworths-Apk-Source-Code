package androidx.camera.core.impl.utils;

/* loaded from: classes2.dex */
class ExifTag {

    /* renamed from: a, reason: collision with root package name */
    public final int f518a;
    public final String b;
    public final int c;
    public final int d;

    public ExifTag(String str, int i, int i2) {
        this.b = str;
        this.f518a = i;
        this.c = i2;
        this.d = -1;
    }

    public ExifTag(int i, int i2, int i3, String str) {
        this.b = str;
        this.f518a = i;
        this.c = i2;
        this.d = i3;
    }
}
