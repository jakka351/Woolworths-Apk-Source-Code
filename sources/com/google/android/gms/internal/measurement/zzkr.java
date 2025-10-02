package com.google.android.gms.internal.measurement;

import androidx.constraintlayout.core.state.a;
import com.google.android.gms.internal.measurement.zzkr;
import com.google.android.gms.internal.measurement.zzks;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class zzkr<MessageType extends zzks<MessageType, BuilderType>, BuilderType extends zzkr<MessageType, BuilderType>> implements zznl {
    private static void zza(List list, int i) {
        int size = list.size() - i;
        String strK = a.k(new StringBuilder(String.valueOf(size).length() + 26), "Element at index ", size, " is null.");
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(strK);
            }
            list.remove(size2);
        }
    }

    public static void zzaU(Iterable iterable, List list) {
        byte[] bArr = zzmp.zzb;
        iterable.getClass();
        if (iterable instanceof zzmx) {
            List listZza = ((zzmx) iterable).zza();
            zzmx zzmxVar = (zzmx) list;
            int size = list.size();
            for (Object obj : listZza) {
                if (obj == null) {
                    int size2 = zzmxVar.size() - size;
                    String strK = a.k(new StringBuilder(String.valueOf(size2).length() + 26), "Element at index ", size2, " is null.");
                    int size3 = zzmxVar.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            throw new NullPointerException(strK);
                        }
                        zzmxVar.remove(size3);
                    }
                } else if (obj instanceof zzlh) {
                    zzmxVar.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr2 = (byte[]) obj;
                    zzlh.zzh(bArr2, 0, bArr2.length);
                    zzmxVar.zzb();
                } else {
                    zzmxVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zznt) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size4 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size4);
            } else if (list instanceof zznv) {
                ((zznv) list).zze(list.size() + size4);
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    zza(list, size5);
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size6 = list2.size();
        for (int i = 0; i < size6; i++) {
            Object obj3 = list2.get(i);
            if (obj3 == null) {
                zza(list, size5);
            }
            list.add(obj3);
        }
    }

    @Override // 
    public abstract zzkr zzaR();

    public zzkr zzaS(byte[] bArr, int i, int i2) throws zzmr {
        throw null;
    }

    public zzkr zzaT(byte[] bArr, int i, int i2, zzlr zzlrVar) throws zzmr {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final /* synthetic */ zznl zzaV(byte[] bArr, zzlr zzlrVar) throws zzmr {
        return zzaT(bArr, 0, bArr.length, zzlrVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final /* synthetic */ zznl zzaW(byte[] bArr) throws zzmr {
        return zzaS(bArr, 0, bArr.length);
    }
}
