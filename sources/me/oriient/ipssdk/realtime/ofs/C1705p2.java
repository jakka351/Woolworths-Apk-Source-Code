package me.oriient.ipssdk.realtime.ofs;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.ipssdk.ips.IPSDebugging;

/* renamed from: me.oriient.ipssdk.realtime.ofs.p2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1705p2 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26127a;
    public final /* synthetic */ IPSDebugging b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1705p2(IPSDebugging iPSDebugging, Continuation continuation) {
        super(continuation);
        this.b = iPSDebugging;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26127a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.getProductsLocations(null, this);
    }
}
