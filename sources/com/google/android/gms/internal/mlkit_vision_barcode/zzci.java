package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* loaded from: classes5.dex */
final class zzci extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();

    @CheckForNull
    transient int[] zza;

    @CheckForNull
    transient Object[] zzb;

    @CheckForNull
    transient Object[] zzc;

    @CheckForNull
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;

    @CheckForNull
    private transient Set zzh;

    @CheckForNull
    private transient Set zzi;

    @CheckForNull
    private transient Collection zzj;

    public zzci() {
        zzp(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] zzA() {
        int[] iArr = this.zza;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzB() {
        Object[] objArr = this.zzb;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzC() {
        Object[] objArr = this.zzc;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public static /* synthetic */ Object zzg(zzci zzciVar, int i) {
        return zzciVar.zzB()[i];
    }

    public static /* synthetic */ Object zzi(zzci zzciVar) {
        Object obj = zzciVar.zze;
        Objects.requireNonNull(obj);
        return obj;
    }

    public static /* synthetic */ Object zzj(zzci zzciVar, int i) {
        return zzciVar.zzC()[i];
    }

    public static /* synthetic */ void zzn(zzci zzciVar, int i, Object obj) {
        zzciVar.zzC()[i] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzv() {
        return (1 << (this.zzf & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzw(@CheckForNull Object obj) {
        if (zzr()) {
            return -1;
        }
        int iZza = zzck.zza(obj);
        int iZzv = zzv();
        Object obj2 = this.zze;
        Objects.requireNonNull(obj2);
        int iZzc = zzcj.zzc(obj2, iZza & iZzv);
        if (iZzc != 0) {
            int i = ~iZzv;
            int i2 = iZza & i;
            do {
                int i3 = iZzc - 1;
                int i4 = zzA()[i3];
                if ((i4 & i) == i2 && zzax.zza(obj, zzB()[i3])) {
                    return i3;
                }
                iZzc = i4 & iZzv;
            } while (iZzc != 0);
        }
        return -1;
    }

    private final int zzx(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object objZzd = zzcj.zzd(i2);
        if (i4 != 0) {
            zzcj.zze(objZzd, i3 & i5, i4 + 1);
        }
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArrZzA = zzA();
        for (int i6 = 0; i6 <= i; i6++) {
            int iZzc = zzcj.zzc(obj, i6);
            while (iZzc != 0) {
                int i7 = iZzc - 1;
                int i8 = iArrZzA[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iZzc2 = zzcj.zzc(objZzd, i10);
                zzcj.zze(objZzd, i10, iZzc);
                iArrZzA[i7] = ((~i5) & i9) | (iZzc2 & i5);
                iZzc = i8 & i;
            }
        }
        this.zze = objZzd;
        zzz(i5);
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzy(@CheckForNull Object obj) {
        if (!zzr()) {
            int iZzv = zzv();
            Object obj2 = this.zze;
            Objects.requireNonNull(obj2);
            int iZzb = zzcj.zzb(obj, null, iZzv, obj2, zzA(), zzB(), null);
            if (iZzb != -1) {
                Object obj3 = zzC()[iZzb];
                zzq(iZzb, iZzv);
                this.zzg--;
                zzo();
                return obj3;
            }
        }
        return zzd;
    }

    private final void zzz(int i) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.zzf & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzr()) {
            return;
        }
        zzo();
        Map mapZzl = zzl();
        if (mapZzl != null) {
            this.zzf = zzdw.zza(size(), 3, 1073741823);
            mapZzl.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzB(), 0, this.zzg, (Object) null);
        Arrays.fill(zzC(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzA(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        Map mapZzl = zzl();
        return mapZzl != null ? mapZzl.containsKey(obj) : zzw(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.containsValue(obj);
        }
        for (int i = 0; i < this.zzg; i++) {
            if (zzax.zza(obj, zzC()[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set != null) {
            return set;
        }
        zzcc zzccVar = new zzcc(this);
        this.zzi = zzccVar;
        return zzccVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object get(@CheckForNull Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.get(obj);
        }
        int iZzw = zzw(obj);
        if (iZzw == -1) {
            return null;
        }
        return zzC()[iZzw];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set != null) {
            return set;
        }
        zzcf zzcfVar = new zzcf(this);
        this.zzh = zzcfVar;
        return zzcfVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object put(Object obj, Object obj2) {
        int i;
        if (zzr()) {
            zzaz.zzf(zzr(), "Arrays already allocated");
            int i2 = this.zzf;
            int iMax = Math.max(i2 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.zze = zzcj.zzd(iMax2);
            zzz(iMax2 - 1);
            this.zza = new int[i2];
            this.zzb = new Object[i2];
            this.zzc = new Object[i2];
        }
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.put(obj, obj2);
        }
        int[] iArrZzA = zzA();
        Object[] objArrZzB = zzB();
        Object[] objArrZzC = zzC();
        int i3 = this.zzg;
        int i4 = i3 + 1;
        int iZza = zzck.zza(obj);
        int iZzv = zzv();
        int i5 = iZza & iZzv;
        Object obj3 = this.zze;
        Objects.requireNonNull(obj3);
        int iZzc = zzcj.zzc(obj3, i5);
        if (iZzc == 0) {
            if (i4 > iZzv) {
                iZzv = zzx(iZzv, zzcj.zza(iZzv), iZza, i3);
            } else {
                Object obj4 = this.zze;
                Objects.requireNonNull(obj4);
                zzcj.zze(obj4, i5, i4);
            }
            i = 1;
        } else {
            int i6 = ~iZzv;
            int i7 = iZza & i6;
            int i8 = 0;
            while (true) {
                int i9 = iZzc - 1;
                int i10 = iArrZzA[i9];
                i = 1;
                int i11 = i10 & i6;
                if (i11 == i7 && zzax.zza(obj, objArrZzB[i9])) {
                    Object obj5 = objArrZzC[i9];
                    objArrZzC[i9] = obj2;
                    return obj5;
                }
                int i12 = i10 & iZzv;
                i8++;
                if (i12 != 0) {
                    iZzc = i12;
                } else {
                    if (i8 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(zzv() + 1, 1.0f);
                        int iZze = zze();
                        while (iZze >= 0) {
                            linkedHashMap.put(zzB()[iZze], zzC()[iZze]);
                            iZze = zzf(iZze);
                        }
                        this.zze = linkedHashMap;
                        this.zza = null;
                        this.zzb = null;
                        this.zzc = null;
                        zzo();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i4 > iZzv) {
                        iZzv = zzx(iZzv, zzcj.zza(iZzv), iZza, i3);
                    } else {
                        iArrZzA[i9] = (i4 & iZzv) | i11;
                    }
                }
            }
        }
        int length = zzA().length;
        if (i4 > length) {
            int i13 = i;
            int iMin = Math.min(1073741823, (Math.max(i13, length >>> 1) + length) | i13);
            if (iMin != length) {
                this.zza = Arrays.copyOf(zzA(), iMin);
                this.zzb = Arrays.copyOf(zzB(), iMin);
                this.zzc = Arrays.copyOf(zzC(), iMin);
            }
        }
        zzA()[i3] = (~iZzv) & iZza;
        zzB()[i3] = obj;
        zzC()[i3] = obj2;
        this.zzg = i4;
        zzo();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object remove(@CheckForNull Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.remove(obj);
        }
        Object objZzy = zzy(obj);
        if (objZzy == zzd) {
            return null;
        }
        return objZzy;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapZzl = zzl();
        return mapZzl != null ? mapZzl.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        zzch zzchVar = new zzch(this);
        this.zzj = zzchVar;
        return zzchVar;
    }

    public final int zze() {
        return isEmpty() ? -1 : 0;
    }

    public final int zzf(int i) {
        int i2 = i + 1;
        if (i2 < this.zzg) {
            return i2;
        }
        return -1;
    }

    @CheckForNull
    public final Map zzl() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void zzo() {
        this.zzf += 32;
    }

    public final void zzp(int i) {
        this.zzf = zzdw.zza(i, 1, 1073741823);
    }

    public final void zzq(int i, int i2) {
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArrZzA = zzA();
        Object[] objArrZzB = zzB();
        Object[] objArrZzC = zzC();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrZzB[i] = null;
            objArrZzC[i] = null;
            iArrZzA[i] = 0;
            return;
        }
        int i4 = i + 1;
        Object obj2 = objArrZzB[i3];
        objArrZzB[i] = obj2;
        objArrZzC[i] = objArrZzC[i3];
        objArrZzB[i3] = null;
        objArrZzC[i3] = null;
        iArrZzA[i] = iArrZzA[i3];
        iArrZzA[i3] = 0;
        int iZza = zzck.zza(obj2) & i2;
        int iZzc = zzcj.zzc(obj, iZza);
        if (iZzc == size) {
            zzcj.zze(obj, iZza, i4);
            return;
        }
        while (true) {
            int i5 = iZzc - 1;
            int i6 = iArrZzA[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                iArrZzA[i5] = (i6 & (~i2)) | (i2 & i4);
                return;
            }
            iZzc = i7;
        }
    }

    public final boolean zzr() {
        return this.zze == null;
    }

    public zzci(int i) {
        zzp(12);
    }
}
