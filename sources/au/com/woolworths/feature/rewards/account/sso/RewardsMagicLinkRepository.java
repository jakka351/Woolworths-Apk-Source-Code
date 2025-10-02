package au.com.woolworths.feature.rewards.account.sso;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/sso/RewardsMagicLinkRepository;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsMagicLinkRepository {

    /* renamed from: a, reason: collision with root package name */
    public final AppConfig f5809a;
    public final ApolloClient b;
    public final DispatcherProvider c;

    public RewardsMagicLinkRepository(AppConfig appConfig, ApolloClient apolloClient, DispatcherProvider dispatcherProvider) {
        Intrinsics.h(appConfig, "appConfig");
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        this.f5809a = appConfig;
        this.b = apolloClient;
        this.c = dispatcherProvider;
    }
}
