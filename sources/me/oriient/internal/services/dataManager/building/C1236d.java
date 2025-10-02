package me.oriient.internal.services.dataManager.building;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: me.oriient.internal.services.dataManager.building.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1236d extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public v f25100a;
    public /* synthetic */ Object b;
    public final /* synthetic */ v c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1236d(v vVar, Continuation continuation) {
        super(continuation);
        this.c = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.cleanCache(this);
    }
}
