package me.oriient.ipssdk.realtime.ofs;

import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;
import me.oriient.ipssdk.realtime.ips.CoreLogic;

/* loaded from: classes8.dex */
public final class S0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26004a;

    public S0(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new S0(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new S0((Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26004a;
        if (i == 0) {
            ResultKt.b(obj);
            long millis = TimeUnit.MINUTES.toMillis((long) (CoreLogic.access$getConfigManager(CoreLogic.INSTANCE).getRealTimeConfig().getMisc().getPeriodicCacheRefreshingTimeHours() * 60.0d));
            this.f26004a = 1;
            if (DelayKt.b(millis, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        CoreLogic.access$refreshCaches(CoreLogic.INSTANCE);
        return Unit.f24250a;
    }
}
