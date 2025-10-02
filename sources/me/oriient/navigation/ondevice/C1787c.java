package me.oriient.navigation.ondevice;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: me.oriient.navigation.ondevice.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1787c extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public o f26282a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ o d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1787c(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
