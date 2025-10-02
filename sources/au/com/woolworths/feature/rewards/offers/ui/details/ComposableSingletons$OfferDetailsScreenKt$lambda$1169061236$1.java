package au.com.woolworths.feature.rewards.offers.ui.details;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.rewards.offers.provider.OfferDetailsInfoItemProvider;
import au.com.woolworths.feature.rewards.offers.provider.OfferDetailsTrackerComboRowProvider;
import au.com.woolworths.feature.rewards.offers.provider.OfferDetailsTrackerTermsProvider;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsContentItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.rewards.offers.ui.details.ComposableSingletons$OfferDetailsScreenKt$lambda$-1169061236$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$OfferDetailsScreenKt$lambda$1169061236$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            Modifier modifierF = PaddingKt.f(BackgroundKt.b(Modifier.Companion.d, CoreTheme.b(composer).e.f4848a.e, RectangleShapeKt.f1779a), 8);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int p = composer.getP();
            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer.d();
            Modifier modifierD = ComposedModifierKt.d(composer, modifierF);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
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
            Updater.b(composer, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composer, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composer.getO() || !Intrinsics.c(composer.G(), Integer.valueOf(p))) {
                androidx.camera.core.impl.b.z(p, composer, p, function2);
            }
            Updater.b(composer, modifierD, ComposeUiNode.Companion.d);
            OfferDetailsScreenKt.a(new OfferDetailsContentItem.OfferDetailsCard(CollectionsKt.R(OfferDetailsTrackerComboRowProvider.f6391a, OfferDetailsTrackerComboRowProvider.b, OfferDetailsTrackerComboRowProvider.c, OfferDetailsTrackerComboRowProvider.d, OfferDetailsTrackerComboRowProvider.e, OfferDetailsInfoItemProvider.f6389a, OfferDetailsTrackerTermsProvider.f6393a, OfferDetailsTrackerTermsProvider.b, OfferDetailsTrackerTermsProvider.c, OfferDetailsTrackerTermsProvider.d)), null, composer, 0);
            composer.f();
        }
        return Unit.f24250a;
    }
}
