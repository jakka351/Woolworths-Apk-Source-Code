package me.oriient.ipssdk.realtime.ofs;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.ipssdk.realtime.ips.automatic.AutomaticSessionStopperImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1690n extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public AutomaticSessionStopperImpl f26113a;
    public /* synthetic */ Object b;
    public final /* synthetic */ AutomaticSessionStopperImpl c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1690n(AutomaticSessionStopperImpl automaticSessionStopperImpl, Continuation continuation) {
        super(continuation);
        this.c = automaticSessionStopperImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return AutomaticSessionStopperImpl.access$stopPositioning(this.c, this);
    }
}
