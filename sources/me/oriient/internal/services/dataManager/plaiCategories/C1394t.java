package me.oriient.internal.services.dataManager.plaiCategories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: me.oriient.internal.services.dataManager.plaiCategories.t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1394t extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C1397w f25356a;
    public String b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ C1397w e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1394t(C1397w c1397w, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = c1397w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return C1397w.a(this.e, null, null, this);
    }
}
