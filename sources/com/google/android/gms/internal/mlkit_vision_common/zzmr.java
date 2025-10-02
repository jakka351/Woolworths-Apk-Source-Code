package com.google.android.gms.internal.mlkit_vision_common;

import com.google.mlkit.common.sdkinternal.LazyInstanceMap;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;

/* loaded from: classes5.dex */
final class zzmr extends LazyInstanceMap {
    private zzmr() {
    }

    @Override // com.google.mlkit.common.sdkinternal.LazyInstanceMap
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        zzme zzmeVar = (zzme) obj;
        MlKitContext mlKitContextC = MlKitContext.c();
        return new zzmj(mlKitContextC.b(), (SharedPrefManager) mlKitContextC.a(SharedPrefManager.class), new zzmf(MlKitContext.c().b(), zzmeVar), zzmeVar.zzb());
    }

    public /* synthetic */ zzmr(zzmq zzmqVar) {
    }
}
