package me.oriient.ipssdk.realtime.ofs;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.SharedFlow;
import me.oriient.ipssdk.realtime.ips.Navigation;
import me.oriient.navigation.common.models.Turn;

/* loaded from: classes8.dex */
public final class H2 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25950a;

    public H2(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new H2(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new H2((Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25950a;
        if (i == 0) {
            ResultKt.b(obj);
            SharedFlow<List<Turn>> turnsUpdates = Navigation.access$getTurnByTurnNavigationManager(Navigation.INSTANCE).getTurnsUpdates();
            G2 g2 = G2.f25944a;
            this.f25950a = 1;
            if (turnsUpdates.collect(g2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
