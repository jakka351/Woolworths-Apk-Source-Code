package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import YU.a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes5.dex */
final class zzfp<T> implements zzge<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzgz.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfm zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzgs zzl;
    private final zzdt zzm;

    private zzfp(int[] iArr, Object[] objArr, int i, int i2, zzfm zzfmVar, boolean z, int[] iArr2, int i3, int i4, zzfs zzfsVar, zzez zzezVar, zzgs zzgsVar, zzdt zzdtVar, zzfh zzfhVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        boolean z2 = false;
        if (zzdtVar != null && (zzfmVar instanceof zzed)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzi = iArr2;
        this.zzj = i3;
        this.zzk = i4;
        this.zzl = zzgsVar;
        this.zzm = zzdtVar;
        this.zzg = zzfmVar;
    }

    private static void zzA(Object obj) {
        if (!zzL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzB(Object obj, Object obj2, int i) {
        if (zzI(obj2, i)) {
            int iZzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzge zzgeVarZzv = zzv(i);
            if (!zzI(obj, i)) {
                if (zzL(object)) {
                    Object objZze = zzgeVarZzv.zze();
                    zzgeVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzD(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object objZze2 = zzgeVarZzv.zze();
                zzgeVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzgeVarZzv.zzg(object2, object);
        }
    }

    private final void zzC(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzM(obj2, i2, i)) {
            int iZzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzge zzgeVarZzv = zzv(i);
            if (!zzM(obj, i2, i)) {
                if (zzL(object)) {
                    Object objZze = zzgeVarZzv.zze();
                    zzgeVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzE(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object objZze2 = zzgeVarZzv.zze();
                zzgeVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzgeVarZzv.zzg(object2, object);
        }
    }

    private final void zzD(Object obj, int i) {
        int iZzp = zzp(i);
        long j = 1048575 & iZzp;
        if (j == 1048575) {
            return;
        }
        zzgz.zzq(obj, j, (1 << (iZzp >>> 20)) | zzgz.zzc(obj, j));
    }

    private final void zzE(Object obj, int i, int i2) {
        zzgz.zzq(obj, zzp(i2) & 1048575, i);
    }

    private final void zzF(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzs(i) & 1048575, obj2);
        zzD(obj, i);
    }

    private final void zzG(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzs(i2) & 1048575, obj2);
        zzE(obj, i, i2);
    }

    private final boolean zzH(Object obj, Object obj2, int i) {
        return zzI(obj, i) == zzI(obj2, i);
    }

    private final boolean zzI(Object obj, int i) {
        int iZzp = zzp(i);
        long j = iZzp & 1048575;
        if (j != 1048575) {
            return (zzgz.zzc(obj, j) & (1 << (iZzp >>> 20))) != 0;
        }
        int iZzs = zzs(i);
        long j2 = iZzs & 1048575;
        switch (zzr(iZzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzgz.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzgz.zzb(obj, j2)) != 0;
            case 2:
                return zzgz.zzd(obj, j2) != 0;
            case 3:
                return zzgz.zzd(obj, j2) != 0;
            case 4:
                return zzgz.zzc(obj, j2) != 0;
            case 5:
                return zzgz.zzd(obj, j2) != 0;
            case 6:
                return zzgz.zzc(obj, j2) != 0;
            case 7:
                return zzgz.zzw(obj, j2);
            case 8:
                Object objZzf = zzgz.zzf(obj, j2);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzdf) {
                    return !zzdf.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzgz.zzf(obj, j2) != null;
            case 10:
                return !zzdf.zzb.equals(zzgz.zzf(obj, j2));
            case 11:
                return zzgz.zzc(obj, j2) != 0;
            case 12:
                return zzgz.zzc(obj, j2) != 0;
            case 13:
                return zzgz.zzc(obj, j2) != 0;
            case 14:
                return zzgz.zzd(obj, j2) != 0;
            case 15:
                return zzgz.zzc(obj, j2) != 0;
            case 16:
                return zzgz.zzd(obj, j2) != 0;
            case 17:
                return zzgz.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzI(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzK(Object obj, int i, zzge zzgeVar) {
        return zzgeVar.zzk(zzgz.zzf(obj, i & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzeh) {
            return ((zzeh) obj).zzY();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i, int i2) {
        return zzgz.zzc(obj, (long) (zzp(i2) & 1048575)) == i;
    }

    private static boolean zzN(Object obj, long j) {
        return ((Boolean) zzgz.zzf(obj, j)).booleanValue();
    }

    private static final void zzO(int i, Object obj, zzhh zzhhVar) throws IOException {
        if (obj instanceof String) {
            zzhhVar.zzG(i, (String) obj);
        } else {
            zzhhVar.zzd(i, (zzdf) obj);
        }
    }

    public static zzgt zzd(Object obj) {
        zzeh zzehVar = (zzeh) obj;
        zzgt zzgtVar = zzehVar.zzc;
        if (zzgtVar != zzgt.zzc()) {
            return zzgtVar;
        }
        zzgt zzgtVarZzf = zzgt.zzf();
        zzehVar.zzc = zzgtVarZzf;
        return zzgtVarZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp zzl(java.lang.Class r34, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfj r35, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfs r36, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzez r37, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgs r38, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdt r39, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfh r40) {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp.zzl(java.lang.Class, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfj, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfs, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzez, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgs, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdt, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfh):com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp");
    }

    private static double zzm(Object obj, long j) {
        return ((Double) zzgz.zzf(obj, j)).doubleValue();
    }

    private static float zzn(Object obj, long j) {
        return ((Float) zzgz.zzf(obj, j)).floatValue();
    }

    private static int zzo(Object obj, long j) {
        return ((Integer) zzgz.zzf(obj, j)).intValue();
    }

    private final int zzp(int i) {
        return this.zzc[i + 2];
    }

    private final int zzq(int i, int i2) {
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

    private static int zzr(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzs(int i) {
        return this.zzc[i + 1];
    }

    private static long zzt(Object obj, long j) {
        return ((Long) zzgz.zzf(obj, j)).longValue();
    }

    private final zzel zzu(int i) {
        int i2 = i / 3;
        return (zzel) this.zzd[i2 + i2 + 1];
    }

    private final zzge zzv(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzge zzgeVar = (zzge) objArr[i3];
        if (zzgeVar != null) {
            return zzgeVar;
        }
        zzge zzgeVarZzb = zzfu.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzgeVarZzb;
        return zzgeVarZzb;
    }

    private final Object zzw(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzx(Object obj, int i) {
        zzge zzgeVarZzv = zzv(i);
        int iZzs = zzs(i) & 1048575;
        if (!zzI(obj, i)) {
            return zzgeVarZzv.zze();
        }
        Object object = zzb.getObject(obj, iZzs);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzgeVarZzv.zze();
        if (object != null) {
            zzgeVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzy(Object obj, int i, int i2) {
        zzge zzgeVarZzv = zzv(i2);
        if (!zzM(obj, i, i2)) {
            return zzgeVarZzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i2) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzgeVarZzv.zze();
        if (object != null) {
            zzgeVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzz(Class cls, String str) {
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
            StringBuilder sbV = a.v("Field ", str, " for ", name, " not found. Known fields are ");
            sbV.append(string);
            throw new RuntimeException(sbV.toString());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final int zza(Object obj) {
        int i;
        int iZzA;
        int iZzB;
        int iZzA2;
        int iZzd;
        int iZzA3;
        int iZzh;
        int size;
        int iZzl;
        int iZzA4;
        int iZzA5;
        int iZzd2;
        boolean z;
        int iZzb;
        int iZzz;
        int iZzA6;
        int iZzA7;
        int size2;
        int iZzk;
        int iZzA8;
        int size3;
        int iZzi;
        int iZzA9;
        int i2;
        int iZze;
        int iZzA10;
        int iZzA11;
        int iZzA12;
        int iZzB2;
        zzfp<T> zzfpVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int iW = 0;
        while (i5 < zzfpVar.zzc.length) {
            int iZzs = zzfpVar.zzs(i5);
            int iZzr = zzr(iZzs);
            int[] iArr = zzfpVar.zzc;
            int i7 = iArr[i5];
            int i8 = iArr[i5 + 2];
            int i9 = i8 & i3;
            if (iZzr <= 17) {
                if (i9 != i4) {
                    i6 = i9 == i3 ? 0 : unsafe.getInt(obj2, i9);
                    i4 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                i = 0;
            }
            int i10 = iZzs & i3;
            if (iZzr >= zzdy.zzJ.zza()) {
                zzdy.zzW.zza();
            }
            long j = i10;
            switch (iZzr) {
                case 0:
                    if (zzfpVar.zzJ(obj2, i5, i4, i6, i)) {
                        iW = com.google.android.gms.common.api.internal.a.w(i7 << 3, 8, iW);
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 1:
                    if (zzfpVar.zzJ(obj2, i5, i4, i6, i)) {
                        iW = com.google.android.gms.common.api.internal.a.w(i7 << 3, 4, iW);
                    }
                    zzfpVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 2:
                    if (zzfpVar.zzJ(obj2, i5, i4, i6, i)) {
                        long j2 = unsafe.getLong(obj2, j);
                        iZzA = zzdn.zzA(i7 << 3);
                        iZzB = zzdn.zzB(j2);
                        iW += iZzB + iZzA;
                    }
                    zzfpVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 3:
                    if (zzfpVar.zzJ(obj2, i5, i4, i6, i)) {
                        long j3 = unsafe.getLong(obj2, j);
                        iZzA = zzdn.zzA(i7 << 3);
                        iZzB = zzdn.zzB(j3);
                        iW += iZzB + iZzA;
                    }
                    zzfpVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 4:
                    if (zzfpVar.zzJ(obj2, i5, i4, i6, i)) {
                        long j4 = unsafe.getInt(obj2, j);
                        iZzA = zzdn.zzA(i7 << 3);
                        iZzB = zzdn.zzB(j4);
                        iW += iZzB + iZzA;
                    }
                    zzfpVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 5:
                    if (zzfpVar.zzJ(obj2, i5, i4, i6, i)) {
                        iW = com.google.android.gms.common.api.internal.a.w(i7 << 3, 8, iW);
                    }
                    zzfpVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 6:
                    if (zzfpVar.zzJ(obj2, i5, i4, i6, i)) {
                        iW = com.google.android.gms.common.api.internal.a.w(i7 << 3, 4, iW);
                    }
                    zzfpVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 7:
                    if (zzfpVar.zzJ(obj2, i5, i4, i6, i)) {
                        iW = com.google.android.gms.common.api.internal.a.w(i7 << 3, 1, iW);
                    }
                    zzfpVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 8:
                    if (zzfpVar.zzJ(obj2, i5, i4, i6, i)) {
                        int i11 = i7 << 3;
                        Object object = unsafe.getObject(obj2, j);
                        if (object instanceof zzdf) {
                            iZzA2 = zzdn.zzA(i11);
                            iZzd = ((zzdf) object).zzd();
                            iZzA3 = zzdn.zzA(iZzd);
                            iW += iZzA3 + iZzd + iZzA2;
                        } else {
                            iZzA = zzdn.zzA(i11);
                            iZzB = zzdn.zzz((String) object);
                            iW += iZzB + iZzA;
                        }
                    }
                    zzfpVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 9:
                    if (zzfpVar.zzJ(obj2, i5, i4, i6, i)) {
                        iZzh = zzgg.zzh(i7, unsafe.getObject(obj2, j), zzfpVar.zzv(i5));
                        iW += iZzh;
                        i5 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    } else {
                        i5 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    }
                case 10:
                    if (zzfpVar.zzJ(obj2, i5, i4, i6, i)) {
                        zzdf zzdfVar = (zzdf) unsafe.getObject(obj2, j);
                        iZzA2 = zzdn.zzA(i7 << 3);
                        iZzd = zzdfVar.zzd();
                        iZzA3 = zzdn.zzA(iZzd);
                        iW += iZzA3 + iZzd + iZzA2;
                    }
                    zzfpVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 11:
                    if (zzfpVar.zzJ(obj2, i5, i4, i6, i)) {
                        iW = com.google.android.gms.common.api.internal.a.w(unsafe.getInt(obj2, j), zzdn.zzA(i7 << 3), iW);
                    }
                    zzfpVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 12:
                    if (zzfpVar.zzJ(obj2, i5, i4, i6, i)) {
                        long j5 = unsafe.getInt(obj2, j);
                        iZzA = zzdn.zzA(i7 << 3);
                        iZzB = zzdn.zzB(j5);
                        iW += iZzB + iZzA;
                    }
                    zzfpVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 13:
                    if (zzfpVar.zzJ(obj2, i5, i4, i6, i)) {
                        iW = com.google.android.gms.common.api.internal.a.w(i7 << 3, 4, iW);
                    }
                    zzfpVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 14:
                    if (zzfpVar.zzJ(obj2, i5, i4, i6, i)) {
                        iW = com.google.android.gms.common.api.internal.a.w(i7 << 3, 8, iW);
                    }
                    zzfpVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 15:
                    if (zzfpVar.zzJ(obj2, i5, i4, i6, i)) {
                        int i12 = unsafe.getInt(obj2, j);
                        iW = com.google.android.gms.common.api.internal.a.w((i12 >> 31) ^ (i12 + i12), zzdn.zzA(i7 << 3), iW);
                    }
                    zzfpVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 16:
                    if (zzfpVar.zzJ(obj2, i5, i4, i6, i)) {
                        long j6 = unsafe.getLong(obj2, j);
                        iZzA = zzdn.zzA(i7 << 3);
                        iZzB = zzdn.zzB((j6 >> 63) ^ (j6 + j6));
                        iW += iZzB + iZzA;
                    }
                    zzfpVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 17:
                    if (zzfpVar.zzJ(obj2, i5, i4, i6, i)) {
                        iW += zzdn.zzw(i7, (zzfm) unsafe.getObject(obj2, j), zzfpVar.zzv(i5));
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 18:
                    iZzh = zzgg.zzd(i7, (List) unsafe.getObject(obj2, j), false);
                    iW += iZzh;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 19:
                    iZzh = zzgg.zzb(i7, (List) unsafe.getObject(obj2, j), false);
                    iW += iZzh;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j);
                    int i13 = zzgg.zza;
                    iZzA5 = list.size() == 0 ? 0 : (zzdn.zzA(i7 << 3) * list.size()) + zzgg.zzg(list);
                    iW += iZzA5;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j);
                    int i14 = zzgg.zza;
                    size = list2.size();
                    if (size != 0) {
                        iZzl = zzgg.zzl(list2);
                        iZzA4 = zzdn.zzA(i7 << 3);
                        iZzA5 = (iZzA4 * size) + iZzl;
                        iW += iZzA5;
                        i5 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    }
                    iW += iZzA5;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j);
                    int i15 = zzgg.zza;
                    size = list3.size();
                    if (size != 0) {
                        iZzl = zzgg.zzf(list3);
                        iZzA4 = zzdn.zzA(i7 << 3);
                        iZzA5 = (iZzA4 * size) + iZzl;
                        iW += iZzA5;
                        i5 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    }
                    iW += iZzA5;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 23:
                    iZzd2 = zzgg.zzd(i7, (List) unsafe.getObject(obj2, j), false);
                    iW += iZzd2;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 24:
                    z = false;
                    iZzb = zzgg.zzb(i7, (List) unsafe.getObject(obj2, j), false);
                    iW += iZzb;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j);
                    int i16 = zzgg.zza;
                    int size4 = list4.size();
                    iZzd2 = size4 == 0 ? 0 : size4 * (zzdn.zzA(i7 << 3) + 1);
                    iW += iZzd2;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j);
                    int i17 = zzgg.zza;
                    int size5 = list5.size();
                    if (size5 == 0) {
                        iZzz = 0;
                    } else {
                        int iZzA13 = zzdn.zzA(i7 << 3) * size5;
                        if (list5 instanceof zzey) {
                            zzey zzeyVar = (zzey) list5;
                            iZzz = iZzA13;
                            for (int i18 = 0; i18 < size5; i18++) {
                                Object objZza = zzeyVar.zza();
                                if (objZza instanceof zzdf) {
                                    int iZzd3 = ((zzdf) objZza).zzd();
                                    iZzz = com.google.android.gms.common.api.internal.a.w(iZzd3, iZzd3, iZzz);
                                } else {
                                    iZzz = zzdn.zzz((String) objZza) + iZzz;
                                }
                            }
                        } else {
                            iZzz = iZzA13;
                            for (int i19 = 0; i19 < size5; i19++) {
                                Object obj3 = list5.get(i19);
                                if (obj3 instanceof zzdf) {
                                    int iZzd4 = ((zzdf) obj3).zzd();
                                    iZzz = com.google.android.gms.common.api.internal.a.w(iZzd4, iZzd4, iZzz);
                                } else {
                                    iZzz = zzdn.zzz((String) obj3) + iZzz;
                                }
                            }
                        }
                    }
                    iW += iZzz;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j);
                    zzge zzgeVarZzv = zzfpVar.zzv(i5);
                    int i20 = zzgg.zza;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iZzA6 = 0;
                    } else {
                        iZzA6 = zzdn.zzA(i7 << 3) * size6;
                        for (int i21 = 0; i21 < size6; i21++) {
                            Object obj4 = list6.get(i21);
                            if (obj4 instanceof zzex) {
                                int iZza = ((zzex) obj4).zza();
                                iZzA6 = com.google.android.gms.common.api.internal.a.w(iZza, iZza, iZzA6);
                            } else {
                                iZzA6 = zzdn.zzy((zzfm) obj4, zzgeVarZzv) + iZzA6;
                            }
                        }
                    }
                    iW += iZzA6;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j);
                    int i22 = zzgg.zza;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        iZzA7 = 0;
                    } else {
                        iZzA7 = zzdn.zzA(i7 << 3) * size7;
                        for (int i23 = 0; i23 < list7.size(); i23++) {
                            int iZzd5 = ((zzdf) list7.get(i23)).zzd();
                            iZzA7 = com.google.android.gms.common.api.internal.a.w(iZzd5, iZzd5, iZzA7);
                        }
                    }
                    iW += iZzA7;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j);
                    int i24 = zzgg.zza;
                    size2 = list8.size();
                    if (size2 != 0) {
                        iZzk = zzgg.zzk(list8);
                        iZzA8 = zzdn.zzA(i7 << 3);
                        iZzd2 = iZzk + (iZzA8 * size2);
                        iW += iZzd2;
                        i5 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    }
                    iW += iZzd2;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j);
                    int i25 = zzgg.zza;
                    size2 = list9.size();
                    if (size2 != 0) {
                        iZzk = zzgg.zza(list9);
                        iZzA8 = zzdn.zzA(i7 << 3);
                        iZzd2 = iZzk + (iZzA8 * size2);
                        iW += iZzd2;
                        i5 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    }
                    iW += iZzd2;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 31:
                    iZzd2 = zzgg.zzb(i7, (List) unsafe.getObject(obj2, j), false);
                    iW += iZzd2;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 32:
                    z = false;
                    iZzb = zzgg.zzd(i7, (List) unsafe.getObject(obj2, j), false);
                    iW += iZzb;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j);
                    int i26 = zzgg.zza;
                    size3 = list10.size();
                    if (size3 != 0) {
                        iZzi = zzgg.zzi(list10);
                        iZzA9 = zzdn.zzA(i7 << 3);
                        i2 = (iZzA9 * size3) + iZzi;
                        iW += i2;
                        i5 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    }
                    i2 = 0;
                    iW += i2;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j);
                    int i27 = zzgg.zza;
                    size3 = list11.size();
                    if (size3 != 0) {
                        iZzi = zzgg.zzj(list11);
                        iZzA9 = zzdn.zzA(i7 << 3);
                        i2 = (iZzA9 * size3) + iZzi;
                        iW += i2;
                        i5 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    }
                    i2 = 0;
                    iW += i2;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 35:
                    iZze = zzgg.zze((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i7 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iW += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 36:
                    iZze = zzgg.zzc((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i7 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iW += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 37:
                    iZze = zzgg.zzg((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i7 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iW += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 38:
                    iZze = zzgg.zzl((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i7 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iW += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 39:
                    iZze = zzgg.zzf((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i7 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iW += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 40:
                    iZze = zzgg.zze((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i7 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iW += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 41:
                    iZze = zzgg.zzc((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i7 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iW += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j);
                    int i28 = zzgg.zza;
                    iZze = list12.size();
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i7 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iW += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 43:
                    iZze = zzgg.zzk((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i7 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iW += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 44:
                    iZze = zzgg.zza((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i7 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iW += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 45:
                    iZze = zzgg.zzc((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i7 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iW += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 46:
                    iZze = zzgg.zze((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i7 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iW += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 47:
                    iZze = zzgg.zzi((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i7 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iW += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 48:
                    iZze = zzgg.zzj((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzdn.zzA(i7 << 3);
                        iZzA11 = zzdn.zzA(iZze);
                        iW += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j);
                    zzge zzgeVarZzv2 = zzfpVar.zzv(i5);
                    int i29 = zzgg.zza;
                    int size8 = list13.size();
                    if (size8 == 0) {
                        i2 = 0;
                    } else {
                        int iZzw = 0;
                        for (int i30 = 0; i30 < size8; i30++) {
                            iZzw += zzdn.zzw(i7, (zzfm) list13.get(i30), zzgeVarZzv2);
                        }
                        i2 = iZzw;
                    }
                    iW += i2;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 50:
                    zzfg zzfgVar = (zzfg) unsafe.getObject(obj2, j);
                    if (!zzfgVar.isEmpty()) {
                        Iterator it = zzfgVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 51:
                    if (zzfpVar.zzM(obj2, i7, i5)) {
                        iW = com.google.android.gms.common.api.internal.a.w(i7 << 3, 8, iW);
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 52:
                    if (zzfpVar.zzM(obj2, i7, i5)) {
                        iW = com.google.android.gms.common.api.internal.a.w(i7 << 3, 4, iW);
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 53:
                    if (zzfpVar.zzM(obj2, i7, i5)) {
                        long jZzt = zzt(obj2, j);
                        iZzA12 = zzdn.zzA(i7 << 3);
                        iZzB2 = zzdn.zzB(jZzt);
                        iW += iZzB2 + iZzA12;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 54:
                    if (zzfpVar.zzM(obj2, i7, i5)) {
                        long jZzt2 = zzt(obj2, j);
                        iZzA12 = zzdn.zzA(i7 << 3);
                        iZzB2 = zzdn.zzB(jZzt2);
                        iW += iZzB2 + iZzA12;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 55:
                    if (zzfpVar.zzM(obj2, i7, i5)) {
                        long jZzo = zzo(obj2, j);
                        iZzA12 = zzdn.zzA(i7 << 3);
                        iZzB2 = zzdn.zzB(jZzo);
                        iW += iZzB2 + iZzA12;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 56:
                    if (zzfpVar.zzM(obj2, i7, i5)) {
                        iW = com.google.android.gms.common.api.internal.a.w(i7 << 3, 8, iW);
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 57:
                    if (zzfpVar.zzM(obj2, i7, i5)) {
                        iW = com.google.android.gms.common.api.internal.a.w(i7 << 3, 4, iW);
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 58:
                    if (zzfpVar.zzM(obj2, i7, i5)) {
                        iW = com.google.android.gms.common.api.internal.a.w(i7 << 3, 1, iW);
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 59:
                    if (zzfpVar.zzM(obj2, i7, i5)) {
                        int i31 = i7 << 3;
                        Object object2 = unsafe.getObject(obj2, j);
                        if (object2 instanceof zzdf) {
                            iZze = zzdn.zzA(i31);
                            iZzA10 = ((zzdf) object2).zzd();
                            iZzA11 = zzdn.zzA(iZzA10);
                            iW += iZzA11 + iZzA10 + iZze;
                        } else {
                            iZzA12 = zzdn.zzA(i31);
                            iZzB2 = zzdn.zzz((String) object2);
                            iW += iZzB2 + iZzA12;
                        }
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 60:
                    if (zzfpVar.zzM(obj2, i7, i5)) {
                        iZzd2 = zzgg.zzh(i7, unsafe.getObject(obj2, j), zzfpVar.zzv(i5));
                        iW += iZzd2;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 61:
                    if (zzfpVar.zzM(obj2, i7, i5)) {
                        zzdf zzdfVar2 = (zzdf) unsafe.getObject(obj2, j);
                        iZze = zzdn.zzA(i7 << 3);
                        iZzA10 = zzdfVar2.zzd();
                        iZzA11 = zzdn.zzA(iZzA10);
                        iW += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 62:
                    if (zzfpVar.zzM(obj2, i7, i5)) {
                        iW = com.google.android.gms.common.api.internal.a.w(zzo(obj2, j), zzdn.zzA(i7 << 3), iW);
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 63:
                    if (zzfpVar.zzM(obj2, i7, i5)) {
                        long jZzo2 = zzo(obj2, j);
                        iZzA12 = zzdn.zzA(i7 << 3);
                        iZzB2 = zzdn.zzB(jZzo2);
                        iW += iZzB2 + iZzA12;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 64:
                    if (zzfpVar.zzM(obj2, i7, i5)) {
                        iW = com.google.android.gms.common.api.internal.a.w(i7 << 3, 4, iW);
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 65:
                    if (zzfpVar.zzM(obj2, i7, i5)) {
                        iW = com.google.android.gms.common.api.internal.a.w(i7 << 3, 8, iW);
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 66:
                    if (zzfpVar.zzM(obj2, i7, i5)) {
                        int iZzo = zzo(obj2, j);
                        iW = com.google.android.gms.common.api.internal.a.w((iZzo >> 31) ^ (iZzo + iZzo), zzdn.zzA(i7 << 3), iW);
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 67:
                    if (zzfpVar.zzM(obj2, i7, i5)) {
                        long jZzt3 = zzt(obj2, j);
                        iZzA12 = zzdn.zzA(i7 << 3);
                        iZzB2 = zzdn.zzB((jZzt3 >> 63) ^ (jZzt3 + jZzt3));
                        iW += iZzB2 + iZzA12;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 68:
                    if (zzfpVar.zzM(obj2, i7, i5)) {
                        iW += zzdn.zzw(i7, (zzfm) unsafe.getObject(obj2, j), zzfpVar.zzv(i5));
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                default:
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
            }
        }
        int iZza2 = 0;
        int iZza3 = ((zzeh) obj).zzc.zza() + iW;
        if (!zzfpVar.zzh) {
            return iZza3;
        }
        zzdx zzdxVar = ((zzed) obj).zzb;
        int iZzc = zzdxVar.zza.zzc();
        for (int i32 = 0; i32 < iZzc; i32++) {
            Map.Entry entryZzg = zzdxVar.zza.zzg(i32);
            iZza2 += zzdx.zza((zzdw) ((zzgi) entryZzg).zza(), entryZzg.getValue());
        }
        for (Map.Entry entry2 : zzdxVar.zza.zzd()) {
            iZza2 += zzdx.zza((zzdw) entry2.getKey(), entry2.getValue());
        }
        return iZza3 + iZza2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int iZzc;
        int i3;
        int i4 = 0;
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int iZzs = zzs(i5);
            int[] iArr = this.zzc;
            int i6 = 1048575 & iZzs;
            int iZzr = zzr(iZzs);
            int i7 = iArr[i5];
            long j = i6;
            int iHashCode = 37;
            switch (iZzr) {
                case 0:
                    i = i4 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzgz.zza(obj, j));
                    byte[] bArr = zzep.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iZzc;
                    break;
                case 1:
                    i2 = i4 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzgz.zzb(obj, j));
                    i4 = iFloatToIntBits + i2;
                    break;
                case 2:
                    i = i4 * 53;
                    jDoubleToLongBits = zzgz.zzd(obj, j);
                    byte[] bArr2 = zzep.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iZzc;
                    break;
                case 3:
                    i = i4 * 53;
                    jDoubleToLongBits = zzgz.zzd(obj, j);
                    byte[] bArr3 = zzep.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iZzc;
                    break;
                case 4:
                    i = i4 * 53;
                    iZzc = zzgz.zzc(obj, j);
                    i4 = i + iZzc;
                    break;
                case 5:
                    i = i4 * 53;
                    jDoubleToLongBits = zzgz.zzd(obj, j);
                    byte[] bArr4 = zzep.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iZzc;
                    break;
                case 6:
                    i = i4 * 53;
                    iZzc = zzgz.zzc(obj, j);
                    i4 = i + iZzc;
                    break;
                case 7:
                    i2 = i4 * 53;
                    iFloatToIntBits = zzep.zza(zzgz.zzw(obj, j));
                    i4 = iFloatToIntBits + i2;
                    break;
                case 8:
                    i2 = i4 * 53;
                    iFloatToIntBits = ((String) zzgz.zzf(obj, j)).hashCode();
                    i4 = iFloatToIntBits + i2;
                    break;
                case 9:
                    i3 = i4 * 53;
                    Object objZzf = zzgz.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i4 = i3 + iHashCode;
                    break;
                case 10:
                    i2 = i4 * 53;
                    iFloatToIntBits = zzgz.zzf(obj, j).hashCode();
                    i4 = iFloatToIntBits + i2;
                    break;
                case 11:
                    i = i4 * 53;
                    iZzc = zzgz.zzc(obj, j);
                    i4 = i + iZzc;
                    break;
                case 12:
                    i = i4 * 53;
                    iZzc = zzgz.zzc(obj, j);
                    i4 = i + iZzc;
                    break;
                case 13:
                    i = i4 * 53;
                    iZzc = zzgz.zzc(obj, j);
                    i4 = i + iZzc;
                    break;
                case 14:
                    i = i4 * 53;
                    jDoubleToLongBits = zzgz.zzd(obj, j);
                    byte[] bArr5 = zzep.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iZzc;
                    break;
                case 15:
                    i = i4 * 53;
                    iZzc = zzgz.zzc(obj, j);
                    i4 = i + iZzc;
                    break;
                case 16:
                    i = i4 * 53;
                    jDoubleToLongBits = zzgz.zzd(obj, j);
                    byte[] bArr6 = zzep.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iZzc;
                    break;
                case 17:
                    i3 = i4 * 53;
                    Object objZzf2 = zzgz.zzf(obj, j);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i4 = i3 + iHashCode;
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
                    i2 = i4 * 53;
                    iFloatToIntBits = zzgz.zzf(obj, j).hashCode();
                    i4 = iFloatToIntBits + i2;
                    break;
                case 50:
                    i2 = i4 * 53;
                    iFloatToIntBits = zzgz.zzf(obj, j).hashCode();
                    i4 = iFloatToIntBits + i2;
                    break;
                case 51:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzm(obj, j));
                        byte[] bArr7 = zzep.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzn(obj, j));
                        i4 = iFloatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr8 = zzep.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr9 = zzep.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        iZzc = zzo(obj, j);
                        i4 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr10 = zzep.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        iZzc = zzo(obj, j);
                        i4 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzep.zza(zzN(obj, j));
                        i4 = iFloatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = ((String) zzgz.zzf(obj, j)).hashCode();
                        i4 = iFloatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzgz.zzf(obj, j).hashCode();
                        i4 = iFloatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzgz.zzf(obj, j).hashCode();
                        i4 = iFloatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        iZzc = zzo(obj, j);
                        i4 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        iZzc = zzo(obj, j);
                        i4 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        iZzc = zzo(obj, j);
                        i4 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr11 = zzep.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        iZzc = zzo(obj, j);
                        i4 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr12 = zzep.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzgz.zzf(obj, j).hashCode();
                        i4 = iFloatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = ((zzeh) obj).zzc.hashCode() + (i4 * 53);
        return this.zzh ? (iHashCode2 * 53) + ((zzed) obj).zzb.zza.hashCode() : iHashCode2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x0e06  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0e3b  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x0b4e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:635:0x0dd6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:638:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:665:0x0b62 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:676:0x0deb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0272  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzc(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu r39) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3914
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcu):int");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final Object zze() {
        return ((zzeh) this.zzg).zzK();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = zzL(r8)
            if (r0 != 0) goto L8
            goto L95
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh r0 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzW(r2)
            r0.zza = r1
            r0.zzU()
        L1b:
            int[] r0 = r7.zzc
        L1d:
            int r2 = r0.length
            if (r1 >= r2) goto L87
            int r2 = r7.zzs(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = zzr(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L71
            r5 = 60
            if (r2 == r5) goto L59
            r5 = 68
            if (r2 == r5) goto L59
            switch(r2) {
                case 17: goto L71;
                case 18: goto L4f;
                case 19: goto L4f;
                case 20: goto L4f;
                case 21: goto L4f;
                case 22: goto L4f;
                case 23: goto L4f;
                case 24: goto L4f;
                case 25: goto L4f;
                case 26: goto L4f;
                case 27: goto L4f;
                case 28: goto L4f;
                case 29: goto L4f;
                case 30: goto L4f;
                case 31: goto L4f;
                case 32: goto L4f;
                case 33: goto L4f;
                case 34: goto L4f;
                case 35: goto L4f;
                case 36: goto L4f;
                case 37: goto L4f;
                case 38: goto L4f;
                case 39: goto L4f;
                case 40: goto L4f;
                case 41: goto L4f;
                case 42: goto L4f;
                case 43: goto L4f;
                case 44: goto L4f;
                case 45: goto L4f;
                case 46: goto L4f;
                case 47: goto L4f;
                case 48: goto L4f;
                case 49: goto L4f;
                case 50: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L84
        L3d:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L84
            r6 = r5
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfg r6 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfg) r6
            r6.zzc()
            r2.putObject(r8, r3, r5)
            goto L84
        L4f:
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzf(r8, r3)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo r2 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo) r2
            r2.zzb()
            goto L84
        L59:
            int[] r2 = r7.zzc
            r2 = r2[r1]
            boolean r2 = r7.zzM(r8, r2, r1)
            if (r2 == 0) goto L84
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge r2 = r7.zzv(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
            goto L84
        L71:
            boolean r2 = r7.zzI(r8, r1)
            if (r2 == 0) goto L84
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge r2 = r7.zzv(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
        L84:
            int r1 = r1 + 3
            goto L1d
        L87:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgs r0 = r7.zzl
            r0.zza(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L95
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdt r0 = r7.zzm
            r0.zza(r8)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp.zzf(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzs = zzs(i);
            int i2 = 1048575 & iZzs;
            int[] iArr = this.zzc;
            int iZzr = zzr(iZzs);
            int i3 = iArr[i];
            long j = i2;
            switch (iZzr) {
                case 0:
                    if (zzI(obj2, i)) {
                        zzgz.zzo(obj, j, zzgz.zza(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzI(obj2, i)) {
                        zzgz.zzp(obj, j, zzgz.zzb(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzI(obj2, i)) {
                        zzgz.zzr(obj, j, zzgz.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzI(obj2, i)) {
                        zzgz.zzr(obj, j, zzgz.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzI(obj2, i)) {
                        zzgz.zzq(obj, j, zzgz.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzI(obj2, i)) {
                        zzgz.zzr(obj, j, zzgz.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzI(obj2, i)) {
                        zzgz.zzq(obj, j, zzgz.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzI(obj2, i)) {
                        zzgz.zzm(obj, j, zzgz.zzw(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzI(obj2, i)) {
                        zzgz.zzs(obj, j, zzgz.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i);
                    break;
                case 10:
                    if (zzI(obj2, i)) {
                        zzgz.zzs(obj, j, zzgz.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzI(obj2, i)) {
                        zzgz.zzq(obj, j, zzgz.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzI(obj2, i)) {
                        zzgz.zzq(obj, j, zzgz.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzI(obj2, i)) {
                        zzgz.zzq(obj, j, zzgz.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzI(obj2, i)) {
                        zzgz.zzr(obj, j, zzgz.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzI(obj2, i)) {
                        zzgz.zzq(obj, j, zzgz.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzI(obj2, i)) {
                        zzgz.zzr(obj, j, zzgz.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzB(obj, obj2, i);
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
                    zzeo zzeoVarZzd = (zzeo) zzgz.zzf(obj, j);
                    zzeo zzeoVar = (zzeo) zzgz.zzf(obj2, j);
                    int size = zzeoVarZzd.size();
                    int size2 = zzeoVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzeoVarZzd.zzc()) {
                            zzeoVarZzd = zzeoVarZzd.zzd(size2 + size);
                        }
                        zzeoVarZzd.addAll(zzeoVar);
                    }
                    if (size > 0) {
                        zzeoVar = zzeoVarZzd;
                    }
                    zzgz.zzs(obj, j, zzeoVar);
                    break;
                case 50:
                    int i4 = zzgg.zza;
                    zzgz.zzs(obj, j, zzfh.zza(zzgz.zzf(obj, j), zzgz.zzf(obj2, j)));
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
                    if (zzM(obj2, i3, i)) {
                        zzgz.zzs(obj, j, zzgz.zzf(obj2, j));
                        zzE(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzC(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzM(obj2, i3, i)) {
                        zzgz.zzs(obj, j, zzgz.zzf(obj2, j));
                        zzE(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzC(obj, obj2, i);
                    break;
            }
        }
        zzgg.zzp(this.zzl, obj, obj2);
        if (this.zzh) {
            zzgg.zzo(this.zzm, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzcu zzcuVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzcuVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(java.lang.Object r21, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp.zzi(java.lang.Object, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzE;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzs = zzs(i);
            long j = iZzs & 1048575;
            switch (zzr(iZzs)) {
                case 0:
                    if (!zzH(obj, obj2, i) || Double.doubleToLongBits(zzgz.zza(obj, j)) != Double.doubleToLongBits(zzgz.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzH(obj, obj2, i) || Float.floatToIntBits(zzgz.zzb(obj, j)) != Float.floatToIntBits(zzgz.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzH(obj, obj2, i) || zzgz.zzd(obj, j) != zzgz.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzH(obj, obj2, i) || zzgz.zzd(obj, j) != zzgz.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzH(obj, obj2, i) || zzgz.zzc(obj, j) != zzgz.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzH(obj, obj2, i) || zzgz.zzd(obj, j) != zzgz.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzH(obj, obj2, i) || zzgz.zzc(obj, j) != zzgz.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzH(obj, obj2, i) || zzgz.zzw(obj, j) != zzgz.zzw(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzH(obj, obj2, i) || !zzgg.zzE(zzgz.zzf(obj, j), zzgz.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzH(obj, obj2, i) || !zzgg.zzE(zzgz.zzf(obj, j), zzgz.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzH(obj, obj2, i) || !zzgg.zzE(zzgz.zzf(obj, j), zzgz.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzH(obj, obj2, i) || zzgz.zzc(obj, j) != zzgz.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzH(obj, obj2, i) || zzgz.zzc(obj, j) != zzgz.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzH(obj, obj2, i) || zzgz.zzc(obj, j) != zzgz.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzH(obj, obj2, i) || zzgz.zzd(obj, j) != zzgz.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzH(obj, obj2, i) || zzgz.zzc(obj, j) != zzgz.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzH(obj, obj2, i) || zzgz.zzd(obj, j) != zzgz.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzH(obj, obj2, i) || !zzgg.zzE(zzgz.zzf(obj, j), zzgz.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
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
                    zZzE = zzgg.zzE(zzgz.zzf(obj, j), zzgz.zzf(obj2, j));
                    break;
                case 50:
                    zZzE = zzgg.zzE(zzgz.zzf(obj, j), zzgz.zzf(obj2, j));
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
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzp = zzp(i) & 1048575;
                    if (zzgz.zzc(obj, jZzp) != zzgz.zzc(obj2, jZzp) || !zzgg.zzE(zzgz.zzf(obj, j), zzgz.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzE) {
                return false;
            }
        }
        if (!((zzeh) obj).zzc.equals(((zzeh) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzed) obj).zzb.equals(((zzed) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzk(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp.zzk(java.lang.Object):boolean");
    }
}
