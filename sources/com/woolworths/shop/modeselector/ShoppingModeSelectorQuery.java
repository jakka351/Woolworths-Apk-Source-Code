package com.woolworths.shop.modeselector;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.BadgeType;
import au.com.woolworths.shop.graphql.type.adapter.GeoLocation_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.modeselector.adapter.ShoppingModeSelectorQuery_ResponseAdapter;
import com.woolworths.shop.modeselector.fragment.ButtonFragment;
import com.woolworths.shop.modeselector.fragment.DownloadableAssetFragment;
import com.woolworths.shop.modeselector.fragment.ItemFragment;
import com.woolworths.shop.modeselector.fragment.ModeSelectorV1AddressDetailsDeliveryFragment;
import com.woolworths.shop.modeselector.fragment.ModeSelectorV1AddressDetailsPickupFragment;
import com.woolworths.shop.modeselector.fragment.ShoppingModeDetailsFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u001f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$Data;", "Data", "ShoppingModeSelector", "OnShoppingModeSelector", "Header", "Button", "Image", "Section", "OnShoppingModeSelectorOptionsSection", "Item", "Fulfilment", "OnDividerCard", "OnButton", "Badge", "Condition", "OnShoppingModeSelectorStoreDetailsSection", "StoreDetail", "Image1", "Button1", "OnShoppingModeSelectorStoreFeaturesSection", "Feature", "OnShoppingModeSelectorAddressInfoSection", "Details", "ShoppingModeDetails", "Image2", "Button2", "V1AddressDetails", "OnModeSelectorV1AddressDetailsDelivery", "OnModeSelectorV1AddressDetailsPickup", "SecondaryButton", "OnShoppingModeSelectorErrorResponse", "Companion", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ShoppingModeSelectorQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final Optional.Present f23256a;
    public final boolean b;
    public final Optional.Present c;
    public final boolean d;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$Badge;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Badge {

        /* renamed from: a, reason: collision with root package name */
        public final String f23257a;
        public final BadgeType b;

        public Badge(String str, BadgeType badgeType) {
            this.f23257a = str;
            this.b = badgeType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Badge)) {
                return false;
            }
            Badge badge = (Badge) obj;
            return Intrinsics.c(this.f23257a, badge.f23257a) && this.b == badge.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23257a.hashCode() * 31);
        }

        public final String toString() {
            return "Badge(label=" + this.f23257a + ", type=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$Button;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button {

        /* renamed from: a, reason: collision with root package name */
        public final String f23258a;
        public final boolean b;
        public final String c;

        public Button(String str, String str2, boolean z) {
            this.f23258a = str;
            this.b = z;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.c(this.f23258a, button.f23258a) && this.b == button.b && Intrinsics.c(this.c, button.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.e(this.f23258a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(androidx.constraintlayout.core.state.a.q("Button(id=", this.f23258a, ", isSelected=", ", title=", this.b), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$Button1;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f23259a;
        public final ButtonFragment b;

        public Button1(String str, ButtonFragment buttonFragment) {
            this.f23259a = str;
            this.b = buttonFragment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button1)) {
                return false;
            }
            Button1 button1 = (Button1) obj;
            return Intrinsics.c(this.f23259a, button1.f23259a) && Intrinsics.c(this.b, button1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23259a.hashCode() * 31);
        }

        public final String toString() {
            return "Button1(__typename=" + this.f23259a + ", buttonFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$Button2;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f23260a;
        public final ButtonFragment b;

        public Button2(String str, ButtonFragment buttonFragment) {
            this.f23260a = str;
            this.b = buttonFragment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button2)) {
                return false;
            }
            Button2 button2 = (Button2) obj;
            return Intrinsics.c(this.f23260a, button2.f23260a) && Intrinsics.c(this.b, button2.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23260a.hashCode() * 31);
        }

        public final String toString() {
            return "Button2(__typename=" + this.f23260a + ", buttonFragment=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$Condition;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Condition {

        /* renamed from: a, reason: collision with root package name */
        public final String f23261a;
        public final BadgeType b;

        public Condition(String str, BadgeType badgeType) {
            this.f23261a = str;
            this.b = badgeType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Condition)) {
                return false;
            }
            Condition condition = (Condition) obj;
            return Intrinsics.c(this.f23261a, condition.f23261a) && this.b == condition.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23261a.hashCode() * 31);
        }

        public final String toString() {
            return "Condition(label=" + this.f23261a + ", type=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final ShoppingModeSelector f23262a;

        public Data(ShoppingModeSelector shoppingModeSelector) {
            this.f23262a = shoppingModeSelector;
        }

        /* renamed from: a, reason: from getter */
        public final ShoppingModeSelector getF23262a() {
            return this.f23262a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f23262a, ((Data) obj).f23262a);
        }

        public final int hashCode() {
            return this.f23262a.hashCode();
        }

        public final String toString() {
            return "Data(shoppingModeSelector=" + this.f23262a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$Details;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Details {

        /* renamed from: a, reason: collision with root package name */
        public final ShoppingModeDetails f23263a;
        public final Image2 b;
        public final String c;
        public final String d;
        public final Button2 e;
        public final V1AddressDetails f;
        public final SecondaryButton g;

        public Details(ShoppingModeDetails shoppingModeDetails, Image2 image2, String str, String str2, Button2 button2, V1AddressDetails v1AddressDetails, SecondaryButton secondaryButton) {
            this.f23263a = shoppingModeDetails;
            this.b = image2;
            this.c = str;
            this.d = str2;
            this.e = button2;
            this.f = v1AddressDetails;
            this.g = secondaryButton;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Details)) {
                return false;
            }
            Details details = (Details) obj;
            return Intrinsics.c(this.f23263a, details.f23263a) && Intrinsics.c(this.b, details.b) && Intrinsics.c(this.c, details.c) && Intrinsics.c(this.d, details.d) && Intrinsics.c(this.e, details.e) && Intrinsics.c(this.f, details.f) && Intrinsics.c(this.g, details.g);
        }

        public final int hashCode() {
            int iHashCode = this.f23263a.hashCode() * 31;
            Image2 image2 = this.b;
            int iHashCode2 = (iHashCode + (image2 == null ? 0 : image2.hashCode())) * 31;
            String str = this.c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode4 = (this.e.hashCode() + ((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            V1AddressDetails v1AddressDetails = this.f;
            int iHashCode5 = (iHashCode4 + (v1AddressDetails == null ? 0 : v1AddressDetails.hashCode())) * 31;
            SecondaryButton secondaryButton = this.g;
            return iHashCode5 + (secondaryButton != null ? secondaryButton.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Details(shoppingModeDetails=");
            sb.append(this.f23263a);
            sb.append(", image=");
            sb.append(this.b);
            sb.append(", title=");
            androidx.constraintlayout.core.state.a.B(sb, this.c, ", subtitle=", this.d, ", button=");
            sb.append(this.e);
            sb.append(", v1AddressDetails=");
            sb.append(this.f);
            sb.append(", secondaryButton=");
            sb.append(this.g);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$Feature;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Feature {

        /* renamed from: a, reason: collision with root package name */
        public final String f23264a;
        public final String b;

        public Feature(String str, String str2) {
            this.f23264a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Feature)) {
                return false;
            }
            Feature feature = (Feature) obj;
            return Intrinsics.c(this.f23264a, feature.f23264a) && Intrinsics.c(this.b, feature.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23264a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Feature(title=", this.f23264a, ", imageUrl=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$Fulfilment;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Fulfilment {

        /* renamed from: a, reason: collision with root package name */
        public final String f23265a;
        public final OnDividerCard b;
        public final OnButton c;

        public Fulfilment(String __typename, OnDividerCard onDividerCard, OnButton onButton) {
            Intrinsics.h(__typename, "__typename");
            this.f23265a = __typename;
            this.b = onDividerCard;
            this.c = onButton;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Fulfilment)) {
                return false;
            }
            Fulfilment fulfilment = (Fulfilment) obj;
            return Intrinsics.c(this.f23265a, fulfilment.f23265a) && Intrinsics.c(this.b, fulfilment.b) && Intrinsics.c(this.c, fulfilment.c);
        }

        public final int hashCode() {
            int iHashCode = this.f23265a.hashCode() * 31;
            OnDividerCard onDividerCard = this.b;
            int iHashCode2 = (iHashCode + (onDividerCard == null ? 0 : onDividerCard.hashCode())) * 31;
            OnButton onButton = this.c;
            return iHashCode2 + (onButton != null ? onButton.hashCode() : 0);
        }

        public final String toString() {
            return "Fulfilment(__typename=" + this.f23265a + ", onDividerCard=" + this.b + ", onButton=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$Header;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Header {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f23266a;
        public final Image b;

        public Header(ArrayList arrayList, Image image) {
            this.f23266a = arrayList;
            this.b = image;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Header)) {
                return false;
            }
            Header header = (Header) obj;
            return this.f23266a.equals(header.f23266a) && this.b.equals(header.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23266a.hashCode() * 31);
        }

        public final String toString() {
            return "Header(buttons=" + this.f23266a + ", image=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$Image;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Image {

        /* renamed from: a, reason: collision with root package name */
        public final String f23267a;
        public final DownloadableAssetFragment b;

        public Image(String str, DownloadableAssetFragment downloadableAssetFragment) {
            this.f23267a = str;
            this.b = downloadableAssetFragment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Image)) {
                return false;
            }
            Image image = (Image) obj;
            return Intrinsics.c(this.f23267a, image.f23267a) && Intrinsics.c(this.b, image.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23267a.hashCode() * 31);
        }

        public final String toString() {
            return "Image(__typename=" + this.f23267a + ", downloadableAssetFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$Image1;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Image1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f23268a;
        public final DownloadableAssetFragment b;

        public Image1(String str, DownloadableAssetFragment downloadableAssetFragment) {
            this.f23268a = str;
            this.b = downloadableAssetFragment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Image1)) {
                return false;
            }
            Image1 image1 = (Image1) obj;
            return Intrinsics.c(this.f23268a, image1.f23268a) && Intrinsics.c(this.b, image1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23268a.hashCode() * 31);
        }

        public final String toString() {
            return "Image1(__typename=" + this.f23268a + ", downloadableAssetFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$Image2;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Image2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f23269a;
        public final DownloadableAssetFragment b;

        public Image2(String str, DownloadableAssetFragment downloadableAssetFragment) {
            this.f23269a = str;
            this.b = downloadableAssetFragment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Image2)) {
                return false;
            }
            Image2 image2 = (Image2) obj;
            return Intrinsics.c(this.f23269a, image2.f23269a) && Intrinsics.c(this.b, image2.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23269a.hashCode() * 31);
        }

        public final String toString() {
            return "Image2(__typename=" + this.f23269a + ", downloadableAssetFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$Item;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f23270a;
        public final List b;
        public final Badge c;
        public final ArrayList d;
        public final ItemFragment e;

        public Item(String str, List list, Badge badge, ArrayList arrayList, ItemFragment itemFragment) {
            this.f23270a = str;
            this.b = list;
            this.c = badge;
            this.d = arrayList;
            this.e = itemFragment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return this.f23270a.equals(item.f23270a) && Intrinsics.c(this.b, item.b) && Intrinsics.c(this.c, item.c) && this.d.equals(item.d) && this.e.equals(item.e);
        }

        public final int hashCode() {
            int iHashCode = this.f23270a.hashCode() * 31;
            List list = this.b;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            Badge badge = this.c;
            return this.e.hashCode() + androidx.compose.ui.input.pointer.a.b((iHashCode2 + (badge != null ? badge.hashCode() : 0)) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sbS = au.com.woolworths.android.onesite.a.s("Item(__typename=", this.f23270a, ", fulfilment=", ", badge=", this.b);
            sbS.append(this.c);
            sbS.append(", conditions=");
            sbS.append(this.d);
            sbS.append(", itemFragment=");
            sbS.append(this.e);
            sbS.append(")");
            return sbS.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$OnButton;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f23271a;
        public final ButtonFragment b;

        public OnButton(String str, ButtonFragment buttonFragment) {
            this.f23271a = str;
            this.b = buttonFragment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnButton)) {
                return false;
            }
            OnButton onButton = (OnButton) obj;
            return Intrinsics.c(this.f23271a, onButton.f23271a) && Intrinsics.c(this.b, onButton.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23271a.hashCode() * 31);
        }

        public final String toString() {
            return "OnButton(__typename=" + this.f23271a + ", buttonFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$OnDividerCard;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnDividerCard {

        /* renamed from: a, reason: collision with root package name */
        public final Boolean f23272a;

        public OnDividerCard(Boolean bool) {
            this.f23272a = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnDividerCard) && Intrinsics.c(this.f23272a, ((OnDividerCard) obj).f23272a);
        }

        public final int hashCode() {
            Boolean bool = this.f23272a;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final String toString() {
            return androidx.compose.ui.input.pointer.a.k(this.f23272a, "OnDividerCard(value=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$OnModeSelectorV1AddressDetailsDelivery;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnModeSelectorV1AddressDetailsDelivery {

        /* renamed from: a, reason: collision with root package name */
        public final String f23273a;
        public final ModeSelectorV1AddressDetailsDeliveryFragment b;

        public OnModeSelectorV1AddressDetailsDelivery(String str, ModeSelectorV1AddressDetailsDeliveryFragment modeSelectorV1AddressDetailsDeliveryFragment) {
            this.f23273a = str;
            this.b = modeSelectorV1AddressDetailsDeliveryFragment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnModeSelectorV1AddressDetailsDelivery)) {
                return false;
            }
            OnModeSelectorV1AddressDetailsDelivery onModeSelectorV1AddressDetailsDelivery = (OnModeSelectorV1AddressDetailsDelivery) obj;
            return Intrinsics.c(this.f23273a, onModeSelectorV1AddressDetailsDelivery.f23273a) && Intrinsics.c(this.b, onModeSelectorV1AddressDetailsDelivery.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23273a.hashCode() * 31);
        }

        public final String toString() {
            return "OnModeSelectorV1AddressDetailsDelivery(__typename=" + this.f23273a + ", modeSelectorV1AddressDetailsDeliveryFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$OnModeSelectorV1AddressDetailsPickup;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnModeSelectorV1AddressDetailsPickup {

        /* renamed from: a, reason: collision with root package name */
        public final String f23274a;
        public final ModeSelectorV1AddressDetailsPickupFragment b;

        public OnModeSelectorV1AddressDetailsPickup(String str, ModeSelectorV1AddressDetailsPickupFragment modeSelectorV1AddressDetailsPickupFragment) {
            this.f23274a = str;
            this.b = modeSelectorV1AddressDetailsPickupFragment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnModeSelectorV1AddressDetailsPickup)) {
                return false;
            }
            OnModeSelectorV1AddressDetailsPickup onModeSelectorV1AddressDetailsPickup = (OnModeSelectorV1AddressDetailsPickup) obj;
            return Intrinsics.c(this.f23274a, onModeSelectorV1AddressDetailsPickup.f23274a) && Intrinsics.c(this.b, onModeSelectorV1AddressDetailsPickup.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23274a.hashCode() * 31);
        }

        public final String toString() {
            return "OnModeSelectorV1AddressDetailsPickup(__typename=" + this.f23274a + ", modeSelectorV1AddressDetailsPickupFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$OnShoppingModeSelector;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnShoppingModeSelector {

        /* renamed from: a, reason: collision with root package name */
        public final Header f23275a;
        public final ArrayList b;

        public OnShoppingModeSelector(Header header, ArrayList arrayList) {
            this.f23275a = header;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnShoppingModeSelector)) {
                return false;
            }
            OnShoppingModeSelector onShoppingModeSelector = (OnShoppingModeSelector) obj;
            return this.f23275a.equals(onShoppingModeSelector.f23275a) && this.b.equals(onShoppingModeSelector.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23275a.hashCode() * 31);
        }

        public final String toString() {
            return "OnShoppingModeSelector(header=" + this.f23275a + ", sections=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$OnShoppingModeSelectorAddressInfoSection;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnShoppingModeSelectorAddressInfoSection {

        /* renamed from: a, reason: collision with root package name */
        public final String f23276a;
        public final Details b;

        public OnShoppingModeSelectorAddressInfoSection(String str, Details details) {
            this.f23276a = str;
            this.b = details;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnShoppingModeSelectorAddressInfoSection)) {
                return false;
            }
            OnShoppingModeSelectorAddressInfoSection onShoppingModeSelectorAddressInfoSection = (OnShoppingModeSelectorAddressInfoSection) obj;
            return Intrinsics.c(this.f23276a, onShoppingModeSelectorAddressInfoSection.f23276a) && Intrinsics.c(this.b, onShoppingModeSelectorAddressInfoSection.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23276a.hashCode() * 31);
        }

        public final String toString() {
            return "OnShoppingModeSelectorAddressInfoSection(addressTitle=" + this.f23276a + ", details=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$OnShoppingModeSelectorErrorResponse;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnShoppingModeSelectorErrorResponse {

        /* renamed from: a, reason: collision with root package name */
        public final String f23277a;
        public final String b;

        public OnShoppingModeSelectorErrorResponse(String str, String str2) {
            this.f23277a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnShoppingModeSelectorErrorResponse)) {
                return false;
            }
            OnShoppingModeSelectorErrorResponse onShoppingModeSelectorErrorResponse = (OnShoppingModeSelectorErrorResponse) obj;
            return Intrinsics.c(this.f23277a, onShoppingModeSelectorErrorResponse.f23277a) && Intrinsics.c(this.b, onShoppingModeSelectorErrorResponse.b);
        }

        public final int hashCode() {
            String str = this.f23277a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return a.j("OnShoppingModeSelectorErrorResponse(deep=", this.f23277a, ", message=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$OnShoppingModeSelectorOptionsSection;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnShoppingModeSelectorOptionsSection {

        /* renamed from: a, reason: collision with root package name */
        public final String f23278a;
        public final ArrayList b;
        public final String c;
        public final String d;

        public OnShoppingModeSelectorOptionsSection(String str, String str2, String str3, ArrayList arrayList) {
            this.f23278a = str;
            this.b = arrayList;
            this.c = str2;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnShoppingModeSelectorOptionsSection)) {
                return false;
            }
            OnShoppingModeSelectorOptionsSection onShoppingModeSelectorOptionsSection = (OnShoppingModeSelectorOptionsSection) obj;
            return Intrinsics.c(this.f23278a, onShoppingModeSelectorOptionsSection.f23278a) && this.b.equals(onShoppingModeSelectorOptionsSection.b) && Intrinsics.c(this.c, onShoppingModeSelectorOptionsSection.c) && Intrinsics.c(this.d, onShoppingModeSelectorOptionsSection.d);
        }

        public final int hashCode() {
            String str = this.f23278a;
            int iB = androidx.compose.ui.input.pointer.a.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            String str2 = this.c;
            int iHashCode = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            return iHashCode + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return androidx.constraintlayout.core.state.a.l(d.x("OnShoppingModeSelectorOptionsSection(optionTitle=", this.f23278a, ", items=", ", footnote=", this.b), this.c, ", disclaimer=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$OnShoppingModeSelectorStoreDetailsSection;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnShoppingModeSelectorStoreDetailsSection {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f23279a;

        public OnShoppingModeSelectorStoreDetailsSection(ArrayList arrayList) {
            this.f23279a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnShoppingModeSelectorStoreDetailsSection) && this.f23279a.equals(((OnShoppingModeSelectorStoreDetailsSection) obj).f23279a);
        }

        public final int hashCode() {
            return this.f23279a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("OnShoppingModeSelectorStoreDetailsSection(storeDetails=", ")", this.f23279a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$OnShoppingModeSelectorStoreFeaturesSection;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnShoppingModeSelectorStoreFeaturesSection {

        /* renamed from: a, reason: collision with root package name */
        public final String f23280a;
        public final ArrayList b;

        public OnShoppingModeSelectorStoreFeaturesSection(String str, ArrayList arrayList) {
            this.f23280a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnShoppingModeSelectorStoreFeaturesSection)) {
                return false;
            }
            OnShoppingModeSelectorStoreFeaturesSection onShoppingModeSelectorStoreFeaturesSection = (OnShoppingModeSelectorStoreFeaturesSection) obj;
            return this.f23280a.equals(onShoppingModeSelectorStoreFeaturesSection.f23280a) && this.b.equals(onShoppingModeSelectorStoreFeaturesSection.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23280a.hashCode() * 31);
        }

        public final String toString() {
            return d.q("OnShoppingModeSelectorStoreFeaturesSection(title=", this.f23280a, ", features=", ")", this.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$SecondaryButton;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SecondaryButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f23281a;
        public final ButtonFragment b;

        public SecondaryButton(String str, ButtonFragment buttonFragment) {
            this.f23281a = str;
            this.b = buttonFragment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SecondaryButton)) {
                return false;
            }
            SecondaryButton secondaryButton = (SecondaryButton) obj;
            return Intrinsics.c(this.f23281a, secondaryButton.f23281a) && Intrinsics.c(this.b, secondaryButton.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23281a.hashCode() * 31);
        }

        public final String toString() {
            return "SecondaryButton(__typename=" + this.f23281a + ", buttonFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$Section;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Section {

        /* renamed from: a, reason: collision with root package name */
        public final String f23282a;
        public final OnShoppingModeSelectorOptionsSection b;
        public final OnShoppingModeSelectorStoreDetailsSection c;
        public final OnShoppingModeSelectorStoreFeaturesSection d;
        public final OnShoppingModeSelectorAddressInfoSection e;

        public Section(String __typename, OnShoppingModeSelectorOptionsSection onShoppingModeSelectorOptionsSection, OnShoppingModeSelectorStoreDetailsSection onShoppingModeSelectorStoreDetailsSection, OnShoppingModeSelectorStoreFeaturesSection onShoppingModeSelectorStoreFeaturesSection, OnShoppingModeSelectorAddressInfoSection onShoppingModeSelectorAddressInfoSection) {
            Intrinsics.h(__typename, "__typename");
            this.f23282a = __typename;
            this.b = onShoppingModeSelectorOptionsSection;
            this.c = onShoppingModeSelectorStoreDetailsSection;
            this.d = onShoppingModeSelectorStoreFeaturesSection;
            this.e = onShoppingModeSelectorAddressInfoSection;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Section)) {
                return false;
            }
            Section section = (Section) obj;
            return Intrinsics.c(this.f23282a, section.f23282a) && Intrinsics.c(this.b, section.b) && Intrinsics.c(this.c, section.c) && Intrinsics.c(this.d, section.d) && Intrinsics.c(this.e, section.e);
        }

        public final int hashCode() {
            int iHashCode = this.f23282a.hashCode() * 31;
            OnShoppingModeSelectorOptionsSection onShoppingModeSelectorOptionsSection = this.b;
            int iHashCode2 = (iHashCode + (onShoppingModeSelectorOptionsSection == null ? 0 : onShoppingModeSelectorOptionsSection.hashCode())) * 31;
            OnShoppingModeSelectorStoreDetailsSection onShoppingModeSelectorStoreDetailsSection = this.c;
            int iHashCode3 = (iHashCode2 + (onShoppingModeSelectorStoreDetailsSection == null ? 0 : onShoppingModeSelectorStoreDetailsSection.f23279a.hashCode())) * 31;
            OnShoppingModeSelectorStoreFeaturesSection onShoppingModeSelectorStoreFeaturesSection = this.d;
            int iHashCode4 = (iHashCode3 + (onShoppingModeSelectorStoreFeaturesSection == null ? 0 : onShoppingModeSelectorStoreFeaturesSection.hashCode())) * 31;
            OnShoppingModeSelectorAddressInfoSection onShoppingModeSelectorAddressInfoSection = this.e;
            return iHashCode4 + (onShoppingModeSelectorAddressInfoSection != null ? onShoppingModeSelectorAddressInfoSection.hashCode() : 0);
        }

        public final String toString() {
            return "Section(__typename=" + this.f23282a + ", onShoppingModeSelectorOptionsSection=" + this.b + ", onShoppingModeSelectorStoreDetailsSection=" + this.c + ", onShoppingModeSelectorStoreFeaturesSection=" + this.d + ", onShoppingModeSelectorAddressInfoSection=" + this.e + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$ShoppingModeDetails;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShoppingModeDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f23283a;
        public final ShoppingModeDetailsFragment b;

        public ShoppingModeDetails(String str, ShoppingModeDetailsFragment shoppingModeDetailsFragment) {
            this.f23283a = str;
            this.b = shoppingModeDetailsFragment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShoppingModeDetails)) {
                return false;
            }
            ShoppingModeDetails shoppingModeDetails = (ShoppingModeDetails) obj;
            return Intrinsics.c(this.f23283a, shoppingModeDetails.f23283a) && Intrinsics.c(this.b, shoppingModeDetails.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23283a.hashCode() * 31);
        }

        public final String toString() {
            return "ShoppingModeDetails(__typename=" + this.f23283a + ", shoppingModeDetailsFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$ShoppingModeSelector;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShoppingModeSelector {

        /* renamed from: a, reason: collision with root package name */
        public final String f23284a;
        public final OnShoppingModeSelector b;
        public final OnShoppingModeSelectorErrorResponse c;

        public ShoppingModeSelector(String __typename, OnShoppingModeSelector onShoppingModeSelector, OnShoppingModeSelectorErrorResponse onShoppingModeSelectorErrorResponse) {
            Intrinsics.h(__typename, "__typename");
            this.f23284a = __typename;
            this.b = onShoppingModeSelector;
            this.c = onShoppingModeSelectorErrorResponse;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShoppingModeSelector)) {
                return false;
            }
            ShoppingModeSelector shoppingModeSelector = (ShoppingModeSelector) obj;
            return Intrinsics.c(this.f23284a, shoppingModeSelector.f23284a) && Intrinsics.c(this.b, shoppingModeSelector.b) && Intrinsics.c(this.c, shoppingModeSelector.c);
        }

        public final int hashCode() {
            int iHashCode = this.f23284a.hashCode() * 31;
            OnShoppingModeSelector onShoppingModeSelector = this.b;
            int iHashCode2 = (iHashCode + (onShoppingModeSelector == null ? 0 : onShoppingModeSelector.hashCode())) * 31;
            OnShoppingModeSelectorErrorResponse onShoppingModeSelectorErrorResponse = this.c;
            return iHashCode2 + (onShoppingModeSelectorErrorResponse != null ? onShoppingModeSelectorErrorResponse.hashCode() : 0);
        }

        public final String toString() {
            return "ShoppingModeSelector(__typename=" + this.f23284a + ", onShoppingModeSelector=" + this.b + ", onShoppingModeSelectorErrorResponse=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$StoreDetail;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StoreDetail {

        /* renamed from: a, reason: collision with root package name */
        public final Image1 f23285a;
        public final String b;
        public final String c;
        public final Button1 d;

        public StoreDetail(Image1 image1, String str, String str2, Button1 button1) {
            this.f23285a = image1;
            this.b = str;
            this.c = str2;
            this.d = button1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StoreDetail)) {
                return false;
            }
            StoreDetail storeDetail = (StoreDetail) obj;
            return Intrinsics.c(this.f23285a, storeDetail.f23285a) && Intrinsics.c(this.b, storeDetail.b) && Intrinsics.c(this.c, storeDetail.c) && Intrinsics.c(this.d, storeDetail.d);
        }

        public final int hashCode() {
            Image1 image1 = this.f23285a;
            int iHashCode = (image1 == null ? 0 : image1.hashCode()) * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Button1 button1 = this.d;
            return iHashCode3 + (button1 != null ? button1.hashCode() : 0);
        }

        public final String toString() {
            return "StoreDetail(image=" + this.f23285a + ", title=" + this.b + ", subtitle=" + this.c + ", button=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$V1AddressDetails;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class V1AddressDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f23286a;
        public final OnModeSelectorV1AddressDetailsDelivery b;
        public final OnModeSelectorV1AddressDetailsPickup c;

        public V1AddressDetails(String __typename, OnModeSelectorV1AddressDetailsDelivery onModeSelectorV1AddressDetailsDelivery, OnModeSelectorV1AddressDetailsPickup onModeSelectorV1AddressDetailsPickup) {
            Intrinsics.h(__typename, "__typename");
            this.f23286a = __typename;
            this.b = onModeSelectorV1AddressDetailsDelivery;
            this.c = onModeSelectorV1AddressDetailsPickup;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof V1AddressDetails)) {
                return false;
            }
            V1AddressDetails v1AddressDetails = (V1AddressDetails) obj;
            return Intrinsics.c(this.f23286a, v1AddressDetails.f23286a) && Intrinsics.c(this.b, v1AddressDetails.b) && Intrinsics.c(this.c, v1AddressDetails.c);
        }

        public final int hashCode() {
            int iHashCode = this.f23286a.hashCode() * 31;
            OnModeSelectorV1AddressDetailsDelivery onModeSelectorV1AddressDetailsDelivery = this.b;
            int iHashCode2 = (iHashCode + (onModeSelectorV1AddressDetailsDelivery == null ? 0 : onModeSelectorV1AddressDetailsDelivery.hashCode())) * 31;
            OnModeSelectorV1AddressDetailsPickup onModeSelectorV1AddressDetailsPickup = this.c;
            return iHashCode2 + (onModeSelectorV1AddressDetailsPickup != null ? onModeSelectorV1AddressDetailsPickup.hashCode() : 0);
        }

        public final String toString() {
            return "V1AddressDetails(__typename=" + this.f23286a + ", onModeSelectorV1AddressDetailsDelivery=" + this.b + ", onModeSelectorV1AddressDetailsPickup=" + this.c + ")";
        }
    }

    public ShoppingModeSelectorQuery(Optional.Present present, boolean z, Optional.Present present2, boolean z2) {
        this.f23256a = present;
        this.b = z;
        this.c = present2;
        this.d = z2;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(ShoppingModeSelectorQuery_ResponseAdapter.Data.f23323a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query ShoppingModeSelector($storeId: ID, $includeInstoreUplift: Boolean!, $geoLocation: GeoLocation, $includeServiceFees: Boolean!) { shoppingModeSelector(storeId: $storeId, geoLocation: $geoLocation) { __typename ... on ShoppingModeSelector { header { buttons { id isSelected title } image { __typename ...downloadableAssetFragment } } sections { __typename ... on ShoppingModeSelectorOptionsSection @skip(if: $includeInstoreUplift) { optionTitle: title items { __typename ...itemFragment fulfilment { __typename ... on DividerCard { value: _ } ... on Button { __typename ...buttonFragment } } badge { label type } conditions { label type } } footnote disclaimer @include(if: $includeServiceFees) } ... on ShoppingModeSelectorStoreDetailsSection @include(if: $includeInstoreUplift) { storeDetails { image { __typename ...downloadableAssetFragment } title subtitle button { __typename ...buttonFragment } } } ... on ShoppingModeSelectorStoreFeaturesSection @include(if: $includeInstoreUplift) { title features { title imageUrl } } ... on ShoppingModeSelectorAddressInfoSection { addressTitle: title details { shoppingModeDetails { __typename ...shoppingModeDetailsFragment } image { __typename ...downloadableAssetFragment } title subtitle button { __typename ...buttonFragment } v1AddressDetails { __typename ... on ModeSelectorV1AddressDetailsDelivery { __typename ...modeSelectorV1AddressDetailsDeliveryFragment } ... on ModeSelectorV1AddressDetailsPickup { __typename ...modeSelectorV1AddressDetailsPickupFragment } } secondaryButton @include(if: $includeInstoreUplift) { __typename ...buttonFragment } } } } } ... on ShoppingModeSelectorErrorResponse { deep: deepLinkUrl message } } }  fragment downloadableAssetFragment on DownloadableAsset { assetType assetUrl assetWidth assetHeight fit altText }  fragment itemFragment on ShoppingModeSelectorOption { id price subtitle title state }  fragment buttonFragment on Button { label style enabled action url iconUrl altText analytics { label } }  fragment shoppingModeDetailsFragment on ShoppingModeDetails { displayName mode storeAddressId }  fragment modeSelectorV1AddressDetailsDeliveryFragment on ModeSelectorV1AddressDetailsDelivery { modeId addressId addressText isPrimary postcode street1 street2 suburbId suburbName }  fragment modeSelectorV1AddressDetailsPickupFragment on ModeSelectorV1AddressDetailsPickup { modeId storeId addressId addressText displayName label }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoppingModeSelectorQuery)) {
            return false;
        }
        ShoppingModeSelectorQuery shoppingModeSelectorQuery = (ShoppingModeSelectorQuery) obj;
        return this.f23256a.equals(shoppingModeSelectorQuery.f23256a) && this.b == shoppingModeSelectorQuery.b && this.c.equals(shoppingModeSelectorQuery.c) && this.d == shoppingModeSelectorQuery.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.b(this.c, b.e(this.f23256a.hashCode() * 31, 31, this.b), 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "59c347cd42957d89e94194c3b4d704cece383da76e198a455331c14a1bea176f";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "ShoppingModeSelector";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("storeId");
        Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, this.f23256a);
        jsonWriter.F1("includeInstoreUplift");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        d.B(this.b, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "geoLocation");
        Adapters.d(Adapters.b(Adapters.c(GeoLocation_InputAdapter.f12077a, false))).toJson(jsonWriter, customScalarAdapters, this.c);
        jsonWriter.F1("includeServiceFees");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.d));
    }

    public final String toString() {
        return "ShoppingModeSelectorQuery(storeId=" + this.f23256a + ", includeInstoreUplift=" + this.b + ", geoLocation=" + this.c + ", includeServiceFees=" + this.d + ")";
    }
}
