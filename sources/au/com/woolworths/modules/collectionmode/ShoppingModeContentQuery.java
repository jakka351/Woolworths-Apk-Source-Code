package au.com.woolworths.modules.collectionmode;

import YU.a;
import androidx.camera.core.impl.b;
import au.com.woolworths.modules.collectionmode.adapter.ShoppingModeContentQuery_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.BadgeType;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.DeliveryWindowStatus;
import au.com.woolworths.shop.graphql.type.ShoppingModeId;
import au.com.woolworths.shop.graphql.type.ShoppingModeType;
import au.com.woolworths.shop.graphql.type.ShoppingModeVariantState;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0012\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$Data;", "Data", "ShoppingModes", "Mode", "OnShoppingMode", "Variant", "OnShoppingModeVariant", "Price", "OnPrice", "OnPriceRange", "Condition", "StatusBadge", "Fulfilment", "OnDividerCard", "OnShoppingModeVariantFulfilmentWindowState", "FulfilmentWindowStateSubtitle", "FulfilmentWindowStateButton", "OnButton", "Companion", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShoppingModeContentQuery implements Query<Data> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$Condition;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Condition {

        /* renamed from: a, reason: collision with root package name */
        public final String f9101a;

        public Condition(String str) {
            this.f9101a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Condition) && Intrinsics.c(this.f9101a, ((Condition) obj).f9101a);
        }

        public final int hashCode() {
            return this.f9101a.hashCode();
        }

        public final String toString() {
            return a.h("Condition(text=", this.f9101a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final ShoppingModes f9102a;

        public Data(ShoppingModes shoppingModes) {
            this.f9102a = shoppingModes;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f9102a, ((Data) obj).f9102a);
        }

        public final int hashCode() {
            return this.f9102a.f9115a.hashCode();
        }

        public final String toString() {
            return "Data(shoppingModes=" + this.f9102a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$Fulfilment;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Fulfilment {

        /* renamed from: a, reason: collision with root package name */
        public final String f9103a;
        public final OnDividerCard b;
        public final OnShoppingModeVariantFulfilmentWindowState c;
        public final OnButton d;

        public Fulfilment(String __typename, OnDividerCard onDividerCard, OnShoppingModeVariantFulfilmentWindowState onShoppingModeVariantFulfilmentWindowState, OnButton onButton) {
            Intrinsics.h(__typename, "__typename");
            this.f9103a = __typename;
            this.b = onDividerCard;
            this.c = onShoppingModeVariantFulfilmentWindowState;
            this.d = onButton;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Fulfilment)) {
                return false;
            }
            Fulfilment fulfilment = (Fulfilment) obj;
            return Intrinsics.c(this.f9103a, fulfilment.f9103a) && Intrinsics.c(this.b, fulfilment.b) && Intrinsics.c(this.c, fulfilment.c) && Intrinsics.c(this.d, fulfilment.d);
        }

        public final int hashCode() {
            int iHashCode = this.f9103a.hashCode() * 31;
            OnDividerCard onDividerCard = this.b;
            int iHashCode2 = (iHashCode + (onDividerCard == null ? 0 : onDividerCard.hashCode())) * 31;
            OnShoppingModeVariantFulfilmentWindowState onShoppingModeVariantFulfilmentWindowState = this.c;
            int iHashCode3 = (iHashCode2 + (onShoppingModeVariantFulfilmentWindowState == null ? 0 : onShoppingModeVariantFulfilmentWindowState.hashCode())) * 31;
            OnButton onButton = this.d;
            return iHashCode3 + (onButton != null ? onButton.hashCode() : 0);
        }

        public final String toString() {
            return "Fulfilment(__typename=" + this.f9103a + ", onDividerCard=" + this.b + ", onShoppingModeVariantFulfilmentWindowState=" + this.c + ", onButton=" + this.d + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$FulfilmentWindowStateButton;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FulfilmentWindowStateButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f9104a;
        public final ButtonStyle b;
        public final boolean c;
        public final String d;
        public final String e;

        public FulfilmentWindowStateButton(String str, ButtonStyle buttonStyle, boolean z, String str2, String str3) {
            this.f9104a = str;
            this.b = buttonStyle;
            this.c = z;
            this.d = str2;
            this.e = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FulfilmentWindowStateButton)) {
                return false;
            }
            FulfilmentWindowStateButton fulfilmentWindowStateButton = (FulfilmentWindowStateButton) obj;
            return Intrinsics.c(this.f9104a, fulfilmentWindowStateButton.f9104a) && this.b == fulfilmentWindowStateButton.b && this.c == fulfilmentWindowStateButton.c && Intrinsics.c(this.d, fulfilmentWindowStateButton.d) && Intrinsics.c(this.e, fulfilmentWindowStateButton.e);
        }

        public final int hashCode() {
            int iHashCode = this.f9104a.hashCode() * 31;
            ButtonStyle buttonStyle = this.b;
            int iE = b.e((iHashCode + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31, 31, this.c);
            String str = this.d;
            int iHashCode2 = (iE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbQ = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.q("FulfilmentWindowStateButton(label=", this.f9104a, ", style=", this.b, ", enabled=");
            au.com.woolworths.android.onesite.a.y(", action=", this.d, ", url=", sbQ, this.c);
            return a.o(sbQ, this.e, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$FulfilmentWindowStateSubtitle;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FulfilmentWindowStateSubtitle {

        /* renamed from: a, reason: collision with root package name */
        public final String f9105a;
        public final String b;

        public FulfilmentWindowStateSubtitle(String str, String str2) {
            this.f9105a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FulfilmentWindowStateSubtitle)) {
                return false;
            }
            FulfilmentWindowStateSubtitle fulfilmentWindowStateSubtitle = (FulfilmentWindowStateSubtitle) obj;
            return Intrinsics.c(this.f9105a, fulfilmentWindowStateSubtitle.f9105a) && Intrinsics.c(this.b, fulfilmentWindowStateSubtitle.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f9105a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("FulfilmentWindowStateSubtitle(text=", this.f9105a, ", altText=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$Mode;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Mode {

        /* renamed from: a, reason: collision with root package name */
        public final String f9106a;
        public final OnShoppingMode b;

        public Mode(String __typename, OnShoppingMode onShoppingMode) {
            Intrinsics.h(__typename, "__typename");
            this.f9106a = __typename;
            this.b = onShoppingMode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Mode)) {
                return false;
            }
            Mode mode = (Mode) obj;
            return Intrinsics.c(this.f9106a, mode.f9106a) && Intrinsics.c(this.b, mode.b);
        }

        public final int hashCode() {
            int iHashCode = this.f9106a.hashCode() * 31;
            OnShoppingMode onShoppingMode = this.b;
            return iHashCode + (onShoppingMode == null ? 0 : onShoppingMode.hashCode());
        }

        public final String toString() {
            return "Mode(__typename=" + this.f9106a + ", onShoppingMode=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$OnButton;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f9107a;
        public final ButtonStyle b;
        public final boolean c;
        public final String d;
        public final String e;

        public OnButton(String str, ButtonStyle buttonStyle, boolean z, String str2, String str3) {
            this.f9107a = str;
            this.b = buttonStyle;
            this.c = z;
            this.d = str2;
            this.e = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnButton)) {
                return false;
            }
            OnButton onButton = (OnButton) obj;
            return Intrinsics.c(this.f9107a, onButton.f9107a) && this.b == onButton.b && this.c == onButton.c && Intrinsics.c(this.d, onButton.d) && Intrinsics.c(this.e, onButton.e);
        }

        public final int hashCode() {
            int iHashCode = this.f9107a.hashCode() * 31;
            ButtonStyle buttonStyle = this.b;
            int iE = b.e((iHashCode + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31, 31, this.c);
            String str = this.d;
            int iHashCode2 = (iE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbQ = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.q("OnButton(label=", this.f9107a, ", style=", this.b, ", enabled=");
            au.com.woolworths.android.onesite.a.y(", action=", this.d, ", url=", sbQ, this.c);
            return a.o(sbQ, this.e, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$OnDividerCard;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnDividerCard {

        /* renamed from: a, reason: collision with root package name */
        public final Boolean f9108a;

        public OnDividerCard(Boolean bool) {
            this.f9108a = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnDividerCard) && Intrinsics.c(this.f9108a, ((OnDividerCard) obj).f9108a);
        }

        public final int hashCode() {
            Boolean bool = this.f9108a;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final String toString() {
            return androidx.compose.ui.input.pointer.a.k(this.f9108a, "OnDividerCard(_excluded=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$OnPrice;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPrice {

        /* renamed from: a, reason: collision with root package name */
        public final String f9109a;
        public final int b;
        public final String c;

        public OnPrice(String str, int i, String str2) {
            this.f9109a = str;
            this.b = i;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnPrice)) {
                return false;
            }
            OnPrice onPrice = (OnPrice) obj;
            return Intrinsics.c(this.f9109a, onPrice.f9109a) && this.b == onPrice.b && Intrinsics.c(this.c, onPrice.c);
        }

        public final int hashCode() {
            int iA = b.a(this.b, this.f9109a.hashCode() * 31, 31);
            String str = this.c;
            return iA + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.o(b.u("OnPrice(text=", this.b, this.f9109a, ", value=", ", suffix="), this.c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$OnPriceRange;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPriceRange {

        /* renamed from: a, reason: collision with root package name */
        public final String f9110a;
        public final int b;
        public final int c;
        public final String d;

        public OnPriceRange(String str, int i, int i2, String str2) {
            this.f9110a = str;
            this.b = i;
            this.c = i2;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnPriceRange)) {
                return false;
            }
            OnPriceRange onPriceRange = (OnPriceRange) obj;
            return Intrinsics.c(this.f9110a, onPriceRange.f9110a) && this.b == onPriceRange.b && this.c == onPriceRange.c && Intrinsics.c(this.d, onPriceRange.d);
        }

        public final int hashCode() {
            int iA = b.a(this.c, b.a(this.b, this.f9110a.hashCode() * 31, 31), 31);
            String str = this.d;
            return iA + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sbU = b.u("OnPriceRange(text=", this.b, this.f9110a, ", min=", ", max=");
            sbU.append(this.c);
            sbU.append(", suffix=");
            sbU.append(this.d);
            sbU.append(")");
            return sbU.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$OnShoppingMode;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnShoppingMode {

        /* renamed from: a, reason: collision with root package name */
        public final ShoppingModeType f9111a;
        public final String b;
        public final ArrayList c;

        public OnShoppingMode(ShoppingModeType shoppingModeType, String str, ArrayList arrayList) {
            this.f9111a = shoppingModeType;
            this.b = str;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnShoppingMode)) {
                return false;
            }
            OnShoppingMode onShoppingMode = (OnShoppingMode) obj;
            return this.f9111a == onShoppingMode.f9111a && this.b.equals(onShoppingMode.b) && this.c.equals(onShoppingMode.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f9111a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnShoppingMode(type=");
            sb.append(this.f9111a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", variants=");
            return android.support.v4.media.session.a.q(")", sb, this.c);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$OnShoppingModeVariant;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnShoppingModeVariant {

        /* renamed from: a, reason: collision with root package name */
        public final ShoppingModeId f9112a;
        public final String b;
        public final String c;
        public final ShoppingModeVariantState d;
        public final DeliveryWindowStatus e;
        public final Price f;
        public final List g;
        public final StatusBadge h;
        public final String i;
        public final Integer j;
        public final List k;

        public OnShoppingModeVariant(ShoppingModeId shoppingModeId, String str, String str2, ShoppingModeVariantState shoppingModeVariantState, DeliveryWindowStatus deliveryWindowStatus, Price price, List list, StatusBadge statusBadge, String str3, Integer num, List list2) {
            this.f9112a = shoppingModeId;
            this.b = str;
            this.c = str2;
            this.d = shoppingModeVariantState;
            this.e = deliveryWindowStatus;
            this.f = price;
            this.g = list;
            this.h = statusBadge;
            this.i = str3;
            this.j = num;
            this.k = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnShoppingModeVariant)) {
                return false;
            }
            OnShoppingModeVariant onShoppingModeVariant = (OnShoppingModeVariant) obj;
            return this.f9112a == onShoppingModeVariant.f9112a && Intrinsics.c(this.b, onShoppingModeVariant.b) && Intrinsics.c(this.c, onShoppingModeVariant.c) && this.d == onShoppingModeVariant.d && this.e == onShoppingModeVariant.e && Intrinsics.c(this.f, onShoppingModeVariant.f) && Intrinsics.c(this.g, onShoppingModeVariant.g) && Intrinsics.c(this.h, onShoppingModeVariant.h) && Intrinsics.c(this.i, onShoppingModeVariant.i) && Intrinsics.c(this.j, onShoppingModeVariant.j) && Intrinsics.c(this.k, onShoppingModeVariant.k);
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + b.c(b.c(this.f9112a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
            DeliveryWindowStatus deliveryWindowStatus = this.e;
            int iHashCode2 = (iHashCode + (deliveryWindowStatus == null ? 0 : deliveryWindowStatus.hashCode())) * 31;
            Price price = this.f;
            int iHashCode3 = (iHashCode2 + (price == null ? 0 : price.hashCode())) * 31;
            List list = this.g;
            int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            StatusBadge statusBadge = this.h;
            int iHashCode5 = (iHashCode4 + (statusBadge == null ? 0 : statusBadge.hashCode())) * 31;
            String str = this.i;
            int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.j;
            int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
            List list2 = this.k;
            return iHashCode7 + (list2 != null ? list2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnShoppingModeVariant(id=");
            sb.append(this.f9112a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", subtitle=");
            sb.append(this.c);
            sb.append(", state=");
            sb.append(this.d);
            sb.append(", status=");
            sb.append(this.e);
            sb.append(", price=");
            sb.append(this.f);
            sb.append(", conditions=");
            sb.append(this.g);
            sb.append(", statusBadge=");
            sb.append(this.h);
            sb.append(", footnote=");
            sb.append(this.i);
            sb.append(", expressDeliveryStoreId=");
            sb.append(this.j);
            sb.append(", fulfilment=");
            return android.support.v4.media.session.a.t(sb, this.k, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$OnShoppingModeVariantFulfilmentWindowState;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnShoppingModeVariantFulfilmentWindowState {

        /* renamed from: a, reason: collision with root package name */
        public final String f9113a;
        public final FulfilmentWindowStateSubtitle b;
        public final FulfilmentWindowStateButton c;

        public OnShoppingModeVariantFulfilmentWindowState(String str, FulfilmentWindowStateSubtitle fulfilmentWindowStateSubtitle, FulfilmentWindowStateButton fulfilmentWindowStateButton) {
            this.f9113a = str;
            this.b = fulfilmentWindowStateSubtitle;
            this.c = fulfilmentWindowStateButton;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnShoppingModeVariantFulfilmentWindowState)) {
                return false;
            }
            OnShoppingModeVariantFulfilmentWindowState onShoppingModeVariantFulfilmentWindowState = (OnShoppingModeVariantFulfilmentWindowState) obj;
            return Intrinsics.c(this.f9113a, onShoppingModeVariantFulfilmentWindowState.f9113a) && Intrinsics.c(this.b, onShoppingModeVariantFulfilmentWindowState.b) && Intrinsics.c(this.c, onShoppingModeVariantFulfilmentWindowState.c);
        }

        public final int hashCode() {
            int iHashCode = this.f9113a.hashCode() * 31;
            FulfilmentWindowStateSubtitle fulfilmentWindowStateSubtitle = this.b;
            return this.c.hashCode() + ((iHashCode + (fulfilmentWindowStateSubtitle == null ? 0 : fulfilmentWindowStateSubtitle.hashCode())) * 31);
        }

        public final String toString() {
            return "OnShoppingModeVariantFulfilmentWindowState(fulfilmentWindowStateTitle=" + this.f9113a + ", fulfilmentWindowStateSubtitle=" + this.b + ", fulfilmentWindowStateButton=" + this.c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$Price;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Price {

        /* renamed from: a, reason: collision with root package name */
        public final String f9114a;
        public final OnPrice b;
        public final OnPriceRange c;

        public Price(String __typename, OnPrice onPrice, OnPriceRange onPriceRange) {
            Intrinsics.h(__typename, "__typename");
            this.f9114a = __typename;
            this.b = onPrice;
            this.c = onPriceRange;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Price)) {
                return false;
            }
            Price price = (Price) obj;
            return Intrinsics.c(this.f9114a, price.f9114a) && Intrinsics.c(this.b, price.b) && Intrinsics.c(this.c, price.c);
        }

        public final int hashCode() {
            int iHashCode = this.f9114a.hashCode() * 31;
            OnPrice onPrice = this.b;
            int iHashCode2 = (iHashCode + (onPrice == null ? 0 : onPrice.hashCode())) * 31;
            OnPriceRange onPriceRange = this.c;
            return iHashCode2 + (onPriceRange != null ? onPriceRange.hashCode() : 0);
        }

        public final String toString() {
            return "Price(__typename=" + this.f9114a + ", onPrice=" + this.b + ", onPriceRange=" + this.c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$ShoppingModes;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShoppingModes {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f9115a;

        public ShoppingModes(ArrayList arrayList) {
            this.f9115a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShoppingModes) && this.f9115a.equals(((ShoppingModes) obj).f9115a);
        }

        public final int hashCode() {
            return this.f9115a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("ShoppingModes(modes=", ")", this.f9115a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$StatusBadge;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StatusBadge {

        /* renamed from: a, reason: collision with root package name */
        public final String f9116a;
        public final BadgeType b;

        public StatusBadge(String str, BadgeType badgeType) {
            this.f9116a = str;
            this.b = badgeType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StatusBadge)) {
                return false;
            }
            StatusBadge statusBadge = (StatusBadge) obj;
            return Intrinsics.c(this.f9116a, statusBadge.f9116a) && this.b == statusBadge.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f9116a.hashCode() * 31);
        }

        public final String toString() {
            return "StatusBadge(label=" + this.f9116a + ", type=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$Variant;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Variant {

        /* renamed from: a, reason: collision with root package name */
        public final String f9117a;
        public final OnShoppingModeVariant b;

        public Variant(String __typename, OnShoppingModeVariant onShoppingModeVariant) {
            Intrinsics.h(__typename, "__typename");
            this.f9117a = __typename;
            this.b = onShoppingModeVariant;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Variant)) {
                return false;
            }
            Variant variant = (Variant) obj;
            return Intrinsics.c(this.f9117a, variant.f9117a) && Intrinsics.c(this.b, variant.b);
        }

        public final int hashCode() {
            int iHashCode = this.f9117a.hashCode() * 31;
            OnShoppingModeVariant onShoppingModeVariant = this.b;
            return iHashCode + (onShoppingModeVariant == null ? 0 : onShoppingModeVariant.hashCode());
        }

        public final String toString() {
            return "Variant(__typename=" + this.f9117a + ", onShoppingModeVariant=" + this.b + ")";
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(ShoppingModeContentQuery_ResponseAdapter.Data.f9142a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query ShoppingModeContent { shoppingModes { modes { __typename ... on ShoppingMode { type title variants { __typename ... on ShoppingModeVariant { id title subtitle state status price { __typename ... on Price { text value suffix } ... on PriceRange { text min max suffix } } conditions { text } statusBadge { label type } footnote expressDeliveryStoreId fulfilment { __typename ... on DividerCard { _excluded: _ } ... on ShoppingModeVariantFulfilmentWindowState { fulfilmentWindowStateTitle fulfilmentWindowStateSubtitle { text altText } fulfilmentWindowStateButton { label style enabled action url } } ... on Button { label style enabled action url } } } } } } } }";
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == ShoppingModeContentQuery.class;
    }

    public final int hashCode() {
        return Reflection.f24268a.b(ShoppingModeContentQuery.class).hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "b2c68b3946fe529f3adec58a87b1af3101a7ac1cb990a6af1fe84972f46597fa";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "ShoppingModeContent";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
    }
}
