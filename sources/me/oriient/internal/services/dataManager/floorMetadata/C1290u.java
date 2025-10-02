package me.oriient.internal.services.dataManager.floorMetadata;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: me.oriient.internal.services.dataManager.floorMetadata.u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1290u extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25169a;
    public final /* synthetic */ C1292w b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1290u(C1292w c1292w, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c1292w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25169a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, this);
    }
}
