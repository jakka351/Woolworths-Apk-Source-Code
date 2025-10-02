package au.com.woolworths.feature.rewards.offers.ui;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import au.com.woolworths.compose.utils.layout.SpacerKt;
import au.com.woolworths.feature.rewards.offers.data.RewardsOfferMechanicsSeperatorIconExtKt;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferMechanicItem;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferMechanics;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferMechanicsSeparatorIcon;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OfferDetailMechanicsCarouselKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public static final void a(RewardsOfferMechanics offerMechanics, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        float f;
        RewardsOfferMechanicItem rewardsOfferMechanicItem;
        ?? r15;
        boolean z;
        Intrinsics.h(offerMechanics, "offerMechanics");
        ComposerImpl composerImplV = composer.v(-1682184418);
        int i2 = 2;
        if ((((composerImplV.I(offerMechanics) ? 4 : 2) | i | 48) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            float f2 = 1.0f;
            boolean z2 = 0;
            Modifier modifierB = ScrollKt.b(SizeKt.e(companion, 1.0f), ScrollKt.a(composerImplV), false);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(-1062535489);
            int i4 = 0;
            for (Object obj : offerMechanics.getMechanicsItems()) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                RewardsOfferMechanicItem rewardsOfferMechanicItem2 = (RewardsOfferMechanicItem) obj;
                MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, z2);
                int i6 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
                Modifier modifierD2 = ComposedModifierKt.d(composerImplV, companion);
                ComposeUiNode.e3.getClass();
                Function0 function02 = ComposeUiNode.Companion.b;
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function02);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
                Updater.b(composerImplV, persistentCompositionLocalMapQ2, ComposeUiNode.Companion.f);
                Function2 function22 = ComposeUiNode.Companion.j;
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                    androidx.camera.core.impl.b.B(i6, composerImplV, i6, function22);
                }
                Updater.b(composerImplV, modifierD2, ComposeUiNode.Companion.d);
                composerImplV.o(632805810);
                if (i4 != 0) {
                    Modifier modifierC = OffsetKt.c(ZIndexModifierKt.a(BoxScopeInstance.f944a.g(companion, Alignment.Companion.d), f2), -18, BitmapDescriptorFactory.HUE_RED, i2);
                    RewardsOfferMechanicsSeparatorIcon separator = offerMechanics.getSeparator();
                    Intrinsics.h(separator, "<this>");
                    int i7 = RewardsOfferMechanicsSeperatorIconExtKt.WhenMappings.f6292a[separator.ordinal()];
                    int i8 = i7 != 1 ? i7 != i2 ? z2 : R.drawable.ic_rewards_offer_mechanics_item_decoration_plus : R.drawable.ic_rewards_offer_mechanics_item_decoration_arrow;
                    f = f2;
                    z = true;
                    r15 = z2;
                    rewardsOfferMechanicItem = rewardsOfferMechanicItem2;
                    ImageKt.a(PainterResources_androidKt.a(i8, z2, composerImplV), null, modifierC, null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 48, 120);
                } else {
                    f = f2;
                    rewardsOfferMechanicItem = rewardsOfferMechanicItem2;
                    r15 = z2;
                    z = true;
                }
                composerImplV.V(r15);
                Modifier.Companion companion2 = companion;
                OfferDetailMechanicsKt.a(rewardsOfferMechanicItem, PaddingKt.j(companion2, BitmapDescriptorFactory.HUE_RED, 16, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), composerImplV, 48, r15);
                composerImplV.V(z);
                SpacerKt.d(RowScopeInstance.f974a, 4, composerImplV, 54);
                companion = companion2;
                z2 = r15;
                f2 = f;
                i2 = 2;
                i4 = i5;
            }
            modifier2 = companion;
            composerImplV.V(z2);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new androidx.navigation.compose.d(offerMechanics, i, 24, modifier2);
        }
    }
}
