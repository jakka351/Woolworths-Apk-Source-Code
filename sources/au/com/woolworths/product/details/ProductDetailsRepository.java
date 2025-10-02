package au.com.woolworths.product.details;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.foundation.barcode.reader.models.BarcodeData;
import com.apollographql.apollo.ApolloClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/ProductDetailsRepository;", "", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductDetailsRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f9312a;
    public final DispatcherProvider b;
    public final FeatureToggleManager c;

    public ProductDetailsRepository(ApolloClient apolloClient, DispatcherProvider dispatcherProvider, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f9312a = apolloClient;
        this.b = dispatcherProvider;
        this.c = featureToggleManager;
    }

    public final Object a(String str, BarcodeData barcodeData, String str2, List list, SuspendLambda suspendLambda) {
        this.b.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new ProductDetailsRepository$fetchProductDetails$2(this, str, barcodeData, str2, list, null), suspendLambda);
    }
}
