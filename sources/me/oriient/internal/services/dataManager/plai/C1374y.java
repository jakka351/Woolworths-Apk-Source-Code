package me.oriient.internal.services.dataManager.plai;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.internal.services.dataManager.building.BuildingId;

/* renamed from: me.oriient.internal.services.dataManager.plai.y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1374y extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public D f25316a;
    public BuildingId b;
    public /* synthetic */ Object c;
    public final /* synthetic */ D d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1374y(D d, Continuation continuation) {
        super(continuation);
        this.d = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.fetchData((BuildingId) null, (Continuation) this);
    }
}
