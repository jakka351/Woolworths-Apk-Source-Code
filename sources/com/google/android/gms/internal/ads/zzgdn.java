package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzgdn implements zzgcz {
    private final List zza = new ArrayList();

    public final synchronized void zza(List list) {
        List list2 = this.zza;
        list2.clear();
        list2.addAll(list);
    }

    @Override // com.google.android.gms.internal.ads.zzgcz
    public final void zzb(Map map) {
    }

    @Override // com.google.android.gms.internal.ads.zzgcz
    public final synchronized void zzc(Map map, Context context, View view) {
        List list = this.zza;
        map.put("vst", new ArrayList(list));
        list.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzgcz
    public final void zzd(Map map) {
    }
}
