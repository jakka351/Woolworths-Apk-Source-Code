package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.ipssdk.api.listeners.IPSCompletionListener;

/* renamed from: me.oriient.ipssdk.realtime.ofs.z3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1759z3 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IPSCompletionListener f26185a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1759z3(IPSCompletionListener iPSCompletionListener, Continuation continuation) {
        super(2, continuation);
        this.f26185a = iPSCompletionListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1759z3(this.f26185a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1759z3(this.f26185a, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        this.f26185a.onCompleted();
        return Unit.f24250a;
    }
}
