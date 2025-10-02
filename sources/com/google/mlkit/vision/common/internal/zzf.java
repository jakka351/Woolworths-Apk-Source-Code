package com.google.mlkit.vision.common.internal;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator;

/* loaded from: classes.dex */
public final /* synthetic */ class zzf implements ComponentFactory {
    public static final /* synthetic */ zzf d = new zzf();

    @Override // com.google.firebase.components.ComponentFactory
    public final Object b(ComponentContainer componentContainer) {
        return new MultiFlavorDetectorCreator(componentContainer.b(MultiFlavorDetectorCreator.Registration.class));
    }
}
