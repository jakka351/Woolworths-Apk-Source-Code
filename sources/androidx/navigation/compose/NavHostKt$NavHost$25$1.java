package androidx.navigation.compose;

import androidx.activity.BackEventCompat;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.navigation.NavBackStackEntry;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "backEvent", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/activity/BackEventCompat;", "Landroidx/navigation/compose/internal/BackEventCompat;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.navigation.compose.NavHostKt$NavHost$25$1", f = "NavHost.kt", l = {523}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class NavHostKt$NavHost$25$1 extends SuspendLambda implements Function2<Flow<? extends BackEventCompat>, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ComposeNavigator r;
    public final /* synthetic */ MutableState s;
    public final /* synthetic */ MutableFloatState t;
    public final /* synthetic */ MutableState u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$25$1(ComposeNavigator composeNavigator, MutableState mutableState, MutableFloatState mutableFloatState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.r = composeNavigator;
        this.s = mutableState;
        this.t = mutableFloatState;
        this.u = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NavHostKt$NavHost$25$1 navHostKt$NavHost$25$1 = new NavHostKt$NavHost$25$1(this.r, this.s, this.t, this.u, continuation);
        navHostKt$NavHost$25$1.q = obj;
        return navHostKt$NavHost$25$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((NavHostKt$NavHost$25$1) create((Flow) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        NavBackStackEntry navBackStackEntry;
        NavBackStackEntry navBackStackEntry2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        final MutableState mutableState = this.u;
        ComposeNavigator composeNavigator = this.r;
        final MutableState mutableState2 = this.s;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                Flow flow = (Flow) this.q;
                int size = ((List) mutableState2.getD()).size();
                final MutableFloatState mutableFloatState = this.t;
                if (size > 1) {
                    mutableFloatState.p(BitmapDescriptorFactory.HUE_RED);
                    navBackStackEntry = (NavBackStackEntry) CollectionsKt.P((List) mutableState2.getD());
                    Intrinsics.e(navBackStackEntry);
                    composeNavigator.b().f(navBackStackEntry);
                    composeNavigator.b().f((NavBackStackEntry) ((List) mutableState2.getD()).get(((List) mutableState2.getD()).size() - 2));
                } else {
                    navBackStackEntry = null;
                }
                FlowCollector flowCollector = new FlowCollector() { // from class: androidx.navigation.compose.NavHostKt$NavHost$25$1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        BackEventCompat backEventCompat = (BackEventCompat) obj2;
                        if (((List) mutableState2.getD()).size() > 1) {
                            mutableState.setValue(Boolean.TRUE);
                            mutableFloatState.p(backEventCompat.c);
                        }
                        return Unit.f24250a;
                    }
                };
                this.q = navBackStackEntry;
                this.p = 1;
                if (flow.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                navBackStackEntry2 = navBackStackEntry;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                navBackStackEntry2 = (NavBackStackEntry) this.q;
                ResultKt.b(obj);
            }
            if (((List) mutableState2.getD()).size() > 1) {
                mutableState.setValue(Boolean.FALSE);
                Intrinsics.e(navBackStackEntry2);
                composeNavigator.i(navBackStackEntry2, false);
            }
        } catch (CancellationException unused) {
            if (((List) mutableState2.getD()).size() > 1) {
                mutableState.setValue(Boolean.FALSE);
            }
        }
        return Unit.f24250a;
    }
}
