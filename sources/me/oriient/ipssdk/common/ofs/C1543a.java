package me.oriient.ipssdk.common.ofs;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.ipssdk.common.services.rest.services.BuildingsRestServiceImpl;

/* renamed from: me.oriient.ipssdk.common.ofs.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1543a extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public BuildingsRestServiceImpl f25738a;
    public /* synthetic */ Object b;
    public final /* synthetic */ BuildingsRestServiceImpl c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1543a(BuildingsRestServiceImpl buildingsRestServiceImpl, Continuation continuation) {
        super(continuation);
        this.c = buildingsRestServiceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return BuildingsRestServiceImpl.m436access$getAllBuildingsSyncR0umqfA(this.c, null, null, null, this);
    }
}
