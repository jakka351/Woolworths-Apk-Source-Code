package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.ipssdk.ips.IPSDataStatusObserver;
import me.oriient.ipssdk.realtime.ips.DataManager;

/* renamed from: me.oriient.ipssdk.realtime.ofs.u1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1732u1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IPSDataStatusObserver f26155a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1732u1(IPSDataStatusObserver iPSDataStatusObserver, Continuation continuation) {
        super(2, continuation);
        this.f26155a = iPSDataStatusObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1732u1(this.f26155a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1732u1(this.f26155a, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        DataManager.f25825a.remove(this.f26155a);
        return Unit.f24250a;
    }
}
