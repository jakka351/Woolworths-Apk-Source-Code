package me.oriient.internal.services.dataManager.floorMetadata;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: me.oriient.internal.services.dataManager.floorMetadata.y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1294y extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public F f25172a;
    public /* synthetic */ Object b;
    public final /* synthetic */ F c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1294y(F f, Continuation continuation) {
        super(continuation);
        this.c = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.clean(this);
    }
}
