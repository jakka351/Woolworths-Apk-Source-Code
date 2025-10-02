package me.oriient.internal.services.geofence.strategy;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.internal.infra.locationManager.SystemLocation;

/* loaded from: classes7.dex */
public final class x implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f25516a;
    public final /* synthetic */ String b;

    public x(z zVar, String str) {
        this.f25516a = zVar;
        this.b = str;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Object objA = z.a(this.f25516a, this.b, (SystemLocation) obj, continuation);
        return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
    }
}
