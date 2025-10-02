package com.google.android.gms.internal.mlkit_common;

import com.google.mlkit.common.sdkinternal.LazyInstanceMap;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;

/* loaded from: classes5.dex */
final class zzsr extends LazyInstanceMap {
    private zzsr() {
        throw null;
    }

    @Override // com.google.mlkit.common.sdkinternal.LazyInstanceMap
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        zzsb zzsbVar = (zzsb) obj;
        MlKitContext mlKitContextC = MlKitContext.c();
        return new zzsh(mlKitContextC.b(), (SharedPrefManager) mlKitContextC.a(SharedPrefManager.class), new zzsc(MlKitContext.c().b(), zzsbVar), zzsbVar.zzb());
    }

    public /* synthetic */ zzsr(zzsq zzsqVar) {
    }
}
