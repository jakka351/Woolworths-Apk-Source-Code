package me.oriient.internal.services.dataManager.plaiCategories;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: me.oriient.internal.services.dataManager.plaiCategories.p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1391p extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C1397w f25353a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C1397w d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1391p(C1397w c1397w, Continuation continuation) {
        super(continuation);
        this.d = c1397w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.getCategoryInfo(null, this);
    }
}
