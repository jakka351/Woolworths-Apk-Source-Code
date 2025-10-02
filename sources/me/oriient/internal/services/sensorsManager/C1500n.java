package me.oriient.internal.services.sensorsManager;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* renamed from: me.oriient.internal.services.sensorsManager.n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1500n implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1502p f25584a;

    public C1500n(C1502p c1502p) {
        this.f25584a = c1502p;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        this.f25584a.getELog().e("p", "LocationSensorWrapper error", MapsKt.i(new Pair("errorMessage", ((Error) obj).getMessage())));
        return Unit.f24250a;
    }
}
