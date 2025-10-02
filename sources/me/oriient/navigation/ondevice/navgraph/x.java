package me.oriient.navigation.ondevice.navgraph;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.preloading.FloorDataPreloaderId;

/* loaded from: classes8.dex */
public final class x extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26328a;
    public final /* synthetic */ NavGraphPreloader b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(NavGraphPreloader navGraphPreloader, Continuation continuation) {
        super(continuation);
        this.b = navGraphPreloader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26328a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.preloadData2((FloorDataPreloaderId) null, (Continuation<? super Outcome<Unit, OriientError>>) this);
    }
}
