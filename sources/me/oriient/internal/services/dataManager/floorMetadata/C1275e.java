package me.oriient.internal.services.dataManager.floorMetadata;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: me.oriient.internal.services.dataManager.floorMetadata.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1275e extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25158a;
    public final /* synthetic */ C1279i b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1275e(C1279i c1279i, Continuation continuation) {
        super(continuation);
        this.b = c1279i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25158a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, false, this);
    }
}
