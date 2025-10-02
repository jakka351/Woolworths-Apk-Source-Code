package me.oriient.internal.services.dataManager.floorMetadata;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: me.oriient.internal.services.dataManager.floorMetadata.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1277g extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25160a;
    public final /* synthetic */ C1279i b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1277g(C1279i c1279i, Continuation continuation) {
        super(continuation);
        this.b = c1279i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25160a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, false, this);
    }
}
