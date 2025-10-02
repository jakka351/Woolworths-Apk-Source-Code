package me.oriient.ipssdk.common.ofs;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfig;
import me.oriient.ipssdk.common.services.geofencing.LiveGeofenceManagerImpl;

/* loaded from: classes2.dex */
public final class N extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25727a;
    public final /* synthetic */ LiveGeofenceManagerImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(LiveGeofenceManagerImpl liveGeofenceManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.b = liveGeofenceManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new N(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new N(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25727a;
        if (i == 0) {
            ResultKt.b(obj);
            StateFlow<RemoteConfig> config = LiveGeofenceManagerImpl.access$getConfigManager(this.b).getConfig();
            M m = new M(this.b);
            this.f25727a = 1;
            if (config.collect(m, this) == coroutineSingletons) {
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
