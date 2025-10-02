package com.google.firebase.auth;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;

/* loaded from: classes.dex */
public final /* synthetic */ class zzaf implements ComponentFactory {
    public /* synthetic */ Qualified d;
    public /* synthetic */ Qualified e;
    public /* synthetic */ Qualified f;
    public /* synthetic */ Qualified g;
    public /* synthetic */ Qualified h;

    @Override // com.google.firebase.components.ComponentFactory
    public final Object b(ComponentContainer componentContainer) {
        return FirebaseAuthRegistrar.lambda$getComponents$0(this.d, this.e, this.f, this.g, this.h, componentContainer);
    }
}
