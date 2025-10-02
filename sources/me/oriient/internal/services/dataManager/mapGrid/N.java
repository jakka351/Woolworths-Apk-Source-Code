package me.oriient.internal.services.dataManager.mapGrid;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class N extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public U f25200a;
    public C1324w b;
    public /* synthetic */ Object c;
    public final /* synthetic */ U d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(U u, Continuation continuation) {
        super(continuation);
        this.d = u;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.fetchData((C1324w) null, (Continuation) this);
    }
}
