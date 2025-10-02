package androidx.navigation.compose;

import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.navigation.NavBackStackEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ NavBackStackEntry e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ n(NavBackStackEntry navBackStackEntry, SaveableStateHolder saveableStateHolder, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.e = navBackStackEntry;
        this.f = saveableStateHolder;
        this.g = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.f;
                SeekableTransitionState seekableTransitionState = (SeekableTransitionState) this.g;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                BuildersKt.c(coroutineScope, null, null, new NavHostKt$NavHost$29$1$1$1(fFloatValue, seekableTransitionState, this.e, null), 3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(385);
                NavBackStackEntryProviderKt.a(this.e, (SaveableStateHolder) this.f, (ComposableLambdaImpl) this.g, (Composer) obj, iA);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ n(CoroutineScope coroutineScope, SeekableTransitionState seekableTransitionState, NavBackStackEntry navBackStackEntry) {
        this.f = coroutineScope;
        this.g = seekableTransitionState;
        this.e = navBackStackEntry;
    }
}
