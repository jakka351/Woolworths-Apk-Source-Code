package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.concurrent.FirebaseExecutors;
import com.google.firebase.heartbeatinfo.HeartBeatConsumerComponent;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static FirebaseInstallationsApi lambda$getComponents$0(ComponentContainer componentContainer) {
        return new FirebaseInstallations((FirebaseApp) componentContainer.a(FirebaseApp.class), componentContainer.c(HeartBeatController.class), (ExecutorService) componentContainer.h(new Qualified(Background.class, ExecutorService.class)), FirebaseExecutors.b((Executor) componentContainer.h(new Qualified(Blocking.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        Component.Builder builderB = Component.b(FirebaseInstallationsApi.class);
        builderB.f15223a = LIBRARY_NAME;
        builderB.a(Dependency.c(FirebaseApp.class));
        builderB.a(Dependency.a(HeartBeatController.class));
        builderB.a(new Dependency(new Qualified(Background.class, ExecutorService.class), 1, 0));
        builderB.a(new Dependency(new Qualified(Blocking.class, Executor.class), 1, 0));
        builderB.f = new androidx.compose.ui.graphics.colorspace.a(26);
        return Arrays.asList(builderB.b(), HeartBeatConsumerComponent.a(), LibraryVersionComponent.a(LIBRARY_NAME, "19.0.0"));
    }
}
