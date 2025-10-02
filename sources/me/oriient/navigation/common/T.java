package me.oriient.navigation.common;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.navigation.common.models.NavigationWaypoint;

/* loaded from: classes8.dex */
public final class T extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26223a;
    public /* synthetic */ Object b;
    public final /* synthetic */ InterfaceC1783y c;
    public final /* synthetic */ String d;
    public final /* synthetic */ NavigationWaypoint e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(InterfaceC1783y interfaceC1783y, String str, NavigationWaypoint navigationWaypoint, Continuation continuation) {
        super(2, continuation);
        this.c = interfaceC1783y;
        this.d = str;
        this.e = navigationWaypoint;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        T t = new T(this.c, this.d, this.e, continuation);
        t.b = obj;
        return t;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((T) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26223a;
        if (i == 0) {
            ResultKt.b(obj);
            List list2 = (List) this.b;
            InterfaceC1783y interfaceC1783y = this.c;
            String str = this.d;
            NavigationWaypoint navigationWaypoint = this.e;
            this.b = list2;
            this.f26223a = 1;
            me.oriient.navigation.ondevice.J j = (me.oriient.navigation.ondevice.J) interfaceC1783y;
            obj = BuildersKt.f(((CoroutineScope) j.f.getD()).getE(), new me.oriient.navigation.ondevice.A(j, str, list2, navigationWaypoint, null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            list = list2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) this.b;
            ResultKt.b(obj);
        }
        return ((Outcome) obj).map(new S(list, this.e, this.d));
    }
}
