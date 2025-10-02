package au.com.woolworths.feature.shop.storelocator;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/StoreLocatorContract;", "", "Actions", "ViewState", "MapState", "StoreListDisplayMode", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface StoreLocatorContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/StoreLocatorContract$Actions;", "", "GoToSettings", "TurnOnDeviceLocation", "ShowPermissionsDialog", "HideKeyboard", "CompleteSetStoreLocation", "OpenStoreDetails", "ShowSnackbarMessage", "Lau/com/woolworths/feature/shop/storelocator/StoreLocatorContract$Actions$CompleteSetStoreLocation;", "Lau/com/woolworths/feature/shop/storelocator/StoreLocatorContract$Actions$GoToSettings;", "Lau/com/woolworths/feature/shop/storelocator/StoreLocatorContract$Actions$HideKeyboard;", "Lau/com/woolworths/feature/shop/storelocator/StoreLocatorContract$Actions$OpenStoreDetails;", "Lau/com/woolworths/feature/shop/storelocator/StoreLocatorContract$Actions$ShowPermissionsDialog;", "Lau/com/woolworths/feature/shop/storelocator/StoreLocatorContract$Actions$ShowSnackbarMessage;", "Lau/com/woolworths/feature/shop/storelocator/StoreLocatorContract$Actions$TurnOnDeviceLocation;", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/StoreLocatorContract$Actions$CompleteSetStoreLocation;", "Lau/com/woolworths/feature/shop/storelocator/StoreLocatorContract$Actions;", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CompleteSetStoreLocation extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final CompleteSetStoreLocation f8119a = new CompleteSetStoreLocation();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/StoreLocatorContract$Actions$GoToSettings;", "Lau/com/woolworths/feature/shop/storelocator/StoreLocatorContract$Actions;", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class GoToSettings extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final GoToSettings f8120a = new GoToSettings();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/StoreLocatorContract$Actions$HideKeyboard;", "Lau/com/woolworths/feature/shop/storelocator/StoreLocatorContract$Actions;", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class HideKeyboard extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final HideKeyboard f8121a = new HideKeyboard();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/StoreLocatorContract$Actions$OpenStoreDetails;", "Lau/com/woolworths/feature/shop/storelocator/StoreLocatorContract$Actions;", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenStoreDetails extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Store f8122a;

            public OpenStoreDetails(Store store) {
                Intrinsics.h(store, "store");
                this.f8122a = store;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenStoreDetails) && Intrinsics.c(this.f8122a, ((OpenStoreDetails) obj).f8122a);
            }

            public final int hashCode() {
                return this.f8122a.hashCode();
            }

            public final String toString() {
                return "OpenStoreDetails(store=" + this.f8122a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/StoreLocatorContract$Actions$ShowPermissionsDialog;", "Lau/com/woolworths/feature/shop/storelocator/StoreLocatorContract$Actions;", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShowPermissionsDialog extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowPermissionsDialog f8123a = new ShowPermissionsDialog();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/StoreLocatorContract$Actions$ShowSnackbarMessage;", "Lau/com/woolworths/feature/shop/storelocator/StoreLocatorContract$Actions;", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackbarMessage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final int f8124a;

            public ShowSnackbarMessage(int i) {
                this.f8124a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowSnackbarMessage) && this.f8124a == ((ShowSnackbarMessage) obj).f8124a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f8124a);
            }

            public final String toString() {
                return YU.a.e(this.f8124a, "ShowSnackbarMessage(messageResId=", ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/StoreLocatorContract$Actions$TurnOnDeviceLocation;", "Lau/com/woolworths/feature/shop/storelocator/StoreLocatorContract$Actions;", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class TurnOnDeviceLocation extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final TurnOnDeviceLocation f8125a = new TurnOnDeviceLocation();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/StoreLocatorContract$MapState;", "", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MapState {

        /* renamed from: a, reason: collision with root package name */
        public final List f8126a;

        public MapState(List list) {
            this.f8126a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MapState) && Intrinsics.c(this.f8126a, ((MapState) obj).f8126a);
        }

        public final int hashCode() {
            return this.f8126a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.l("MapState(storeList=", ")", this.f8126a);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/StoreLocatorContract$StoreListDisplayMode;", "", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StoreListDisplayMode {
        public static final StoreListDisplayMode d;
        public static final StoreListDisplayMode e;
        public static final /* synthetic */ StoreListDisplayMode[] f;
        public static final /* synthetic */ EnumEntries g;

        static {
            StoreListDisplayMode storeListDisplayMode = new StoreListDisplayMode("LIST", 0);
            d = storeListDisplayMode;
            StoreListDisplayMode storeListDisplayMode2 = new StoreListDisplayMode("MAP", 1);
            e = storeListDisplayMode2;
            StoreListDisplayMode[] storeListDisplayModeArr = {storeListDisplayMode, storeListDisplayMode2};
            f = storeListDisplayModeArr;
            g = EnumEntriesKt.a(storeListDisplayModeArr);
        }

        public static StoreListDisplayMode valueOf(String str) {
            return (StoreListDisplayMode) Enum.valueOf(StoreListDisplayMode.class, str);
        }

        public static StoreListDisplayMode[] values() {
            return (StoreListDisplayMode[]) f.clone();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/StoreLocatorContract$ViewState;", "", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f8127a;
        public final StoreListDisplayMode b;
        public final List c;
        public final List d;
        public final StoreLocatorFullPageErrorState e;

        public ViewState(boolean z, StoreListDisplayMode mode, List storeList, List suburbList, StoreLocatorFullPageErrorState storeLocatorFullPageErrorState) {
            Intrinsics.h(mode, "mode");
            Intrinsics.h(storeList, "storeList");
            Intrinsics.h(suburbList, "suburbList");
            this.f8127a = z;
            this.b = mode;
            this.c = storeList;
            this.d = suburbList;
            this.e = storeLocatorFullPageErrorState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f8127a == viewState.f8127a && this.b == viewState.b && Intrinsics.c(this.c, viewState.c) && Intrinsics.c(this.d, viewState.d) && this.e == viewState.e;
        }

        public final int hashCode() {
            int iD = androidx.camera.core.impl.b.d(androidx.camera.core.impl.b.d((this.b.hashCode() + (Boolean.hashCode(this.f8127a) * 31)) * 31, 31, this.c), 31, this.d);
            StoreLocatorFullPageErrorState storeLocatorFullPageErrorState = this.e;
            return iD + (storeLocatorFullPageErrorState == null ? 0 : storeLocatorFullPageErrorState.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(isLoading=");
            sb.append(this.f8127a);
            sb.append(", mode=");
            sb.append(this.b);
            sb.append(", storeList=");
            au.com.woolworths.android.onesite.a.C(sb, this.c, ", suburbList=", this.d, ", errorState=");
            sb.append(this.e);
            sb.append(")");
            return sb.toString();
        }
    }
}
