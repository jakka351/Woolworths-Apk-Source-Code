package au.com.woolworths.foundation.rewards.banner.dismiss;

import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/banner/dismiss/BannerRemoteDismissRepository;", "", "banner-dismiss_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BannerRemoteDismissRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f8541a;
    public final DispatcherProvider b;

    public BannerRemoteDismissRepository(DispatcherProvider dispatcher, ApolloClient apolloClient) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(dispatcher, "dispatcher");
        this.f8541a = apolloClient;
        this.b = dispatcher;
    }
}
