package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes5.dex */
public abstract class zzhhb implements Iterable<Byte>, Serializable {
    public static final zzhhb zzb = new zzhgz(zzhiu.zzb);
    private int zza = 0;

    static {
        int i = zzhgo.zza;
    }

    public static int zzA(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(androidx.constraintlayout.core.state.a.k(new StringBuilder(String.valueOf(i).length() + 21), "Beginning index: ", i, " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(au.com.woolworths.shop.checkout.ui.confirmation.c.l(i, i2, "Beginning index larger than ending index: ", ", ", new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length())));
        }
        throw new IndexOutOfBoundsException(au.com.woolworths.shop.checkout.ui.confirmation.c.l(i2, i3, "End index: ", " >= ", new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length())));
    }

    private static zzhhb zzd(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(YU.a.e(i, "length (", ") must be >= 1"));
        }
        if (i == 1) {
            return (zzhhb) it.next();
        }
        int i2 = i >>> 1;
        zzhhb zzhhbVarZzd = zzd(it, i2);
        zzhhb zzhhbVarZzd2 = zzd(it, i - i2);
        if (Integer.MAX_VALUE - zzhhbVarZzd.zzc() >= zzhhbVarZzd2.zzc()) {
            return zzhkj.zzd(zzhhbVarZzd, zzhhbVarZzd2);
        }
        int iZzc = zzhhbVarZzd.zzc();
        int iZzc2 = zzhhbVarZzd2.zzc();
        throw new IllegalArgumentException(au.com.woolworths.shop.checkout.ui.confirmation.c.l(iZzc, iZzc2, "ByteString would be too long: ", "+", new StringBuilder(String.valueOf(iZzc).length() + 31 + String.valueOf(iZzc2).length())));
    }

    public static zzhhb zzr(byte[] bArr, int i, int i2) {
        zzA(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzhgz(bArr2);
    }

    public static zzhhb zzs(String str) {
        return new zzhgz(str.getBytes(zzhiu.zza));
    }

    public static zzhhb zzt(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? zzb : zzd(iterable.iterator(), size);
    }

    public static zzhha zzx() {
        return new zzhha(128);
    }

    public static void zzz(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(YU.a.n(new StringBuilder(String.valueOf(i).length() + 11), "Index < 0: ", i));
            }
            throw new ArrayIndexOutOfBoundsException(au.com.woolworths.shop.checkout.ui.confirmation.c.l(i, i2, "Index > length: ", ", ", new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i2).length())));
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzo = this.zza;
        if (iZzo == 0) {
            int iZzc = zzc();
            iZzo = zzo(iZzc, 0, iZzc);
            if (iZzo == 0) {
                iZzo = 1;
            }
            this.zza = iZzo;
        }
        return iZzo;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return YU.a.o(androidx.camera.core.impl.b.u("<ByteString@", zzc(), hexString, " size=", " contents=\""), zzc() <= 50 ? zzhkt.zza(this) : zzhkt.zza(zzi(0, 47)).concat("..."), "\">");
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzc();

    public abstract void zze(byte[] bArr, int i, int i2, int i3);

    public abstract int zzf();

    public abstract boolean zzg();

    public abstract zzhhb zzi(int i, int i2);

    public abstract ByteBuffer zzj();

    public abstract void zzk(zzhgs zzhgsVar) throws IOException;

    public abstract String zzl(Charset charset);

    public abstract boolean zzm();

    public abstract int zzn(int i, int i2, int i3);

    public abstract int zzo(int i, int i2, int i3);

    public abstract zzhhg zzp();

    @Override // java.lang.Iterable
    /* renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public zzhgw iterator() {
        return new zzhgt(this);
    }

    @Deprecated
    public final void zzu(byte[] bArr, int i, int i2, int i3) {
        zzA(0, i3, zzc());
        zzA(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            zze(bArr, 0, i2, i3);
        }
    }

    public final byte[] zzv() {
        int iZzc = zzc();
        if (iZzc == 0) {
            return zzhiu.zzb;
        }
        byte[] bArr = new byte[iZzc];
        zze(bArr, 0, 0, iZzc);
        return bArr;
    }

    public final String zzw() {
        return zzc() == 0 ? "" : zzl(zzhiu.zza);
    }

    public final int zzy() {
        return this.zza;
    }
}
