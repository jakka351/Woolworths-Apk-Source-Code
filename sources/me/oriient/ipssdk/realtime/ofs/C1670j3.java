package me.oriient.ipssdk.realtime.ofs;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.j3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1670j3 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public me.oriient.ipssdk.realtime.ips.j f26094a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ me.oriient.ipssdk.realtime.ips.j d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1670j3(me.oriient.ipssdk.realtime.ips.j jVar, Continuation continuation) {
        super(continuation);
        this.d = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.startFromKioskPositioning(null, this);
    }
}
