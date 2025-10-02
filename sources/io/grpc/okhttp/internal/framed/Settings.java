package io.grpc.okhttp.internal.framed;

/* loaded from: classes7.dex */
public final class Settings {

    /* renamed from: a, reason: collision with root package name */
    public int f24151a;
    public final int[] b = new int[10];

    public final boolean a(int i) {
        return ((1 << i) & this.f24151a) != 0;
    }

    public final void b(int i, int i2) {
        int[] iArr = this.b;
        if (i >= iArr.length) {
            return;
        }
        this.f24151a = (1 << i) | this.f24151a;
        iArr[i] = i2;
    }
}
