package androidx.media3.extractor.ts;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;

@UnstableApi
/* loaded from: classes2.dex */
public final class NalUnitTargetBuffer {

    /* renamed from: a, reason: collision with root package name */
    public final int f3427a;
    public boolean b;
    public boolean c;
    public byte[] d;
    public int e;

    public NalUnitTargetBuffer(int i) {
        this.f3427a = i;
        byte[] bArr = new byte[131];
        this.d = bArr;
        bArr[2] = 1;
    }

    public final void a(int i, int i2, byte[] bArr) {
        if (this.b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.d;
            int length = bArr2.length;
            int i4 = this.e;
            if (length < i4 + i3) {
                this.d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.d, this.e, i3);
            this.e += i3;
        }
    }

    public final boolean b(int i) {
        if (!this.b) {
            return false;
        }
        this.e -= i;
        this.b = false;
        this.c = true;
        return true;
    }

    public final void c() {
        this.b = false;
        this.c = false;
    }

    public final void d(int i) {
        Assertions.f(!this.b);
        boolean z = i == this.f3427a;
        this.b = z;
        if (z) {
            this.e = 3;
            this.c = false;
        }
    }
}
