package me.oriient.internal.services.dataPriorityLoader;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes7.dex */
public final class m implements Flow {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StateFlow f25436a;

    public m(StateFlow stateFlow) {
        this.f25436a = stateFlow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.f25436a.collect(new l(flowCollector), continuation);
        return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
    }
}
