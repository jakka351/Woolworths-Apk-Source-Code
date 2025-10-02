package au.com.woolworths.feature.shop.homepage.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.deeplink.SupportedLinksHelper;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/data/HomeRepository;", "", "Companion", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class HomeRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f7197a;
    public final DispatcherProvider b;
    public final FeatureToggleManager c;
    public final SupportedLinksHelper d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/data/HomeRepository$Companion;", "", "", "API_FEATURES", "Ljava/lang/String;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public HomeRepository(ApolloClient apolloClient, DispatcherProvider dispatcher, FeatureToggleManager featureToggleManager, SupportedLinksHelper supportedLinksHelper) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(dispatcher, "dispatcher");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f7197a = apolloClient;
        this.b = dispatcher;
        this.c = featureToggleManager;
        this.d = supportedLinksHelper;
    }

    public final Object a(String str, Continuation continuation) {
        this.b.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new HomeRepository$dismissDeliveryNowBanner$2(this, str, null), continuation);
    }

    public final Object b(String str, CollectionMode collectionMode, String str2, boolean z, String str3, Continuation continuation) {
        this.b.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new HomeRepository$fetchHome$2(this, collectionMode, str, str2, z, str3, null), continuation);
    }

    public final Object c(String str, CollectionMode collectionMode, String str2, boolean z, Continuation continuation) {
        this.b.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new HomeRepository$fetchHomeContentPage$2(this, collectionMode, str, str2, z, null), continuation);
    }
}
