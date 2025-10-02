package me.oriient.internal.infra.observable.java;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final class b extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlowObservableProperty f24972a;
    public final /* synthetic */ ObservableListener b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(FlowObservableProperty flowObservableProperty, ObservableListener observableListener, Continuation continuation) {
        super(2, continuation);
        this.f24972a = flowObservableProperty;
        this.b = observableListener;
    }

    public static final void a(ObservableListener observableListener, Object obj) {
        observableListener.onValueChanged(obj);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f24972a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new b(this.f24972a, this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        this.f24972a.observableFlow.observe(new d(this.b, 1));
        return Unit.f24250a;
    }
}
