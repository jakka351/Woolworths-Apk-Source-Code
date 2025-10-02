package me.oriient.internal.services.dataManager.plaiCategories;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: me.oriient.internal.services.dataManager.plaiCategories.m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1388m extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C1397w f25351a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C1397w c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1388m(C1397w c1397w, Continuation continuation) {
        super(continuation);
        this.c = c1397w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.cleanData(this);
    }
}
