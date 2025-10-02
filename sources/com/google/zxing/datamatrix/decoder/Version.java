package com.google.zxing.datamatrix.decoder;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* loaded from: classes6.dex */
public final class Version {
    public static final Version[] h = {new Version(1, 10, 10, 8, 8, new ECBlocks(5, new ECB(1, 3))), new Version(2, 12, 12, 10, 10, new ECBlocks(7, new ECB(1, 5))), new Version(3, 14, 14, 12, 12, new ECBlocks(10, new ECB(1, 8))), new Version(4, 16, 16, 14, 14, new ECBlocks(12, new ECB(1, 12))), new Version(5, 18, 18, 16, 16, new ECBlocks(14, new ECB(1, 18))), new Version(6, 20, 20, 18, 18, new ECBlocks(18, new ECB(1, 22))), new Version(7, 22, 22, 20, 20, new ECBlocks(20, new ECB(1, 30))), new Version(8, 24, 24, 22, 22, new ECBlocks(24, new ECB(1, 36))), new Version(9, 26, 26, 24, 24, new ECBlocks(28, new ECB(1, 44))), new Version(10, 32, 32, 14, 14, new ECBlocks(36, new ECB(1, 62))), new Version(11, 36, 36, 16, 16, new ECBlocks(42, new ECB(1, 86))), new Version(12, 40, 40, 18, 18, new ECBlocks(48, new ECB(1, 114))), new Version(13, 44, 44, 20, 20, new ECBlocks(56, new ECB(1, 144))), new Version(14, 48, 48, 22, 22, new ECBlocks(68, new ECB(1, 174))), new Version(15, 52, 52, 24, 24, new ECBlocks(42, new ECB(2, 102))), new Version(16, 64, 64, 14, 14, new ECBlocks(56, new ECB(2, 140))), new Version(17, 72, 72, 16, 16, new ECBlocks(36, new ECB(4, 92))), new Version(18, 80, 80, 18, 18, new ECBlocks(48, new ECB(4, 114))), new Version(19, 88, 88, 20, 20, new ECBlocks(56, new ECB(4, 144))), new Version(20, 96, 96, 22, 22, new ECBlocks(68, new ECB(4, 174))), new Version(21, 104, 104, 24, 24, new ECBlocks(56, new ECB(6, 136))), new Version(22, 120, 120, 18, 18, new ECBlocks(68, new ECB(6, 175))), new Version(23, 132, 132, 20, 20, new ECBlocks(62, new ECB(8, 163))), new Version(24, 144, 144, 22, 22, new ECBlocks(new ECB(8, 156), new ECB(2, ModuleDescriptor.MODULE_VERSION))), new Version(25, 8, 18, 6, 16, new ECBlocks(7, new ECB(1, 5))), new Version(26, 8, 32, 6, 14, new ECBlocks(11, new ECB(1, 10))), new Version(27, 12, 26, 10, 24, new ECBlocks(14, new ECB(1, 16))), new Version(28, 12, 36, 10, 16, new ECBlocks(18, new ECB(1, 22))), new Version(29, 16, 36, 14, 16, new ECBlocks(24, new ECB(1, 32))), new Version(30, 16, 48, 14, 22, new ECBlocks(28, new ECB(1, 49)))};

    /* renamed from: a, reason: collision with root package name */
    public final int f16159a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final ECBlocks f;
    public final int g;

    public static final class ECB {

        /* renamed from: a, reason: collision with root package name */
        public final int f16160a;
        public final int b;

        public ECB(int i, int i2) {
            this.f16160a = i;
            this.b = i2;
        }
    }

    public Version(int i, int i2, int i3, int i4, int i5, ECBlocks eCBlocks) {
        this.f16159a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = eCBlocks;
        int i6 = eCBlocks.f16161a;
        int i7 = 0;
        for (ECB ecb : eCBlocks.b) {
            i7 += (ecb.b + i6) * ecb.f16160a;
        }
        this.g = i7;
    }

    public final String toString() {
        return String.valueOf(this.f16159a);
    }

    public static final class ECBlocks {

        /* renamed from: a, reason: collision with root package name */
        public final int f16161a;
        public final ECB[] b;

        public ECBlocks(int i, ECB ecb) {
            this.f16161a = i;
            this.b = new ECB[]{ecb};
        }

        public ECBlocks(ECB ecb, ECB ecb2) {
            this.f16161a = 62;
            this.b = new ECB[]{ecb, ecb2};
        }
    }
}
