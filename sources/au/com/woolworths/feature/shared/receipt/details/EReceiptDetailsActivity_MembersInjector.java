package au.com.woolworths.feature.shared.receipt.details;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.foundation.feature.app.AppIdentifier;
import au.com.woolworths.shop.receipt.details.ShopReceiptUiProvider;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class EReceiptDetailsActivity_MembersInjector implements MembersInjector<EReceiptDetailsActivity> {
    public static void a(EReceiptDetailsActivity eReceiptDetailsActivity, AppIdentifier appIdentifier) {
        eReceiptDetailsActivity.z = appIdentifier;
    }

    public static void b(EReceiptDetailsActivity eReceiptDetailsActivity, ShopReceiptUiProvider shopReceiptUiProvider) {
        eReceiptDetailsActivity.x = shopReceiptUiProvider;
    }

    public static void c(EReceiptDetailsActivity eReceiptDetailsActivity, FeatureToggleManager featureToggleManager) {
        eReceiptDetailsActivity.y = featureToggleManager;
    }
}
