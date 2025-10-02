package au.com.woolworths.shop.aem.components.ui.herobanner;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.l;
import au.com.woolworths.sdui.model.action.ActionType;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import au.com.woolworths.shop.aem.components.model.herobanner.CarouselItem;
import au.com.woolworths.shop.aem.components.model.herobanner.HeroBanner;
import au.com.woolworths.shop.aem.components.model.herobanner.HeroBannerAction;
import au.com.woolworths.shop.aem.components.model.herobanner.HeroBannerTermsAndConditions;
import au.com.woolworths.shop.aem.components.model.herobanner.HeroBannerText;
import au.com.woolworths.shop.aem.components.model.herobanner.HeroBannerTitleSize;
import au.com.woolworths.shop.aem.components.ui.chatentrycard.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$HeroBannerKt$lambda$1576385921$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ActionType actionType = ActionType.d;
            HeroBannerAction heroBannerAction = new HeroBannerAction("", null, actionType);
            AnalyticsData analyticsData = new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 143, (DefaultConstructorMarker) null);
            HeroBannerText.HeroBannerBodyText heroBannerBodyText = new HeroBannerText.HeroBannerBodyText("its body text");
            List listQ = CollectionsKt.Q(new ImageWithAltText("https://foodhub.scene7.com/is/image/woolworthsltdstage/Mealplanner-Welcome-1?fmt=png-alpha", ""));
            List listQ2 = CollectionsKt.Q(new ImageWithAltText("", ""));
            HeroBannerTermsAndConditions heroBannerTermsAndConditions = new HeroBannerTermsAndConditions("Terms and conditions apply", null);
            HeroBannerTitleSize heroBannerTitleSize = HeroBannerTitleSize.e;
            List listR = CollectionsKt.R(new CarouselItem(new HeroBanner("1", heroBannerAction, analyticsData, new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null), "#FF178841", null, heroBannerBodyText, null, listQ, listQ2, heroBannerTermsAndConditions, "$5 off your Direct to Boot or Pick Up.", heroBannerTitleSize)), new CarouselItem(new HeroBanner("2", new HeroBannerAction("", null, actionType), new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 143, (DefaultConstructorMarker) null), new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null), "#CAEB6D", null, new HeroBannerText.HeroBannerBodyText("$5 off your Direct to Boot or Pick Up."), null, null, CollectionsKt.Q(new ImageWithAltText("", "")), new HeroBannerTermsAndConditions("Terms and conditions apply", null), "$5 off your Direct to Boot or Pick Up.", heroBannerTitleSize)));
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new b(26);
                composer.A(objG);
            }
            Function1 function1 = (Function1) objG;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new b(27);
                composer.A(objE);
            }
            Function1 function12 = (Function1) objE;
            Object objE2 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE2 == composer$Companion$Empty$1) {
                objE2 = new l(22);
                composer.A(objE2);
            }
            composer.l();
            HeroBannerKt.b(listR, function1, function12, null, 0, (Function1) objE2, composer, 221616, 8);
        }
        return Unit.f24250a;
    }
}
