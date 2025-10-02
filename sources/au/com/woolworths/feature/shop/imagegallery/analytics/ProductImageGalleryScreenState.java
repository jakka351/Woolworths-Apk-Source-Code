package au.com.woolworths.feature.shop.imagegallery.analytics;

import au.com.woolworths.android.onesite.analytics.adobe.data.ScreenState;
import au.com.woolworths.android.onesite.appdata.AccountInteractor;
import au.com.woolworths.android.onesite.appdata.AppConfigurationInteractor;
import au.com.woolworths.android.onesite.repository.PreferencesManager;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/imagegallery/analytics/ProductImageGalleryScreenState;", "Lau/com/woolworths/android/onesite/analytics/adobe/data/ScreenState;", "image-gallery_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductImageGalleryScreenState extends ScreenState {
    public final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductImageGalleryScreenState(String articleId) {
        super("Product Image Gallery screen");
        Intrinsics.h(articleId, "articleId");
        this.b = articleId;
    }

    @Override // au.com.woolworths.android.onesite.analytics.adobe.data.ScreenState
    public final HashMap a(AppConfigurationInteractor appConfigurationInteractor, PreferencesManager preferencesManager, AccountInteractor accountInteractor) {
        Intrinsics.h(appConfigurationInteractor, "appConfigurationInteractor");
        Intrinsics.h(preferencesManager, "preferencesManager");
        Intrinsics.h(accountInteractor, "accountInteractor");
        HashMap mapA = super.a(appConfigurationInteractor, preferencesManager, accountInteractor);
        mapA.put("digitalData.products.articleID", this.b);
        return mapA;
    }
}
