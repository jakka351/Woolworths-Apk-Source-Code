package me.oriient.navigation.common;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes8.dex */
public final class e0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26239a;
    public /* synthetic */ Object b;
    public final /* synthetic */ NavigationManagerImpl c;
    public final /* synthetic */ List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(NavigationManagerImpl navigationManagerImpl, List list, Continuation continuation) {
        super(2, continuation);
        this.c = navigationManagerImpl;
        this.d = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        e0 e0Var = new e0(this.c, this.d, continuation);
        e0Var.b = obj;
        return e0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0120, code lost:
    
        if (r1.emit(r12, r11) == r0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.navigation.common.e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
