package me.oriient.ipssdk.realtime.ofs;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.locationManager.SystemLocation;
import me.oriient.internal.services.retryOperation.RetryOperationKt;
import me.oriient.internal.services.retryOperation.RetryStrategy;
import me.oriient.ipssdk.api.listeners.IPSCompletionListener;
import me.oriient.ipssdk.api.models.IPSStartingPosition;
import me.oriient.ipssdk.base.remoteconfig.MiscRealtimeConfig;
import me.oriient.ipssdk.realtime.ips.PositioningKotlinHelper;

/* loaded from: classes8.dex */
public final class B3 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25916a;
    public final /* synthetic */ PositioningKotlinHelper b;
    public final /* synthetic */ IPSCompletionListener c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ List e;
    public final /* synthetic */ IPSStartingPosition f;
    public final /* synthetic */ SystemLocation g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B3(List list, Continuation continuation, SystemLocation systemLocation, IPSCompletionListener iPSCompletionListener, IPSStartingPosition iPSStartingPosition, PositioningKotlinHelper positioningKotlinHelper, boolean z) {
        super(2, continuation);
        this.b = positioningKotlinHelper;
        this.c = iPSCompletionListener;
        this.d = z;
        this.e = list;
        this.f = iPSStartingPosition;
        this.g = systemLocation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PositioningKotlinHelper positioningKotlinHelper = this.b;
        IPSCompletionListener iPSCompletionListener = this.c;
        boolean z = this.d;
        return new B3(this.e, continuation, this.g, iPSCompletionListener, this.f, positioningKotlinHelper, z);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((B3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25916a;
        if (i == 0) {
            ResultKt.b(obj);
            this.b.e = null;
            MiscRealtimeConfig misc = PositioningKotlinHelper.access$getConfigManager(this.b).getRealTimeConfig().getMisc();
            float startPositioningRetryIntervalSec = misc.getStartPositioningRetryIntervalSec() * TimeUnit.SECONDS.toMillis(1L);
            int startPositioningRetryCount = misc.getStartPositioningRetryCount();
            long j = (long) startPositioningRetryIntervalSec;
            RetryStrategy retryStrategy = RetryStrategy.CONSTANT;
            C1754y3 c1754y3 = new C1754y3(this.b, this.c);
            boolean z = this.d;
            me.oriient.ipssdk.realtime.ips.o oVar = new me.oriient.ipssdk.realtime.ips.o(this.e, null, this.g, this.c, this.f, this.b, z);
            this.f25916a = 1;
            if (RetryOperationKt.retryOperation$default(startPositioningRetryCount, 0L, j, 0L, retryStrategy, c1754y3, oVar, this, 10, null) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
