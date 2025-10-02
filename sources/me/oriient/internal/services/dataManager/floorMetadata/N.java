package me.oriient.internal.services.dataManager.floorMetadata;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class N extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public U f25144a;
    public FloorFetchData b;
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
        return this.d.cleanData((FloorFetchData) null, (Continuation) this);
    }
}
