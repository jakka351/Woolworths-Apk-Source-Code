package au.com.woolworths.feature.rewards.account.closeaccount;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/closeaccount/CloseAccountRepository;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CloseAccountRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f5688a;
    public final DispatcherProvider b;

    public CloseAccountRepository(DispatcherProvider dispatcherProvider, ApolloClient apolloClient) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        this.f5688a = apolloClient;
        this.b = dispatcherProvider;
    }
}
