package com.google.android.gms.internal.fido;

import YU.a;
import androidx.camera.core.impl.b;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes5.dex */
public abstract class zzcz implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzcz zzb = new zzcw(zzde.zzd);
    private static final zzcy zzd;
    private int zzc = 0;

    static {
        int i = zzcp.zza;
        zzd = new zzcy(null);
        zza = new zzcr();
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1043)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:997)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
     */
    public static int zzj(int i, int i2, int i3) {
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

    public static zzcz zzl(byte[] bArr, int i, int i2) {
        zzj(0, i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        return new zzcw(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzf = this.zzc;
        if (iZzf == 0) {
            int iZzd = zzd();
            iZzf = zzf(iZzd, 0, iZzd);
            if (iZzf == 0) {
                iZzf = 1;
            }
            this.zzc = iZzf;
        }
        return iZzf;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzcq(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return a.o(b.u("<ByteString@", zzd(), hexString, " size=", " contents=\""), zzd() <= 50 ? zzdg.zza(this) : zzdg.zza(zzg(0, 47)).concat("..."), "\">");
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i, int i2, int i3);

    public abstract int zzf(int i, int i2, int i3);

    public abstract zzcz zzg(int i, int i2);

    public abstract InputStream zzh();

    public abstract ByteBuffer zzi();

    public final int zzk() {
        return this.zzc;
    }

    public final byte[] zzm() {
        int iZzd = zzd();
        if (iZzd == 0) {
            return zzde.zzd;
        }
        byte[] bArr = new byte[iZzd];
        zze(bArr, 0, 0, iZzd);
        return bArr;
    }
}
