package me.oriient.internal.services.dataManager.floorMetadata;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class W extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Z f25151a;
    public FloorFetchData b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Z d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(Z z, Continuation continuation) {
        super(continuation);
        this.d = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.fetchData((FloorFetchData) null, (Continuation) this);
    }
}
