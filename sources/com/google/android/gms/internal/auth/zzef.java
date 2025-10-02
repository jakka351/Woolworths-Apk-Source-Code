package com.google.android.gms.internal.auth;

import YU.a;
import androidx.camera.core.impl.b;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes5.dex */
public abstract class zzef implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzef zzb = new zzec(zzfa.zzd);
    private static final zzee zzd;
    private int zzc = 0;

    static {
        int i = zzds.zza;
        zzd = new zzee(null);
        zza = new zzdx();
    }

    public static int zzi(int i, int i2, int i3) {
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

    public static zzef zzk(byte[] bArr, int i, int i2) {
        zzi(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzec(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZze = this.zzc;
        if (iZze == 0) {
            int iZzd = zzd();
            iZze = zze(iZzd, 0, iZzd);
            if (iZze == 0) {
                iZze = 1;
            }
            this.zzc = iZze;
        }
        return iZze;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzdw(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return a.o(b.u("<ByteString@", zzd(), hexString, " size=", " contents=\""), zzd() <= 50 ? zzgx.zza(this) : zzgx.zza(zzf(0, 47)).concat("..."), "\">");
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract int zze(int i, int i2, int i3);

    public abstract zzef zzf(int i, int i2);

    public abstract String zzg(Charset charset);

    public abstract boolean zzh();

    public final int zzj() {
        return this.zzc;
    }

    public final String zzl(Charset charset) {
        return zzd() == 0 ? "" : zzg(charset);
    }
}
