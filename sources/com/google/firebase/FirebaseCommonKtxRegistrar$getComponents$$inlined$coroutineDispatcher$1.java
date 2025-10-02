package com.google.firebase;

import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ExecutorsKt;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1<T> implements ComponentFactory {
    public static final FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1 d = new FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1();

    @Override // com.google.firebase.components.ComponentFactory
    public final Object b(ComponentContainer componentContainer) {
        Object objH = componentContainer.h(new Qualified(Background.class, Executor.class));
        Intrinsics.g(objH, "get(...)");
        return ExecutorsKt.a((Executor) objH);
    }
}
