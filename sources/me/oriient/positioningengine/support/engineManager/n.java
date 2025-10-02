package me.oriient.positioningengine.support.engineManager;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.positioningengine.ondevice.util.locationReporter.LocationReporter;

/* loaded from: classes8.dex */
public final class n extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SupportPositioningEngineManagerImpl f26538a;
    public final /* synthetic */ double b;
    public final /* synthetic */ Boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(SupportPositioningEngineManagerImpl supportPositioningEngineManagerImpl, double d, Boolean bool, Continuation continuation) {
        super(2, continuation);
        this.f26538a = supportPositioningEngineManagerImpl;
        this.b = d;
        this.c = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new n(this.f26538a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        this.f26538a.deviceDataFetchTimeoutSeconds = this.b;
        Boolean bool = this.c;
        if (bool != null) {
            SupportPositioningEngineManagerImpl supportPositioningEngineManagerImpl = this.f26538a;
            boolean zBooleanValue = bool.booleanValue();
            LocationReporter locationReporter = supportPositioningEngineManagerImpl.locationReporter;
            if (locationReporter != null) {
                locationReporter.setEnabled(zBooleanValue);
            }
        }
        return Unit.f24250a;
    }
}
