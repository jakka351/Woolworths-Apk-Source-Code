package au.com.woolworths.feature.rewards.offers.ui.details;

import android.graphics.Color;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.feature.rewards.offers.ui.details.TrailingStyle;
import au.com.woolworths.foundation.rewards.offers.model.CircularProgressIndicator;
import au.com.woolworths.foundation.rewards.offers.model.CircularProgressRing;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsTrackerProgressRow;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsTrackerRow;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsTrackerTrailingElement;
import au.com.woolworths.rewards.base.data.IconAsset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OfferDetailsTrackerComboRowUiKt {
    public static final void a(OfferDetailsTrackerRow offerDetailsTrackerRow, OfferDetailsTrackerProgressRow offerDetailsTrackerProgressRow, String str, Modifier modifier, Composer composer, int i) {
        TrailingStyle trailingStyle;
        TrailingStyle points;
        ComposerImpl composerImplV = composer.v(425962451);
        int i2 = i | (composerImplV.I(offerDetailsTrackerRow) ? 4 : 2) | (composerImplV.I(offerDetailsTrackerProgressRow) ? 32 : 16) | (composerImplV.n(str) ? 256 : 128) | (composerImplV.n(modifier) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(5004770);
            boolean z = (i2 & 896) == 256;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new androidx.navigation.fragment.d(str, 29);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierA = SemanticsModifierKt.a(modifier, (Function1) objG);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g(16), Alignment.Companion.m, composerImplV, 6);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierA);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(1639167436);
            Modifier.Companion companion = Modifier.Companion.d;
            ProgressRing progressRing = null;
            if (offerDetailsTrackerRow != null) {
                Modifier modifierA2 = TestTagKt.a(companion, "offer_details_tracker_row");
                IconAsset iconAsset = offerDetailsTrackerRow.f8614a;
                String str2 = offerDetailsTrackerRow.b;
                OfferDetailsTrackerTrailingElement offerDetailsTrackerTrailingElement = offerDetailsTrackerRow.c;
                if (offerDetailsTrackerTrailingElement != null) {
                    if (offerDetailsTrackerTrailingElement instanceof OfferDetailsTrackerTrailingElement.OfferDetailsTrackerTrailingElementLabel) {
                        points = new TrailingStyle.Label(((OfferDetailsTrackerTrailingElement.OfferDetailsTrackerTrailingElementLabel) offerDetailsTrackerTrailingElement).f8615a);
                    } else if (offerDetailsTrackerTrailingElement instanceof OfferDetailsTrackerTrailingElement.OfferDetailsTrackerTrailingElementPoints) {
                        OfferDetailsTrackerTrailingElement.OfferDetailsTrackerTrailingElementPoints offerDetailsTrackerTrailingElementPoints = (OfferDetailsTrackerTrailingElement.OfferDetailsTrackerTrailingElementPoints) offerDetailsTrackerTrailingElement;
                        points = new TrailingStyle.Points(offerDetailsTrackerTrailingElementPoints.f8616a, offerDetailsTrackerTrailingElementPoints.b);
                    } else {
                        points = null;
                    }
                    trailingStyle = points;
                } else {
                    trailingStyle = null;
                }
                OfferDetailsTrackerRowUiKt.b(iconAsset, str2, trailingStyle, modifierA2, composerImplV, 3072);
            }
            composerImplV.V(false);
            composerImplV.o(1639177915);
            if (offerDetailsTrackerProgressRow != null) {
                Modifier modifierA3 = TestTagKt.a(companion, "offer_details_tracker_progress_row");
                String str3 = offerDetailsTrackerProgressRow.f8613a;
                String str4 = offerDetailsTrackerProgressRow.b;
                CircularProgressIndicator circularProgressIndicator = offerDetailsTrackerProgressRow.c;
                if (circularProgressIndicator != null) {
                    CircularProgressRing circularProgressRing = circularProgressIndicator.d;
                    progressRing = new ProgressRing(ColorKt.b(Color.parseColor(circularProgressRing.e)), (float) circularProgressRing.d);
                }
                OfferDetailsProgressTrackerRowUiKt.a(str3, str4, progressRing, modifierA3, composerImplV, 3072);
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.iconbutton.a(offerDetailsTrackerRow, offerDetailsTrackerProgressRow, str, modifier, i, 11);
        }
    }
}
