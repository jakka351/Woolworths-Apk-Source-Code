package com.google.mlkit.vision.barcode.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcs;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import java.util.List;

@KeepForSdk
/* loaded from: classes.dex */
public class BarcodeRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        Component.Builder builderB = Component.b(zzi.class);
        builderB.a(Dependency.c(MlKitContext.class));
        builderB.f = new zzc();
        Component componentB = builderB.b();
        Component.Builder builderB2 = Component.b(zzg.class);
        builderB2.a(Dependency.c(zzi.class));
        builderB2.a(Dependency.c(ExecutorSelector.class));
        builderB2.a(Dependency.c(MlKitContext.class));
        builderB2.f = new zzd();
        return zzcs.zzh(componentB, builderB2.b());
    }
}
