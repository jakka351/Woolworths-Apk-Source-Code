package au.com.woolworths.feature.shop.homepage.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.utils.preload.PreLoader;
import au.com.woolworths.feature.shop.catalogue.CatalogueStoreRepositoryImpl;
import au.com.woolworths.feature.shop.homepage.data.HomeListData;
import au.com.woolworths.feature.shop.homepage.data.HomeRepository;
import au.com.woolworths.foundation.shared.instore.wifi.InStoreWifiInteractor;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.collectionmode.RepositoryManager;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/domain/HomeInteractor;", "Lau/com/woolworths/android/onesite/utils/preload/PreLoader;", "Lau/com/woolworths/feature/shop/homepage/data/HomeListData;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HomeInteractor extends PreLoader<HomeListData> {
    public final CollectionModeInteractor e;
    public final RepositoryManager f;
    public final HomeRepository g;
    public final CatalogueStoreRepositoryImpl h;
    public final InStoreWifiInteractor i;
    public final FeatureToggleManager j;
    public final ShopAccountInteractor k;

    public HomeInteractor(CollectionModeInteractor collectionModeInteractor, RepositoryManager repositoryManager, HomeRepository homeRepository, CatalogueStoreRepositoryImpl catalogueStoreRepositoryImpl, InStoreWifiInteractor inStoreWifiInteractor, FeatureToggleManager featureToggleManager, ShopAccountInteractor accountInteractor) {
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(repositoryManager, "repositoryManager");
        Intrinsics.h(inStoreWifiInteractor, "inStoreWifiInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(accountInteractor, "accountInteractor");
        this.e = collectionModeInteractor;
        this.f = repositoryManager;
        this.g = homeRepository;
        this.h = catalogueStoreRepositoryImpl;
        this.i = inStoreWifiInteractor;
        this.j = featureToggleManager;
        this.k = accountInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        if (r11 == r0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // au.com.woolworths.android.onesite.utils.preload.PreLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object T(kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.homepage.domain.HomeInteractor.T(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
