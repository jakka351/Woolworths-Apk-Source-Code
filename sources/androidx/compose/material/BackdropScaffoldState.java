package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material/BackdropScaffoldState;", "", "Companion", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BackdropScaffoldState {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f1241a;
    public final AnchoredDraggableState b;
    public Density c;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/BackdropValue;", "invoke", "(Landroidx/compose/material/BackdropValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.BackdropScaffoldState$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function1<BackdropValue, Boolean> {
        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/BackdropScaffoldState$Companion;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public BackdropScaffoldState(BackdropValue backdropValue, AnimationSpec animationSpec, Function1 function1, SnackbarHostState snackbarHostState) {
        this.f1241a = function1;
        AnchoredDraggableState anchoredDraggableState = new AnchoredDraggableState(backdropValue, new Function1<Float, Float>() { // from class: androidx.compose.material.BackdropScaffoldState$anchoredDraggableState$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((Number) obj).floatValue();
                return Float.valueOf(BackdropScaffoldState.a(this.h).T1(BackdropScaffoldKt.b));
            }
        }, new Function0<Float>() { // from class: androidx.compose.material.BackdropScaffoldState$anchoredDraggableState$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(BackdropScaffoldState.a(this.h).T1(BackdropScaffoldKt.f1240a));
            }
        }, animationSpec, function1);
        this.b = anchoredDraggableState;
        Orientation orientation = Orientation.d;
        float f = BackdropScaffoldKt.f1240a;
        new BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1(anchoredDraggableState);
    }

    public static final Density a(BackdropScaffoldState backdropScaffoldState) {
        Density density = backdropScaffoldState.c;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException(("The density on BackdropScaffoldState (" + backdropScaffoldState + ") was not set. Did you use BackdropScaffoldState with the BackdropScaffold composable?").toString());
    }
}
