package au.com.woolworths.feature.shop.editorder.review;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.editorder.review.adapter.ChangeMyOrderSummaryQuery_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.CoreBroadcastBannerStyle;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0012\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$Data;", "Data", "ChangeMyOrderSummary", "Banner", "BroadcastBannerUI", "Icon", "OnHostedIcon", "OrderDetailsSection", "Item", "OnFulfilmentMethod", "OnChangeMyOrderDeliveryInstructions", "OnFulfilmentTimeSlot", "FulfilmentTimeSlotTitle", "OnCartActions", "ActionTile", "FooterCTASection", "CancelButton", "CheckoutButton", "Companion", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChangeMyOrderSummaryQuery implements Query<Data> {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$ActionTile;", "", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ActionTile {

        /* renamed from: a, reason: collision with root package name */
        public final String f7060a;
        public final String b;
        public final String c;

        public ActionTile(String str, String str2, String str3) {
            this.f7060a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionTile)) {
                return false;
            }
            ActionTile actionTile = (ActionTile) obj;
            return Intrinsics.c(this.f7060a, actionTile.f7060a) && Intrinsics.c(this.b, actionTile.b) && Intrinsics.c(this.c, actionTile.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f7060a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("ActionTile(id=", this.f7060a, ", title=", this.b, ", iconUrl="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$Banner;", "", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Banner {

        /* renamed from: a, reason: collision with root package name */
        public final BroadcastBannerUI f7061a;

        public Banner(BroadcastBannerUI broadcastBannerUI) {
            this.f7061a = broadcastBannerUI;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Banner) && Intrinsics.c(this.f7061a, ((Banner) obj).f7061a);
        }

        public final int hashCode() {
            return this.f7061a.hashCode();
        }

        public final String toString() {
            return "Banner(broadcastBannerUI=" + this.f7061a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$BroadcastBannerUI;", "", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BroadcastBannerUI {

        /* renamed from: a, reason: collision with root package name */
        public final String f7062a;
        public final String b;
        public final CoreBroadcastBannerStyle c;
        public final Icon d;

        public BroadcastBannerUI(String str, String str2, CoreBroadcastBannerStyle coreBroadcastBannerStyle, Icon icon) {
            this.f7062a = str;
            this.b = str2;
            this.c = coreBroadcastBannerStyle;
            this.d = icon;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BroadcastBannerUI)) {
                return false;
            }
            BroadcastBannerUI broadcastBannerUI = (BroadcastBannerUI) obj;
            return Intrinsics.c(this.f7062a, broadcastBannerUI.f7062a) && Intrinsics.c(this.b, broadcastBannerUI.b) && this.c == broadcastBannerUI.c && Intrinsics.c(this.d, broadcastBannerUI.d);
        }

        public final int hashCode() {
            int iHashCode = this.f7062a.hashCode() * 31;
            String str = this.b;
            return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("BroadcastBannerUI(title=", this.f7062a, ", subtitle=", this.b, ", style=");
            sbV.append(this.c);
            sbV.append(", icon=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$CancelButton;", "", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CancelButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f7063a;
        public final String b;
        public final ButtonStyle c;
        public final boolean d;

        public CancelButton(String str, String str2, ButtonStyle buttonStyle, boolean z) {
            this.f7063a = str;
            this.b = str2;
            this.c = buttonStyle;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CancelButton)) {
                return false;
            }
            CancelButton cancelButton = (CancelButton) obj;
            return Intrinsics.c(this.f7063a, cancelButton.f7063a) && Intrinsics.c(this.b, cancelButton.b) && this.c == cancelButton.c && this.d == cancelButton.d;
        }

        public final int hashCode() {
            String str = this.f7063a;
            int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            ButtonStyle buttonStyle = this.c;
            return Boolean.hashCode(this.d) + ((iC + (buttonStyle != null ? buttonStyle.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.n(a.v("CancelButton(buttonId=", this.f7063a, ", label=", this.b, ", style="), this.c, ", enabled=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$ChangeMyOrderSummary;", "", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ChangeMyOrderSummary {

        /* renamed from: a, reason: collision with root package name */
        public final Banner f7064a;
        public final OrderDetailsSection b;
        public final FooterCTASection c;

        public ChangeMyOrderSummary(Banner banner, OrderDetailsSection orderDetailsSection, FooterCTASection footerCTASection) {
            this.f7064a = banner;
            this.b = orderDetailsSection;
            this.c = footerCTASection;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChangeMyOrderSummary)) {
                return false;
            }
            ChangeMyOrderSummary changeMyOrderSummary = (ChangeMyOrderSummary) obj;
            return Intrinsics.c(this.f7064a, changeMyOrderSummary.f7064a) && Intrinsics.c(this.b, changeMyOrderSummary.b) && Intrinsics.c(this.c, changeMyOrderSummary.c);
        }

        public final int hashCode() {
            Banner banner = this.f7064a;
            return this.c.hashCode() + ((this.b.hashCode() + ((banner == null ? 0 : banner.f7061a.hashCode()) * 31)) * 31);
        }

        public final String toString() {
            return "ChangeMyOrderSummary(banner=" + this.f7064a + ", orderDetailsSection=" + this.b + ", footerCTASection=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$CheckoutButton;", "", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CheckoutButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f7065a;
        public final String b;
        public final ButtonStyle c;
        public final boolean d;

        public CheckoutButton(String str, String str2, ButtonStyle buttonStyle, boolean z) {
            this.f7065a = str;
            this.b = str2;
            this.c = buttonStyle;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CheckoutButton)) {
                return false;
            }
            CheckoutButton checkoutButton = (CheckoutButton) obj;
            return Intrinsics.c(this.f7065a, checkoutButton.f7065a) && Intrinsics.c(this.b, checkoutButton.b) && this.c == checkoutButton.c && this.d == checkoutButton.d;
        }

        public final int hashCode() {
            String str = this.f7065a;
            int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            ButtonStyle buttonStyle = this.c;
            return Boolean.hashCode(this.d) + ((iC + (buttonStyle != null ? buttonStyle.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.n(a.v("CheckoutButton(buttonId=", this.f7065a, ", label=", this.b, ", style="), this.c, ", enabled=", this.d, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final ChangeMyOrderSummary f7066a;

        public Data(ChangeMyOrderSummary changeMyOrderSummary) {
            this.f7066a = changeMyOrderSummary;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f7066a, ((Data) obj).f7066a);
        }

        public final int hashCode() {
            return this.f7066a.hashCode();
        }

        public final String toString() {
            return "Data(changeMyOrderSummary=" + this.f7066a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$FooterCTASection;", "", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FooterCTASection {

        /* renamed from: a, reason: collision with root package name */
        public final CancelButton f7067a;
        public final CheckoutButton b;

        public FooterCTASection(CancelButton cancelButton, CheckoutButton checkoutButton) {
            this.f7067a = cancelButton;
            this.b = checkoutButton;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FooterCTASection)) {
                return false;
            }
            FooterCTASection footerCTASection = (FooterCTASection) obj;
            return Intrinsics.c(this.f7067a, footerCTASection.f7067a) && Intrinsics.c(this.b, footerCTASection.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f7067a.hashCode() * 31);
        }

        public final String toString() {
            return "FooterCTASection(cancelButton=" + this.f7067a + ", checkoutButton=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$FulfilmentTimeSlotTitle;", "", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FulfilmentTimeSlotTitle {

        /* renamed from: a, reason: collision with root package name */
        public final String f7068a;
        public final String b;

        public FulfilmentTimeSlotTitle(String str, String str2) {
            this.f7068a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FulfilmentTimeSlotTitle)) {
                return false;
            }
            FulfilmentTimeSlotTitle fulfilmentTimeSlotTitle = (FulfilmentTimeSlotTitle) obj;
            return Intrinsics.c(this.f7068a, fulfilmentTimeSlotTitle.f7068a) && Intrinsics.c(this.b, fulfilmentTimeSlotTitle.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f7068a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("FulfilmentTimeSlotTitle(text=", this.f7068a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$Icon;", "", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Icon {

        /* renamed from: a, reason: collision with root package name */
        public final String f7069a;
        public final OnHostedIcon b;

        public Icon(String __typename, OnHostedIcon onHostedIcon) {
            Intrinsics.h(__typename, "__typename");
            this.f7069a = __typename;
            this.b = onHostedIcon;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Icon)) {
                return false;
            }
            Icon icon = (Icon) obj;
            return Intrinsics.c(this.f7069a, icon.f7069a) && Intrinsics.c(this.b, icon.b);
        }

        public final int hashCode() {
            int iHashCode = this.f7069a.hashCode() * 31;
            OnHostedIcon onHostedIcon = this.b;
            return iHashCode + (onHostedIcon == null ? 0 : onHostedIcon.f7075a.hashCode());
        }

        public final String toString() {
            return "Icon(__typename=" + this.f7069a + ", onHostedIcon=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$Item;", "", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f7070a;
        public final OnFulfilmentMethod b;
        public final OnChangeMyOrderDeliveryInstructions c;
        public final OnFulfilmentTimeSlot d;
        public final OnCartActions e;

        public Item(String __typename, OnFulfilmentMethod onFulfilmentMethod, OnChangeMyOrderDeliveryInstructions onChangeMyOrderDeliveryInstructions, OnFulfilmentTimeSlot onFulfilmentTimeSlot, OnCartActions onCartActions) {
            Intrinsics.h(__typename, "__typename");
            this.f7070a = __typename;
            this.b = onFulfilmentMethod;
            this.c = onChangeMyOrderDeliveryInstructions;
            this.d = onFulfilmentTimeSlot;
            this.e = onCartActions;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f7070a, item.f7070a) && Intrinsics.c(this.b, item.b) && Intrinsics.c(this.c, item.c) && Intrinsics.c(this.d, item.d) && Intrinsics.c(this.e, item.e);
        }

        public final int hashCode() {
            int iHashCode = this.f7070a.hashCode() * 31;
            OnFulfilmentMethod onFulfilmentMethod = this.b;
            int iHashCode2 = (iHashCode + (onFulfilmentMethod == null ? 0 : onFulfilmentMethod.hashCode())) * 31;
            OnChangeMyOrderDeliveryInstructions onChangeMyOrderDeliveryInstructions = this.c;
            int iHashCode3 = (iHashCode2 + (onChangeMyOrderDeliveryInstructions == null ? 0 : onChangeMyOrderDeliveryInstructions.hashCode())) * 31;
            OnFulfilmentTimeSlot onFulfilmentTimeSlot = this.d;
            int iHashCode4 = (iHashCode3 + (onFulfilmentTimeSlot == null ? 0 : onFulfilmentTimeSlot.hashCode())) * 31;
            OnCartActions onCartActions = this.e;
            return iHashCode4 + (onCartActions != null ? onCartActions.hashCode() : 0);
        }

        public final String toString() {
            return "Item(__typename=" + this.f7070a + ", onFulfilmentMethod=" + this.b + ", onChangeMyOrderDeliveryInstructions=" + this.c + ", onFulfilmentTimeSlot=" + this.d + ", onCartActions=" + this.e + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$OnCartActions;", "", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCartActions {

        /* renamed from: a, reason: collision with root package name */
        public final String f7071a;
        public final String b;
        public final int c;
        public final ArrayList d;

        public OnCartActions(String str, String str2, int i, ArrayList arrayList) {
            this.f7071a = str;
            this.b = str2;
            this.c = i;
            this.d = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCartActions)) {
                return false;
            }
            OnCartActions onCartActions = (OnCartActions) obj;
            return this.f7071a.equals(onCartActions.f7071a) && Intrinsics.c(this.b, onCartActions.b) && this.c == onCartActions.c && this.d.equals(onCartActions.d);
        }

        public final int hashCode() {
            int iHashCode = this.f7071a.hashCode() * 31;
            String str = this.b;
            return this.d.hashCode() + b.a(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnCartActions(title=", this.f7071a, ", subtitle=", this.b, ", numberOfItems=");
            sbV.append(this.c);
            sbV.append(", actionTiles=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$OnChangeMyOrderDeliveryInstructions;", "", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnChangeMyOrderDeliveryInstructions {

        /* renamed from: a, reason: collision with root package name */
        public final String f7072a;
        public final String b;
        public final String c;

        public OnChangeMyOrderDeliveryInstructions(String str, String str2, String str3) {
            this.f7072a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnChangeMyOrderDeliveryInstructions)) {
                return false;
            }
            OnChangeMyOrderDeliveryInstructions onChangeMyOrderDeliveryInstructions = (OnChangeMyOrderDeliveryInstructions) obj;
            return Intrinsics.c(this.f7072a, onChangeMyOrderDeliveryInstructions.f7072a) && Intrinsics.c(this.b, onChangeMyOrderDeliveryInstructions.b) && Intrinsics.c(this.c, onChangeMyOrderDeliveryInstructions.c);
        }

        public final int hashCode() {
            int iHashCode = this.f7072a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return a.o(a.v("OnChangeMyOrderDeliveryInstructions(title=", this.f7072a, ", subtitle=", this.b, ", iconUrl="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$OnFulfilmentMethod;", "", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnFulfilmentMethod {

        /* renamed from: a, reason: collision with root package name */
        public final String f7073a;
        public final String b;
        public final String c;

        public OnFulfilmentMethod(String str, String str2, String str3) {
            this.f7073a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnFulfilmentMethod)) {
                return false;
            }
            OnFulfilmentMethod onFulfilmentMethod = (OnFulfilmentMethod) obj;
            return Intrinsics.c(this.f7073a, onFulfilmentMethod.f7073a) && Intrinsics.c(this.b, onFulfilmentMethod.b) && Intrinsics.c(this.c, onFulfilmentMethod.c);
        }

        public final int hashCode() {
            int iHashCode = this.f7073a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return a.o(a.v("OnFulfilmentMethod(title=", this.f7073a, ", subtitle=", this.b, ", iconUrl="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$OnFulfilmentTimeSlot;", "", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnFulfilmentTimeSlot {

        /* renamed from: a, reason: collision with root package name */
        public final FulfilmentTimeSlotTitle f7074a;
        public final String b;
        public final String c;

        public OnFulfilmentTimeSlot(FulfilmentTimeSlotTitle fulfilmentTimeSlotTitle, String str, String str2) {
            this.f7074a = fulfilmentTimeSlotTitle;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnFulfilmentTimeSlot)) {
                return false;
            }
            OnFulfilmentTimeSlot onFulfilmentTimeSlot = (OnFulfilmentTimeSlot) obj;
            return Intrinsics.c(this.f7074a, onFulfilmentTimeSlot.f7074a) && Intrinsics.c(this.b, onFulfilmentTimeSlot.b) && Intrinsics.c(this.c, onFulfilmentTimeSlot.c);
        }

        public final int hashCode() {
            int iHashCode = this.f7074a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnFulfilmentTimeSlot(fulfilmentTimeSlotTitle=");
            sb.append(this.f7074a);
            sb.append(", subtitle=");
            sb.append(this.b);
            sb.append(", iconUrl=");
            return a.o(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$OnHostedIcon;", "", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHostedIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f7075a;

        public OnHostedIcon(String str) {
            this.f7075a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHostedIcon) && Intrinsics.c(this.f7075a, ((OnHostedIcon) obj).f7075a);
        }

        public final int hashCode() {
            return this.f7075a.hashCode();
        }

        public final String toString() {
            return a.h("OnHostedIcon(url=", this.f7075a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/ChangeMyOrderSummaryQuery$OrderDetailsSection;", "", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OrderDetailsSection {

        /* renamed from: a, reason: collision with root package name */
        public final String f7076a;
        public final String b;
        public final ArrayList c;

        public OrderDetailsSection(String str, String str2, ArrayList arrayList) {
            this.f7076a = str;
            this.b = str2;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderDetailsSection)) {
                return false;
            }
            OrderDetailsSection orderDetailsSection = (OrderDetailsSection) obj;
            return this.f7076a.equals(orderDetailsSection.f7076a) && Intrinsics.c(this.b, orderDetailsSection.b) && this.c.equals(orderDetailsSection.c);
        }

        public final int hashCode() {
            int iHashCode = this.f7076a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return android.support.v4.media.session.a.q(")", a.v("OrderDetailsSection(title=", this.f7076a, ", subtitle=", this.b, ", items="), this.c);
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(ChangeMyOrderSummaryQuery_ResponseAdapter.Data.f7107a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query changeMyOrderSummary { changeMyOrderSummary { banner { broadcastBannerUI { title subtitle style icon { __typename ... on HostedIcon { url } } } } orderDetailsSection { title subtitle items { __typename ... on FulfilmentMethod { title subtitle iconUrl } ... on ChangeMyOrderDeliveryInstructions { title subtitle iconUrl } ... on FulfilmentTimeSlot { fulfilmentTimeSlotTitle { text altText } subtitle iconUrl } ... on CartActions { title subtitle numberOfItems actionTiles { id title iconUrl } } } } footerCTASection { cancelButton { buttonId label style enabled } checkoutButton { buttonId label style enabled } } } }";
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == ChangeMyOrderSummaryQuery.class;
    }

    public final int hashCode() {
        return Reflection.f24268a.b(ChangeMyOrderSummaryQuery.class).hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "6e080e787552de18c2ed92525f61a6f37f1da99fbf8a6766f1959a6cb2991419";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "changeMyOrderSummary";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
    }
}
