package au.com.woolworths.feature.rewards.offers;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractorKt;
import au.com.woolworths.foundation.feature.app.AppIdentifier;
import au.com.woolworths.rewards.base.RewardsBaseFeature;
import au.com.woolworths.rewards.base.ShopAppInstallationInteractor;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/RewardsHomeOfferRepository;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsHomeOfferRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f6234a;
    public final DispatcherProvider b;
    public final FeatureToggleManager c;
    public final ShopAppInstallationInteractor d;
    public final RewardsAccountInteractor e;
    public final boolean f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6235a;

        static {
            int[] iArr = new int[Region.values().length];
            try {
                Region.Companion companion = Region.h;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Region.Companion companion2 = Region.h;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6235a = iArr;
        }
    }

    public RewardsHomeOfferRepository(ApolloClient apolloClient, DispatcherProvider dispatcherProvider, FeatureToggleManager featureToggleManager, ShopAppInstallationInteractor shopAppInstallationInteractor, AppIdentifier appIdentifier, RewardsAccountInteractor rewardsAccountInteractor) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(appIdentifier, "appIdentifier");
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        this.f6234a = apolloClient;
        this.b = dispatcherProvider;
        this.c = featureToggleManager;
        this.d = shopAppInstallationInteractor;
        this.e = rewardsAccountInteractor;
        this.f = appIdentifier != AppIdentifier.d;
    }

    public static final boolean a(RewardsHomeOfferRepository rewardsHomeOfferRepository) {
        FeatureToggleManager featureToggleManager = rewardsHomeOfferRepository.c;
        Region regionA = RewardsAccountInteractorKt.a(rewardsHomeOfferRepository.e);
        int i = regionA == null ? -1 : WhenMappings.f6235a[regionA.ordinal()];
        if (i == 1) {
            return featureToggleManager.c(RewardsBaseFeature.m);
        }
        if (i != 2) {
            return false;
        }
        return featureToggleManager.c(RewardsBaseFeature.l);
    }

    public final Object b(Continuation continuation) {
        this.b.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new RewardsHomeOfferRepository$getOfferFeed$2(this, null), continuation);
    }
}
