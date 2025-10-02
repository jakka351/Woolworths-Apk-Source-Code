package me.oriient.internal.services.eventManager;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.services.eventManager.model.EventError;

/* loaded from: classes7.dex */
public final class m extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f25461a;
    public final /* synthetic */ Exception b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(w wVar, Exception exc, Continuation continuation) {
        super(2, continuation);
        this.f25461a = wVar;
        this.b = exc;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new m(this.f25461a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new m(this.f25461a, this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        w.a(this.f25461a).e("EventManager", "onSocketError " + this.b.getLocalizedMessage(), this.b);
        this.f25461a.d.e("EventManager", "Socket error", MapsKt.i(new Pair("errorMessage", this.b.getLocalizedMessage())));
        this.f25461a.a((EventError) new EventError.ServerError(this.b.getLocalizedMessage()));
        return Unit.f24250a;
    }
}
