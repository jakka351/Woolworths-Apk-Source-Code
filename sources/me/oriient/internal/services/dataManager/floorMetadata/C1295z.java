package me.oriient.internal.services.dataManager.floorMetadata;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: me.oriient.internal.services.dataManager.floorMetadata.z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1295z extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public F f25173a;
    public FloorFetchData b;
    public /* synthetic */ Object c;
    public final /* synthetic */ F d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1295z(F f, Continuation continuation) {
        super(continuation);
        this.d = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.cleanData((FloorFetchData) null, (Continuation) this);
    }
}
