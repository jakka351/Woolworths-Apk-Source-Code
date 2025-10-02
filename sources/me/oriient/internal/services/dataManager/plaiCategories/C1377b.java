package me.oriient.internal.services.dataManager.plaiCategories;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.internal.services.dataManager.building.BuildingId;

/* renamed from: me.oriient.internal.services.dataManager.plaiCategories.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1377b extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C1384i f25341a;
    public BuildingId b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C1384i d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1377b(C1384i c1384i, Continuation continuation) {
        super(continuation);
        this.d = c1384i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
