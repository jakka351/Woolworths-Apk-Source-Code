package androidx.compose.material3;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/DrawerState;", "", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DrawerState {

    /* renamed from: a, reason: collision with root package name */
    public final AnchoredDraggableState f1441a;
    public final MutableState b;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material3/DrawerValue;", "invoke", "(Landroidx/compose/material3/DrawerValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.DrawerState$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function1<DrawerValue, Boolean> {
        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/DrawerState$Companion;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public DrawerState(DrawerValue drawerValue) {
        TweenSpec tweenSpec = NavigationDrawerKt.c;
        this.f1441a = new AnchoredDraggableState(drawerValue, DrawerState$anchoredDraggableState$1.h, new Function0<Float>() { // from class: androidx.compose.material3.DrawerState$anchoredDraggableState$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DrawerState drawerState = this.h;
                Density density = (Density) ((SnapshotMutableStateImpl) drawerState.b).getD();
                if (density != null) {
                    return Float.valueOf(density.T1(NavigationDrawerKt.f1464a));
                }
                throw new IllegalArgumentException(("The density on DrawerState (" + drawerState + ") was not set. Did you use DrawerState with the ModalNavigationDrawer or DismissibleNavigationDrawer composables?").toString());
            }
        }, tweenSpec, NavigationDrawerKt$rememberDrawerState$1.h);
        this.b = SnapshotStateKt.f(null);
    }

    public final Object a(SuspendLambda suspendLambda) throws Throwable {
        TweenSpec tweenSpec = NavigationDrawerKt.c;
        AnchoredDraggableState anchoredDraggableState = this.f1441a;
        Object objB = anchoredDraggableState.b(DrawerValue.d, MutatePriority.d, new DrawerState$animateTo$3(this, ((SnapshotMutableFloatStateImpl) anchoredDraggableState.l).a(), tweenSpec, null), suspendLambda);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        Unit unit = Unit.f24250a;
        if (objB != coroutineSingletons) {
            objB = unit;
        }
        return objB == coroutineSingletons ? objB : unit;
    }

    public final boolean b() {
        return ((DrawerValue) ((SnapshotMutableStateImpl) this.f1441a.g).getD()) == DrawerValue.e;
    }
}
