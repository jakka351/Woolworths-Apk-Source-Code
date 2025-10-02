package com.google.android.gms.internal.vision;

import YU.a;
import androidx.camera.core.impl.b;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes5.dex */
public abstract class zzht implements Serializable, Iterable<Byte> {
    public static final zzht zza = new zzid(zzjf.zzb);
    private static final zzhz zzb;
    private static final Comparator<zzht> zzd;
    private int zzc = 0;

    static {
        zzhs zzhsVar = null;
        zzb = zzhi.zza() ? new zzic(zzhsVar) : new zzhx(zzhsVar);
        zzd = new zzhv();
    }

    public static zzht zza(byte[] bArr, int i, int i2) {
        zzb(i, i + i2, bArr.length);
        return new zzid(zzb.zza(bArr, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzb(byte b) {
        return b & 255;
    }

    public static zzib zzc(int i) {
        return new zzib(i, null);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZza = this.zzc;
        if (iZza == 0) {
            int iZza2 = zza();
            iZza = zza(iZza2, 0, iZza2);
            if (iZza == 0) {
                iZza = 1;
            }
            this.zzc = iZza;
        }
        return iZza;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzhs(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return a.o(b.u("<ByteString@", zza(), hexString, " size=", " contents=\""), zza() <= 50 ? zzlq.zza(this) : String.valueOf(zzlq.zza(zza(0, 47))).concat("..."), "\">");
    }

    public abstract byte zza(int i);

    public abstract int zza();

    public abstract int zza(int i, int i2, int i3);

    public abstract zzht zza(int i, int i2);

    public abstract String zza(Charset charset);

    public abstract void zza(zzhq zzhqVar) throws IOException;

    public abstract void zza(byte[] bArr, int i, int i2, int i3);

    public abstract byte zzb(int i);

    public abstract boolean zzc();

    public final int zzd() {
        return this.zzc;
    }

    public static zzht zzb(byte[] bArr, int i, int i2) {
        return new zzhw(bArr, i, i2);
    }

    public static zzht zza(byte[] bArr) {
        return new zzid(bArr);
    }

    public final String zzb() {
        return zza() == 0 ? "" : zza(zzjf.zza);
    }

    public static zzht zza(String str) {
        return new zzid(str.getBytes(zzjf.zza));
    }

    public static int zzb(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i >= 0) {
            if (i2 < i) {
                throw new IndexOutOfBoundsException(c.j(66, i, i2, "Beginning index larger than ending index: ", ", "));
            }
            throw new IndexOutOfBoundsException(c.j(37, i2, i3, "End index: ", " >= "));
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("Beginning index: ");
        sb.append(i);
        sb.append(" < 0");
        throw new IndexOutOfBoundsException(sb.toString());
    }
}
