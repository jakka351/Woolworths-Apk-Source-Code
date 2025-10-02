package au.com.woolworths.feature.rewards.account.settings;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.feature.rewards.account.sso.MagicLinkSessionProvider;
import com.apollographql.apollo.ApolloClient;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsRepositoryOld;", "Lau/com/woolworths/feature/rewards/account/sso/MagicLinkSessionProvider;", "Companion", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AccountSettingsRepositoryOld implements MagicLinkSessionProvider {
    public final Application d;
    public final ApolloClient e;
    public final Gson f;
    public final SharedPreferences g;
    public final DispatcherProvider h;
    public final FeatureToggleManager i;
    public final Context j;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsRepositoryOld$Companion;", "", "", "CHATBOT_SESSION", "Ljava/lang/String;", "HEADER_APP_CONFIG", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public AccountSettingsRepositoryOld(Application application, ApolloClient apolloClient, Gson gson, SharedPreferences sharedPreferences, DispatcherProvider dispatcherProvider, FeatureToggleManager featureToggleManager, Context context) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(context, "context");
        this.d = application;
        this.e = apolloClient;
        this.f = gson;
        this.g = sharedPreferences;
        this.h = dispatcherProvider;
        this.i = featureToggleManager;
        this.j = context;
    }
}
