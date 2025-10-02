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
import com.woolworths.shop.modeselector.SetShoppingModeMutation;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b \bÇ\u0002\u0018\u00002\u00020\u0001:\u001f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f ¨\u0006!"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/SetShoppingModeMutation_ResponseAdapter;", "", "Data", "SetShoppingMode", "OnShoppingModeSelector", "Header", "Button", "Image", "Section", "OnShoppingModeSelectorOptionsSection", "Item", "Fulfilment", "OnDividerCard", "OnButton", "Badge", "Condition", "OnShoppingModeSelectorStoreDetailsSection", "StoreDetail", "Image1", "Button1", "OnShoppingModeSelectorStoreFeaturesSection", "Feature", "OnShoppingModeSelectorAddressInfoSection", "Details", "ShoppingModeDetails", "Image2", "Button2", "V1AddressDetails", "OnModeSelectorV1AddressDetailsDelivery", "OnModeSelectorV1AddressDetailsPickup", "SecondaryButton", "OnShoppingModeSelectorErrorResponse", "OnShoppingModeSelectorRedirectResponse", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SetShoppingModeMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/SetShoppingModeMutation_ResponseAdapter$Badge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$Badge;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Badge implements Adapter<SetShoppingModeMutation.Badge> {

        /* renamed from: a, reason: collision with root package name */
        public static final Badge f23287a = new Badge();
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
                return new SetShoppingModeMutation.Badge(str, badgeTypeA);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SetShoppingModeMutation.Badge value = (SetShoppingModeMutation.Badge) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23225a);
            writer.F1("type");
            BadgeType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/SetShoppingModeMutation_ResponseAdapter$Button;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$Button;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Button implements Adapter<SetShoppingModeMutation.Button> {

        /* renamed from: a, reason: collision with root package name */
        public static final Button f23288a = new Button();
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
                return new SetShoppingModeMutation.Button(str, str2, zBooleanValue);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SetShoppingModeMutation.Button value = (SetShoppingModeMutation.Button) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23226a);
            writer.F1("isSelected");
            d.B(value.b, Adapters.f, writer, customScalarAdapters, "title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/SetShoppingModeMutation_ResponseAdapter$Button1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$Button1;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Button1 implements Adapter<SetShoppingModeMutation.Button1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Button1 f23289a = new Button1();
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
                return new SetShoppingModeMutation.Button1(str, buttonFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SetShoppingModeMutation.Button1 value = (SetShoppingModeMutation.Button1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23227a);
            List list = ButtonFragmentImpl_ResponseAdapter.ButtonFragment.f23351a;
            ButtonFragmentImpl_ResponseAdapter.ButtonFragment.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/SetShoppingModeMutation_ResponseAdapter$Button2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$Button2;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Button2 implements Adapter<SetShoppingModeMutation.Button2> {

        /* renamed from: a, reason: collision with root package name */
        public static final Button2 f23290a = new Button2();
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
                return new SetShoppingModeMutation.Button2(str, buttonFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SetShoppingModeMutation.Button2 value = (SetShoppingModeMutation.Button2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23228a);
            List list = ButtonFragmentImpl_ResponseAdapter.ButtonFragment.f23351a;
            ButtonFragmentImpl_ResponseAdapter.ButtonFragment.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/SetShoppingModeMutation_ResponseAdapter$Condition;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$Condition;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Condition implements Adapter<SetShoppingModeMutation.Condition> {

        /* renamed from: a, reason: collision with root package name */
        public static final Condition f23291a = new Condition();
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
                return new SetShoppingModeMutation.Condition(str, badgeTypeA);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SetShoppingModeMutation.Condition value = (SetShoppingModeMutation.Condition) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23229a);
            writer.F1("type");
            BadgeType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/SetShoppingModeMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$Data;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<SetShoppingModeMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f23292a = new Data();
        public static final List b = CollectionsKt.Q("setShoppingMode");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            SetShoppingModeMutation.SetShoppingMode setShoppingMode = null;
            while (reader.o2(b) == 0) {
                setShoppingMode = (SetShoppingModeMutation.SetShoppingMode) Adapters.c(SetShoppingMode.f23314a, true).fromJson(reader, customScalarAdapters);
            }
            if (setShoppingMode != null) {
                return new SetShoppingModeMutation.Data(setShoppingMode);
            }
            Assertions.a(reader, "setShoppingMode");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SetShoppingModeMutation.Data value = (SetShoppingModeMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("setShoppingMode");
            Adapters.c(SetShoppingMode.f23314a, true).toJson(writer, customScalarAdapters, value.f23230a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/SetShoppingModeMutation_ResponseAdapter$Details;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$Details;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Details implements Adapter<SetShoppingModeMutation.Details> {

        /* renamed from: a, reason: collision with root package name */
        public static final Details f23293a = new Details();
        public static final List b = CollectionsKt.R("shoppingModeDetails", "image", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "button", "v1AddressDetails", "secondaryButton");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            SetShoppingModeMutation.ShoppingModeDetails shoppingModeDetails = null;
            SetShoppingModeMutation.Image2 image2 = null;
            String str = null;
            String str2 = null;
            SetShoppingModeMutation.Button2 button2 = null;
            SetShoppingModeMutation.V1AddressDetails v1AddressDetails = null;
            SetShoppingModeMutation.SecondaryButton secondaryButton = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        shoppingModeDetails = (SetShoppingModeMutation.ShoppingModeDetails) Adapters.c(ShoppingModeDetails.f23315a, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        image2 = (SetShoppingModeMutation.Image2) Adapters.b(Adapters.c(Image2.f23299a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        button2 = (SetShoppingModeMutation.Button2) Adapters.c(Button2.f23290a, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        v1AddressDetails = (SetShoppingModeMutation.V1AddressDetails) Adapters.b(Adapters.c(V1AddressDetails.f23317a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        secondaryButton = (SetShoppingModeMutation.SecondaryButton) Adapters.b(Adapters.c(SecondaryButton.f23312a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (shoppingModeDetails == null) {
                            Assertions.a(reader, "shoppingModeDetails");
                            throw null;
                        }
                        if (button2 != null) {
                            return new SetShoppingModeMutation.Details(shoppingModeDetails, image2, str, str2, button2, v1AddressDetails, secondaryButton);
                        }
                        Assertions.a(reader, "button");
                        throw null;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SetShoppingModeMutation.Details value = (SetShoppingModeMutation.Details) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("shoppingModeDetails");
            Adapters.c(ShoppingModeDetails.f23315a, true).toJson(writer, customScalarAdapters, value.f23231a);
            writer.F1("image");
            Adapters.b(Adapters.c(Image2.f23299a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("title");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("button");
            Adapters.c(Button2.f23290a, true).toJson(writer, customScalarAdapters, value.e);
            writer.F1("v1AddressDetails");
            Adapters.b(Adapters.c(V1AddressDetails.f23317a, true)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("secondaryButton");
            Adapters.b(Adapters.c(SecondaryButton.f23312a, true)).toJson(writer, customScalarAdapters, value.g);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/SetShoppingModeMutation_ResponseAdapter$Feature;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$Feature;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Feature implements Adapter<SetShoppingModeMutation.Feature> {

        /* renamed from: a, reason: collision with root package name */
        public static final Feature f23294a = new Feature();
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
                return new SetShoppingModeMutation.Feature(str, str2);
            }
            Assertions.a(reader, "imageUrl");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SetShoppingModeMutation.Feature value = (SetShoppingModeMutation.Feature) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23232a);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/SetShoppingModeMutation_ResponseAdapter$Fulfilment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$Fulfilment;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Fulfilment implements Adapter<SetShoppingModeMutation.Fulfilment> {

        /* renamed from: a, reason: collision with root package name */
        public static final Fulfilment f23295a = new Fulfilment();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            SetShoppingModeMutation.OnDividerCard onDividerCardA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            SetShoppingModeMutation.OnButton onButtonA = null;
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
            return new SetShoppingModeMutation.Fulfilment(str, onDividerCardA, onButtonA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SetShoppingModeMutation.Fulfilment value = (SetShoppingModeMutation.Fulfilment) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23233a);
            SetShoppingModeMutation.OnDividerCard onDividerCard = value.b;
            if (onDividerCard != null) {
                List list = OnDividerCard.f23302a;
                writer.F1("value");
                Adapters.l.toJson(writer, customScalarAdapters, onDividerCard.f23240a);
            }
            SetShoppingModeMutation.OnButton onButton = value.c;
            if (onButton != null) {
                OnButton.b(writer, customScalarAdapters, onButton);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/SetShoppingModeMutation_ResponseAdapter$Header;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$Header;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Header implements Adapter<SetShoppingModeMutation.Header> {

        /* renamed from: a, reason: collision with root package name */
        public static final Header f23296a = new Header();
        public static final List b = CollectionsKt.R("buttons", "image");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            SetShoppingModeMutation.Image image = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    arrayListFromJson = Adapters.a(Adapters.c(Button.f23288a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    image = (SetShoppingModeMutation.Image) Adapters.c(Image.f23297a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "buttons");
                throw null;
            }
            if (image != null) {
                return new SetShoppingModeMutation.Header(arrayListFromJson, image);
            }
            Assertions.a(reader, "image");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SetShoppingModeMutation.Header value = (SetShoppingModeMutation.Header) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("buttons");
            Adapters.a(Adapters.c(Button.f23288a, false)).toJson(writer, customScalarAdapters, value.f23234a);
            writer.F1("image");
            Adapters.c(Image.f23297a, true).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/SetShoppingModeMutation_ResponseAdapter$Image;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$Image;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Image implements Adapter<SetShoppingModeMutation.Image> {

        /* renamed from: a, reason: collision with root package name */
        public static final Image f23297a = new Image();
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
                return new SetShoppingModeMutation.Image(str, downloadableAssetFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SetShoppingModeMutation.Image value = (SetShoppingModeMutation.Image) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23235a);
            List list = DownloadableAssetFragmentImpl_ResponseAdapter.DownloadableAssetFragment.f23353a;
            DownloadableAssetFragmentImpl_ResponseAdapter.DownloadableAssetFragment.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/SetShoppingModeMutation_ResponseAdapter$Image1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$Image1;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Image1 implements Adapter<SetShoppingModeMutation.Image1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Image1 f23298a = new Image1();
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
                return new SetShoppingModeMutation.Image1(str, downloadableAssetFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SetShoppingModeMutation.Image1 value = (SetShoppingModeMutation.Image1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23236a);
            List list = DownloadableAssetFragmentImpl_ResponseAdapter.DownloadableAssetFragment.f23353a;
            DownloadableAssetFragmentImpl_ResponseAdapter.DownloadableAssetFragment.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/SetShoppingModeMutation_ResponseAdapter$Image2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$Image2;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Image2 implements Adapter<SetShoppingModeMutation.Image2> {

        /* renamed from: a, reason: collision with root package name */
        public static final Image2 f23299a = new Image2();
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
                return new SetShoppingModeMutation.Image2(str, downloadableAssetFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SetShoppingModeMutation.Image2 value = (SetShoppingModeMutation.Image2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23237a);
            List list = DownloadableAssetFragmentImpl_ResponseAdapter.DownloadableAssetFragment.f23353a;
            DownloadableAssetFragmentImpl_ResponseAdapter.DownloadableAssetFragment.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/SetShoppingModeMutation_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$Item;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<SetShoppingModeMutation.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f23300a = new Item();
        public static final List b = CollectionsKt.R("__typename", "fulfilment", "badge", "conditions");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            List list = null;
            SetShoppingModeMutation.Badge badge = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    list = (List) Adapters.b(Adapters.a(Adapters.c(Fulfilment.f23295a, true))).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    badge = (SetShoppingModeMutation.Badge) Adapters.b(Adapters.c(Badge.f23287a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Condition.f23291a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            reader.o();
            ItemFragment itemFragmentA = ItemFragmentImpl_ResponseAdapter.ItemFragment.a(reader, customScalarAdapters);
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new SetShoppingModeMutation.Item(str, list, badge, arrayListFromJson, itemFragmentA);
            }
            Assertions.a(reader, "conditions");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SetShoppingModeMutation.Item value = (SetShoppingModeMutation.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23238a);
            writer.F1("fulfilment");
            Adapters.b(Adapters.a(Adapters.c(Fulfilment.f23295a, true))).toJson(writer, customScalarAdapters, value.b);
            writer.F1("badge");
            Adapters.b(Adapters.c(Badge.f23287a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("conditions");
            Adapters.a(Adapters.c(Condition.f23291a, false)).toJson(writer, customScalarAdapters, value.d);
            List list = ItemFragmentImpl_ResponseAdapter.ItemFragment.f23355a;
            ItemFragmentImpl_ResponseAdapter.ItemFragment.b(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/SetShoppingModeMutation_ResponseAdapter$OnButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$OnButton;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnButton implements Adapter<SetShoppingModeMutation.OnButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23301a = CollectionsKt.Q("__typename");

        public static SetShoppingModeMutation.OnButton a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23301a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ButtonFragment buttonFragmentA = ButtonFragmentImpl_ResponseAdapter.ButtonFragment.a(reader, customScalarAdapters);
            if (str != null) {
                return new SetShoppingModeMutation.OnButton(str, buttonFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, SetShoppingModeMutation.OnButton value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23239a);
            List list = ButtonFragmentImpl_ResponseAdapter.ButtonFragment.f23351a;
            ButtonFragmentImpl_ResponseAdapter.ButtonFragment.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (SetShoppingModeMutation.OnButton) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/SetShoppingModeMutation_ResponseAdapter$OnDividerCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$OnDividerCard;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnDividerCard implements Adapter<SetShoppingModeMutation.OnDividerCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23302a = CollectionsKt.Q("value");

        public static SetShoppingModeMutation.OnDividerCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            while (reader.o2(f23302a) == 0) {
                bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
            }
            return new SetShoppingModeMutation.OnDividerCard(bool);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SetShoppingModeMutation.OnDividerCard value = (SetShoppingModeMutation.OnDividerCard) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("value");
            Adapters.l.toJson(writer, customScalarAdapters, value.f23240a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/SetShoppingModeMutation_ResponseAdapter$OnModeSelectorV1AddressDetailsDelivery;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$OnModeSelectorV1AddressDetailsDelivery;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnModeSelectorV1AddressDetailsDelivery implements Adapter<SetShoppingModeMutation.OnModeSelectorV1AddressDetailsDelivery> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23303a = CollectionsKt.Q("__typename");

        public static SetShoppingModeMutation.OnModeSelectorV1AddressDetailsDelivery a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23303a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ModeSelectorV1AddressDetailsDeliveryFragment modeSelectorV1AddressDetailsDeliveryFragmentA = ModeSelectorV1AddressDetailsDeliveryFragmentImpl_ResponseAdapter.ModeSelectorV1AddressDetailsDeliveryFragment.a(reader, customScalarAdapters);
            if (str != null) {
                return new SetShoppingModeMutation.OnModeSelectorV1AddressDetailsDelivery(str, modeSelectorV1AddressDetailsDeliveryFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, SetShoppingModeMutation.OnModeSelectorV1AddressDetailsDelivery value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23241a);
            List list = ModeSelectorV1AddressDetailsDeliveryFragmentImpl_ResponseAdapter.ModeSelectorV1AddressDetailsDeliveryFragment.f23357a;
            ModeSelectorV1AddressDetailsDeliveryFragmentImpl_ResponseAdapter.ModeSelectorV1AddressDetailsDeliveryFragment.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (SetShoppingModeMutation.OnModeSelectorV1AddressDetailsDelivery) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/SetShoppingModeMutation_ResponseAdapter$OnModeSelectorV1AddressDetailsPickup;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$OnModeSelectorV1AddressDetailsPickup;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnModeSelectorV1AddressDetailsPickup implements Adapter<SetShoppingModeMutation.OnModeSelectorV1AddressDetailsPickup> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23304a = CollectionsKt.Q("__typename");

        public static SetShoppingModeMutation.OnModeSelectorV1AddressDetailsPickup a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23304a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ModeSelectorV1AddressDetailsPickupFragment modeSelectorV1AddressDetailsPickupFragmentA = ModeSelectorV1AddressDetailsPickupFragmentImpl_ResponseAdapter.ModeSelectorV1AddressDetailsPickupFragment.a(reader, customScalarAdapters);
            if (str != null) {
                return new SetShoppingModeMutation.OnModeSelectorV1AddressDetailsPickup(str, modeSelectorV1AddressDetailsPickupFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, SetShoppingModeMutation.OnModeSelectorV1AddressDetailsPickup value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23242a);
            List list = ModeSelectorV1AddressDetailsPickupFragmentImpl_ResponseAdapter.ModeSelectorV1AddressDetailsPickupFragment.f23359a;
            ModeSelectorV1AddressDetailsPickupFragmentImpl_ResponseAdapter.ModeSelectorV1AddressDetailsPickupFragment.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (SetShoppingModeMutation.OnModeSelectorV1AddressDetailsPickup) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/SetShoppingModeMutation_ResponseAdapter$OnShoppingModeSelector;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$OnShoppingModeSelector;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnShoppingModeSelector implements Adapter<SetShoppingModeMutation.OnShoppingModeSelector> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23305a = CollectionsKt.R("header", "sections");

        public static SetShoppingModeMutation.OnShoppingModeSelector a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            SetShoppingModeMutation.Header header = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f23305a);
                if (iO2 == 0) {
                    header = (SetShoppingModeMutation.Header) Adapters.c(Header.f23296a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Section.f23313a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (header == null) {
                Assertions.a(reader, "header");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new SetShoppingModeMutation.OnShoppingModeSelector(header, arrayListFromJson);
            }
            Assertions.a(reader, "sections");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, SetShoppingModeMutation.OnShoppingModeSelector value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("header");
            Adapters.c(Header.f23296a, false).toJson(writer, customScalarAdapters, value.f23243a);
            writer.F1("sections");
            Adapters.a(Adapters.c(Section.f23313a, true)).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (SetShoppingModeMutation.OnShoppingModeSelector) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/SetShoppingModeMutation_ResponseAdapter$OnShoppingModeSelectorAddressInfoSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$OnShoppingModeSelectorAddressInfoSection;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnShoppingModeSelectorAddressInfoSection implements Adapter<SetShoppingModeMutation.OnShoppingModeSelectorAddressInfoSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23306a = CollectionsKt.R("addressTitle", ErrorBundle.DETAIL_ENTRY);

        public static SetShoppingModeMutation.OnShoppingModeSelectorAddressInfoSection a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            SetShoppingModeMutation.Details details = null;
            while (true) {
                int iO2 = reader.o2(f23306a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    details = (SetShoppingModeMutation.Details) Adapters.c(Details.f23293a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "addressTitle");
                throw null;
            }
            if (details != null) {
                return new SetShoppingModeMutation.OnShoppingModeSelectorAddressInfoSection(str, details);
            }
            Assertions.a(reader, ErrorBundle.DETAIL_ENTRY);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, SetShoppingModeMutation.OnShoppingModeSelectorAddressInfoSection value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("addressTitle");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23244a);
            writer.F1(ErrorBundle.DETAIL_ENTRY);
            Adapters.c(Details.f23293a, false).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (SetShoppingModeMutation.OnShoppingModeSelectorAddressInfoSection) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/SetShoppingModeMutation_ResponseAdapter$OnShoppingModeSelectorErrorResponse;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$OnShoppingModeSelectorErrorResponse;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnShoppingModeSelectorErrorResponse implements Adapter<SetShoppingModeMutation.OnShoppingModeSelectorErrorResponse> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23307a = CollectionsKt.R("deep", "message");

        public static SetShoppingModeMutation.OnShoppingModeSelectorErrorResponse a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f23307a);
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
                return new SetShoppingModeMutation.OnShoppingModeSelectorErrorResponse(str, str2);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, SetShoppingModeMutation.OnShoppingModeSelectorErrorResponse value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("deep");
            Adapters.i.toJson(writer, customScalarAdapters, value.f23245a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (SetShoppingModeMutation.OnShoppingModeSelectorErrorResponse) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/SetShoppingModeMutation_ResponseAdapter$OnShoppingModeSelectorOptionsSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$OnShoppingModeSelectorOptionsSection;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnShoppingModeSelectorOptionsSection implements Adapter<SetShoppingModeMutation.OnShoppingModeSelectorOptionsSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23308a = CollectionsKt.R("optionTitle", "items", "footnote", "disclaimer");

        public static SetShoppingModeMutation.OnShoppingModeSelectorOptionsSection a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(f23308a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson = Adapters.a(Adapters.c(Item.f23300a, true)).fromJson(reader, customScalarAdapters);
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
                return new SetShoppingModeMutation.OnShoppingModeSelectorOptionsSection(str, str2, str3, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, SetShoppingModeMutation.OnShoppingModeSelectorOptionsSection value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("optionTitle");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f23246a);
            writer.F1("items");
            Adapters.a(Adapters.c(Item.f23300a, true)).toJson(writer, customScalarAdapters, value.b);
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
            b(jsonWriter, customScalarAdapters, (SetShoppingModeMutation.OnShoppingModeSelectorOptionsSection) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/SetShoppingModeMutation_ResponseAdapter$OnShoppingModeSelectorRedirectResponse;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$OnShoppingModeSelectorRedirectResponse;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnShoppingModeSelectorRedirectResponse implements Adapter<SetShoppingModeMutation.OnShoppingModeSelectorRedirectResponse> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23309a = CollectionsKt.Q("deepLinkUrl");

        public static SetShoppingModeMutation.OnShoppingModeSelectorRedirectResponse a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23309a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new SetShoppingModeMutation.OnShoppingModeSelectorRedirectResponse(str);
            }
            Assertions.a(reader, "deepLinkUrl");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, SetShoppingModeMutation.OnShoppingModeSelectorRedirectResponse value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("deepLinkUrl");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23247a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (SetShoppingModeMutation.OnShoppingModeSelectorRedirectResponse) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/SetShoppingModeMutation_ResponseAdapter$OnShoppingModeSelectorStoreDetailsSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$OnShoppingModeSelectorStoreDetailsSection;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnShoppingModeSelectorStoreDetailsSection implements Adapter<SetShoppingModeMutation.OnShoppingModeSelectorStoreDetailsSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23310a = CollectionsKt.Q("storeDetails");

        public static SetShoppingModeMutation.OnShoppingModeSelectorStoreDetailsSection a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(f23310a) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(StoreDetail.f23316a, false)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new SetShoppingModeMutation.OnShoppingModeSelectorStoreDetailsSection(arrayListFromJson);
            }
            Assertions.a(reader, "storeDetails");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, SetShoppingModeMutation.OnShoppingModeSelectorStoreDetailsSection value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("storeDetails");
            Adapters.a(Adapters.c(StoreDetail.f23316a, false)).toJson(writer, customScalarAdapters, value.f23248a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (SetShoppingModeMutation.OnShoppingModeSelectorStoreDetailsSection) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/SetShoppingModeMutation_ResponseAdapter$OnShoppingModeSelectorStoreFeaturesSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$OnShoppingModeSelectorStoreFeaturesSection;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnShoppingModeSelectorStoreFeaturesSection implements Adapter<SetShoppingModeMutation.OnShoppingModeSelectorStoreFeaturesSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23311a = CollectionsKt.R("title", "features");

        public static SetShoppingModeMutation.OnShoppingModeSelectorStoreFeaturesSection a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f23311a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Feature.f23294a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new SetShoppingModeMutation.OnShoppingModeSelectorStoreFeaturesSection(str, arrayListFromJson);
            }
            Assertions.a(reader, "features");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, SetShoppingModeMutation.OnShoppingModeSelectorStoreFeaturesSection value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23249a);
            writer.F1("features");
            Adapters.a(Adapters.c(Feature.f23294a, false)).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (SetShoppingModeMutation.OnShoppingModeSelectorStoreFeaturesSection) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/SetShoppingModeMutation_ResponseAdapter$SecondaryButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$SecondaryButton;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SecondaryButton implements Adapter<SetShoppingModeMutation.SecondaryButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final SecondaryButton f23312a = new SecondaryButton();
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
                return new SetShoppingModeMutation.SecondaryButton(str, buttonFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SetShoppingModeMutation.SecondaryButton value = (SetShoppingModeMutation.SecondaryButton) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23250a);
            List list = ButtonFragmentImpl_ResponseAdapter.ButtonFragment.f23351a;
            ButtonFragmentImpl_ResponseAdapter.ButtonFragment.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/SetShoppingModeMutation_ResponseAdapter$Section;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$Section;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Section implements Adapter<SetShoppingModeMutation.Section> {

        /* renamed from: a, reason: collision with root package name */
        public static final Section f23313a = new Section();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            SetShoppingModeMutation.OnShoppingModeSelectorOptionsSection onShoppingModeSelectorOptionsSectionA;
            SetShoppingModeMutation.OnShoppingModeSelectorStoreDetailsSection onShoppingModeSelectorStoreDetailsSectionA;
            SetShoppingModeMutation.OnShoppingModeSelectorStoreFeaturesSection onShoppingModeSelectorStoreFeaturesSectionA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            SetShoppingModeMutation.OnShoppingModeSelectorAddressInfoSection onShoppingModeSelectorAddressInfoSectionA = null;
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
            return new SetShoppingModeMutation.Section(str, onShoppingModeSelectorOptionsSectionA, onShoppingModeSelectorStoreDetailsSectionA, onShoppingModeSelectorStoreFeaturesSectionA, onShoppingModeSelectorAddressInfoSectionA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SetShoppingModeMutation.Section value = (SetShoppingModeMutation.Section) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23251a);
            SetShoppingModeMutation.OnShoppingModeSelectorOptionsSection onShoppingModeSelectorOptionsSection = value.b;
            if (onShoppingModeSelectorOptionsSection != null) {
                OnShoppingModeSelectorOptionsSection.b(writer, customScalarAdapters, onShoppingModeSelectorOptionsSection);
            }
            SetShoppingModeMutation.OnShoppingModeSelectorStoreDetailsSection onShoppingModeSelectorStoreDetailsSection = value.c;
            if (onShoppingModeSelectorStoreDetailsSection != null) {
                OnShoppingModeSelectorStoreDetailsSection.b(writer, customScalarAdapters, onShoppingModeSelectorStoreDetailsSection);
            }
            SetShoppingModeMutation.OnShoppingModeSelectorStoreFeaturesSection onShoppingModeSelectorStoreFeaturesSection = value.d;
            if (onShoppingModeSelectorStoreFeaturesSection != null) {
                OnShoppingModeSelectorStoreFeaturesSection.b(writer, customScalarAdapters, onShoppingModeSelectorStoreFeaturesSection);
            }
            SetShoppingModeMutation.OnShoppingModeSelectorAddressInfoSection onShoppingModeSelectorAddressInfoSection = value.e;
            if (onShoppingModeSelectorAddressInfoSection != null) {
                OnShoppingModeSelectorAddressInfoSection.b(writer, customScalarAdapters, onShoppingModeSelectorAddressInfoSection);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/SetShoppingModeMutation_ResponseAdapter$SetShoppingMode;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$SetShoppingMode;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SetShoppingMode implements Adapter<SetShoppingModeMutation.SetShoppingMode> {

        /* renamed from: a, reason: collision with root package name */
        public static final SetShoppingMode f23314a = new SetShoppingMode();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            SetShoppingModeMutation.OnShoppingModeSelector onShoppingModeSelectorA;
            SetShoppingModeMutation.OnShoppingModeSelectorErrorResponse onShoppingModeSelectorErrorResponseA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            SetShoppingModeMutation.OnShoppingModeSelectorRedirectResponse onShoppingModeSelectorRedirectResponseA = null;
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
            } else {
                onShoppingModeSelectorErrorResponseA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ShoppingModeSelectorRedirectResponse"))) {
                reader.o();
                onShoppingModeSelectorRedirectResponseA = OnShoppingModeSelectorRedirectResponse.a(reader, customScalarAdapters);
            }
            return new SetShoppingModeMutation.SetShoppingMode(str, onShoppingModeSelectorA, onShoppingModeSelectorErrorResponseA, onShoppingModeSelectorRedirectResponseA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SetShoppingModeMutation.SetShoppingMode value = (SetShoppingModeMutation.SetShoppingMode) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23252a);
            SetShoppingModeMutation.OnShoppingModeSelector onShoppingModeSelector = value.b;
            if (onShoppingModeSelector != null) {
                OnShoppingModeSelector.b(writer, customScalarAdapters, onShoppingModeSelector);
            }
            SetShoppingModeMutation.OnShoppingModeSelectorErrorResponse onShoppingModeSelectorErrorResponse = value.c;
            if (onShoppingModeSelectorErrorResponse != null) {
                OnShoppingModeSelectorErrorResponse.b(writer, customScalarAdapters, onShoppingModeSelectorErrorResponse);
            }
            SetShoppingModeMutation.OnShoppingModeSelectorRedirectResponse onShoppingModeSelectorRedirectResponse = value.d;
            if (onShoppingModeSelectorRedirectResponse != null) {
                OnShoppingModeSelectorRedirectResponse.b(writer, customScalarAdapters, onShoppingModeSelectorRedirectResponse);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/SetShoppingModeMutation_ResponseAdapter$ShoppingModeDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$ShoppingModeDetails;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShoppingModeDetails implements Adapter<SetShoppingModeMutation.ShoppingModeDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final ShoppingModeDetails f23315a = new ShoppingModeDetails();
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
                return new SetShoppingModeMutation.ShoppingModeDetails(str, shoppingModeDetailsFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SetShoppingModeMutation.ShoppingModeDetails value = (SetShoppingModeMutation.ShoppingModeDetails) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23253a);
            List list = ShoppingModeDetailsFragmentImpl_ResponseAdapter.ShoppingModeDetailsFragment.f23361a;
            ShoppingModeDetailsFragmentImpl_ResponseAdapter.ShoppingModeDetailsFragment.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/SetShoppingModeMutation_ResponseAdapter$StoreDetail;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$StoreDetail;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StoreDetail implements Adapter<SetShoppingModeMutation.StoreDetail> {

        /* renamed from: a, reason: collision with root package name */
        public static final StoreDetail f23316a = new StoreDetail();
        public static final List b = CollectionsKt.R("image", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "button");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            SetShoppingModeMutation.Image1 image1 = null;
            String str = null;
            String str2 = null;
            SetShoppingModeMutation.Button1 button1 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    image1 = (SetShoppingModeMutation.Image1) Adapters.b(Adapters.c(Image1.f23298a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        return new SetShoppingModeMutation.StoreDetail(image1, str, str2, button1);
                    }
                    button1 = (SetShoppingModeMutation.Button1) Adapters.b(Adapters.c(Button1.f23289a, true)).fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SetShoppingModeMutation.StoreDetail value = (SetShoppingModeMutation.StoreDetail) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("image");
            Adapters.b(Adapters.c(Image1.f23298a, true)).toJson(writer, customScalarAdapters, value.f23254a);
            writer.F1("title");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("button");
            Adapters.b(Adapters.c(Button1.f23289a, true)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/adapter/SetShoppingModeMutation_ResponseAdapter$V1AddressDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/SetShoppingModeMutation$V1AddressDetails;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class V1AddressDetails implements Adapter<SetShoppingModeMutation.V1AddressDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final V1AddressDetails f23317a = new V1AddressDetails();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            SetShoppingModeMutation.OnModeSelectorV1AddressDetailsDelivery onModeSelectorV1AddressDetailsDeliveryA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            SetShoppingModeMutation.OnModeSelectorV1AddressDetailsPickup onModeSelectorV1AddressDetailsPickupA = null;
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
            return new SetShoppingModeMutation.V1AddressDetails(str, onModeSelectorV1AddressDetailsDeliveryA, onModeSelectorV1AddressDetailsPickupA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SetShoppingModeMutation.V1AddressDetails value = (SetShoppingModeMutation.V1AddressDetails) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23255a);
            SetShoppingModeMutation.OnModeSelectorV1AddressDetailsDelivery onModeSelectorV1AddressDetailsDelivery = value.b;
            if (onModeSelectorV1AddressDetailsDelivery != null) {
                OnModeSelectorV1AddressDetailsDelivery.b(writer, customScalarAdapters, onModeSelectorV1AddressDetailsDelivery);
            }
            SetShoppingModeMutation.OnModeSelectorV1AddressDetailsPickup onModeSelectorV1AddressDetailsPickup = value.c;
            if (onModeSelectorV1AddressDetailsPickup != null) {
                OnModeSelectorV1AddressDetailsPickup.b(writer, customScalarAdapters, onModeSelectorV1AddressDetailsPickup);
            }
        }
    }
}
