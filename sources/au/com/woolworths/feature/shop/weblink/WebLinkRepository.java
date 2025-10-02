package au.com.woolworths.feature.shop.weblink;

import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.webview.ReleaseSquadHeaderInteractor;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/weblink/WebLinkRepository;", "", "web-link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WebLinkRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f8257a;
    public final DispatcherProvider b;
    public final ReleaseSquadHeaderInteractor c;

    public WebLinkRepository(ApolloClient apolloClient, DispatcherProvider dispatcherProvider, ReleaseSquadHeaderInteractor releaseSquadHeaderInteractor) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        this.f8257a = apolloClient;
        this.b = dispatcherProvider;
        this.c = releaseSquadHeaderInteractor;
    }
}
