package me.oriient.ipssdk.realtime.ofs;

import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import me.oriient.ipssdk.realtime.ips.automatic.AutomaticSessionStopperImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1660i extends SuspendLambda implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Map f26085a;
    public final /* synthetic */ AutomaticSessionStopperImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1660i(AutomaticSessionStopperImpl automaticSessionStopperImpl, Continuation continuation) {
        super(3, continuation);
        this.b = automaticSessionStopperImpl;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C1660i c1660i = new C1660i(this.b, (Continuation) obj3);
        c1660i.f26085a = (Map) obj;
        return c1660i.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        return Boolean.valueOf(AutomaticSessionStopperImpl.access$shouldStopPositioning(this.b, this.f26085a));
    }
}
