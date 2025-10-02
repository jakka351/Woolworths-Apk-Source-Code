package me.oriient.ipssdk.realtime.ofs;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.ipssdk.realtime.ips.Navigation;
import me.oriient.navigation.common.NavigationManager;

/* loaded from: classes8.dex */
public final class N2 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25981a;

    public N2(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new N2(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new N2((Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25981a;
        if (i == 0) {
            ResultKt.b(obj);
            Navigation navigation = Navigation.INSTANCE;
            navigation.setLiveNavigationWaypoints(new ArrayList());
            navigation.setLiveNavigationFinalWaypoint(null);
            NavigationManager navigationManagerAccess$getNavigationManager = Navigation.access$getNavigationManager(navigation);
            this.f25981a = 1;
            if (navigationManagerAccess$getNavigationManager.cleanCore(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
