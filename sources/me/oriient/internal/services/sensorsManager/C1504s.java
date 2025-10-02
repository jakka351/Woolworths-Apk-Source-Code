package me.oriient.internal.services.sensorsManager;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.internal.infra.locationManager.SystemLocation;

/* renamed from: me.oriient.internal.services.sensorsManager.s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1504s implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1508w f25590a;

    public C1504s(C1508w c1508w) {
        this.f25590a = c1508w;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        C1508w c1508w = this.f25590a;
        c1508w.getClass();
        c1508w.a((SystemLocation) obj);
        return Unit.f24250a;
    }
}
