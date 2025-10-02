package me.oriient.internal.infra.utils.android.appState;

import androidx.annotation.Keep;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.UtilsKt;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lme/oriient/internal/infra/utils/android/appState/AppStateProviderImpl;", "Lme/oriient/internal/infra/utils/android/appState/AppStateProvider;", "<init>", "()V", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lme/oriient/internal/infra/utils/android/appState/AppState;", "appState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getAppState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "setAppState", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "wasResumed", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getWasResumed", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lme/oriient/internal/infra/utils/core/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "logger", "Companion", "me/oriient/internal/infra/utils/android/appState/b", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AppStateProviderImpl implements AppStateProvider {

    @NotNull
    private static final b Companion = new b();

    @NotNull
    private static final String TAG = "AppStateProvider";

    @NotNull
    private MutableStateFlow<AppState> appState = StateFlowKt.a(AppState.UNDEFINED);

    @NotNull
    private final MutableSharedFlow<Unit> wasResumed = UtilsKt.EventFlow();

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger = InternalDiKt.getDi().inject(Reflection.f24268a.b(Logger.class));

    public AppStateProviderImpl() {
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f24726a.T()), null, null, new a(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger getLogger() {
        return (Logger) this.logger.getD();
    }

    public void setAppState(@NotNull MutableStateFlow<AppState> mutableStateFlow) {
        Intrinsics.h(mutableStateFlow, "<set-?>");
        this.appState = mutableStateFlow;
    }

    @Override // me.oriient.internal.infra.utils.android.appState.AppStateProvider
    @NotNull
    public MutableStateFlow<AppState> getAppState() {
        return this.appState;
    }

    @Override // me.oriient.internal.infra.utils.android.appState.AppStateProvider
    @NotNull
    public MutableSharedFlow<Unit> getWasResumed() {
        return this.wasResumed;
    }
}
