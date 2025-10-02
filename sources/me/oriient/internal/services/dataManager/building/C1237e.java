package me.oriient.internal.services.dataManager.building;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: me.oriient.internal.services.dataManager.building.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1237e extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public v f25101a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ v d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1237e(v vVar, Continuation continuation) {
        super(continuation);
        this.d = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.fetchBuilding(null, this);
    }
}
