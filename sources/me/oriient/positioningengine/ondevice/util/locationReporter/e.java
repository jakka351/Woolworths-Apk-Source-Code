package me.oriient.positioningengine.ondevice.util.locationReporter;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.SharedFlow;
import me.oriient.positioningengine.common.PositioningContext;
import me.oriient.positioningengine.common.PositioningUpdate;

/* loaded from: classes8.dex */
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26486a;
    public final /* synthetic */ h b;
    public final /* synthetic */ PositioningContext c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, PositioningContext positioningContext, Continuation continuation) {
        super(2, continuation);
        this.b = hVar;
        this.c = positioningContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new e(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26486a;
        if (i == 0) {
            ResultKt.b(obj);
            SharedFlow<PositioningUpdate> positioningUpdates = this.b.f26489a.getPositioningUpdates();
            d dVar = new d(this.b, this.c);
            this.f26486a = 1;
            if (positioningUpdates.collect(dVar, this) == coroutineSingletons) {
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
