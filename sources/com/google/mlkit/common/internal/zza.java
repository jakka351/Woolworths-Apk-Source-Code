package com.google.mlkit.common.internal;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.mlkit.common.sdkinternal.model.ModelFileHelper;

/* loaded from: classes.dex */
public final /* synthetic */ class zza implements ComponentFactory {
    @Override // com.google.firebase.components.ComponentFactory
    public final Object b(ComponentContainer componentContainer) {
        return new ModelFileHelper();
    }
}
