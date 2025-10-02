package me.oriient.internal.services.dataManager.rest;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final class i extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public RestHelperImpl f25407a;
    public String b;
    public String c;
    public Function1 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ RestHelperImpl f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(RestHelperImpl restHelperImpl, Continuation continuation) {
        super(continuation);
        this.f = restHelperImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.postData(null, null, null, null, false, false, null, this);
    }
}
