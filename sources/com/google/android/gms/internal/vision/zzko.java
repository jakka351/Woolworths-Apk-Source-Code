package com.google.android.gms.internal.vision;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.android.gms.common.api.internal.a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes5.dex */
final class zzko<T> implements zzlc<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzma.zzc();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzkk zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final int[] zzl;
    private final int zzm;
    private final int zzn;
    private final zzks zzo;
    private final zzju zzp;
    private final zzlu<?, ?> zzq;
    private final zziq<?> zzr;
    private final zzkh zzs;

    private zzko(int[] iArr, Object[] objArr, int i, int i2, zzkk zzkkVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzks zzksVar, zzju zzjuVar, zzlu<?, ?> zzluVar, zziq<?> zziqVar, zzkh zzkhVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzkkVar instanceof zzjb;
        this.zzj = z;
        this.zzh = zziqVar != null && zziqVar.zza(zzkkVar);
        this.zzk = false;
        this.zzl = iArr2;
        this.zzm = i3;
        this.zzn = i4;
        this.zzo = zzksVar;
        this.zzp = zzjuVar;
        this.zzq = zzluVar;
        this.zzr = zziqVar;
        this.zzg = zzkkVar;
        this.zzs = zzkhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x037f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> com.google.android.gms.internal.vision.zzko<T> zza(java.lang.Class<T> r32, com.google.android.gms.internal.vision.zzki r33, com.google.android.gms.internal.vision.zzks r34, com.google.android.gms.internal.vision.zzju r35, com.google.android.gms.internal.vision.zzlu<?, ?> r36, com.google.android.gms.internal.vision.zziq<?> r37, com.google.android.gms.internal.vision.zzkh r38) {
        /*
            Method dump skipped, instructions count: 1010
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzko.zza(java.lang.Class, com.google.android.gms.internal.vision.zzki, com.google.android.gms.internal.vision.zzks, com.google.android.gms.internal.vision.zzju, com.google.android.gms.internal.vision.zzlu, com.google.android.gms.internal.vision.zziq, com.google.android.gms.internal.vision.zzkh):com.google.android.gms.internal.vision.zzko");
    }

    private final zzjg zzc(int i) {
        return (zzjg) this.zzd[((i / 3) << 1) + 1];
    }

    private static zzlx zze(Object obj) {
        zzjb zzjbVar = (zzjb) obj;
        zzlx zzlxVar = zzjbVar.zzb;
        if (zzlxVar != zzlx.zza()) {
            return zzlxVar;
        }
        zzlx zzlxVarZzb = zzlx.zzb();
        zzjbVar.zzb = zzlxVarZzb;
        return zzlxVarZzb;
    }

    private static boolean zzf(int i) {
        return (i & 536870912) != 0;
    }

    private final int zzg(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzb(i, 0);
    }

    @Override // com.google.android.gms.internal.vision.zzlc
    public final void zzb(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzd = zzd(i);
            long j = 1048575 & iZzd;
            int i2 = this.zzc[i];
            switch ((iZzd & 267386880) >>> 20) {
                case 0:
                    if (zza((zzko<T>) t2, i)) {
                        zzma.zza(t, j, zzma.zze(t2, j));
                        zzb((zzko<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zza((zzko<T>) t2, i)) {
                        zzma.zza((Object) t, j, zzma.zzd(t2, j));
                        zzb((zzko<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zza((zzko<T>) t2, i)) {
                        zzma.zza((Object) t, j, zzma.zzb(t2, j));
                        zzb((zzko<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zza((zzko<T>) t2, i)) {
                        zzma.zza((Object) t, j, zzma.zzb(t2, j));
                        zzb((zzko<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zza((zzko<T>) t2, i)) {
                        zzma.zza((Object) t, j, zzma.zza(t2, j));
                        zzb((zzko<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zza((zzko<T>) t2, i)) {
                        zzma.zza((Object) t, j, zzma.zzb(t2, j));
                        zzb((zzko<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zza((zzko<T>) t2, i)) {
                        zzma.zza((Object) t, j, zzma.zza(t2, j));
                        zzb((zzko<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zza((zzko<T>) t2, i)) {
                        zzma.zza(t, j, zzma.zzc(t2, j));
                        zzb((zzko<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zza((zzko<T>) t2, i)) {
                        zzma.zza(t, j, zzma.zzf(t2, j));
                        zzb((zzko<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (zza((zzko<T>) t2, i)) {
                        zzma.zza(t, j, zzma.zzf(t2, j));
                        zzb((zzko<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zza((zzko<T>) t2, i)) {
                        zzma.zza((Object) t, j, zzma.zza(t2, j));
                        zzb((zzko<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zza((zzko<T>) t2, i)) {
                        zzma.zza((Object) t, j, zzma.zza(t2, j));
                        zzb((zzko<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zza((zzko<T>) t2, i)) {
                        zzma.zza((Object) t, j, zzma.zza(t2, j));
                        zzb((zzko<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zza((zzko<T>) t2, i)) {
                        zzma.zza((Object) t, j, zzma.zzb(t2, j));
                        zzb((zzko<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zza((zzko<T>) t2, i)) {
                        zzma.zza((Object) t, j, zzma.zza(t2, j));
                        zzb((zzko<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zza((zzko<T>) t2, i)) {
                        zzma.zza((Object) t, j, zzma.zzb(t2, j));
                        zzb((zzko<T>) t, i);
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
                    this.zzp.zza(t, t2, j);
                    break;
                case 50:
                    zzle.zza(this.zzs, t, t2, j);
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
                    if (zza((zzko<T>) t2, i2, i)) {
                        zzma.zza(t, j, zzma.zzf(t2, j));
                        zzb((zzko<T>) t, i2, i);
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
                    if (zza((zzko<T>) t2, i2, i)) {
                        zzma.zza(t, j, zzma.zzf(t2, j));
                        zzb((zzko<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t, t2, i);
                    break;
            }
        }
        zzle.zza(this.zzq, t, t2);
        if (this.zzh) {
            zzle.zza(this.zzr, t, t2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7  */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.google.android.gms.internal.vision.zzlc] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [com.google.android.gms.internal.vision.zzlc] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    @Override // com.google.android.gms.internal.vision.zzlc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzd(T r15) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzko.zzd(java.lang.Object):boolean");
    }

    private static <T> boolean zzf(T t, long j) {
        return ((Boolean) zzma.zzf(t, j)).booleanValue();
    }

    @Override // com.google.android.gms.internal.vision.zzlc
    public final void zzc(T t) {
        int i;
        int i2 = this.zzm;
        while (true) {
            i = this.zzn;
            if (i2 >= i) {
                break;
            }
            long jZzd = zzd(this.zzl[i2]) & 1048575;
            Object objZzf = zzma.zzf(t, jZzd);
            if (objZzf != null) {
                zzma.zza(t, jZzd, this.zzs.zze(objZzf));
            }
            i2++;
        }
        int length = this.zzl.length;
        while (i < length) {
            this.zzp.zzb(t, this.zzl[i]);
            i++;
        }
        this.zzq.zzd(t);
        if (this.zzh) {
            this.zzr.zzc(t);
        }
    }

    private final int zze(int i) {
        return this.zzc[i + 2];
    }

    private static <T> long zze(T t, long j) {
        return ((Long) zzma.zzf(t, j)).longValue();
    }

    private static <T> float zzc(T t, long j) {
        return ((Float) zzma.zzf(t, j)).floatValue();
    }

    private final boolean zzc(T t, T t2, int i) {
        return zza((zzko<T>) t, i) == zza((zzko<T>) t2, i);
    }

    private final int zzd(int i) {
        return this.zzc[i + 1];
    }

    private static <T> int zzd(T t, long j) {
        return ((Integer) zzma.zzf(t, j)).intValue();
    }

    private final void zzb(T t, T t2, int i) {
        int iZzd = zzd(i);
        int i2 = this.zzc[i];
        long j = iZzd & 1048575;
        if (zza((zzko<T>) t2, i2, i)) {
            Object objZzf = zza((zzko<T>) t, i2, i) ? zzma.zzf(t, j) : null;
            Object objZzf2 = zzma.zzf(t2, j);
            if (objZzf != null && objZzf2 != null) {
                zzma.zza(t, j, zzjf.zza(objZzf, objZzf2));
                zzb((zzko<T>) t, i2, i);
            } else if (objZzf2 != null) {
                zzma.zza(t, j, objZzf2);
                zzb((zzko<T>) t, i2, i);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.vision.zzlc
    public final int zzb(T t) {
        int i;
        int i2;
        boolean z;
        int iZzd;
        int iZzb;
        int iZza;
        int iZzj;
        int iZzh;
        int iZzb2;
        int iZza2;
        int i3 = 267386880;
        int i4 = 1048575;
        int i5 = 0;
        if (this.zzj) {
            Unsafe unsafe = zzb;
            int i6 = 0;
            int iX = 0;
            while (i6 < this.zzc.length) {
                int iZzd2 = zzd(i6);
                int i7 = (iZzd2 & i3) >>> 20;
                int i8 = i3;
                int i9 = this.zzc[i6];
                long j = iZzd2 & 1048575;
                if (i7 >= zziv.zza.zza() && i7 <= zziv.zzb.zza()) {
                    int i10 = this.zzc[i6 + 2];
                }
                switch (i7) {
                    case 0:
                        if (zza((zzko<T>) t, i6)) {
                            iZzb2 = zzii.zzb(i9, 0.0d);
                            iX += iZzb2;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zza((zzko<T>) t, i6)) {
                            iZzb2 = zzii.zzb(i9, BitmapDescriptorFactory.HUE_RED);
                            iX += iZzb2;
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zza((zzko<T>) t, i6)) {
                            iZzb2 = zzii.zzd(i9, zzma.zzb(t, j));
                            iX += iZzb2;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zza((zzko<T>) t, i6)) {
                            iZzb2 = zzii.zze(i9, zzma.zzb(t, j));
                            iX += iZzb2;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zza((zzko<T>) t, i6)) {
                            iZzb2 = zzii.zzf(i9, zzma.zza(t, j));
                            iX += iZzb2;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zza((zzko<T>) t, i6)) {
                            iZzb2 = zzii.zzg(i9, 0L);
                            iX += iZzb2;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zza((zzko<T>) t, i6)) {
                            iZzb2 = zzii.zzi(i9, 0);
                            iX += iZzb2;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zza((zzko<T>) t, i6)) {
                            iZzb2 = zzii.zzb(i9, true);
                            iX += iZzb2;
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zza((zzko<T>) t, i6)) {
                            Object objZzf = zzma.zzf(t, j);
                            if (objZzf instanceof zzht) {
                                iZzb2 = zzii.zzc(i9, (zzht) objZzf);
                            } else {
                                iZzb2 = zzii.zzb(i9, (String) objZzf);
                            }
                            iX += iZzb2;
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zza((zzko<T>) t, i6)) {
                            iZza2 = zzle.zza(i9, zzma.zzf(t, j), zza(i6));
                            iX += iZza2;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zza((zzko<T>) t, i6)) {
                            iZzb2 = zzii.zzc(i9, (zzht) zzma.zzf(t, j));
                            iX += iZzb2;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zza((zzko<T>) t, i6)) {
                            iZzb2 = zzii.zzg(i9, zzma.zza(t, j));
                            iX += iZzb2;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zza((zzko<T>) t, i6)) {
                            iZzb2 = zzii.zzk(i9, zzma.zza(t, j));
                            iX += iZzb2;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zza((zzko<T>) t, i6)) {
                            iZzb2 = zzii.zzj(i9, 0);
                            iX += iZzb2;
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zza((zzko<T>) t, i6)) {
                            iZzb2 = zzii.zzh(i9, 0L);
                            iX += iZzb2;
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zza((zzko<T>) t, i6)) {
                            iZzb2 = zzii.zzh(i9, zzma.zza(t, j));
                            iX += iZzb2;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zza((zzko<T>) t, i6)) {
                            iZzb2 = zzii.zzf(i9, zzma.zzb(t, j));
                            iX += iZzb2;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zza((zzko<T>) t, i6)) {
                            iZzb2 = zzii.zzc(i9, (zzkk) zzma.zzf(t, j), zza(i6));
                            iX += iZzb2;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        iZza2 = zzle.zzi(i9, zza(t, j), false);
                        iX += iZza2;
                        break;
                    case 19:
                        iZza2 = zzle.zzh(i9, zza(t, j), false);
                        iX += iZza2;
                        break;
                    case 20:
                        iZza2 = zzle.zza(i9, (List<Long>) zza(t, j), false);
                        iX += iZza2;
                        break;
                    case 21:
                        iZza2 = zzle.zzb(i9, (List<Long>) zza(t, j), false);
                        iX += iZza2;
                        break;
                    case 22:
                        iZza2 = zzle.zze(i9, zza(t, j), false);
                        iX += iZza2;
                        break;
                    case 23:
                        iZza2 = zzle.zzi(i9, zza(t, j), false);
                        iX += iZza2;
                        break;
                    case 24:
                        iZza2 = zzle.zzh(i9, zza(t, j), false);
                        iX += iZza2;
                        break;
                    case 25:
                        iZza2 = zzle.zzj(i9, zza(t, j), false);
                        iX += iZza2;
                        break;
                    case 26:
                        iZza2 = zzle.zza(i9, zza(t, j));
                        iX += iZza2;
                        break;
                    case 27:
                        iZza2 = zzle.zza(i9, zza(t, j), zza(i6));
                        iX += iZza2;
                        break;
                    case 28:
                        iZza2 = zzle.zzb(i9, zza(t, j));
                        iX += iZza2;
                        break;
                    case 29:
                        iZza2 = zzle.zzf(i9, zza(t, j), false);
                        iX += iZza2;
                        break;
                    case 30:
                        iZza2 = zzle.zzd(i9, zza(t, j), false);
                        iX += iZza2;
                        break;
                    case 31:
                        iZza2 = zzle.zzh(i9, zza(t, j), false);
                        iX += iZza2;
                        break;
                    case 32:
                        iZza2 = zzle.zzi(i9, zza(t, j), false);
                        iX += iZza2;
                        break;
                    case 33:
                        iZza2 = zzle.zzg(i9, zza(t, j), false);
                        iX += iZza2;
                        break;
                    case 34:
                        iZza2 = zzle.zzc(i9, zza(t, j), false);
                        iX += iZza2;
                        break;
                    case 35:
                        int iZzi = zzle.zzi((List) unsafe.getObject(t, j));
                        if (iZzi > 0) {
                            iX = a.x(iZzi, zzii.zze(i9), iZzi, iX);
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        int iZzh2 = zzle.zzh((List) unsafe.getObject(t, j));
                        if (iZzh2 > 0) {
                            iX = a.x(iZzh2, zzii.zze(i9), iZzh2, iX);
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        int iZza3 = zzle.zza((List<Long>) unsafe.getObject(t, j));
                        if (iZza3 > 0) {
                            iX = a.x(iZza3, zzii.zze(i9), iZza3, iX);
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        int iZzb3 = zzle.zzb((List) unsafe.getObject(t, j));
                        if (iZzb3 > 0) {
                            iX = a.x(iZzb3, zzii.zze(i9), iZzb3, iX);
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        int iZze = zzle.zze((List) unsafe.getObject(t, j));
                        if (iZze > 0) {
                            iX = a.x(iZze, zzii.zze(i9), iZze, iX);
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        int iZzi2 = zzle.zzi((List) unsafe.getObject(t, j));
                        if (iZzi2 > 0) {
                            iX = a.x(iZzi2, zzii.zze(i9), iZzi2, iX);
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        int iZzh3 = zzle.zzh((List) unsafe.getObject(t, j));
                        if (iZzh3 > 0) {
                            iX = a.x(iZzh3, zzii.zze(i9), iZzh3, iX);
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        int iZzj2 = zzle.zzj((List) unsafe.getObject(t, j));
                        if (iZzj2 > 0) {
                            iX = a.x(iZzj2, zzii.zze(i9), iZzj2, iX);
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        int iZzf = zzle.zzf((List) unsafe.getObject(t, j));
                        if (iZzf > 0) {
                            iX = a.x(iZzf, zzii.zze(i9), iZzf, iX);
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        int iZzd3 = zzle.zzd((List) unsafe.getObject(t, j));
                        if (iZzd3 > 0) {
                            iX = a.x(iZzd3, zzii.zze(i9), iZzd3, iX);
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        int iZzh4 = zzle.zzh((List) unsafe.getObject(t, j));
                        if (iZzh4 > 0) {
                            iX = a.x(iZzh4, zzii.zze(i9), iZzh4, iX);
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        int iZzi3 = zzle.zzi((List) unsafe.getObject(t, j));
                        if (iZzi3 > 0) {
                            iX = a.x(iZzi3, zzii.zze(i9), iZzi3, iX);
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        int iZzg = zzle.zzg((List) unsafe.getObject(t, j));
                        if (iZzg > 0) {
                            iX = a.x(iZzg, zzii.zze(i9), iZzg, iX);
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        int iZzc = zzle.zzc((List) unsafe.getObject(t, j));
                        if (iZzc > 0) {
                            iX = a.x(iZzc, zzii.zze(i9), iZzc, iX);
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        iZza2 = zzle.zzb(i9, (List<zzkk>) zza(t, j), zza(i6));
                        iX += iZza2;
                        break;
                    case 50:
                        iZza2 = this.zzs.zza(i9, zzma.zzf(t, j), zzb(i6));
                        iX += iZza2;
                        break;
                    case 51:
                        if (zza((zzko<T>) t, i9, i6)) {
                            iZzb2 = zzii.zzb(i9, 0.0d);
                            iX += iZzb2;
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zza((zzko<T>) t, i9, i6)) {
                            iZzb2 = zzii.zzb(i9, BitmapDescriptorFactory.HUE_RED);
                            iX += iZzb2;
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zza((zzko<T>) t, i9, i6)) {
                            iZzb2 = zzii.zzd(i9, zze(t, j));
                            iX += iZzb2;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zza((zzko<T>) t, i9, i6)) {
                            iZzb2 = zzii.zze(i9, zze(t, j));
                            iX += iZzb2;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zza((zzko<T>) t, i9, i6)) {
                            iZzb2 = zzii.zzf(i9, zzd(t, j));
                            iX += iZzb2;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zza((zzko<T>) t, i9, i6)) {
                            iZzb2 = zzii.zzg(i9, 0L);
                            iX += iZzb2;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zza((zzko<T>) t, i9, i6)) {
                            iZzb2 = zzii.zzi(i9, 0);
                            iX += iZzb2;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zza((zzko<T>) t, i9, i6)) {
                            iZzb2 = zzii.zzb(i9, true);
                            iX += iZzb2;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zza((zzko<T>) t, i9, i6)) {
                            Object objZzf2 = zzma.zzf(t, j);
                            if (objZzf2 instanceof zzht) {
                                iZzb2 = zzii.zzc(i9, (zzht) objZzf2);
                            } else {
                                iZzb2 = zzii.zzb(i9, (String) objZzf2);
                            }
                            iX += iZzb2;
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (zza((zzko<T>) t, i9, i6)) {
                            iZza2 = zzle.zza(i9, zzma.zzf(t, j), zza(i6));
                            iX += iZza2;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zza((zzko<T>) t, i9, i6)) {
                            iZzb2 = zzii.zzc(i9, (zzht) zzma.zzf(t, j));
                            iX += iZzb2;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zza((zzko<T>) t, i9, i6)) {
                            iZzb2 = zzii.zzg(i9, zzd(t, j));
                            iX += iZzb2;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zza((zzko<T>) t, i9, i6)) {
                            iZzb2 = zzii.zzk(i9, zzd(t, j));
                            iX += iZzb2;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zza((zzko<T>) t, i9, i6)) {
                            iZzb2 = zzii.zzj(i9, 0);
                            iX += iZzb2;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zza((zzko<T>) t, i9, i6)) {
                            iZzb2 = zzii.zzh(i9, 0L);
                            iX += iZzb2;
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zza((zzko<T>) t, i9, i6)) {
                            iZzb2 = zzii.zzh(i9, zzd(t, j));
                            iX += iZzb2;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zza((zzko<T>) t, i9, i6)) {
                            iZzb2 = zzii.zzf(i9, zze(t, j));
                            iX += iZzb2;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zza((zzko<T>) t, i9, i6)) {
                            iZzb2 = zzii.zzc(i9, (zzkk) zzma.zzf(t, j), zza(i6));
                            iX += iZzb2;
                            break;
                        } else {
                            break;
                        }
                }
                i6 += 3;
                i3 = i8;
            }
            return iX + zza((zzlu) this.zzq, (Object) t);
        }
        Unsafe unsafe2 = zzb;
        int i11 = 1048575;
        int i12 = 0;
        int iZzb4 = 0;
        int i13 = 0;
        while (i12 < this.zzc.length) {
            int iZzd4 = zzd(i12);
            int[] iArr = this.zzc;
            int i14 = iArr[i12];
            int i15 = i4;
            int i16 = (iZzd4 & 267386880) >>> 20;
            if (i16 <= 17) {
                int i17 = iArr[i12 + 2];
                int i18 = i17 & i15;
                i = 1 << (i17 >>> 20);
                if (i18 != i11) {
                    i13 = unsafe2.getInt(t, i18);
                    i11 = i18;
                }
            } else {
                i = 0;
            }
            long j2 = iZzd4 & i15;
            switch (i16) {
                case 0:
                    i2 = 0;
                    z = false;
                    if ((i & i13) != 0) {
                        iZzb4 += zzii.zzb(i14, 0.0d);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    i2 = 0;
                    if ((i & i13) != 0) {
                        z = false;
                        iZzb4 += zzii.zzb(i14, BitmapDescriptorFactory.HUE_RED);
                    } else {
                        z = false;
                    }
                    break;
                case 2:
                    i2 = 0;
                    if ((i & i13) != 0) {
                        iZzd = zzii.zzd(i14, unsafe2.getLong(t, j2));
                        iZzb4 += iZzd;
                    }
                    z = false;
                    break;
                case 3:
                    i2 = 0;
                    if ((i & i13) != 0) {
                        iZzd = zzii.zze(i14, unsafe2.getLong(t, j2));
                        iZzb4 += iZzd;
                    }
                    z = false;
                    break;
                case 4:
                    i2 = 0;
                    if ((i & i13) != 0) {
                        iZzd = zzii.zzf(i14, unsafe2.getInt(t, j2));
                        iZzb4 += iZzd;
                    }
                    z = false;
                    break;
                case 5:
                    i2 = 0;
                    if ((i & i13) != 0) {
                        iZzd = zzii.zzg(i14, 0L);
                        iZzb4 += iZzd;
                    }
                    z = false;
                    break;
                case 6:
                    if ((i & i13) != 0) {
                        i2 = 0;
                        iZzd = zzii.zzi(i14, 0);
                        iZzb4 += iZzd;
                        z = false;
                        break;
                    }
                    i2 = 0;
                    z = false;
                case 7:
                    if ((i & i13) != 0) {
                        iZzb = zzii.zzb(i14, true);
                        iZzb4 += iZzb;
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 8:
                    if ((i & i13) != 0) {
                        Object object = unsafe2.getObject(t, j2);
                        if (object instanceof zzht) {
                            iZzb = zzii.zzc(i14, (zzht) object);
                        } else {
                            iZzb = zzii.zzb(i14, (String) object);
                        }
                        iZzb4 += iZzb;
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 9:
                    if ((i & i13) != 0) {
                        iZza = zzle.zza(i14, unsafe2.getObject(t, j2), zza(i12));
                        iZzb4 += iZza;
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 10:
                    if ((i & i13) != 0) {
                        iZzb = zzii.zzc(i14, (zzht) unsafe2.getObject(t, j2));
                        iZzb4 += iZzb;
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 11:
                    if ((i & i13) != 0) {
                        iZzb = zzii.zzg(i14, unsafe2.getInt(t, j2));
                        iZzb4 += iZzb;
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 12:
                    if ((i & i13) != 0) {
                        iZzb = zzii.zzk(i14, unsafe2.getInt(t, j2));
                        iZzb4 += iZzb;
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 13:
                    if ((i & i13) != 0) {
                        iZzj = zzii.zzj(i14, 0);
                        iZzb4 += iZzj;
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 14:
                    if ((i & i13) != 0) {
                        iZzb = zzii.zzh(i14, 0L);
                        iZzb4 += iZzb;
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 15:
                    if ((i & i13) != 0) {
                        iZzb = zzii.zzh(i14, unsafe2.getInt(t, j2));
                        iZzb4 += iZzb;
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 16:
                    if ((i & i13) != 0) {
                        iZzb = zzii.zzf(i14, unsafe2.getLong(t, j2));
                        iZzb4 += iZzb;
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 17:
                    if ((i & i13) != 0) {
                        iZzb = zzii.zzc(i14, (zzkk) unsafe2.getObject(t, j2), zza(i12));
                        iZzb4 += iZzb;
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 18:
                    iZza = zzle.zzi(i14, (List) unsafe2.getObject(t, j2), false);
                    iZzb4 += iZza;
                    i2 = 0;
                    z = false;
                    break;
                case 19:
                    i2 = 0;
                    iZzh = zzle.zzh(i14, (List) unsafe2.getObject(t, j2), false);
                    iZzb4 += iZzh;
                    z = false;
                    break;
                case 20:
                    i2 = 0;
                    iZzh = zzle.zza(i14, (List<Long>) unsafe2.getObject(t, j2), false);
                    iZzb4 += iZzh;
                    z = false;
                    break;
                case 21:
                    i2 = 0;
                    iZzh = zzle.zzb(i14, (List<Long>) unsafe2.getObject(t, j2), false);
                    iZzb4 += iZzh;
                    z = false;
                    break;
                case 22:
                    i2 = 0;
                    iZzh = zzle.zze(i14, (List) unsafe2.getObject(t, j2), false);
                    iZzb4 += iZzh;
                    z = false;
                    break;
                case 23:
                    i2 = 0;
                    iZzh = zzle.zzi(i14, (List) unsafe2.getObject(t, j2), false);
                    iZzb4 += iZzh;
                    z = false;
                    break;
                case 24:
                    i2 = 0;
                    iZzh = zzle.zzh(i14, (List) unsafe2.getObject(t, j2), false);
                    iZzb4 += iZzh;
                    z = false;
                    break;
                case 25:
                    i2 = 0;
                    iZzh = zzle.zzj(i14, (List) unsafe2.getObject(t, j2), false);
                    iZzb4 += iZzh;
                    z = false;
                    break;
                case 26:
                    iZza = zzle.zza(i14, (List<?>) unsafe2.getObject(t, j2));
                    iZzb4 += iZza;
                    i2 = 0;
                    z = false;
                    break;
                case 27:
                    iZza = zzle.zza(i14, (List<?>) unsafe2.getObject(t, j2), zza(i12));
                    iZzb4 += iZza;
                    i2 = 0;
                    z = false;
                    break;
                case 28:
                    iZza = zzle.zzb(i14, (List) unsafe2.getObject(t, j2));
                    iZzb4 += iZza;
                    i2 = 0;
                    z = false;
                    break;
                case 29:
                    iZza = zzle.zzf(i14, (List) unsafe2.getObject(t, j2), false);
                    iZzb4 += iZza;
                    i2 = 0;
                    z = false;
                    break;
                case 30:
                    i2 = 0;
                    iZzh = zzle.zzd(i14, (List) unsafe2.getObject(t, j2), false);
                    iZzb4 += iZzh;
                    z = false;
                    break;
                case 31:
                    i2 = 0;
                    iZzh = zzle.zzh(i14, (List) unsafe2.getObject(t, j2), false);
                    iZzb4 += iZzh;
                    z = false;
                    break;
                case 32:
                    i2 = 0;
                    iZzh = zzle.zzi(i14, (List) unsafe2.getObject(t, j2), false);
                    iZzb4 += iZzh;
                    z = false;
                    break;
                case 33:
                    i2 = 0;
                    iZzh = zzle.zzg(i14, (List) unsafe2.getObject(t, j2), false);
                    iZzb4 += iZzh;
                    z = false;
                    break;
                case 34:
                    i2 = 0;
                    iZzh = zzle.zzc(i14, (List) unsafe2.getObject(t, j2), false);
                    iZzb4 += iZzh;
                    z = false;
                    break;
                case 35:
                    int iZzi4 = zzle.zzi((List) unsafe2.getObject(t, j2));
                    if (iZzi4 > 0) {
                        iZzb4 = a.x(iZzi4, zzii.zze(i14), iZzi4, iZzb4);
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 36:
                    int iZzh5 = zzle.zzh((List) unsafe2.getObject(t, j2));
                    if (iZzh5 > 0) {
                        iZzb4 = a.x(iZzh5, zzii.zze(i14), iZzh5, iZzb4);
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 37:
                    int iZza4 = zzle.zza((List<Long>) unsafe2.getObject(t, j2));
                    if (iZza4 > 0) {
                        iZzb4 = a.x(iZza4, zzii.zze(i14), iZza4, iZzb4);
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 38:
                    int iZzb5 = zzle.zzb((List) unsafe2.getObject(t, j2));
                    if (iZzb5 > 0) {
                        iZzb4 = a.x(iZzb5, zzii.zze(i14), iZzb5, iZzb4);
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 39:
                    int iZze2 = zzle.zze((List) unsafe2.getObject(t, j2));
                    if (iZze2 > 0) {
                        iZzb4 = a.x(iZze2, zzii.zze(i14), iZze2, iZzb4);
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 40:
                    int iZzi5 = zzle.zzi((List) unsafe2.getObject(t, j2));
                    if (iZzi5 > 0) {
                        iZzb4 = a.x(iZzi5, zzii.zze(i14), iZzi5, iZzb4);
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 41:
                    int iZzh6 = zzle.zzh((List) unsafe2.getObject(t, j2));
                    if (iZzh6 > 0) {
                        iZzb4 = a.x(iZzh6, zzii.zze(i14), iZzh6, iZzb4);
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 42:
                    int iZzj3 = zzle.zzj((List) unsafe2.getObject(t, j2));
                    if (iZzj3 > 0) {
                        iZzb4 = a.x(iZzj3, zzii.zze(i14), iZzj3, iZzb4);
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 43:
                    int iZzf2 = zzle.zzf((List) unsafe2.getObject(t, j2));
                    if (iZzf2 > 0) {
                        iZzb4 = a.x(iZzf2, zzii.zze(i14), iZzf2, iZzb4);
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 44:
                    int iZzd5 = zzle.zzd((List) unsafe2.getObject(t, j2));
                    if (iZzd5 > 0) {
                        iZzb4 = a.x(iZzd5, zzii.zze(i14), iZzd5, iZzb4);
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 45:
                    int iZzh7 = zzle.zzh((List) unsafe2.getObject(t, j2));
                    if (iZzh7 > 0) {
                        iZzb4 = a.x(iZzh7, zzii.zze(i14), iZzh7, iZzb4);
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 46:
                    int iZzi6 = zzle.zzi((List) unsafe2.getObject(t, j2));
                    if (iZzi6 > 0) {
                        iZzb4 = a.x(iZzi6, zzii.zze(i14), iZzi6, iZzb4);
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 47:
                    int iZzg2 = zzle.zzg((List) unsafe2.getObject(t, j2));
                    if (iZzg2 > 0) {
                        iZzb4 = a.x(iZzg2, zzii.zze(i14), iZzg2, iZzb4);
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 48:
                    int iZzc2 = zzle.zzc((List) unsafe2.getObject(t, j2));
                    if (iZzc2 > 0) {
                        iZzb4 = a.x(iZzc2, zzii.zze(i14), iZzc2, iZzb4);
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 49:
                    iZza = zzle.zzb(i14, (List<zzkk>) unsafe2.getObject(t, j2), zza(i12));
                    iZzb4 += iZza;
                    i2 = 0;
                    z = false;
                    break;
                case 50:
                    iZza = this.zzs.zza(i14, unsafe2.getObject(t, j2), zzb(i12));
                    iZzb4 += iZza;
                    i2 = 0;
                    z = false;
                    break;
                case 51:
                    if (zza((zzko<T>) t, i14, i12)) {
                        iZzb4 += zzii.zzb(i14, 0.0d);
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 52:
                    if (zza((zzko<T>) t, i14, i12)) {
                        iZzj = zzii.zzb(i14, BitmapDescriptorFactory.HUE_RED);
                        iZzb4 += iZzj;
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 53:
                    if (zza((zzko<T>) t, i14, i12)) {
                        iZzb = zzii.zzd(i14, zze(t, j2));
                        iZzb4 += iZzb;
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 54:
                    if (zza((zzko<T>) t, i14, i12)) {
                        iZzb = zzii.zze(i14, zze(t, j2));
                        iZzb4 += iZzb;
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 55:
                    if (zza((zzko<T>) t, i14, i12)) {
                        iZzb = zzii.zzf(i14, zzd(t, j2));
                        iZzb4 += iZzb;
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 56:
                    if (zza((zzko<T>) t, i14, i12)) {
                        iZzb = zzii.zzg(i14, 0L);
                        iZzb4 += iZzb;
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 57:
                    if (zza((zzko<T>) t, i14, i12)) {
                        iZzj = zzii.zzi(i14, 0);
                        iZzb4 += iZzj;
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 58:
                    if (zza((zzko<T>) t, i14, i12)) {
                        iZzb = zzii.zzb(i14, true);
                        iZzb4 += iZzb;
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 59:
                    if (zza((zzko<T>) t, i14, i12)) {
                        Object object2 = unsafe2.getObject(t, j2);
                        if (object2 instanceof zzht) {
                            iZzb = zzii.zzc(i14, (zzht) object2);
                        } else {
                            iZzb = zzii.zzb(i14, (String) object2);
                        }
                        iZzb4 += iZzb;
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 60:
                    if (zza((zzko<T>) t, i14, i12)) {
                        iZza = zzle.zza(i14, unsafe2.getObject(t, j2), zza(i12));
                        iZzb4 += iZza;
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 61:
                    if (zza((zzko<T>) t, i14, i12)) {
                        iZzb = zzii.zzc(i14, (zzht) unsafe2.getObject(t, j2));
                        iZzb4 += iZzb;
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 62:
                    if (zza((zzko<T>) t, i14, i12)) {
                        iZzb = zzii.zzg(i14, zzd(t, j2));
                        iZzb4 += iZzb;
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 63:
                    if (zza((zzko<T>) t, i14, i12)) {
                        iZzb = zzii.zzk(i14, zzd(t, j2));
                        iZzb4 += iZzb;
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 64:
                    if (zza((zzko<T>) t, i14, i12)) {
                        iZzj = zzii.zzj(i14, 0);
                        iZzb4 += iZzj;
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 65:
                    if (zza((zzko<T>) t, i14, i12)) {
                        iZzb = zzii.zzh(i14, 0L);
                        iZzb4 += iZzb;
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 66:
                    if (zza((zzko<T>) t, i14, i12)) {
                        iZzb = zzii.zzh(i14, zzd(t, j2));
                        iZzb4 += iZzb;
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 67:
                    if (zza((zzko<T>) t, i14, i12)) {
                        iZzb = zzii.zzf(i14, zze(t, j2));
                        iZzb4 += iZzb;
                    }
                    i2 = 0;
                    z = false;
                    break;
                case 68:
                    if (zza((zzko<T>) t, i14, i12)) {
                        iZzb = zzii.zzc(i14, (zzkk) unsafe2.getObject(t, j2), zza(i12));
                        iZzb4 += iZzb;
                    }
                    i2 = 0;
                    z = false;
                    break;
                default:
                    i2 = 0;
                    z = false;
                    break;
            }
            i12 += 3;
            i5 = i2;
            i4 = i15;
        }
        int iZzc3 = i5;
        int iZza5 = iZzb4 + zza((zzlu) this.zzq, (Object) t);
        if (!this.zzh) {
            return iZza5;
        }
        zziu<T> zziuVarZza = this.zzr.zza(t);
        for (int i19 = iZzc3; i19 < zziuVarZza.zza.zzc(); i19++) {
            Map.Entry entryZzb = zziuVarZza.zza.zzb(i19);
            iZzc3 += zziu.zzc((zziw) entryZzb.getKey(), entryZzb.getValue());
        }
        for (Map.Entry entry : zziuVarZza.zza.zzd()) {
            iZzc3 += zziu.zzc((zziw) entry.getKey(), entry.getValue());
        }
        return iZza5 + iZzc3;
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(c.f(name.length() + c.f(40, str), string));
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            throw new RuntimeException(YU.a.o(sb, " not found. Known fields are ", string));
        }
    }

    @Override // com.google.android.gms.internal.vision.zzlc
    public final T zza() {
        return (T) this.zzo.zza(this.zzg);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    @Override // com.google.android.gms.internal.vision.zzlc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zza(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzko.zza(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.vision.zzlc
    public final int zza(T t) {
        int i;
        int iZza;
        int i2;
        int iZza2;
        int length = this.zzc.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iZzd = zzd(i4);
            int i5 = this.zzc[i4];
            long j = 1048575 & iZzd;
            int iHashCode = 37;
            switch ((iZzd & 267386880) >>> 20) {
                case 0:
                    i = i3 * 53;
                    iZza = zzjf.zza(Double.doubleToLongBits(zzma.zze(t, j)));
                    i3 = iZza + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iZza = Float.floatToIntBits(zzma.zzd(t, j));
                    i3 = iZza + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iZza = zzjf.zza(zzma.zzb(t, j));
                    i3 = iZza + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iZza = zzjf.zza(zzma.zzb(t, j));
                    i3 = iZza + i;
                    break;
                case 4:
                    i2 = i3 * 53;
                    iZza2 = zzma.zza(t, j);
                    i3 = i2 + iZza2;
                    break;
                case 5:
                    i = i3 * 53;
                    iZza = zzjf.zza(zzma.zzb(t, j));
                    i3 = iZza + i;
                    break;
                case 6:
                    i2 = i3 * 53;
                    iZza2 = zzma.zza(t, j);
                    i3 = i2 + iZza2;
                    break;
                case 7:
                    i = i3 * 53;
                    iZza = zzjf.zza(zzma.zzc(t, j));
                    i3 = iZza + i;
                    break;
                case 8:
                    i = i3 * 53;
                    iZza = ((String) zzma.zzf(t, j)).hashCode();
                    i3 = iZza + i;
                    break;
                case 9:
                    Object objZzf = zzma.zzf(t, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iZza = zzma.zzf(t, j).hashCode();
                    i3 = iZza + i;
                    break;
                case 11:
                    i2 = i3 * 53;
                    iZza2 = zzma.zza(t, j);
                    i3 = i2 + iZza2;
                    break;
                case 12:
                    i2 = i3 * 53;
                    iZza2 = zzma.zza(t, j);
                    i3 = i2 + iZza2;
                    break;
                case 13:
                    i2 = i3 * 53;
                    iZza2 = zzma.zza(t, j);
                    i3 = i2 + iZza2;
                    break;
                case 14:
                    i = i3 * 53;
                    iZza = zzjf.zza(zzma.zzb(t, j));
                    i3 = iZza + i;
                    break;
                case 15:
                    i2 = i3 * 53;
                    iZza2 = zzma.zza(t, j);
                    i3 = i2 + iZza2;
                    break;
                case 16:
                    i = i3 * 53;
                    iZza = zzjf.zza(zzma.zzb(t, j));
                    i3 = iZza + i;
                    break;
                case 17:
                    Object objZzf2 = zzma.zzf(t, j);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
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
                    iZza = zzma.zzf(t, j).hashCode();
                    i3 = iZza + i;
                    break;
                case 50:
                    i = i3 * 53;
                    iZza = zzma.zzf(t, j).hashCode();
                    i3 = iZza + i;
                    break;
                case 51:
                    if (zza((zzko<T>) t, i5, i4)) {
                        i = i3 * 53;
                        iZza = zzjf.zza(Double.doubleToLongBits(zzb(t, j)));
                        i3 = iZza + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zza((zzko<T>) t, i5, i4)) {
                        i = i3 * 53;
                        iZza = Float.floatToIntBits(zzc(t, j));
                        i3 = iZza + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zza((zzko<T>) t, i5, i4)) {
                        i = i3 * 53;
                        iZza = zzjf.zza(zze(t, j));
                        i3 = iZza + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zza((zzko<T>) t, i5, i4)) {
                        i = i3 * 53;
                        iZza = zzjf.zza(zze(t, j));
                        i3 = iZza + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zza((zzko<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        iZza2 = zzd(t, j);
                        i3 = i2 + iZza2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zza((zzko<T>) t, i5, i4)) {
                        i = i3 * 53;
                        iZza = zzjf.zza(zze(t, j));
                        i3 = iZza + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zza((zzko<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        iZza2 = zzd(t, j);
                        i3 = i2 + iZza2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zza((zzko<T>) t, i5, i4)) {
                        i = i3 * 53;
                        iZza = zzjf.zza(zzf(t, j));
                        i3 = iZza + i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zza((zzko<T>) t, i5, i4)) {
                        i = i3 * 53;
                        iZza = ((String) zzma.zzf(t, j)).hashCode();
                        i3 = iZza + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zza((zzko<T>) t, i5, i4)) {
                        i = i3 * 53;
                        iZza = zzma.zzf(t, j).hashCode();
                        i3 = iZza + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zza((zzko<T>) t, i5, i4)) {
                        i = i3 * 53;
                        iZza = zzma.zzf(t, j).hashCode();
                        i3 = iZza + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zza((zzko<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        iZza2 = zzd(t, j);
                        i3 = i2 + iZza2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zza((zzko<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        iZza2 = zzd(t, j);
                        i3 = i2 + iZza2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zza((zzko<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        iZza2 = zzd(t, j);
                        i3 = i2 + iZza2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zza((zzko<T>) t, i5, i4)) {
                        i = i3 * 53;
                        iZza = zzjf.zza(zze(t, j));
                        i3 = iZza + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zza((zzko<T>) t, i5, i4)) {
                        i2 = i3 * 53;
                        iZza2 = zzd(t, j);
                        i3 = i2 + iZza2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zza((zzko<T>) t, i5, i4)) {
                        i = i3 * 53;
                        iZza = zzjf.zza(zze(t, j));
                        i3 = iZza + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zza((zzko<T>) t, i5, i4)) {
                        i = i3 * 53;
                        iZza = zzma.zzf(t, j).hashCode();
                        i3 = iZza + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = this.zzq.zzb(t).hashCode() + (i3 * 53);
        return this.zzh ? (iHashCode2 * 53) + this.zzr.zza(t).hashCode() : iHashCode2;
    }

    private final void zza(T t, T t2, int i) {
        long jZzd = zzd(i) & 1048575;
        if (zza((zzko<T>) t2, i)) {
            Object objZzf = zzma.zzf(t, jZzd);
            Object objZzf2 = zzma.zzf(t2, jZzd);
            if (objZzf != null && objZzf2 != null) {
                zzma.zza(t, jZzd, zzjf.zza(objZzf, objZzf2));
                zzb((zzko<T>) t, i);
            } else if (objZzf2 != null) {
                zzma.zza(t, jZzd, objZzf2);
                zzb((zzko<T>) t, i);
            }
        }
    }

    private static <UT, UB> int zza(zzlu<UT, UB> zzluVar, T t) {
        return zzluVar.zzf(zzluVar.zzb(t));
    }

    private static List<?> zza(Object obj, long j) {
        return (List) zzma.zzf(obj, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // com.google.android.gms.internal.vision.zzlc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r14, com.google.android.gms.internal.vision.zzmr r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzko.zza(java.lang.Object, com.google.android.gms.internal.vision.zzmr):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzb(T r18, com.google.android.gms.internal.vision.zzmr r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzko.zzb(java.lang.Object, com.google.android.gms.internal.vision.zzmr):void");
    }

    private final Object zzb(int i) {
        return this.zzd[(i / 3) << 1];
    }

    private static <T> double zzb(T t, long j) {
        return ((Double) zzma.zzf(t, j)).doubleValue();
    }

    private final void zzb(T t, int i) {
        int iZze = zze(i);
        long j = 1048575 & iZze;
        if (j == 1048575) {
            return;
        }
        zzma.zza((Object) t, j, (1 << (iZze >>> 20)) | zzma.zza(t, j));
    }

    private final void zzb(T t, int i, int i2) {
        zzma.zza((Object) t, zze(i2) & 1048575, i);
    }

    private final int zzb(int i, int i2) {
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

    private final <K, V> void zza(zzmr zzmrVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzmrVar.zza(i, this.zzs.zzb(zzb(i2)), this.zzs.zzc(obj));
        }
    }

    private static <UT, UB> void zza(zzlu<UT, UB> zzluVar, T t, zzmr zzmrVar) throws IOException {
        zzluVar.zza((zzlu<UT, UB>) zzluVar.zzb(t), zzmrVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.vision.zzlc
    public final void zza(T t, zzld zzldVar, zzio zzioVar) throws IOException {
        int iZza;
        int iZzg;
        zzioVar.getClass();
        zzlu zzluVar = this.zzq;
        zziq<?> zziqVar = this.zzr;
        Object objZzb = null;
        Object objZza = null;
        while (true) {
            try {
                iZza = zzldVar.zza();
                iZzg = zzg(iZza);
            } finally {
            }
            if (iZzg < 0) {
                if (iZza == Integer.MAX_VALUE) {
                    for (int i = this.zzm; i < this.zzn; i++) {
                        objZza = zza((Object) t, this.zzl[i], (int) objZza, (zzlu<UT, int>) zzluVar);
                    }
                    if (objZza != null) {
                        zzluVar.zzb((Object) t, (T) objZza);
                        return;
                    }
                    return;
                }
                Object objZza2 = !this.zzh ? null : zziqVar.zza(zzioVar, this.zzg, iZza);
                if (objZza2 != null) {
                    if (objZzb == null) {
                        objZzb = zziqVar.zzb(t);
                    }
                    zzio zzioVar2 = zzioVar;
                    zziu<T> zziuVar = objZzb;
                    zzld zzldVar2 = zzldVar;
                    objZza = zziqVar.zza(zzldVar2, objZza2, zzioVar2, zziuVar, objZza, zzluVar);
                    zzldVar = zzldVar2;
                    zzioVar = zzioVar2;
                    objZzb = zziuVar;
                } else {
                    zzluVar.zza(zzldVar);
                    if (objZza == null) {
                        objZza = zzluVar.zzc(t);
                    }
                    if (!zzluVar.zza((zzlu) objZza, zzldVar)) {
                        for (int i2 = this.zzm; i2 < this.zzn; i2++) {
                            objZza = zza((Object) t, this.zzl[i2], (int) objZza, (zzlu<UT, int>) zzluVar);
                        }
                        if (objZza != null) {
                            zzluVar.zzb((Object) t, (T) objZza);
                            return;
                        }
                        return;
                    }
                }
            } else {
                int iZzd = zzd(iZzg);
                switch ((267386880 & iZzd) >>> 20) {
                    case 0:
                        zzma.zza(t, iZzd & 1048575, zzldVar.zzd());
                        zzb((zzko<T>) t, iZzg);
                        continue;
                    case 1:
                        zzma.zza((Object) t, iZzd & 1048575, zzldVar.zze());
                        zzb((zzko<T>) t, iZzg);
                        continue;
                    case 2:
                        zzma.zza((Object) t, iZzd & 1048575, zzldVar.zzg());
                        zzb((zzko<T>) t, iZzg);
                        continue;
                    case 3:
                        zzma.zza((Object) t, iZzd & 1048575, zzldVar.zzf());
                        zzb((zzko<T>) t, iZzg);
                        continue;
                    case 4:
                        zzma.zza((Object) t, iZzd & 1048575, zzldVar.zzh());
                        zzb((zzko<T>) t, iZzg);
                        continue;
                    case 5:
                        zzma.zza((Object) t, iZzd & 1048575, zzldVar.zzi());
                        zzb((zzko<T>) t, iZzg);
                        continue;
                    case 6:
                        zzma.zza((Object) t, iZzd & 1048575, zzldVar.zzj());
                        zzb((zzko<T>) t, iZzg);
                        continue;
                    case 7:
                        zzma.zza(t, iZzd & 1048575, zzldVar.zzk());
                        zzb((zzko<T>) t, iZzg);
                        continue;
                    case 8:
                        zza(t, iZzd, zzldVar);
                        zzb((zzko<T>) t, iZzg);
                        continue;
                    case 9:
                        if (zza((zzko<T>) t, iZzg)) {
                            long j = iZzd & 1048575;
                            zzma.zza(t, j, zzjf.zza(zzma.zzf(t, j), zzldVar.zza(zza(iZzg), zzioVar)));
                            break;
                        } else {
                            zzma.zza(t, iZzd & 1048575, zzldVar.zza(zza(iZzg), zzioVar));
                            zzb((zzko<T>) t, iZzg);
                            continue;
                        }
                    case 10:
                        zzma.zza(t, iZzd & 1048575, zzldVar.zzn());
                        zzb((zzko<T>) t, iZzg);
                        continue;
                    case 11:
                        zzma.zza((Object) t, iZzd & 1048575, zzldVar.zzo());
                        zzb((zzko<T>) t, iZzg);
                        continue;
                    case 12:
                        int iZzp = zzldVar.zzp();
                        zzjg zzjgVarZzc = zzc(iZzg);
                        if (zzjgVarZzc != null && !zzjgVarZzc.zza(iZzp)) {
                            objZza = zzle.zza(iZza, iZzp, objZza, (zzlu<UT, Object>) zzluVar);
                            break;
                        } else {
                            zzma.zza((Object) t, iZzd & 1048575, iZzp);
                            zzb((zzko<T>) t, iZzg);
                            continue;
                        }
                        break;
                    case 13:
                        zzma.zza((Object) t, iZzd & 1048575, zzldVar.zzq());
                        zzb((zzko<T>) t, iZzg);
                        continue;
                    case 14:
                        zzma.zza((Object) t, iZzd & 1048575, zzldVar.zzr());
                        zzb((zzko<T>) t, iZzg);
                        continue;
                    case 15:
                        zzma.zza((Object) t, iZzd & 1048575, zzldVar.zzs());
                        zzb((zzko<T>) t, iZzg);
                        continue;
                    case 16:
                        zzma.zza((Object) t, iZzd & 1048575, zzldVar.zzt());
                        zzb((zzko<T>) t, iZzg);
                        continue;
                    case 17:
                        if (zza((zzko<T>) t, iZzg)) {
                            long j2 = iZzd & 1048575;
                            zzma.zza(t, j2, zzjf.zza(zzma.zzf(t, j2), zzldVar.zzb(zza(iZzg), zzioVar)));
                            break;
                        } else {
                            zzma.zza(t, iZzd & 1048575, zzldVar.zzb(zza(iZzg), zzioVar));
                            zzb((zzko<T>) t, iZzg);
                            continue;
                        }
                    case 18:
                        zzldVar.zza(this.zzp.zza(t, iZzd & 1048575));
                        continue;
                    case 19:
                        zzldVar.zzb(this.zzp.zza(t, iZzd & 1048575));
                        continue;
                    case 20:
                        zzldVar.zzd(this.zzp.zza(t, iZzd & 1048575));
                        continue;
                    case 21:
                        zzldVar.zzc(this.zzp.zza(t, iZzd & 1048575));
                        continue;
                    case 22:
                        zzldVar.zze(this.zzp.zza(t, iZzd & 1048575));
                        continue;
                    case 23:
                        zzldVar.zzf(this.zzp.zza(t, iZzd & 1048575));
                        continue;
                    case 24:
                        zzldVar.zzg(this.zzp.zza(t, iZzd & 1048575));
                        continue;
                    case 25:
                        zzldVar.zzh(this.zzp.zza(t, iZzd & 1048575));
                        continue;
                    case 26:
                        if (zzf(iZzd)) {
                            zzldVar.zzj(this.zzp.zza(t, iZzd & 1048575));
                            break;
                        } else {
                            zzldVar.zzi(this.zzp.zza(t, iZzd & 1048575));
                            continue;
                        }
                    case 27:
                        zzldVar.zza(this.zzp.zza(t, iZzd & 1048575), zza(iZzg), zzioVar);
                        continue;
                    case 28:
                        zzldVar.zzk(this.zzp.zza(t, iZzd & 1048575));
                        continue;
                    case 29:
                        zzldVar.zzl(this.zzp.zza(t, iZzd & 1048575));
                        continue;
                    case 30:
                        List<Integer> listZza = this.zzp.zza(t, iZzd & 1048575);
                        zzldVar.zzm(listZza);
                        objZza = zzle.zza(iZza, listZza, zzc(iZzg), objZza, zzluVar);
                        continue;
                    case 31:
                        zzldVar.zzn(this.zzp.zza(t, iZzd & 1048575));
                        continue;
                    case 32:
                        zzldVar.zzo(this.zzp.zza(t, iZzd & 1048575));
                        continue;
                    case 33:
                        zzldVar.zzp(this.zzp.zza(t, iZzd & 1048575));
                        continue;
                    case 34:
                        zzldVar.zzq(this.zzp.zza(t, iZzd & 1048575));
                        continue;
                    case 35:
                        zzldVar.zza(this.zzp.zza(t, iZzd & 1048575));
                        continue;
                    case 36:
                        zzldVar.zzb(this.zzp.zza(t, iZzd & 1048575));
                        continue;
                    case 37:
                        zzldVar.zzd(this.zzp.zza(t, iZzd & 1048575));
                        continue;
                    case 38:
                        zzldVar.zzc(this.zzp.zza(t, iZzd & 1048575));
                        continue;
                    case 39:
                        zzldVar.zze(this.zzp.zza(t, iZzd & 1048575));
                        continue;
                    case 40:
                        zzldVar.zzf(this.zzp.zza(t, iZzd & 1048575));
                        continue;
                    case 41:
                        zzldVar.zzg(this.zzp.zza(t, iZzd & 1048575));
                        continue;
                    case 42:
                        zzldVar.zzh(this.zzp.zza(t, iZzd & 1048575));
                        continue;
                    case 43:
                        zzldVar.zzl(this.zzp.zza(t, iZzd & 1048575));
                        continue;
                    case 44:
                        List<Integer> listZza2 = this.zzp.zza(t, iZzd & 1048575);
                        zzldVar.zzm(listZza2);
                        objZza = zzle.zza(iZza, listZza2, zzc(iZzg), objZza, zzluVar);
                        continue;
                    case 45:
                        zzldVar.zzn(this.zzp.zza(t, iZzd & 1048575));
                        continue;
                    case 46:
                        zzldVar.zzo(this.zzp.zza(t, iZzd & 1048575));
                        continue;
                    case 47:
                        zzldVar.zzp(this.zzp.zza(t, iZzd & 1048575));
                        continue;
                    case 48:
                        zzldVar.zzq(this.zzp.zza(t, iZzd & 1048575));
                        continue;
                    case 49:
                        zzldVar.zzb(this.zzp.zza(t, iZzd & 1048575), zza(iZzg), zzioVar);
                        continue;
                    case 50:
                        Object objZzb2 = zzb(iZzg);
                        long jZzd = zzd(iZzg) & 1048575;
                        Object objZzf = zzma.zzf(t, jZzd);
                        if (objZzf == null) {
                            objZzf = this.zzs.zzf(objZzb2);
                            zzma.zza(t, jZzd, objZzf);
                        } else if (this.zzs.zzd(objZzf)) {
                            Object objZzf2 = this.zzs.zzf(objZzb2);
                            this.zzs.zza(objZzf2, objZzf);
                            zzma.zza(t, jZzd, objZzf2);
                            objZzf = objZzf2;
                        }
                        zzldVar.zza(this.zzs.zza(objZzf), this.zzs.zzb(objZzb2), zzioVar);
                        continue;
                    case 51:
                        zzma.zza(t, iZzd & 1048575, Double.valueOf(zzldVar.zzd()));
                        zzb((zzko<T>) t, iZza, iZzg);
                        continue;
                    case 52:
                        zzma.zza(t, iZzd & 1048575, Float.valueOf(zzldVar.zze()));
                        zzb((zzko<T>) t, iZza, iZzg);
                        continue;
                    case 53:
                        zzma.zza(t, iZzd & 1048575, Long.valueOf(zzldVar.zzg()));
                        zzb((zzko<T>) t, iZza, iZzg);
                        continue;
                    case 54:
                        zzma.zza(t, iZzd & 1048575, Long.valueOf(zzldVar.zzf()));
                        zzb((zzko<T>) t, iZza, iZzg);
                        continue;
                    case 55:
                        zzma.zza(t, iZzd & 1048575, Integer.valueOf(zzldVar.zzh()));
                        zzb((zzko<T>) t, iZza, iZzg);
                        continue;
                    case 56:
                        zzma.zza(t, iZzd & 1048575, Long.valueOf(zzldVar.zzi()));
                        zzb((zzko<T>) t, iZza, iZzg);
                        continue;
                    case 57:
                        zzma.zza(t, iZzd & 1048575, Integer.valueOf(zzldVar.zzj()));
                        zzb((zzko<T>) t, iZza, iZzg);
                        continue;
                    case 58:
                        zzma.zza(t, iZzd & 1048575, Boolean.valueOf(zzldVar.zzk()));
                        zzb((zzko<T>) t, iZza, iZzg);
                        continue;
                    case 59:
                        zza(t, iZzd, zzldVar);
                        zzb((zzko<T>) t, iZza, iZzg);
                        continue;
                    case 60:
                        if (zza((zzko<T>) t, iZza, iZzg)) {
                            long j3 = iZzd & 1048575;
                            zzma.zza(t, j3, zzjf.zza(zzma.zzf(t, j3), zzldVar.zza(zza(iZzg), zzioVar)));
                        } else {
                            zzma.zza(t, iZzd & 1048575, zzldVar.zza(zza(iZzg), zzioVar));
                            zzb((zzko<T>) t, iZzg);
                        }
                        zzb((zzko<T>) t, iZza, iZzg);
                        continue;
                    case 61:
                        zzma.zza(t, iZzd & 1048575, zzldVar.zzn());
                        zzb((zzko<T>) t, iZza, iZzg);
                        continue;
                    case 62:
                        zzma.zza(t, iZzd & 1048575, Integer.valueOf(zzldVar.zzo()));
                        zzb((zzko<T>) t, iZza, iZzg);
                        continue;
                    case 63:
                        int iZzp2 = zzldVar.zzp();
                        zzjg zzjgVarZzc2 = zzc(iZzg);
                        if (zzjgVarZzc2 != null && !zzjgVarZzc2.zza(iZzp2)) {
                            objZza = zzle.zza(iZza, iZzp2, objZza, (zzlu<UT, Object>) zzluVar);
                            break;
                        } else {
                            zzma.zza(t, iZzd & 1048575, Integer.valueOf(iZzp2));
                            zzb((zzko<T>) t, iZza, iZzg);
                            continue;
                        }
                        break;
                    case 64:
                        zzma.zza(t, iZzd & 1048575, Integer.valueOf(zzldVar.zzq()));
                        zzb((zzko<T>) t, iZza, iZzg);
                        continue;
                    case 65:
                        zzma.zza(t, iZzd & 1048575, Long.valueOf(zzldVar.zzr()));
                        zzb((zzko<T>) t, iZza, iZzg);
                        continue;
                    case 66:
                        zzma.zza(t, iZzd & 1048575, Integer.valueOf(zzldVar.zzs()));
                        zzb((zzko<T>) t, iZza, iZzg);
                        continue;
                    case 67:
                        zzma.zza(t, iZzd & 1048575, Long.valueOf(zzldVar.zzt()));
                        zzb((zzko<T>) t, iZza, iZzg);
                        continue;
                    case 68:
                        zzma.zza(t, iZzd & 1048575, zzldVar.zzb(zza(iZzg), zzioVar));
                        zzb((zzko<T>) t, iZza, iZzg);
                        continue;
                    default:
                        if (objZza == null) {
                            try {
                                objZza = zzluVar.zza();
                            } catch (zzjn unused) {
                                zzluVar.zza(zzldVar);
                                if (objZza == null) {
                                    objZza = zzluVar.zzc(t);
                                }
                                if (!zzluVar.zza((zzlu) objZza, zzldVar)) {
                                    for (int i3 = this.zzm; i3 < this.zzn; i3++) {
                                        objZza = zza((Object) t, this.zzl[i3], (int) objZza, (zzlu<UT, int>) zzluVar);
                                    }
                                    if (objZza != null) {
                                        zzluVar.zzb((Object) t, (T) objZza);
                                        return;
                                    }
                                    return;
                                }
                                break;
                            }
                        }
                        if (!zzluVar.zza((zzlu) objZza, zzldVar)) {
                            for (int i4 = this.zzm; i4 < this.zzn; i4++) {
                                objZza = zza((Object) t, this.zzl[i4], (int) objZza, (zzlu<UT, int>) zzluVar);
                            }
                            if (objZza != null) {
                                zzluVar.zzb((Object) t, (T) objZza);
                                return;
                            }
                            return;
                        }
                        break;
                }
            }
        }
    }

    private static int zza(byte[] bArr, int i, int i2, zzml zzmlVar, Class<?> cls, zzhn zzhnVar) throws IOException {
        switch (zzkr.zza[zzmlVar.ordinal()]) {
            case 1:
                int iZzb = zzhl.zzb(bArr, i, zzhnVar);
                zzhnVar.zzc = Boolean.valueOf(zzhnVar.zzb != 0);
                return iZzb;
            case 2:
                return zzhl.zze(bArr, i, zzhnVar);
            case 3:
                zzhnVar.zzc = Double.valueOf(zzhl.zzc(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzhnVar.zzc = Integer.valueOf(zzhl.zza(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzhnVar.zzc = Long.valueOf(zzhl.zzb(bArr, i));
                return i + 8;
            case 8:
                zzhnVar.zzc = Float.valueOf(zzhl.zzd(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int iZza = zzhl.zza(bArr, i, zzhnVar);
                zzhnVar.zzc = Integer.valueOf(zzhnVar.zza);
                return iZza;
            case 12:
            case 13:
                int iZzb2 = zzhl.zzb(bArr, i, zzhnVar);
                zzhnVar.zzc = Long.valueOf(zzhnVar.zzb);
                return iZzb2;
            case 14:
                return zzhl.zza(zzky.zza().zza((Class) cls), bArr, i, i2, zzhnVar);
            case 15:
                int iZza2 = zzhl.zza(bArr, i, zzhnVar);
                zzhnVar.zzc = Integer.valueOf(zzif.zze(zzhnVar.zza));
                return iZza2;
            case 16:
                int iZzb3 = zzhl.zzb(bArr, i, zzhnVar);
                zzhnVar.zzc = Long.valueOf(zzif.zza(zzhnVar.zzb));
                return iZzb3;
            case 17:
                return zzhl.zzd(bArr, i, zzhnVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzhn zzhnVar) throws IOException {
        int i8;
        int i9;
        int iZza;
        Unsafe unsafe = zzb;
        zzjl zzjlVarZza = (zzjl) unsafe.getObject(t, j2);
        if (!zzjlVarZza.zza()) {
            int size = zzjlVarZza.size();
            zzjlVarZza = zzjlVarZza.zza(size == 0 ? 10 : size << 1);
            unsafe.putObject(t, j2, zzjlVarZza);
        }
        zzjl zzjlVar = zzjlVarZza;
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    zzin zzinVar = (zzin) zzjlVar;
                    int iZza2 = zzhl.zza(bArr, i, zzhnVar);
                    int i10 = zzhnVar.zza + iZza2;
                    while (iZza2 < i10) {
                        zzinVar.zza(zzhl.zzc(bArr, iZza2));
                        iZza2 += 8;
                    }
                    if (iZza2 == i10) {
                        return iZza2;
                    }
                    throw zzjk.zza();
                }
                if (i5 != 1) {
                    return i;
                }
                zzin zzinVar2 = (zzin) zzjlVar;
                zzinVar2.zza(zzhl.zzc(bArr, i));
                int i11 = i + 8;
                while (i11 < i2) {
                    int iZza3 = zzhl.zza(bArr, i11, zzhnVar);
                    if (i3 != zzhnVar.zza) {
                        return i11;
                    }
                    zzinVar2.zza(zzhl.zzc(bArr, iZza3));
                    i11 = iZza3 + 8;
                }
                return i11;
            case 19:
            case 36:
                if (i5 == 2) {
                    zzja zzjaVar = (zzja) zzjlVar;
                    int iZza4 = zzhl.zza(bArr, i, zzhnVar);
                    int i12 = zzhnVar.zza + iZza4;
                    while (iZza4 < i12) {
                        zzjaVar.zza(zzhl.zzd(bArr, iZza4));
                        iZza4 += 4;
                    }
                    if (iZza4 == i12) {
                        return iZza4;
                    }
                    throw zzjk.zza();
                }
                if (i5 != 5) {
                    return i;
                }
                zzja zzjaVar2 = (zzja) zzjlVar;
                zzjaVar2.zza(zzhl.zzd(bArr, i));
                int i13 = i + 4;
                while (i13 < i2) {
                    int iZza5 = zzhl.zza(bArr, i13, zzhnVar);
                    if (i3 != zzhnVar.zza) {
                        return i13;
                    }
                    zzjaVar2.zza(zzhl.zzd(bArr, iZza5));
                    i13 = iZza5 + 4;
                }
                return i13;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    zzjy zzjyVar = (zzjy) zzjlVar;
                    int iZza6 = zzhl.zza(bArr, i, zzhnVar);
                    int i14 = zzhnVar.zza + iZza6;
                    while (iZza6 < i14) {
                        iZza6 = zzhl.zzb(bArr, iZza6, zzhnVar);
                        zzjyVar.zza(zzhnVar.zzb);
                    }
                    if (iZza6 == i14) {
                        return iZza6;
                    }
                    throw zzjk.zza();
                }
                if (i5 != 0) {
                    return i;
                }
                zzjy zzjyVar2 = (zzjy) zzjlVar;
                int iZzb = zzhl.zzb(bArr, i, zzhnVar);
                zzjyVar2.zza(zzhnVar.zzb);
                while (iZzb < i2) {
                    int iZza7 = zzhl.zza(bArr, iZzb, zzhnVar);
                    if (i3 != zzhnVar.zza) {
                        return iZzb;
                    }
                    iZzb = zzhl.zzb(bArr, iZza7, zzhnVar);
                    zzjyVar2.zza(zzhnVar.zzb);
                }
                return iZzb;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zzhl.zza(bArr, i, (zzjl<?>) zzjlVar, zzhnVar);
                }
                return i5 == 0 ? zzhl.zza(i3, bArr, i, i2, (zzjl<?>) zzjlVar, zzhnVar) : i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    zzjy zzjyVar3 = (zzjy) zzjlVar;
                    int iZza8 = zzhl.zza(bArr, i, zzhnVar);
                    int i15 = zzhnVar.zza + iZza8;
                    while (iZza8 < i15) {
                        zzjyVar3.zza(zzhl.zzb(bArr, iZza8));
                        iZza8 += 8;
                    }
                    if (iZza8 == i15) {
                        return iZza8;
                    }
                    throw zzjk.zza();
                }
                if (i5 != 1) {
                    return i;
                }
                zzjy zzjyVar4 = (zzjy) zzjlVar;
                zzjyVar4.zza(zzhl.zzb(bArr, i));
                int i16 = i + 8;
                while (i16 < i2) {
                    int iZza9 = zzhl.zza(bArr, i16, zzhnVar);
                    if (i3 != zzhnVar.zza) {
                        return i16;
                    }
                    zzjyVar4.zza(zzhl.zzb(bArr, iZza9));
                    i16 = iZza9 + 8;
                }
                return i16;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    zzjd zzjdVar = (zzjd) zzjlVar;
                    int iZza10 = zzhl.zza(bArr, i, zzhnVar);
                    int i17 = zzhnVar.zza + iZza10;
                    while (iZza10 < i17) {
                        zzjdVar.zzc(zzhl.zza(bArr, iZza10));
                        iZza10 += 4;
                    }
                    if (iZza10 == i17) {
                        return iZza10;
                    }
                    throw zzjk.zza();
                }
                if (i5 != 5) {
                    return i;
                }
                zzjd zzjdVar2 = (zzjd) zzjlVar;
                zzjdVar2.zzc(zzhl.zza(bArr, i));
                int i18 = i + 4;
                while (i18 < i2) {
                    int iZza11 = zzhl.zza(bArr, i18, zzhnVar);
                    if (i3 != zzhnVar.zza) {
                        return i18;
                    }
                    zzjdVar2.zzc(zzhl.zza(bArr, iZza11));
                    i18 = iZza11 + 4;
                }
                return i18;
            case 25:
            case 42:
                if (i5 == 2) {
                    zzhr zzhrVar = (zzhr) zzjlVar;
                    int iZza12 = zzhl.zza(bArr, i, zzhnVar);
                    int i19 = zzhnVar.zza + iZza12;
                    while (iZza12 < i19) {
                        iZza12 = zzhl.zzb(bArr, iZza12, zzhnVar);
                        zzhrVar.zza(zzhnVar.zzb != 0);
                    }
                    if (iZza12 == i19) {
                        return iZza12;
                    }
                    throw zzjk.zza();
                }
                if (i5 != 0) {
                    return i;
                }
                zzhr zzhrVar2 = (zzhr) zzjlVar;
                int iZzb2 = zzhl.zzb(bArr, i, zzhnVar);
                zzhrVar2.zza(zzhnVar.zzb != 0);
                while (iZzb2 < i2) {
                    int iZza13 = zzhl.zza(bArr, iZzb2, zzhnVar);
                    if (i3 != zzhnVar.zza) {
                        return iZzb2;
                    }
                    iZzb2 = zzhl.zzb(bArr, iZza13, zzhnVar);
                    zzhrVar2.zza(zzhnVar.zzb != 0);
                }
                return iZzb2;
            case 26:
                if (i5 != 2) {
                    return i;
                }
                if ((j & llqqqql.cc00630063006300630063) == 0) {
                    int iZza14 = zzhl.zza(bArr, i, zzhnVar);
                    int i20 = zzhnVar.zza;
                    if (i20 < 0) {
                        throw zzjk.zzb();
                    }
                    if (i20 == 0) {
                        zzjlVar.add("");
                    } else {
                        zzjlVar.add(new String(bArr, iZza14, i20, zzjf.zza));
                        iZza14 += i20;
                    }
                    while (iZza14 < i2) {
                        int iZza15 = zzhl.zza(bArr, iZza14, zzhnVar);
                        if (i3 != zzhnVar.zza) {
                            return iZza14;
                        }
                        iZza14 = zzhl.zza(bArr, iZza15, zzhnVar);
                        int i21 = zzhnVar.zza;
                        if (i21 < 0) {
                            throw zzjk.zzb();
                        }
                        if (i21 == 0) {
                            zzjlVar.add("");
                        } else {
                            zzjlVar.add(new String(bArr, iZza14, i21, zzjf.zza));
                            iZza14 += i21;
                        }
                    }
                    return iZza14;
                }
                int iZza16 = zzhl.zza(bArr, i, zzhnVar);
                int i22 = zzhnVar.zza;
                if (i22 < 0) {
                    throw zzjk.zzb();
                }
                if (i22 == 0) {
                    zzjlVar.add("");
                } else {
                    int i23 = iZza16 + i22;
                    if (zzmd.zza(bArr, iZza16, i23)) {
                        zzjlVar.add(new String(bArr, iZza16, i22, zzjf.zza));
                        iZza16 = i23;
                    } else {
                        throw zzjk.zzh();
                    }
                }
                while (iZza16 < i2) {
                    int iZza17 = zzhl.zza(bArr, iZza16, zzhnVar);
                    if (i3 != zzhnVar.zza) {
                        return iZza16;
                    }
                    iZza16 = zzhl.zza(bArr, iZza17, zzhnVar);
                    int i24 = zzhnVar.zza;
                    if (i24 < 0) {
                        throw zzjk.zzb();
                    }
                    if (i24 == 0) {
                        zzjlVar.add("");
                    } else {
                        int i25 = iZza16 + i24;
                        if (zzmd.zza(bArr, iZza16, i25)) {
                            zzjlVar.add(new String(bArr, iZza16, i24, zzjf.zza));
                            iZza16 = i25;
                        } else {
                            throw zzjk.zzh();
                        }
                    }
                }
                return iZza16;
            case 27:
                i8 = i;
                if (i5 == 2) {
                    return zzhl.zza(zza(i6), i3, bArr, i8, i2, zzjlVar, zzhnVar);
                }
                return i8;
            case 28:
                i8 = i;
                if (i5 == 2) {
                    int iZza18 = zzhl.zza(bArr, i8, zzhnVar);
                    int i26 = zzhnVar.zza;
                    if (i26 >= 0) {
                        if (i26 > bArr.length - iZza18) {
                            throw zzjk.zza();
                        }
                        if (i26 == 0) {
                            zzjlVar.add(zzht.zza);
                        } else {
                            zzjlVar.add(zzht.zza(bArr, iZza18, i26));
                            iZza18 += i26;
                        }
                        while (iZza18 < i2) {
                            int iZza19 = zzhl.zza(bArr, iZza18, zzhnVar);
                            if (i3 != zzhnVar.zza) {
                                return iZza18;
                            }
                            iZza18 = zzhl.zza(bArr, iZza19, zzhnVar);
                            int i27 = zzhnVar.zza;
                            if (i27 >= 0) {
                                if (i27 > bArr.length - iZza18) {
                                    throw zzjk.zza();
                                }
                                if (i27 == 0) {
                                    zzjlVar.add(zzht.zza);
                                } else {
                                    zzjlVar.add(zzht.zza(bArr, iZza18, i27));
                                    iZza18 += i27;
                                }
                            } else {
                                throw zzjk.zzb();
                            }
                        }
                        return iZza18;
                    }
                    throw zzjk.zzb();
                }
                return i8;
            case 30:
            case 44:
                i9 = i;
                if (i5 != 2) {
                    if (i5 == 0) {
                        iZza = zzhl.zza(i3, bArr, i9, i2, (zzjl<?>) zzjlVar, zzhnVar);
                    }
                    return i9;
                }
                iZza = zzhl.zza(bArr, i9, (zzjl<?>) zzjlVar, zzhnVar);
                zzjb zzjbVar = (zzjb) t;
                zzlx zzlxVar = zzjbVar.zzb;
                if (zzlxVar == zzlx.zza()) {
                    zzlxVar = null;
                }
                zzlx zzlxVar2 = (zzlx) zzle.zza(i4, zzjlVar, zzc(i6), zzlxVar, this.zzq);
                if (zzlxVar2 != null) {
                    zzjbVar.zzb = zzlxVar2;
                }
                return iZza;
            case 33:
            case 47:
                i9 = i;
                if (i5 == 2) {
                    zzjd zzjdVar3 = (zzjd) zzjlVar;
                    int iZza20 = zzhl.zza(bArr, i9, zzhnVar);
                    int i28 = zzhnVar.zza + iZza20;
                    while (iZza20 < i28) {
                        iZza20 = zzhl.zza(bArr, iZza20, zzhnVar);
                        zzjdVar3.zzc(zzif.zze(zzhnVar.zza));
                    }
                    if (iZza20 == i28) {
                        return iZza20;
                    }
                    throw zzjk.zza();
                }
                if (i5 == 0) {
                    zzjd zzjdVar4 = (zzjd) zzjlVar;
                    int iZza21 = zzhl.zza(bArr, i9, zzhnVar);
                    zzjdVar4.zzc(zzif.zze(zzhnVar.zza));
                    while (iZza21 < i2) {
                        int iZza22 = zzhl.zza(bArr, iZza21, zzhnVar);
                        if (i3 != zzhnVar.zza) {
                            return iZza21;
                        }
                        iZza21 = zzhl.zza(bArr, iZza22, zzhnVar);
                        zzjdVar4.zzc(zzif.zze(zzhnVar.zza));
                    }
                    return iZza21;
                }
                return i9;
            case 34:
            case 48:
                i9 = i;
                if (i5 == 2) {
                    zzjy zzjyVar5 = (zzjy) zzjlVar;
                    int iZza23 = zzhl.zza(bArr, i9, zzhnVar);
                    int i29 = zzhnVar.zza + iZza23;
                    while (iZza23 < i29) {
                        iZza23 = zzhl.zzb(bArr, iZza23, zzhnVar);
                        zzjyVar5.zza(zzif.zza(zzhnVar.zzb));
                    }
                    if (iZza23 == i29) {
                        return iZza23;
                    }
                    throw zzjk.zza();
                }
                if (i5 == 0) {
                    zzjy zzjyVar6 = (zzjy) zzjlVar;
                    int iZzb3 = zzhl.zzb(bArr, i9, zzhnVar);
                    zzjyVar6.zza(zzif.zza(zzhnVar.zzb));
                    while (iZzb3 < i2) {
                        int iZza24 = zzhl.zza(bArr, iZzb3, zzhnVar);
                        if (i3 != zzhnVar.zza) {
                            return iZzb3;
                        }
                        iZzb3 = zzhl.zzb(bArr, iZza24, zzhnVar);
                        zzjyVar6.zza(zzif.zza(zzhnVar.zzb));
                    }
                    return iZzb3;
                }
                return i9;
            case 49:
                if (i5 == 3) {
                    zzlc zzlcVarZza = zza(i6);
                    int i30 = (i3 & (-8)) | 4;
                    int iZza25 = zzhl.zza(zzlcVarZza, bArr, i, i2, i30, zzhnVar);
                    zzlc zzlcVar = zzlcVarZza;
                    int i31 = i2;
                    zzhn zzhnVar2 = zzhnVar;
                    zzjlVar.add(zzhnVar2.zzc);
                    while (iZza25 < i31) {
                        int iZza26 = zzhl.zza(bArr, iZza25, zzhnVar2);
                        if (i3 != zzhnVar2.zza) {
                            return iZza25;
                        }
                        zzlc zzlcVar2 = zzlcVar;
                        int i32 = i31;
                        zzhn zzhnVar3 = zzhnVar2;
                        iZza25 = zzhl.zza(zzlcVar2, bArr, iZza26, i32, i30, zzhnVar3);
                        zzjlVar.add(zzhnVar3.zzc);
                        zzlcVar = zzlcVar2;
                        i31 = i32;
                        zzhnVar2 = zzhnVar3;
                    }
                    return iZza25;
                }
            default:
                return i;
        }
    }

    private final <K, V> int zza(T t, byte[] bArr, int i, int i2, int i3, long j, zzhn zzhnVar) throws IOException {
        byte[] bArr2;
        zzhn zzhnVar2;
        int i4;
        Unsafe unsafe = zzb;
        Object objZzb = zzb(i3);
        Object object = unsafe.getObject(t, j);
        if (this.zzs.zzd(object)) {
            Object objZzf = this.zzs.zzf(objZzb);
            this.zzs.zza(objZzf, object);
            unsafe.putObject(t, j, objZzf);
            object = objZzf;
        }
        zzkf<?, ?> zzkfVarZzb = this.zzs.zzb(objZzb);
        Map<?, ?> mapZza = this.zzs.zza(object);
        int iZza = zzhl.zza(bArr, i, zzhnVar);
        int i5 = zzhnVar.zza;
        if (i5 >= 0 && i5 <= i2 - iZza) {
            int i6 = i5 + iZza;
            K k = zzkfVarZzb.zzb;
            V v = zzkfVarZzb.zzd;
            while (iZza < i6) {
                int iZza2 = iZza + 1;
                int i7 = bArr[iZza];
                if (i7 < 0) {
                    iZza2 = zzhl.zza(i7, bArr, iZza2, zzhnVar);
                    i7 = zzhnVar.zza;
                }
                int i8 = iZza2;
                int i9 = i7 >>> 3;
                int i10 = i7 & 7;
                if (i9 != 1) {
                    if (i9 == 2 && i10 == zzkfVarZzb.zzc.zzb()) {
                        byte[] bArr3 = bArr;
                        int i11 = i2;
                        zzhn zzhnVar3 = zzhnVar;
                        iZza = zza(bArr3, i8, i11, zzkfVarZzb.zzc, zzkfVarZzb.zzd.getClass(), zzhnVar3);
                        v = (V) zzhnVar3.zzc;
                        i2 = i11;
                        bArr = bArr3;
                    } else {
                        bArr2 = bArr;
                        i4 = i2;
                        zzhnVar2 = zzhnVar;
                    }
                } else {
                    bArr2 = bArr;
                    int i12 = i2;
                    zzhnVar2 = zzhnVar;
                    if (i10 == zzkfVarZzb.zza.zzb()) {
                        i4 = i12;
                        iZza = zza(bArr2, i8, i4, zzkfVarZzb.zza, (Class<?>) null, zzhnVar2);
                        k = zzhnVar2.zzc;
                        bArr = bArr2;
                        i2 = i4;
                        zzhnVar = zzhnVar2;
                    } else {
                        i4 = i12;
                    }
                }
                iZza = zzhl.zza(i7, bArr2, i8, i4, zzhnVar2);
                k = k;
                bArr = bArr2;
                i2 = i4;
                zzhnVar = zzhnVar2;
            }
            if (iZza == i6) {
                mapZza.put(k, v);
                return i6;
            }
            throw zzjk.zzg();
        }
        throw zzjk.zza();
    }

    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzhn zzhnVar) throws IOException {
        int i9;
        int i10;
        int iZzb;
        Object object;
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                i9 = i;
                if (i5 != 1) {
                    return i9;
                }
                unsafe.putObject(t, j, Double.valueOf(zzhl.zzc(bArr, i)));
                iZzb = i9 + 8;
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 52:
                i10 = i;
                if (i5 != 5) {
                    return i10;
                }
                unsafe.putObject(t, j, Float.valueOf(zzhl.zzd(bArr, i)));
                iZzb = i10 + 4;
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                iZzb = zzhl.zzb(bArr, i, zzhnVar);
                unsafe.putObject(t, j, Long.valueOf(zzhnVar.zzb));
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                iZzb = zzhl.zza(bArr, i, zzhnVar);
                unsafe.putObject(t, j, Integer.valueOf(zzhnVar.zza));
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 56:
            case 65:
                i9 = i;
                if (i5 != 1) {
                    return i9;
                }
                unsafe.putObject(t, j, Long.valueOf(zzhl.zzb(bArr, i)));
                iZzb = i9 + 8;
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 57:
            case 64:
                i10 = i;
                if (i5 != 5) {
                    return i10;
                }
                unsafe.putObject(t, j, Integer.valueOf(zzhl.zza(bArr, i)));
                iZzb = i10 + 4;
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                iZzb = zzhl.zzb(bArr, i, zzhnVar);
                unsafe.putObject(t, j, Boolean.valueOf(zzhnVar.zzb != 0));
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iZza = zzhl.zza(bArr, i, zzhnVar);
                int i11 = zzhnVar.zza;
                if (i11 == 0) {
                    unsafe.putObject(t, j, "");
                } else {
                    if ((i6 & 536870912) != 0 && !zzmd.zza(bArr, iZza, iZza + i11)) {
                        throw zzjk.zzh();
                    }
                    unsafe.putObject(t, j, new String(bArr, iZza, i11, zzjf.zza));
                    iZza += i11;
                }
                unsafe.putInt(t, j2, i4);
                return iZza;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int iZza2 = zzhl.zza(zza(i8), bArr, i, i2, zzhnVar);
                object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                if (object == null) {
                    unsafe.putObject(t, j, zzhnVar.zzc);
                } else {
                    unsafe.putObject(t, j, zzjf.zza(object, zzhnVar.zzc));
                }
                unsafe.putInt(t, j2, i4);
                return iZza2;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                iZzb = zzhl.zze(bArr, i, zzhnVar);
                unsafe.putObject(t, j, zzhnVar.zzc);
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int iZza3 = zzhl.zza(bArr, i, zzhnVar);
                int i12 = zzhnVar.zza;
                zzjg zzjgVarZzc = zzc(i8);
                if (zzjgVarZzc != null && !zzjgVarZzc.zza(i12)) {
                    zze(t).zza(i3, Long.valueOf(i12));
                    return iZza3;
                }
                unsafe.putObject(t, j, Integer.valueOf(i12));
                iZzb = iZza3;
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                iZzb = zzhl.zza(bArr, i, zzhnVar);
                unsafe.putObject(t, j, Integer.valueOf(zzif.zze(zzhnVar.zza)));
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                iZzb = zzhl.zzb(bArr, i, zzhnVar);
                unsafe.putObject(t, j, Long.valueOf(zzif.zza(zzhnVar.zzb)));
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 68:
                if (i5 == 3) {
                    iZzb = zzhl.zza(zza(i8), bArr, i, i2, (i3 & (-8)) | 4, zzhnVar);
                    object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, zzhnVar.zzc);
                    } else {
                        unsafe.putObject(t, j, zzjf.zza(object, zzhnVar.zzc));
                    }
                    unsafe.putInt(t, j2, i4);
                    return iZzb;
                }
            default:
                return i;
        }
    }

    private final zzlc zza(int i) {
        int i2 = (i / 3) << 1;
        zzlc zzlcVar = (zzlc) this.zzd[i2];
        if (zzlcVar != null) {
            return zzlcVar;
        }
        zzlc<T> zzlcVarZza = zzky.zza().zza((Class) this.zzd[i2 + 1]);
        this.zzd[i2] = zzlcVarZza;
        return zzlcVarZza;
    }

    /* JADX WARN: Code restructure failed: missing block: B:200:0x05f3, code lost:
    
        if (r11 == 1048575) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x05f5, code lost:
    
        r22.putInt(r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x05fb, code lost:
    
        r0 = r9.zzm;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0601, code lost:
    
        if (r0 >= r9.zzn) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0603, code lost:
    
        r1 = (com.google.android.gms.internal.vision.zzlx) r9.zza((java.lang.Object) r10, r9.zzl[r0], (int) r1, (com.google.android.gms.internal.vision.zzlu<UT, int>) r9.zzq);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0612, code lost:
    
        if (r1 == null) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0614, code lost:
    
        r9.zzq.zzb((java.lang.Object) r10, (T) r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0619, code lost:
    
        if (r14 != 0) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x061b, code lost:
    
        if (r4 != r3) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0622, code lost:
    
        throw com.google.android.gms.internal.vision.zzjk.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0623, code lost:
    
        if (r4 > r3) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0625, code lost:
    
        if (r13 != r14) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0627, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x062c, code lost:
    
        throw com.google.android.gms.internal.vision.zzjk.zzg();
     */
    /* JADX WARN: Removed duplicated region for block: B:183:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0590  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(T r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.vision.zzhn r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzko.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.vision.zzhn):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0087. Please report as an issue. */
    @Override // com.google.android.gms.internal.vision.zzlc
    public final void zza(T t, byte[] bArr, int i, int i2, zzhn zzhnVar) throws IOException {
        int iZzg;
        T t2;
        Unsafe unsafe;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        zzko<T> zzkoVar = this;
        T t3 = t;
        byte[] bArr2 = bArr;
        int i13 = i2;
        zzhn zzhnVar2 = zzhnVar;
        if (zzkoVar.zzj) {
            Unsafe unsafe2 = zzb;
            int i14 = -1;
            int iZzb = i;
            int i15 = -1;
            int i16 = 0;
            int i17 = 0;
            int i18 = 1048575;
            while (iZzb < i13) {
                int iZza = iZzb + 1;
                int i19 = bArr2[iZzb];
                if (i19 < 0) {
                    iZza = zzhl.zza(i19, bArr2, iZza, zzhnVar2);
                    i19 = zzhnVar2.zza;
                }
                int i20 = iZza;
                int i21 = i19 >>> 3;
                int i22 = i19 & 7;
                if (i21 > i15) {
                    iZzg = zzkoVar.zza(i21, i16 / 3);
                } else {
                    iZzg = zzkoVar.zzg(i21);
                }
                if (iZzg == i14) {
                    t2 = t3;
                    unsafe = unsafe2;
                    i3 = i19;
                    i4 = i21;
                    i5 = 0;
                } else {
                    int[] iArr = zzkoVar.zzc;
                    int i23 = iArr[iZzg + 1];
                    int i24 = (i23 & 267386880) >>> 20;
                    int i25 = i19;
                    int i26 = iZzg;
                    long j = i23 & 1048575;
                    if (i24 <= 17) {
                        int i27 = iArr[i26 + 2];
                        int i28 = 1 << (i27 >>> 20);
                        int i29 = i27 & 1048575;
                        int i30 = 1048575;
                        if (i29 != i18) {
                            if (i18 != 1048575) {
                                unsafe2.putInt(t3, i18, i17);
                                i30 = 1048575;
                            }
                            if (i29 != i30) {
                                i17 = unsafe2.getInt(t3, i29);
                            }
                            i18 = i29;
                        }
                        switch (i24) {
                            case 0:
                                i11 = i30;
                                if (i22 != 1) {
                                    t2 = t3;
                                    unsafe = unsafe2;
                                    i4 = i21;
                                    i5 = i26;
                                    i3 = i25;
                                    break;
                                } else {
                                    zzma.zza(t3, j, zzhl.zzc(bArr2, i20));
                                    iZzb = i20 + 8;
                                    i17 |= i28;
                                    i13 = i2;
                                    i15 = i21;
                                    i16 = i26;
                                    i14 = -1;
                                    break;
                                }
                            case 1:
                                i11 = i30;
                                if (i22 != 5) {
                                    t2 = t3;
                                    unsafe = unsafe2;
                                    i4 = i21;
                                    i5 = i26;
                                    i3 = i25;
                                    break;
                                } else {
                                    zzma.zza((Object) t3, j, zzhl.zzd(bArr2, i20));
                                    iZzb = i20 + 4;
                                    i17 |= i28;
                                    i13 = i2;
                                    i15 = i21;
                                    i16 = i26;
                                    i14 = -1;
                                    break;
                                }
                            case 2:
                            case 3:
                                i11 = i30;
                                if (i22 != 0) {
                                    t2 = t3;
                                    unsafe = unsafe2;
                                    i4 = i21;
                                    i5 = i26;
                                    i3 = i25;
                                    break;
                                } else {
                                    int iZzb2 = zzhl.zzb(bArr2, i20, zzhnVar2);
                                    Unsafe unsafe3 = unsafe2;
                                    T t4 = t3;
                                    unsafe3.putLong(t4, j, zzhnVar2.zzb);
                                    unsafe2 = unsafe3;
                                    t3 = t4;
                                    i17 |= i28;
                                    iZzb = iZzb2;
                                    i15 = i21;
                                    i16 = i26;
                                    i14 = -1;
                                    i13 = i2;
                                    break;
                                }
                            case 4:
                            case 11:
                                i11 = i30;
                                if (i22 != 0) {
                                    t2 = t3;
                                    unsafe = unsafe2;
                                    i4 = i21;
                                    i5 = i26;
                                    i3 = i25;
                                    break;
                                } else {
                                    int iZza2 = zzhl.zza(bArr2, i20, zzhnVar2);
                                    unsafe2.putInt(t3, j, zzhnVar2.zza);
                                    i17 |= i28;
                                    i13 = i2;
                                    iZzb = iZza2;
                                    i15 = i21;
                                    i16 = i26;
                                    i14 = -1;
                                    break;
                                }
                            case 5:
                            case 14:
                                i11 = i30;
                                if (i22 != 1) {
                                    t2 = t3;
                                    unsafe = unsafe2;
                                    i4 = i21;
                                    i5 = i26;
                                    i3 = i25;
                                    break;
                                } else {
                                    Unsafe unsafe4 = unsafe2;
                                    T t5 = t3;
                                    unsafe4.putLong(t5, j, zzhl.zzb(bArr2, i20));
                                    unsafe2 = unsafe4;
                                    t3 = t5;
                                    iZzb = i20 + 8;
                                    i17 |= i28;
                                    i13 = i2;
                                    i15 = i21;
                                    i16 = i26;
                                    i14 = -1;
                                    break;
                                }
                            case 6:
                            case 13:
                                i11 = i30;
                                if (i22 != 5) {
                                    t2 = t3;
                                    unsafe = unsafe2;
                                    i4 = i21;
                                    i5 = i26;
                                    i3 = i25;
                                    break;
                                } else {
                                    unsafe2.putInt(t3, j, zzhl.zza(bArr2, i20));
                                    iZzb = i20 + 4;
                                    i17 |= i28;
                                    i13 = i2;
                                    i15 = i21;
                                    i16 = i26;
                                    i14 = -1;
                                    break;
                                }
                            case 7:
                                i11 = i30;
                                if (i22 != 0) {
                                    t2 = t3;
                                    unsafe = unsafe2;
                                    i4 = i21;
                                    i5 = i26;
                                    i3 = i25;
                                    break;
                                } else {
                                    iZzb = zzhl.zzb(bArr2, i20, zzhnVar2);
                                    zzma.zza(t3, j, zzhnVar2.zzb != 0);
                                    i17 |= i28;
                                    i13 = i2;
                                    i15 = i21;
                                    i16 = i26;
                                    i14 = -1;
                                    break;
                                }
                            case 8:
                                i11 = i30;
                                if (i22 != 2) {
                                    t2 = t3;
                                    unsafe = unsafe2;
                                    i4 = i21;
                                    i5 = i26;
                                    i3 = i25;
                                    break;
                                } else {
                                    if ((536870912 & i23) == 0) {
                                        iZzb = zzhl.zzc(bArr2, i20, zzhnVar2);
                                    } else {
                                        iZzb = zzhl.zzd(bArr2, i20, zzhnVar2);
                                    }
                                    unsafe2.putObject(t3, j, zzhnVar2.zzc);
                                    i17 |= i28;
                                    i15 = i21;
                                    i16 = i26;
                                    i14 = -1;
                                    break;
                                }
                            case 9:
                                i11 = i30;
                                i12 = i26;
                                if (i22 != 2) {
                                    i26 = i12;
                                    t2 = t3;
                                    unsafe = unsafe2;
                                    i4 = i21;
                                    i5 = i26;
                                    i3 = i25;
                                    break;
                                } else {
                                    iZzb = zzhl.zza(zzkoVar.zza(i12), bArr2, i20, i13, zzhnVar2);
                                    Object object = unsafe2.getObject(t3, j);
                                    if (object == null) {
                                        unsafe2.putObject(t3, j, zzhnVar2.zzc);
                                    } else {
                                        unsafe2.putObject(t3, j, zzjf.zza(object, zzhnVar2.zzc));
                                    }
                                    i17 |= i28;
                                    i15 = i21;
                                    i16 = i12;
                                    i14 = -1;
                                    break;
                                }
                            case 10:
                                i11 = i30;
                                i12 = i26;
                                if (i22 != 2) {
                                    i26 = i12;
                                    t2 = t3;
                                    unsafe = unsafe2;
                                    i4 = i21;
                                    i5 = i26;
                                    i3 = i25;
                                    break;
                                } else {
                                    iZzb = zzhl.zze(bArr2, i20, zzhnVar2);
                                    unsafe2.putObject(t3, j, zzhnVar2.zzc);
                                    i17 |= i28;
                                    i15 = i21;
                                    i16 = i12;
                                    i14 = -1;
                                    break;
                                }
                            case 12:
                                i11 = i30;
                                i12 = i26;
                                if (i22 != 0) {
                                    i26 = i12;
                                    t2 = t3;
                                    unsafe = unsafe2;
                                    i4 = i21;
                                    i5 = i26;
                                    i3 = i25;
                                    break;
                                } else {
                                    iZzb = zzhl.zza(bArr2, i20, zzhnVar2);
                                    unsafe2.putInt(t3, j, zzhnVar2.zza);
                                    i17 |= i28;
                                    i15 = i21;
                                    i16 = i12;
                                    i14 = -1;
                                    break;
                                }
                            case 15:
                                i11 = i30;
                                i12 = i26;
                                if (i22 != 0) {
                                    i26 = i12;
                                    t2 = t3;
                                    unsafe = unsafe2;
                                    i4 = i21;
                                    i5 = i26;
                                    i3 = i25;
                                    break;
                                } else {
                                    iZzb = zzhl.zza(bArr2, i20, zzhnVar2);
                                    unsafe2.putInt(t3, j, zzif.zze(zzhnVar2.zza));
                                    i17 |= i28;
                                    i15 = i21;
                                    i16 = i12;
                                    i14 = -1;
                                    break;
                                }
                            case 16:
                                if (i22 != 0) {
                                    i11 = i30;
                                    t2 = t3;
                                    unsafe = unsafe2;
                                    i4 = i21;
                                    i5 = i26;
                                    i3 = i25;
                                    break;
                                } else {
                                    int iZzb3 = zzhl.zzb(bArr2, i20, zzhnVar2);
                                    Unsafe unsafe5 = unsafe2;
                                    T t6 = t3;
                                    i12 = i26;
                                    unsafe5.putLong(t6, j, zzif.zza(zzhnVar2.zzb));
                                    unsafe2 = unsafe5;
                                    t3 = t6;
                                    i17 |= i28;
                                    iZzb = iZzb3;
                                    i15 = i21;
                                    i16 = i12;
                                    i14 = -1;
                                    break;
                                }
                            default:
                                i11 = i30;
                                t2 = t3;
                                unsafe = unsafe2;
                                i4 = i21;
                                i5 = i26;
                                i3 = i25;
                                break;
                        }
                    } else {
                        i5 = i26;
                        if (i24 != 27) {
                            i6 = i20;
                            Unsafe unsafe6 = unsafe2;
                            if (i24 <= 49) {
                                int i31 = i18;
                                i7 = i17;
                                unsafe = unsafe6;
                                int iZza3 = zzkoVar.zza((zzko<T>) t, bArr, i6, i2, i25, i21, i22, i5, i23, i24, j, zzhnVar);
                                if (iZza3 == i6) {
                                    i20 = iZza3;
                                    i4 = i21;
                                    i3 = i25;
                                    i17 = i7;
                                    t2 = t;
                                    i18 = i31;
                                } else {
                                    zzkoVar = this;
                                    t3 = t;
                                    i18 = i31;
                                    zzhnVar2 = zzhnVar;
                                    iZzb = iZza3;
                                    i16 = i5;
                                    i15 = i21;
                                    i17 = i7;
                                    unsafe2 = unsafe;
                                    i14 = -1;
                                    bArr2 = bArr;
                                    i13 = i2;
                                }
                            } else {
                                i7 = i17;
                                unsafe = unsafe6;
                                i8 = i21;
                                i9 = i18;
                                i10 = i25;
                                if (i24 != 50) {
                                    i4 = i8;
                                    int iZza4 = zza((zzko<T>) t, bArr, i6, i2, i10, i4, i22, i23, i24, j, i5, zzhnVar);
                                    t2 = t;
                                    i3 = i10;
                                    i5 = i5;
                                    if (iZza4 == i6) {
                                        i20 = iZza4;
                                        i18 = i9;
                                        i17 = i7;
                                    } else {
                                        zzkoVar = this;
                                        zzhnVar2 = zzhnVar;
                                        i15 = i4;
                                        iZzb = iZza4;
                                        i16 = i5;
                                        t3 = t2;
                                        i18 = i9;
                                        i17 = i7;
                                        unsafe2 = unsafe;
                                        i14 = -1;
                                        bArr2 = bArr;
                                        i13 = i2;
                                    }
                                } else if (i22 == 2) {
                                    int iZza5 = zza((zzko<T>) t, bArr, i6, i2, i5, j, zzhnVar);
                                    i5 = i5;
                                    if (iZza5 == i6) {
                                        i20 = iZza5;
                                        i4 = i8;
                                        i3 = i10;
                                        i18 = i9;
                                        i17 = i7;
                                        t2 = t;
                                    } else {
                                        zzkoVar = this;
                                        t3 = t;
                                        bArr2 = bArr;
                                        zzhnVar2 = zzhnVar;
                                        iZzb = iZza5;
                                        i16 = i5;
                                        i15 = i8;
                                        i18 = i9;
                                        i17 = i7;
                                        unsafe2 = unsafe;
                                        i14 = -1;
                                        i13 = i2;
                                    }
                                } else {
                                    i5 = i5;
                                    i20 = i6;
                                    i4 = i8;
                                    i3 = i10;
                                    i18 = i9;
                                    i17 = i7;
                                    t2 = t;
                                }
                            }
                        } else if (i22 == 2) {
                            zzjl zzjlVarZza = (zzjl) unsafe2.getObject(t3, j);
                            if (!zzjlVarZza.zza()) {
                                int size = zzjlVarZza.size();
                                zzjlVarZza = zzjlVarZza.zza(size == 0 ? 10 : size << 1);
                                unsafe2.putObject(t3, j, zzjlVarZza);
                            }
                            int iZza6 = zzhl.zza(zzkoVar.zza(i5), i25, bArr2, i20, i2, zzjlVarZza, zzhnVar2);
                            bArr2 = bArr;
                            zzhnVar2 = zzhnVar;
                            iZzb = iZza6;
                            i16 = i5;
                            unsafe2 = unsafe2;
                            i15 = i21;
                            i14 = -1;
                            t3 = t;
                            i13 = i2;
                        } else {
                            i6 = i20;
                            i7 = i17;
                            unsafe = unsafe2;
                            i8 = i21;
                            i9 = i18;
                            i10 = i25;
                            i20 = i6;
                            i4 = i8;
                            i3 = i10;
                            i18 = i9;
                            i17 = i7;
                            t2 = t;
                        }
                    }
                }
                int iZza7 = zzhl.zza(i3, bArr, i20, i2, zze(t2), zzhnVar);
                bArr2 = bArr;
                zzhnVar2 = zzhnVar;
                i15 = i4;
                i16 = i5;
                t3 = t2;
                unsafe2 = unsafe;
                i14 = -1;
                i13 = i2;
                iZzb = iZza7;
                zzkoVar = this;
            }
            T t7 = t3;
            Unsafe unsafe7 = unsafe2;
            int i32 = i13;
            int i33 = i18;
            int i34 = i17;
            if (i33 != 1048575) {
                unsafe7.putInt(t7, i33, i34);
            }
            if (iZzb != i32) {
                throw zzjk.zzg();
            }
            return;
        }
        zza((zzko<T>) t3, bArr, i, i13, 0, zzhnVar);
    }

    private final <UT, UB> UB zza(Object obj, int i, UB ub, zzlu<UT, UB> zzluVar) {
        zzjg zzjgVarZzc;
        int i2 = this.zzc[i];
        Object objZzf = zzma.zzf(obj, zzd(i) & 1048575);
        return (objZzf == null || (zzjgVarZzc = zzc(i)) == null) ? ub : (UB) zza(i, i2, this.zzs.zza(objZzf), zzjgVarZzc, (zzjg) ub, (zzlu<UT, zzjg>) zzluVar);
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzjg zzjgVar, UB ub, zzlu<UT, UB> zzluVar) {
        zzkf<?, ?> zzkfVarZzb = this.zzs.zzb(zzb(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzjgVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzluVar.zza();
                }
                zzib zzibVarZzc = zzht.zzc(zzkc.zza(zzkfVarZzb, next.getKey(), next.getValue()));
                try {
                    zzkc.zza(zzibVarZzc.zzb(), zzkfVarZzb, next.getKey(), next.getValue());
                    zzluVar.zza((zzlu<UT, UB>) ub, i2, zzibVarZzc.zza());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i, zzlc zzlcVar) {
        return zzlcVar.zzd(zzma.zzf(obj, i & 1048575));
    }

    private static void zza(int i, Object obj, zzmr zzmrVar) throws IOException {
        if (obj instanceof String) {
            zzmrVar.zza(i, (String) obj);
        } else {
            zzmrVar.zza(i, (zzht) obj);
        }
    }

    private final void zza(Object obj, int i, zzld zzldVar) throws IOException {
        if (zzf(i)) {
            zzma.zza(obj, i & 1048575, zzldVar.zzm());
        } else if (this.zzi) {
            zzma.zza(obj, i & 1048575, zzldVar.zzl());
        } else {
            zzma.zza(obj, i & 1048575, zzldVar.zzn());
        }
    }

    private final boolean zza(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zza((zzko<T>) t, i);
        }
        return (i3 & i4) != 0;
    }

    private final boolean zza(T t, int i) {
        int iZze = zze(i);
        long j = iZze & 1048575;
        if (j != 1048575) {
            return (zzma.zza(t, j) & (1 << (iZze >>> 20))) != 0;
        }
        int iZzd = zzd(i);
        long j2 = iZzd & 1048575;
        switch ((iZzd & 267386880) >>> 20) {
            case 0:
                return zzma.zze(t, j2) != 0.0d;
            case 1:
                return zzma.zzd(t, j2) != BitmapDescriptorFactory.HUE_RED;
            case 2:
                return zzma.zzb(t, j2) != 0;
            case 3:
                return zzma.zzb(t, j2) != 0;
            case 4:
                return zzma.zza(t, j2) != 0;
            case 5:
                return zzma.zzb(t, j2) != 0;
            case 6:
                return zzma.zza(t, j2) != 0;
            case 7:
                return zzma.zzc(t, j2);
            case 8:
                Object objZzf = zzma.zzf(t, j2);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzht) {
                    return !zzht.zza.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzma.zzf(t, j2) != null;
            case 10:
                return !zzht.zza.equals(zzma.zzf(t, j2));
            case 11:
                return zzma.zza(t, j2) != 0;
            case 12:
                return zzma.zza(t, j2) != 0;
            case 13:
                return zzma.zza(t, j2) != 0;
            case 14:
                return zzma.zzb(t, j2) != 0;
            case 15:
                return zzma.zza(t, j2) != 0;
            case 16:
                return zzma.zzb(t, j2) != 0;
            case 17:
                return zzma.zzf(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zza(T t, int i, int i2) {
        return zzma.zza(t, (long) (zze(i2) & 1048575)) == i;
    }

    private final int zza(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzb(i, i2);
    }
}
