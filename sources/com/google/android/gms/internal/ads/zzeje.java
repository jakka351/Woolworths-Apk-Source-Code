package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes5.dex */
final class zzeje extends zzcor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeje(zzeji zzejiVar, View view, zzcek zzcekVar, zzcqq zzcqqVar, zzfck zzfckVar) {
        super(view, null, zzcqqVar, zzfckVar);
        Objects.requireNonNull(zzejiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcor
    public final zzcxe zze(Set set) {
        return new zzcxe(Collections.EMPTY_SET);
    }
}
