package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.heartbeatinfo.HeartBeatConsumer;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String string;
        ArrayList arrayList = new ArrayList();
        arrayList.add(DefaultUserAgentPublisher.b());
        final Qualified qualified = new Qualified(Background.class, Executor.class);
        Component.Builder builder = new Component.Builder(DefaultHeartBeatController.class, new Class[]{HeartBeatController.class, HeartBeatInfo.class});
        builder.a(Dependency.c(Context.class));
        builder.a(Dependency.c(FirebaseApp.class));
        builder.a(new Dependency(2, 0, HeartBeatConsumer.class));
        builder.a(Dependency.d(UserAgentPublisher.class));
        builder.a(new Dependency(qualified, 1, 0));
        builder.f = new ComponentFactory() { // from class: com.google.firebase.heartbeatinfo.b
            @Override // com.google.firebase.components.ComponentFactory
            public final Object b(ComponentContainer componentContainer) {
                return new DefaultHeartBeatController((Context) componentContainer.a(Context.class), ((FirebaseApp) componentContainer.a(FirebaseApp.class)).f(), componentContainer.b(HeartBeatConsumer.class), componentContainer.c(UserAgentPublisher.class), (Executor) componentContainer.h(qualified));
            }
        };
        arrayList.add(builder.b());
        arrayList.add(LibraryVersionComponent.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(LibraryVersionComponent.a("fire-core", "22.0.0"));
        arrayList.add(LibraryVersionComponent.a("device-name", a(Build.PRODUCT)));
        arrayList.add(LibraryVersionComponent.a("device-model", a(Build.DEVICE)));
        arrayList.add(LibraryVersionComponent.a("device-brand", a(Build.BRAND)));
        arrayList.add(LibraryVersionComponent.b("android-target-sdk", new androidx.compose.ui.graphics.colorspace.a(13)));
        arrayList.add(LibraryVersionComponent.b("android-min-sdk", new androidx.compose.ui.graphics.colorspace.a(14)));
        arrayList.add(LibraryVersionComponent.b("android-platform", new androidx.compose.ui.graphics.colorspace.a(15)));
        arrayList.add(LibraryVersionComponent.b("android-installer", new androidx.compose.ui.graphics.colorspace.a(16)));
        try {
            string = KotlinVersion.h.toString();
        } catch (NoClassDefFoundError unused) {
            string = null;
        }
        if (string != null) {
            arrayList.add(LibraryVersionComponent.a("kotlin", string));
        }
        return arrayList;
    }
}
