package me.oriient.navigation.turnByTurn;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.services.dataModel.navigation.turnByTurn.TurnByTurnConfig;
import me.oriient.navigation.common.C1782x;
import me.oriient.navigation.common.InterfaceC1781w;

/* loaded from: classes8.dex */
public final class j extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26367a;
    public final /* synthetic */ TurnByTurnNavigationManagerImpl b;
    public final /* synthetic */ TurnByTurnConfig c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TurnByTurnNavigationManagerImpl turnByTurnNavigationManagerImpl, TurnByTurnConfig turnByTurnConfig, Continuation continuation) {
        super(2, continuation);
        this.b = turnByTurnNavigationManagerImpl;
        this.c = turnByTurnConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new j(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26367a;
        Unit unit = Unit.f24250a;
        if (i == 0) {
            ResultKt.b(obj);
            this.b.getLogger().d(TurnByTurnNavigationManagerImpl.TAG, "onNewConfig() called with: config = " + this.c);
            this.b.config = this.c;
            InterfaceC1781w navigationConfigManager = this.b.getNavigationConfigManager();
            TurnByTurnConfig turnByTurnConfig = this.c;
            this.f26367a = 1;
            ((C1782x) navigationConfigManager).b.setValue(turnByTurnConfig);
            if (unit == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return unit;
    }
}
