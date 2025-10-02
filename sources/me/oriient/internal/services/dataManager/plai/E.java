package me.oriient.internal.services.dataManager.plai;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;

/* loaded from: classes7.dex */
public final class E extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25278a;
    public final /* synthetic */ S b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(S s, Continuation continuation) {
        super(2, continuation);
        this.b = s;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new E(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new E(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25278a;
        Unit unit = Unit.f24250a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        S s = this.b;
        int plaiInfoCacheExpirationDays = s.a().getPlaiInfoCacheExpirationDays();
        this.f25278a = 1;
        C1364n c1364n = (C1364n) ((InterfaceC1351a) s.f25289a.f25315a.getD());
        c1364n.getClass();
        BuildersKt.c(c1364n.f25306a, null, null, new C1357g(new C1356f(c1364n, plaiInfoCacheExpirationDays, null), c1364n, null), 3);
        return unit == coroutineSingletons ? coroutineSingletons : unit;
    }
}
