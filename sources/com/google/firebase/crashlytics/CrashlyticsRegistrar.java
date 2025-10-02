package com.google.firebase.crashlytics;

import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Qualified f15249a = new Qualified(Background.class, ExecutorService.class);
    public final Qualified b = new Qualified(Blocking.class, ExecutorService.class);
    public final Qualified c = new Qualified(Lightweight.class, ExecutorService.class);

    static {
        SessionSubscriber.Name name = SessionSubscriber.Name.d;
        FirebaseSessionsDependencies.a();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        Component.Builder builderB = Component.b(FirebaseCrashlytics.class);
        builderB.f15223a = "fire-cls";
        builderB.a(Dependency.c(FirebaseApp.class));
        builderB.a(Dependency.c(FirebaseInstallationsApi.class));
        builderB.a(new Dependency(this.f15249a, 1, 0));
        builderB.a(new Dependency(this.b, 1, 0));
        builderB.a(new Dependency(this.c, 1, 0));
        builderB.a(new Dependency(0, 2, CrashlyticsNativeComponent.class));
        builderB.a(new Dependency(0, 2, AnalyticsConnector.class));
        builderB.a(new Dependency(0, 2, FirebaseRemoteConfigInterop.class));
        builderB.f = new a(this);
        builderB.c(2);
        return Arrays.asList(builderB.b(), LibraryVersionComponent.a("fire-cls", "20.0.1"));
    }
}
