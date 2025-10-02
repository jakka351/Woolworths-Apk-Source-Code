package androidx.navigation.compose;

import androidx.collection.MutableObjectFloatMap;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.navigation.compose.NavHostKt$NavHost$33$1", f = "NavHost.kt", l = {}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class NavHostKt$NavHost$33$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Transition p;
    public final /* synthetic */ NavHostController q;
    public final /* synthetic */ NavBackStackEntry r;
    public final /* synthetic */ MutableObjectFloatMap s;
    public final /* synthetic */ State t;
    public final /* synthetic */ ComposeNavigator u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$33$1(Transition transition, NavHostController navHostController, NavBackStackEntry navBackStackEntry, MutableObjectFloatMap mutableObjectFloatMap, State state, ComposeNavigator composeNavigator, Continuation continuation) {
        super(2, continuation);
        this.p = transition;
        this.q = navHostController;
        this.r = navBackStackEntry;
        this.s = mutableObjectFloatMap;
        this.t = state;
        this.u = composeNavigator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NavHostKt$NavHost$33$1(this.p, this.q, this.r, this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        NavHostKt$NavHost$33$1 navHostKt$NavHost$33$1 = (NavHostKt$NavHost$33$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        navHostKt$NavHost$33$1.invokeSuspend(unit);
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ea  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt$NavHost$33$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
