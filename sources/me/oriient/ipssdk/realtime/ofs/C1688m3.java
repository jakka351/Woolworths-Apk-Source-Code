package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.ipssdk.realtime.ips.Positioning;
import me.oriient.ipssdk.realtime.ips.automatic.AutomaticPositioningStarterDelegate;

/* renamed from: me.oriient.ipssdk.realtime.ofs.m3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1688m3 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26111a;
    public /* synthetic */ Object b;

    public C1688m3(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C1688m3 c1688m3 = new C1688m3(continuation);
        c1688m3.b = obj;
        return c1688m3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C1688m3 c1688m3 = new C1688m3((Continuation) obj2);
        c1688m3.b = (String) obj;
        return c1688m3.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26111a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        String str = (String) this.b;
        AutomaticPositioningStarterDelegate automaticPositioningStarterDelegate = Positioning.L;
        this.f26111a = 1;
        Object objStartPositioning = automaticPositioningStarterDelegate.startPositioning(str, this);
        return objStartPositioning == coroutineSingletons ? coroutineSingletons : objStartPositioning;
    }
}
