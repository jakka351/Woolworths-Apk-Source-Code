package me.oriient.internal.services.sensorsManager;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* renamed from: me.oriient.internal.services.sensorsManager.u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1506u implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1508w f25606a;

    public C1506u(C1508w c1508w) {
        this.f25606a = c1508w;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        this.f25606a.getELog().e("LocationSensorWrapper", "LocationSensorWrapper error", MapsKt.i(new Pair("errorMessage", ((Error) obj).getMessage())));
        return Unit.f24250a;
    }
}
