package androidx.compose.material3.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AccessibilityServiceStateProvider_androidKt$ObserveState$4 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ LifecycleOwner h;
    public final /* synthetic */ Function1 i;
    public final /* synthetic */ Function0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessibilityServiceStateProvider_androidKt$ObserveState$4(LifecycleOwner lifecycleOwner, Function1 function1, Function0 function0, int i) {
        super(2);
        this.h = lifecycleOwner;
        this.i = function1;
        this.j = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(1);
        ComposerImpl composerImplV = ((Composer) obj).v(-1868327245);
        final LifecycleOwner lifecycleOwner = this.h;
        int i = (composerImplV.I(lifecycleOwner) ? 4 : 2) | iA;
        final Function1 function1 = this.i;
        int i2 = i | (composerImplV.I(function1) ? 32 : 16);
        final Function0 function0 = this.j;
        int i3 = i2 | (composerImplV.I(function0) ? 256 : 128);
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            boolean zI = ((i3 & 112) == 32) | composerImplV.I(lifecycleOwner) | ((i3 & 896) == 256);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$ObserveState$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        final a aVar = new a(function1, 0);
                        final LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                        lifecycleOwner2.getD().a(aVar);
                        final Function0 function02 = function0;
                        return new DisposableEffectResult() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$ObserveState$3$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public final void dispose() {
                                function02.invoke();
                                lifecycleOwner2.getD().c(aVar);
                            }
                        };
                    }
                };
                composerImplV.A(objG);
            }
            EffectsKt.c(lifecycleOwner, (Function1) objG, composerImplV);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new AccessibilityServiceStateProvider_androidKt$ObserveState$4(lifecycleOwner, function1, function0, iA);
        }
        return Unit.f24250a;
    }
}
