package me.oriient.navigation.ondevice;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.navigation.common.models.NavigationWaypoint;
import me.oriient.navigation.common.util.NavigationError;

/* loaded from: classes8.dex */
public final class A extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26271a;
    public final /* synthetic */ J b;
    public final /* synthetic */ String c;
    public final /* synthetic */ List d;
    public final /* synthetic */ NavigationWaypoint e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(J j, String str, List list, NavigationWaypoint navigationWaypoint, Continuation continuation) {
        super(2, continuation);
        this.b = j;
        this.c = str;
        this.d = list;
        this.e = navigationWaypoint;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new A(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((A) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26271a;
        if (i == 0) {
            ResultKt.b(obj);
            ((Logger) this.b.f26280a.getD()).d("OnDeviceNavigationCore", "findRouteInBuilding() called with: buildingId = " + this.c + ", waypoints = " + this.d + ", finalWaypoint = " + this.e);
            if (this.d.size() + (this.e != null ? 1 : 0) <= 1) {
                return new Outcome.Failure(new NavigationError.InvalidInputError("Must have at least two waypoints"));
            }
            J j = this.b;
            String str = this.c;
            this.f26271a = 1;
            obj = J.a(j, str, this);
            if (obj != coroutineSingletons) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        z zVar = new z(this.b, this.c, this.d, this.e, null);
        this.f26271a = 2;
        Object objThen = ((Outcome) obj).then(zVar, this);
        return objThen == coroutineSingletons ? coroutineSingletons : objThen;
    }
}
