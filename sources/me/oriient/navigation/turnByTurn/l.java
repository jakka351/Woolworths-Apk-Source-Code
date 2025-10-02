package me.oriient.navigation.turnByTurn;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public final class l extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26369a;
    public final /* synthetic */ TurnByTurnNavigationManagerImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(TurnByTurnNavigationManagerImpl turnByTurnNavigationManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.b = turnByTurnNavigationManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new l(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new l(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r6.emit(r2, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r5.f26369a
            kotlin.collections.EmptyList r2 = kotlin.collections.EmptyList.d
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            kotlin.ResultKt.b(r6)
            goto L3f
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            kotlin.ResultKt.b(r6)
            goto L30
        L1e:
            kotlin.ResultKt.b(r6)
            me.oriient.navigation.turnByTurn.TurnByTurnNavigationManagerImpl r6 = r5.b
            kotlinx.coroutines.flow.MutableSharedFlow r6 = r6.getInstructionsUpdates()
            r5.f26369a = r4
            java.lang.Object r6 = r6.emit(r2, r5)
            if (r6 != r0) goto L30
            goto L3e
        L30:
            me.oriient.navigation.turnByTurn.TurnByTurnNavigationManagerImpl r6 = r5.b
            kotlinx.coroutines.flow.MutableSharedFlow r6 = r6.getTurnsUpdates()
            r5.f26369a = r3
            java.lang.Object r6 = r6.emit(r2, r5)
            if (r6 != r0) goto L3f
        L3e:
            return r0
        L3f:
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.navigation.turnByTurn.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
