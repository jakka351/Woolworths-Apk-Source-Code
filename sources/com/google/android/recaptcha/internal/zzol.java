package com.google.android.recaptcha.internal;

import YU.a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes6.dex */
final class zzol<T> implements zzow<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzps.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzoi zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzpl zzm;
    private final zzmp zzn;

    private zzol(int[] iArr, Object[] objArr, int i, int i2, zzoi zzoiVar, boolean z, int[] iArr2, int i3, int i4, zzoo zzooVar, zznv zznvVar, zzpl zzplVar, zzmp zzmpVar, zzod zzodVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzoiVar instanceof zznd;
        boolean z2 = false;
        if (zzmpVar != null && (zzoiVar instanceof zzna)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzm = zzplVar;
        this.zzn = zzmpVar;
        this.zzg = zzoiVar;
    }

    private final Object zzA(Object obj, int i) {
        zzow zzowVarZzx = zzx(i);
        int iZzu = zzu(i) & 1048575;
        if (!zzN(obj, i)) {
            return zzowVarZzx.zze();
        }
        Object object = zzb.getObject(obj, iZzu);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzowVarZzx.zze();
        if (object != null) {
            zzowVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzB(Object obj, int i, int i2) {
        zzow zzowVarZzx = zzx(i2);
        if (!zzR(obj, i, i2)) {
            return zzowVarZzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i2) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzowVarZzx.zze();
        if (object != null) {
            zzowVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzC(Class cls, String str) {
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

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i) {
        if (zzN(obj2, i)) {
            int iZzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzow zzowVarZzx = zzx(i);
            if (!zzN(obj, i)) {
                if (zzQ(object)) {
                    Object objZze = zzowVarZzx.zze();
                    zzowVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzH(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object objZze2 = zzowVarZzx.zze();
                zzowVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzowVarZzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzR(obj2, i2, i)) {
            int iZzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzow zzowVarZzx = zzx(i);
            if (!zzR(obj, i2, i)) {
                if (zzQ(object)) {
                    Object objZze = zzowVarZzx.zze();
                    zzowVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzI(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object objZze2 = zzowVarZzx.zze();
                zzowVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzowVarZzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i, zzov zzovVar) throws IOException {
        long j = i & 1048575;
        if (zzM(i)) {
            zzps.zzs(obj, j, zzovVar.zzs());
        } else if (this.zzi) {
            zzps.zzs(obj, j, zzovVar.zzr());
        } else {
            zzps.zzs(obj, j, zzovVar.zzp());
        }
    }

    private final void zzH(Object obj, int i) {
        int iZzr = zzr(i);
        long j = 1048575 & iZzr;
        if (j == 1048575) {
            return;
        }
        zzps.zzq(obj, j, (1 << (iZzr >>> 20)) | zzps.zzc(obj, j));
    }

    private final void zzI(Object obj, int i, int i2) {
        zzps.zzq(obj, zzr(i2) & 1048575, i);
    }

    private final void zzJ(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzu(i) & 1048575, obj2);
        zzH(obj, i);
    }

    private final void zzK(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzu(i2) & 1048575, obj2);
        zzI(obj, i, i2);
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        return zzN(obj, i) == zzN(obj2, i);
    }

    private static boolean zzM(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i) {
        int iZzr = zzr(i);
        long j = iZzr & 1048575;
        if (j != 1048575) {
            return (zzps.zzc(obj, j) & (1 << (iZzr >>> 20))) != 0;
        }
        int iZzu = zzu(i);
        long j2 = iZzu & 1048575;
        switch (zzt(iZzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzps.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzps.zzb(obj, j2)) != 0;
            case 2:
                return zzps.zzd(obj, j2) != 0;
            case 3:
                return zzps.zzd(obj, j2) != 0;
            case 4:
                return zzps.zzc(obj, j2) != 0;
            case 5:
                return zzps.zzd(obj, j2) != 0;
            case 6:
                return zzps.zzc(obj, j2) != 0;
            case 7:
                return zzps.zzw(obj, j2);
            case 8:
                Object objZzf = zzps.zzf(obj, j2);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzle) {
                    return !zzle.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzps.zzf(obj, j2) != null;
            case 10:
                return !zzle.zzb.equals(zzps.zzf(obj, j2));
            case 11:
                return zzps.zzc(obj, j2) != 0;
            case 12:
                return zzps.zzc(obj, j2) != 0;
            case 13:
                return zzps.zzc(obj, j2) != 0;
            case 14:
                return zzps.zzd(obj, j2) != 0;
            case 15:
                return zzps.zzc(obj, j2) != 0;
            case 16:
                return zzps.zzd(obj, j2) != 0;
            case 17:
                return zzps.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzN(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzP(Object obj, int i, zzow zzowVar) {
        return zzowVar.zzl(zzps.zzf(obj, i & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zznd) {
            return ((zznd) obj).zzL();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i, int i2) {
        return zzps.zzc(obj, (long) (zzr(i2) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzps.zzf(obj, j)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zzpy zzpyVar) throws IOException {
        if (obj instanceof String) {
            zzpyVar.zzG(i, (String) obj);
        } else {
            zzpyVar.zzd(i, (zzle) obj);
        }
    }

    public static zzpm zzd(Object obj) {
        zznd zzndVar = (zznd) obj;
        zzpm zzpmVar = zzndVar.zzc;
        if (zzpmVar != zzpm.zzc()) {
            return zzpmVar;
        }
        zzpm zzpmVarZzf = zzpm.zzf();
        zzndVar.zzc = zzpmVarZzf;
        return zzpmVarZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.recaptcha.internal.zzol zzm(java.lang.Class r34, com.google.android.recaptcha.internal.zzof r35, com.google.android.recaptcha.internal.zzoo r36, com.google.android.recaptcha.internal.zznv r37, com.google.android.recaptcha.internal.zzpl r38, com.google.android.recaptcha.internal.zzmp r39, com.google.android.recaptcha.internal.zzod r40) {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzm(java.lang.Class, com.google.android.recaptcha.internal.zzof, com.google.android.recaptcha.internal.zzoo, com.google.android.recaptcha.internal.zznv, com.google.android.recaptcha.internal.zzpl, com.google.android.recaptcha.internal.zzmp, com.google.android.recaptcha.internal.zzod):com.google.android.recaptcha.internal.zzol");
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzps.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzps.zzf(obj, j)).floatValue();
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzps.zzf(obj, j)).intValue();
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzs(i, 0);
    }

    private final int zzr(int i) {
        return this.zzc[i + 2];
    }

    private final int zzs(int i, int i2) {
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

    private static int zzt(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzu(int i) {
        return this.zzc[i + 1];
    }

    private static long zzv(Object obj, long j) {
        return ((Long) zzps.zzf(obj, j)).longValue();
    }

    private final zznh zzw(int i) {
        int i2 = i / 3;
        return (zznh) this.zzd[i2 + i2 + 1];
    }

    private final zzow zzx(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzow zzowVar = (zzow) objArr[i3];
        if (zzowVar != null) {
            return zzowVar;
        }
        zzow zzowVarZzb = zzos.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzowVarZzb;
        return zzowVarZzb;
    }

    private final Object zzy(Object obj, int i, Object obj2, zzpl zzplVar, Object obj3) {
        int i2 = this.zzc[i];
        Object objZzf = zzps.zzf(obj, zzu(i) & 1048575);
        if (objZzf == null || zzw(i) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.recaptcha.internal.zzow
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
        zzol<T> zzolVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int iB = 0;
        while (i5 < zzolVar.zzc.length) {
            int iZzu = zzolVar.zzu(i5);
            int iZzt = zzt(iZzu);
            int[] iArr = zzolVar.zzc;
            int i7 = iArr[i5];
            int i8 = iArr[i5 + 2];
            int i9 = i8 & i3;
            if (iZzt <= 17) {
                if (i9 != i4) {
                    i6 = i9 == i3 ? 0 : unsafe.getInt(obj2, i9);
                    i4 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                i = 0;
            }
            int i10 = iZzu & i3;
            if (iZzt >= zzmu.zzJ.zza()) {
                zzmu.zzW.zza();
            }
            long j = i10;
            switch (iZzt) {
                case 0:
                    if (zzolVar.zzO(obj2, i5, i4, i6, i)) {
                        iB = com.google.android.gms.common.api.internal.a.B(i7 << 3, 8, iB);
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 1:
                    if (zzolVar.zzO(obj2, i5, i4, i6, i)) {
                        iB = com.google.android.gms.common.api.internal.a.B(i7 << 3, 4, iB);
                    }
                    zzolVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 2:
                    if (zzolVar.zzO(obj2, i5, i4, i6, i)) {
                        long j2 = unsafe.getLong(obj2, j);
                        iZzA = zzln.zzA(i7 << 3);
                        iZzB = zzln.zzB(j2);
                        iB += iZzB + iZzA;
                    }
                    zzolVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 3:
                    if (zzolVar.zzO(obj2, i5, i4, i6, i)) {
                        long j3 = unsafe.getLong(obj2, j);
                        iZzA = zzln.zzA(i7 << 3);
                        iZzB = zzln.zzB(j3);
                        iB += iZzB + iZzA;
                    }
                    zzolVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 4:
                    if (zzolVar.zzO(obj2, i5, i4, i6, i)) {
                        long j4 = unsafe.getInt(obj2, j);
                        iZzA = zzln.zzA(i7 << 3);
                        iZzB = zzln.zzB(j4);
                        iB += iZzB + iZzA;
                    }
                    zzolVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 5:
                    if (zzolVar.zzO(obj2, i5, i4, i6, i)) {
                        iB = com.google.android.gms.common.api.internal.a.B(i7 << 3, 8, iB);
                    }
                    zzolVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 6:
                    if (zzolVar.zzO(obj2, i5, i4, i6, i)) {
                        iB = com.google.android.gms.common.api.internal.a.B(i7 << 3, 4, iB);
                    }
                    zzolVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 7:
                    if (zzolVar.zzO(obj2, i5, i4, i6, i)) {
                        iB = com.google.android.gms.common.api.internal.a.B(i7 << 3, 1, iB);
                    }
                    zzolVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 8:
                    if (zzolVar.zzO(obj2, i5, i4, i6, i)) {
                        int i11 = i7 << 3;
                        Object object = unsafe.getObject(obj2, j);
                        if (object instanceof zzle) {
                            iZzA2 = zzln.zzA(i11);
                            iZzd = ((zzle) object).zzd();
                            iZzA3 = zzln.zzA(iZzd);
                            iB += iZzA3 + iZzd + iZzA2;
                        } else {
                            iZzA = zzln.zzA(i11);
                            iZzB = zzln.zzz((String) object);
                            iB += iZzB + iZzA;
                        }
                    }
                    zzolVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 9:
                    if (zzolVar.zzO(obj2, i5, i4, i6, i)) {
                        iZzh = zzoy.zzh(i7, unsafe.getObject(obj2, j), zzolVar.zzx(i5));
                        iB += iZzh;
                        i5 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    } else {
                        i5 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    }
                case 10:
                    if (zzolVar.zzO(obj2, i5, i4, i6, i)) {
                        zzle zzleVar = (zzle) unsafe.getObject(obj2, j);
                        iZzA2 = zzln.zzA(i7 << 3);
                        iZzd = zzleVar.zzd();
                        iZzA3 = zzln.zzA(iZzd);
                        iB += iZzA3 + iZzd + iZzA2;
                    }
                    zzolVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 11:
                    if (zzolVar.zzO(obj2, i5, i4, i6, i)) {
                        iB = com.google.android.gms.common.api.internal.a.B(unsafe.getInt(obj2, j), zzln.zzA(i7 << 3), iB);
                    }
                    zzolVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 12:
                    if (zzolVar.zzO(obj2, i5, i4, i6, i)) {
                        long j5 = unsafe.getInt(obj2, j);
                        iZzA = zzln.zzA(i7 << 3);
                        iZzB = zzln.zzB(j5);
                        iB += iZzB + iZzA;
                    }
                    zzolVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 13:
                    if (zzolVar.zzO(obj2, i5, i4, i6, i)) {
                        iB = com.google.android.gms.common.api.internal.a.B(i7 << 3, 4, iB);
                    }
                    zzolVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 14:
                    if (zzolVar.zzO(obj2, i5, i4, i6, i)) {
                        iB = com.google.android.gms.common.api.internal.a.B(i7 << 3, 8, iB);
                    }
                    zzolVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 15:
                    if (zzolVar.zzO(obj2, i5, i4, i6, i)) {
                        int i12 = unsafe.getInt(obj2, j);
                        iB = com.google.android.gms.common.api.internal.a.B((i12 >> 31) ^ (i12 + i12), zzln.zzA(i7 << 3), iB);
                    }
                    zzolVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 16:
                    if (zzolVar.zzO(obj2, i5, i4, i6, i)) {
                        long j6 = unsafe.getLong(obj2, j);
                        iZzA = zzln.zzA(i7 << 3);
                        iZzB = zzln.zzB((j6 >> 63) ^ (j6 + j6));
                        iB += iZzB + iZzA;
                    }
                    zzolVar = this;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 17:
                    if (zzolVar.zzO(obj2, i5, i4, i6, i)) {
                        iB += zzln.zzw(i7, (zzoi) unsafe.getObject(obj2, j), zzolVar.zzx(i5));
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 18:
                    iZzh = zzoy.zzd(i7, (List) unsafe.getObject(obj2, j), false);
                    iB += iZzh;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 19:
                    iZzh = zzoy.zzb(i7, (List) unsafe.getObject(obj2, j), false);
                    iB += iZzh;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j);
                    int i13 = zzoy.zza;
                    iZzA5 = list.size() == 0 ? 0 : (zzln.zzA(i7 << 3) * list.size()) + zzoy.zzg(list);
                    iB += iZzA5;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j);
                    int i14 = zzoy.zza;
                    size = list2.size();
                    if (size != 0) {
                        iZzl = zzoy.zzl(list2);
                        iZzA4 = zzln.zzA(i7 << 3);
                        iZzA5 = (iZzA4 * size) + iZzl;
                        iB += iZzA5;
                        i5 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    }
                    iB += iZzA5;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j);
                    int i15 = zzoy.zza;
                    size = list3.size();
                    if (size != 0) {
                        iZzl = zzoy.zzf(list3);
                        iZzA4 = zzln.zzA(i7 << 3);
                        iZzA5 = (iZzA4 * size) + iZzl;
                        iB += iZzA5;
                        i5 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    }
                    iB += iZzA5;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 23:
                    iZzd2 = zzoy.zzd(i7, (List) unsafe.getObject(obj2, j), false);
                    iB += iZzd2;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 24:
                    z = false;
                    iZzb = zzoy.zzb(i7, (List) unsafe.getObject(obj2, j), false);
                    iB += iZzb;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j);
                    int i16 = zzoy.zza;
                    int size4 = list4.size();
                    iZzd2 = size4 == 0 ? 0 : size4 * (zzln.zzA(i7 << 3) + 1);
                    iB += iZzd2;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j);
                    int i17 = zzoy.zza;
                    int size5 = list5.size();
                    if (size5 == 0) {
                        iZzz = 0;
                    } else {
                        int iZzA13 = zzln.zzA(i7 << 3) * size5;
                        if (list5 instanceof zznu) {
                            zznu zznuVar = (zznu) list5;
                            iZzz = iZzA13;
                            for (int i18 = 0; i18 < size5; i18++) {
                                Object objZzc = zznuVar.zzc();
                                if (objZzc instanceof zzle) {
                                    int iZzd3 = ((zzle) objZzc).zzd();
                                    iZzz = com.google.android.gms.common.api.internal.a.B(iZzd3, iZzd3, iZzz);
                                } else {
                                    iZzz = zzln.zzz((String) objZzc) + iZzz;
                                }
                            }
                        } else {
                            iZzz = iZzA13;
                            for (int i19 = 0; i19 < size5; i19++) {
                                Object obj3 = list5.get(i19);
                                if (obj3 instanceof zzle) {
                                    int iZzd4 = ((zzle) obj3).zzd();
                                    iZzz = com.google.android.gms.common.api.internal.a.B(iZzd4, iZzd4, iZzz);
                                } else {
                                    iZzz = zzln.zzz((String) obj3) + iZzz;
                                }
                            }
                        }
                    }
                    iB += iZzz;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j);
                    zzow zzowVarZzx = zzolVar.zzx(i5);
                    int i20 = zzoy.zza;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iZzA6 = 0;
                    } else {
                        iZzA6 = zzln.zzA(i7 << 3) * size6;
                        for (int i21 = 0; i21 < size6; i21++) {
                            Object obj4 = list6.get(i21);
                            if (obj4 instanceof zznt) {
                                int iZza = ((zznt) obj4).zza();
                                iZzA6 = com.google.android.gms.common.api.internal.a.B(iZza, iZza, iZzA6);
                            } else {
                                iZzA6 = zzln.zzy((zzoi) obj4, zzowVarZzx) + iZzA6;
                            }
                        }
                    }
                    iB += iZzA6;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j);
                    int i22 = zzoy.zza;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        iZzA7 = 0;
                    } else {
                        iZzA7 = zzln.zzA(i7 << 3) * size7;
                        for (int i23 = 0; i23 < list7.size(); i23++) {
                            int iZzd5 = ((zzle) list7.get(i23)).zzd();
                            iZzA7 = com.google.android.gms.common.api.internal.a.B(iZzd5, iZzd5, iZzA7);
                        }
                    }
                    iB += iZzA7;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j);
                    int i24 = zzoy.zza;
                    size2 = list8.size();
                    if (size2 != 0) {
                        iZzk = zzoy.zzk(list8);
                        iZzA8 = zzln.zzA(i7 << 3);
                        iZzd2 = iZzk + (iZzA8 * size2);
                        iB += iZzd2;
                        i5 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    }
                    iB += iZzd2;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j);
                    int i25 = zzoy.zza;
                    size2 = list9.size();
                    if (size2 != 0) {
                        iZzk = zzoy.zza(list9);
                        iZzA8 = zzln.zzA(i7 << 3);
                        iZzd2 = iZzk + (iZzA8 * size2);
                        iB += iZzd2;
                        i5 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    }
                    iB += iZzd2;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 31:
                    iZzd2 = zzoy.zzb(i7, (List) unsafe.getObject(obj2, j), false);
                    iB += iZzd2;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 32:
                    z = false;
                    iZzb = zzoy.zzd(i7, (List) unsafe.getObject(obj2, j), false);
                    iB += iZzb;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j);
                    int i26 = zzoy.zza;
                    size3 = list10.size();
                    if (size3 != 0) {
                        iZzi = zzoy.zzi(list10);
                        iZzA9 = zzln.zzA(i7 << 3);
                        i2 = (iZzA9 * size3) + iZzi;
                        iB += i2;
                        i5 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    }
                    i2 = 0;
                    iB += i2;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j);
                    int i27 = zzoy.zza;
                    size3 = list11.size();
                    if (size3 != 0) {
                        iZzi = zzoy.zzj(list11);
                        iZzA9 = zzln.zzA(i7 << 3);
                        i2 = (iZzA9 * size3) + iZzi;
                        iB += i2;
                        i5 += 3;
                        obj2 = obj;
                        i3 = 1048575;
                    }
                    i2 = 0;
                    iB += i2;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 35:
                    iZze = zzoy.zze((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i7 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iB += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 36:
                    iZze = zzoy.zzc((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i7 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iB += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 37:
                    iZze = zzoy.zzg((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i7 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iB += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 38:
                    iZze = zzoy.zzl((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i7 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iB += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 39:
                    iZze = zzoy.zzf((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i7 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iB += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 40:
                    iZze = zzoy.zze((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i7 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iB += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 41:
                    iZze = zzoy.zzc((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i7 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iB += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j);
                    int i28 = zzoy.zza;
                    iZze = list12.size();
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i7 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iB += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 43:
                    iZze = zzoy.zzk((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i7 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iB += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 44:
                    iZze = zzoy.zza((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i7 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iB += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 45:
                    iZze = zzoy.zzc((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i7 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iB += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 46:
                    iZze = zzoy.zze((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i7 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iB += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 47:
                    iZze = zzoy.zzi((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i7 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iB += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 48:
                    iZze = zzoy.zzj((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i7 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iB += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j);
                    zzow zzowVarZzx2 = zzolVar.zzx(i5);
                    int i29 = zzoy.zza;
                    int size8 = list13.size();
                    if (size8 == 0) {
                        i2 = 0;
                    } else {
                        int iZzw = 0;
                        for (int i30 = 0; i30 < size8; i30++) {
                            iZzw += zzln.zzw(i7, (zzoi) list13.get(i30), zzowVarZzx2);
                        }
                        i2 = iZzw;
                    }
                    iB += i2;
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 50:
                    zzoc zzocVar = (zzoc) unsafe.getObject(obj2, j);
                    if (!zzocVar.isEmpty()) {
                        Iterator it = zzocVar.entrySet().iterator();
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
                    if (zzolVar.zzR(obj2, i7, i5)) {
                        iB = com.google.android.gms.common.api.internal.a.B(i7 << 3, 8, iB);
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 52:
                    if (zzolVar.zzR(obj2, i7, i5)) {
                        iB = com.google.android.gms.common.api.internal.a.B(i7 << 3, 4, iB);
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 53:
                    if (zzolVar.zzR(obj2, i7, i5)) {
                        long jZzv = zzv(obj2, j);
                        iZzA12 = zzln.zzA(i7 << 3);
                        iZzB2 = zzln.zzB(jZzv);
                        iB += iZzB2 + iZzA12;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 54:
                    if (zzolVar.zzR(obj2, i7, i5)) {
                        long jZzv2 = zzv(obj2, j);
                        iZzA12 = zzln.zzA(i7 << 3);
                        iZzB2 = zzln.zzB(jZzv2);
                        iB += iZzB2 + iZzA12;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 55:
                    if (zzolVar.zzR(obj2, i7, i5)) {
                        long jZzp = zzp(obj2, j);
                        iZzA12 = zzln.zzA(i7 << 3);
                        iZzB2 = zzln.zzB(jZzp);
                        iB += iZzB2 + iZzA12;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 56:
                    if (zzolVar.zzR(obj2, i7, i5)) {
                        iB = com.google.android.gms.common.api.internal.a.B(i7 << 3, 8, iB);
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 57:
                    if (zzolVar.zzR(obj2, i7, i5)) {
                        iB = com.google.android.gms.common.api.internal.a.B(i7 << 3, 4, iB);
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 58:
                    if (zzolVar.zzR(obj2, i7, i5)) {
                        iB = com.google.android.gms.common.api.internal.a.B(i7 << 3, 1, iB);
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 59:
                    if (zzolVar.zzR(obj2, i7, i5)) {
                        int i31 = i7 << 3;
                        Object object2 = unsafe.getObject(obj2, j);
                        if (object2 instanceof zzle) {
                            iZze = zzln.zzA(i31);
                            iZzA10 = ((zzle) object2).zzd();
                            iZzA11 = zzln.zzA(iZzA10);
                            iB += iZzA11 + iZzA10 + iZze;
                        } else {
                            iZzA12 = zzln.zzA(i31);
                            iZzB2 = zzln.zzz((String) object2);
                            iB += iZzB2 + iZzA12;
                        }
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 60:
                    if (zzolVar.zzR(obj2, i7, i5)) {
                        iZzd2 = zzoy.zzh(i7, unsafe.getObject(obj2, j), zzolVar.zzx(i5));
                        iB += iZzd2;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 61:
                    if (zzolVar.zzR(obj2, i7, i5)) {
                        zzle zzleVar2 = (zzle) unsafe.getObject(obj2, j);
                        iZze = zzln.zzA(i7 << 3);
                        iZzA10 = zzleVar2.zzd();
                        iZzA11 = zzln.zzA(iZzA10);
                        iB += iZzA11 + iZzA10 + iZze;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 62:
                    if (zzolVar.zzR(obj2, i7, i5)) {
                        iB = com.google.android.gms.common.api.internal.a.B(zzp(obj2, j), zzln.zzA(i7 << 3), iB);
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 63:
                    if (zzolVar.zzR(obj2, i7, i5)) {
                        long jZzp2 = zzp(obj2, j);
                        iZzA12 = zzln.zzA(i7 << 3);
                        iZzB2 = zzln.zzB(jZzp2);
                        iB += iZzB2 + iZzA12;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 64:
                    if (zzolVar.zzR(obj2, i7, i5)) {
                        iB = com.google.android.gms.common.api.internal.a.B(i7 << 3, 4, iB);
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 65:
                    if (zzolVar.zzR(obj2, i7, i5)) {
                        iB = com.google.android.gms.common.api.internal.a.B(i7 << 3, 8, iB);
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 66:
                    if (zzolVar.zzR(obj2, i7, i5)) {
                        int iZzp = zzp(obj2, j);
                        iB = com.google.android.gms.common.api.internal.a.B((iZzp >> 31) ^ (iZzp + iZzp), zzln.zzA(i7 << 3), iB);
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 67:
                    if (zzolVar.zzR(obj2, i7, i5)) {
                        long jZzv3 = zzv(obj2, j);
                        iZzA12 = zzln.zzA(i7 << 3);
                        iZzB2 = zzln.zzB((jZzv3 >> 63) ^ (jZzv3 + jZzv3));
                        iB += iZzB2 + iZzA12;
                    }
                    i5 += 3;
                    obj2 = obj;
                    i3 = 1048575;
                case 68:
                    if (zzolVar.zzR(obj2, i7, i5)) {
                        iB += zzln.zzw(i7, (zzoi) unsafe.getObject(obj2, j), zzolVar.zzx(i5));
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
        int iZza3 = ((zznd) obj).zzc.zza() + iB;
        if (!zzolVar.zzh) {
            return iZza3;
        }
        zzmt zzmtVar = ((zzna) obj).zzb;
        int iZzc = zzmtVar.zza.zzc();
        for (int i32 = 0; i32 < iZzc; i32++) {
            Map.Entry entryZzg = zzmtVar.zza.zzg(i32);
            iZza2 += zzmt.zza((zzms) ((zzpa) entryZzg).zza(), entryZzg.getValue());
        }
        for (Map.Entry entry2 : zzmtVar.zza.zzd()) {
            iZza2 += zzmt.zza((zzms) entry2.getKey(), entry2.getValue());
        }
        return iZza3 + iZza2;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int iZzc;
        int i3;
        int i4 = 0;
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int iZzu = zzu(i5);
            int[] iArr = this.zzc;
            int i6 = 1048575 & iZzu;
            int iZzt = zzt(iZzu);
            int i7 = iArr[i5];
            long j = i6;
            int iHashCode = 37;
            switch (iZzt) {
                case 0:
                    i = i4 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzps.zza(obj, j));
                    byte[] bArr = zznl.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iZzc;
                    break;
                case 1:
                    i2 = i4 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzps.zzb(obj, j));
                    i4 = iFloatToIntBits + i2;
                    break;
                case 2:
                    i = i4 * 53;
                    jDoubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr2 = zznl.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iZzc;
                    break;
                case 3:
                    i = i4 * 53;
                    jDoubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr3 = zznl.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iZzc;
                    break;
                case 4:
                    i = i4 * 53;
                    iZzc = zzps.zzc(obj, j);
                    i4 = i + iZzc;
                    break;
                case 5:
                    i = i4 * 53;
                    jDoubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr4 = zznl.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iZzc;
                    break;
                case 6:
                    i = i4 * 53;
                    iZzc = zzps.zzc(obj, j);
                    i4 = i + iZzc;
                    break;
                case 7:
                    i2 = i4 * 53;
                    iFloatToIntBits = zznl.zza(zzps.zzw(obj, j));
                    i4 = iFloatToIntBits + i2;
                    break;
                case 8:
                    i2 = i4 * 53;
                    iFloatToIntBits = ((String) zzps.zzf(obj, j)).hashCode();
                    i4 = iFloatToIntBits + i2;
                    break;
                case 9:
                    i3 = i4 * 53;
                    Object objZzf = zzps.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i4 = i3 + iHashCode;
                    break;
                case 10:
                    i2 = i4 * 53;
                    iFloatToIntBits = zzps.zzf(obj, j).hashCode();
                    i4 = iFloatToIntBits + i2;
                    break;
                case 11:
                    i = i4 * 53;
                    iZzc = zzps.zzc(obj, j);
                    i4 = i + iZzc;
                    break;
                case 12:
                    i = i4 * 53;
                    iZzc = zzps.zzc(obj, j);
                    i4 = i + iZzc;
                    break;
                case 13:
                    i = i4 * 53;
                    iZzc = zzps.zzc(obj, j);
                    i4 = i + iZzc;
                    break;
                case 14:
                    i = i4 * 53;
                    jDoubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr5 = zznl.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iZzc;
                    break;
                case 15:
                    i = i4 * 53;
                    iZzc = zzps.zzc(obj, j);
                    i4 = i + iZzc;
                    break;
                case 16:
                    i = i4 * 53;
                    jDoubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr6 = zznl.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iZzc;
                    break;
                case 17:
                    i3 = i4 * 53;
                    Object objZzf2 = zzps.zzf(obj, j);
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
                    iFloatToIntBits = zzps.zzf(obj, j).hashCode();
                    i4 = iFloatToIntBits + i2;
                    break;
                case 50:
                    i2 = i4 * 53;
                    iFloatToIntBits = zzps.zzf(obj, j).hashCode();
                    i4 = iFloatToIntBits + i2;
                    break;
                case 51:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zznl.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i4 = iFloatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr8 = zznl.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr9 = zznl.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        iZzc = zzp(obj, j);
                        i4 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr10 = zznl.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        iZzc = zzp(obj, j);
                        i4 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zznl.zza(zzS(obj, j));
                        i4 = iFloatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = ((String) zzps.zzf(obj, j)).hashCode();
                        i4 = iFloatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzps.zzf(obj, j).hashCode();
                        i4 = iFloatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzps.zzf(obj, j).hashCode();
                        i4 = iFloatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        iZzc = zzp(obj, j);
                        i4 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        iZzc = zzp(obj, j);
                        i4 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        iZzc = zzp(obj, j);
                        i4 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr11 = zznl.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        iZzc = zzp(obj, j);
                        i4 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr12 = zznl.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = zzps.zzf(obj, j).hashCode();
                        i4 = iFloatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = ((zznd) obj).zzc.hashCode() + (i4 * 53);
        return this.zzh ? (iHashCode2 * 53) + ((zzna) obj).zzb.zza.hashCode() : iHashCode2;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int zzc(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, com.google.android.recaptcha.internal.zzkt r36) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3852
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzc(java.lang.Object, byte[], int, int, int, com.google.android.recaptcha.internal.zzkt):int");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final Object zze() {
        return ((zznd) this.zzg).zzv();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = zzQ(r8)
            if (r0 != 0) goto L8
            goto L95
        L8:
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zznd
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            com.google.android.recaptcha.internal.zznd r0 = (com.google.android.recaptcha.internal.zznd) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzJ(r2)
            r0.zza = r1
            r0.zzH()
        L1b:
            int[] r0 = r7.zzc
        L1d:
            int r2 = r0.length
            if (r1 >= r2) goto L87
            int r2 = r7.zzu(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = zzt(r2)
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
            sun.misc.Unsafe r2 = com.google.android.recaptcha.internal.zzol.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L84
            r6 = r5
            com.google.android.recaptcha.internal.zzoc r6 = (com.google.android.recaptcha.internal.zzoc) r6
            r6.zzc()
            r2.putObject(r8, r3, r5)
            goto L84
        L4f:
            java.lang.Object r2 = com.google.android.recaptcha.internal.zzps.zzf(r8, r3)
            com.google.android.recaptcha.internal.zznk r2 = (com.google.android.recaptcha.internal.zznk) r2
            r2.zzb()
            goto L84
        L59:
            int[] r2 = r7.zzc
            r2 = r2[r1]
            boolean r2 = r7.zzR(r8, r2, r1)
            if (r2 == 0) goto L84
            com.google.android.recaptcha.internal.zzow r2 = r7.zzx(r1)
            sun.misc.Unsafe r5 = com.google.android.recaptcha.internal.zzol.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
            goto L84
        L71:
            boolean r2 = r7.zzN(r8, r1)
            if (r2 == 0) goto L84
            com.google.android.recaptcha.internal.zzow r2 = r7.zzx(r1)
            sun.misc.Unsafe r5 = com.google.android.recaptcha.internal.zzol.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
        L84:
            int r1 = r1 + 3
            goto L1d
        L87:
            com.google.android.recaptcha.internal.zzpl r0 = r7.zzm
            r0.zzi(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L95
            com.google.android.recaptcha.internal.zzmp r0 = r7.zzn
            r0.zza(r8)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzf(java.lang.Object):void");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzu = zzu(i);
            int i2 = 1048575 & iZzu;
            int[] iArr = this.zzc;
            int iZzt = zzt(iZzu);
            int i3 = iArr[i];
            long j = i2;
            switch (iZzt) {
                case 0:
                    if (zzN(obj2, i)) {
                        zzps.zzo(obj, j, zzps.zza(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i)) {
                        zzps.zzp(obj, j, zzps.zzb(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i)) {
                        zzps.zzm(obj, j, zzps.zzw(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i)) {
                        zzps.zzs(obj, j, zzps.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i);
                    break;
                case 10:
                    if (zzN(obj2, i)) {
                        zzps.zzs(obj, j, zzps.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i);
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
                    zznk zznkVarZzd = (zznk) zzps.zzf(obj, j);
                    zznk zznkVar = (zznk) zzps.zzf(obj2, j);
                    int size = zznkVarZzd.size();
                    int size2 = zznkVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zznkVarZzd.zzc()) {
                            zznkVarZzd = zznkVarZzd.zzd(size2 + size);
                        }
                        zznkVarZzd.addAll(zznkVar);
                    }
                    if (size > 0) {
                        zznkVar = zznkVarZzd;
                    }
                    zzps.zzs(obj, j, zznkVar);
                    break;
                case 50:
                    int i4 = zzoy.zza;
                    zzps.zzs(obj, j, zzod.zzb(zzps.zzf(obj, j), zzps.zzf(obj2, j)));
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
                    if (zzR(obj2, i3, i)) {
                        zzps.zzs(obj, j, zzps.zzf(obj2, j));
                        zzI(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzF(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i3, i)) {
                        zzps.zzs(obj, j, zzps.zzf(obj2, j));
                        zzI(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzF(obj, obj2, i);
                    break;
            }
        }
        zzoy.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzoy.zzp(this.zzn, obj, obj2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bd, code lost:
    
        r2 = r3;
        r5 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:245:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0750 A[LOOP:3: B:251:0x074c->B:253:0x0750, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x071d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x072b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:370:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:371:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016f A[Catch: all -> 0x0054, TryCatch #11 {all -> 0x0054, blocks: (B:20:0x004b, B:24:0x005c, B:26:0x0064, B:27:0x0068, B:60:0x015e, B:68:0x0189, B:65:0x016f, B:67:0x0177, B:29:0x006e, B:30:0x0078, B:31:0x0082, B:32:0x008c, B:33:0x0096, B:34:0x009d, B:35:0x009e, B:36:0x00a8, B:37:0x00ae, B:39:0x00b8, B:41:0x00cd, B:42:0x00da, B:43:0x00df, B:44:0x00e0, B:46:0x00ea, B:48:0x00ff, B:49:0x010c, B:50:0x0111, B:51:0x0112, B:52:0x0117, B:53:0x0120, B:54:0x0129, B:55:0x0132, B:56:0x013b, B:57:0x0144, B:58:0x014d, B:59:0x0156, B:71:0x0192, B:72:0x0195, B:74:0x0198), top: B:269:0x004b }] */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(java.lang.Object r13, com.google.android.recaptcha.internal.zzov r14, com.google.android.recaptcha.internal.zzmo r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2074
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzh(java.lang.Object, com.google.android.recaptcha.internal.zzov, com.google.android.recaptcha.internal.zzmo):void");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzkt zzktVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzktVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj(java.lang.Object r21, com.google.android.recaptcha.internal.zzpy r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzj(java.lang.Object, com.google.android.recaptcha.internal.zzpy):void");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzk(Object obj, Object obj2) {
        boolean zZzF;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzu = zzu(i);
            long j = iZzu & 1048575;
            switch (zzt(iZzu)) {
                case 0:
                    if (!zzL(obj, obj2, i) || Double.doubleToLongBits(zzps.zza(obj, j)) != Double.doubleToLongBits(zzps.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i) || Float.floatToIntBits(zzps.zzb(obj, j)) != Float.floatToIntBits(zzps.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i) || zzps.zzd(obj, j) != zzps.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i) || zzps.zzd(obj, j) != zzps.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i) || zzps.zzc(obj, j) != zzps.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i) || zzps.zzd(obj, j) != zzps.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i) || zzps.zzc(obj, j) != zzps.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i) || zzps.zzw(obj, j) != zzps.zzw(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i) || !zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i) || !zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i) || !zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i) || zzps.zzc(obj, j) != zzps.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i) || zzps.zzc(obj, j) != zzps.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i) || zzps.zzc(obj, j) != zzps.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i) || zzps.zzd(obj, j) != zzps.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i) || zzps.zzc(obj, j) != zzps.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i) || zzps.zzd(obj, j) != zzps.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i) || !zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
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
                    zZzF = zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j));
                    break;
                case 50:
                    zZzF = zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j));
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
                    long jZzr = zzr(i) & 1048575;
                    if (zzps.zzc(obj, jZzr) != zzps.zzc(obj2, jZzr) || !zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzF) {
                return false;
            }
        }
        if (!((zznd) obj).zzc.equals(((zznd) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzna) obj).zzb.equals(((zzna) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzl(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzl(java.lang.Object):boolean");
    }
}
