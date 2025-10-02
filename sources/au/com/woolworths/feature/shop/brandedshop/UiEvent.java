package au.com.woolworths.feature.shop.brandedshop;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.brandedshop.data.SnackbarContent;
import au.com.woolworths.shop.aem.components.model.button.ButtonData;
import au.com.woolworths.shop.aem.components.model.contentcard.FullWidthContentCardData;
import au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListData;
import au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListItem;
import au.com.woolworths.shop.aem.components.model.link.LinkData;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/UiEvent;", "", "OnTabClick", "OnBottomSheetDismiss", "OnSnackbarStateChanged", "OnButtonClick", "OnFullWidthContentCardClick", "OnHorizontalListActionClick", "OnLinkClick", "OnListItemClick", "OnShoppingListViewClick", "OnErrorRetryClick", "Lau/com/woolworths/feature/shop/brandedshop/UiEvent$OnBottomSheetDismiss;", "Lau/com/woolworths/feature/shop/brandedshop/UiEvent$OnButtonClick;", "Lau/com/woolworths/feature/shop/brandedshop/UiEvent$OnErrorRetryClick;", "Lau/com/woolworths/feature/shop/brandedshop/UiEvent$OnFullWidthContentCardClick;", "Lau/com/woolworths/feature/shop/brandedshop/UiEvent$OnHorizontalListActionClick;", "Lau/com/woolworths/feature/shop/brandedshop/UiEvent$OnLinkClick;", "Lau/com/woolworths/feature/shop/brandedshop/UiEvent$OnListItemClick;", "Lau/com/woolworths/feature/shop/brandedshop/UiEvent$OnShoppingListViewClick;", "Lau/com/woolworths/feature/shop/brandedshop/UiEvent$OnSnackbarStateChanged;", "Lau/com/woolworths/feature/shop/brandedshop/UiEvent$OnTabClick;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface UiEvent {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/UiEvent$OnBottomSheetDismiss;", "Lau/com/woolworths/feature/shop/brandedshop/UiEvent;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBottomSheetDismiss implements UiEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final OnBottomSheetDismiss f6666a = new OnBottomSheetDismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnBottomSheetDismiss);
        }

        public final int hashCode() {
            return 871355970;
        }

        public final String toString() {
            return "OnBottomSheetDismiss";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/UiEvent$OnButtonClick;", "Lau/com/woolworths/feature/shop/brandedshop/UiEvent;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnButtonClick implements UiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final ButtonData f6667a;

        public OnButtonClick(ButtonData buttonData) {
            this.f6667a = buttonData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnButtonClick) && Intrinsics.c(this.f6667a, ((OnButtonClick) obj).f6667a);
        }

        public final int hashCode() {
            return this.f6667a.hashCode();
        }

        public final String toString() {
            return "OnButtonClick(buttonData=" + this.f6667a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/UiEvent$OnErrorRetryClick;", "Lau/com/woolworths/feature/shop/brandedshop/UiEvent;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnErrorRetryClick implements UiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final String f6668a;

        public OnErrorRetryClick(String str) {
            this.f6668a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnErrorRetryClick) && Intrinsics.c(this.f6668a, ((OnErrorRetryClick) obj).f6668a);
        }

        public final int hashCode() {
            String str = this.f6668a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return a.h("OnErrorRetryClick(contentId=", this.f6668a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/UiEvent$OnFullWidthContentCardClick;", "Lau/com/woolworths/feature/shop/brandedshop/UiEvent;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnFullWidthContentCardClick implements UiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final FullWidthContentCardData f6669a;

        public OnFullWidthContentCardClick(FullWidthContentCardData cardData) {
            Intrinsics.h(cardData, "cardData");
            this.f6669a = cardData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnFullWidthContentCardClick) && Intrinsics.c(this.f6669a, ((OnFullWidthContentCardClick) obj).f6669a);
        }

        public final int hashCode() {
            return this.f6669a.hashCode();
        }

        public final String toString() {
            return "OnFullWidthContentCardClick(cardData=" + this.f6669a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/UiEvent$OnHorizontalListActionClick;", "Lau/com/woolworths/feature/shop/brandedshop/UiEvent;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHorizontalListActionClick implements UiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final HorizontalListData f6670a;

        public OnHorizontalListActionClick(HorizontalListData horizontalListData) {
            Intrinsics.h(horizontalListData, "horizontalListData");
            this.f6670a = horizontalListData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHorizontalListActionClick) && Intrinsics.c(this.f6670a, ((OnHorizontalListActionClick) obj).f6670a);
        }

        public final int hashCode() {
            return this.f6670a.hashCode();
        }

        public final String toString() {
            return "OnHorizontalListActionClick(horizontalListData=" + this.f6670a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/UiEvent$OnLinkClick;", "Lau/com/woolworths/feature/shop/brandedshop/UiEvent;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnLinkClick implements UiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final LinkData f6671a;

        public OnLinkClick(LinkData linkData) {
            Intrinsics.h(linkData, "linkData");
            this.f6671a = linkData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnLinkClick) && Intrinsics.c(this.f6671a, ((OnLinkClick) obj).f6671a);
        }

        public final int hashCode() {
            return this.f6671a.hashCode();
        }

        public final String toString() {
            return "OnLinkClick(linkData=" + this.f6671a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/UiEvent$OnListItemClick;", "Lau/com/woolworths/feature/shop/brandedshop/UiEvent;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnListItemClick implements UiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final HorizontalListItem f6672a;

        public OnListItemClick(HorizontalListItem listItem) {
            Intrinsics.h(listItem, "listItem");
            this.f6672a = listItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnListItemClick) && Intrinsics.c(this.f6672a, ((OnListItemClick) obj).f6672a);
        }

        public final int hashCode() {
            return this.f6672a.hashCode();
        }

        public final String toString() {
            return "OnListItemClick(listItem=" + this.f6672a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/UiEvent$OnShoppingListViewClick;", "Lau/com/woolworths/feature/shop/brandedshop/UiEvent;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnShoppingListViewClick implements UiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final String f6673a;

        public OnShoppingListViewClick(String id) {
            Intrinsics.h(id, "id");
            this.f6673a = id;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnShoppingListViewClick) && Intrinsics.c(this.f6673a, ((OnShoppingListViewClick) obj).f6673a);
        }

        public final int hashCode() {
            return this.f6673a.hashCode();
        }

        public final String toString() {
            return a.h("OnShoppingListViewClick(id=", this.f6673a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/UiEvent$OnSnackbarStateChanged;", "Lau/com/woolworths/feature/shop/brandedshop/UiEvent;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnSnackbarStateChanged implements UiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final SnackbarContent f6674a;

        public OnSnackbarStateChanged(SnackbarContent snackbarContent) {
            this.f6674a = snackbarContent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnSnackbarStateChanged) && Intrinsics.c(this.f6674a, ((OnSnackbarStateChanged) obj).f6674a);
        }

        public final int hashCode() {
            SnackbarContent snackbarContent = this.f6674a;
            if (snackbarContent == null) {
                return 0;
            }
            return snackbarContent.hashCode();
        }

        public final String toString() {
            return "OnSnackbarStateChanged(snackbarContent=" + this.f6674a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/UiEvent$OnTabClick;", "Lau/com/woolworths/feature/shop/brandedshop/UiEvent;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnTabClick implements UiEvent {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f6675a;
        public final String b;
        public final String c;

        public OnTabClick(String tabSectionId, String tabLabel, LinkedHashMap linkedHashMap) {
            Intrinsics.h(tabSectionId, "tabSectionId");
            Intrinsics.h(tabLabel, "tabLabel");
            this.f6675a = linkedHashMap;
            this.b = tabSectionId;
            this.c = tabLabel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnTabClick)) {
                return false;
            }
            OnTabClick onTabClick = (OnTabClick) obj;
            return this.f6675a.equals(onTabClick.f6675a) && Intrinsics.c(this.b, onTabClick.b) && Intrinsics.c(this.c, onTabClick.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f6675a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnTabClick(selectedTabs=");
            sb.append(this.f6675a);
            sb.append(", tabSectionId=");
            sb.append(this.b);
            sb.append(", tabLabel=");
            return a.o(sb, this.c, ")");
        }
    }
}
