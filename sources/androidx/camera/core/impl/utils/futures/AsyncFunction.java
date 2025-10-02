package androidx.camera.core.impl.utils.futures;

import com.google.common.util.concurrent.ListenableFuture;

@FunctionalInterface
/* loaded from: classes2.dex */
public interface AsyncFunction<I, O> {
    ListenableFuture apply(Object obj);
}
