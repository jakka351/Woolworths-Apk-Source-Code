package au.com.woolworths.shop.ratingsandreviews.ui.shared;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import au.com.woolworths.design.core.ui.component.experimental.ratingbar.StarRatingBarKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ratingsandreviews-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RatingsDistribuitionOverviewKt {
    public static final void a(final double d, final double d2, final String numberOfReviews, final String ratingAltText, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final Modifier modifier3;
        Intrinsics.h(numberOfReviews, "numberOfReviews");
        Intrinsics.h(ratingAltText, "ratingAltText");
        ComposerImpl composerImplV = composer.v(1727366056);
        if ((i & 6) == 0) {
            i3 = (composerImplV.t(d) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.t(d2) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.n(numberOfReviews) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerImplV.n(ratingAltText) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i4 = i3 | 24576;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i4 = i3 | (composerImplV.n(modifier2) ? 16384 : 8192);
        }
        if ((i4 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier2;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifier4 = i5 != 0 ? companion : modifier2;
            String strB = StringResources_androidKt.b(R.string.ratings_overview_talkback_text, new Object[]{ratingAltText, numberOfReviews}, composerImplV);
            Modifier modifierE = SizeKt.e(modifier4, 1.0f);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierE);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            int i7 = i4;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            Modifier modifierJ = PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12, BitmapDescriptorFactory.HUE_RED, 11);
            composerImplV.o(5004770);
            boolean zN = composerImplV.n(strB);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zN || objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.shared.ui.compose.a(strB, 28);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            TextKt.a(String.valueOf(d), new TextStyle(0L, TextUnitKt.c(34), FontWeight.n, null, null, 0L, null, 0, 0, TextUnitKt.c(36), null, 16646137), SemanticsModifierKt.b(modifierJ, false, (Function1) objG), 0L, null, 0, 0, false, 0, null, composerImplV, 0, 1016);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i8 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, companion);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i8))) {
                androidx.camera.core.impl.b.B(i8, composerImplV, i8, function23);
            }
            Object objF = au.com.woolworths.android.onesite.a.f(composerImplV, modifierD2, function24, 1849434622);
            if (objF == composer$Companion$Empty$1) {
                objF = new a(0);
                composerImplV.A(objF);
            }
            composerImplV.V(false);
            StarRatingBarKt.b(d2, "", SemanticsModifierKt.b(companion, false, (Function1) objF), 0L, composerImplV, ((i7 >> 3) & 14) | 432);
            composerImplV.o(1849434622);
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new a(1);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            TextKt.a(numberOfReviews, CoreTheme.f(composerImplV).b.f5125a.b, PaddingKt.j(SemanticsModifierKt.b(companion, false, (Function1) objG2), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 8, 7), 0L, null, 0, 0, false, 0, null, composerImplV, (i7 >> 6) & 14, 1016);
            composerImplV = composerImplV;
            composerImplV.V(true);
            composerImplV.V(true);
            modifier3 = modifier4;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.shop.ratingsandreviews.ui.shared.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    RatingsDistribuitionOverviewKt.a(d, d2, numberOfReviews, ratingAltText, modifier3, (Composer) obj, RecomposeScopeImplKt.a(i | 1), i2);
                    return Unit.f24250a;
                }
            };
        }
    }
}
