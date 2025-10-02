package androidx.compose.material3;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ExposedDropdownMenu_androidKt$SoftKeyboardListener$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ View h;
    public final /* synthetic */ Density i;
    public final /* synthetic */ Function0 j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenu_androidKt$SoftKeyboardListener$2(View view, Density density, Function0 function0, int i) {
        super(2);
        this.h = view;
        this.i = density;
        this.j = function0;
        this.k = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(this.k | 1);
        float f = ExposedDropdownMenu_androidKt.f1444a;
        ComposerImpl composerImplV = ((Composer) obj).v(-1319522472);
        final View view = this.h;
        int i = (composerImplV.I(view) ? 4 : 2) | iA;
        Density density = this.i;
        int i2 = i | (composerImplV.n(density) ? 32 : 16);
        int i3 = iA & KyberEngine.KyberPolyBytes;
        final Function0 function0 = this.j;
        if (i3 == 0) {
            i2 |= composerImplV.I(function0) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            boolean zI = ((i2 & 896) == 256) | composerImplV.I(view);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        final ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1 exposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1 = new ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1(view, function0);
                        return new DisposableEffectResult() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public final void dispose() {
                                ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1 exposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$12 = exposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1;
                                View view2 = exposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$12.e;
                                if (exposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$12.d) {
                                    view2.getViewTreeObserver().removeOnGlobalLayoutListener(exposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$12);
                                    exposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$12.d = false;
                                }
                                view2.removeOnAttachStateChangeListener(exposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$12);
                            }
                        };
                    }
                };
                composerImplV.A(objG);
            }
            EffectsKt.b(view, density, (Function1) objG, composerImplV);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new ExposedDropdownMenu_androidKt$SoftKeyboardListener$2(view, density, function0, iA);
        }
        return Unit.f24250a;
    }
}
