package me.oriient.internal.services.dataManager.building;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.internal.infra.utils.core.Outcome;

/* renamed from: me.oriient.internal.services.dataManager.building.h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1240h extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public v f25104a;
    public String b;
    public Outcome.Success c;
    public /* synthetic */ Object d;
    public final /* synthetic */ v e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1240h(v vVar, Continuation continuation) {
        super(continuation);
        this.e = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.fetchBuildingByClientId(null, this);
    }
}
