package me.oriient.internal.services.geofence.strategy;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.internal.infra.locationManager.SystemLocation;

/* loaded from: classes7.dex */
public final class i implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f25504a;
    public final /* synthetic */ String b;

    public i(p pVar, String str) {
        this.f25504a = pVar;
        this.b = str;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Object objA = p.a(this.f25504a, this.b, (SystemLocation) obj, continuation);
        return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
    }
}
