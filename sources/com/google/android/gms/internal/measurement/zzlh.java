package com.google.android.gms.internal.measurement;

import androidx.camera.core.impl.b;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class zzlh implements Iterable, Serializable {
    public static final zzlh zzb = new zzlg(zzmp.zzb);
    private int zza = 0;

    static {
        int i = zzkv.zza;
    }

    public static zzlh zzh(byte[] bArr, int i, int i2) {
        zzj(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzlg(bArr2);
    }

    public static int zzj(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(a.k(new StringBuilder(String.valueOf(i).length() + 21), "Beginning index: ", i, " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(c.l(i, i2, "Beginning index larger than ending index: ", ", ", new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length())));
        }
        throw new IndexOutOfBoundsException(c.l(i2, i3, "End index: ", " >= ", new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length())));
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzg = this.zza;
        if (iZzg == 0) {
            int iZzc = zzc();
            iZzg = zzg(iZzc, 0, iZzc);
            if (iZzg == 0) {
                iZzg = 1;
            }
            this.zza = iZzg;
        }
        return iZzg;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzla(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return YU.a.o(b.u("<ByteString@", zzc(), hexString, " size=", " contents=\""), zzc() <= 50 ? zzog.zza(this) : zzog.zza(zze(0, 47)).concat("..."), "\">");
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzc();

    public abstract zzlh zze(int i, int i2);

    public abstract void zzf(zzkz zzkzVar) throws IOException;

    public abstract int zzg(int i, int i2, int i3);

    public final int zzi() {
        return this.zza;
    }
}
