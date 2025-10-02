package me.oriient.internal.services.dataManager.plai;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class K extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public S f25282a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ S d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(S s, Continuation continuation) {
        super(continuation);
        this.d = s;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.getPlaiInfo(null, this);
    }
}
