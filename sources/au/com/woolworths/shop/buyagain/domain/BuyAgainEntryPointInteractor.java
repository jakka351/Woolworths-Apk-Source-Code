package au.com.woolworths.shop.buyagain.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/domain/BuyAgainEntryPointInteractor;", "", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BuyAgainEntryPointInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final ShopAccountInteractor f10252a;
    public final CollectionModeInteractor b;
    public final FeatureToggleManager c;

    public BuyAgainEntryPointInteractor(ShopAccountInteractor accountInteractor, CollectionModeInteractor collectionModeInteractor, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f10252a = accountInteractor;
        this.b = collectionModeInteractor;
        this.c = featureToggleManager;
    }
}
