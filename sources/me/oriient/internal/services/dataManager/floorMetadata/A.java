package me.oriient.internal.services.dataManager.floorMetadata;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class A extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public F f25133a;
    public /* synthetic */ Object b;
    public final /* synthetic */ F c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(F f, Continuation continuation) {
        super(continuation);
        this.c = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.getData((FloorFetchData) null, false, (Continuation) this);
    }
}
