package com.google.android.gms.internal.p002firebaseauthapi;

import YU.a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes5.dex */
final class zzamq<T> implements zzanb<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzanz.zzb();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzamm zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzamu zzn;
    private final zzalw zzo;
    private final zzanu<?, ?> zzp;
    private final zzakw<?> zzq;
    private final zzamf zzr;

    private zzamq(int[] iArr, Object[] objArr, int i, int i2, zzamm zzammVar, boolean z, int[] iArr2, int i3, int i4, zzamu zzamuVar, zzalw zzalwVar, zzanu<?, ?> zzanuVar, zzakw<?> zzakwVar, zzamf zzamfVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzammVar instanceof zzalf;
        this.zzh = zzakwVar != null && zzakwVar.zza(zzammVar);
        this.zzj = false;
        this.zzk = iArr2;
        this.zzl = i3;
        this.zzm = i4;
        this.zzn = zzamuVar;
        this.zzo = zzalwVar;
        this.zzp = zzanuVar;
        this.zzq = zzakwVar;
        this.zzg = zzammVar;
        this.zzr = zzamfVar;
    }

    private static <T> double zza(T t, long j) {
        return ((Double) zzanz.zze(t, j)).doubleValue();
    }

    private static <T> float zzb(T t, long j) {
        return ((Float) zzanz.zze(t, j)).floatValue();
    }

    private static <T> int zzc(T t, long j) {
        return ((Integer) zzanz.zze(t, j)).intValue();
    }

    private static <T> long zzd(T t, long j) {
        return ((Long) zzanz.zze(t, j)).longValue();
    }

    private final zzanb zze(int i) {
        int i2 = (i / 3) << 1;
        zzanb zzanbVar = (zzanb) this.zzd[i2];
        if (zzanbVar != null) {
            return zzanbVar;
        }
        zzanb<T> zzanbVarZza = zzamx.zza().zza((Class) this.zzd[i2 + 1]);
        this.zzd[i2] = zzanbVarZza;
        return zzanbVarZza;
    }

    private final Object zzf(int i) {
        return this.zzd[(i / 3) << 1];
    }

    private static boolean zzg(int i) {
        return (i & 536870912) != 0;
    }

    private static int zza(byte[] bArr, int i, int i2, zzaog zzaogVar, Class<?> cls, zzaju zzajuVar) throws IOException {
        switch (zzamp.zza[zzaogVar.ordinal()]) {
            case 1:
                int iZzd = zzajr.zzd(bArr, i, zzajuVar);
                zzajuVar.zzc = Boolean.valueOf(zzajuVar.zzb != 0);
                return iZzd;
            case 2:
                return zzajr.zza(bArr, i, zzajuVar);
            case 3:
                zzajuVar.zzc = Double.valueOf(zzajr.zza(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzajuVar.zzc = Integer.valueOf(zzajr.zzc(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzajuVar.zzc = Long.valueOf(zzajr.zzd(bArr, i));
                return i + 8;
            case 8:
                zzajuVar.zzc = Float.valueOf(zzajr.zzb(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int iZzc = zzajr.zzc(bArr, i, zzajuVar);
                zzajuVar.zzc = Integer.valueOf(zzajuVar.zza);
                return iZzc;
            case 12:
            case 13:
                int iZzd2 = zzajr.zzd(bArr, i, zzajuVar);
                zzajuVar.zzc = Long.valueOf(zzajuVar.zzb);
                return iZzd2;
            case 14:
                return zzajr.zza(zzamx.zza().zza((Class) cls), bArr, i, i2, zzajuVar);
            case 15:
                int iZzc2 = zzajr.zzc(bArr, i, zzajuVar);
                zzajuVar.zzc = Integer.valueOf(zzakh.zza(zzajuVar.zza));
                return iZzc2;
            case 16:
                int iZzd3 = zzajr.zzd(bArr, i, zzajuVar);
                zzajuVar.zzc = Long.valueOf(zzakh.zza(zzajuVar.zzb));
                return iZzd3;
            case 17:
                return zzajr.zzb(bArr, i, zzajuVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private final int zzc(int i) {
        return this.zzc[i + 1];
    }

    private final zzalj zzd(int i) {
        return (zzalj) this.zzd[((i / 3) << 1) + 1];
    }

    private static void zzf(Object obj) {
        if (!zzg(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static boolean zzg(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzalf) {
            return ((zzalf) obj).zzw();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final int zzb(T t) {
        int i;
        int iZza;
        int i2;
        int iZzc;
        int length = this.zzc.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iZzc2 = zzc(i4);
            int i5 = this.zzc[i4];
            long j = 1048575 & iZzc2;
            int iHashCode = 37;
            switch ((iZzc2 & 267386880) >>> 20) {
                case 0:
                    i = i3 * 53;
                    iZza = zzalh.zza(Double.doubleToLongBits(zzanz.zza(t, j)));
                    i3 = iZza + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iZza = Float.floatToIntBits(zzanz.zzb(t, j));
                    i3 = iZza + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iZza = zzalh.zza(zzanz.zzd(t, j));
                    i3 = iZza + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iZza = zzalh.zza(zzanz.zzd(t, j));
                    i3 = iZza + i;
                    break;
                case 4:
                    i2 = i3 * 53;
                    iZzc = zzanz.zzc(t, j);
                    i3 = i2 + iZzc;
                    break;
                case 5:
                    i = i3 * 53;
                    iZza = zzalh.zza(zzanz.zzd(t, j));
                    i3 = iZza + i;
                    break;
                case 6:
                    i2 = i3 * 53;
                    iZzc = zzanz.zzc(t, j);
                    i3 = i2 + iZzc;
                    break;
                case 7:
                    i = i3 * 53;
                    iZza = zzalh.zza(zzanz.zzh(t, j));
                    i3 = iZza + i;
                    break;
                case 8:
                    i = i3 * 53;
                    iZza = ((String) zzanz.zze(t, j)).hashCode();
                    i3 = iZza + i;
                    break;
                case 9:
                    Object objZze = zzanz.zze(t, j);
                    if (objZze != null) {
                        iHashCode = objZze.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iZza = zzanz.zze(t, j).hashCode();
                    i3 = iZza + i;
                    break;
                case 11:
                    i2 = i3 * 53;
                    iZzc = zzanz.zzc(t, j);
                    i3 = i2 + iZzc;
                    break;
                case 12:
                    i2 = i3 * 53;
                    iZzc = zzanz.zzc(t, j);
                    i3 = i2 + iZzc;
                    break;
                case 13:
                    i2 = i3 * 53;
                    iZzc = zzanz.zzc(t, j);
                    i3 = i2 + iZzc;
                    break;
                case 14:
                    i = i3 * 53;
                    iZza = zzalh.zza(zzanz.zzd(t, j));
                    i3 = iZza + i;
                    break;
                case 15:
                    i2 = i3 * 53;
                    iZzc = zzanz.zzc(t, j);
                    i3 = i2 + iZzc;
                    break;
                case 16:
                    i = i3 * 53;
                    iZza = zzalh.zza(zzanz.zzd(t, j));
                    i3 = iZza + i;
                    break;
                case 17:
                    Object objZze2 = zzanz.zze(t, j);
                    if (objZze2 != null) {
                        iHashCode = objZze2.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i3 * 53;
                    iZza = zzanz.zze(t, j).hashCode();
                    i3 = iZza + i;
                    break;
                case 50:
                    i = i3 * 53;
                    iZza = zzanz.zze(t, j).hashCode();
                    i3 = iZza + i;
                    break;
                case 51:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i = i3 * 53;
                        iZza = zzalh.zza(Double.doubleToLongBits(zza(t, j)));
                        i3 = iZza + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i = i3 * 53;
                        iZza = Float.floatToIntBits(zzb(t, j));
                        i3 = iZza + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i = i3 * 53;
                        iZza = zzalh.zza(zzd(t, j));
                        i3 = iZza + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i = i3 * 53;
                        iZza = zzalh.zza(zzd(t, j));
                        i3 = iZza + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        iZzc = zzc(t, j);
                        i3 = i2 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i = i3 * 53;
                        iZza = zzalh.zza(zzd(t, j));
                        i3 = iZza + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        iZzc = zzc(t, j);
                        i3 = i2 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i = i3 * 53;
                        iZza = zzalh.zza(zze(t, j));
                        i3 = iZza + i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i = i3 * 53;
                        iZza = ((String) zzanz.zze(t, j)).hashCode();
                        i3 = iZza + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i = i3 * 53;
                        iZza = zzanz.zze(t, j).hashCode();
                        i3 = iZza + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i = i3 * 53;
                        iZza = zzanz.zze(t, j).hashCode();
                        i3 = iZza + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        iZzc = zzc(t, j);
                        i3 = i2 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        iZzc = zzc(t, j);
                        i3 = i2 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        iZzc = zzc(t, j);
                        i3 = i2 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i = i3 * 53;
                        iZza = zzalh.zza(zzd(t, j));
                        i3 = iZza + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        iZzc = zzc(t, j);
                        i3 = i2 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i = i3 * 53;
                        iZza = zzalh.zza(zzd(t, j));
                        i3 = iZza + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzc((zzamq<T>) t, i5, i4)) {
                        i = i3 * 53;
                        iZza = zzanz.zze(t, j).hashCode();
                        i3 = iZza + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = this.zzp.zzd(t).hashCode() + (i3 * 53);
        return this.zzh ? (iHashCode2 * 53) + this.zzq.zza(t).hashCode() : iHashCode2;
    }

    public static zzanx zzc(Object obj) {
        zzalf zzalfVar = (zzalf) obj;
        zzanx zzanxVar = zzalfVar.zzb;
        if (zzanxVar != zzanx.zzc()) {
            return zzanxVar;
        }
        zzanx zzanxVarZzd = zzanx.zzd();
        zzalfVar.zzb = zzanxVarZzd;
        return zzanxVarZzd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(T r8) {
        /*
            r7 = this;
            boolean r0 = zzg(r8)
            if (r0 != 0) goto L8
            goto L92
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzalf
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            com.google.android.gms.internal.firebase-auth-api.zzalf r0 = (com.google.android.gms.internal.p002firebaseauthapi.zzalf) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzb(r2)
            r0.zza = r1
            r0.zzu()
        L1b:
            int[] r0 = r7.zzc
            int r0 = r0.length
        L1e:
            if (r1 >= r0) goto L84
            int r2 = r7.zzc(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            long r3 = (long) r3
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r2 = r2 & r5
            int r2 = r2 >>> 20
            r5 = 9
            if (r2 == r5) goto L6e
            r5 = 60
            if (r2 == r5) goto L56
            r5 = 68
            if (r2 == r5) goto L56
            switch(r2) {
                case 17: goto L6e;
                case 18: goto L50;
                case 19: goto L50;
                case 20: goto L50;
                case 21: goto L50;
                case 22: goto L50;
                case 23: goto L50;
                case 24: goto L50;
                case 25: goto L50;
                case 26: goto L50;
                case 27: goto L50;
                case 28: goto L50;
                case 29: goto L50;
                case 30: goto L50;
                case 31: goto L50;
                case 32: goto L50;
                case 33: goto L50;
                case 34: goto L50;
                case 35: goto L50;
                case 36: goto L50;
                case 37: goto L50;
                case 38: goto L50;
                case 39: goto L50;
                case 40: goto L50;
                case 41: goto L50;
                case 42: goto L50;
                case 43: goto L50;
                case 44: goto L50;
                case 45: goto L50;
                case 46: goto L50;
                case 47: goto L50;
                case 48: goto L50;
                case 49: goto L50;
                case 50: goto L3e;
                default: goto L3d;
            }
        L3d:
            goto L81
        L3e:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.p002firebaseauthapi.zzamq.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L81
            com.google.android.gms.internal.firebase-auth-api.zzamf r6 = r7.zzr
            java.lang.Object r5 = r6.zzc(r5)
            r2.putObject(r8, r3, r5)
            goto L81
        L50:
            com.google.android.gms.internal.firebase-auth-api.zzalw r2 = r7.zzo
            r2.zzb(r8, r3)
            goto L81
        L56:
            int[] r2 = r7.zzc
            r2 = r2[r1]
            boolean r2 = r7.zzc(r8, r2, r1)
            if (r2 == 0) goto L81
            com.google.android.gms.internal.firebase-auth-api.zzanb r2 = r7.zze(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.p002firebaseauthapi.zzamq.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzd(r3)
            goto L81
        L6e:
            boolean r2 = r7.zzc(r8, r1)
            if (r2 == 0) goto L81
            com.google.android.gms.internal.firebase-auth-api.zzanb r2 = r7.zze(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.p002firebaseauthapi.zzamq.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzd(r3)
        L81:
            int r1 = r1 + 3
            goto L1e
        L84:
            com.google.android.gms.internal.firebase-auth-api.zzanu<?, ?> r0 = r7.zzp
            r0.zzf(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L92
            com.google.android.gms.internal.firebase-auth-api.zzakw<?> r0 = r7.zzq
            r0.zzc(r8)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamq.zzd(java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7  */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.google.android.gms.internal.firebase-auth-api.zzanb] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [com.google.android.gms.internal.firebase-auth-api.zzanb] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zze(T r15) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamq.zze(java.lang.Object):boolean");
    }

    private final boolean zzc(T t, T t2, int i) {
        return zzc((zzamq<T>) t, i) == zzc((zzamq<T>) t2, i);
    }

    private final boolean zzc(T t, int i) {
        int iZzb = zzb(i);
        long j = iZzb & 1048575;
        if (j != 1048575) {
            return (zzanz.zzc(t, j) & (1 << (iZzb >>> 20))) != 0;
        }
        int iZzc = zzc(i);
        long j2 = iZzc & 1048575;
        switch ((iZzc & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zzanz.zza(t, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzanz.zzb(t, j2)) != 0;
            case 2:
                return zzanz.zzd(t, j2) != 0;
            case 3:
                return zzanz.zzd(t, j2) != 0;
            case 4:
                return zzanz.zzc(t, j2) != 0;
            case 5:
                return zzanz.zzd(t, j2) != 0;
            case 6:
                return zzanz.zzc(t, j2) != 0;
            case 7:
                return zzanz.zzh(t, j2);
            case 8:
                Object objZze = zzanz.zze(t, j2);
                if (objZze instanceof String) {
                    return !((String) objZze).isEmpty();
                }
                if (objZze instanceof zzajv) {
                    return !zzajv.zza.equals(objZze);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzanz.zze(t, j2) != null;
            case 10:
                return !zzajv.zza.equals(zzanz.zze(t, j2));
            case 11:
                return zzanz.zzc(t, j2) != 0;
            case 12:
                return zzanz.zzc(t, j2) != 0;
            case 13:
                return zzanz.zzc(t, j2) != 0;
            case 14:
                return zzanz.zzd(t, j2) != 0;
            case 15:
                return zzanz.zzc(t, j2) != 0;
            case 16:
                return zzanz.zzd(t, j2) != 0;
            case 17:
                return zzanz.zze(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final int zza(T t) {
        int i;
        int iZza;
        int iZza2;
        int iZzb;
        int iZza3;
        int iZzd;
        int iZzh;
        int iZzi;
        zzamq<T> zzamqVar = this;
        T t2 = t;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i3 < zzamqVar.zzc.length) {
            int iZzc = zzamqVar.zzc(i3);
            int i7 = (267386880 & iZzc) >>> 20;
            int[] iArr = zzamqVar.zzc;
            int i8 = iArr[i3];
            int i9 = iArr[i3 + 2];
            int i10 = i9 & i2;
            if (i7 <= 17) {
                if (i10 != i6) {
                    i4 = i10 == i2 ? 0 : unsafe.getInt(t2, i10);
                    i6 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            long j = iZzc & i2;
            if (i7 >= zzalc.zza.zza()) {
                zzalc.zzb.zza();
            }
            int i11 = i5;
            switch (i7) {
                case 0:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        iZza = zzakn.zza(i8, 0.0d);
                        i5 = iZza + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 1:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        iZza2 = zzakn.zza(i8, BitmapDescriptorFactory.HUE_RED);
                        i5 = iZza2 + i11;
                        zzamqVar = this;
                        t2 = t;
                        break;
                    }
                    zzamqVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 2:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        iZzb = zzakn.zzb(i8, unsafe.getLong(t2, j));
                        i5 = iZzb + i11;
                        zzamqVar = this;
                        break;
                    }
                    zzamqVar = this;
                    i5 = i11;
                    break;
                case 3:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        iZzb = zzakn.zze(i8, unsafe.getLong(t2, j));
                        i5 = iZzb + i11;
                        zzamqVar = this;
                        break;
                    }
                    zzamqVar = this;
                    i5 = i11;
                    break;
                case 4:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        iZzb = zzakn.zzc(i8, unsafe.getInt(t2, j));
                        i5 = iZzb + i11;
                        zzamqVar = this;
                        break;
                    }
                    zzamqVar = this;
                    i5 = i11;
                    break;
                case 5:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        iZza2 = zzakn.zza(i8, 0L);
                        i5 = iZza2 + i11;
                        zzamqVar = this;
                        t2 = t;
                        break;
                    }
                    zzamqVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 6:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        iZza2 = zzakn.zzb(i8, 0);
                        i5 = iZza2 + i11;
                        zzamqVar = this;
                        t2 = t;
                        break;
                    }
                    zzamqVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 7:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        iZza2 = zzakn.zza(i8, true);
                        i5 = iZza2 + i11;
                        zzamqVar = this;
                        t2 = t;
                        break;
                    }
                    zzamqVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 8:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        Object object = unsafe.getObject(t2, j);
                        if (object instanceof zzajv) {
                            iZzb = zzakn.zza(i8, (zzajv) object);
                        } else {
                            iZzb = zzakn.zza(i8, (String) object);
                        }
                        i5 = iZzb + i11;
                        zzamqVar = this;
                        break;
                    }
                    zzamqVar = this;
                    i5 = i11;
                    break;
                case 9:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        iZza3 = zzand.zza(i8, unsafe.getObject(t2, j), (zzanb<?>) zzamqVar.zze(i3));
                        i5 = i11 + iZza3;
                        break;
                    }
                    i5 = i11;
                    break;
                case 10:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        iZzb = zzakn.zza(i8, (zzajv) unsafe.getObject(t2, j));
                        i5 = iZzb + i11;
                        zzamqVar = this;
                        break;
                    }
                    zzamqVar = this;
                    i5 = i11;
                    break;
                case 11:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        iZzb = zzakn.zzf(i8, unsafe.getInt(t2, j));
                        i5 = iZzb + i11;
                        zzamqVar = this;
                        break;
                    }
                    zzamqVar = this;
                    i5 = i11;
                    break;
                case 12:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        iZzb = zzakn.zza(i8, unsafe.getInt(t2, j));
                        i5 = iZzb + i11;
                        zzamqVar = this;
                        break;
                    }
                    zzamqVar = this;
                    i5 = i11;
                    break;
                case 13:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        iZza2 = zzakn.zzd(i8, 0);
                        i5 = iZza2 + i11;
                        zzamqVar = this;
                        t2 = t;
                        break;
                    }
                    zzamqVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 14:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        iZza2 = zzakn.zzc(i8, 0L);
                        i5 = iZza2 + i11;
                        zzamqVar = this;
                        t2 = t;
                        break;
                    }
                    zzamqVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 15:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        iZzb = zzakn.zze(i8, unsafe.getInt(t2, j));
                        i5 = iZzb + i11;
                        zzamqVar = this;
                        break;
                    }
                    zzamqVar = this;
                    i5 = i11;
                    break;
                case 16:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        iZzb = zzakn.zzd(i8, unsafe.getLong(t2, j));
                        i5 = iZzb + i11;
                        zzamqVar = this;
                        break;
                    }
                    zzamqVar = this;
                    i5 = i11;
                    break;
                case 17:
                    if (zzamqVar.zza((zzamq<T>) t2, i3, i6, i4, i)) {
                        iZza3 = zzand.zza(i8, (zzamm) unsafe.getObject(t2, j), zzamqVar.zze(i3));
                        i5 = i11 + iZza3;
                        break;
                    }
                    i5 = i11;
                    break;
                case 18:
                    iZza3 = zzand.zzd(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + iZza3;
                    break;
                case 19:
                    iZza3 = zzand.zzc(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + iZza3;
                    break;
                case 20:
                    iZza3 = zzand.zzf(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + iZza3;
                    break;
                case 21:
                    iZza3 = zzand.zzj(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + iZza3;
                    break;
                case 22:
                    iZza3 = zzand.zze(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + iZza3;
                    break;
                case 23:
                    iZza3 = zzand.zzd(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + iZza3;
                    break;
                case 24:
                    iZza3 = zzand.zzc(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + iZza3;
                    break;
                case 25:
                    iZza3 = zzand.zza(i8, (List<?>) unsafe.getObject(t2, j), false);
                    i5 = i11 + iZza3;
                    break;
                case 26:
                    iZza3 = zzand.zzb(i8, (List) unsafe.getObject(t2, j));
                    i5 = i11 + iZza3;
                    break;
                case 27:
                    iZza3 = zzand.zzb(i8, (List<?>) unsafe.getObject(t2, j), (zzanb<?>) zzamqVar.zze(i3));
                    i5 = i11 + iZza3;
                    break;
                case 28:
                    iZza3 = zzand.zza(i8, (List<zzajv>) unsafe.getObject(t2, j));
                    i5 = i11 + iZza3;
                    break;
                case 29:
                    iZza3 = zzand.zzi(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + iZza3;
                    break;
                case 30:
                    iZza3 = zzand.zzb(i8, (List<Integer>) unsafe.getObject(t2, j), false);
                    i5 = i11 + iZza3;
                    break;
                case 31:
                    iZza3 = zzand.zzc(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + iZza3;
                    break;
                case 32:
                    iZza3 = zzand.zzd(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + iZza3;
                    break;
                case 33:
                    iZza3 = zzand.zzg(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + iZza3;
                    break;
                case 34:
                    iZza3 = zzand.zzh(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + iZza3;
                    break;
                case 35:
                    iZzd = zzand.zzd((List) unsafe.getObject(t2, j));
                    if (iZzd > 0) {
                        iZzh = zzakn.zzh(i8);
                        iZzi = zzakn.zzi(iZzd);
                        i5 = iZzi + iZzh + iZzd + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 36:
                    iZzd = zzand.zzc((List) unsafe.getObject(t2, j));
                    if (iZzd > 0) {
                        iZzh = zzakn.zzh(i8);
                        iZzi = zzakn.zzi(iZzd);
                        i5 = iZzi + iZzh + iZzd + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 37:
                    iZzd = zzand.zzf((List) unsafe.getObject(t2, j));
                    if (iZzd > 0) {
                        iZzh = zzakn.zzh(i8);
                        iZzi = zzakn.zzi(iZzd);
                        i5 = iZzi + iZzh + iZzd + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 38:
                    iZzd = zzand.zzj((List) unsafe.getObject(t2, j));
                    if (iZzd > 0) {
                        iZzh = zzakn.zzh(i8);
                        iZzi = zzakn.zzi(iZzd);
                        i5 = iZzi + iZzh + iZzd + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 39:
                    iZzd = zzand.zze((List) unsafe.getObject(t2, j));
                    if (iZzd > 0) {
                        iZzh = zzakn.zzh(i8);
                        iZzi = zzakn.zzi(iZzd);
                        i5 = iZzi + iZzh + iZzd + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 40:
                    iZzd = zzand.zzd((List) unsafe.getObject(t2, j));
                    if (iZzd > 0) {
                        iZzh = zzakn.zzh(i8);
                        iZzi = zzakn.zzi(iZzd);
                        i5 = iZzi + iZzh + iZzd + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 41:
                    iZzd = zzand.zzc((List) unsafe.getObject(t2, j));
                    if (iZzd > 0) {
                        iZzh = zzakn.zzh(i8);
                        iZzi = zzakn.zzi(iZzd);
                        i5 = iZzi + iZzh + iZzd + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 42:
                    iZzd = zzand.zza((List<?>) unsafe.getObject(t2, j));
                    if (iZzd > 0) {
                        iZzh = zzakn.zzh(i8);
                        iZzi = zzakn.zzi(iZzd);
                        i5 = iZzi + iZzh + iZzd + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 43:
                    iZzd = zzand.zzi((List) unsafe.getObject(t2, j));
                    if (iZzd > 0) {
                        iZzh = zzakn.zzh(i8);
                        iZzi = zzakn.zzi(iZzd);
                        i5 = iZzi + iZzh + iZzd + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 44:
                    iZzd = zzand.zzb((List) unsafe.getObject(t2, j));
                    if (iZzd > 0) {
                        iZzh = zzakn.zzh(i8);
                        iZzi = zzakn.zzi(iZzd);
                        i5 = iZzi + iZzh + iZzd + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 45:
                    iZzd = zzand.zzc((List) unsafe.getObject(t2, j));
                    if (iZzd > 0) {
                        iZzh = zzakn.zzh(i8);
                        iZzi = zzakn.zzi(iZzd);
                        i5 = iZzi + iZzh + iZzd + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 46:
                    iZzd = zzand.zzd((List) unsafe.getObject(t2, j));
                    if (iZzd > 0) {
                        iZzh = zzakn.zzh(i8);
                        iZzi = zzakn.zzi(iZzd);
                        i5 = iZzi + iZzh + iZzd + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 47:
                    iZzd = zzand.zzg((List) unsafe.getObject(t2, j));
                    if (iZzd > 0) {
                        iZzh = zzakn.zzh(i8);
                        iZzi = zzakn.zzi(iZzd);
                        i5 = iZzi + iZzh + iZzd + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 48:
                    iZzd = zzand.zzh((List) unsafe.getObject(t2, j));
                    if (iZzd > 0) {
                        iZzh = zzakn.zzh(i8);
                        iZzi = zzakn.zzi(iZzd);
                        i5 = iZzi + iZzh + iZzd + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 49:
                    iZza3 = zzand.zza(i8, (List<zzamm>) unsafe.getObject(t2, j), (zzanb<?>) zzamqVar.zze(i3));
                    i5 = i11 + iZza3;
                    break;
                case 50:
                    iZza3 = zzamqVar.zzr.zza(i8, unsafe.getObject(t2, j), zzamqVar.zzf(i3));
                    i5 = i11 + iZza3;
                    break;
                case 51:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        iZza = zzakn.zza(i8, 0.0d);
                        i5 = iZza + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 52:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        iZza = zzakn.zza(i8, BitmapDescriptorFactory.HUE_RED);
                        i5 = iZza + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 53:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        iZza = zzakn.zzb(i8, zzd(t2, j));
                        i5 = iZza + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 54:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        iZza = zzakn.zze(i8, zzd(t2, j));
                        i5 = iZza + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 55:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        iZza = zzakn.zzc(i8, zzc(t2, j));
                        i5 = iZza + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 56:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        iZza = zzakn.zza(i8, 0L);
                        i5 = iZza + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 57:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        iZza = zzakn.zzb(i8, 0);
                        i5 = iZza + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 58:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        iZza = zzakn.zza(i8, true);
                        i5 = iZza + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 59:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        Object object2 = unsafe.getObject(t2, j);
                        if (object2 instanceof zzajv) {
                            iZza = zzakn.zza(i8, (zzajv) object2);
                        } else {
                            iZza = zzakn.zza(i8, (String) object2);
                        }
                        i5 = iZza + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 60:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        iZza3 = zzand.zza(i8, unsafe.getObject(t2, j), (zzanb<?>) zzamqVar.zze(i3));
                        i5 = i11 + iZza3;
                        break;
                    }
                    i5 = i11;
                    break;
                case 61:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        iZza = zzakn.zza(i8, (zzajv) unsafe.getObject(t2, j));
                        i5 = iZza + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 62:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        iZza = zzakn.zzf(i8, zzc(t2, j));
                        i5 = iZza + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 63:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        iZza = zzakn.zza(i8, zzc(t2, j));
                        i5 = iZza + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 64:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        iZza = zzakn.zzd(i8, 0);
                        i5 = iZza + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 65:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        iZza = zzakn.zzc(i8, 0L);
                        i5 = iZza + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 66:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        iZza = zzakn.zze(i8, zzc(t2, j));
                        i5 = iZza + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 67:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        iZza = zzakn.zzd(i8, zzd(t2, j));
                        i5 = iZza + i11;
                        break;
                    }
                    i5 = i11;
                    break;
                case 68:
                    if (zzamqVar.zzc((zzamq<T>) t2, i8, i3)) {
                        iZza3 = zzand.zza(i8, (zzamm) unsafe.getObject(t2, j), zzamqVar.zze(i3));
                        i5 = i11 + iZza3;
                        break;
                    }
                    i5 = i11;
                    break;
                default:
                    i5 = i11;
                    break;
            }
            i3 += 3;
            i2 = 1048575;
        }
        zzanu<?, ?> zzanuVar = zzamqVar.zzp;
        int iZza4 = i5 + zzanuVar.zza((zzanu<?, ?>) zzanuVar.zzd(t2));
        if (!zzamqVar.zzh) {
            return iZza4;
        }
        zzakx<T> zzakxVarZza = zzamqVar.zzq.zza(t2);
        int iZzb2 = zzakxVarZza.zza.zzb();
        int iZza5 = 0;
        for (int i12 = 0; i12 < iZzb2; i12++) {
            Map.Entry entryZza = zzakxVarZza.zza.zza(i12);
            iZza5 += zzakx.zza((zzakz<?>) entryZza.getKey(), entryZza.getValue());
        }
        for (Map.Entry entry : zzakxVarZza.zza.zzc()) {
            iZza5 += zzakx.zza((zzakz<?>) entry.getKey(), entry.getValue());
        }
        return iZza4 + iZza5;
    }

    private static <T> boolean zze(T t, long j) {
        return ((Boolean) zzanz.zze(t, j)).booleanValue();
    }

    private final boolean zzc(T t, int i, int i2) {
        return zzanz.zzc(t, (long) (zzb(i2) & 1048575)) == i;
    }

    private final int zzb(int i) {
        return this.zzc[i + 2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzb(T t, T t2, int i) {
        int i2 = this.zzc[i];
        if (zzc((zzamq<T>) t2, i2, i)) {
            long jZzc = zzc(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t2, jZzc);
            if (object != null) {
                zzanb zzanbVarZze = zze(i);
                if (!zzc((zzamq<T>) t, i2, i)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t, jZzc, object);
                    } else {
                        Object objZza = zzanbVarZze.zza();
                        zzanbVarZze.zza(objZza, object);
                        unsafe.putObject(t, jZzc, objZza);
                    }
                    zzb((zzamq<T>) t, i2, i);
                    return;
                }
                Object object2 = unsafe.getObject(t, jZzc);
                if (!zzg(object2)) {
                    Object objZza2 = zzanbVarZze.zza();
                    zzanbVarZze.zza(objZza2, object2);
                    unsafe.putObject(t, jZzc, objZza2);
                    object2 = objZza2;
                }
                zzanbVarZze.zza(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + String.valueOf(t2));
        }
    }

    private final void zzb(T t, int i) {
        int iZzb = zzb(i);
        long j = 1048575 & iZzb;
        if (j == 1048575) {
            return;
        }
        zzanz.zza((Object) t, j, (1 << (iZzb >>> 20)) | zzanz.zzc(t, j));
    }

    private final void zzb(T t, int i, int i2) {
        zzanz.zza((Object) t, zzb(i2) & 1048575, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzb(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamq.zzb(java.lang.Object, java.lang.Object):boolean");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int zza(T r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.p002firebaseauthapi.zzaju r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamq.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.firebase-auth-api.zzaju):int");
    }

    private final int zza(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zza(i, 0);
    }

    private final int zza(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x028a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> com.google.android.gms.internal.p002firebaseauthapi.zzamq<T> zza(java.lang.Class<T> r31, com.google.android.gms.internal.p002firebaseauthapi.zzamk r32, com.google.android.gms.internal.p002firebaseauthapi.zzamu r33, com.google.android.gms.internal.p002firebaseauthapi.zzalw r34, com.google.android.gms.internal.p002firebaseauthapi.zzanu<?, ?> r35, com.google.android.gms.internal.p002firebaseauthapi.zzakw<?> r36, com.google.android.gms.internal.p002firebaseauthapi.zzamf r37) {
        /*
            Method dump skipped, instructions count: 1015
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamq.zza(java.lang.Class, com.google.android.gms.internal.firebase-auth-api.zzamk, com.google.android.gms.internal.firebase-auth-api.zzamu, com.google.android.gms.internal.firebase-auth-api.zzalw, com.google.android.gms.internal.firebase-auth-api.zzanu, com.google.android.gms.internal.firebase-auth-api.zzakw, com.google.android.gms.internal.firebase-auth-api.zzamf):com.google.android.gms.internal.firebase-auth-api.zzamq");
    }

    private final <UT, UB> UB zza(Object obj, int i, UB ub, zzanu<UT, UB> zzanuVar, Object obj2) {
        zzalj zzaljVarZzd;
        int i2 = this.zzc[i];
        Object objZze = zzanz.zze(obj, zzc(i) & 1048575);
        return (objZze == null || (zzaljVarZzd = zzd(i)) == null) ? ub : (UB) zza(i, i2, this.zzr.zze(objZze), zzaljVarZzd, (zzalj) ub, (zzanu<UT, zzalj>) zzanuVar, obj2);
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzalj zzaljVar, UB ub, zzanu<UT, UB> zzanuVar, Object obj) {
        zzamd<?, ?> zzamdVarZza = this.zzr.zza(zzf(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzaljVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzanuVar.zzc(obj);
                }
                zzake zzakeVarZzc = zzajv.zzc(zzame.zza(zzamdVarZza, next.getKey(), next.getValue()));
                try {
                    zzame.zza(zzakeVarZzc.zzb(), zzamdVarZza, next.getKey(), next.getValue());
                    zzanuVar.zza((zzanu<UT, UB>) ub, i2, zzakeVarZzc.zza());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t, int i) {
        zzanb zzanbVarZze = zze(i);
        long jZzc = zzc(i) & 1048575;
        if (!zzc((zzamq<T>) t, i)) {
            return zzanbVarZze.zza();
        }
        Object object = zzb.getObject(t, jZzc);
        if (zzg(object)) {
            return object;
        }
        Object objZza = zzanbVarZze.zza();
        if (object != null) {
            zzanbVarZze.zza(objZza, object);
        }
        return objZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t, int i, int i2) {
        zzanb zzanbVarZze = zze(i2);
        if (!zzc((zzamq<T>) t, i, i2)) {
            return zzanbVarZze.zza();
        }
        Object object = zzb.getObject(t, zzc(i2) & 1048575);
        if (zzg(object)) {
            return object;
        }
        Object objZza = zzanbVarZze.zza();
        if (object != null) {
            zzanbVarZze.zza(objZza, object);
        }
        return objZza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final T zza() {
        return (T) this.zzn.zza(this.zzg);
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbV = a.v("Field ", str, " for ", name, " not found. Known fields are ");
            sbV.append(string);
            throw new RuntimeException(sbV.toString(), e);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zza(T t, T t2) {
        zzf(t);
        t2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzc = zzc(i);
            long j = 1048575 & iZzc;
            int i2 = this.zzc[i];
            switch ((iZzc & 267386880) >>> 20) {
                case 0:
                    if (zzc((zzamq<T>) t2, i)) {
                        zzanz.zza(t, j, zzanz.zza(t2, j));
                        zzb((zzamq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzc((zzamq<T>) t2, i)) {
                        zzanz.zza((Object) t, j, zzanz.zzb(t2, j));
                        zzb((zzamq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzc((zzamq<T>) t2, i)) {
                        zzanz.zza((Object) t, j, zzanz.zzd(t2, j));
                        zzb((zzamq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzc((zzamq<T>) t2, i)) {
                        zzanz.zza((Object) t, j, zzanz.zzd(t2, j));
                        zzb((zzamq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzc((zzamq<T>) t2, i)) {
                        zzanz.zza((Object) t, j, zzanz.zzc(t2, j));
                        zzb((zzamq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzc((zzamq<T>) t2, i)) {
                        zzanz.zza((Object) t, j, zzanz.zzd(t2, j));
                        zzb((zzamq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzc((zzamq<T>) t2, i)) {
                        zzanz.zza((Object) t, j, zzanz.zzc(t2, j));
                        zzb((zzamq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzc((zzamq<T>) t2, i)) {
                        zzanz.zzc(t, j, zzanz.zzh(t2, j));
                        zzb((zzamq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzc((zzamq<T>) t2, i)) {
                        zzanz.zza(t, j, zzanz.zze(t2, j));
                        zzb((zzamq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (zzc((zzamq<T>) t2, i)) {
                        zzanz.zza(t, j, zzanz.zze(t2, j));
                        zzb((zzamq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzc((zzamq<T>) t2, i)) {
                        zzanz.zza((Object) t, j, zzanz.zzc(t2, j));
                        zzb((zzamq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzc((zzamq<T>) t2, i)) {
                        zzanz.zza((Object) t, j, zzanz.zzc(t2, j));
                        zzb((zzamq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzc((zzamq<T>) t2, i)) {
                        zzanz.zza((Object) t, j, zzanz.zzc(t2, j));
                        zzb((zzamq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzc((zzamq<T>) t2, i)) {
                        zzanz.zza((Object) t, j, zzanz.zzd(t2, j));
                        zzb((zzamq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzc((zzamq<T>) t2, i)) {
                        zzanz.zza((Object) t, j, zzanz.zzc(t2, j));
                        zzb((zzamq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzc((zzamq<T>) t2, i)) {
                        zzanz.zza((Object) t, j, zzanz.zzd(t2, j));
                        zzb((zzamq<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t, t2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzo.zza(t, t2, j);
                    break;
                case 50:
                    zzand.zza(this.zzr, t, t2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzc((zzamq<T>) t2, i2, i)) {
                        zzanz.zza(t, j, zzanz.zze(t2, j));
                        zzb((zzamq<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzc((zzamq<T>) t2, i2, i)) {
                        zzanz.zza(t, j, zzanz.zze(t2, j));
                        zzb((zzamq<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t, t2, i);
                    break;
            }
        }
        zzand.zza(this.zzp, t, t2);
        if (this.zzh) {
            zzand.zza(this.zzq, t, t2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:244:?, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0775 A[Catch: all -> 0x0062, TryCatch #1 {all -> 0x0062, blocks: (B:24:0x0058, B:186:0x0770, B:188:0x0775, B:189:0x077a, B:83:0x013a, B:84:0x014c, B:85:0x0164, B:86:0x017c, B:87:0x0194, B:88:0x01ac, B:90:0x01bc, B:93:0x01c3, B:94:0x01c9, B:95:0x01d7, B:96:0x01ef, B:97:0x0203, B:98:0x021b, B:99:0x0229, B:100:0x0241, B:101:0x0259, B:102:0x0271, B:103:0x0289, B:104:0x02a1, B:105:0x02b9, B:106:0x02d1, B:107:0x02e9, B:109:0x02ff, B:113:0x0320, B:110:0x0309, B:112:0x0311, B:114:0x0331, B:115:0x0349, B:116:0x035d, B:117:0x0371, B:118:0x0385, B:119:0x0399, B:128:0x03cc, B:129:0x03da, B:130:0x03ee, B:131:0x0402, B:132:0x0416, B:133:0x042a, B:134:0x043e, B:135:0x0452, B:136:0x0466, B:137:0x047a, B:138:0x048e, B:139:0x04a2, B:140:0x04b6, B:141:0x04ca, B:146:0x04f1, B:147:0x04ff, B:148:0x0513, B:149:0x052b, B:151:0x0537, B:152:0x0545, B:153:0x0553, B:154:0x0567, B:155:0x057b, B:156:0x058f, B:157:0x05a3, B:158:0x05b7, B:159:0x05cb, B:160:0x05df, B:161:0x05f3, B:162:0x060b, B:163:0x0620, B:164:0x0634, B:165:0x0648, B:166:0x065c, B:168:0x066b, B:171:0x0672, B:172:0x0678, B:173:0x0682, B:174:0x0696, B:175:0x06aa, B:176:0x06c2, B:177:0x06d0, B:178:0x06e4, B:179:0x06f8, B:180:0x070c, B:181:0x0720, B:182:0x0734, B:183:0x0748, B:184:0x075c), top: B:213:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x07ae A[LOOP:1: B:203:0x07aa->B:205:0x07ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0781 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r19, com.google.android.gms.internal.p002firebaseauthapi.zzanc r20, com.google.android.gms.internal.p002firebaseauthapi.zzaku r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2132
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamq.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzanc, com.google.android.gms.internal.firebase-auth-api.zzaku):void");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zza(T t, byte[] bArr, int i, int i2, zzaju zzajuVar) throws IOException {
        zza((zzamq<T>) t, bArr, i, i2, 0, zzajuVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(T t, T t2, int i) {
        if (zzc((zzamq<T>) t2, i)) {
            long jZzc = zzc(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t2, jZzc);
            if (object != null) {
                zzanb zzanbVarZze = zze(i);
                if (!zzc((zzamq<T>) t, i)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t, jZzc, object);
                    } else {
                        Object objZza = zzanbVarZze.zza();
                        zzanbVarZze.zza(objZza, object);
                        unsafe.putObject(t, jZzc, objZza);
                    }
                    zzb((zzamq<T>) t, i);
                    return;
                }
                Object object2 = unsafe.getObject(t, jZzc);
                if (!zzg(object2)) {
                    Object objZza2 = zzanbVarZze.zza();
                    zzanbVarZze.zza(objZza2, object2);
                    unsafe.putObject(t, jZzc, objZza2);
                    object2 = objZza2;
                }
                zzanbVarZze.zza(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + String.valueOf(t2));
        }
    }

    private final void zza(Object obj, int i, zzanc zzancVar) throws IOException {
        if (zzg(i)) {
            zzanz.zza(obj, i & 1048575, zzancVar.zzr());
        } else if (this.zzi) {
            zzanz.zza(obj, i & 1048575, zzancVar.zzq());
        } else {
            zzanz.zza(obj, i & 1048575, zzancVar.zzp());
        }
    }

    private final void zza(T t, int i, Object obj) {
        zzb.putObject(t, zzc(i) & 1048575, obj);
        zzb((zzamq<T>) t, i);
    }

    private final void zza(T t, int i, int i2, Object obj) {
        zzb.putObject(t, zzc(i2) & 1048575, obj);
        zzb((zzamq<T>) t, i, i2);
    }

    private final <K, V> void zza(zzaol zzaolVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzaolVar.zza(i, this.zzr.zza(zzf(i2)), this.zzr.zzd(obj));
        }
    }

    private static void zza(int i, Object obj, zzaol zzaolVar) throws IOException {
        if (obj instanceof String) {
            zzaolVar.zza(i, (String) obj);
        } else {
            zzaolVar.zza(i, (zzajv) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r21, com.google.android.gms.internal.p002firebaseauthapi.zzaol r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2968
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamq.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzaol):void");
    }

    private static <UT, UB> void zza(zzanu<UT, UB> zzanuVar, T t, zzaol zzaolVar) throws IOException {
        zzanuVar.zzb((zzanu<UT, UB>) zzanuVar.zzd(t), zzaolVar);
    }

    private final boolean zza(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzc((zzamq<T>) t, i);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i, zzanb zzanbVar) {
        return zzanbVar.zze(zzanz.zze(obj, i & 1048575));
    }
}
