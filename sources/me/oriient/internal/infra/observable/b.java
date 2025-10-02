package me.oriient.internal.infra.observable;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes7.dex */
public final class b implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f24968a;

    public b(Function1 function1) {
        this.f24968a = function1;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        this.f24968a.invoke(obj);
        return Unit.f24250a;
    }
}
