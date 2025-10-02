package com.google.firebase.firestore;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.RestrictTo;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.firestore.remote.FirebaseClientGrpcMetadataProvider;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.Arrays;
import java.util.List;

@Keep
@RestrictTo
/* loaded from: classes.dex */
public class FirestoreRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fst";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirestoreMultiDbComponent lambda$getComponents$0(ComponentContainer componentContainer) {
        return new FirestoreMultiDbComponent((Context) componentContainer.a(Context.class), (FirebaseApp) componentContainer.a(FirebaseApp.class), componentContainer.i(InternalAuthProvider.class), componentContainer.i(InteropAppCheckTokenProvider.class), new FirebaseClientGrpcMetadataProvider(componentContainer.c(UserAgentPublisher.class), componentContainer.c(HeartBeatInfo.class), (FirebaseOptions) componentContainer.a(FirebaseOptions.class)));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<Component<?>> getComponents() {
        Component.Builder builderB = Component.b(FirestoreMultiDbComponent.class);
        builderB.f15223a = LIBRARY_NAME;
        builderB.a(Dependency.c(FirebaseApp.class));
        builderB.a(Dependency.c(Context.class));
        builderB.a(Dependency.a(HeartBeatInfo.class));
        builderB.a(Dependency.a(UserAgentPublisher.class));
        builderB.a(new Dependency(0, 2, InternalAuthProvider.class));
        builderB.a(new Dependency(0, 2, InteropAppCheckTokenProvider.class));
        builderB.a(new Dependency(0, 0, FirebaseOptions.class));
        builderB.f = new androidx.compose.ui.graphics.colorspace.a(25);
        return Arrays.asList(builderB.b(), LibraryVersionComponent.a(LIBRARY_NAME, "26.0.0"));
    }
}
