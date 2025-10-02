package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class zzge {

    @NotNull
    private final Map zza = new LinkedHashMap();

    @NotNull
    private final Set zzb = new LinkedHashSet();

    private final List zzh(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(zza((zzue) it.next()));
        }
        return arrayList;
    }

    @Nullable
    public final Object zza(@NotNull zzue zzueVar) throws zzce {
        int iZzS = zzueVar.zzS();
        int i = iZzS - 1;
        if (iZzS == 0) {
            throw null;
        }
        switch (i) {
            case 0:
                return this.zza.get(Integer.valueOf(zzueVar.zzi()));
            case 1:
                return Boolean.valueOf(zzueVar.zzQ());
            case 2:
                byte[] bArrZzl = zzueVar.zzM().zzl();
                if (bArrZzl.length == 1) {
                    return Byte.valueOf(bArrZzl[0]);
                }
                throw new zzce(4, 6, null);
            case 3:
                String strZzO = zzueVar.zzO();
                if (strZzO.length() == 1) {
                    return Character.valueOf(strZzO.charAt(0));
                }
                throw new zzce(4, 6, null);
            case 4:
                int iZzj = zzueVar.zzj();
                if (iZzj < -32768 || iZzj > 32767) {
                    throw new zzce(4, 6, null);
                }
                return Short.valueOf((short) iZzj);
            case 5:
                return Integer.valueOf(zzueVar.zzk());
            case 6:
            case 8:
                throw new zzce(4, 6, null);
            case 7:
                return Long.valueOf(zzueVar.zzl());
            case 9:
                return Float.valueOf(zzueVar.zzg());
            case 10:
                return Double.valueOf(zzueVar.zzf());
            case 11:
                return zzueVar.zzP();
            case 12:
                return null;
            default:
                throw new zzce(4, 5, null);
        }
    }

    @Nullable
    public final Object zzb(int i) {
        return this.zza.remove(Integer.valueOf(i));
    }

    public final void zzc() {
        this.zza.clear();
    }

    public final void zzd(int i, @Nullable Object obj) {
        zze(173, obj);
        this.zzb.add(173);
    }

    public final void zze(int i, @Nullable Object obj) {
        this.zza.put(Integer.valueOf(i), obj);
    }

    @NotNull
    public final Class[] zzf(@NotNull List list) {
        List listZzh = zzh(list);
        ArrayList arrayList = new ArrayList(CollectionsKt.s(listZzh, 10));
        Iterator it = listZzh.iterator();
        while (it.hasNext()) {
            arrayList.add(zzgc.zza(it.next()));
        }
        return (Class[]) arrayList.toArray(new Class[0]);
    }

    @NotNull
    public final Object[] zzg(@NotNull List list) {
        return zzh(list).toArray(new Object[0]);
    }
}
