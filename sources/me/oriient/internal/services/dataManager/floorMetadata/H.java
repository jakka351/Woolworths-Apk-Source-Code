package me.oriient.internal.services.dataManager.floorMetadata;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class H extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public K f25139a;
    public FloorFetchData b;
    public /* synthetic */ Object c;
    public final /* synthetic */ K d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(K k, Continuation continuation) {
        super(continuation);
        this.d = k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.fetchData((FloorFetchData) null, (Continuation) this);
    }
}
