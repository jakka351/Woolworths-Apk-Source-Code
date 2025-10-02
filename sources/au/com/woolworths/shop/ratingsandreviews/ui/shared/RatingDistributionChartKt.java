package au.com.woolworths.shop.ratingsandreviews.ui.shared;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.design.core.ui.component.experimental.progressindicator.LinearProgressIndicatorKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.feature.shop.recipes.details.ui.i;
import au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.c;
import au.com.woolworths.shop.ratingsandreviews.data.RatingsDistributionDetails;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ratingsandreviews-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RatingDistributionChartKt {
    public static final void a(List ratingItems, Modifier modifier, Composer composer, int i) {
        Composer$Companion$Empty$1 composer$Companion$Empty$1;
        Modifier modifier2;
        int i2;
        Intrinsics.h(ratingItems, "ratingItems");
        ComposerImpl composerImplV = composer.v(-1273651317);
        if ((((composerImplV.I(ratingItems) ? 4 : 2) | i | 48) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            BiasAlignment.Vertical vertical = Alignment.Companion.k;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$Start$1, vertical, composerImplV, 48);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            boolean z = false;
            Modifier modifierA = RowScopeInstance.f974a.a(companion, 1.0f, false);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierA);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            composerImplV.o(-421948028);
            Iterator it = ratingItems.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                composer$Companion$Empty$1 = Composer.Companion.f1624a;
                if (!zHasNext) {
                    break;
                }
                RatingsDistributionDetails.DistributionItem distributionItem = (RatingsDistributionDetails.DistributionItem) it.next();
                String strA = StringResources_androidKt.a(R.plurals.ratings_distribution_talkback_text, Integer.parseInt(distributionItem.d), new Object[]{distributionItem.f, distributionItem.d}, composerImplV);
                composerImplV.o(5004770);
                boolean zN = composerImplV.n(strA);
                Object objG = composerImplV.G();
                if (zN || objG == composer$Companion$Empty$1) {
                    objG = new au.com.woolworths.shared.ui.compose.a(strA, 27);
                    composerImplV.A(objG);
                }
                composerImplV.V(z);
                Modifier modifierA2 = SemanticsModifierKt.a(companion, (Function1) objG);
                Arrangement$Start$1 arrangement$Start$12 = Arrangement.f934a;
                RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(Arrangement.g(8), vertical, composerImplV, 54);
                int i5 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
                Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierA2);
                ComposeUiNode.e3.getClass();
                Function0 function02 = ComposeUiNode.Companion.b;
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function02);
                } else {
                    composerImplV.e();
                }
                Function2 function25 = ComposeUiNode.Companion.g;
                Updater.b(composerImplV, rowMeasurePolicyA2, function25);
                Function2 function26 = ComposeUiNode.Companion.f;
                Updater.b(composerImplV, persistentCompositionLocalMapQ3, function26);
                Function2 function27 = ComposeUiNode.Companion.j;
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                    androidx.camera.core.impl.b.B(i5, composerImplV, i5, function27);
                }
                Function2 function28 = ComposeUiNode.Companion.d;
                Updater.b(composerImplV, modifierD3, function28);
                RowMeasurePolicy rowMeasurePolicyA3 = RowKt.a(Arrangement.f934a, vertical, composerImplV, 48);
                int i6 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ4 = composerImplV.Q();
                Iterator it2 = it;
                Modifier modifierD4 = ComposedModifierKt.d(composerImplV, companion);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function02);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, rowMeasurePolicyA3, function25);
                Updater.b(composerImplV, persistentCompositionLocalMapQ4, function26);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                    androidx.camera.core.impl.b.B(i6, composerImplV, i6, function27);
                }
                Updater.b(composerImplV, modifierD4, function28);
                BiasAlignment.Vertical vertical2 = vertical;
                Modifier.Companion companion2 = companion;
                TextKt.a(distributionItem.d, CoreTheme.f(composerImplV).f5120a.b.f5123a, null, 0L, null, 0, 0, false, 0, null, composerImplV, 0, 1020);
                IconKt.b(CoreTheme.e(composerImplV).i.h, null, null, CoreTheme.b(composerImplV).e.c.f4854a, composerImplV, 48, 4);
                composerImplV.V(true);
                composerImplV.o(5004770);
                boolean zI = composerImplV.I(distributionItem);
                Object objG2 = composerImplV.G();
                if (zI || objG2 == composer$Companion$Empty$1) {
                    i2 = 2;
                    objG2 = new c(distributionItem, i2);
                    composerImplV.A(objG2);
                } else {
                    i2 = 2;
                }
                composerImplV.V(false);
                LinearProgressIndicatorKt.a(0, i2, composerImplV, null, (Function0) objG2);
                composerImplV.V(true);
                z = false;
                it = it2;
                vertical = vertical2;
                companion = companion2;
            }
            Composer$Companion$Empty$1 composer$Companion$Empty$12 = composer$Companion$Empty$1;
            Modifier.Companion companion3 = companion;
            boolean z2 = z;
            composerImplV.V(z2);
            composerImplV.V(true);
            Modifier modifierJ = PaddingKt.j(companion3, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
            Modifier.Companion companion4 = companion3;
            ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(Arrangement.c, Alignment.Companion.o, composerImplV, 48);
            int i7 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ5 = composerImplV.Q();
            Modifier modifierD5 = ComposedModifierKt.d(composerImplV, modifierJ);
            ComposeUiNode.e3.getClass();
            Function0 function03 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function03);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA2, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ5, ComposeUiNode.Companion.f);
            Function2 function29 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                androidx.camera.core.impl.b.B(i7, composerImplV, i7, function29);
            }
            Updater.b(composerImplV, modifierD5, ComposeUiNode.Companion.d);
            composerImplV.o(74185873);
            Iterator it3 = ratingItems.iterator();
            while (it3.hasNext()) {
                RatingsDistributionDetails.DistributionItem distributionItem2 = (RatingsDistributionDetails.DistributionItem) it3.next();
                composerImplV.o(1849434622);
                Object objG3 = composerImplV.G();
                if (objG3 == composer$Companion$Empty$12) {
                    objG3 = new au.com.woolworths.shop.product.details.ui.a(29);
                    composerImplV.A(objG3);
                }
                composerImplV.V(z2);
                float f = 4;
                TextKt.a(distributionItem2.f, CoreTheme.f(composerImplV).f5120a.b.f5123a, PaddingKt.h(PaddingKt.j(SemanticsModifierKt.b(companion4, z2, (Function1) objG3), f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), BitmapDescriptorFactory.HUE_RED, f, 1), 0L, null, 0, 0, false, 0, null, composerImplV, 0, 1016);
                composer$Companion$Empty$12 = composer$Companion$Empty$12;
                companion4 = companion4;
            }
            android.support.v4.media.session.a.C(composerImplV, z2, true, true);
            modifier2 = companion4;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new i(ratingItems, modifier2, i, 6);
        }
    }
}
