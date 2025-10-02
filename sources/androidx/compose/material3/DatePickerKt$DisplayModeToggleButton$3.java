package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DatePickerKt$DisplayModeToggleButton$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ Modifier h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Function1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DisplayModeToggleButton$3(Modifier modifier, int i, Function1 function1, int i2) {
        super(2);
        this.h = modifier;
        this.i = i;
        this.j = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(7);
        float f = DatePickerKt.f1433a;
        ComposerImpl composerImplV = ((Composer) obj).v(1393846115);
        int i = this.i;
        int i2 = (composerImplV.r(i) ? 32 : 16) | iA;
        final Function1 function1 = this.j;
        int i3 = i2 | (composerImplV.I(function1) ? 256 : 128);
        int i4 = i3 & 147;
        Modifier modifier = this.h;
        if (i4 == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Object obj3 = Composer.Companion.f1624a;
            if (i == 0) {
                composerImplV.o(-411219388);
                z = (i3 & 896) == 256;
                Object objG = composerImplV.G();
                if (z || objG == obj3) {
                    objG = new Function0<Unit>() { // from class: androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$1$1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(new DisplayMode(1));
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG);
                }
                IconButtonKt.a((Function0) objG, modifier, false, null, ComposableSingletons$DatePickerKt.f1417a, composerImplV, 196656, 28);
                composerImplV.V(false);
            } else {
                composerImplV.o(-410937381);
                z = (i3 & 896) == 256;
                Object objG2 = composerImplV.G();
                if (z || objG2 == obj3) {
                    objG2 = new Function0<Unit>() { // from class: androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$2$1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(new DisplayMode(0));
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG2);
                }
                IconButtonKt.a((Function0) objG2, modifier, false, null, ComposableSingletons$DatePickerKt.b, composerImplV, 196656, 28);
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new DatePickerKt$DisplayModeToggleButton$3(modifier, i, function1, iA);
        }
        return Unit.f24250a;
    }
}
