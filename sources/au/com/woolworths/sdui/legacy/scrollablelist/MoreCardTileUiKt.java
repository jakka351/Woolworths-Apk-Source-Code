package au.com.woolworths.sdui.legacy.scrollablelist;

import android.content.res.Configuration;
import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightModifierKt;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.design.core.ui.component.experimental.CardKt;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class MoreCardTileUiKt {
    public static final void a(final String contentDescription, Modifier modifier, SharedIntrinsicHeightState sharedIntrinsicHeightState, float f, final Function0 onClick, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        SharedIntrinsicHeightState sharedIntrinsicHeightState2;
        final float f2;
        final SharedIntrinsicHeightState sharedIntrinsicHeightState3;
        float f3;
        Modifier modifier3;
        Intrinsics.h(contentDescription, "contentDescription");
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(-1088792688);
        if ((i & 6) == 0) {
            i3 = (composerImplV.n(contentDescription) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerImplV.n(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= KyberEngine.KyberPolyBytes;
        } else if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.n(sharedIntrinsicHeightState) ? 256 : 128;
        }
        int i6 = i3 | 1024;
        if ((i & 24576) == 0) {
            i6 |= composerImplV.I(onClick) ? 16384 : 8192;
        }
        if ((i6 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier;
            sharedIntrinsicHeightState3 = sharedIntrinsicHeightState;
            f3 = f;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                modifier2 = i4 != 0 ? Modifier.Companion.d : modifier;
                if (i5 != 0) {
                    composerImplV.o(1849434622);
                    Object objG = composerImplV.G();
                    if (objG == Composer.Companion.f1624a) {
                        objG = d.f(composerImplV);
                    }
                    composerImplV.V(false);
                    sharedIntrinsicHeightState2 = (SharedIntrinsicHeightState) objG;
                } else {
                    sharedIntrinsicHeightState2 = sharedIntrinsicHeightState;
                }
                f2 = (float) (((Configuration) composerImplV.x(AndroidCompositionLocals_androidKt.f1950a)).smallestScreenWidthDp * 0.52d);
                sharedIntrinsicHeightState3 = sharedIntrinsicHeightState2;
            } else {
                composerImplV.j();
                modifier2 = modifier;
                sharedIntrinsicHeightState3 = sharedIntrinsicHeightState;
                f2 = f;
            }
            composerImplV.W();
            final Modifier modifier4 = modifier2;
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(1463048628, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.sdui.legacy.scrollablelist.MoreCardTileUiKt$MoreCardTileUi$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierO = SizeKt.o(modifier4, f2);
                        final SharedIntrinsicHeightState sharedIntrinsicHeightState4 = sharedIntrinsicHeightState3;
                        Modifier modifierA = SharedIntrinsicHeightModifierKt.a(modifierO, sharedIntrinsicHeightState4);
                        composer2.o(5004770);
                        String str = contentDescription;
                        boolean zN = composer2.n(str);
                        Object objG2 = composer2.G();
                        if (zN || objG2 == Composer.Companion.f1624a) {
                            objG2 = new a(str, 29);
                            composer2.A(objG2);
                        }
                        composer2.l();
                        CardKt.b(onClick, SemanticsModifierKt.b(modifierA, true, (Function1) objG2), false, null, 0L, 0L, 0L, 0L, CoreTheme.c(composer2).c, null, null, ComposableLambdaKt.c(825439727, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.sdui.legacy.scrollablelist.MoreCardTileUiKt$MoreCardTileUi$2.2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                ColumnScope Card = (ColumnScope) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(Card, "$this$Card");
                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    Modifier modifierA2 = SharedIntrinsicHeightModifierKt.a(SizeKt.e(Modifier.Companion.d, 1.0f), sharedIntrinsicHeightState4);
                                    MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
                                    int p = composer3.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                                    Modifier modifierD = ComposedModifierKt.d(composer3, modifierA2);
                                    ComposeUiNode.e3.getClass();
                                    Function0 function0 = ComposeUiNode.Companion.b;
                                    if (composer3.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer3.i();
                                    if (composer3.getO()) {
                                        composer3.K(function0);
                                    } else {
                                        composer3.e();
                                    }
                                    Updater.b(composer3, measurePolicyD, ComposeUiNode.Companion.g);
                                    Updater.b(composer3, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                    Function2 function2 = ComposeUiNode.Companion.j;
                                    if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                                        b.z(p, composer3, p, function2);
                                    }
                                    Updater.b(composer3, modifierD, ComposeUiNode.Companion.d);
                                    SurfaceKt.b(null, RoundedCornerShapeKt.a(50), 0L, 0L, null, CoreTheme.c(composer3).d, ComposableSingletons$MoreCardTileUiKt.f10005a, composer3, 29);
                                    composer3.f();
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 0, 1788);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
            f3 = f2;
            modifier3 = modifier4;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.instore.cart.ui.d(contentDescription, modifier3, sharedIntrinsicHeightState3, f3, onClick, i, i2);
        }
    }
}
