package me.oriient.internal.services.dataManager.floorMetadata;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class O extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public U f25145a;
    public /* synthetic */ Object b;
    public final /* synthetic */ U c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(U u, Continuation continuation) {
        super(continuation);
        this.c = u;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.getData((FloorFetchData) null, false, (Continuation) this);
    }
}
