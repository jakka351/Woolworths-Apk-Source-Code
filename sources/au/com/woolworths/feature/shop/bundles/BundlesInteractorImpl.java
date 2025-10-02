package au.com.woolworths.feature.shop.bundles;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import au.com.woolworths.feature.shop.bundles.data.BundlesData;
import au.com.woolworths.feature.shop.bundles.data.UpdateCartBundleQuantity;
import au.com.woolworths.feature.shop.bundles.pagination.BundlesPagingSource;
import java.util.List;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesInteractorImpl;", "Lau/com/woolworths/feature/shop/bundles/BundlesInteractor;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BundlesInteractorImpl implements BundlesInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final BundlesRepository f6709a;
    public BundlesPagingSource b;
    public final MutableStateFlow c = StateFlowKt.a(null);

    public BundlesInteractorImpl(BundlesRepository bundlesRepository) {
        this.f6709a = bundlesRepository;
    }

    @Override // au.com.woolworths.feature.shop.bundles.BundlesInteractor
    public final Flow a() {
        return this.c;
    }

    @Override // au.com.woolworths.feature.shop.bundles.BundlesInteractor
    public final BundlesData b(String str) {
        return (BundlesData) this.f6709a.c.get(str);
    }

    @Override // au.com.woolworths.feature.shop.bundles.BundlesInteractor
    public final Object c(List list, String str, SuspendLambda suspendLambda) {
        return this.f6709a.b(str, list, suspendLambda);
    }

    @Override // au.com.woolworths.feature.shop.bundles.BundlesInteractor
    public final void d(UpdateCartBundleQuantity data) {
        Intrinsics.h(data, "data");
        this.c.setValue(data);
    }

    @Override // au.com.woolworths.feature.shop.bundles.BundlesInteractor
    public final void e() {
        BundlesPagingSource bundlesPagingSource = this.b;
        if (bundlesPagingSource != null) {
            bundlesPagingSource.c();
        }
    }

    @Override // au.com.woolworths.feature.shop.bundles.BundlesInteractor
    public final Flow f(final String str, final String str2, final String str3, final boolean z, final Function1 function1, final Function1 function12) {
        return new Pager(new PagingConfig(10, 0, 10, 50, false), new Function0() { // from class: au.com.woolworths.feature.shop.bundles.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BundlesInteractorImpl bundlesInteractorImpl = this.d;
                BundlesPagingSource bundlesPagingSource = new BundlesPagingSource(bundlesInteractorImpl.f6709a, str, str2, str3, z, function1, function12);
                bundlesInteractorImpl.b = bundlesPagingSource;
                return bundlesPagingSource;
            }
        }).f3571a;
    }
}
