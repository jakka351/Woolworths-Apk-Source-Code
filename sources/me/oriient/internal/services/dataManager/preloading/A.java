package me.oriient.internal.services.dataManager.preloading;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;

/* loaded from: classes7.dex */
public final class A extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25362a;
    public final /* synthetic */ FloorTransitionsDataPreloader b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(FloorTransitionsDataPreloader floorTransitionsDataPreloader, Continuation continuation) {
        super(continuation);
        this.b = floorTransitionsDataPreloader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25362a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.preloadData2((String) null, (Continuation<? super Outcome<Unit, OriientError>>) this);
    }
}
