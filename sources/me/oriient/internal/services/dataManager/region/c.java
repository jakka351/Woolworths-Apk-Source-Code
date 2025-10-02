package me.oriient.internal.services.dataManager.region;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class c extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public g f25393a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ g d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, Continuation continuation) {
        super(continuation);
        this.d = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.getExitRegions(null, this);
    }
}
