package au.com.woolworths.shop.receipt.details;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.feature.shared.receipt.details.EReceiptDetailsRepository;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipt/details/ShopReceiptDetailsRepository;", "Lau/com/woolworths/feature/shared/receipt/details/EReceiptDetailsRepository;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShopReceiptDetailsRepository implements EReceiptDetailsRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f12790a;
    public final DispatcherProvider b;

    public ShopReceiptDetailsRepository(DispatcherProvider dispatcher, ApolloClient apolloClient) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(dispatcher, "dispatcher");
        this.f12790a = apolloClient;
        this.b = dispatcher;
    }

    public final Object a(String str, Continuation continuation) {
        this.b.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new ShopReceiptDetailsRepository$getEReceiptDetails$2(this, str, null), continuation);
    }
}
