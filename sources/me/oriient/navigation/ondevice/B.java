package me.oriient.navigation.ondevice;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class B extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public J f26272a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ J d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(J j, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return J.a(this.d, null, this);
    }
}
