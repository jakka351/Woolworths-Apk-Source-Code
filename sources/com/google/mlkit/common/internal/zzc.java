package com.google.mlkit.common.internal;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.mlkit.common.model.RemoteModelManager;

/* loaded from: classes.dex */
public final /* synthetic */ class zzc implements ComponentFactory {
    @Override // com.google.firebase.components.ComponentFactory
    public final Object b(ComponentContainer componentContainer) {
        return new RemoteModelManager(componentContainer.b(RemoteModelManager.RemoteModelManagerRegistration.class));
    }
}
