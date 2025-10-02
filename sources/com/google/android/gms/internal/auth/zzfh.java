package com.google.android.gms.internal.auth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
final class zzfh extends zzfl {
    private static final Class zza = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public /* synthetic */ zzfh(zzfg zzfgVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.zzfl
    public final void zza(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) zzhj.zzf(obj, j);
        if (list instanceof zzff) {
            objUnmodifiableList = ((zzff) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzge) && (list instanceof zzez)) {
                zzez zzezVar = (zzez) list;
                if (zzezVar.zzc()) {
                    zzezVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzhj.zzp(obj, j, objUnmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzfl
    public final void zzb(Object obj, Object obj2, long j) {
        zzfe zzfeVar;
        List list = (List) zzhj.zzf(obj2, j);
        int size = list.size();
        List listZzd = (List) zzhj.zzf(obj, j);
        if (listZzd.isEmpty()) {
            listZzd = listZzd instanceof zzff ? new zzfe(size) : ((listZzd instanceof zzge) && (listZzd instanceof zzez)) ? ((zzez) listZzd).zzd(size) : new ArrayList(size);
            zzhj.zzp(obj, j, listZzd);
        } else {
            if (zza.isAssignableFrom(listZzd.getClass())) {
                ArrayList arrayList = new ArrayList(listZzd.size() + size);
                arrayList.addAll(listZzd);
                zzhj.zzp(obj, j, arrayList);
                zzfeVar = arrayList;
            } else if (listZzd instanceof zzhe) {
                zzfe zzfeVar2 = new zzfe(listZzd.size() + size);
                zzfeVar2.addAll(zzfeVar2.size(), (zzhe) listZzd);
                zzhj.zzp(obj, j, zzfeVar2);
                zzfeVar = zzfeVar2;
            } else if ((listZzd instanceof zzge) && (listZzd instanceof zzez)) {
                zzez zzezVar = (zzez) listZzd;
                if (!zzezVar.zzc()) {
                    listZzd = zzezVar.zzd(listZzd.size() + size);
                    zzhj.zzp(obj, j, listZzd);
                }
            }
            listZzd = zzfeVar;
        }
        int size2 = listZzd.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            listZzd.addAll(list);
        }
        if (size2 > 0) {
            list = listZzd;
        }
        zzhj.zzp(obj, j, list);
    }

    private zzfh() {
        super(null);
    }
}
