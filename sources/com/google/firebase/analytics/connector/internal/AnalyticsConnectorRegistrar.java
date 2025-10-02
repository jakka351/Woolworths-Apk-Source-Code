package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.analytics.connector.AnalyticsConnectorImpl;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.events.Subscriber;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;

@Keep
@KeepForSdk
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AnalyticsConnector lambda$getComponents$0(ComponentContainer componentContainer) {
        return AnalyticsConnectorImpl.i((FirebaseApp) componentContainer.a(FirebaseApp.class), (Context) componentContainer.a(Context.class), (Subscriber) componentContainer.a(Subscriber.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    @SuppressLint
    @KeepForSdk
    public List<Component<?>> getComponents() {
        Component.Builder builderB = Component.b(AnalyticsConnector.class);
        builderB.a(Dependency.c(FirebaseApp.class));
        builderB.a(Dependency.c(Context.class));
        builderB.a(Dependency.c(Subscriber.class));
        builderB.f = zzb.d;
        builderB.c(2);
        return Arrays.asList(builderB.b(), LibraryVersionComponent.a("fire-analytics", "23.0.0"));
    }
}
