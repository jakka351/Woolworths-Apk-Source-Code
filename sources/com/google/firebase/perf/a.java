package com.google.firebase.perf;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ComponentFactory {
    public final /* synthetic */ int d;
    public final /* synthetic */ Qualified e;

    public /* synthetic */ a(Qualified qualified, int i) {
        this.d = i;
        this.e = qualified;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object b(ComponentContainer componentContainer) {
        switch (this.d) {
            case 0:
                return FirebasePerfRegistrar.lambda$getComponents$0(this.e, componentContainer);
            default:
                return RemoteConfigRegistrar.lambda$getComponents$0(this.e, componentContainer);
        }
    }
}
