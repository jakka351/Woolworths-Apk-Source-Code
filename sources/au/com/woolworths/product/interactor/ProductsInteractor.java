package au.com.woolworths.product.interactor;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.BaseFeature;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/interactor/ProductsInteractor;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProductsInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final ProductsRepository f9320a;
    public final FeatureToggleManager b;

    public ProductsInteractor(ProductsRepository productsRepository, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f9320a = productsRepository;
        this.b = featureToggleManager;
    }

    public static Object a(ProductsInteractor productsInteractor, List list, String str, String str2, ContinuationImpl continuationImpl, int i) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        return productsInteractor.f9320a.a(list, str, str2, false, productsInteractor.b.c(BaseFeature.g), continuationImpl);
    }
}
