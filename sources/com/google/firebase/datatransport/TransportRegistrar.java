package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.compose.ui.graphics.colorspace.a;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TransportFactory lambda$getComponents$0(ComponentContainer componentContainer) {
        TransportRuntime.b((Context) componentContainer.a(Context.class));
        return TransportRuntime.a().c(CCTDestination.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TransportFactory lambda$getComponents$1(ComponentContainer componentContainer) {
        TransportRuntime.b((Context) componentContainer.a(Context.class));
        return TransportRuntime.a().c(CCTDestination.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TransportFactory lambda$getComponents$2(ComponentContainer componentContainer) {
        TransportRuntime.b((Context) componentContainer.a(Context.class));
        return TransportRuntime.a().c(CCTDestination.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public List<Component<?>> getComponents() {
        Component.Builder builderB = Component.b(TransportFactory.class);
        builderB.f15223a = LIBRARY_NAME;
        builderB.a(Dependency.c(Context.class));
        builderB.f = new a(22);
        Component componentB = builderB.b();
        Component.Builder builderA = Component.a(new Qualified(LegacyTransportBackend.class, TransportFactory.class));
        builderA.a(Dependency.c(Context.class));
        builderA.f = new a(23);
        Component componentB2 = builderA.b();
        Component.Builder builderA2 = Component.a(new Qualified(TransportBackend.class, TransportFactory.class));
        builderA2.a(Dependency.c(Context.class));
        builderA2.f = new a(24);
        return Arrays.asList(componentB, componentB2, builderA2.b(), LibraryVersionComponent.a(LIBRARY_NAME, "19.0.0"));
    }
}
