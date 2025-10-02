package me.oriient.internal.infra.utils.android.appState;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ProcessLifecycleOwner;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class a extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppStateProviderImpl f24988a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AppStateProviderImpl appStateProviderImpl, Continuation continuation) {
        super(2, continuation);
        this.f24988a = appStateProviderImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.f24988a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new a(this.f24988a, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        LifecycleRegistry lifecycleRegistry = ProcessLifecycleOwner.l.i;
        Intrinsics.g(lifecycleRegistry, "getLifecycle(...)");
        this.f24988a.getAppState().setValue(lifecycleRegistry.d.a(Lifecycle.State.g) ? AppState.FOREGROUND : lifecycleRegistry.d.a(Lifecycle.State.f) ? AppState.BACKGROUND : AppState.UNDEFINED);
        this.f24988a.getLogger().d("AppStateProvider", "App state was initialized with " + this.f24988a.getAppState());
        final AppStateProviderImpl appStateProviderImpl = this.f24988a;
        lifecycleRegistry.a(new LifecycleObserver() { // from class: me.oriient.internal.infra.utils.android.appState.AppStateProviderImpl$1$1
            @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
            public final void onCreate(@NotNull LifecycleOwner owner) {
                Intrinsics.h(owner, "owner");
                appStateProviderImpl.getAppState().setValue(AppState.BACKGROUND);
                appStateProviderImpl.getLogger().d("AppStateProvider", "OnCreate: " + appStateProviderImpl.getAppState());
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            public final void onResume(@NotNull LifecycleOwner owner) {
                Intrinsics.h(owner, "owner");
                appStateProviderImpl.getWasResumed().f(Unit.f24250a);
                appStateProviderImpl.getLogger().d("AppStateProvider", "OnResume: " + appStateProviderImpl.getAppState());
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_START)
            public final void onStart(@NotNull LifecycleOwner owner) {
                Intrinsics.h(owner, "owner");
                appStateProviderImpl.getAppState().setValue(AppState.FOREGROUND);
                appStateProviderImpl.getLogger().d("AppStateProvider", "OnStart: " + appStateProviderImpl.getAppState());
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
            public final void onStop(@NotNull LifecycleOwner owner) {
                Intrinsics.h(owner, "owner");
                appStateProviderImpl.getAppState().setValue(AppState.BACKGROUND);
                appStateProviderImpl.getLogger().d("AppStateProvider", "OnStop: " + appStateProviderImpl.getAppState());
            }
        });
        return Unit.f24250a;
    }
}
