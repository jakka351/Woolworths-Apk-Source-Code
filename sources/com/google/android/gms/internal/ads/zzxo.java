package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzxo extends zzbk {
    public static final zzxo zzJ = new zzxo(new zzxn());
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final boolean zzU;
    public final boolean zzV;
    public final boolean zzW;
    public final boolean zzX;
    public final boolean zzY;
    private final SparseArray zzZ;
    private final SparseBooleanArray zzaa;

    static {
        String str = zzeo.zza;
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, 36);
        Integer.toString(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
        Integer.toString(1017, 36);
        Integer.toString(1018, 36);
    }

    public /* synthetic */ zzxo(zzxn zzxnVar, byte[] bArr) {
        this(zzxnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzxo.class == obj.getClass()) {
            zzxo zzxoVar = (zzxo) obj;
            if (super.equals(zzxoVar) && this.zzK == zzxoVar.zzK && this.zzM == zzxoVar.zzM && this.zzO == zzxoVar.zzO && this.zzT == zzxoVar.zzT && this.zzU == zzxoVar.zzU && this.zzV == zzxoVar.zzV && this.zzX == zzxoVar.zzX) {
                SparseBooleanArray sparseBooleanArray = this.zzaa;
                SparseBooleanArray sparseBooleanArray2 = zzxoVar.zzaa;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = this.zzZ;
                            SparseArray sparseArray2 = zzxoVar.zzZ;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zzwq zzwqVar = (zzwq) entry.getKey();
                                                if (!map2.containsKey(zzwqVar) || !Objects.equals(entry.getValue(), map2.get(zzwqVar))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.zzK ? 1 : 0)) * 961) + (this.zzM ? 1 : 0)) * 961) + (this.zzO ? 1 : 0)) * 28629151) + (this.zzT ? 1 : 0)) * 31) + (this.zzU ? 1 : 0)) * 31) + (this.zzV ? 1 : 0)) * 961) + (this.zzX ? 1 : 0)) * 31;
    }

    public final boolean zza(int i) {
        return this.zzaa.get(i);
    }

    @Deprecated
    public final boolean zzb(int i, zzwq zzwqVar) {
        Map map = (Map) this.zzZ.get(i);
        return map != null && map.containsKey(zzwqVar);
    }

    @Nullable
    @Deprecated
    public final zzxp zzc(int i, zzwq zzwqVar) {
        Map map = (Map) this.zzZ.get(i);
        if (map != null) {
            return (zzxp) map.get(zzwqVar);
        }
        return null;
    }

    public final zzxn zzd() {
        return new zzxn(this, null);
    }

    public final /* synthetic */ SparseArray zze() {
        return this.zzZ;
    }

    public final /* synthetic */ SparseBooleanArray zzf() {
        return this.zzaa;
    }

    private zzxo(zzxn zzxnVar) {
        super(zzxnVar);
        this.zzK = zzxnVar.zzz();
        this.zzL = false;
        this.zzM = zzxnVar.zzA();
        this.zzN = false;
        this.zzO = zzxnVar.zzB();
        this.zzP = false;
        this.zzQ = false;
        this.zzR = false;
        this.zzS = false;
        this.zzT = zzxnVar.zzC();
        this.zzU = zzxnVar.zzD();
        this.zzV = zzxnVar.zzE();
        this.zzW = false;
        this.zzX = zzxnVar.zzF();
        this.zzY = false;
        this.zzZ = zzxnVar.zzG();
        this.zzaa = zzxnVar.zzH();
    }
}
