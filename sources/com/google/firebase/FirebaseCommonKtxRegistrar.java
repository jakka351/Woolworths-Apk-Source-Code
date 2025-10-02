package com.google.firebase;

import androidx.annotation.Keep;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "getComponents", "", "Lcom/google/firebase/components/Component;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<Component<?>> getComponents() {
        Component.Builder builderA = Component.a(new Qualified(Background.class, CoroutineDispatcher.class));
        builderA.a(new Dependency(new Qualified(Background.class, Executor.class), 1, 0));
        builderA.f = FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1.d;
        Component componentB = builderA.b();
        Component.Builder builderA2 = Component.a(new Qualified(Lightweight.class, CoroutineDispatcher.class));
        builderA2.a(new Dependency(new Qualified(Lightweight.class, Executor.class), 1, 0));
        builderA2.f = FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2.d;
        Component componentB2 = builderA2.b();
        Component.Builder builderA3 = Component.a(new Qualified(Blocking.class, CoroutineDispatcher.class));
        builderA3.a(new Dependency(new Qualified(Blocking.class, Executor.class), 1, 0));
        builderA3.f = FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3.d;
        Component componentB3 = builderA3.b();
        Component.Builder builderA4 = Component.a(new Qualified(UiThread.class, CoroutineDispatcher.class));
        builderA4.a(new Dependency(new Qualified(UiThread.class, Executor.class), 1, 0));
        builderA4.f = FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$4.d;
        return CollectionsKt.R(componentB, componentB2, componentB3, builderA4.b());
    }
}
