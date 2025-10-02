package au.com.woolworths.android.onesite.modules.onboarding.collectionmodesetup;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.ActivityRequestCode;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.modules.onboarding.analytics.OnboardingCollectionModeActions;
import au.com.woolworths.android.onesite.modules.onboarding.collectionmodesetup.CollectionModeSetupContract;
import au.com.woolworths.android.onesite.repository.LaunchManager;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.subjects.PublishSubject;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/modules/onboarding/collectionmodesetup/CollectionModeSetupViewModel;", "Landroidx/lifecycle/ViewModel;", "Companion", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CollectionModeSetupViewModel extends ViewModel {
    public static final List l;
    public final CollectionModeInteractor e;
    public final AnalyticsManager f;
    public final LaunchManager g;
    public final PublishSubject h;
    public boolean i;
    public String j;
    public final PublishSubject k;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/android/onesite/modules/onboarding/collectionmodesetup/CollectionModeSetupViewModel$Companion;", "", "", "", "VALID_REQUEST_CODES", "Ljava/util/List;", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        ActivityRequestCode[] activityRequestCodeArr = ActivityRequestCode.d;
        l = CollectionsKt.R(4, 33673, 32673, 0, 5);
    }

    public CollectionModeSetupViewModel(CollectionModeInteractor collectionModeInteractor, AnalyticsManager analyticsManager, LaunchManager launchManager) {
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(launchManager, "launchManager");
        this.e = collectionModeInteractor;
        this.f = analyticsManager;
        this.g = launchManager;
        PublishSubject publishSubject = new PublishSubject();
        this.h = publishSubject;
        this.j = "";
        this.k = publishSubject;
    }

    public final void p6(CollectionMode collectionMode) {
        this.e.i(collectionMode);
        boolean zEquals = collectionMode.equals(CollectionMode.PickUp.d);
        AnalyticsManager analyticsManager = this.f;
        PublishSubject publishSubject = this.h;
        if (zEquals) {
            publishSubject.onNext(CollectionModeSetupContract.Actions.LaunchStoreLocatorForPickUp.f4378a);
            analyticsManager.c(OnboardingCollectionModeActions.e);
        } else if (collectionMode.equals(CollectionMode.InStore.d)) {
            publishSubject.onNext(CollectionModeSetupContract.Actions.LaunchStoreLocatorForInStore.f4377a);
            analyticsManager.c(OnboardingCollectionModeActions.g);
        } else {
            if (!(collectionMode instanceof CollectionMode.Delivery)) {
                throw new IllegalArgumentException("Invalid collection mode clicked!");
            }
            publishSubject.onNext(CollectionModeSetupContract.Actions.LaunchAddDeliveryAddressBySearch.f4375a);
            analyticsManager.c(OnboardingCollectionModeActions.f);
        }
    }
}
