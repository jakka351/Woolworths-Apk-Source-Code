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
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.modeselector.adapter.SetShoppingModeMutation_ResponseAdapter;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001: \u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"¨\u0006#"}, d2 = {"Lcom/woolworths/shop/modeselector/SetShoppingModeMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$Data;", "Data", "SetShoppingMode", "OnShoppingModeSelector", "Header", "Button", "Image", "Section", "OnShoppingModeSelectorOptionsSection", "Item", "Fulfilment", "OnDividerCard", "OnButton", "Badge", "Condition", "OnShoppingModeSelectorStoreDetailsSection", "StoreDetail", "Image1", "Button1", "OnShoppingModeSelectorStoreFeaturesSection", "Feature", "OnShoppingModeSelectorAddressInfoSection", "Details", "ShoppingModeDetails", "Image2", "Button2", "V1AddressDetails", "OnModeSelectorV1AddressDetailsDelivery", "OnModeSelectorV1AddressDetailsPickup", "SecondaryButton", "OnShoppingModeSelectorErrorResponse", "OnShoppingModeSelectorRedirectResponse", "Companion", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SetShoppingModeMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f23224a;
    public final Optional.Present b;
    public final Optional.Present c;
    public final boolean d;
    public final Optional.Present e;
    public final boolean f;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$Badge;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Badge {

        /* renamed from: a, reason: collision with root package name */
        public final String f23225a;
        public final BadgeType b;

        public Badge(String str, BadgeType badgeType) {
            this.f23225a = str;
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
            return Intrinsics.c(this.f23225a, badge.f23225a) && this.b == badge.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23225a.hashCode() * 31);
        }

        public final String toString() {
            return "Badge(label=" + this.f23225a + ", type=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$Button;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button {

        /* renamed from: a, reason: collision with root package name */
        public final String f23226a;
        public final boolean b;
        public final String c;

        public Button(String str, String str2, boolean z) {
            this.f23226a = str;
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
            return Intrinsics.c(this.f23226a, button.f23226a) && this.b == button.b && Intrinsics.c(this.c, button.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.e(this.f23226a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(androidx.constraintlayout.core.state.a.q("Button(id=", this.f23226a, ", isSelected=", ", title=", this.b), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$Button1;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f23227a;
        public final ButtonFragment b;

        public Button1(String str, ButtonFragment buttonFragment) {
            this.f23227a = str;
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
            return Intrinsics.c(this.f23227a, button1.f23227a) && Intrinsics.c(this.b, button1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23227a.hashCode() * 31);
        }

        public final String toString() {
            return "Button1(__typename=" + this.f23227a + ", buttonFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$Button2;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f23228a;
        public final ButtonFragment b;

        public Button2(String str, ButtonFragment buttonFragment) {
            this.f23228a = str;
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
            return Intrinsics.c(this.f23228a, button2.f23228a) && Intrinsics.c(this.b, button2.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23228a.hashCode() * 31);
        }

        public final String toString() {
            return "Button2(__typename=" + this.f23228a + ", buttonFragment=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$Condition;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Condition {

        /* renamed from: a, reason: collision with root package name */
        public final String f23229a;
        public final BadgeType b;

        public Condition(String str, BadgeType badgeType) {
            this.f23229a = str;
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
            return Intrinsics.c(this.f23229a, condition.f23229a) && this.b == condition.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23229a.hashCode() * 31);
        }

        public final String toString() {
            return "Condition(label=" + this.f23229a + ", type=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final SetShoppingMode f23230a;

        public Data(SetShoppingMode setShoppingMode) {
            this.f23230a = setShoppingMode;
        }

        /* renamed from: a, reason: from getter */
        public final SetShoppingMode getF23230a() {
            return this.f23230a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f23230a, ((Data) obj).f23230a);
        }

        public final int hashCode() {
            return this.f23230a.hashCode();
        }

        public final String toString() {
            return "Data(setShoppingMode=" + this.f23230a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$Details;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Details {

        /* renamed from: a, reason: collision with root package name */
        public final ShoppingModeDetails f23231a;
        public final Image2 b;
        public final String c;
        public final String d;
        public final Button2 e;
        public final V1AddressDetails f;
        public final SecondaryButton g;

        public Details(ShoppingModeDetails shoppingModeDetails, Image2 image2, String str, String str2, Button2 button2, V1AddressDetails v1AddressDetails, SecondaryButton secondaryButton) {
            this.f23231a = shoppingModeDetails;
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
            return Intrinsics.c(this.f23231a, details.f23231a) && Intrinsics.c(this.b, details.b) && Intrinsics.c(this.c, details.c) && Intrinsics.c(this.d, details.d) && Intrinsics.c(this.e, details.e) && Intrinsics.c(this.f, details.f) && Intrinsics.c(this.g, details.g);
        }

        public final int hashCode() {
            int iHashCode = this.f23231a.hashCode() * 31;
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
            sb.append(this.f23231a);
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$Feature;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Feature {

        /* renamed from: a, reason: collision with root package name */
        public final String f23232a;
        public final String b;

        public Feature(String str, String str2) {
            this.f23232a = str;
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
            return Intrinsics.c(this.f23232a, feature.f23232a) && Intrinsics.c(this.b, feature.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23232a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Feature(title=", this.f23232a, ", imageUrl=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$Fulfilment;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Fulfilment {

        /* renamed from: a, reason: collision with root package name */
        public final String f23233a;
        public final OnDividerCard b;
        public final OnButton c;

        public Fulfilment(String __typename, OnDividerCard onDividerCard, OnButton onButton) {
            Intrinsics.h(__typename, "__typename");
            this.f23233a = __typename;
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
            return Intrinsics.c(this.f23233a, fulfilment.f23233a) && Intrinsics.c(this.b, fulfilment.b) && Intrinsics.c(this.c, fulfilment.c);
        }

        public final int hashCode() {
            int iHashCode = this.f23233a.hashCode() * 31;
            OnDividerCard onDividerCard = this.b;
            int iHashCode2 = (iHashCode + (onDividerCard == null ? 0 : onDividerCard.hashCode())) * 31;
            OnButton onButton = this.c;
            return iHashCode2 + (onButton != null ? onButton.hashCode() : 0);
        }

        public final String toString() {
            return "Fulfilment(__typename=" + this.f23233a + ", onDividerCard=" + this.b + ", onButton=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$Header;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Header {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f23234a;
        public final Image b;

        public Header(ArrayList arrayList, Image image) {
            this.f23234a = arrayList;
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
            return this.f23234a.equals(header.f23234a) && this.b.equals(header.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23234a.hashCode() * 31);
        }

        public final String toString() {
            return "Header(buttons=" + this.f23234a + ", image=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$Image;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Image {

        /* renamed from: a, reason: collision with root package name */
        public final String f23235a;
        public final DownloadableAssetFragment b;

        public Image(String str, DownloadableAssetFragment downloadableAssetFragment) {
            this.f23235a = str;
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
            return Intrinsics.c(this.f23235a, image.f23235a) && Intrinsics.c(this.b, image.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23235a.hashCode() * 31);
        }

        public final String toString() {
            return "Image(__typename=" + this.f23235a + ", downloadableAssetFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$Image1;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Image1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f23236a;
        public final DownloadableAssetFragment b;

        public Image1(String str, DownloadableAssetFragment downloadableAssetFragment) {
            this.f23236a = str;
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
            return Intrinsics.c(this.f23236a, image1.f23236a) && Intrinsics.c(this.b, image1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23236a.hashCode() * 31);
        }

        public final String toString() {
            return "Image1(__typename=" + this.f23236a + ", downloadableAssetFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$Image2;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Image2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f23237a;
        public final DownloadableAssetFragment b;

        public Image2(String str, DownloadableAssetFragment downloadableAssetFragment) {
            this.f23237a = str;
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
            return Intrinsics.c(this.f23237a, image2.f23237a) && Intrinsics.c(this.b, image2.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23237a.hashCode() * 31);
        }

        public final String toString() {
            return "Image2(__typename=" + this.f23237a + ", downloadableAssetFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$Item;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f23238a;
        public final List b;
        public final Badge c;
        public final ArrayList d;
        public final ItemFragment e;

        public Item(String str, List list, Badge badge, ArrayList arrayList, ItemFragment itemFragment) {
            this.f23238a = str;
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
            return this.f23238a.equals(item.f23238a) && Intrinsics.c(this.b, item.b) && Intrinsics.c(this.c, item.c) && this.d.equals(item.d) && this.e.equals(item.e);
        }

        public final int hashCode() {
            int iHashCode = this.f23238a.hashCode() * 31;
            List list = this.b;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            Badge badge = this.c;
            return this.e.hashCode() + androidx.compose.ui.input.pointer.a.b((iHashCode2 + (badge != null ? badge.hashCode() : 0)) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sbS = au.com.woolworths.android.onesite.a.s("Item(__typename=", this.f23238a, ", fulfilment=", ", badge=", this.b);
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$OnButton;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f23239a;
        public final ButtonFragment b;

        public OnButton(String str, ButtonFragment buttonFragment) {
            this.f23239a = str;
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
            return Intrinsics.c(this.f23239a, onButton.f23239a) && Intrinsics.c(this.b, onButton.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23239a.hashCode() * 31);
        }

        public final String toString() {
            return "OnButton(__typename=" + this.f23239a + ", buttonFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$OnDividerCard;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnDividerCard {

        /* renamed from: a, reason: collision with root package name */
        public final Boolean f23240a;

        public OnDividerCard(Boolean bool) {
            this.f23240a = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnDividerCard) && Intrinsics.c(this.f23240a, ((OnDividerCard) obj).f23240a);
        }

        public final int hashCode() {
            Boolean bool = this.f23240a;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final String toString() {
            return androidx.compose.ui.input.pointer.a.k(this.f23240a, "OnDividerCard(value=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$OnModeSelectorV1AddressDetailsDelivery;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnModeSelectorV1AddressDetailsDelivery {

        /* renamed from: a, reason: collision with root package name */
        public final String f23241a;
        public final ModeSelectorV1AddressDetailsDeliveryFragment b;

        public OnModeSelectorV1AddressDetailsDelivery(String str, ModeSelectorV1AddressDetailsDeliveryFragment modeSelectorV1AddressDetailsDeliveryFragment) {
            this.f23241a = str;
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
            return Intrinsics.c(this.f23241a, onModeSelectorV1AddressDetailsDelivery.f23241a) && Intrinsics.c(this.b, onModeSelectorV1AddressDetailsDelivery.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23241a.hashCode() * 31);
        }

        public final String toString() {
            return "OnModeSelectorV1AddressDetailsDelivery(__typename=" + this.f23241a + ", modeSelectorV1AddressDetailsDeliveryFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$OnModeSelectorV1AddressDetailsPickup;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnModeSelectorV1AddressDetailsPickup {

        /* renamed from: a, reason: collision with root package name */
        public final String f23242a;
        public final ModeSelectorV1AddressDetailsPickupFragment b;

        public OnModeSelectorV1AddressDetailsPickup(String str, ModeSelectorV1AddressDetailsPickupFragment modeSelectorV1AddressDetailsPickupFragment) {
            this.f23242a = str;
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
            return Intrinsics.c(this.f23242a, onModeSelectorV1AddressDetailsPickup.f23242a) && Intrinsics.c(this.b, onModeSelectorV1AddressDetailsPickup.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23242a.hashCode() * 31);
        }

        public final String toString() {
            return "OnModeSelectorV1AddressDetailsPickup(__typename=" + this.f23242a + ", modeSelectorV1AddressDetailsPickupFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$OnShoppingModeSelector;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnShoppingModeSelector {

        /* renamed from: a, reason: collision with root package name */
        public final Header f23243a;
        public final ArrayList b;

        public OnShoppingModeSelector(Header header, ArrayList arrayList) {
            this.f23243a = header;
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
            return this.f23243a.equals(onShoppingModeSelector.f23243a) && this.b.equals(onShoppingModeSelector.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23243a.hashCode() * 31);
        }

        public final String toString() {
            return "OnShoppingModeSelector(header=" + this.f23243a + ", sections=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$OnShoppingModeSelectorAddressInfoSection;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnShoppingModeSelectorAddressInfoSection {

        /* renamed from: a, reason: collision with root package name */
        public final String f23244a;
        public final Details b;

        public OnShoppingModeSelectorAddressInfoSection(String str, Details details) {
            this.f23244a = str;
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
            return Intrinsics.c(this.f23244a, onShoppingModeSelectorAddressInfoSection.f23244a) && Intrinsics.c(this.b, onShoppingModeSelectorAddressInfoSection.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23244a.hashCode() * 31);
        }

        public final String toString() {
            return "OnShoppingModeSelectorAddressInfoSection(addressTitle=" + this.f23244a + ", details=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$OnShoppingModeSelectorErrorResponse;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnShoppingModeSelectorErrorResponse {

        /* renamed from: a, reason: collision with root package name */
        public final String f23245a;
        public final String b;

        public OnShoppingModeSelectorErrorResponse(String str, String str2) {
            this.f23245a = str;
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
            return Intrinsics.c(this.f23245a, onShoppingModeSelectorErrorResponse.f23245a) && Intrinsics.c(this.b, onShoppingModeSelectorErrorResponse.b);
        }

        public final int hashCode() {
            String str = this.f23245a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return a.j("OnShoppingModeSelectorErrorResponse(deep=", this.f23245a, ", message=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$OnShoppingModeSelectorOptionsSection;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnShoppingModeSelectorOptionsSection {

        /* renamed from: a, reason: collision with root package name */
        public final String f23246a;
        public final ArrayList b;
        public final String c;
        public final String d;

        public OnShoppingModeSelectorOptionsSection(String str, String str2, String str3, ArrayList arrayList) {
            this.f23246a = str;
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
            return Intrinsics.c(this.f23246a, onShoppingModeSelectorOptionsSection.f23246a) && this.b.equals(onShoppingModeSelectorOptionsSection.b) && Intrinsics.c(this.c, onShoppingModeSelectorOptionsSection.c) && Intrinsics.c(this.d, onShoppingModeSelectorOptionsSection.d);
        }

        public final int hashCode() {
            String str = this.f23246a;
            int iB = androidx.compose.ui.input.pointer.a.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            String str2 = this.c;
            int iHashCode = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            return iHashCode + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return androidx.constraintlayout.core.state.a.l(d.x("OnShoppingModeSelectorOptionsSection(optionTitle=", this.f23246a, ", items=", ", footnote=", this.b), this.c, ", disclaimer=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$OnShoppingModeSelectorRedirectResponse;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnShoppingModeSelectorRedirectResponse {

        /* renamed from: a, reason: collision with root package name */
        public final String f23247a;

        public OnShoppingModeSelectorRedirectResponse(String str) {
            this.f23247a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnShoppingModeSelectorRedirectResponse) && Intrinsics.c(this.f23247a, ((OnShoppingModeSelectorRedirectResponse) obj).f23247a);
        }

        public final int hashCode() {
            return this.f23247a.hashCode();
        }

        public final String toString() {
            return a.h("OnShoppingModeSelectorRedirectResponse(deepLinkUrl=", this.f23247a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$OnShoppingModeSelectorStoreDetailsSection;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnShoppingModeSelectorStoreDetailsSection {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f23248a;

        public OnShoppingModeSelectorStoreDetailsSection(ArrayList arrayList) {
            this.f23248a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnShoppingModeSelectorStoreDetailsSection) && this.f23248a.equals(((OnShoppingModeSelectorStoreDetailsSection) obj).f23248a);
        }

        public final int hashCode() {
            return this.f23248a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("OnShoppingModeSelectorStoreDetailsSection(storeDetails=", ")", this.f23248a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$OnShoppingModeSelectorStoreFeaturesSection;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnShoppingModeSelectorStoreFeaturesSection {

        /* renamed from: a, reason: collision with root package name */
        public final String f23249a;
        public final ArrayList b;

        public OnShoppingModeSelectorStoreFeaturesSection(String str, ArrayList arrayList) {
            this.f23249a = str;
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
            return this.f23249a.equals(onShoppingModeSelectorStoreFeaturesSection.f23249a) && this.b.equals(onShoppingModeSelectorStoreFeaturesSection.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23249a.hashCode() * 31);
        }

        public final String toString() {
            return d.q("OnShoppingModeSelectorStoreFeaturesSection(title=", this.f23249a, ", features=", ")", this.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$SecondaryButton;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SecondaryButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f23250a;
        public final ButtonFragment b;

        public SecondaryButton(String str, ButtonFragment buttonFragment) {
            this.f23250a = str;
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
            return Intrinsics.c(this.f23250a, secondaryButton.f23250a) && Intrinsics.c(this.b, secondaryButton.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23250a.hashCode() * 31);
        }

        public final String toString() {
            return "SecondaryButton(__typename=" + this.f23250a + ", buttonFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$Section;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Section {

        /* renamed from: a, reason: collision with root package name */
        public final String f23251a;
        public final OnShoppingModeSelectorOptionsSection b;
        public final OnShoppingModeSelectorStoreDetailsSection c;
        public final OnShoppingModeSelectorStoreFeaturesSection d;
        public final OnShoppingModeSelectorAddressInfoSection e;

        public Section(String __typename, OnShoppingModeSelectorOptionsSection onShoppingModeSelectorOptionsSection, OnShoppingModeSelectorStoreDetailsSection onShoppingModeSelectorStoreDetailsSection, OnShoppingModeSelectorStoreFeaturesSection onShoppingModeSelectorStoreFeaturesSection, OnShoppingModeSelectorAddressInfoSection onShoppingModeSelectorAddressInfoSection) {
            Intrinsics.h(__typename, "__typename");
            this.f23251a = __typename;
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
            return Intrinsics.c(this.f23251a, section.f23251a) && Intrinsics.c(this.b, section.b) && Intrinsics.c(this.c, section.c) && Intrinsics.c(this.d, section.d) && Intrinsics.c(this.e, section.e);
        }

        public final int hashCode() {
            int iHashCode = this.f23251a.hashCode() * 31;
            OnShoppingModeSelectorOptionsSection onShoppingModeSelectorOptionsSection = this.b;
            int iHashCode2 = (iHashCode + (onShoppingModeSelectorOptionsSection == null ? 0 : onShoppingModeSelectorOptionsSection.hashCode())) * 31;
            OnShoppingModeSelectorStoreDetailsSection onShoppingModeSelectorStoreDetailsSection = this.c;
            int iHashCode3 = (iHashCode2 + (onShoppingModeSelectorStoreDetailsSection == null ? 0 : onShoppingModeSelectorStoreDetailsSection.f23248a.hashCode())) * 31;
            OnShoppingModeSelectorStoreFeaturesSection onShoppingModeSelectorStoreFeaturesSection = this.d;
            int iHashCode4 = (iHashCode3 + (onShoppingModeSelectorStoreFeaturesSection == null ? 0 : onShoppingModeSelectorStoreFeaturesSection.hashCode())) * 31;
            OnShoppingModeSelectorAddressInfoSection onShoppingModeSelectorAddressInfoSection = this.e;
            return iHashCode4 + (onShoppingModeSelectorAddressInfoSection != null ? onShoppingModeSelectorAddressInfoSection.hashCode() : 0);
        }

        public final String toString() {
            return "Section(__typename=" + this.f23251a + ", onShoppingModeSelectorOptionsSection=" + this.b + ", onShoppingModeSelectorStoreDetailsSection=" + this.c + ", onShoppingModeSelectorStoreFeaturesSection=" + this.d + ", onShoppingModeSelectorAddressInfoSection=" + this.e + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$SetShoppingMode;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SetShoppingMode {

        /* renamed from: a, reason: collision with root package name */
        public final String f23252a;
        public final OnShoppingModeSelector b;
        public final OnShoppingModeSelectorErrorResponse c;
        public final OnShoppingModeSelectorRedirectResponse d;

        public SetShoppingMode(String __typename, OnShoppingModeSelector onShoppingModeSelector, OnShoppingModeSelectorErrorResponse onShoppingModeSelectorErrorResponse, OnShoppingModeSelectorRedirectResponse onShoppingModeSelectorRedirectResponse) {
            Intrinsics.h(__typename, "__typename");
            this.f23252a = __typename;
            this.b = onShoppingModeSelector;
            this.c = onShoppingModeSelectorErrorResponse;
            this.d = onShoppingModeSelectorRedirectResponse;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetShoppingMode)) {
                return false;
            }
            SetShoppingMode setShoppingMode = (SetShoppingMode) obj;
            return Intrinsics.c(this.f23252a, setShoppingMode.f23252a) && Intrinsics.c(this.b, setShoppingMode.b) && Intrinsics.c(this.c, setShoppingMode.c) && Intrinsics.c(this.d, setShoppingMode.d);
        }

        public final int hashCode() {
            int iHashCode = this.f23252a.hashCode() * 31;
            OnShoppingModeSelector onShoppingModeSelector = this.b;
            int iHashCode2 = (iHashCode + (onShoppingModeSelector == null ? 0 : onShoppingModeSelector.hashCode())) * 31;
            OnShoppingModeSelectorErrorResponse onShoppingModeSelectorErrorResponse = this.c;
            int iHashCode3 = (iHashCode2 + (onShoppingModeSelectorErrorResponse == null ? 0 : onShoppingModeSelectorErrorResponse.hashCode())) * 31;
            OnShoppingModeSelectorRedirectResponse onShoppingModeSelectorRedirectResponse = this.d;
            return iHashCode3 + (onShoppingModeSelectorRedirectResponse != null ? onShoppingModeSelectorRedirectResponse.f23247a.hashCode() : 0);
        }

        public final String toString() {
            return "SetShoppingMode(__typename=" + this.f23252a + ", onShoppingModeSelector=" + this.b + ", onShoppingModeSelectorErrorResponse=" + this.c + ", onShoppingModeSelectorRedirectResponse=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$ShoppingModeDetails;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShoppingModeDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f23253a;
        public final ShoppingModeDetailsFragment b;

        public ShoppingModeDetails(String str, ShoppingModeDetailsFragment shoppingModeDetailsFragment) {
            this.f23253a = str;
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
            return Intrinsics.c(this.f23253a, shoppingModeDetails.f23253a) && Intrinsics.c(this.b, shoppingModeDetails.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23253a.hashCode() * 31);
        }

        public final String toString() {
            return "ShoppingModeDetails(__typename=" + this.f23253a + ", shoppingModeDetailsFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$StoreDetail;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StoreDetail {

        /* renamed from: a, reason: collision with root package name */
        public final Image1 f23254a;
        public final String b;
        public final String c;
        public final Button1 d;

        public StoreDetail(Image1 image1, String str, String str2, Button1 button1) {
            this.f23254a = image1;
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
            return Intrinsics.c(this.f23254a, storeDetail.f23254a) && Intrinsics.c(this.b, storeDetail.b) && Intrinsics.c(this.c, storeDetail.c) && Intrinsics.c(this.d, storeDetail.d);
        }

        public final int hashCode() {
            Image1 image1 = this.f23254a;
            int iHashCode = (image1 == null ? 0 : image1.hashCode()) * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Button1 button1 = this.d;
            return iHashCode3 + (button1 != null ? button1.hashCode() : 0);
        }

        public final String toString() {
            return "StoreDetail(image=" + this.f23254a + ", title=" + this.b + ", subtitle=" + this.c + ", button=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$V1AddressDetails;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class V1AddressDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f23255a;
        public final OnModeSelectorV1AddressDetailsDelivery b;
        public final OnModeSelectorV1AddressDetailsPickup c;

        public V1AddressDetails(String __typename, OnModeSelectorV1AddressDetailsDelivery onModeSelectorV1AddressDetailsDelivery, OnModeSelectorV1AddressDetailsPickup onModeSelectorV1AddressDetailsPickup) {
            Intrinsics.h(__typename, "__typename");
            this.f23255a = __typename;
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
            return Intrinsics.c(this.f23255a, v1AddressDetails.f23255a) && Intrinsics.c(this.b, v1AddressDetails.b) && Intrinsics.c(this.c, v1AddressDetails.c);
        }

        public final int hashCode() {
            int iHashCode = this.f23255a.hashCode() * 31;
            OnModeSelectorV1AddressDetailsDelivery onModeSelectorV1AddressDetailsDelivery = this.b;
            int iHashCode2 = (iHashCode + (onModeSelectorV1AddressDetailsDelivery == null ? 0 : onModeSelectorV1AddressDetailsDelivery.hashCode())) * 31;
            OnModeSelectorV1AddressDetailsPickup onModeSelectorV1AddressDetailsPickup = this.c;
            return iHashCode2 + (onModeSelectorV1AddressDetailsPickup != null ? onModeSelectorV1AddressDetailsPickup.hashCode() : 0);
        }

        public final String toString() {
            return "V1AddressDetails(__typename=" + this.f23255a + ", onModeSelectorV1AddressDetailsDelivery=" + this.b + ", onModeSelectorV1AddressDetailsPickup=" + this.c + ")";
        }
    }

    public SetShoppingModeMutation(String shoppingModeId, Optional.Present present, Optional.Present present2, boolean z, Optional.Present present3, boolean z2) {
        Intrinsics.h(shoppingModeId, "shoppingModeId");
        this.f23224a = shoppingModeId;
        this.b = present;
        this.c = present2;
        this.d = z;
        this.e = present3;
        this.f = z2;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(SetShoppingModeMutation_ResponseAdapter.Data.f23292a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation SetShoppingMode($shoppingModeId: ID!, $storeId: ID, $storeAddressId: ID, $includeInstoreUplift: Boolean!, $geoLocation: GeoLocation, $includeServiceFees: Boolean!) { setShoppingMode(id: $shoppingModeId, storeId: $storeId, storeAddressId: $storeAddressId, geoLocation: $geoLocation) { __typename ... on ShoppingModeSelector { header { buttons { id isSelected title } image { __typename ...downloadableAssetFragment } } sections { __typename ... on ShoppingModeSelectorOptionsSection @skip(if: $includeInstoreUplift) { optionTitle: title items { __typename ...itemFragment fulfilment { __typename ... on DividerCard { value: _ } ... on Button { __typename ...buttonFragment } } badge { label type } conditions { label type } } footnote disclaimer @include(if: $includeServiceFees) } ... on ShoppingModeSelectorStoreDetailsSection @include(if: $includeInstoreUplift) { storeDetails { image { __typename ...downloadableAssetFragment } title subtitle button { __typename ...buttonFragment } } } ... on ShoppingModeSelectorStoreFeaturesSection @include(if: $includeInstoreUplift) { title features { title imageUrl } } ... on ShoppingModeSelectorAddressInfoSection { addressTitle: title details { shoppingModeDetails { __typename ...shoppingModeDetailsFragment } image { __typename ...downloadableAssetFragment } title subtitle button { __typename ...buttonFragment } v1AddressDetails { __typename ... on ModeSelectorV1AddressDetailsDelivery { __typename ...modeSelectorV1AddressDetailsDeliveryFragment } ... on ModeSelectorV1AddressDetailsPickup { __typename ...modeSelectorV1AddressDetailsPickupFragment } } secondaryButton @include(if: $includeInstoreUplift) { __typename ...buttonFragment } } } } } ... on ShoppingModeSelectorErrorResponse { deep: deepLinkUrl message } ... on ShoppingModeSelectorRedirectResponse { deepLinkUrl } } }  fragment downloadableAssetFragment on DownloadableAsset { assetType assetUrl assetWidth assetHeight fit altText }  fragment itemFragment on ShoppingModeSelectorOption { id price subtitle title state }  fragment buttonFragment on Button { label style enabled action url iconUrl altText analytics { label } }  fragment shoppingModeDetailsFragment on ShoppingModeDetails { displayName mode storeAddressId }  fragment modeSelectorV1AddressDetailsDeliveryFragment on ModeSelectorV1AddressDetailsDelivery { modeId addressId addressText isPrimary postcode street1 street2 suburbId suburbName }  fragment modeSelectorV1AddressDetailsPickupFragment on ModeSelectorV1AddressDetailsPickup { modeId storeId addressId addressText displayName label }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetShoppingModeMutation)) {
            return false;
        }
        SetShoppingModeMutation setShoppingModeMutation = (SetShoppingModeMutation) obj;
        return Intrinsics.c(this.f23224a, setShoppingModeMutation.f23224a) && this.b.equals(setShoppingModeMutation.b) && this.c.equals(setShoppingModeMutation.c) && this.d == setShoppingModeMutation.d && this.e.equals(setShoppingModeMutation.e) && this.f == setShoppingModeMutation.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.b(this.e, b.e(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.b(this.c, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.b(this.b, this.f23224a.hashCode() * 31, 31), 31), 31, this.d), 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "ded9ff36a01bee655f0665be29cdf826400830c3aef8d953183fc6e7d013be13";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "SetShoppingMode";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("shoppingModeId");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f23224a);
        jsonWriter.F1("storeId");
        NullableAdapter nullableAdapter = Adapters.i;
        Adapters.d(nullableAdapter).toJson(jsonWriter, customScalarAdapters, this.b);
        jsonWriter.F1("storeAddressId");
        Adapters.d(nullableAdapter).toJson(jsonWriter, customScalarAdapters, this.c);
        jsonWriter.F1("includeInstoreUplift");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        d.B(this.d, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "geoLocation");
        Adapters.d(Adapters.b(Adapters.c(GeoLocation_InputAdapter.f12077a, false))).toJson(jsonWriter, customScalarAdapters, this.e);
        jsonWriter.F1("includeServiceFees");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.f));
    }

    public final String toString() {
        return "SetShoppingModeMutation(shoppingModeId=" + this.f23224a + ", storeId=" + this.b + ", storeAddressId=" + this.c + ", includeInstoreUplift=" + this.d + ", geoLocation=" + this.e + ", includeServiceFees=" + this.f + ")";
    }
}
