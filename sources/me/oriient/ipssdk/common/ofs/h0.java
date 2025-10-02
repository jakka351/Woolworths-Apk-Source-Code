package me.oriient.ipssdk.common.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import me.oriient.internal.infra.rest.OriientApi;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfig;
import me.oriient.ipssdk.common.services.elog.SdkELog;

/* loaded from: classes2.dex */
public final class h0 extends SuspendLambda implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ RemoteConfig f25752a;
    public /* synthetic */ OriientApi b;
    public final /* synthetic */ SdkELog c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(SdkELog sdkELog, Continuation continuation) {
        super(3, continuation);
        this.c = sdkELog;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        h0 h0Var = new h0(this.c, (Continuation) obj3);
        h0Var.f25752a = (RemoteConfig) obj;
        h0Var.b = (OriientApi) obj2;
        return h0Var.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        RemoteConfig remoteConfig = this.f25752a;
        SdkELog.access$onConfigOrApiChanged(this.c, remoteConfig.getCommon().getELog(), this.b);
        return Unit.f24250a;
    }
}
