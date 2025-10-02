package me.oriient.internal.services.retryOperation;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import me.oriient.internal.infra.utils.core.Logger;

/* loaded from: classes7.dex */
public final class a extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public String f25544a;
    public String b;
    public Logger c;
    public Function1 d;
    public Ref.LongRef e;
    public long f;
    public double g;
    public int h;
    public int i;
    public int j;
    public /* synthetic */ Object k;
    public int l;

    public a(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.l |= Integer.MIN_VALUE;
        return RetryExtensionsKt.retryTo(null, null, null, 0, 0L, 0L, 0.0d, null, this);
    }
}
