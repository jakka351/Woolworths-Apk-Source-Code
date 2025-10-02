package me.oriient.internal.services.dataManager.floorMetadata;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class D extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public F f25136a;
    public FloorMetadataWithImage b;
    public /* synthetic */ Object c;
    public final /* synthetic */ F d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(F f, Continuation continuation) {
        super(continuation);
        this.d = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.save((FloorFetchData) null, (FloorMetadataWithImage) null, (Continuation) this);
    }
}
