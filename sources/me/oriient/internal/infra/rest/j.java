package me.oriient.internal.infra.rest;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import okhttp3.Request;

/* loaded from: classes7.dex */
public final class j extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public RestServiceImpl f24979a;
    public RequestBuilder b;
    public Function1 c;
    public Request d;
    public f e;
    public long f;
    public /* synthetic */ Object g;
    public final /* synthetic */ RestServiceImpl h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(RestServiceImpl restServiceImpl, Continuation continuation) {
        super(continuation);
        this.h = restServiceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.makeRequest(null, null, this);
    }
}
