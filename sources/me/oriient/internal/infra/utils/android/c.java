package me.oriient.internal.infra.utils.android;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes7.dex */
public final class c implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f24990a;

    public c(f fVar) {
        this.f24990a = fVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        this.f24990a.a();
        return Unit.f24250a;
    }
}
