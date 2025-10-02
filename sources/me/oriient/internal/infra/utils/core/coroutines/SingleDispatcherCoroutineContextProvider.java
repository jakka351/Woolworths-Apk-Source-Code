package me.oriient.internal.infra.utils.core.coroutines;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0002\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\b¨\u0006\u0013"}, d2 = {"Lme/oriient/internal/infra/utils/core/coroutines/SingleDispatcherCoroutineContextProvider;", "Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "default", "Lkotlin/coroutines/CoroutineContext;", "getDefault", "()Lkotlin/coroutines/CoroutineContext;", "io", "getIo", "main", "getMain", "newSingleThreadCoroutineContext", "priority", "", "newThreadPoolCoroutineContext", "numThreads", "(ILjava/lang/Integer;)Lkotlin/coroutines/CoroutineContext;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public class SingleDispatcherCoroutineContextProvider implements CoroutineContextProvider {

    @NotNull
    private final CoroutineContext default;

    @NotNull
    private final CoroutineDispatcher dispatcher;

    @NotNull
    private final CoroutineContext io;

    @NotNull
    private final CoroutineContext main;

    public SingleDispatcherCoroutineContextProvider(@NotNull CoroutineDispatcher dispatcher) {
        Intrinsics.h(dispatcher, "dispatcher");
        this.dispatcher = dispatcher;
        this.default = dispatcher;
        this.main = dispatcher;
        this.io = dispatcher;
    }

    @Override // me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider
    @NotNull
    public CoroutineContext getDefault() {
        return this.default;
    }

    @Override // me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider
    @NotNull
    public CoroutineContext getIo() {
        return this.io;
    }

    @Override // me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider
    @NotNull
    public CoroutineContext getMain() {
        return this.main;
    }

    @Override // me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider
    @NotNull
    public CoroutineContext newSingleThreadCoroutineContext() {
        return this.dispatcher;
    }

    @Override // me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider
    @NotNull
    public CoroutineContext newThreadPoolCoroutineContext(int numThreads, @Nullable Integer priority) {
        return this.dispatcher;
    }

    @Override // me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider
    @NotNull
    public CoroutineContext newSingleThreadCoroutineContext(int priority) {
        return this.dispatcher;
    }
}
