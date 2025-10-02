package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes5.dex */
final class zzhjv<T> implements zzhkk<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhlc.zzt();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzhjs zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzhkv zzm;
    private final zzhhs zzn;

    private zzhjv(int[] iArr, Object[] objArr, int i, int i2, zzhjs zzhjsVar, boolean z, int[] iArr2, int i3, int i4, zzhjy zzhjyVar, zzhje zzhjeVar, zzhkv zzhkvVar, zzhhs zzhhsVar, zzhjn zzhjnVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzhjsVar instanceof zzhih;
        boolean z2 = false;
        if (zzhhsVar != null && (zzhjsVar instanceof zzhid)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzm = zzhkvVar;
        this.zzn = zzhhsVar;
        this.zzg = zzhjsVar;
    }

    private final int zzA(int i) {
        return this.zzc[i + 1];
    }

    private final int zzB(int i) {
        return this.zzc[i + 2];
    }

    private static int zzC(int i) {
        return (i >>> 20) & 255;
    }

    private static boolean zzD(int i) {
        return (i & 536870912) != 0;
    }

    private static boolean zzE(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzhih) {
            return ((zzhih) obj).zzaX();
        }
        return true;
    }

    private static void zzF(Object obj) {
        if (!zzE(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static double zzG(Object obj, long j) {
        return ((Double) zzhlc.zzn(obj, j)).doubleValue();
    }

    private static float zzH(Object obj, long j) {
        return ((Float) zzhlc.zzn(obj, j)).floatValue();
    }

    private static int zzI(Object obj, long j) {
        return ((Integer) zzhlc.zzn(obj, j)).intValue();
    }

    private static long zzJ(Object obj, long j) {
        return ((Long) zzhlc.zzn(obj, j)).longValue();
    }

    private static boolean zzK(Object obj, long j) {
        return ((Boolean) zzhlc.zzn(obj, j)).booleanValue();
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        return zzN(obj, i) == zzN(obj2, i);
    }

    private final boolean zzM(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzN(obj, i) : (i3 & i4) != 0;
    }

    private final boolean zzN(Object obj, int i) {
        int iZzB = zzB(i);
        long j = iZzB & 1048575;
        if (j != 1048575) {
            return (zzhlc.zzd(obj, j) & (1 << (iZzB >>> 20))) != 0;
        }
        int iZzA = zzA(i);
        long j2 = iZzA & 1048575;
        switch (zzC(iZzA)) {
            case 0:
                return Double.doubleToRawLongBits(zzhlc.zzl(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhlc.zzj(obj, j2)) != 0;
            case 2:
                return zzhlc.zzf(obj, j2) != 0;
            case 3:
                return zzhlc.zzf(obj, j2) != 0;
            case 4:
                return zzhlc.zzd(obj, j2) != 0;
            case 5:
                return zzhlc.zzf(obj, j2) != 0;
            case 6:
                return zzhlc.zzd(obj, j2) != 0;
            case 7:
                return zzhlc.zzh(obj, j2);
            case 8:
                Object objZzn = zzhlc.zzn(obj, j2);
                if (objZzn instanceof String) {
                    return !((String) objZzn).isEmpty();
                }
                if (objZzn instanceof zzhhb) {
                    return !zzhhb.zzb.equals(objZzn);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhlc.zzn(obj, j2) != null;
            case 10:
                return !zzhhb.zzb.equals(zzhlc.zzn(obj, j2));
            case 11:
                return zzhlc.zzd(obj, j2) != 0;
            case 12:
                return zzhlc.zzd(obj, j2) != 0;
            case 13:
                return zzhlc.zzd(obj, j2) != 0;
            case 14:
                return zzhlc.zzf(obj, j2) != 0;
            case 15:
                return zzhlc.zzd(obj, j2) != 0;
            case 16:
                return zzhlc.zzf(obj, j2) != 0;
            case 17:
                return zzhlc.zzn(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzO(Object obj, int i) {
        int iZzB = zzB(i);
        long j = 1048575 & iZzB;
        if (j == 1048575) {
            return;
        }
        zzhlc.zze(obj, j, (1 << (iZzB >>> 20)) | zzhlc.zzd(obj, j));
    }

    private final boolean zzP(Object obj, int i, int i2) {
        return zzhlc.zzd(obj, (long) (zzB(i2) & 1048575)) == i;
    }

    private final void zzQ(Object obj, int i, int i2) {
        zzhlc.zze(obj, zzB(i2) & 1048575, i);
    }

    private final int zzR(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzS(i, 0);
    }

    private final int zzS(int i, int i2) {
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

    private static final int zzT(byte[] bArr, int i, int i2, zzhli zzhliVar, Class cls, zzhgp zzhgpVar) throws IOException {
        zzhli zzhliVar2 = zzhli.zza;
        switch (zzhliVar.ordinal()) {
            case 0:
                int i3 = i + 8;
                zzhgpVar.zzc = Double.valueOf(Double.longBitsToDouble(zzhgq.zze(bArr, i)));
                return i3;
            case 1:
                int i4 = i + 4;
                zzhgpVar.zzc = Float.valueOf(Float.intBitsToFloat(zzhgq.zzd(bArr, i)));
                return i4;
            case 2:
            case 3:
                int iZzc = zzhgq.zzc(bArr, i, zzhgpVar);
                zzhgpVar.zzc = Long.valueOf(zzhgpVar.zzb);
                return iZzc;
            case 4:
            case 12:
            case 13:
                int iZza = zzhgq.zza(bArr, i, zzhgpVar);
                zzhgpVar.zzc = Integer.valueOf(zzhgpVar.zza);
                return iZza;
            case 5:
            case 15:
                int i5 = i + 8;
                zzhgpVar.zzc = Long.valueOf(zzhgq.zze(bArr, i));
                return i5;
            case 6:
            case 14:
                int i6 = i + 4;
                zzhgpVar.zzc = Integer.valueOf(zzhgq.zzd(bArr, i));
                return i6;
            case 7:
                int iZzc2 = zzhgq.zzc(bArr, i, zzhgpVar);
                zzhgpVar.zzc = Boolean.valueOf(zzhgpVar.zzb != 0);
                return iZzc2;
            case 8:
                return zzhgq.zzf(bArr, i, zzhgpVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return zzhgq.zzh(zzhkc.zza().zzb(cls), bArr, i, i2, zzhgpVar);
            case 11:
                return zzhgq.zzg(bArr, i, zzhgpVar);
            case 16:
                int iZza2 = zzhgq.zza(bArr, i, zzhgpVar);
                zzhgpVar.zzc = Integer.valueOf(zzhhg.zzK(zzhgpVar.zza));
                return iZza2;
            case 17:
                int iZzc3 = zzhgq.zzc(bArr, i, zzhgpVar);
                zzhgpVar.zzc = Long.valueOf(zzhhg.zzL(zzhgpVar.zzb));
                return iZzc3;
        }
    }

    private static final void zzU(int i, Object obj, zzhlk zzhlkVar) throws IOException {
        if (obj instanceof String) {
            zzhlkVar.zzm(i, (String) obj);
        } else {
            zzhlkVar.zzn(i, (zzhhb) obj);
        }
    }

    public static zzhkw zzh(Object obj) {
        zzhih zzhihVar = (zzhih) obj;
        zzhkw zzhkwVar = zzhihVar.zzt;
        if (zzhkwVar != zzhkw.zza()) {
            return zzhkwVar;
        }
        zzhkw zzhkwVarZzb = zzhkw.zzb();
        zzhihVar.zzt = zzhkwVarZzb;
        return zzhkwVarZzb;
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzhjv zzm(java.lang.Class r34, com.google.android.gms.internal.ads.zzhjp r35, com.google.android.gms.internal.ads.zzhjy r36, com.google.android.gms.internal.ads.zzhje r37, com.google.android.gms.internal.ads.zzhkv r38, com.google.android.gms.internal.ads.zzhhs r39, com.google.android.gms.internal.ads.zzhjn r40) {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhjv.zzm(java.lang.Class, com.google.android.gms.internal.ads.zzhjp, com.google.android.gms.internal.ads.zzhjy, com.google.android.gms.internal.ads.zzhje, com.google.android.gms.internal.ads.zzhkv, com.google.android.gms.internal.ads.zzhhs, com.google.android.gms.internal.ads.zzhjn):com.google.android.gms.internal.ads.zzhjv");
    }

    private static Field zzn(Class cls, String str) {
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
            StringBuilder sb = new StringBuilder(au.com.woolworths.shop.checkout.ui.confirmation.c.f(11, str) + name.length() + 29 + String.valueOf(string).length());
            androidx.constraintlayout.core.state.a.B(sb, "Field ", str, " for ", name);
            throw new RuntimeException(YU.a.o(sb, " not found. Known fields are ", string), e);
        }
    }

    private final void zzo(Object obj, Object obj2, int i) {
        if (zzN(obj2, i)) {
            int iZzA = zzA(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzA;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i2 = this.zzc[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(au.com.woolworths.shop.checkout.ui.confirmation.c.a(i2, 38) + string.length());
                sb.append("Source subfield ");
                sb.append(i2);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            zzhkk zzhkkVarZzq = zzq(i);
            if (!zzN(obj, i)) {
                if (zzE(object)) {
                    Object objZza = zzhkkVarZzq.zza();
                    zzhkkVarZzq.zzd(objZza, object);
                    unsafe.putObject(obj, j, objZza);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzO(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzE(object2)) {
                Object objZza2 = zzhkkVarZzq.zza();
                zzhkkVarZzq.zzd(objZza2, object2);
                unsafe.putObject(obj, j, objZza2);
                object2 = objZza2;
            }
            zzhkkVarZzq.zzd(object2, object);
        }
    }

    private final void zzp(Object obj, Object obj2, int i) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzP(obj2, i2, i)) {
            int iZzA = zzA(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzA;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i3 = iArr[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(au.com.woolworths.shop.checkout.ui.confirmation.c.a(i3, 38) + string.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            zzhkk zzhkkVarZzq = zzq(i);
            if (!zzP(obj, i2, i)) {
                if (zzE(object)) {
                    Object objZza = zzhkkVarZzq.zza();
                    zzhkkVarZzq.zzd(objZza, object);
                    unsafe.putObject(obj, j, objZza);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzQ(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzE(object2)) {
                Object objZza2 = zzhkkVarZzq.zza();
                zzhkkVarZzq.zzd(objZza2, object2);
                unsafe.putObject(obj, j, objZza2);
                object2 = objZza2;
            }
            zzhkkVarZzq.zzd(object2, object);
        }
    }

    private final zzhkk zzq(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzhkk zzhkkVar = (zzhkk) objArr[i3];
        if (zzhkkVar != null) {
            return zzhkkVar;
        }
        zzhkk zzhkkVarZzb = zzhkc.zza().zzb((Class) objArr[i3 + 1]);
        objArr[i3] = zzhkkVarZzb;
        return zzhkkVarZzb;
    }

    private final Object zzr(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final zzhin zzs(int i) {
        int i2 = i / 3;
        return (zzhin) this.zzd[i2 + i2 + 1];
    }

    private final Object zzt(Object obj, int i) {
        zzhkk zzhkkVarZzq = zzq(i);
        int iZzA = zzA(i) & 1048575;
        if (!zzN(obj, i)) {
            return zzhkkVarZzq.zza();
        }
        Object object = zzb.getObject(obj, iZzA);
        if (zzE(object)) {
            return object;
        }
        Object objZza = zzhkkVarZzq.zza();
        if (object != null) {
            zzhkkVarZzq.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzu(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzA(i) & 1048575, obj2);
        zzO(obj, i);
    }

    private final Object zzv(Object obj, int i, int i2) {
        zzhkk zzhkkVarZzq = zzq(i2);
        if (!zzP(obj, i, i2)) {
            return zzhkkVarZzq.zza();
        }
        Object object = zzb.getObject(obj, zzA(i2) & 1048575);
        if (zzE(object)) {
            return object;
        }
        Object objZza = zzhkkVarZzq.zza();
        if (object != null) {
            zzhkkVarZzq.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzw(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzA(i2) & 1048575, obj2);
        zzQ(obj, i, i2);
    }

    private final Object zzx(Object obj, int i, Object obj2, zzhkv zzhkvVar, Object obj3) {
        zzhin zzhinVarZzs;
        int i2 = this.zzc[i];
        Object objZzn = zzhlc.zzn(obj, zzA(i) & 1048575);
        if (objZzn == null || (zzhinVarZzs = zzs(i)) == null) {
            return obj2;
        }
        zzhjk zzhjkVarZze = ((zzhjl) zzr(i)).zze();
        Iterator it = ((zzhjm) objZzn).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zzhinVarZzs.zza(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = zzhkvVar.zzh(obj3);
                }
                int iZzc = zzhjl.zzc(zzhjkVarZze, entry.getKey(), entry.getValue());
                zzhhb zzhhbVar = zzhhb.zzb;
                byte[] bArr = new byte[iZzc];
                int i3 = zzhhm.zzf;
                zzhhj zzhhjVar = new zzhhj(bArr, 0, iZzc);
                try {
                    zzhjl.zzb(zzhhjVar, zzhjkVarZze, entry.getKey(), entry.getValue());
                    zzhkvVar.zzd(obj2, i2, zzhgx.zza(zzhhjVar, bArr));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    private static boolean zzy(Object obj, int i, zzhkk zzhkkVar) {
        return zzhkkVar.zzl(zzhlc.zzn(obj, i & 1048575));
    }

    private final void zzz(Object obj, int i, zzhkf zzhkfVar) throws IOException {
        long j = i & 1048575;
        if (zzD(i)) {
            zzhlc.zzo(obj, j, zzhkfVar.zzn());
        } else if (this.zzi) {
            zzhlc.zzo(obj, j, zzhkfVar.zzm());
        } else {
            zzhlc.zzo(obj, j, zzhkfVar.zzq());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhkk
    public final Object zza() {
        return ((zzhih) this.zzg).zzbg();
    }

    @Override // com.google.android.gms.internal.ads.zzhkk
    public final boolean zzb(Object obj, Object obj2) {
        boolean zZzG;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzA = zzA(i);
            long j = iZzA & 1048575;
            switch (zzC(iZzA)) {
                case 0:
                    if (!zzL(obj, obj2, i) || Double.doubleToLongBits(zzhlc.zzl(obj, j)) != Double.doubleToLongBits(zzhlc.zzl(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i) || Float.floatToIntBits(zzhlc.zzj(obj, j)) != Float.floatToIntBits(zzhlc.zzj(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i) || zzhlc.zzf(obj, j) != zzhlc.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i) || zzhlc.zzf(obj, j) != zzhlc.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i) || zzhlc.zzd(obj, j) != zzhlc.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i) || zzhlc.zzf(obj, j) != zzhlc.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i) || zzhlc.zzd(obj, j) != zzhlc.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i) || zzhlc.zzh(obj, j) != zzhlc.zzh(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i) || !zzhkm.zzG(zzhlc.zzn(obj, j), zzhlc.zzn(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i) || !zzhkm.zzG(zzhlc.zzn(obj, j), zzhlc.zzn(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i) || !zzhkm.zzG(zzhlc.zzn(obj, j), zzhlc.zzn(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i) || zzhlc.zzd(obj, j) != zzhlc.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i) || zzhlc.zzd(obj, j) != zzhlc.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i) || zzhlc.zzd(obj, j) != zzhlc.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i) || zzhlc.zzf(obj, j) != zzhlc.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i) || zzhlc.zzd(obj, j) != zzhlc.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i) || zzhlc.zzf(obj, j) != zzhlc.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i) || !zzhkm.zzG(zzhlc.zzn(obj, j), zzhlc.zzn(obj2, j))) {
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
                    zZzG = zzhkm.zzG(zzhlc.zzn(obj, j), zzhlc.zzn(obj2, j));
                    break;
                case 50:
                    zZzG = zzhkm.zzG(zzhlc.zzn(obj, j), zzhlc.zzn(obj2, j));
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
                    long jZzB = zzB(i) & 1048575;
                    if (zzhlc.zzd(obj, jZzB) != zzhlc.zzd(obj2, jZzB) || !zzhkm.zzG(zzhlc.zzn(obj, j), zzhlc.zzn(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzG) {
                return false;
            }
        }
        if (!((zzhih) obj).zzt.equals(((zzhih) obj2).zzt)) {
            return false;
        }
        if (this.zzh) {
            return ((zzhid) obj).zza.equals(((zzhid) obj2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhkk
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
                int iHashCode = ((zzhih) obj).zzt.hashCode() + (i5 * 53);
                return this.zzh ? (iHashCode * 53) + ((zzhid) obj).zza.zza.hashCode() : iHashCode;
            }
            int iZzA = zzA(i4);
            int i6 = 1048575 & iZzA;
            int iZzC = zzC(iZzA);
            int i7 = iArr[i4];
            long j = i6;
            int iHashCode2 = 37;
            switch (iZzC) {
                case 0:
                    i = i5 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzhlc.zzl(obj, j));
                    byte[] bArr = zzhiu.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i5 = i + iZzd;
                    break;
                case 1:
                    i2 = i5 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzhlc.zzj(obj, j));
                    i5 = iFloatToIntBits + i2;
                    break;
                case 2:
                    i = i5 * 53;
                    jDoubleToLongBits = zzhlc.zzf(obj, j);
                    byte[] bArr2 = zzhiu.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i5 = i + iZzd;
                    break;
                case 3:
                    i = i5 * 53;
                    jDoubleToLongBits = zzhlc.zzf(obj, j);
                    byte[] bArr3 = zzhiu.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i5 = i + iZzd;
                    break;
                case 4:
                    i = i5 * 53;
                    iZzd = zzhlc.zzd(obj, j);
                    i5 = i + iZzd;
                    break;
                case 5:
                    i = i5 * 53;
                    jDoubleToLongBits = zzhlc.zzf(obj, j);
                    byte[] bArr4 = zzhiu.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i5 = i + iZzd;
                    break;
                case 6:
                    i = i5 * 53;
                    iZzd = zzhlc.zzd(obj, j);
                    i5 = i + iZzd;
                    break;
                case 7:
                    i2 = i5 * 53;
                    iFloatToIntBits = zzhiu.zzb(zzhlc.zzh(obj, j));
                    i5 = iFloatToIntBits + i2;
                    break;
                case 8:
                    i2 = i5 * 53;
                    iFloatToIntBits = ((String) zzhlc.zzn(obj, j)).hashCode();
                    i5 = iFloatToIntBits + i2;
                    break;
                case 9:
                    i3 = i5 * 53;
                    Object objZzn = zzhlc.zzn(obj, j);
                    if (objZzn != null) {
                        iHashCode2 = objZzn.hashCode();
                    }
                    i5 = i3 + iHashCode2;
                    break;
                case 10:
                    i2 = i5 * 53;
                    iFloatToIntBits = zzhlc.zzn(obj, j).hashCode();
                    i5 = iFloatToIntBits + i2;
                    break;
                case 11:
                    i = i5 * 53;
                    iZzd = zzhlc.zzd(obj, j);
                    i5 = i + iZzd;
                    break;
                case 12:
                    i = i5 * 53;
                    iZzd = zzhlc.zzd(obj, j);
                    i5 = i + iZzd;
                    break;
                case 13:
                    i = i5 * 53;
                    iZzd = zzhlc.zzd(obj, j);
                    i5 = i + iZzd;
                    break;
                case 14:
                    i = i5 * 53;
                    jDoubleToLongBits = zzhlc.zzf(obj, j);
                    byte[] bArr5 = zzhiu.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i5 = i + iZzd;
                    break;
                case 15:
                    i = i5 * 53;
                    iZzd = zzhlc.zzd(obj, j);
                    i5 = i + iZzd;
                    break;
                case 16:
                    i = i5 * 53;
                    jDoubleToLongBits = zzhlc.zzf(obj, j);
                    byte[] bArr6 = zzhiu.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i5 = i + iZzd;
                    break;
                case 17:
                    i3 = i5 * 53;
                    Object objZzn2 = zzhlc.zzn(obj, j);
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
                    iFloatToIntBits = zzhlc.zzn(obj, j).hashCode();
                    i5 = iFloatToIntBits + i2;
                    break;
                case 50:
                    i2 = i5 * 53;
                    iFloatToIntBits = zzhlc.zzn(obj, j).hashCode();
                    i5 = iFloatToIntBits + i2;
                    break;
                case 51:
                    if (!zzP(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzG(obj, j));
                        byte[] bArr7 = zzhiu.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i5 = i + iZzd;
                        break;
                    }
                case 52:
                    if (!zzP(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzH(obj, j));
                        i5 = iFloatToIntBits + i2;
                        break;
                    }
                case 53:
                    if (!zzP(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        jDoubleToLongBits = zzJ(obj, j);
                        byte[] bArr8 = zzhiu.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i5 = i + iZzd;
                        break;
                    }
                case 54:
                    if (!zzP(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        jDoubleToLongBits = zzJ(obj, j);
                        byte[] bArr9 = zzhiu.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i5 = i + iZzd;
                        break;
                    }
                case 55:
                    if (!zzP(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        iZzd = zzI(obj, j);
                        i5 = i + iZzd;
                        break;
                    }
                case 56:
                    if (!zzP(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        jDoubleToLongBits = zzJ(obj, j);
                        byte[] bArr10 = zzhiu.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i5 = i + iZzd;
                        break;
                    }
                case 57:
                    if (!zzP(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        iZzd = zzI(obj, j);
                        i5 = i + iZzd;
                        break;
                    }
                case 58:
                    if (!zzP(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        iFloatToIntBits = zzhiu.zzb(zzK(obj, j));
                        i5 = iFloatToIntBits + i2;
                        break;
                    }
                case 59:
                    if (!zzP(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        iFloatToIntBits = ((String) zzhlc.zzn(obj, j)).hashCode();
                        i5 = iFloatToIntBits + i2;
                        break;
                    }
                case 60:
                    if (!zzP(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        iFloatToIntBits = zzhlc.zzn(obj, j).hashCode();
                        i5 = iFloatToIntBits + i2;
                        break;
                    }
                case 61:
                    if (!zzP(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        iFloatToIntBits = zzhlc.zzn(obj, j).hashCode();
                        i5 = iFloatToIntBits + i2;
                        break;
                    }
                case 62:
                    if (!zzP(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        iZzd = zzI(obj, j);
                        i5 = i + iZzd;
                        break;
                    }
                case 63:
                    if (!zzP(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        iZzd = zzI(obj, j);
                        i5 = i + iZzd;
                        break;
                    }
                case 64:
                    if (!zzP(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        iZzd = zzI(obj, j);
                        i5 = i + iZzd;
                        break;
                    }
                case 65:
                    if (!zzP(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        jDoubleToLongBits = zzJ(obj, j);
                        byte[] bArr11 = zzhiu.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i5 = i + iZzd;
                        break;
                    }
                case 66:
                    if (!zzP(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        iZzd = zzI(obj, j);
                        i5 = i + iZzd;
                        break;
                    }
                case 67:
                    if (!zzP(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        jDoubleToLongBits = zzJ(obj, j);
                        byte[] bArr12 = zzhiu.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i5 = i + iZzd;
                        break;
                    }
                case 68:
                    if (!zzP(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        iFloatToIntBits = zzhlc.zzn(obj, j).hashCode();
                        i5 = iFloatToIntBits + i2;
                        break;
                    }
            }
            i4 += 3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhkk
    public final void zzd(Object obj, Object obj2) {
        zzF(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                zzhkm.zzI(this.zzm, obj, obj2);
                if (this.zzh) {
                    zzhkm.zzH(this.zzn, obj, obj2);
                    return;
                }
                return;
            }
            int iZzA = zzA(i);
            int i2 = 1048575 & iZzA;
            int iZzC = zzC(iZzA);
            int i3 = iArr[i];
            long j = i2;
            switch (iZzC) {
                case 0:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhlc.zzm(obj, j, zzhlc.zzl(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 1:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhlc.zzk(obj, j, zzhlc.zzj(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 2:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhlc.zzg(obj, j, zzhlc.zzf(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 3:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhlc.zzg(obj, j, zzhlc.zzf(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 4:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhlc.zze(obj, j, zzhlc.zzd(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 5:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhlc.zzg(obj, j, zzhlc.zzf(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 6:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhlc.zze(obj, j, zzhlc.zzd(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 7:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhlc.zzi(obj, j, zzhlc.zzh(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 8:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhlc.zzo(obj, j, zzhlc.zzn(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 9:
                    zzo(obj, obj2, i);
                    break;
                case 10:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhlc.zzo(obj, j, zzhlc.zzn(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 11:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhlc.zze(obj, j, zzhlc.zzd(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 12:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhlc.zze(obj, j, zzhlc.zzd(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 13:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhlc.zze(obj, j, zzhlc.zzd(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 14:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhlc.zzg(obj, j, zzhlc.zzf(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 15:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhlc.zze(obj, j, zzhlc.zzd(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 16:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhlc.zzg(obj, j, zzhlc.zzf(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 17:
                    zzo(obj, obj2, i);
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
                    zzhit zzhitVarZzh = (zzhit) zzhlc.zzn(obj, j);
                    zzhit zzhitVar = (zzhit) zzhlc.zzn(obj2, j);
                    int size = zzhitVarZzh.size();
                    int size2 = zzhitVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzhitVarZzh.zza()) {
                            zzhitVarZzh = zzhitVarZzh.zzh(size2 + size);
                        }
                        zzhitVarZzh.addAll(zzhitVar);
                    }
                    if (size > 0) {
                        zzhitVar = zzhitVarZzh;
                    }
                    zzhlc.zzo(obj, j, zzhitVar);
                    break;
                case 50:
                    int i4 = zzhkm.zza;
                    zzhlc.zzo(obj, j, zzhjn.zzb(zzhlc.zzn(obj, j), zzhlc.zzn(obj2, j)));
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
                    if (!zzP(obj2, i3, i)) {
                        break;
                    } else {
                        zzhlc.zzo(obj, j, zzhlc.zzn(obj2, j));
                        zzQ(obj, i3, i);
                        break;
                    }
                case 60:
                    zzp(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzP(obj2, i3, i)) {
                        break;
                    } else {
                        zzhlc.zzo(obj, j, zzhlc.zzn(obj2, j));
                        zzQ(obj, i3, i);
                        break;
                    }
                case 68:
                    zzp(obj, obj2, i);
                    break;
            }
            i += 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:195:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e4  */
    @Override // com.google.android.gms.internal.ads.zzhkk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zze(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 2030
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhjv.zze(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.ads.zzhkk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.Object r21, com.google.android.gms.internal.ads.zzhlk r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhjv.zzf(java.lang.Object, com.google.android.gms.internal.ads.zzhlk):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:178:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x05a5 A[LOOP:2: B:189:0x05a1->B:191:0x05a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0562 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0572 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:303:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:304:? A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzhkk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzg(java.lang.Object r12, com.google.android.gms.internal.ads.zzhkf r13, com.google.android.gms.internal.ads.zzhhr r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhjv.zzg(java.lang.Object, com.google.android.gms.internal.ads.zzhkf, com.google.android.gms.internal.ads.zzhhr):void");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int zzi(java.lang.Object r32, byte[] r33, int r34, int r35, int r36, com.google.android.gms.internal.ads.zzhgp r37) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3754
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhjv.zzi(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzhgp):int");
    }

    @Override // com.google.android.gms.internal.ads.zzhkk
    public final void zzj(Object obj, byte[] bArr, int i, int i2, zzhgp zzhgpVar) throws IOException {
        zzi(obj, bArr, i, i2, 0, zzhgpVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    @Override // com.google.android.gms.internal.ads.zzhkk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzk(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = zzE(r8)
            if (r0 != 0) goto L8
            goto L91
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzhih
            if (r0 == 0) goto L18
            r0 = r8
            com.google.android.gms.internal.ads.zzhih r0 = (com.google.android.gms.internal.ads.zzhih) r0
            r0.zzbq()
            r0.zzbb()
            r0.zzaY()
        L18:
            int[] r0 = r7.zzc
            r1 = 0
        L1b:
            int r2 = r0.length
            if (r1 >= r2) goto L83
            int r2 = r7.zzA(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = zzC(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L6d
            r5 = 60
            if (r2 == r5) goto L57
            r5 = 68
            if (r2 == r5) goto L57
            switch(r2) {
                case 17: goto L6d;
                case 18: goto L4d;
                case 19: goto L4d;
                case 20: goto L4d;
                case 21: goto L4d;
                case 22: goto L4d;
                case 23: goto L4d;
                case 24: goto L4d;
                case 25: goto L4d;
                case 26: goto L4d;
                case 27: goto L4d;
                case 28: goto L4d;
                case 29: goto L4d;
                case 30: goto L4d;
                case 31: goto L4d;
                case 32: goto L4d;
                case 33: goto L4d;
                case 34: goto L4d;
                case 35: goto L4d;
                case 36: goto L4d;
                case 37: goto L4d;
                case 38: goto L4d;
                case 39: goto L4d;
                case 40: goto L4d;
                case 41: goto L4d;
                case 42: goto L4d;
                case 43: goto L4d;
                case 44: goto L4d;
                case 45: goto L4d;
                case 46: goto L4d;
                case 47: goto L4d;
                case 48: goto L4d;
                case 49: goto L4d;
                case 50: goto L3b;
                default: goto L3a;
            }
        L3a:
            goto L80
        L3b:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.ads.zzhjv.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L80
            r6 = r5
            com.google.android.gms.internal.ads.zzhjm r6 = (com.google.android.gms.internal.ads.zzhjm) r6
            r6.zzd()
            r2.putObject(r8, r3, r5)
            goto L80
        L4d:
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzhlc.zzn(r8, r3)
            com.google.android.gms.internal.ads.zzhit r2 = (com.google.android.gms.internal.ads.zzhit) r2
            r2.zzb()
            goto L80
        L57:
            r2 = r0[r1]
            boolean r2 = r7.zzP(r8, r2, r1)
            if (r2 == 0) goto L80
            com.google.android.gms.internal.ads.zzhkk r2 = r7.zzq(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.ads.zzhjv.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzk(r3)
            goto L80
        L6d:
            boolean r2 = r7.zzN(r8, r1)
            if (r2 == 0) goto L80
            com.google.android.gms.internal.ads.zzhkk r2 = r7.zzq(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.ads.zzhjv.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzk(r3)
        L80:
            int r1 = r1 + 3
            goto L1b
        L83:
            com.google.android.gms.internal.ads.zzhkv r0 = r7.zzm
            r0.zzj(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L91
            com.google.android.gms.internal.ads.zzhhs r0 = r7.zzn
            r0.zza(r8)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhjv.zzk(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00c1  */
    @Override // com.google.android.gms.internal.ads.zzhkk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzl(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhjv.zzl(java.lang.Object):boolean");
    }
}
