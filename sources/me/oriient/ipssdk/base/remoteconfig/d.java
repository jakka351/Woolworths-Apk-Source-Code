package me.oriient.ipssdk.base.remoteconfig;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import me.oriient.ipssdk.base.auth.User;

/* loaded from: classes2.dex */
public final class d extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f25707a;
    public final /* synthetic */ RemoteConfigManagerImpl b;
    public final /* synthetic */ User c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(RemoteConfigManagerImpl remoteConfigManagerImpl, User user, Continuation continuation) {
        super(1, continuation);
        this.b = remoteConfigManagerImpl;
        this.c = user;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new d(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new d(this.b, this.c, (Continuation) obj).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25707a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        RemoteConfigRest remoteConfigRestAccess$getRemoteConfigRest = RemoteConfigManagerImpl.access$getRemoteConfigRest(this.b);
        User user = this.c;
        this.f25707a = 1;
        Object objFetchRemoteConfig = remoteConfigRestAccess$getRemoteConfigRest.fetchRemoteConfig(user, this);
        return objFetchRemoteConfig == coroutineSingletons ? coroutineSingletons : objFetchRemoteConfig;
    }
}
