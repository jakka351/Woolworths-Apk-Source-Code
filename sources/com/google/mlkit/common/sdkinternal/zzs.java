package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class zzs implements ComponentFactory {
    @Override // com.google.firebase.components.ComponentFactory
    public final Object b(ComponentContainer componentContainer) {
        return new SharedPrefManager((Context) componentContainer.a(Context.class));
    }
}
