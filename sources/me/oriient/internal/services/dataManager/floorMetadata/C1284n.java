package me.oriient.internal.services.dataManager.floorMetadata;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: me.oriient.internal.services.dataManager.floorMetadata.n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1284n extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public FloorMetadataRepositoryImpl f25164a;
    public /* synthetic */ Object b;
    public final /* synthetic */ FloorMetadataRepositoryImpl c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1284n(FloorMetadataRepositoryImpl floorMetadataRepositoryImpl, Continuation continuation) {
        super(continuation);
        this.c = floorMetadataRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.cleanCache(this);
    }
}
