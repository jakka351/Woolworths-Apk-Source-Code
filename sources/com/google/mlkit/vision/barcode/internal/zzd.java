package com.google.mlkit.vision.barcode.internal;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.MlKitContext;

/* loaded from: classes.dex */
public final /* synthetic */ class zzd implements ComponentFactory {
    @Override // com.google.firebase.components.ComponentFactory
    public final Object b(ComponentContainer componentContainer) {
        return new zzg((zzi) componentContainer.a(zzi.class), (ExecutorSelector) componentContainer.a(ExecutorSelector.class), (MlKitContext) componentContainer.a(MlKitContext.class));
    }
}
