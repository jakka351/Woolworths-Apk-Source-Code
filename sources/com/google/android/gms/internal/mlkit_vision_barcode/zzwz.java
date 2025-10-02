package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.mlkit.common.sdkinternal.LazyInstanceMap;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;

/* loaded from: classes5.dex */
final class zzwz extends LazyInstanceMap {
    private zzwz() {
        throw null;
    }

    @Override // com.google.mlkit.common.sdkinternal.LazyInstanceMap
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        zzwh zzwhVar = (zzwh) obj;
        MlKitContext mlKitContextC = MlKitContext.c();
        return new zzwp(mlKitContextC.b(), (SharedPrefManager) mlKitContextC.a(SharedPrefManager.class), new zzwi(MlKitContext.c().b(), zzwhVar), zzwhVar.zzb());
    }

    public /* synthetic */ zzwz(zzwy zzwyVar) {
    }
}
