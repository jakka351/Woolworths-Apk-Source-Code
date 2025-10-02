package me.oriient.internal.infra.utils.core.coroutines;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes7.dex */
public final class e implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f25004a;

    public e(FlowCollector flowCollector) {
        this.f25004a = flowCollector;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Object objEmit = this.f25004a.emit(obj, continuation);
        return objEmit == CoroutineSingletons.d ? objEmit : Unit.f24250a;
    }
}
