package me.oriient.internal.services.auth;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final class O extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public AuthenticatedRestServiceImpl f25019a;
    public Function1 b;
    public Function2 c;
    public Credentials d;
    public /* synthetic */ Object e;
    public final /* synthetic */ AuthenticatedRestServiceImpl f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(AuthenticatedRestServiceImpl authenticatedRestServiceImpl, Continuation continuation) {
        super(continuation);
        this.f = authenticatedRestServiceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.putImpl(null, null, this);
    }
}
