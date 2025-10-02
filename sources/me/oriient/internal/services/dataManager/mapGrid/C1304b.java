package me.oriient.internal.services.dataManager.mapGrid;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: me.oriient.internal.services.dataManager.mapGrid.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1304b extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25209a;
    public final /* synthetic */ C1305c b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1304b(C1305c c1305c, Continuation continuation) {
        super(continuation);
        this.b = c1305c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25209a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
