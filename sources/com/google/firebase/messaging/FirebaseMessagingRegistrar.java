package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.datatransport.TransportFactory;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.datatransport.TransportBackend;
import com.google.firebase.events.Subscriber;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.Arrays;
import java.util.List;

@Keep
@KeepForSdk
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(Qualified qualified, ComponentContainer componentContainer) {
        return new FirebaseMessaging((FirebaseApp) componentContainer.a(FirebaseApp.class), (FirebaseInstanceIdInternal) componentContainer.a(FirebaseInstanceIdInternal.class), componentContainer.c(UserAgentPublisher.class), componentContainer.c(HeartBeatInfo.class), (FirebaseInstallationsApi) componentContainer.a(FirebaseInstallationsApi.class), componentContainer.e(qualified), (Subscriber) componentContainer.a(Subscriber.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<Component<?>> getComponents() {
        Qualified qualified = new Qualified(TransportBackend.class, TransportFactory.class);
        Component.Builder builderB = Component.b(FirebaseMessaging.class);
        builderB.f15223a = LIBRARY_NAME;
        builderB.a(Dependency.c(FirebaseApp.class));
        builderB.a(new Dependency(0, 0, FirebaseInstanceIdInternal.class));
        builderB.a(Dependency.a(UserAgentPublisher.class));
        builderB.a(Dependency.a(HeartBeatInfo.class));
        builderB.a(Dependency.c(FirebaseInstallationsApi.class));
        builderB.a(new Dependency(qualified, 0, 1));
        builderB.a(Dependency.c(Subscriber.class));
        builderB.f = new h(qualified);
        builderB.c(1);
        return Arrays.asList(builderB.b(), LibraryVersionComponent.a(LIBRARY_NAME, "25.0.0"));
    }
}
