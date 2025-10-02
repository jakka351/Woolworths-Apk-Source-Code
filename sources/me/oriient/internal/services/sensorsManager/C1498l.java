package me.oriient.internal.services.sensorsManager;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.internal.infra.locationManager.SystemLocation;

/* renamed from: me.oriient.internal.services.sensorsManager.l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1498l implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1502p f25580a;

    public C1498l(C1502p c1502p) {
        this.f25580a = c1502p;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        C1502p c1502p = this.f25580a;
        c1502p.getClass();
        c1502p.a((SystemLocation) obj);
        return Unit.f24250a;
    }
}
