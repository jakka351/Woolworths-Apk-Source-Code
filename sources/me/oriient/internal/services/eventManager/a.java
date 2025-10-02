package me.oriient.internal.services.eventManager;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes7.dex */
public final class a implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f25451a;

    public a(w wVar) {
        this.f25451a = wVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        w wVar = this.f25451a;
        if (wVar.h && zBooleanValue && wVar.f.getValue() != EventManagerState.ONLINE) {
            w.c(this.f25451a);
        }
        return Unit.f24250a;
    }
}
