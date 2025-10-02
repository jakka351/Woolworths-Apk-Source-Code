package me.oriient.internal.services.dataManager.plai;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.internal.services.dataManager.building.BuildingId;

/* renamed from: me.oriient.internal.services.dataManager.plai.p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1366p extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C1372w f25308a;
    public BuildingId b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C1372w d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1366p(C1372w c1372w, Continuation continuation) {
        super(continuation);
        this.d = c1372w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
