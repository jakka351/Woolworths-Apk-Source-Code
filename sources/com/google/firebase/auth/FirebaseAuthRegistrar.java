package com.google.firebase.auth;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.heartbeatinfo.HeartBeatConsumerComponent;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

@Keep
@KeepForSdk
/* loaded from: classes.dex */
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    public static /* synthetic */ FirebaseAuth lambda$getComponents$0(Qualified qualified, Qualified qualified2, Qualified qualified3, Qualified qualified4, Qualified qualified5, ComponentContainer componentContainer) {
        FirebaseApp firebaseApp = (FirebaseApp) componentContainer.a(FirebaseApp.class);
        Provider providerC = componentContainer.c(InteropAppCheckTokenProvider.class);
        Provider providerC2 = componentContainer.c(HeartBeatController.class);
        return new com.google.firebase.auth.internal.zzad(firebaseApp, providerC, providerC2, (Executor) componentContainer.h(qualified2), (Executor) componentContainer.h(qualified3), (ScheduledExecutorService) componentContainer.h(qualified4), (Executor) componentContainer.h(qualified5));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    public List<Component<?>> getComponents() {
        Qualified qualified = new Qualified(Background.class, Executor.class);
        Qualified qualified2 = new Qualified(Blocking.class, Executor.class);
        Qualified qualified3 = new Qualified(Lightweight.class, Executor.class);
        Qualified qualified4 = new Qualified(Lightweight.class, ScheduledExecutorService.class);
        Qualified qualified5 = new Qualified(UiThread.class, Executor.class);
        Component.Builder builder = new Component.Builder(FirebaseAuth.class, new Class[]{InternalAuthProvider.class});
        builder.a(Dependency.c(FirebaseApp.class));
        builder.a(Dependency.d(HeartBeatController.class));
        builder.a(new Dependency(qualified, 1, 0));
        builder.a(new Dependency(qualified2, 1, 0));
        builder.a(new Dependency(qualified3, 1, 0));
        builder.a(new Dependency(qualified4, 1, 0));
        builder.a(new Dependency(qualified5, 1, 0));
        builder.a(Dependency.a(InteropAppCheckTokenProvider.class));
        zzaf zzafVar = new zzaf();
        zzafVar.d = qualified;
        zzafVar.e = qualified2;
        zzafVar.f = qualified3;
        zzafVar.g = qualified4;
        zzafVar.h = qualified5;
        builder.f = zzafVar;
        return Arrays.asList(builder.b(), HeartBeatConsumerComponent.a(), LibraryVersionComponent.a("fire-auth", "24.0.1"));
    }
}
