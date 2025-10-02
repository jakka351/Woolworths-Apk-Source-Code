package com.google.mlkit.vision.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_common.zzp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator;
import java.util.List;

@KeepForSdk
/* loaded from: classes.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        Component.Builder builderB = Component.b(MultiFlavorDetectorCreator.class);
        builderB.a(new Dependency(2, 0, MultiFlavorDetectorCreator.Registration.class));
        builderB.f = zzf.d;
        return zzp.zzi(builderB.b());
    }
}
