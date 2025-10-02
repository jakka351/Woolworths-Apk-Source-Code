package au.com.woolworths.feature.shop.catalogue.productlist.interactor;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.shop.collectionmode.RepositoryManager;
import au.com.woolworths.product.interactor.ProductsInteractor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/interactor/ProductsForStoreInteractor;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductsForStoreInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final RepositoryManager f6945a;
    public final ProductsInteractor b;

    public ProductsForStoreInteractor(RepositoryManager repositoryManager, ProductsInteractor productsInteractor) {
        Intrinsics.h(repositoryManager, "repositoryManager");
        this.f6945a = repositoryManager;
        this.b = productsInteractor;
    }
}
