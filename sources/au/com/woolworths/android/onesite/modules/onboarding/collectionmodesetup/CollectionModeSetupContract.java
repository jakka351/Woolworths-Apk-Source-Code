package au.com.woolworths.android.onesite.modules.onboarding.collectionmodesetup;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/modules/onboarding/collectionmodesetup/CollectionModeSetupContract;", "", "Actions", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CollectionModeSetupContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/android/onesite/modules/onboarding/collectionmodesetup/CollectionModeSetupContract$Actions;", "", "LaunchStoreLocatorForPickUp", "LaunchStoreLocatorForInStore", "LaunchAddDeliveryAddressBySearch", "LaunchHome", "Lau/com/woolworths/android/onesite/modules/onboarding/collectionmodesetup/CollectionModeSetupContract$Actions$LaunchAddDeliveryAddressBySearch;", "Lau/com/woolworths/android/onesite/modules/onboarding/collectionmodesetup/CollectionModeSetupContract$Actions$LaunchHome;", "Lau/com/woolworths/android/onesite/modules/onboarding/collectionmodesetup/CollectionModeSetupContract$Actions$LaunchStoreLocatorForInStore;", "Lau/com/woolworths/android/onesite/modules/onboarding/collectionmodesetup/CollectionModeSetupContract$Actions$LaunchStoreLocatorForPickUp;", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/onboarding/collectionmodesetup/CollectionModeSetupContract$Actions$LaunchAddDeliveryAddressBySearch;", "Lau/com/woolworths/android/onesite/modules/onboarding/collectionmodesetup/CollectionModeSetupContract$Actions;", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchAddDeliveryAddressBySearch extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchAddDeliveryAddressBySearch f4375a = new LaunchAddDeliveryAddressBySearch();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/onboarding/collectionmodesetup/CollectionModeSetupContract$Actions$LaunchHome;", "Lau/com/woolworths/android/onesite/modules/onboarding/collectionmodesetup/CollectionModeSetupContract$Actions;", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchHome extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f4376a;

            public LaunchHome(String message) {
                Intrinsics.h(message, "message");
                this.f4376a = message;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchHome) && Intrinsics.c(this.f4376a, ((LaunchHome) obj).f4376a);
            }

            public final int hashCode() {
                return this.f4376a.hashCode();
            }

            public final String toString() {
                return a.h("LaunchHome(message=", this.f4376a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/onboarding/collectionmodesetup/CollectionModeSetupContract$Actions$LaunchStoreLocatorForInStore;", "Lau/com/woolworths/android/onesite/modules/onboarding/collectionmodesetup/CollectionModeSetupContract$Actions;", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchStoreLocatorForInStore extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchStoreLocatorForInStore f4377a = new LaunchStoreLocatorForInStore();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/onboarding/collectionmodesetup/CollectionModeSetupContract$Actions$LaunchStoreLocatorForPickUp;", "Lau/com/woolworths/android/onesite/modules/onboarding/collectionmodesetup/CollectionModeSetupContract$Actions;", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchStoreLocatorForPickUp extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchStoreLocatorForPickUp f4378a = new LaunchStoreLocatorForPickUp();
        }
    }
}
