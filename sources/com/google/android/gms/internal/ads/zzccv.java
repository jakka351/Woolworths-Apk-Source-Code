package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
final class zzccv {
    private final ArrayList zza = new ArrayList();
    private long zzb;

    public final long zza() throws NumberFormatException {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((zzgl) it.next()).zzj().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                        this.zzb = Math.max(this.zzb, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
            it.remove();
        }
        return this.zzb;
    }

    public final void zzb(zzgl zzglVar) {
        this.zza.add(zzglVar);
    }
}
