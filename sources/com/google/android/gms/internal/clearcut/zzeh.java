package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes5.dex */
final class zzeh {
    private static final Class<?> zzoh = zzdp();
    private static final zzex<?, ?> zzoi = zzd(false);
    private static final zzex<?, ?> zzoj = zzd(true);
    private static final zzex<?, ?> zzok = new zzez();

    public static int zza(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzdc)) {
            int iZze = 0;
            while (i < size) {
                iZze += zzbn.zze(list.get(i).longValue());
                i++;
            }
            return iZze;
        }
        zzdc zzdcVar = (zzdc) list;
        int iZze2 = 0;
        while (i < size) {
            iZze2 += zzbn.zze(zzdcVar.getLong(i));
            i++;
        }
        return iZze2;
    }

    public static int zzb(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzdc)) {
            int iZzf = 0;
            while (i < size) {
                iZzf += zzbn.zzf(list.get(i).longValue());
                i++;
            }
            return iZzf;
        }
        zzdc zzdcVar = (zzdc) list;
        int iZzf2 = 0;
        while (i < size) {
            iZzf2 += zzbn.zzf(zzdcVar.getLong(i));
            i++;
        }
        return iZzf2;
    }

    public static int zzc(int i, Object obj, zzef zzefVar) {
        return obj instanceof zzcv ? zzbn.zza(i, (zzcv) obj) : zzbn.zzb(i, (zzdo) obj, zzefVar);
    }

    public static int zzd(int i, List<zzbb> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzr = zzbn.zzr(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iZzr += zzbn.zzb(list.get(i2));
        }
        return iZzr;
    }

    public static zzex<?, ?> zzdm() {
        return zzoi;
    }

    public static zzex<?, ?> zzdn() {
        return zzoj;
    }

    public static zzex<?, ?> zzdo() {
        return zzok;
    }

    private static Class<?> zzdp() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzdq() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int zze(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzch)) {
            int iZzs = 0;
            while (i < size) {
                iZzs += zzbn.zzs(list.get(i).intValue());
                i++;
            }
            return iZzs;
        }
        zzch zzchVar = (zzch) list;
        int iZzs2 = 0;
        while (i < size) {
            iZzs2 += zzbn.zzs(zzchVar.getInt(i));
            i++;
        }
        return iZzs2;
    }

    public static int zzf(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzch)) {
            int iZzt = 0;
            while (i < size) {
                iZzt += zzbn.zzt(list.get(i).intValue());
                i++;
            }
            return iZzt;
        }
        zzch zzchVar = (zzch) list;
        int iZzt2 = 0;
        while (i < size) {
            iZzt2 += zzbn.zzt(zzchVar.getInt(i));
            i++;
        }
        return iZzt2;
    }

    public static int zzg(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzch)) {
            int iZzu = 0;
            while (i < size) {
                iZzu += zzbn.zzu(list.get(i).intValue());
                i++;
            }
            return iZzu;
        }
        zzch zzchVar = (zzch) list;
        int iZzu2 = 0;
        while (i < size) {
            iZzu2 += zzbn.zzu(zzchVar.getInt(i));
            i++;
        }
        return iZzu2;
    }

    public static int zzh(List<?> list) {
        return list.size() << 2;
    }

    public static int zzi(List<?> list) {
        return list.size() << 3;
    }

    public static int zzj(List<?> list) {
        return list.size();
    }

    public static void zzk(int i, List<Integer> list, zzfr zzfrVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzb(i, list, z);
    }

    public static void zzl(int i, List<Integer> list, zzfr zzfrVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzk(i, list, z);
    }

    public static void zzm(int i, List<Integer> list, zzfr zzfrVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzh(i, list, z);
    }

    public static void zzn(int i, List<Boolean> list, zzfr zzfrVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzi(i, list, z);
    }

    public static int zzo(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzbn.zzr(i) * list.size()) + zza(list);
    }

    public static int zzp(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzbn.zzr(i) * size) + zzb(list);
    }

    public static int zzq(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzbn.zzr(i) * size) + zzc(list);
    }

    public static int zzr(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzbn.zzr(i) * size) + zzd(list);
    }

    public static int zzs(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzbn.zzr(i) * size) + zze(list);
    }

    public static int zzt(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzbn.zzr(i) * size) + zzf(list);
    }

    public static int zzu(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzbn.zzr(i) * size) + zzg(list);
    }

    public static int zzv(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzbn.zzj(i, 0) * size;
    }

    public static int zzw(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzbn.zzg(i, 0L) * size;
    }

    public static int zzx(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzbn.zzc(i, true) * size;
    }

    private static <UT, UB> UB zza(int i, int i2, UB ub, zzex<UT, UB> zzexVar) {
        if (ub == null) {
            ub = zzexVar.zzdz();
        }
        zzexVar.zza((zzex<UT, UB>) ub, i, i2);
        return ub;
    }

    public static void zzb(int i, List<zzbb> list, zzfr zzfrVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzb(i, list);
    }

    public static int zzc(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iZzr = zzbn.zzr(i) * size;
        if (!(list instanceof zzcx)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                iZzr = (obj instanceof zzbb ? zzbn.zzb((zzbb) obj) : zzbn.zzh((String) obj)) + iZzr;
                i2++;
            }
            return iZzr;
        }
        zzcx zzcxVar = (zzcx) list;
        while (i2 < size) {
            Object raw = zzcxVar.getRaw(i2);
            iZzr = (raw instanceof zzbb ? zzbn.zzb((zzbb) raw) : zzbn.zzh((String) raw)) + iZzr;
            i2++;
        }
        return iZzr;
    }

    public static int zzd(int i, List<zzdo> list, zzef zzefVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzc = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iZzc += zzbn.zzc(i, list.get(i2), zzefVar);
        }
        return iZzc;
    }

    public static void zze(int i, List<Long> list, zzfr zzfrVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzn(i, list, z);
    }

    public static void zzf(int i, List<Long> list, zzfr zzfrVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zze(i, list, z);
    }

    public static void zzg(int i, List<Long> list, zzfr zzfrVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzl(i, list, z);
    }

    public static void zzh(int i, List<Integer> list, zzfr zzfrVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zza(i, list, z);
    }

    public static void zzi(int i, List<Integer> list, zzfr zzfrVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzj(i, list, z);
    }

    public static void zzj(int i, List<Integer> list, zzfr zzfrVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzm(i, list, z);
    }

    public static <UT, UB> UB zza(int i, List<Integer> list, zzck<?> zzckVar, UB ub, zzex<UT, UB> zzexVar) {
        if (zzckVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (zzckVar.zzb(iIntValue) == null) {
                    ub = (UB) zza(i, iIntValue, ub, zzexVar);
                    it.remove();
                }
            }
            return ub;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = list.get(i3);
            int iIntValue2 = num.intValue();
            if (zzckVar.zzb(iIntValue2) != null) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                ub = (UB) zza(i, iIntValue2, ub, zzexVar);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return ub;
    }

    public static void zzb(int i, List<?> list, zzfr zzfrVar, zzef zzefVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzb(i, list, zzefVar);
    }

    public static int zzc(int i, List<?> list, zzef zzefVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzr = zzbn.zzr(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            iZzr = (obj instanceof zzcv ? zzbn.zza((zzcv) obj) : zzbn.zzb((zzdo) obj, zzefVar)) + iZzr;
        }
        return iZzr;
    }

    public static int zzd(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzch)) {
            int iZzx = 0;
            while (i < size) {
                iZzx += zzbn.zzx(list.get(i).intValue());
                i++;
            }
            return iZzx;
        }
        zzch zzchVar = (zzch) list;
        int iZzx2 = 0;
        while (i < size) {
            iZzx2 += zzbn.zzx(zzchVar.getInt(i));
            i++;
        }
        return iZzx2;
    }

    public static void zzf(Class<?> cls) {
        Class<?> cls2;
        if (!zzcg.class.isAssignableFrom(cls) && (cls2 = zzoh) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zza(int i, List<String> list, zzfr zzfrVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zza(i, list);
    }

    public static void zzb(int i, List<Float> list, zzfr zzfrVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzf(i, list, z);
    }

    public static int zzc(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzdc)) {
            int iZzg = 0;
            while (i < size) {
                iZzg += zzbn.zzg(list.get(i).longValue());
                i++;
            }
            return iZzg;
        }
        zzdc zzdcVar = (zzdc) list;
        int iZzg2 = 0;
        while (i < size) {
            iZzg2 += zzbn.zzg(zzdcVar.getLong(i));
            i++;
        }
        return iZzg2;
    }

    private static zzex<?, ?> zzd(boolean z) {
        try {
            Class<?> clsZzdq = zzdq();
            if (clsZzdq == null) {
                return null;
            }
            return (zzex) clsZzdq.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zza(int i, List<?> list, zzfr zzfrVar, zzef zzefVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zza(i, list, zzefVar);
    }

    public static void zzc(int i, List<Long> list, zzfr zzfrVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzc(i, list, z);
    }

    public static void zzd(int i, List<Long> list, zzfr zzfrVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzd(i, list, z);
    }

    public static void zza(int i, List<Double> list, zzfr zzfrVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzg(i, list, z);
    }

    public static boolean zzc(int i, int i2, int i3) {
        if (i2 < 40) {
            return true;
        }
        long j = i2 - i;
        long j2 = i3;
        return j + 10 <= ((j2 + 3) * 3) + ((2 * j2) + 3);
    }

    public static boolean zzd(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T, FT extends zzca<FT>> void zza(zzbu<FT> zzbuVar, T t, T t2) {
        zzby<T> zzbyVarZza = zzbuVar.zza(t2);
        if (zzbyVarZza.isEmpty()) {
            return;
        }
        zzbuVar.zzb(t).zza(zzbyVarZza);
    }

    public static <T> void zza(zzdj zzdjVar, T t, T t2, long j) {
        zzfd.zza(t, j, zzdjVar.zzb(zzfd.zzo(t, j), zzfd.zzo(t2, j)));
    }

    public static <T, UT, UB> void zza(zzex<UT, UB> zzexVar, T t, T t2) {
        zzexVar.zze(t, zzexVar.zzg(zzexVar.zzq(t), zzexVar.zzq(t2)));
    }
}
