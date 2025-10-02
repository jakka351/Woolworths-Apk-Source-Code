package me.oriient.navigation.ondevice;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.Outcome;

/* loaded from: classes8.dex */
public final class H extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26278a;
    public final /* synthetic */ J b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(J j, String str, Continuation continuation) {
        super(2, continuation);
        this.b = j;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new H(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new H(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26278a;
        if (i == 0) {
            ResultKt.b(obj);
            ((Logger) this.b.f26280a.getD()).d("OnDeviceNavigationCore", "preloadNavigationData() called with: buildingId = " + this.c);
            InterfaceC1785a interfaceC1785a = (InterfaceC1785a) this.b.d.getD();
            String str = this.c;
            this.f26278a = 1;
            obj = ((o) interfaceC1785a).a(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return ((Outcome) obj).mapToUnit();
    }
}
