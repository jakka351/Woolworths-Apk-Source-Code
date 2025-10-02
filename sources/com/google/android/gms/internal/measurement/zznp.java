package com.google.android.gms.internal.measurement;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zznp<T> implements zznx<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzop.zzq();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zznm zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzoi zzl;
    private final zzls zzm;

    private zznp(int[] iArr, Object[] objArr, int i, int i2, zznm zznmVar, boolean z, int[] iArr2, int i3, int i4, zznr zznrVar, zzmy zzmyVar, zzoi zzoiVar, zzls zzlsVar, zznh zznhVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        boolean z2 = false;
        if (zzlsVar != null && (zznmVar instanceof zzmc)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzi = iArr2;
        this.zzj = i3;
        this.zzk = i4;
        this.zzl = zzoiVar;
        this.zzm = zzlsVar;
        this.zzg = zznmVar;
    }

    private static boolean zzA(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzmf) {
            return ((zzmf) obj).zzcf();
        }
        return true;
    }

    private static void zzB(Object obj) {
        if (!zzA(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static double zzC(Object obj, long j) {
        return ((Double) zzop.zzn(obj, j)).doubleValue();
    }

    private static float zzD(Object obj, long j) {
        return ((Float) zzop.zzn(obj, j)).floatValue();
    }

    private static int zzE(Object obj, long j) {
        return ((Integer) zzop.zzn(obj, j)).intValue();
    }

    private static long zzF(Object obj, long j) {
        return ((Long) zzop.zzn(obj, j)).longValue();
    }

    private static boolean zzG(Object obj, long j) {
        return ((Boolean) zzop.zzn(obj, j)).booleanValue();
    }

    private final boolean zzH(Object obj, Object obj2, int i) {
        return zzJ(obj, i) == zzJ(obj2, i);
    }

    private final boolean zzI(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzJ(obj, i) : (i3 & i4) != 0;
    }

    private final boolean zzJ(Object obj, int i) {
        int iZzy = zzy(i);
        long j = iZzy & 1048575;
        if (j != 1048575) {
            return (zzop.zzd(obj, j) & (1 << (iZzy >>> 20))) != 0;
        }
        int iZzx = zzx(i);
        long j2 = iZzx & 1048575;
        switch (zzz(iZzx)) {
            case 0:
                return Double.doubleToRawLongBits(zzop.zzl(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzop.zzj(obj, j2)) != 0;
            case 2:
                return zzop.zzf(obj, j2) != 0;
            case 3:
                return zzop.zzf(obj, j2) != 0;
            case 4:
                return zzop.zzd(obj, j2) != 0;
            case 5:
                return zzop.zzf(obj, j2) != 0;
            case 6:
                return zzop.zzd(obj, j2) != 0;
            case 7:
                return zzop.zzh(obj, j2);
            case 8:
                Object objZzn = zzop.zzn(obj, j2);
                if (objZzn instanceof String) {
                    return !((String) objZzn).isEmpty();
                }
                if (objZzn instanceof zzlh) {
                    return !zzlh.zzb.equals(objZzn);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzop.zzn(obj, j2) != null;
            case 10:
                return !zzlh.zzb.equals(zzop.zzn(obj, j2));
            case 11:
                return zzop.zzd(obj, j2) != 0;
            case 12:
                return zzop.zzd(obj, j2) != 0;
            case 13:
                return zzop.zzd(obj, j2) != 0;
            case 14:
                return zzop.zzf(obj, j2) != 0;
            case 15:
                return zzop.zzd(obj, j2) != 0;
            case 16:
                return zzop.zzf(obj, j2) != 0;
            case 17:
                return zzop.zzn(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzK(Object obj, int i) {
        int iZzy = zzy(i);
        long j = 1048575 & iZzy;
        if (j == 1048575) {
            return;
        }
        zzop.zze(obj, j, (1 << (iZzy >>> 20)) | zzop.zzd(obj, j));
    }

    private final boolean zzL(Object obj, int i, int i2) {
        return zzop.zzd(obj, (long) (zzy(i2) & 1048575)) == i;
    }

    private final void zzM(Object obj, int i, int i2) {
        zzop.zze(obj, zzy(i2) & 1048575, i);
    }

    private final int zzN(int i, int i2) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
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

    private static final int zzO(byte[] bArr, int i, int i2, zzot zzotVar, Class cls, zzkw zzkwVar) throws IOException {
        zzot zzotVar2 = zzot.zza;
        switch (zzotVar.ordinal()) {
            case 0:
                int i3 = i + 8;
                zzkwVar.zzc = Double.valueOf(Double.longBitsToDouble(zzkx.zze(bArr, i)));
                return i3;
            case 1:
                int i4 = i + 4;
                zzkwVar.zzc = Float.valueOf(Float.intBitsToFloat(zzkx.zzd(bArr, i)));
                return i4;
            case 2:
            case 3:
                int iZzc = zzkx.zzc(bArr, i, zzkwVar);
                zzkwVar.zzc = Long.valueOf(zzkwVar.zzb);
                return iZzc;
            case 4:
            case 12:
            case 13:
                int iZza = zzkx.zza(bArr, i, zzkwVar);
                zzkwVar.zzc = Integer.valueOf(zzkwVar.zza);
                return iZza;
            case 5:
            case 15:
                int i5 = i + 8;
                zzkwVar.zzc = Long.valueOf(zzkx.zze(bArr, i));
                return i5;
            case 6:
            case 14:
                int i6 = i + 4;
                zzkwVar.zzc = Integer.valueOf(zzkx.zzd(bArr, i));
                return i6;
            case 7:
                int iZzc2 = zzkx.zzc(bArr, i, zzkwVar);
                zzkwVar.zzc = Boolean.valueOf(zzkwVar.zzb != 0);
                return iZzc2;
            case 8:
                return zzkx.zzf(bArr, i, zzkwVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return zzkx.zzh(zznu.zza().zzb(cls), bArr, i, i2, zzkwVar);
            case 11:
                return zzkx.zzg(bArr, i, zzkwVar);
            case 16:
                int iZza2 = zzkx.zza(bArr, i, zzkwVar);
                zzkwVar.zzc = Integer.valueOf(zzlj.zzb(zzkwVar.zza));
                return iZza2;
            case 17:
                int iZzc3 = zzkx.zzc(bArr, i, zzkwVar);
                zzkwVar.zzc = Long.valueOf(zzlj.zzc(zzkwVar.zzb));
                return iZzc3;
        }
    }

    private static final void zzP(int i, Object obj, zzov zzovVar) throws IOException {
        if (obj instanceof String) {
            zzovVar.zzm(i, (String) obj);
        } else {
            zzovVar.zzn(i, (zzlh) obj);
        }
    }

    public static zzoj zzg(Object obj) {
        zzmf zzmfVar = (zzmf) obj;
        zzoj zzojVar = zzmfVar.zzc;
        if (zzojVar != zzoj.zza()) {
            return zzojVar;
        }
        zzoj zzojVarZzb = zzoj.zzb();
        zzmfVar.zzc = zzojVarZzb;
        return zzojVarZzb;
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.measurement.zznp zzl(java.lang.Class r34, com.google.android.gms.internal.measurement.zznj r35, com.google.android.gms.internal.measurement.zznr r36, com.google.android.gms.internal.measurement.zzmy r37, com.google.android.gms.internal.measurement.zzoi r38, com.google.android.gms.internal.measurement.zzls r39, com.google.android.gms.internal.measurement.zznh r40) {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznp.zzl(java.lang.Class, com.google.android.gms.internal.measurement.zznj, com.google.android.gms.internal.measurement.zznr, com.google.android.gms.internal.measurement.zzmy, com.google.android.gms.internal.measurement.zzoi, com.google.android.gms.internal.measurement.zzls, com.google.android.gms.internal.measurement.zznh):com.google.android.gms.internal.measurement.zznp");
    }

    private static Field zzm(Class cls, String str) {
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
            StringBuilder sb = new StringBuilder(c.f(11, str) + name.length() + 29 + String.valueOf(string).length());
            a.B(sb, "Field ", str, " for ", name);
            throw new RuntimeException(YU.a.o(sb, " not found. Known fields are ", string), e);
        }
    }

    private final void zzn(Object obj, Object obj2, int i) {
        if (zzJ(obj2, i)) {
            int iZzx = zzx(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzx;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i2 = this.zzc[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(c.a(i2, 38) + string.length());
                sb.append("Source subfield ");
                sb.append(i2);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            zznx zznxVarZzp = zzp(i);
            if (!zzJ(obj, i)) {
                if (zzA(object)) {
                    Object objZza = zznxVarZzp.zza();
                    zznxVarZzp.zzd(objZza, object);
                    unsafe.putObject(obj, j, objZza);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzK(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzA(object2)) {
                Object objZza2 = zznxVarZzp.zza();
                zznxVarZzp.zzd(objZza2, object2);
                unsafe.putObject(obj, j, objZza2);
                object2 = objZza2;
            }
            zznxVarZzp.zzd(object2, object);
        }
    }

    private final void zzo(Object obj, Object obj2, int i) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzL(obj2, i2, i)) {
            int iZzx = zzx(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzx;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i3 = iArr[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(c.a(i3, 38) + string.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            zznx zznxVarZzp = zzp(i);
            if (!zzL(obj, i2, i)) {
                if (zzA(object)) {
                    Object objZza = zznxVarZzp.zza();
                    zznxVarZzp.zzd(objZza, object);
                    unsafe.putObject(obj, j, objZza);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzM(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzA(object2)) {
                Object objZza2 = zznxVarZzp.zza();
                zznxVarZzp.zzd(objZza2, object2);
                unsafe.putObject(obj, j, objZza2);
                object2 = objZza2;
            }
            zznxVarZzp.zzd(object2, object);
        }
    }

    private final zznx zzp(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zznx zznxVar = (zznx) objArr[i3];
        if (zznxVar != null) {
            return zznxVar;
        }
        zznx zznxVarZzb = zznu.zza().zzb((Class) objArr[i3 + 1]);
        objArr[i3] = zznxVarZzb;
        return zznxVarZzb;
    }

    private final Object zzq(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final zzmk zzr(int i) {
        int i2 = i / 3;
        return (zzmk) this.zzd[i2 + i2 + 1];
    }

    private final Object zzs(Object obj, int i) {
        zznx zznxVarZzp = zzp(i);
        int iZzx = zzx(i) & 1048575;
        if (!zzJ(obj, i)) {
            return zznxVarZzp.zza();
        }
        Object object = zzb.getObject(obj, iZzx);
        if (zzA(object)) {
            return object;
        }
        Object objZza = zznxVarZzp.zza();
        if (object != null) {
            zznxVarZzp.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzt(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzx(i) & 1048575, obj2);
        zzK(obj, i);
    }

    private final Object zzu(Object obj, int i, int i2) {
        zznx zznxVarZzp = zzp(i2);
        if (!zzL(obj, i, i2)) {
            return zznxVarZzp.zza();
        }
        Object object = zzb.getObject(obj, zzx(i2) & 1048575);
        if (zzA(object)) {
            return object;
        }
        Object objZza = zznxVarZzp.zza();
        if (object != null) {
            zznxVarZzp.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzv(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzx(i2) & 1048575, obj2);
        zzM(obj, i, i2);
    }

    private static boolean zzw(Object obj, int i, zznx zznxVar) {
        return zznxVar.zzk(zzop.zzn(obj, i & 1048575));
    }

    private final int zzx(int i) {
        return this.zzc[i + 1];
    }

    private final int zzy(int i) {
        return this.zzc[i + 2];
    }

    private static int zzz(int i) {
        return (i >>> 20) & 255;
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final Object zza() {
        return ((zzmf) this.zzg).zzch();
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final boolean zzb(Object obj, Object obj2) {
        boolean zZzB;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzx = zzx(i);
            long j = iZzx & 1048575;
            switch (zzz(iZzx)) {
                case 0:
                    if (!zzH(obj, obj2, i) || Double.doubleToLongBits(zzop.zzl(obj, j)) != Double.doubleToLongBits(zzop.zzl(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzH(obj, obj2, i) || Float.floatToIntBits(zzop.zzj(obj, j)) != Float.floatToIntBits(zzop.zzj(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzH(obj, obj2, i) || zzop.zzf(obj, j) != zzop.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzH(obj, obj2, i) || zzop.zzf(obj, j) != zzop.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzH(obj, obj2, i) || zzop.zzd(obj, j) != zzop.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzH(obj, obj2, i) || zzop.zzf(obj, j) != zzop.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzH(obj, obj2, i) || zzop.zzd(obj, j) != zzop.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzH(obj, obj2, i) || zzop.zzh(obj, j) != zzop.zzh(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzH(obj, obj2, i) || !zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzH(obj, obj2, i) || !zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzH(obj, obj2, i) || !zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzH(obj, obj2, i) || zzop.zzd(obj, j) != zzop.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzH(obj, obj2, i) || zzop.zzd(obj, j) != zzop.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzH(obj, obj2, i) || zzop.zzd(obj, j) != zzop.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzH(obj, obj2, i) || zzop.zzf(obj, j) != zzop.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzH(obj, obj2, i) || zzop.zzd(obj, j) != zzop.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzH(obj, obj2, i) || zzop.zzf(obj, j) != zzop.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzH(obj, obj2, i) || !zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
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
                    zZzB = zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j));
                    break;
                case 50:
                    zZzB = zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j));
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
                    long jZzy = zzy(i) & 1048575;
                    if (zzop.zzd(obj, jZzy) != zzop.zzd(obj2, jZzy) || !zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzB) {
                return false;
            }
        }
        if (!((zzmf) obj).zzc.equals(((zzmf) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzmc) obj).zzb.equals(((zzmc) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final int zzc(Object obj) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int iZzd;
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i4 >= iArr.length) {
                int iHashCode = ((zzmf) obj).zzc.hashCode() + (i5 * 53);
                return this.zzh ? (iHashCode * 53) + ((zzmc) obj).zzb.zza.hashCode() : iHashCode;
            }
            int iZzx = zzx(i4);
            int i6 = 1048575 & iZzx;
            int iZzz = zzz(iZzx);
            int i7 = iArr[i4];
            long j = i6;
            int iHashCode2 = 37;
            switch (iZzz) {
                case 0:
                    i = i5 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzop.zzl(obj, j));
                    byte[] bArr = zzmp.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i5 = i + iZzd;
                    break;
                case 1:
                    i2 = i5 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzop.zzj(obj, j));
                    i5 = iFloatToIntBits + i2;
                    break;
                case 2:
                    i = i5 * 53;
                    jDoubleToLongBits = zzop.zzf(obj, j);
                    byte[] bArr2 = zzmp.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i5 = i + iZzd;
                    break;
                case 3:
                    i = i5 * 53;
                    jDoubleToLongBits = zzop.zzf(obj, j);
                    byte[] bArr3 = zzmp.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i5 = i + iZzd;
                    break;
                case 4:
                    i = i5 * 53;
                    iZzd = zzop.zzd(obj, j);
                    i5 = i + iZzd;
                    break;
                case 5:
                    i = i5 * 53;
                    jDoubleToLongBits = zzop.zzf(obj, j);
                    byte[] bArr4 = zzmp.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i5 = i + iZzd;
                    break;
                case 6:
                    i = i5 * 53;
                    iZzd = zzop.zzd(obj, j);
                    i5 = i + iZzd;
                    break;
                case 7:
                    i2 = i5 * 53;
                    iFloatToIntBits = zzmp.zzb(zzop.zzh(obj, j));
                    i5 = iFloatToIntBits + i2;
                    break;
                case 8:
                    i2 = i5 * 53;
                    iFloatToIntBits = ((String) zzop.zzn(obj, j)).hashCode();
                    i5 = iFloatToIntBits + i2;
                    break;
                case 9:
                    i3 = i5 * 53;
                    Object objZzn = zzop.zzn(obj, j);
                    if (objZzn != null) {
                        iHashCode2 = objZzn.hashCode();
                    }
                    i5 = i3 + iHashCode2;
                    break;
                case 10:
                    i2 = i5 * 53;
                    iFloatToIntBits = zzop.zzn(obj, j).hashCode();
                    i5 = iFloatToIntBits + i2;
                    break;
                case 11:
                    i = i5 * 53;
                    iZzd = zzop.zzd(obj, j);
                    i5 = i + iZzd;
                    break;
                case 12:
                    i = i5 * 53;
                    iZzd = zzop.zzd(obj, j);
                    i5 = i + iZzd;
                    break;
                case 13:
                    i = i5 * 53;
                    iZzd = zzop.zzd(obj, j);
                    i5 = i + iZzd;
                    break;
                case 14:
                    i = i5 * 53;
                    jDoubleToLongBits = zzop.zzf(obj, j);
                    byte[] bArr5 = zzmp.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i5 = i + iZzd;
                    break;
                case 15:
                    i = i5 * 53;
                    iZzd = zzop.zzd(obj, j);
                    i5 = i + iZzd;
                    break;
                case 16:
                    i = i5 * 53;
                    jDoubleToLongBits = zzop.zzf(obj, j);
                    byte[] bArr6 = zzmp.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i5 = i + iZzd;
                    break;
                case 17:
                    i3 = i5 * 53;
                    Object objZzn2 = zzop.zzn(obj, j);
                    if (objZzn2 != null) {
                        iHashCode2 = objZzn2.hashCode();
                    }
                    i5 = i3 + iHashCode2;
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
                    i2 = i5 * 53;
                    iFloatToIntBits = zzop.zzn(obj, j).hashCode();
                    i5 = iFloatToIntBits + i2;
                    break;
                case 50:
                    i2 = i5 * 53;
                    iFloatToIntBits = zzop.zzn(obj, j).hashCode();
                    i5 = iFloatToIntBits + i2;
                    break;
                case 51:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzC(obj, j));
                        byte[] bArr7 = zzmp.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i5 = i + iZzd;
                        break;
                    }
                case 52:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzD(obj, j));
                        i5 = iFloatToIntBits + i2;
                        break;
                    }
                case 53:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        jDoubleToLongBits = zzF(obj, j);
                        byte[] bArr8 = zzmp.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i5 = i + iZzd;
                        break;
                    }
                case 54:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        jDoubleToLongBits = zzF(obj, j);
                        byte[] bArr9 = zzmp.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i5 = i + iZzd;
                        break;
                    }
                case 55:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        iZzd = zzE(obj, j);
                        i5 = i + iZzd;
                        break;
                    }
                case 56:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        jDoubleToLongBits = zzF(obj, j);
                        byte[] bArr10 = zzmp.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i5 = i + iZzd;
                        break;
                    }
                case 57:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        iZzd = zzE(obj, j);
                        i5 = i + iZzd;
                        break;
                    }
                case 58:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        iFloatToIntBits = zzmp.zzb(zzG(obj, j));
                        i5 = iFloatToIntBits + i2;
                        break;
                    }
                case 59:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        iFloatToIntBits = ((String) zzop.zzn(obj, j)).hashCode();
                        i5 = iFloatToIntBits + i2;
                        break;
                    }
                case 60:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        iFloatToIntBits = zzop.zzn(obj, j).hashCode();
                        i5 = iFloatToIntBits + i2;
                        break;
                    }
                case 61:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        iFloatToIntBits = zzop.zzn(obj, j).hashCode();
                        i5 = iFloatToIntBits + i2;
                        break;
                    }
                case 62:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        iZzd = zzE(obj, j);
                        i5 = i + iZzd;
                        break;
                    }
                case 63:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        iZzd = zzE(obj, j);
                        i5 = i + iZzd;
                        break;
                    }
                case 64:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        iZzd = zzE(obj, j);
                        i5 = i + iZzd;
                        break;
                    }
                case 65:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        jDoubleToLongBits = zzF(obj, j);
                        byte[] bArr11 = zzmp.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i5 = i + iZzd;
                        break;
                    }
                case 66:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        iZzd = zzE(obj, j);
                        i5 = i + iZzd;
                        break;
                    }
                case 67:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        jDoubleToLongBits = zzF(obj, j);
                        byte[] bArr12 = zzmp.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i5 = i + iZzd;
                        break;
                    }
                case 68:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        iFloatToIntBits = zzop.zzn(obj, j).hashCode();
                        i5 = iFloatToIntBits + i2;
                        break;
                    }
            }
            i4 += 3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzd(Object obj, Object obj2) {
        zzB(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                zznz.zzD(this.zzl, obj, obj2);
                if (this.zzh) {
                    zznz.zzC(this.zzm, obj, obj2);
                    return;
                }
                return;
            }
            int iZzx = zzx(i);
            int i2 = 1048575 & iZzx;
            int iZzz = zzz(iZzx);
            int i3 = iArr[i];
            long j = i2;
            switch (iZzz) {
                case 0:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzm(obj, j, zzop.zzl(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 1:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzk(obj, j, zzop.zzj(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 2:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzg(obj, j, zzop.zzf(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 3:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzg(obj, j, zzop.zzf(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 4:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zze(obj, j, zzop.zzd(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 5:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzg(obj, j, zzop.zzf(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 6:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zze(obj, j, zzop.zzd(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 7:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzi(obj, j, zzop.zzh(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 8:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzo(obj, j, zzop.zzn(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 9:
                    zzn(obj, obj2, i);
                    break;
                case 10:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzo(obj, j, zzop.zzn(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 11:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zze(obj, j, zzop.zzd(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 12:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zze(obj, j, zzop.zzd(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 13:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zze(obj, j, zzop.zzd(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 14:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzg(obj, j, zzop.zzf(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 15:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zze(obj, j, zzop.zzd(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 16:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzg(obj, j, zzop.zzf(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 17:
                    zzn(obj, obj2, i);
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
                    zzmo zzmoVarZzg = (zzmo) zzop.zzn(obj, j);
                    zzmo zzmoVar = (zzmo) zzop.zzn(obj2, j);
                    int size = zzmoVarZzg.size();
                    int size2 = zzmoVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzmoVarZzg.zza()) {
                            zzmoVarZzg = zzmoVarZzg.zzg(size2 + size);
                        }
                        zzmoVarZzg.addAll(zzmoVar);
                    }
                    if (size > 0) {
                        zzmoVar = zzmoVarZzg;
                    }
                    zzop.zzo(obj, j, zzmoVar);
                    break;
                case 50:
                    int i4 = zznz.zza;
                    zzop.zzo(obj, j, zznh.zza(zzop.zzn(obj, j), zzop.zzn(obj2, j)));
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
                    if (!zzL(obj2, i3, i)) {
                        break;
                    } else {
                        zzop.zzo(obj, j, zzop.zzn(obj2, j));
                        zzM(obj, i3, i);
                        break;
                    }
                case 60:
                    zzo(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzL(obj2, i3, i)) {
                        break;
                    } else {
                        zzop.zzo(obj, j, zzop.zzn(obj2, j));
                        zzM(obj, i3, i);
                        break;
                    }
                case 68:
                    zzo(obj, obj2, i);
                    break;
            }
            i += 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:196:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e5  */
    @Override // com.google.android.gms.internal.measurement.zznx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zze(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 2028
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznp.zze(java.lang.Object):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.measurement.zznx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.Object r19, com.google.android.gms.internal.measurement.zzov r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznp.zzf(java.lang.Object, com.google.android.gms.internal.measurement.zzov):void");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int zzh(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, com.google.android.gms.internal.measurement.zzkw r40) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 4164
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznp.zzh(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzkw):int");
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzkw zzkwVar) throws IOException {
        zzh(obj, bArr, i, i2, 0, zzkwVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    @Override // com.google.android.gms.internal.measurement.zznx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = zzA(r8)
            if (r0 != 0) goto L8
            goto L93
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.measurement.zzmf
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            com.google.android.gms.internal.measurement.zzmf r0 = (com.google.android.gms.internal.measurement.zzmf) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzcm(r2)
            r0.zza = r1
            r0.zzcg()
        L1b:
            int[] r0 = r7.zzc
        L1d:
            int r2 = r0.length
            if (r1 >= r2) goto L85
            int r2 = r7.zzx(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = zzz(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L6f
            r5 = 60
            if (r2 == r5) goto L59
            r5 = 68
            if (r2 == r5) goto L59
            switch(r2) {
                case 17: goto L6f;
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
            goto L82
        L3d:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.measurement.zznp.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L82
            r6 = r5
            com.google.android.gms.internal.measurement.zzng r6 = (com.google.android.gms.internal.measurement.zzng) r6
            r6.zzd()
            r2.putObject(r8, r3, r5)
            goto L82
        L4f:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.zzop.zzn(r8, r3)
            com.google.android.gms.internal.measurement.zzmo r2 = (com.google.android.gms.internal.measurement.zzmo) r2
            r2.zzb()
            goto L82
        L59:
            r2 = r0[r1]
            boolean r2 = r7.zzL(r8, r2, r1)
            if (r2 == 0) goto L82
            com.google.android.gms.internal.measurement.zznx r2 = r7.zzp(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.measurement.zznp.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzj(r3)
            goto L82
        L6f:
            boolean r2 = r7.zzJ(r8, r1)
            if (r2 == 0) goto L82
            com.google.android.gms.internal.measurement.zznx r2 = r7.zzp(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.measurement.zznp.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzj(r3)
        L82:
            int r1 = r1 + 3
            goto L1d
        L85:
            com.google.android.gms.internal.measurement.zzoi r0 = r7.zzl
            r0.zzb(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L93
            com.google.android.gms.internal.measurement.zzls r0 = r7.zzm
            r0.zza(r8)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznp.zzj(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00c1  */
    @Override // com.google.android.gms.internal.measurement.zznx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzk(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznp.zzk(java.lang.Object):boolean");
    }
}
