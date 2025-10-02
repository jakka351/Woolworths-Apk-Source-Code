package au.com.woolworths.modules.collectionmode;

import YU.a;
import androidx.camera.core.impl.b;
import au.com.woolworths.modules.collectionmode.adapter.SelectShoppingModeMutation_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.BadgeType;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.DeliveryWindowStatus;
import au.com.woolworths.shop.graphql.type.ShoppingModeId;
import au.com.woolworths.shop.graphql.type.ShoppingModeType;
import au.com.woolworths.shop.graphql.type.ShoppingModeVariantState;
import au.com.woolworths.shop.graphql.type.adapter.ShoppingModeId_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0013\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$Data;", "Data", "SelectShoppingMode", "ShoppingModes", "Mode", "OnShoppingMode", "Variant", "OnShoppingModeVariant", "Price", "OnPrice", "OnPriceRange", "Condition", "StatusBadge", "Fulfilment", "OnDividerCard", "OnShoppingModeVariantFulfilmentWindowState", "FulfilmentWindowStateSubtitle", "FulfilmentWindowStateButton", "OnButton", "Companion", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SelectShoppingModeMutation implements Mutation<Data> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$Condition;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Condition {

        /* renamed from: a, reason: collision with root package name */
        public final String f9083a;

        public Condition(String str) {
            this.f9083a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Condition) && Intrinsics.c(this.f9083a, ((Condition) obj).f9083a);
        }

        public final int hashCode() {
            return this.f9083a.hashCode();
        }

        public final String toString() {
            return a.h("Condition(text=", this.f9083a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final SelectShoppingMode f9084a;

        public Data(SelectShoppingMode selectShoppingMode) {
            this.f9084a = selectShoppingMode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f9084a, ((Data) obj).f9084a);
        }

        public final int hashCode() {
            return this.f9084a.hashCode();
        }

        public final String toString() {
            return "Data(selectShoppingMode=" + this.f9084a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$Fulfilment;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Fulfilment {

        /* renamed from: a, reason: collision with root package name */
        public final String f9085a;
        public final OnDividerCard b;
        public final OnShoppingModeVariantFulfilmentWindowState c;
        public final OnButton d;

        public Fulfilment(String __typename, OnDividerCard onDividerCard, OnShoppingModeVariantFulfilmentWindowState onShoppingModeVariantFulfilmentWindowState, OnButton onButton) {
            Intrinsics.h(__typename, "__typename");
            this.f9085a = __typename;
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
            return Intrinsics.c(this.f9085a, fulfilment.f9085a) && Intrinsics.c(this.b, fulfilment.b) && Intrinsics.c(this.c, fulfilment.c) && Intrinsics.c(this.d, fulfilment.d);
        }

        public final int hashCode() {
            int iHashCode = this.f9085a.hashCode() * 31;
            OnDividerCard onDividerCard = this.b;
            int iHashCode2 = (iHashCode + (onDividerCard == null ? 0 : onDividerCard.hashCode())) * 31;
            OnShoppingModeVariantFulfilmentWindowState onShoppingModeVariantFulfilmentWindowState = this.c;
            int iHashCode3 = (iHashCode2 + (onShoppingModeVariantFulfilmentWindowState == null ? 0 : onShoppingModeVariantFulfilmentWindowState.hashCode())) * 31;
            OnButton onButton = this.d;
            return iHashCode3 + (onButton != null ? onButton.hashCode() : 0);
        }

        public final String toString() {
            return "Fulfilment(__typename=" + this.f9085a + ", onDividerCard=" + this.b + ", onShoppingModeVariantFulfilmentWindowState=" + this.c + ", onButton=" + this.d + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$FulfilmentWindowStateButton;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FulfilmentWindowStateButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f9086a;
        public final ButtonStyle b;
        public final boolean c;
        public final String d;
        public final String e;

        public FulfilmentWindowStateButton(String str, ButtonStyle buttonStyle, boolean z, String str2, String str3) {
            this.f9086a = str;
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
            return Intrinsics.c(this.f9086a, fulfilmentWindowStateButton.f9086a) && this.b == fulfilmentWindowStateButton.b && this.c == fulfilmentWindowStateButton.c && Intrinsics.c(this.d, fulfilmentWindowStateButton.d) && Intrinsics.c(this.e, fulfilmentWindowStateButton.e);
        }

        public final int hashCode() {
            int iHashCode = this.f9086a.hashCode() * 31;
            ButtonStyle buttonStyle = this.b;
            int iE = b.e((iHashCode + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31, 31, this.c);
            String str = this.d;
            int iHashCode2 = (iE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbQ = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.q("FulfilmentWindowStateButton(label=", this.f9086a, ", style=", this.b, ", enabled=");
            au.com.woolworths.android.onesite.a.y(", action=", this.d, ", url=", sbQ, this.c);
            return a.o(sbQ, this.e, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$FulfilmentWindowStateSubtitle;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FulfilmentWindowStateSubtitle {

        /* renamed from: a, reason: collision with root package name */
        public final String f9087a;
        public final String b;

        public FulfilmentWindowStateSubtitle(String str, String str2) {
            this.f9087a = str;
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
            return Intrinsics.c(this.f9087a, fulfilmentWindowStateSubtitle.f9087a) && Intrinsics.c(this.b, fulfilmentWindowStateSubtitle.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f9087a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("FulfilmentWindowStateSubtitle(text=", this.f9087a, ", altText=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$Mode;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Mode {

        /* renamed from: a, reason: collision with root package name */
        public final String f9088a;
        public final OnShoppingMode b;

        public Mode(String __typename, OnShoppingMode onShoppingMode) {
            Intrinsics.h(__typename, "__typename");
            this.f9088a = __typename;
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
            return Intrinsics.c(this.f9088a, mode.f9088a) && Intrinsics.c(this.b, mode.b);
        }

        public final int hashCode() {
            int iHashCode = this.f9088a.hashCode() * 31;
            OnShoppingMode onShoppingMode = this.b;
            return iHashCode + (onShoppingMode == null ? 0 : onShoppingMode.hashCode());
        }

        public final String toString() {
            return "Mode(__typename=" + this.f9088a + ", onShoppingMode=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$OnButton;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f9089a;
        public final ButtonStyle b;
        public final boolean c;
        public final String d;
        public final String e;

        public OnButton(String str, ButtonStyle buttonStyle, boolean z, String str2, String str3) {
            this.f9089a = str;
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
            return Intrinsics.c(this.f9089a, onButton.f9089a) && this.b == onButton.b && this.c == onButton.c && Intrinsics.c(this.d, onButton.d) && Intrinsics.c(this.e, onButton.e);
        }

        public final int hashCode() {
            int iHashCode = this.f9089a.hashCode() * 31;
            ButtonStyle buttonStyle = this.b;
            int iE = b.e((iHashCode + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31, 31, this.c);
            String str = this.d;
            int iHashCode2 = (iE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbQ = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.q("OnButton(label=", this.f9089a, ", style=", this.b, ", enabled=");
            au.com.woolworths.android.onesite.a.y(", action=", this.d, ", url=", sbQ, this.c);
            return a.o(sbQ, this.e, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$OnDividerCard;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnDividerCard {

        /* renamed from: a, reason: collision with root package name */
        public final Boolean f9090a;

        public OnDividerCard(Boolean bool) {
            this.f9090a = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnDividerCard) && Intrinsics.c(this.f9090a, ((OnDividerCard) obj).f9090a);
        }

        public final int hashCode() {
            Boolean bool = this.f9090a;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final String toString() {
            return androidx.compose.ui.input.pointer.a.k(this.f9090a, "OnDividerCard(_excluded=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$OnPrice;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPrice {

        /* renamed from: a, reason: collision with root package name */
        public final String f9091a;
        public final int b;
        public final String c;

        public OnPrice(String str, int i, String str2) {
            this.f9091a = str;
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
            return Intrinsics.c(this.f9091a, onPrice.f9091a) && this.b == onPrice.b && Intrinsics.c(this.c, onPrice.c);
        }

        public final int hashCode() {
            int iA = b.a(this.b, this.f9091a.hashCode() * 31, 31);
            String str = this.c;
            return iA + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.o(b.u("OnPrice(text=", this.b, this.f9091a, ", value=", ", suffix="), this.c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$OnPriceRange;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPriceRange {

        /* renamed from: a, reason: collision with root package name */
        public final String f9092a;
        public final int b;
        public final int c;
        public final String d;

        public OnPriceRange(String str, int i, int i2, String str2) {
            this.f9092a = str;
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
            return Intrinsics.c(this.f9092a, onPriceRange.f9092a) && this.b == onPriceRange.b && this.c == onPriceRange.c && Intrinsics.c(this.d, onPriceRange.d);
        }

        public final int hashCode() {
            int iA = b.a(this.c, b.a(this.b, this.f9092a.hashCode() * 31, 31), 31);
            String str = this.d;
            return iA + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sbU = b.u("OnPriceRange(text=", this.b, this.f9092a, ", min=", ", max=");
            sbU.append(this.c);
            sbU.append(", suffix=");
            sbU.append(this.d);
            sbU.append(")");
            return sbU.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$OnShoppingMode;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnShoppingMode {

        /* renamed from: a, reason: collision with root package name */
        public final ShoppingModeType f9093a;
        public final String b;
        public final ArrayList c;

        public OnShoppingMode(ShoppingModeType shoppingModeType, String str, ArrayList arrayList) {
            this.f9093a = shoppingModeType;
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
            return this.f9093a == onShoppingMode.f9093a && this.b.equals(onShoppingMode.b) && this.c.equals(onShoppingMode.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f9093a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnShoppingMode(type=");
            sb.append(this.f9093a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", variants=");
            return android.support.v4.media.session.a.q(")", sb, this.c);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$OnShoppingModeVariant;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnShoppingModeVariant {

        /* renamed from: a, reason: collision with root package name */
        public final ShoppingModeId f9094a;
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
            this.f9094a = shoppingModeId;
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
            return this.f9094a == onShoppingModeVariant.f9094a && Intrinsics.c(this.b, onShoppingModeVariant.b) && Intrinsics.c(this.c, onShoppingModeVariant.c) && this.d == onShoppingModeVariant.d && this.e == onShoppingModeVariant.e && Intrinsics.c(this.f, onShoppingModeVariant.f) && Intrinsics.c(this.g, onShoppingModeVariant.g) && Intrinsics.c(this.h, onShoppingModeVariant.h) && Intrinsics.c(this.i, onShoppingModeVariant.i) && Intrinsics.c(this.j, onShoppingModeVariant.j) && Intrinsics.c(this.k, onShoppingModeVariant.k);
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + b.c(b.c(this.f9094a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
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
            sb.append(this.f9094a);
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

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$OnShoppingModeVariantFulfilmentWindowState;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnShoppingModeVariantFulfilmentWindowState {

        /* renamed from: a, reason: collision with root package name */
        public final String f9095a;
        public final FulfilmentWindowStateSubtitle b;
        public final FulfilmentWindowStateButton c;

        public OnShoppingModeVariantFulfilmentWindowState(String str, FulfilmentWindowStateSubtitle fulfilmentWindowStateSubtitle, FulfilmentWindowStateButton fulfilmentWindowStateButton) {
            this.f9095a = str;
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
            return Intrinsics.c(this.f9095a, onShoppingModeVariantFulfilmentWindowState.f9095a) && Intrinsics.c(this.b, onShoppingModeVariantFulfilmentWindowState.b) && Intrinsics.c(this.c, onShoppingModeVariantFulfilmentWindowState.c);
        }

        public final int hashCode() {
            int iHashCode = this.f9095a.hashCode() * 31;
            FulfilmentWindowStateSubtitle fulfilmentWindowStateSubtitle = this.b;
            return this.c.hashCode() + ((iHashCode + (fulfilmentWindowStateSubtitle == null ? 0 : fulfilmentWindowStateSubtitle.hashCode())) * 31);
        }

        public final String toString() {
            return "OnShoppingModeVariantFulfilmentWindowState(fulfilmentWindowStateTitle=" + this.f9095a + ", fulfilmentWindowStateSubtitle=" + this.b + ", fulfilmentWindowStateButton=" + this.c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$Price;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Price {

        /* renamed from: a, reason: collision with root package name */
        public final String f9096a;
        public final OnPrice b;
        public final OnPriceRange c;

        public Price(String __typename, OnPrice onPrice, OnPriceRange onPriceRange) {
            Intrinsics.h(__typename, "__typename");
            this.f9096a = __typename;
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
            return Intrinsics.c(this.f9096a, price.f9096a) && Intrinsics.c(this.b, price.b) && Intrinsics.c(this.c, price.c);
        }

        public final int hashCode() {
            int iHashCode = this.f9096a.hashCode() * 31;
            OnPrice onPrice = this.b;
            int iHashCode2 = (iHashCode + (onPrice == null ? 0 : onPrice.hashCode())) * 31;
            OnPriceRange onPriceRange = this.c;
            return iHashCode2 + (onPriceRange != null ? onPriceRange.hashCode() : 0);
        }

        public final String toString() {
            return "Price(__typename=" + this.f9096a + ", onPrice=" + this.b + ", onPriceRange=" + this.c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$SelectShoppingMode;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SelectShoppingMode {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f9097a;
        public final ShoppingModes b;

        public SelectShoppingMode(boolean z, ShoppingModes shoppingModes) {
            this.f9097a = z;
            this.b = shoppingModes;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectShoppingMode)) {
                return false;
            }
            SelectShoppingMode selectShoppingMode = (SelectShoppingMode) obj;
            return this.f9097a == selectShoppingMode.f9097a && Intrinsics.c(this.b, selectShoppingMode.b);
        }

        public final int hashCode() {
            return this.b.f9098a.hashCode() + (Boolean.hashCode(this.f9097a) * 31);
        }

        public final String toString() {
            return "SelectShoppingMode(isSuccess=" + this.f9097a + ", shoppingModes=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$ShoppingModes;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShoppingModes {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f9098a;

        public ShoppingModes(ArrayList arrayList) {
            this.f9098a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShoppingModes) && this.f9098a.equals(((ShoppingModes) obj).f9098a);
        }

        public final int hashCode() {
            return this.f9098a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("ShoppingModes(modes=", ")", this.f9098a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$StatusBadge;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StatusBadge {

        /* renamed from: a, reason: collision with root package name */
        public final String f9099a;
        public final BadgeType b;

        public StatusBadge(String str, BadgeType badgeType) {
            this.f9099a = str;
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
            return Intrinsics.c(this.f9099a, statusBadge.f9099a) && this.b == statusBadge.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f9099a.hashCode() * 31);
        }

        public final String toString() {
            return "StatusBadge(label=" + this.f9099a + ", type=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$Variant;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Variant {

        /* renamed from: a, reason: collision with root package name */
        public final String f9100a;
        public final OnShoppingModeVariant b;

        public Variant(String __typename, OnShoppingModeVariant onShoppingModeVariant) {
            Intrinsics.h(__typename, "__typename");
            this.f9100a = __typename;
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
            return Intrinsics.c(this.f9100a, variant.f9100a) && Intrinsics.c(this.b, variant.b);
        }

        public final int hashCode() {
            int iHashCode = this.f9100a.hashCode() * 31;
            OnShoppingModeVariant onShoppingModeVariant = this.b;
            return iHashCode + (onShoppingModeVariant == null ? 0 : onShoppingModeVariant.hashCode());
        }

        public final String toString() {
            return "Variant(__typename=" + this.f9100a + ", onShoppingModeVariant=" + this.b + ")";
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(SelectShoppingModeMutation_ResponseAdapter.Data.f9124a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation SelectShoppingMode($shoppingModeId: ShoppingModeId!, $pickupAddressId: String) { selectShoppingMode(id: $shoppingModeId, pickupAddressId: $pickupAddressId) { isSuccess shoppingModes { modes { __typename ... on ShoppingMode { type title variants { __typename ... on ShoppingModeVariant { id title subtitle state status price { __typename ... on Price { text value suffix } ... on PriceRange { text min max suffix } } conditions { text } statusBadge { label type } footnote expressDeliveryStoreId fulfilment { __typename ... on DividerCard { _excluded: _ } ... on ShoppingModeVariantFulfilmentWindowState { fulfilmentWindowStateTitle fulfilmentWindowStateSubtitle { text altText } fulfilmentWindowStateButton { label style enabled action url } } ... on Button { label style enabled action url } } } } } } } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SelectShoppingModeMutation) && Intrinsics.c(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "a044c951d461819b9c861ab8efa657b87ecfcd269300c0d1dcb15c95afe4674e";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "SelectShoppingMode";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("shoppingModeId");
        ShoppingModeId_ResponseAdapter.b(jsonWriter, customScalarAdapters, null);
    }

    public final String toString() {
        return "SelectShoppingModeMutation(shoppingModeId=" + ((Object) null) + ", pickupAddressId=" + ((Object) null) + ")";
    }
}
