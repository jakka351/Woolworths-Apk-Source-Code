package androidx.compose.material;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ExposedDropdownMenu_android$OnPlatformWindowBoundsChange$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ Function0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenu_android$OnPlatformWindowBoundsChange$2(int i, Function0 function0) {
        super(2);
        this.h = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(1);
        ComposerImpl composerImplV = ((Composer) obj).v(1063434120);
        final Function0 function0 = this.h;
        int i = (composerImplV.I(function0) ? 4 : 2) | iA;
        if (composerImplV.z(i & 1, (i & 3) != 2)) {
            final View view = (View) composerImplV.x(AndroidCompositionLocals_androidKt.f);
            boolean zI = ((i & 14) == 4) | composerImplV.I(view);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.material.ExposedDropdownMenu_android$OnPlatformWindowBoundsChange$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        final OnGlobalLayoutListener onGlobalLayoutListener = new OnGlobalLayoutListener(view, function0);
                        return new DisposableEffectResult() { // from class: androidx.compose.material.ExposedDropdownMenu_android$OnPlatformWindowBoundsChange$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public final void dispose() {
                                OnGlobalLayoutListener onGlobalLayoutListener2 = onGlobalLayoutListener;
                                View view2 = onGlobalLayoutListener2.d;
                                if (onGlobalLayoutListener2.f) {
                                    view2.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener2);
                                    onGlobalLayoutListener2.f = false;
                                }
                                view2.removeOnAttachStateChangeListener(onGlobalLayoutListener2);
                            }
                        };
                    }
                };
                composerImplV.A(objG);
            }
            EffectsKt.c(view, (Function1) objG, composerImplV);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new ExposedDropdownMenu_android$OnPlatformWindowBoundsChange$2(iA, function0);
        }
        return Unit.f24250a;
    }
}
