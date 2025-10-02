package au.com.woolworths.shop.product.navigation;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.shop.collectionmode.RepositoryManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/navigation/ProductCategoryNavigationInteractor;", "", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductCategoryNavigationInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final RepositoryManager f12637a;
    public final ProductCategoryNavigationRepository b;

    public ProductCategoryNavigationInteractor(RepositoryManager repositoryManager, ProductCategoryNavigationRepository productCategoryNavigationRepository) {
        Intrinsics.h(repositoryManager, "repositoryManager");
        this.f12637a = repositoryManager;
        this.b = productCategoryNavigationRepository;
    }
}
