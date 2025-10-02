package au.com.woolworths.sdui.rewards.appmodal.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.android.onesite.data.DownloadableAssetFit;
import au.com.woolworths.android.onesite.data.DownloadableAssetType;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.rewards.base.info.FeatureInfoBulletItem;
import au.com.woolworths.rewards.base.info.FeatureInfoFooter;
import au.com.woolworths.rewards.base.info.FeatureInfoHeading;
import au.com.woolworths.rewards.modal.RewardsAppModalData;
import au.com.woolworths.sdui.legacy.banner.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.BERTags;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$AppModalScreenKt$lambda$555645887$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            RewardsAppModalData rewardsAppModalData = new RewardsAppModalData(new DownloadableAsset(DownloadableAssetType.IMAGE, "https://test.mobile-api.woolworths.com.au/zeus/mnemosyne/v1/public/modals/push_notifications_header.png", 375, 208, (DownloadableAssetFit) null, (String) null, 32, (DefaultConstructorMarker) null), "Now you won’t have to miss a Boost", "We’ll send you reminders to activate your Boosts before you shop, so you can keep collecting bonus points, and fast-tracking your next reward.", "", CollectionsKt.R(new FeatureInfoHeading("What will we notify you about?"), new FeatureInfoBulletItem("", "Savings and discounts", "Count every dollar you save the next time you shop or fill up."), new FeatureInfoBulletItem("", "New Boosts and weekly reminders", "Don’t miss out on those bonus points to fast-track your next reward.."), new FeatureInfoBulletItem("", "Savings and discounts", "Be the first to know when we launch new partners or exciting features")), new FeatureInfoFooter(new ContentCta("Continue", (String) null, (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null), null), (AnalyticsData) null, (AnalyticsData) null, BERTags.PRIVATE, (DefaultConstructorMarker) null);
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new h(20);
                composer.A(objG);
            }
            Function0 function0 = (Function0) objG;
            Object objE = a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new au.com.woolworths.feature.product.list.legacy.compose.filter.a(22);
                composer.A(objE);
            }
            Function1 function1 = (Function1) objE;
            Object objE2 = a.e(composer, 1849434622);
            if (objE2 == composer$Companion$Empty$1) {
                objE2 = new c(10);
                composer.A(objE2);
            }
            composer.l();
            AppModalScreenKt.a(rewardsAppModalData, function0, function1, (Function1) objE2, composer, 3512);
        }
        return Unit.f24250a;
    }
}
