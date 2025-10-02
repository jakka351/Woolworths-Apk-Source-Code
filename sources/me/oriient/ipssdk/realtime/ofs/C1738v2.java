package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.ipssdk.base.utils.SdkError;
import me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityEventWrapperImpl;
import me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityLocationResolver;
import me.oriient.positioningengine.common.PositioningUpdate;

/* renamed from: me.oriient.ipssdk.realtime.ofs.v2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1738v2 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26161a;
    public final /* synthetic */ LocalProximityEventWrapperImpl b;
    public final /* synthetic */ PositioningUpdate c;
    public final /* synthetic */ AbstractC1733u2 d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1738v2(LocalProximityEventWrapperImpl localProximityEventWrapperImpl, PositioningUpdate positioningUpdate, AbstractC1733u2 abstractC1733u2, long j, Continuation continuation) {
        super(2, continuation);
        this.b = localProximityEventWrapperImpl;
        this.c = positioningUpdate;
        this.d = abstractC1733u2;
        this.e = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1738v2(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1738v2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26161a;
        if (i == 0) {
            ResultKt.b(obj);
            LocalProximityLocationResolver localProximityLocationResolverAccess$getResolver = LocalProximityEventWrapperImpl.access$getResolver(this.b);
            PositioningUpdate positioningUpdate = this.c;
            this.f26161a = 1;
            obj = localProximityLocationResolverAccess$getResolver.isPositionInside(positioningUpdate, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        Outcome outcome = (Outcome) obj;
        LocalProximityEventWrapperImpl localProximityEventWrapperImpl = this.b;
        AbstractC1733u2 abstractC1733u2 = this.d;
        long j = this.e;
        if (outcome instanceof Outcome.Success) {
            LocalProximityEventWrapperImpl.access$onResolverSuccess(localProximityEventWrapperImpl, ((Boolean) ((Outcome.Success) outcome).getValue()).booleanValue(), abstractC1733u2, j);
        }
        LocalProximityEventWrapperImpl localProximityEventWrapperImpl2 = this.b;
        AbstractC1733u2 abstractC1733u22 = this.d;
        if (outcome instanceof Outcome.Failure) {
            LocalProximityEventWrapperImpl.access$onResolverError(localProximityEventWrapperImpl2, (SdkError) ((Outcome.Failure) outcome).getValue(), abstractC1733u22);
        }
        return Unit.f24250a;
    }
}
