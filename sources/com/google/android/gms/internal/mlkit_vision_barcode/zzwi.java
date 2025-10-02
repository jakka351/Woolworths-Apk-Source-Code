package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzwi implements zzwf {

    @VisibleForTesting
    final List zza;

    public zzwi(Context context, zzwh zzwhVar) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        if (zzwhVar.zzc()) {
            arrayList.add(new zzwx(context, zzwhVar));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwf
    public final void zza(zzwe zzweVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzwf) it.next()).zza(zzweVar);
        }
    }
}
