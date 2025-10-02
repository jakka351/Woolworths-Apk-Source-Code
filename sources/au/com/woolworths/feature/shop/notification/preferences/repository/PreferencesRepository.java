package au.com.woolworths.feature.shop.notification.preferences.repository;

import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/repository/PreferencesRepository;", "", "Companion", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PreferencesRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f7945a;
    public final DispatcherProvider b;
    public final FeatureToggleManager c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/repository/PreferencesRepository$Companion;", "", "", "SUPPORTED_TOGGLE_WATCHLIST", "Ljava/lang/String;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public PreferencesRepository(ApolloClient apolloClient, DispatcherProvider dispatchers, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(dispatchers, "dispatchers");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f7945a = apolloClient;
        this.b = dispatchers;
        this.c = featureToggleManager;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public static final au.com.woolworths.feature.shop.notification.preferences.models.PreferencesData a(au.com.woolworths.feature.shop.notification.preferences.repository.PreferencesRepository r23, au.com.woolworths.feature.shop.notification.preferences.PreferencesDetailsQuery.Preferences r24) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.notification.preferences.repository.PreferencesRepository.a(au.com.woolworths.feature.shop.notification.preferences.repository.PreferencesRepository, au.com.woolworths.feature.shop.notification.preferences.PreferencesDetailsQuery$Preferences):au.com.woolworths.feature.shop.notification.preferences.models.PreferencesData");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public static final au.com.woolworths.feature.shop.notification.preferences.models.PreferencesData b(au.com.woolworths.feature.shop.notification.preferences.repository.PreferencesRepository r23, au.com.woolworths.feature.shop.notification.preferences.UpdatePreferencesMutation.UpdatePreference r24) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.notification.preferences.repository.PreferencesRepository.b(au.com.woolworths.feature.shop.notification.preferences.repository.PreferencesRepository, au.com.woolworths.feature.shop.notification.preferences.UpdatePreferencesMutation$UpdatePreference):au.com.woolworths.feature.shop.notification.preferences.models.PreferencesData");
    }

    public final Object c(String str, Continuation continuation) {
        this.b.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new PreferencesRepository$fetchPreferenceDetails$2(this, str, null), continuation);
    }

    public final Object d(String str, boolean z, Continuation continuation) {
        this.b.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new PreferencesRepository$updatePreferenceToggle$2(this, str, z, null), continuation);
    }
}
