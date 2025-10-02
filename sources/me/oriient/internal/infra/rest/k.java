package me.oriient.internal.infra.rest;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import okhttp3.Request;

/* loaded from: classes7.dex */
public final class k extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RestServiceImpl f24980a;
    public final /* synthetic */ Request b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(RestServiceImpl restServiceImpl, Request request, Continuation continuation) {
        super(2, continuation);
        this.f24980a = restServiceImpl;
        this.b = request;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(this.f24980a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new k(this.f24980a, this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        return FirebasePerfOkHttpClient.execute(this.f24980a.httpClientProvider.getClient().a(this.b));
    }
}
