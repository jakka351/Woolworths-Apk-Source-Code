package me.oriient.ipssdk.base.remoteconfig;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.services.config.InternalConfig;
import me.oriient.internal.services.config.InternalConfigManager;

/* loaded from: classes2.dex */
public final class b extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25705a;
    public final /* synthetic */ RemoteConfigManagerImpl b;
    public final /* synthetic */ RemoteConfig c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RemoteConfigManagerImpl remoteConfigManagerImpl, RemoteConfig remoteConfig, Continuation continuation) {
        super(2, continuation);
        this.b = remoteConfigManagerImpl;
        this.c = remoteConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new b(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25705a;
        if (i == 0) {
            ResultKt.b(obj);
            InternalConfigManager internalConfigManagerAccess$getInternalConfigManager = RemoteConfigManagerImpl.access$getInternalConfigManager(this.b);
            InternalConfig internalConfig = this.c.toInternalConfig();
            this.f25705a = 1;
            if (internalConfigManagerAccess$getInternalConfigManager.onNewConfig(internalConfig, this) == coroutineSingletons) {
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
