package me.oriient.internal.infra.utils.core.coroutines;

import androidx.annotation.Keep;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ExecutorCoroutineDispatcherImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0005\u0010\tJ!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0010\u001a\u00020\u00048VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0006R\u001b\u0010\u0013\u001a\u00020\u00048VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0006R\u001b\u0010\u0016\u001a\u00020\u00048VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0006¨\u0006\u0018"}, d2 = {"Lme/oriient/internal/infra/utils/core/coroutines/DefaultCoroutineContextProvider;", "Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "<init>", "()V", "Lkotlin/coroutines/CoroutineContext;", "newSingleThreadCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "", "priority", "(I)Lkotlin/coroutines/CoroutineContext;", "numThreads", "newThreadPoolCoroutineContext", "(ILjava/lang/Integer;)Lkotlin/coroutines/CoroutineContext;", "default$delegate", "Lkotlin/Lazy;", "getDefault", "default", "main$delegate", "getMain", "main", "io$delegate", "getIo", "io", "me/oriient/internal/infra/utils/core/coroutines/a", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public class DefaultCoroutineContextProvider implements CoroutineContextProvider {

    /* renamed from: default$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy default = LazyKt.b(b.f25001a);

    /* renamed from: main$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy main = LazyKt.b(d.f25003a);

    /* renamed from: io$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy io = LazyKt.b(c.f25002a);

    @Override // me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider
    @NotNull
    public CoroutineContext getDefault() {
        return (CoroutineContext) this.default.getD();
    }

    @Override // me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider
    @NotNull
    public CoroutineContext getIo() {
        return (CoroutineContext) this.io.getD();
    }

    @Override // me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider
    @NotNull
    public CoroutineContext getMain() {
        return (CoroutineContext) this.main.getD();
    }

    @Override // me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider
    @NotNull
    public CoroutineContext newSingleThreadCoroutineContext() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.g(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        return new ExecutorCoroutineDispatcherImpl(executorServiceNewSingleThreadExecutor);
    }

    @Override // me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider
    @NotNull
    public CoroutineContext newThreadPoolCoroutineContext(int numThreads, @Nullable Integer priority) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(numThreads, priority == null ? Executors.defaultThreadFactory() : new a(priority.intValue()));
        Intrinsics.g(executorServiceNewFixedThreadPool, "newFixedThreadPool(...)");
        return new ExecutorCoroutineDispatcherImpl(executorServiceNewFixedThreadPool);
    }

    @Override // me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider
    @NotNull
    public CoroutineContext newSingleThreadCoroutineContext(int priority) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new a(priority));
        Intrinsics.g(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        return new ExecutorCoroutineDispatcherImpl(executorServiceNewSingleThreadExecutor);
    }
}
