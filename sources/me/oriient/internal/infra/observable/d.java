package me.oriient.internal.infra.observable;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes7.dex */
public final class d implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f24970a;

    public d(Function1 function1) {
        this.f24970a = function1;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        this.f24970a.invoke(obj);
        return Unit.f24250a;
    }
}
