package au.com.woolworths.foundation.rewards.common.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.StringKt;
import androidx.compose.ui.text.intl.Locale;
import au.com.woolworths.design.wx.component.SurfaceKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.design.wx.foundation.TintColors;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WoolworthsColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"common-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OfferStatusBadgeKt {
    public static final void a(final String str, final boolean z, final Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-196302931);
        if ((i & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ThemeKt.a(48, composerImplV, ComposableLambdaKt.c(1932944576, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.common.ui.OfferStatusBadgeKt$OfferStatusBadge$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        RoundedCornerShape roundedCornerShapeB = RoundedCornerShapeKt.b(4);
                        final boolean z2 = z;
                        long j = z2 ? TintColors.e : ToneColors.j;
                        final String str2 = str;
                        SurfaceKt.a(modifier, roundedCornerShapeB, j, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(1845083644, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.common.ui.OfferStatusBadgeKt$OfferStatusBadge$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    Modifier.Companion companion = Modifier.Companion.d;
                                    Modifier modifierF = PaddingKt.f(companion, 12);
                                    RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.e, Alignment.Companion.k, composer3, 54);
                                    int p = composer3.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                                    Modifier modifierD = ComposedModifierKt.d(composer3, modifierF);
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
                                    Updater.b(composer3, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                                    Updater.b(composer3, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                    Function2 function2 = ComposeUiNode.Companion.j;
                                    if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                                        androidx.camera.core.impl.b.z(p, composer3, p, function2);
                                    }
                                    Updater.b(composer3, modifierD, ComposeUiNode.Companion.d);
                                    composer3.o(1420420095);
                                    boolean z3 = z2;
                                    if (z3) {
                                        PulsingIndicatorKt.a(PulsingIndicatorColor.e, null, composer3, 6, 2);
                                        SpacerKt.a(composer3, SizeKt.q(companion, 8));
                                    }
                                    composer3.l();
                                    String strA = StringKt.a(str2, Locale.Companion.a());
                                    composer3.o(1420429067);
                                    long jD = z3 ? WoolworthsColors.f5164a : WxTheme.a(composer3).d();
                                    composer3.l();
                                    TextKt.b(strA, null, jD, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, WxTheme.b(composer3).o, composer3, 0, 3120, 55290);
                                    composer3.f();
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 1572864, 56);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.account.authentication.ui.a(str, z, modifier, i, 4);
        }
    }
}
