package au.com.woolworths.feature.shop.bundles;

import au.com.woolworths.feature.shop.bundles.data.BundlesData;
import au.com.woolworths.feature.shop.bundles.data.UpdateCartBundleQuantity;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesInteractor;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface BundlesInteractor {
    Flow a();

    BundlesData b(String str);

    Object c(List list, String str, SuspendLambda suspendLambda);

    void d(UpdateCartBundleQuantity updateCartBundleQuantity);

    void e();

    Flow f(String str, String str2, String str3, boolean z, Function1 function1, Function1 function12);
}
