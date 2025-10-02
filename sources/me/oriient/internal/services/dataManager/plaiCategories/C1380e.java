package me.oriient.internal.services.dataManager.plaiCategories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: me.oriient.internal.services.dataManager.plaiCategories.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1380e extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C1384i f25344a;
    public String b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ C1384i e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1380e(C1384i c1384i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = c1384i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.getData((String) null, (String) null, this);
    }
}
