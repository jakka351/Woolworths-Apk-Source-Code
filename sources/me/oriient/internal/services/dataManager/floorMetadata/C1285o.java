package me.oriient.internal.services.dataManager.floorMetadata;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: me.oriient.internal.services.dataManager.floorMetadata.o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1285o extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public FloorMetadataRepositoryImpl f25165a;
    public FloorFetchData b;
    public /* synthetic */ Object c;
    public final /* synthetic */ FloorMetadataRepositoryImpl d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1285o(FloorMetadataRepositoryImpl floorMetadataRepositoryImpl, Continuation continuation) {
        super(continuation);
        this.d = floorMetadataRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.cleanData(null, null, this);
    }
}
