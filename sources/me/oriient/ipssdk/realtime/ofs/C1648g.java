package me.oriient.ipssdk.realtime.ofs;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.SharedFlow;
import me.oriient.ipssdk.realtime.ips.automatic.AutomaticNotLockedSessionStopper;
import me.oriient.positioningengine.common.PositioningEngine;
import me.oriient.positioningengine.common.ValidationUpdate;

/* renamed from: me.oriient.ipssdk.realtime.ofs.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1648g extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26074a;
    public final /* synthetic */ AutomaticNotLockedSessionStopper b;
    public final /* synthetic */ PositioningEngine c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1648g(AutomaticNotLockedSessionStopper automaticNotLockedSessionStopper, PositioningEngine positioningEngine, Continuation continuation) {
        super(2, continuation);
        this.b = automaticNotLockedSessionStopper;
        this.c = positioningEngine;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1648g(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1648g(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26074a;
        if (i == 0) {
            ResultKt.b(obj);
            AutomaticNotLockedSessionStopper.access$getLogger(this.b).d("AutomaticNotLockedSessi", "start: start observing");
            SharedFlow<ValidationUpdate> validationUpdates = this.c.getValidationUpdates();
            me.oriient.ipssdk.realtime.ips.automatic.b bVar = new me.oriient.ipssdk.realtime.ips.automatic.b(this.b);
            this.f26074a = 1;
            if (validationUpdates.collect(bVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
