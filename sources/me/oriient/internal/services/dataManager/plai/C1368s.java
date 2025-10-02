package me.oriient.internal.services.dataManager.plai;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: me.oriient.internal.services.dataManager.plai.s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1368s extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C1372w f25311a;
    public String b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ C1372w e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1368s(C1372w c1372w, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = c1372w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.getData((String) null, (String) null, this);
    }
}
