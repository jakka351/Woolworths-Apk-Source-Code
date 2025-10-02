package au.com.woolworths.feature.shop.modeselector;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSection;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/ModeSelectorContract;", "", "ViewState", "DialogModel", "Actions", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ModeSelectorContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/ModeSelectorContract$Actions;", "", "ResolveDeepLink", "ShowSnackBarMessage", "OpenMapsApp", "LaunchLoginScreen", "Lau/com/woolworths/feature/shop/modeselector/ModeSelectorContract$Actions$LaunchLoginScreen;", "Lau/com/woolworths/feature/shop/modeselector/ModeSelectorContract$Actions$OpenMapsApp;", "Lau/com/woolworths/feature/shop/modeselector/ModeSelectorContract$Actions$ResolveDeepLink;", "Lau/com/woolworths/feature/shop/modeselector/ModeSelectorContract$Actions$ShowSnackBarMessage;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/ModeSelectorContract$Actions$LaunchLoginScreen;", "Lau/com/woolworths/feature/shop/modeselector/ModeSelectorContract$Actions;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchLoginScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f7514a;

            public LaunchLoginScreen(String urlAfterLogin) {
                Intrinsics.h(urlAfterLogin, "urlAfterLogin");
                this.f7514a = urlAfterLogin;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchLoginScreen) && Intrinsics.c(this.f7514a, ((LaunchLoginScreen) obj).f7514a);
            }

            public final int hashCode() {
                return this.f7514a.hashCode();
            }

            public final String toString() {
                return a.h("LaunchLoginScreen(urlAfterLogin=", this.f7514a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/ModeSelectorContract$Actions$OpenMapsApp;", "Lau/com/woolworths/feature/shop/modeselector/ModeSelectorContract$Actions;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenMapsApp extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f7515a;

            public OpenMapsApp(String address) {
                Intrinsics.h(address, "address");
                this.f7515a = address;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenMapsApp) && Intrinsics.c(this.f7515a, ((OpenMapsApp) obj).f7515a);
            }

            public final int hashCode() {
                return this.f7515a.hashCode();
            }

            public final String toString() {
                return a.h("OpenMapsApp(address=", this.f7515a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/ModeSelectorContract$Actions$ResolveDeepLink;", "Lau/com/woolworths/feature/shop/modeselector/ModeSelectorContract$Actions;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ResolveDeepLink extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f7516a;

            public ResolveDeepLink(String deepLink) {
                Intrinsics.h(deepLink, "deepLink");
                this.f7516a = deepLink;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ResolveDeepLink) && Intrinsics.c(this.f7516a, ((ResolveDeepLink) obj).f7516a);
            }

            public final int hashCode() {
                return this.f7516a.hashCode();
            }

            public final String toString() {
                return a.h("ResolveDeepLink(deepLink=", this.f7516a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/ModeSelectorContract$Actions$ShowSnackBarMessage;", "Lau/com/woolworths/feature/shop/modeselector/ModeSelectorContract$Actions;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackBarMessage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ResText f7517a;

            public ShowSnackBarMessage(ResText resText) {
                this.f7517a = resText;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowSnackBarMessage) && Intrinsics.c(this.f7517a, ((ShowSnackBarMessage) obj).f7517a);
            }

            public final int hashCode() {
                return this.f7517a.hashCode();
            }

            public final String toString() {
                return "ShowSnackBarMessage(messageText=" + this.f7517a + ")";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/ModeSelectorContract$DialogModel;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DialogModel {

        /* renamed from: a, reason: collision with root package name */
        public final ResText f7518a;
        public final String b;
        public final ResText c;
        public final ResText d;
        public final Function0 e;
        public final Function0 f;

        public DialogModel(ResText resText, String str, ResText resText2, ResText resText3, Function0 onDismissButtonClick, Function0 onPrimaryButtonClick) {
            Intrinsics.h(onDismissButtonClick, "onDismissButtonClick");
            Intrinsics.h(onPrimaryButtonClick, "onPrimaryButtonClick");
            this.f7518a = resText;
            this.b = str;
            this.c = resText2;
            this.d = resText3;
            this.e = onDismissButtonClick;
            this.f = onPrimaryButtonClick;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DialogModel)) {
                return false;
            }
            DialogModel dialogModel = (DialogModel) obj;
            return Intrinsics.c(this.f7518a, dialogModel.f7518a) && Intrinsics.c(this.b, dialogModel.b) && Intrinsics.c(this.c, dialogModel.c) && Intrinsics.c(this.d, dialogModel.d) && Intrinsics.c(this.e, dialogModel.e) && Intrinsics.c(this.f, dialogModel.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + b.c(this.f7518a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "DialogModel(title=" + this.f7518a + ", message=" + this.b + ", primaryButtonText=" + this.c + ", dismissButtonText=" + this.d + ", onDismissButtonClick=" + this.e + ", onPrimaryButtonClick=" + this.f + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/ModeSelectorContract$ViewState;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f7519a;
        public final FullPageMessage.Error b;
        public final DialogModel c;
        public final List d;
        public final DownloadableAsset e;
        public final ShoppingModeSection.ShoppingModeSelectorAddressInfoSection f;
        public final ShoppingModeSection.ShoppingModeSelectorOptionsSection g;
        public final ShoppingModeSection.ShoppingModeSelectorStoreDetailsSectionData h;
        public final ShoppingModeSection.ShoppingModeSelectorStoreFeaturesData i;
        public final String j;
        public final String k;

        public /* synthetic */ ViewState(boolean z, DialogModel dialogModel, List list, DownloadableAsset downloadableAsset, ShoppingModeSection.ShoppingModeSelectorAddressInfoSection shoppingModeSelectorAddressInfoSection, String str, int i) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : FullPageMessage.Error.ConnectionError.f8919a, (i & 4) != 0 ? null : dialogModel, (i & 8) != 0 ? EmptyList.d : list, (i & 16) != 0 ? null : downloadableAsset, (i & 32) != 0 ? null : shoppingModeSelectorAddressInfoSection, null, null, null, (i & 512) != 0 ? null : str, (i & 1024) == 0 ? "Just a quick disclaimer." : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v19, types: [java.util.List] */
        public static ViewState a(ViewState viewState, boolean z, FullPageMessage.Error error, DialogModel dialogModel, ArrayList arrayList, DownloadableAsset downloadableAsset, ShoppingModeSection.ShoppingModeSelectorAddressInfoSection shoppingModeSelectorAddressInfoSection, ShoppingModeSection.ShoppingModeSelectorOptionsSection shoppingModeSelectorOptionsSection, ShoppingModeSection.ShoppingModeSelectorStoreDetailsSectionData shoppingModeSelectorStoreDetailsSectionData, ShoppingModeSection.ShoppingModeSelectorStoreFeaturesData shoppingModeSelectorStoreFeaturesData, String str, String str2, int i) {
            if ((i & 1) != 0) {
                z = viewState.f7519a;
            }
            boolean z2 = z;
            if ((i & 2) != 0) {
                error = viewState.b;
            }
            FullPageMessage.Error error2 = error;
            if ((i & 4) != 0) {
                dialogModel = viewState.c;
            }
            DialogModel dialogModel2 = dialogModel;
            ArrayList shoppingModeButtons = (i & 8) != 0 ? viewState.d : arrayList;
            DownloadableAsset downloadableAsset2 = (i & 16) != 0 ? viewState.e : downloadableAsset;
            ShoppingModeSection.ShoppingModeSelectorAddressInfoSection shoppingModeSelectorAddressInfoSection2 = (i & 32) != 0 ? viewState.f : shoppingModeSelectorAddressInfoSection;
            ShoppingModeSection.ShoppingModeSelectorOptionsSection shoppingModeSelectorOptionsSection2 = (i & 64) != 0 ? viewState.g : shoppingModeSelectorOptionsSection;
            ShoppingModeSection.ShoppingModeSelectorStoreDetailsSectionData shoppingModeSelectorStoreDetailsSectionData2 = (i & 128) != 0 ? viewState.h : shoppingModeSelectorStoreDetailsSectionData;
            ShoppingModeSection.ShoppingModeSelectorStoreFeaturesData shoppingModeSelectorStoreFeaturesData2 = (i & 256) != 0 ? viewState.i : shoppingModeSelectorStoreFeaturesData;
            String str3 = (i & 512) != 0 ? viewState.j : str;
            String str4 = (i & 1024) != 0 ? viewState.k : str2;
            viewState.getClass();
            Intrinsics.h(shoppingModeButtons, "shoppingModeButtons");
            return new ViewState(z2, error2, dialogModel2, shoppingModeButtons, downloadableAsset2, shoppingModeSelectorAddressInfoSection2, shoppingModeSelectorOptionsSection2, shoppingModeSelectorStoreDetailsSectionData2, shoppingModeSelectorStoreFeaturesData2, str3, str4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f7519a == viewState.f7519a && Intrinsics.c(this.b, viewState.b) && Intrinsics.c(this.c, viewState.c) && Intrinsics.c(this.d, viewState.d) && Intrinsics.c(this.e, viewState.e) && Intrinsics.c(this.f, viewState.f) && Intrinsics.c(this.g, viewState.g) && Intrinsics.c(this.h, viewState.h) && Intrinsics.c(this.i, viewState.i) && Intrinsics.c(this.j, viewState.j) && Intrinsics.c(this.k, viewState.k);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f7519a) * 31;
            FullPageMessage.Error error = this.b;
            int iHashCode2 = (iHashCode + (error == null ? 0 : error.hashCode())) * 31;
            DialogModel dialogModel = this.c;
            int iD = b.d((iHashCode2 + (dialogModel == null ? 0 : dialogModel.hashCode())) * 31, 31, this.d);
            DownloadableAsset downloadableAsset = this.e;
            int iHashCode3 = (iD + (downloadableAsset == null ? 0 : downloadableAsset.hashCode())) * 31;
            ShoppingModeSection.ShoppingModeSelectorAddressInfoSection shoppingModeSelectorAddressInfoSection = this.f;
            int iHashCode4 = (iHashCode3 + (shoppingModeSelectorAddressInfoSection == null ? 0 : shoppingModeSelectorAddressInfoSection.hashCode())) * 31;
            ShoppingModeSection.ShoppingModeSelectorOptionsSection shoppingModeSelectorOptionsSection = this.g;
            int iHashCode5 = (iHashCode4 + (shoppingModeSelectorOptionsSection == null ? 0 : shoppingModeSelectorOptionsSection.hashCode())) * 31;
            ShoppingModeSection.ShoppingModeSelectorStoreDetailsSectionData shoppingModeSelectorStoreDetailsSectionData = this.h;
            int iHashCode6 = (iHashCode5 + (shoppingModeSelectorStoreDetailsSectionData == null ? 0 : shoppingModeSelectorStoreDetailsSectionData.f7535a.hashCode())) * 31;
            ShoppingModeSection.ShoppingModeSelectorStoreFeaturesData shoppingModeSelectorStoreFeaturesData = this.i;
            int iHashCode7 = (iHashCode6 + (shoppingModeSelectorStoreFeaturesData == null ? 0 : shoppingModeSelectorStoreFeaturesData.hashCode())) * 31;
            String str = this.j;
            int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.k;
            return iHashCode8 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(isLoading=");
            sb.append(this.f7519a);
            sb.append(", error=");
            sb.append(this.b);
            sb.append(", dialog=");
            sb.append(this.c);
            sb.append(", shoppingModeButtons=");
            sb.append(this.d);
            sb.append(", shoppingModeIllustratorImage=");
            sb.append(this.e);
            sb.append(", addressSection=");
            sb.append(this.f);
            sb.append(", modeSelectionOption=");
            sb.append(this.g);
            sb.append(", storeDetailsSectionData=");
            sb.append(this.h);
            sb.append(", featuresData=");
            sb.append(this.i);
            sb.append(", footNote=");
            sb.append(this.j);
            sb.append(", disclaimer=");
            return a.o(sb, this.k, ")");
        }

        public ViewState(boolean z, FullPageMessage.Error error, DialogModel dialogModel, List shoppingModeButtons, DownloadableAsset downloadableAsset, ShoppingModeSection.ShoppingModeSelectorAddressInfoSection shoppingModeSelectorAddressInfoSection, ShoppingModeSection.ShoppingModeSelectorOptionsSection shoppingModeSelectorOptionsSection, ShoppingModeSection.ShoppingModeSelectorStoreDetailsSectionData shoppingModeSelectorStoreDetailsSectionData, ShoppingModeSection.ShoppingModeSelectorStoreFeaturesData shoppingModeSelectorStoreFeaturesData, String str, String str2) {
            Intrinsics.h(shoppingModeButtons, "shoppingModeButtons");
            this.f7519a = z;
            this.b = error;
            this.c = dialogModel;
            this.d = shoppingModeButtons;
            this.e = downloadableAsset;
            this.f = shoppingModeSelectorAddressInfoSection;
            this.g = shoppingModeSelectorOptionsSection;
            this.h = shoppingModeSelectorStoreDetailsSectionData;
            this.i = shoppingModeSelectorStoreFeaturesData;
            this.j = str;
            this.k = str2;
        }
    }
}
