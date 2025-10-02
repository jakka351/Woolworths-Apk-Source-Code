package com.woolworths.shop.modeselector.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.BadgeType;
import au.com.woolworths.shop.graphql.type.adapter.BadgeType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpression;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.woolworths.shop.modeselector.ShoppingModeSelectorQuery;
import com.woolworths.shop.modeselector.fragment.ButtonFragment;
import com.woolworths.shop.modeselector.fragment.ButtonFragmentImpl_ResponseAdapter;
import com.woolworths.shop.modeselector.fragment.DownloadableAssetFragment;
import com.woolworths.shop.modeselector.fragment.DownloadableAssetFragmentImpl_ResponseAdapter;
import com.woolworths.shop.modeselector.fragment.ItemFragment;
import com.woolworths.shop.modeselector.fragment.ItemFragmentImpl_ResponseAdapter;
import com.woolworths.shop.modeselector.fragment.ModeSelectorV1AddressDetailsDeliveryFragment;
import com.woolworths.shop.modeselector.fragment.ModeSelectorV1AddressDetailsDeliveryFragmentImpl_ResponseAdapter;
import com.woolworths.shop.modeselector.fragment.ModeSelectorV1AddressDetailsPickupFragment;
import com.woolworths.shop.modeselector.fragment.ModeSelectorV1AddressDetailsPickupFragmentImpl_ResponseAdapter;
import com.woolworths.shop.modeselector.fragment.ShoppingModeDetailsFragment;
import com.woolworths.shop.modeselector.fragment.ShoppingModeDetailsFragmentImpl_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001f\bÇ\u0002\u0018\u00002\u00020\u0001:\u001e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/ShoppingModeSelectorQuery_ResponseAdapter;", "", "Data", "ShoppingModeSelector", "OnShoppingModeSelector", "Header", "Button", "Image", "Section", "OnShoppingModeSelectorOptionsSection", "Item", "Fulfilment", "OnDividerCard", "OnButton", "Badge", "Condition", "OnShoppingModeSelectorStoreDetailsSection", "StoreDetail", "Image1", "Button1", "OnShoppingModeSelectorStoreFeaturesSection", "Feature", "OnShoppingModeSelectorAddressInfoSection", "Details", "ShoppingModeDetails", "Image2", "Button2", "V1AddressDetails", "OnModeSelectorV1AddressDetailsDelivery", "OnModeSelectorV1AddressDetailsPickup", "SecondaryButton", "OnShoppingModeSelectorErrorResponse", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ShoppingModeSelectorQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/ShoppingModeSelectorQuery_ResponseAdapter$Badge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$Badge;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Badge implements Adapter<ShoppingModeSelectorQuery.Badge> {

        /* renamed from: a, reason: collision with root package name */
        public static final Badge f23318a = new Badge();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "type");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            BadgeType badgeTypeA = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    badgeTypeA = BadgeType_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (badgeTypeA != null) {
                return new ShoppingModeSelectorQuery.Badge(str, badgeTypeA);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShoppingModeSelectorQuery.Badge value = (ShoppingModeSelectorQuery.Badge) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23257a);
            writer.F1("type");
            BadgeType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/ShoppingModeSelectorQuery_ResponseAdapter$Button;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$Button;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Button implements Adapter<ShoppingModeSelectorQuery.Button> {

        /* renamed from: a, reason: collision with root package name */
        public static final Button f23319a = new Button();
        public static final List b = CollectionsKt.R("id", "isSelected", "title");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Boolean bool = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            if (bool == null) {
                Assertions.a(reader, "isSelected");
                throw null;
            }
            boolean zBooleanValue = bool.booleanValue();
            if (str2 != null) {
                return new ShoppingModeSelectorQuery.Button(str, str2, zBooleanValue);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShoppingModeSelectorQuery.Button value = (ShoppingModeSelectorQuery.Button) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23258a);
            writer.F1("isSelected");
            d.B(value.b, Adapters.f, writer, customScalarAdapters, "title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/ShoppingModeSelectorQuery_ResponseAdapter$Button1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$Button1;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Button1 implements Adapter<ShoppingModeSelectorQuery.Button1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Button1 f23320a = new Button1();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ButtonFragment buttonFragmentA = ButtonFragmentImpl_ResponseAdapter.ButtonFragment.a(reader, customScalarAdapters);
            if (str != null) {
                return new ShoppingModeSelectorQuery.Button1(str, buttonFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShoppingModeSelectorQuery.Button1 value = (ShoppingModeSelectorQuery.Button1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23259a);
            List list = ButtonFragmentImpl_ResponseAdapter.ButtonFragment.f23351a;
            ButtonFragmentImpl_ResponseAdapter.ButtonFragment.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/ShoppingModeSelectorQuery_ResponseAdapter$Button2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$Button2;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Button2 implements Adapter<ShoppingModeSelectorQuery.Button2> {

        /* renamed from: a, reason: collision with root package name */
        public static final Button2 f23321a = new Button2();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ButtonFragment buttonFragmentA = ButtonFragmentImpl_ResponseAdapter.ButtonFragment.a(reader, customScalarAdapters);
            if (str != null) {
                return new ShoppingModeSelectorQuery.Button2(str, buttonFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShoppingModeSelectorQuery.Button2 value = (ShoppingModeSelectorQuery.Button2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23260a);
            List list = ButtonFragmentImpl_ResponseAdapter.ButtonFragment.f23351a;
            ButtonFragmentImpl_ResponseAdapter.ButtonFragment.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/ShoppingModeSelectorQuery_ResponseAdapter$Condition;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$Condition;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Condition implements Adapter<ShoppingModeSelectorQuery.Condition> {

        /* renamed from: a, reason: collision with root package name */
        public static final Condition f23322a = new Condition();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "type");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            BadgeType badgeTypeA = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    badgeTypeA = BadgeType_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (badgeTypeA != null) {
                return new ShoppingModeSelectorQuery.Condition(str, badgeTypeA);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShoppingModeSelectorQuery.Condition value = (ShoppingModeSelectorQuery.Condition) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23261a);
            writer.F1("type");
            BadgeType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/ShoppingModeSelectorQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$Data;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<ShoppingModeSelectorQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f23323a = new Data();
        public static final List b = CollectionsKt.Q("shoppingModeSelector");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ShoppingModeSelectorQuery.ShoppingModeSelector shoppingModeSelector = null;
            while (reader.o2(b) == 0) {
                shoppingModeSelector = (ShoppingModeSelectorQuery.ShoppingModeSelector) Adapters.c(ShoppingModeSelector.f23345a, true).fromJson(reader, customScalarAdapters);
            }
            if (shoppingModeSelector != null) {
                return new ShoppingModeSelectorQuery.Data(shoppingModeSelector);
            }
            Assertions.a(reader, "shoppingModeSelector");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShoppingModeSelectorQuery.Data value = (ShoppingModeSelectorQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("shoppingModeSelector");
            Adapters.c(ShoppingModeSelector.f23345a, true).toJson(writer, customScalarAdapters, value.f23262a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/ShoppingModeSelectorQuery_ResponseAdapter$Details;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$Details;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Details implements Adapter<ShoppingModeSelectorQuery.Details> {

        /* renamed from: a, reason: collision with root package name */
        public static final Details f23324a = new Details();
        public static final List b = CollectionsKt.R("shoppingModeDetails", "image", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "button", "v1AddressDetails", "secondaryButton");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ShoppingModeSelectorQuery.ShoppingModeDetails shoppingModeDetails = null;
            ShoppingModeSelectorQuery.Image2 image2 = null;
            String str = null;
            String str2 = null;
            ShoppingModeSelectorQuery.Button2 button2 = null;
            ShoppingModeSelectorQuery.V1AddressDetails v1AddressDetails = null;
            ShoppingModeSelectorQuery.SecondaryButton secondaryButton = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        shoppingModeDetails = (ShoppingModeSelectorQuery.ShoppingModeDetails) Adapters.c(ShoppingModeDetails.f23344a, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        image2 = (ShoppingModeSelectorQuery.Image2) Adapters.b(Adapters.c(Image2.f23330a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        button2 = (ShoppingModeSelectorQuery.Button2) Adapters.c(Button2.f23321a, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        v1AddressDetails = (ShoppingModeSelectorQuery.V1AddressDetails) Adapters.b(Adapters.c(V1AddressDetails.f23347a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        secondaryButton = (ShoppingModeSelectorQuery.SecondaryButton) Adapters.b(Adapters.c(SecondaryButton.f23342a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (shoppingModeDetails == null) {
                            Assertions.a(reader, "shoppingModeDetails");
                            throw null;
                        }
                        if (button2 != null) {
                            return new ShoppingModeSelectorQuery.Details(shoppingModeDetails, image2, str, str2, button2, v1AddressDetails, secondaryButton);
                        }
                        Assertions.a(reader, "button");
                        throw null;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShoppingModeSelectorQuery.Details value = (ShoppingModeSelectorQuery.Details) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("shoppingModeDetails");
            Adapters.c(ShoppingModeDetails.f23344a, true).toJson(writer, customScalarAdapters, value.f23263a);
            writer.F1("image");
            Adapters.b(Adapters.c(Image2.f23330a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("title");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("button");
            Adapters.c(Button2.f23321a, true).toJson(writer, customScalarAdapters, value.e);
            writer.F1("v1AddressDetails");
            Adapters.b(Adapters.c(V1AddressDetails.f23347a, true)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("secondaryButton");
            Adapters.b(Adapters.c(SecondaryButton.f23342a, true)).toJson(writer, customScalarAdapters, value.g);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/ShoppingModeSelectorQuery_ResponseAdapter$Feature;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$Feature;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Feature implements Adapter<ShoppingModeSelectorQuery.Feature> {

        /* renamed from: a, reason: collision with root package name */
        public static final Feature f23325a = new Feature();
        public static final List b = CollectionsKt.R("title", "imageUrl");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 != null) {
                return new ShoppingModeSelectorQuery.Feature(str, str2);
            }
            Assertions.a(reader, "imageUrl");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShoppingModeSelectorQuery.Feature value = (ShoppingModeSelectorQuery.Feature) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23264a);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/ShoppingModeSelectorQuery_ResponseAdapter$Fulfilment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$Fulfilment;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Fulfilment implements Adapter<ShoppingModeSelectorQuery.Fulfilment> {

        /* renamed from: a, reason: collision with root package name */
        public static final Fulfilment f23326a = new Fulfilment();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            ShoppingModeSelectorQuery.OnDividerCard onDividerCardA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ShoppingModeSelectorQuery.OnButton onButtonA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("DividerCard"))) {
                reader.o();
                onDividerCardA = OnDividerCard.a(reader, customScalarAdapters);
            } else {
                onDividerCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("Button"))) {
                reader.o();
                onButtonA = OnButton.a(reader, customScalarAdapters);
            }
            return new ShoppingModeSelectorQuery.Fulfilment(str, onDividerCardA, onButtonA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShoppingModeSelectorQuery.Fulfilment value = (ShoppingModeSelectorQuery.Fulfilment) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23265a);
            ShoppingModeSelectorQuery.OnDividerCard onDividerCard = value.b;
            if (onDividerCard != null) {
                List list = OnDividerCard.f23333a;
                writer.F1("value");
                Adapters.l.toJson(writer, customScalarAdapters, onDividerCard.f23272a);
            }
            ShoppingModeSelectorQuery.OnButton onButton = value.c;
            if (onButton != null) {
                OnButton.b(writer, customScalarAdapters, onButton);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/ShoppingModeSelectorQuery_ResponseAdapter$Header;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$Header;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Header implements Adapter<ShoppingModeSelectorQuery.Header> {

        /* renamed from: a, reason: collision with root package name */
        public static final Header f23327a = new Header();
        public static final List b = CollectionsKt.R("buttons", "image");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            ShoppingModeSelectorQuery.Image image = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    arrayListFromJson = Adapters.a(Adapters.c(Button.f23319a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    image = (ShoppingModeSelectorQuery.Image) Adapters.c(Image.f23328a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "buttons");
                throw null;
            }
            if (image != null) {
                return new ShoppingModeSelectorQuery.Header(arrayListFromJson, image);
            }
            Assertions.a(reader, "image");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShoppingModeSelectorQuery.Header value = (ShoppingModeSelectorQuery.Header) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("buttons");
            Adapters.a(Adapters.c(Button.f23319a, false)).toJson(writer, customScalarAdapters, value.f23266a);
            writer.F1("image");
            Adapters.c(Image.f23328a, true).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/ShoppingModeSelectorQuery_ResponseAdapter$Image;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$Image;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Image implements Adapter<ShoppingModeSelectorQuery.Image> {

        /* renamed from: a, reason: collision with root package name */
        public static final Image f23328a = new Image();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            DownloadableAssetFragment downloadableAssetFragmentA = DownloadableAssetFragmentImpl_ResponseAdapter.DownloadableAssetFragment.a(reader, customScalarAdapters);
            if (str != null) {
                return new ShoppingModeSelectorQuery.Image(str, downloadableAssetFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShoppingModeSelectorQuery.Image value = (ShoppingModeSelectorQuery.Image) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23267a);
            List list = DownloadableAssetFragmentImpl_ResponseAdapter.DownloadableAssetFragment.f23353a;
            DownloadableAssetFragmentImpl_ResponseAdapter.DownloadableAssetFragment.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/ShoppingModeSelectorQuery_ResponseAdapter$Image1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$Image1;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Image1 implements Adapter<ShoppingModeSelectorQuery.Image1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Image1 f23329a = new Image1();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            DownloadableAssetFragment downloadableAssetFragmentA = DownloadableAssetFragmentImpl_ResponseAdapter.DownloadableAssetFragment.a(reader, customScalarAdapters);
            if (str != null) {
                return new ShoppingModeSelectorQuery.Image1(str, downloadableAssetFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShoppingModeSelectorQuery.Image1 value = (ShoppingModeSelectorQuery.Image1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23268a);
            List list = DownloadableAssetFragmentImpl_ResponseAdapter.DownloadableAssetFragment.f23353a;
            DownloadableAssetFragmentImpl_ResponseAdapter.DownloadableAssetFragment.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/ShoppingModeSelectorQuery_ResponseAdapter$Image2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$Image2;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Image2 implements Adapter<ShoppingModeSelectorQuery.Image2> {

        /* renamed from: a, reason: collision with root package name */
        public static final Image2 f23330a = new Image2();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            DownloadableAssetFragment downloadableAssetFragmentA = DownloadableAssetFragmentImpl_ResponseAdapter.DownloadableAssetFragment.a(reader, customScalarAdapters);
            if (str != null) {
                return new ShoppingModeSelectorQuery.Image2(str, downloadableAssetFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShoppingModeSelectorQuery.Image2 value = (ShoppingModeSelectorQuery.Image2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23269a);
            List list = DownloadableAssetFragmentImpl_ResponseAdapter.DownloadableAssetFragment.f23353a;
            DownloadableAssetFragmentImpl_ResponseAdapter.DownloadableAssetFragment.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/ShoppingModeSelectorQuery_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$Item;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<ShoppingModeSelectorQuery.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f23331a = new Item();
        public static final List b = CollectionsKt.R("__typename", "fulfilment", "badge", "conditions");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            List list = null;
            ShoppingModeSelectorQuery.Badge badge = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    list = (List) Adapters.b(Adapters.a(Adapters.c(Fulfilment.f23326a, true))).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    badge = (ShoppingModeSelectorQuery.Badge) Adapters.b(Adapters.c(Badge.f23318a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Condition.f23322a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            reader.o();
            ItemFragment itemFragmentA = ItemFragmentImpl_ResponseAdapter.ItemFragment.a(reader, customScalarAdapters);
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new ShoppingModeSelectorQuery.Item(str, list, badge, arrayListFromJson, itemFragmentA);
            }
            Assertions.a(reader, "conditions");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShoppingModeSelectorQuery.Item value = (ShoppingModeSelectorQuery.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23270a);
            writer.F1("fulfilment");
            Adapters.b(Adapters.a(Adapters.c(Fulfilment.f23326a, true))).toJson(writer, customScalarAdapters, value.b);
            writer.F1("badge");
            Adapters.b(Adapters.c(Badge.f23318a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("conditions");
            Adapters.a(Adapters.c(Condition.f23322a, false)).toJson(writer, customScalarAdapters, value.d);
            List list = ItemFragmentImpl_ResponseAdapter.ItemFragment.f23355a;
            ItemFragmentImpl_ResponseAdapter.ItemFragment.b(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/ShoppingModeSelectorQuery_ResponseAdapter$OnButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$OnButton;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnButton implements Adapter<ShoppingModeSelectorQuery.OnButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23332a = CollectionsKt.Q("__typename");

        public static ShoppingModeSelectorQuery.OnButton a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23332a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ButtonFragment buttonFragmentA = ButtonFragmentImpl_ResponseAdapter.ButtonFragment.a(reader, customScalarAdapters);
            if (str != null) {
                return new ShoppingModeSelectorQuery.OnButton(str, buttonFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ShoppingModeSelectorQuery.OnButton value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23271a);
            List list = ButtonFragmentImpl_ResponseAdapter.ButtonFragment.f23351a;
            ButtonFragmentImpl_ResponseAdapter.ButtonFragment.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ShoppingModeSelectorQuery.OnButton) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/ShoppingModeSelectorQuery_ResponseAdapter$OnDividerCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$OnDividerCard;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnDividerCard implements Adapter<ShoppingModeSelectorQuery.OnDividerCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23333a = CollectionsKt.Q("value");

        public static ShoppingModeSelectorQuery.OnDividerCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            while (reader.o2(f23333a) == 0) {
                bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
            }
            return new ShoppingModeSelectorQuery.OnDividerCard(bool);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShoppingModeSelectorQuery.OnDividerCard value = (ShoppingModeSelectorQuery.OnDividerCard) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("value");
            Adapters.l.toJson(writer, customScalarAdapters, value.f23272a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/ShoppingModeSelectorQuery_ResponseAdapter$OnModeSelectorV1AddressDetailsDelivery;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$OnModeSelectorV1AddressDetailsDelivery;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnModeSelectorV1AddressDetailsDelivery implements Adapter<ShoppingModeSelectorQuery.OnModeSelectorV1AddressDetailsDelivery> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23334a = CollectionsKt.Q("__typename");

        public static ShoppingModeSelectorQuery.OnModeSelectorV1AddressDetailsDelivery a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23334a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ModeSelectorV1AddressDetailsDeliveryFragment modeSelectorV1AddressDetailsDeliveryFragmentA = ModeSelectorV1AddressDetailsDeliveryFragmentImpl_ResponseAdapter.ModeSelectorV1AddressDetailsDeliveryFragment.a(reader, customScalarAdapters);
            if (str != null) {
                return new ShoppingModeSelectorQuery.OnModeSelectorV1AddressDetailsDelivery(str, modeSelectorV1AddressDetailsDeliveryFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ShoppingModeSelectorQuery.OnModeSelectorV1AddressDetailsDelivery value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23273a);
            List list = ModeSelectorV1AddressDetailsDeliveryFragmentImpl_ResponseAdapter.ModeSelectorV1AddressDetailsDeliveryFragment.f23357a;
            ModeSelectorV1AddressDetailsDeliveryFragmentImpl_ResponseAdapter.ModeSelectorV1AddressDetailsDeliveryFragment.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ShoppingModeSelectorQuery.OnModeSelectorV1AddressDetailsDelivery) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/ShoppingModeSelectorQuery_ResponseAdapter$OnModeSelectorV1AddressDetailsPickup;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$OnModeSelectorV1AddressDetailsPickup;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnModeSelectorV1AddressDetailsPickup implements Adapter<ShoppingModeSelectorQuery.OnModeSelectorV1AddressDetailsPickup> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23335a = CollectionsKt.Q("__typename");

        public static ShoppingModeSelectorQuery.OnModeSelectorV1AddressDetailsPickup a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23335a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ModeSelectorV1AddressDetailsPickupFragment modeSelectorV1AddressDetailsPickupFragmentA = ModeSelectorV1AddressDetailsPickupFragmentImpl_ResponseAdapter.ModeSelectorV1AddressDetailsPickupFragment.a(reader, customScalarAdapters);
            if (str != null) {
                return new ShoppingModeSelectorQuery.OnModeSelectorV1AddressDetailsPickup(str, modeSelectorV1AddressDetailsPickupFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ShoppingModeSelectorQuery.OnModeSelectorV1AddressDetailsPickup value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23274a);
            List list = ModeSelectorV1AddressDetailsPickupFragmentImpl_ResponseAdapter.ModeSelectorV1AddressDetailsPickupFragment.f23359a;
            ModeSelectorV1AddressDetailsPickupFragmentImpl_ResponseAdapter.ModeSelectorV1AddressDetailsPickupFragment.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ShoppingModeSelectorQuery.OnModeSelectorV1AddressDetailsPickup) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/ShoppingModeSelectorQuery_ResponseAdapter$OnShoppingModeSelector;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$OnShoppingModeSelector;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnShoppingModeSelector implements Adapter<ShoppingModeSelectorQuery.OnShoppingModeSelector> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23336a = CollectionsKt.R("header", "sections");

        public static ShoppingModeSelectorQuery.OnShoppingModeSelector a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ShoppingModeSelectorQuery.Header header = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f23336a);
                if (iO2 == 0) {
                    header = (ShoppingModeSelectorQuery.Header) Adapters.c(Header.f23327a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Section.f23343a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (header == null) {
                Assertions.a(reader, "header");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new ShoppingModeSelectorQuery.OnShoppingModeSelector(header, arrayListFromJson);
            }
            Assertions.a(reader, "sections");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ShoppingModeSelectorQuery.OnShoppingModeSelector value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("header");
            Adapters.c(Header.f23327a, false).toJson(writer, customScalarAdapters, value.f23275a);
            writer.F1("sections");
            Adapters.a(Adapters.c(Section.f23343a, true)).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ShoppingModeSelectorQuery.OnShoppingModeSelector) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/ShoppingModeSelectorQuery_ResponseAdapter$OnShoppingModeSelectorAddressInfoSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$OnShoppingModeSelectorAddressInfoSection;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnShoppingModeSelectorAddressInfoSection implements Adapter<ShoppingModeSelectorQuery.OnShoppingModeSelectorAddressInfoSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23337a = CollectionsKt.R("addressTitle", ErrorBundle.DETAIL_ENTRY);

        public static ShoppingModeSelectorQuery.OnShoppingModeSelectorAddressInfoSection a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ShoppingModeSelectorQuery.Details details = null;
            while (true) {
                int iO2 = reader.o2(f23337a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    details = (ShoppingModeSelectorQuery.Details) Adapters.c(Details.f23324a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "addressTitle");
                throw null;
            }
            if (details != null) {
                return new ShoppingModeSelectorQuery.OnShoppingModeSelectorAddressInfoSection(str, details);
            }
            Assertions.a(reader, ErrorBundle.DETAIL_ENTRY);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ShoppingModeSelectorQuery.OnShoppingModeSelectorAddressInfoSection value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("addressTitle");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23276a);
            writer.F1(ErrorBundle.DETAIL_ENTRY);
            Adapters.c(Details.f23324a, false).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ShoppingModeSelectorQuery.OnShoppingModeSelectorAddressInfoSection) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/ShoppingModeSelectorQuery_ResponseAdapter$OnShoppingModeSelectorErrorResponse;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$OnShoppingModeSelectorErrorResponse;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnShoppingModeSelectorErrorResponse implements Adapter<ShoppingModeSelectorQuery.OnShoppingModeSelectorErrorResponse> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23338a = CollectionsKt.R("deep", "message");

        public static ShoppingModeSelectorQuery.OnShoppingModeSelectorErrorResponse a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f23338a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 != null) {
                return new ShoppingModeSelectorQuery.OnShoppingModeSelectorErrorResponse(str, str2);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ShoppingModeSelectorQuery.OnShoppingModeSelectorErrorResponse value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("deep");
            Adapters.i.toJson(writer, customScalarAdapters, value.f23277a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ShoppingModeSelectorQuery.OnShoppingModeSelectorErrorResponse) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/ShoppingModeSelectorQuery_ResponseAdapter$OnShoppingModeSelectorOptionsSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$OnShoppingModeSelectorOptionsSection;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnShoppingModeSelectorOptionsSection implements Adapter<ShoppingModeSelectorQuery.OnShoppingModeSelectorOptionsSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23339a = CollectionsKt.R("optionTitle", "items", "footnote", "disclaimer");

        public static ShoppingModeSelectorQuery.OnShoppingModeSelectorOptionsSection a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(f23339a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson = Adapters.a(Adapters.c(Item.f23331a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new ShoppingModeSelectorQuery.OnShoppingModeSelectorOptionsSection(str, str2, str3, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ShoppingModeSelectorQuery.OnShoppingModeSelectorOptionsSection value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("optionTitle");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f23278a);
            writer.F1("items");
            Adapters.a(Adapters.c(Item.f23331a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("footnote");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("disclaimer");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ShoppingModeSelectorQuery.OnShoppingModeSelectorOptionsSection) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/ShoppingModeSelectorQuery_ResponseAdapter$OnShoppingModeSelectorStoreDetailsSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$OnShoppingModeSelectorStoreDetailsSection;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnShoppingModeSelectorStoreDetailsSection implements Adapter<ShoppingModeSelectorQuery.OnShoppingModeSelectorStoreDetailsSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23340a = CollectionsKt.Q("storeDetails");

        public static ShoppingModeSelectorQuery.OnShoppingModeSelectorStoreDetailsSection a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(f23340a) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(StoreDetail.f23346a, false)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new ShoppingModeSelectorQuery.OnShoppingModeSelectorStoreDetailsSection(arrayListFromJson);
            }
            Assertions.a(reader, "storeDetails");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ShoppingModeSelectorQuery.OnShoppingModeSelectorStoreDetailsSection value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("storeDetails");
            Adapters.a(Adapters.c(StoreDetail.f23346a, false)).toJson(writer, customScalarAdapters, value.f23279a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ShoppingModeSelectorQuery.OnShoppingModeSelectorStoreDetailsSection) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/ShoppingModeSelectorQuery_ResponseAdapter$OnShoppingModeSelectorStoreFeaturesSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$OnShoppingModeSelectorStoreFeaturesSection;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnShoppingModeSelectorStoreFeaturesSection implements Adapter<ShoppingModeSelectorQuery.OnShoppingModeSelectorStoreFeaturesSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23341a = CollectionsKt.R("title", "features");

        public static ShoppingModeSelectorQuery.OnShoppingModeSelectorStoreFeaturesSection a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f23341a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Feature.f23325a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new ShoppingModeSelectorQuery.OnShoppingModeSelectorStoreFeaturesSection(str, arrayListFromJson);
            }
            Assertions.a(reader, "features");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ShoppingModeSelectorQuery.OnShoppingModeSelectorStoreFeaturesSection value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23280a);
            writer.F1("features");
            Adapters.a(Adapters.c(Feature.f23325a, false)).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ShoppingModeSelectorQuery.OnShoppingModeSelectorStoreFeaturesSection) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/ShoppingModeSelectorQuery_ResponseAdapter$SecondaryButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$SecondaryButton;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SecondaryButton implements Adapter<ShoppingModeSelectorQuery.SecondaryButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final SecondaryButton f23342a = new SecondaryButton();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ButtonFragment buttonFragmentA = ButtonFragmentImpl_ResponseAdapter.ButtonFragment.a(reader, customScalarAdapters);
            if (str != null) {
                return new ShoppingModeSelectorQuery.SecondaryButton(str, buttonFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShoppingModeSelectorQuery.SecondaryButton value = (ShoppingModeSelectorQuery.SecondaryButton) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23281a);
            List list = ButtonFragmentImpl_ResponseAdapter.ButtonFragment.f23351a;
            ButtonFragmentImpl_ResponseAdapter.ButtonFragment.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/ShoppingModeSelectorQuery_ResponseAdapter$Section;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$Section;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Section implements Adapter<ShoppingModeSelectorQuery.Section> {

        /* renamed from: a, reason: collision with root package name */
        public static final Section f23343a = new Section();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            ShoppingModeSelectorQuery.OnShoppingModeSelectorOptionsSection onShoppingModeSelectorOptionsSectionA;
            ShoppingModeSelectorQuery.OnShoppingModeSelectorStoreDetailsSection onShoppingModeSelectorStoreDetailsSectionA;
            ShoppingModeSelectorQuery.OnShoppingModeSelectorStoreFeaturesSection onShoppingModeSelectorStoreFeaturesSectionA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ShoppingModeSelectorQuery.OnShoppingModeSelectorAddressInfoSection onShoppingModeSelectorAddressInfoSectionA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("ShoppingModeSelectorOptionsSection"), new BooleanExpression.Not(BooleanExpressions.d("includeInstoreUplift"))))) {
                reader.o();
                onShoppingModeSelectorOptionsSectionA = OnShoppingModeSelectorOptionsSection.a(reader, customScalarAdapters);
            } else {
                onShoppingModeSelectorOptionsSectionA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("ShoppingModeSelectorStoreDetailsSection"), BooleanExpressions.d("includeInstoreUplift")))) {
                reader.o();
                onShoppingModeSelectorStoreDetailsSectionA = OnShoppingModeSelectorStoreDetailsSection.a(reader, customScalarAdapters);
            } else {
                onShoppingModeSelectorStoreDetailsSectionA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("ShoppingModeSelectorStoreFeaturesSection"), BooleanExpressions.d("includeInstoreUplift")))) {
                reader.o();
                onShoppingModeSelectorStoreFeaturesSectionA = OnShoppingModeSelectorStoreFeaturesSection.a(reader, customScalarAdapters);
            } else {
                onShoppingModeSelectorStoreFeaturesSectionA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ShoppingModeSelectorAddressInfoSection"))) {
                reader.o();
                onShoppingModeSelectorAddressInfoSectionA = OnShoppingModeSelectorAddressInfoSection.a(reader, customScalarAdapters);
            }
            return new ShoppingModeSelectorQuery.Section(str, onShoppingModeSelectorOptionsSectionA, onShoppingModeSelectorStoreDetailsSectionA, onShoppingModeSelectorStoreFeaturesSectionA, onShoppingModeSelectorAddressInfoSectionA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShoppingModeSelectorQuery.Section value = (ShoppingModeSelectorQuery.Section) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23282a);
            ShoppingModeSelectorQuery.OnShoppingModeSelectorOptionsSection onShoppingModeSelectorOptionsSection = value.b;
            if (onShoppingModeSelectorOptionsSection != null) {
                OnShoppingModeSelectorOptionsSection.b(writer, customScalarAdapters, onShoppingModeSelectorOptionsSection);
            }
            ShoppingModeSelectorQuery.OnShoppingModeSelectorStoreDetailsSection onShoppingModeSelectorStoreDetailsSection = value.c;
            if (onShoppingModeSelectorStoreDetailsSection != null) {
                OnShoppingModeSelectorStoreDetailsSection.b(writer, customScalarAdapters, onShoppingModeSelectorStoreDetailsSection);
            }
            ShoppingModeSelectorQuery.OnShoppingModeSelectorStoreFeaturesSection onShoppingModeSelectorStoreFeaturesSection = value.d;
            if (onShoppingModeSelectorStoreFeaturesSection != null) {
                OnShoppingModeSelectorStoreFeaturesSection.b(writer, customScalarAdapters, onShoppingModeSelectorStoreFeaturesSection);
            }
            ShoppingModeSelectorQuery.OnShoppingModeSelectorAddressInfoSection onShoppingModeSelectorAddressInfoSection = value.e;
            if (onShoppingModeSelectorAddressInfoSection != null) {
                OnShoppingModeSelectorAddressInfoSection.b(writer, customScalarAdapters, onShoppingModeSelectorAddressInfoSection);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/ShoppingModeSelectorQuery_ResponseAdapter$ShoppingModeDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$ShoppingModeDetails;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShoppingModeDetails implements Adapter<ShoppingModeSelectorQuery.ShoppingModeDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final ShoppingModeDetails f23344a = new ShoppingModeDetails();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ShoppingModeDetailsFragment shoppingModeDetailsFragmentA = ShoppingModeDetailsFragmentImpl_ResponseAdapter.ShoppingModeDetailsFragment.a(reader, customScalarAdapters);
            if (str != null) {
                return new ShoppingModeSelectorQuery.ShoppingModeDetails(str, shoppingModeDetailsFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShoppingModeSelectorQuery.ShoppingModeDetails value = (ShoppingModeSelectorQuery.ShoppingModeDetails) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23283a);
            List list = ShoppingModeDetailsFragmentImpl_ResponseAdapter.ShoppingModeDetailsFragment.f23361a;
            ShoppingModeDetailsFragmentImpl_ResponseAdapter.ShoppingModeDetailsFragment.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/ShoppingModeSelectorQuery_ResponseAdapter$ShoppingModeSelector;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$ShoppingModeSelector;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShoppingModeSelector implements Adapter<ShoppingModeSelectorQuery.ShoppingModeSelector> {

        /* renamed from: a, reason: collision with root package name */
        public static final ShoppingModeSelector f23345a = new ShoppingModeSelector();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            ShoppingModeSelectorQuery.OnShoppingModeSelector onShoppingModeSelectorA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ShoppingModeSelectorQuery.OnShoppingModeSelectorErrorResponse onShoppingModeSelectorErrorResponseA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ShoppingModeSelector"))) {
                reader.o();
                onShoppingModeSelectorA = OnShoppingModeSelector.a(reader, customScalarAdapters);
            } else {
                onShoppingModeSelectorA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ShoppingModeSelectorErrorResponse"))) {
                reader.o();
                onShoppingModeSelectorErrorResponseA = OnShoppingModeSelectorErrorResponse.a(reader, customScalarAdapters);
            }
            return new ShoppingModeSelectorQuery.ShoppingModeSelector(str, onShoppingModeSelectorA, onShoppingModeSelectorErrorResponseA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShoppingModeSelectorQuery.ShoppingModeSelector value = (ShoppingModeSelectorQuery.ShoppingModeSelector) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23284a);
            ShoppingModeSelectorQuery.OnShoppingModeSelector onShoppingModeSelector = value.b;
            if (onShoppingModeSelector != null) {
                OnShoppingModeSelector.b(writer, customScalarAdapters, onShoppingModeSelector);
            }
            ShoppingModeSelectorQuery.OnShoppingModeSelectorErrorResponse onShoppingModeSelectorErrorResponse = value.c;
            if (onShoppingModeSelectorErrorResponse != null) {
                OnShoppingModeSelectorErrorResponse.b(writer, customScalarAdapters, onShoppingModeSelectorErrorResponse);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/ShoppingModeSelectorQuery_ResponseAdapter$StoreDetail;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$StoreDetail;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StoreDetail implements Adapter<ShoppingModeSelectorQuery.StoreDetail> {

        /* renamed from: a, reason: collision with root package name */
        public static final StoreDetail f23346a = new StoreDetail();
        public static final List b = CollectionsKt.R("image", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "button");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ShoppingModeSelectorQuery.Image1 image1 = null;
            String str = null;
            String str2 = null;
            ShoppingModeSelectorQuery.Button1 button1 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    image1 = (ShoppingModeSelectorQuery.Image1) Adapters.b(Adapters.c(Image1.f23329a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        return new ShoppingModeSelectorQuery.StoreDetail(image1, str, str2, button1);
                    }
                    button1 = (ShoppingModeSelectorQuery.Button1) Adapters.b(Adapters.c(Button1.f23320a, true)).fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShoppingModeSelectorQuery.StoreDetail value = (ShoppingModeSelectorQuery.StoreDetail) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("image");
            Adapters.b(Adapters.c(Image1.f23329a, true)).toJson(writer, customScalarAdapters, value.f23285a);
            writer.F1("title");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("button");
            Adapters.b(Adapters.c(Button1.f23320a, true)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/ShoppingModeSelectorQuery_ResponseAdapter$V1AddressDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/ShoppingModeSelectorQuery$V1AddressDetails;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class V1AddressDetails implements Adapter<ShoppingModeSelectorQuery.V1AddressDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final V1AddressDetails f23347a = new V1AddressDetails();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            ShoppingModeSelectorQuery.OnModeSelectorV1AddressDetailsDelivery onModeSelectorV1AddressDetailsDeliveryA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ShoppingModeSelectorQuery.OnModeSelectorV1AddressDetailsPickup onModeSelectorV1AddressDetailsPickupA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ModeSelectorV1AddressDetailsDelivery"))) {
                reader.o();
                onModeSelectorV1AddressDetailsDeliveryA = OnModeSelectorV1AddressDetailsDelivery.a(reader, customScalarAdapters);
            } else {
                onModeSelectorV1AddressDetailsDeliveryA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ModeSelectorV1AddressDetailsPickup"))) {
                reader.o();
                onModeSelectorV1AddressDetailsPickupA = OnModeSelectorV1AddressDetailsPickup.a(reader, customScalarAdapters);
            }
            return new ShoppingModeSelectorQuery.V1AddressDetails(str, onModeSelectorV1AddressDetailsDeliveryA, onModeSelectorV1AddressDetailsPickupA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShoppingModeSelectorQuery.V1AddressDetails value = (ShoppingModeSelectorQuery.V1AddressDetails) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23286a);
            ShoppingModeSelectorQuery.OnModeSelectorV1AddressDetailsDelivery onModeSelectorV1AddressDetailsDelivery = value.b;
            if (onModeSelectorV1AddressDetailsDelivery != null) {
                OnModeSelectorV1AddressDetailsDelivery.b(writer, customScalarAdapters, onModeSelectorV1AddressDetailsDelivery);
            }
            ShoppingModeSelectorQuery.OnModeSelectorV1AddressDetailsPickup onModeSelectorV1AddressDetailsPickup = value.c;
            if (onModeSelectorV1AddressDetailsPickup != null) {
                OnModeSelectorV1AddressDetailsPickup.b(writer, customScalarAdapters, onModeSelectorV1AddressDetailsPickup);
            }
        }
    }
}
