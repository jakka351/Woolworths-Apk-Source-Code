package au.com.woolworths.shop.aem.components.ui.herobanner;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.compose.utils.layout.SpacerKt;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import au.com.woolworths.shop.aem.components.model.herobanner.HeroBanner;
import au.com.woolworths.shop.aem.components.model.herobanner.HeroBannerAction;
import au.com.woolworths.shop.aem.components.model.herobanner.HeroBannerTermsAndConditions;
import au.com.woolworths.shop.aem.components.model.herobanner.HeroBannerText;
import au.com.woolworths.shop.aem.components.model.herobanner.HeroBannerTitleSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.shop.aem.components.ui.herobanner.ComposableSingletons$HeroBannerKt$lambda$-885078785$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$HeroBannerKt$lambda$885078785$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer, 0);
            int p = composer.getP();
            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer.d();
            Modifier modifierD = ComposedModifierKt.d(composer, Modifier.Companion.d);
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
            Updater.b(composer, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composer, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composer.getO() || !Intrinsics.c(composer.G(), Integer.valueOf(p))) {
                b.z(p, composer, p, function2);
            }
            Updater.b(composer, modifierD, ComposeUiNode.Companion.d);
            ActionType actionType = ActionType.d;
            HeroBanner heroBanner = new HeroBanner("1", new HeroBannerAction("", null, actionType), new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 143, (DefaultConstructorMarker) null), new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null), "#CAEB6D", null, new HeroBannerText.HeroBannerPromoBody("SUMMER", "Use code"), null, null, CollectionsKt.Q(new ImageWithAltText("", "")), new HeroBannerTermsAndConditions("Terms and conditions apply Terms and conditions apply Terms and conditions apply Terms and conditions apply", new ActionData("", actionType, null, null)), "$5 off your Direct to Boot or Pick Up.", HeroBannerTitleSize.d);
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.shop.aem.components.ui.chatentrycard.b(22);
                composer.A(objG);
            }
            Function1 function1 = (Function1) objG;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new au.com.woolworths.shop.aem.components.ui.chatentrycard.b(23);
                composer.A(objE);
            }
            composer.l();
            HeroBannerKt.a(heroBanner, function1, (Function1) objE, composer, 432);
            SpacerKt.c(ColumnScopeInstance.f948a, 16, composer, 54);
            HeroBanner heroBanner2 = new HeroBanner("1", new HeroBannerAction("", null, actionType), new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 143, (DefaultConstructorMarker) null), new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null), "#FF178841", null, null, null, null, CollectionsKt.R(new ImageWithAltText("", ""), new ImageWithAltText("", ""), new ImageWithAltText("", "")), null, "$5 off your Direct to Boot or Pick Up. Some more text and more", HeroBannerTitleSize.e);
            composer.o(1849434622);
            Object objG2 = composer.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new au.com.woolworths.shop.aem.components.ui.chatentrycard.b(24);
                composer.A(objG2);
            }
            Function1 function12 = (Function1) objG2;
            Object objE2 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE2 == composer$Companion$Empty$1) {
                objE2 = new au.com.woolworths.shop.aem.components.ui.chatentrycard.b(25);
                composer.A(objE2);
            }
            composer.l();
            HeroBannerKt.a(heroBanner2, function12, (Function1) objE2, composer, 432);
            composer.f();
        }
        return Unit.f24250a;
    }
}
