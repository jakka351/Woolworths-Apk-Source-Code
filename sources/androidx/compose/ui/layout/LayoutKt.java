package androidx.compose.ui.layout;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.CompositionLocalMapInjectionElement;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNode$Companion$ErrorMeasurePolicy$1;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LayoutKt {
    public static final void a(final Modifier modifier, final ComposableLambdaImpl composableLambdaImpl, final MeasurePolicy measurePolicy, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(1949933075);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(measurePolicy) ? 256 : 128;
        }
        if (composerImplV.z(i2 & 1, (i2 & 147) != 146)) {
            int i3 = composerImplV.P;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            LayoutNode$Companion$ErrorMeasurePolicy$1 layoutNode$Companion$ErrorMeasurePolicy$1 = LayoutNode.V;
            Function0 function0A = LayoutNode.Companion.a();
            int i4 = ((i2 << 3) & 896) | 6;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0A);
            } else {
                composerImplV.e();
            }
            ComposeUiNode.e3.getClass();
            Updater.b(composerImplV, measurePolicy, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Updater.a(composerImplV, LayoutKt$MultiMeasureLayout$1$1.h);
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function2);
            }
            a.y((i4 >> 6) & 14, composableLambdaImpl, composerImplV, true);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt$MultiMeasureLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    LayoutKt.a(modifier, composableLambdaImpl, measurePolicy, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final ComposableLambdaImpl b(final List list) {
        return new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt$combineAsVirtualLayouts$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (composer.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                    List list2 = list;
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        Function2 function2 = (Function2) list2.get(i);
                        int p = composer.getP();
                        ComposeUiNode.e3.getClass();
                        Function0 function0 = ComposeUiNode.Companion.c;
                        if (composer.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer.i();
                        if (composer.getO()) {
                            composer.K(function0);
                        } else {
                            composer.e();
                        }
                        Function2 function22 = ComposeUiNode.Companion.j;
                        if (composer.getO() || !Intrinsics.c(composer.G(), Integer.valueOf(p))) {
                            b.z(p, composer, p, function22);
                        }
                        function2.invoke(composer, 0);
                        composer.f();
                    }
                } else {
                    composer.j();
                }
                return Unit.f24250a;
            }
        }, true, -1953651383);
    }

    public static final ComposableLambdaImpl c(final Modifier modifier) {
        return new ComposableLambdaImpl(new Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutKt$materializerOfWithCompositionLocalInjection$1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Composer composer = ((SkippableUpdater) obj).f1664a;
                Composer composer2 = (Composer) obj2;
                ((Number) obj3).intValue();
                int p = composer2.getP();
                Modifier.Companion companion = Modifier.Companion.d;
                Modifier modifierD = modifier;
                if (modifierD != companion) {
                    modifierD = ComposedModifierKt.d(composer2, new CompositionLocalMapInjectionElement(composer2.d()).x0(modifierD));
                }
                composer.F(509942095);
                ComposeUiNode.e3.getClass();
                Updater.b(composer, modifierD, ComposeUiNode.Companion.d);
                Function2 function2 = ComposeUiNode.Companion.j;
                if (composer.getO() || !Intrinsics.c(composer.G(), Integer.valueOf(p))) {
                    b.z(p, composer, p, function2);
                }
                composer.N();
                return Unit.f24250a;
            }
        }, true, -55743822);
    }
}
