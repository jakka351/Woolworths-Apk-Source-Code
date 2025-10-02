package au.com.woolworths.design.core.ui.component.experimental.badge;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BadgeKt {
    public static final void a(int i, Composer composer, Modifier modifier, final String str) {
        BadgeVariant[] badgeVariantArr = BadgeVariant.d;
        ComposerImpl composerImplV = composer.v(-2065602144);
        if ((((composerImplV.r(0) ? 4 : 2) | i | 48 | (composerImplV.n(str) ? 256 : 128)) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(-1709863157);
            long j = CoreTheme.b(composerImplV).c.c.f4824a.f4825a.f4826a;
            composerImplV.l();
            RoundedCornerShape roundedCornerShapeB = RoundedCornerShapeKt.b(12);
            composerImplV.o(1029966727);
            composerImplV.l();
            ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-2125813028, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.component.experimental.badge.BadgeKt$Badge$2
                {
                    BadgeVariant[] badgeVariantArr2 = BadgeVariant.d;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String str2 = str;
                        Modifier.Companion companion = Modifier.Companion.d;
                        if (str2 != null) {
                            composer2.o(-803095683);
                            float f = 16;
                            Modifier modifierA = SizeKt.a(companion, f, f);
                            BadgeVariant[] badgeVariantArr2 = BadgeVariant.d;
                            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
                            int p = composer2.getP();
                            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                            Modifier modifierD = ComposedModifierKt.d(composer2, modifierA);
                            ComposeUiNode.e3.getClass();
                            Function0 function0 = ComposeUiNode.Companion.b;
                            if (composer2.w() == null) {
                                ComposablesKt.b();
                                throw null;
                            }
                            composer2.i();
                            if (composer2.getO()) {
                                composer2.K(function0);
                            } else {
                                composer2.e();
                            }
                            Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                            Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                            Function2 function2 = ComposeUiNode.Companion.j;
                            if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                                b.z(p, composer2, p, function2);
                            }
                            Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                            Modifier modifierH = PaddingKt.h(companion, 4, BitmapDescriptorFactory.HUE_RED, 2);
                            TextStyle textStyle = CoreTheme.f(composer2).b.f5125a.f5126a;
                            composer2.o(39346057);
                            long j2 = CoreTheme.b(composer2).e.d.c.b;
                            composer2.l();
                            TextKt.a(str, textStyle, modifierH, j2, null, 0, 0, false, 0, null, composer2, KyberEngine.KyberPolyBytes, 1008);
                            composer2.f();
                            composer2.l();
                        } else {
                            composer2.o(-802648725);
                            BoxKt.a(SizeKt.q(companion, 8), composer2, 6);
                            composer2.l();
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV);
            Modifier.Companion companion = Modifier.Companion.d;
            SurfaceKt.b(companion, roundedCornerShapeB, j, 0L, null, null, composableLambdaImplC, composerImplV, 40);
            modifier = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(modifier, str, i);
        }
    }
}
