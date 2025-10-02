package androidx.compose.material;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material/DrawerState;", "", "Companion", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DrawerState {

    /* renamed from: a, reason: collision with root package name */
    public final AnchoredDraggableState f1278a;
    public Density b;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/DrawerValue;", "invoke", "(Landroidx/compose/material/DrawerValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.DrawerState$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends Lambda implements Function1<DrawerValue, Boolean> {
        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/DrawerState$Companion;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public DrawerState(DrawerValue drawerValue) {
        this.f1278a = new AnchoredDraggableState(drawerValue, new Function1<Float, Float>() { // from class: androidx.compose.material.DrawerState$anchoredDraggableState$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((Number) obj).floatValue();
                return Float.valueOf(DrawerState.a(this.h).T1(DrawerKt.b));
            }
        }, new Function0<Float>() { // from class: androidx.compose.material.DrawerState$anchoredDraggableState$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(DrawerState.a(this.h).T1(DrawerKt.c));
            }
        }, DrawerKt.d, DrawerKt$rememberDrawerState$1.h);
    }

    public static final Density a(DrawerState drawerState) {
        Density density = drawerState.b;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException(("The density on DrawerState (" + drawerState + ") was not set. Did you use DrawerState with the Drawer composable?").toString());
    }
}
