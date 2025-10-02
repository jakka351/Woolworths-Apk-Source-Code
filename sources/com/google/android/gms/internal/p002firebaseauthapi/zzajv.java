package com.google.android.gms.internal.p002firebaseauthapi;

import YU.a;
import androidx.camera.core.impl.b;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes5.dex */
public abstract class zzajv implements Serializable, Iterable<Byte> {
    public static final zzajv zza = new zzakg(zzalh.zzb);
    private static final zzakc zzb = new zzakf();
    private int zzc = 0;

    static {
        new zzajx();
    }

    public static /* synthetic */ int zza(byte b) {
        return b & 255;
    }

    public static zzajv zzb(byte[] bArr) {
        return new zzakg(bArr);
    }

    public static zzake zzc(int i) {
        return new zzake(i);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzb = this.zzc;
        if (iZzb == 0) {
            int iZzb2 = zzb();
            iZzb = zzb(iZzb2, 0, iZzb2);
            if (iZzb == 0) {
                iZzb = 1;
            }
            this.zzc = iZzb;
        }
        return iZzb;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzajy(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return a.o(b.u("<ByteString@", zzb(), hexString, " size=", " contents=\""), zzb() <= 50 ? zzann.zza(this) : a.g(zzann.zza(zza(0, 47)), "..."), "\">");
    }

    public abstract byte zza(int i);

    public abstract zzajv zza(int i, int i2);

    public abstract void zza(zzajw zzajwVar) throws IOException;

    public abstract void zza(byte[] bArr, int i, int i2, int i3);

    public abstract byte zzb(int i);

    public abstract int zzb();

    public abstract int zzb(int i, int i2, int i3);

    public abstract zzakh zzc();

    public final byte[] zzd() {
        int iZzb = zzb();
        if (iZzb == 0) {
            return zzalh.zzb;
        }
        byte[] bArr = new byte[iZzb];
        zza(bArr, 0, 0, iZzb);
        return bArr;
    }

    public static int zza(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(a.e(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(b.i(i, i2, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(b.i(i2, i3, "End index: ", " >= "));
    }

    public final int zza() {
        return this.zzc;
    }

    public static zzajv zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static zzajv zza(byte[] bArr, int i, int i2) {
        zza(i, i + i2, bArr.length);
        return new zzakg(zzb.zza(bArr, i, i2));
    }

    public static zzajv zza(String str) {
        return new zzakg(str.getBytes(zzalh.zza));
    }
}
