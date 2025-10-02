package me.oriient.navigation.turnByTurn;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.navigation.common.models.NavigationPosition;
import me.oriient.navigation.common.models.Route;

/* loaded from: classes8.dex */
public final class k extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26368a;
    public /* synthetic */ Object b;
    public final /* synthetic */ TurnByTurnNavigationManagerImpl c;
    public final /* synthetic */ Route d;
    public final /* synthetic */ NavigationPosition e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(TurnByTurnNavigationManagerImpl turnByTurnNavigationManagerImpl, Route route, NavigationPosition navigationPosition, Continuation continuation) {
        super(2, continuation);
        this.c = turnByTurnNavigationManagerImpl;
        this.d = route;
        this.e = navigationPosition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        k kVar = new k(this.c, this.d, this.e, continuation);
        kVar.b = obj;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x04cc, code lost:
    
        if (r2.emit(r9, r34) == r1) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r2.emit(r3, r34) != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 1252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.navigation.turnByTurn.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
