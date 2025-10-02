package au.com.woolworths.modules.collectionmode.adapter;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.modules.collectionmode.SelectShoppingModeMutation;
import au.com.woolworths.shop.graphql.type.BadgeType;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.DeliveryWindowStatus;
import au.com.woolworths.shop.graphql.type.ShoppingModeId;
import au.com.woolworths.shop.graphql.type.ShoppingModeType;
import au.com.woolworths.shop.graphql.type.ShoppingModeVariantState;
import au.com.woolworths.shop.graphql.type.adapter.BadgeType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ButtonStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.DeliveryWindowStatus_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ShoppingModeId_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ShoppingModeType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ShoppingModeVariantState_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$IntAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001:\u0012\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/SelectShoppingModeMutation_ResponseAdapter;", "", "Data", "SelectShoppingMode", "ShoppingModes", "Mode", "OnShoppingMode", "Variant", "OnShoppingModeVariant", "Price", "OnPrice", "OnPriceRange", "Condition", "StatusBadge", "Fulfilment", "OnDividerCard", "OnShoppingModeVariantFulfilmentWindowState", "FulfilmentWindowStateSubtitle", "FulfilmentWindowStateButton", "OnButton", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SelectShoppingModeMutation_ResponseAdapter {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/SelectShoppingModeMutation_ResponseAdapter$Condition;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$Condition;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Condition implements Adapter<SelectShoppingModeMutation.Condition> {

        /* renamed from: a, reason: collision with root package name */
        public static final Condition f9123a = new Condition();
        public static final List b = CollectionsKt.Q(TextBundle.TEXT_ENTRY);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new SelectShoppingModeMutation.Condition(str);
            }
            Assertions.a(reader, TextBundle.TEXT_ENTRY);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SelectShoppingModeMutation.Condition value = (SelectShoppingModeMutation.Condition) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f9083a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/SelectShoppingModeMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$Data;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<SelectShoppingModeMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f9124a = new Data();
        public static final List b = CollectionsKt.Q("selectShoppingMode");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            SelectShoppingModeMutation.SelectShoppingMode selectShoppingMode = null;
            while (reader.o2(b) == 0) {
                selectShoppingMode = (SelectShoppingModeMutation.SelectShoppingMode) Adapters.c(SelectShoppingMode.f9137a, false).fromJson(reader, customScalarAdapters);
            }
            if (selectShoppingMode != null) {
                return new SelectShoppingModeMutation.Data(selectShoppingMode);
            }
            Assertions.a(reader, "selectShoppingMode");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SelectShoppingModeMutation.Data value = (SelectShoppingModeMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("selectShoppingMode");
            Adapters.c(SelectShoppingMode.f9137a, false).toJson(writer, customScalarAdapters, value.f9084a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/SelectShoppingModeMutation_ResponseAdapter$Fulfilment;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$Fulfilment;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Fulfilment implements Adapter<SelectShoppingModeMutation.Fulfilment> {

        /* renamed from: a, reason: collision with root package name */
        public static final Fulfilment f9125a = new Fulfilment();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            SelectShoppingModeMutation.OnDividerCard onDividerCardA;
            SelectShoppingModeMutation.OnShoppingModeVariantFulfilmentWindowState onShoppingModeVariantFulfilmentWindowStateA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            SelectShoppingModeMutation.OnButton onButtonA = null;
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
            if (a.C(set2, set, null, str, BooleanExpressions.c("ShoppingModeVariantFulfilmentWindowState"))) {
                reader.o();
                onShoppingModeVariantFulfilmentWindowStateA = OnShoppingModeVariantFulfilmentWindowState.a(reader, customScalarAdapters);
            } else {
                onShoppingModeVariantFulfilmentWindowStateA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("Button"))) {
                reader.o();
                onButtonA = OnButton.a(reader, customScalarAdapters);
            }
            return new SelectShoppingModeMutation.Fulfilment(str, onDividerCardA, onShoppingModeVariantFulfilmentWindowStateA, onButtonA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SelectShoppingModeMutation.Fulfilment value = (SelectShoppingModeMutation.Fulfilment) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f9085a);
            SelectShoppingModeMutation.OnDividerCard onDividerCard = value.b;
            if (onDividerCard != null) {
                List list = OnDividerCard.f9130a;
                writer.F1("_excluded");
                Adapters.l.toJson(writer, customScalarAdapters, onDividerCard.f9090a);
            }
            SelectShoppingModeMutation.OnShoppingModeVariantFulfilmentWindowState onShoppingModeVariantFulfilmentWindowState = value.c;
            if (onShoppingModeVariantFulfilmentWindowState != null) {
                OnShoppingModeVariantFulfilmentWindowState.b(writer, customScalarAdapters, onShoppingModeVariantFulfilmentWindowState);
            }
            SelectShoppingModeMutation.OnButton onButton = value.d;
            if (onButton != null) {
                OnButton.b(writer, customScalarAdapters, onButton);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/SelectShoppingModeMutation_ResponseAdapter$FulfilmentWindowStateButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$FulfilmentWindowStateButton;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FulfilmentWindowStateButton implements Adapter<SelectShoppingModeMutation.FulfilmentWindowStateButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final FulfilmentWindowStateButton f9126a = new FulfilmentWindowStateButton();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "style", "enabled", UrlHandler.ACTION, "url");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            ButtonStyle buttonStyle = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    bool = bool2;
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = bool2;
                    buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    bool = bool2;
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    bool = bool2;
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
                bool2 = bool;
            }
            Boolean bool3 = bool2;
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool3 != null) {
                return new SelectShoppingModeMutation.FulfilmentWindowStateButton(str, buttonStyle, bool3.booleanValue(), str2, str3);
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SelectShoppingModeMutation.FulfilmentWindowStateButton value = (SelectShoppingModeMutation.FulfilmentWindowStateButton) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f9086a);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.b);
            writer.F1("enabled");
            d.B(value.c, Adapters.f, writer, customScalarAdapters, UrlHandler.ACTION);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("url");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/SelectShoppingModeMutation_ResponseAdapter$FulfilmentWindowStateSubtitle;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$FulfilmentWindowStateSubtitle;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FulfilmentWindowStateSubtitle implements Adapter<SelectShoppingModeMutation.FulfilmentWindowStateSubtitle> {

        /* renamed from: a, reason: collision with root package name */
        public static final FulfilmentWindowStateSubtitle f9127a = new FulfilmentWindowStateSubtitle();
        public static final List b = CollectionsKt.R(TextBundle.TEXT_ENTRY, "altText");

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
                Assertions.a(reader, TextBundle.TEXT_ENTRY);
                throw null;
            }
            if (str2 != null) {
                return new SelectShoppingModeMutation.FulfilmentWindowStateSubtitle(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SelectShoppingModeMutation.FulfilmentWindowStateSubtitle value = (SelectShoppingModeMutation.FulfilmentWindowStateSubtitle) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f9087a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/SelectShoppingModeMutation_ResponseAdapter$Mode;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$Mode;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Mode implements Adapter<SelectShoppingModeMutation.Mode> {

        /* renamed from: a, reason: collision with root package name */
        public static final Mode f9128a = new Mode();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            SelectShoppingModeMutation.OnShoppingMode onShoppingModeA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("ShoppingMode"))) {
                reader.o();
                onShoppingModeA = OnShoppingMode.a(reader, customScalarAdapters);
            }
            return new SelectShoppingModeMutation.Mode(str, onShoppingModeA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SelectShoppingModeMutation.Mode value = (SelectShoppingModeMutation.Mode) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f9088a);
            SelectShoppingModeMutation.OnShoppingMode onShoppingMode = value.b;
            if (onShoppingMode != null) {
                OnShoppingMode.b(writer, customScalarAdapters, onShoppingMode);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/SelectShoppingModeMutation_ResponseAdapter$OnButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$OnButton;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnButton implements Adapter<SelectShoppingModeMutation.OnButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f9129a = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "style", "enabled", UrlHandler.ACTION, "url");

        public static SelectShoppingModeMutation.OnButton a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            ButtonStyle buttonStyle = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(f9129a);
                if (iO2 == 0) {
                    bool = bool2;
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = bool2;
                    buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    bool = bool2;
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    bool = bool2;
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
                bool2 = bool;
            }
            Boolean bool3 = bool2;
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool3 != null) {
                return new SelectShoppingModeMutation.OnButton(str, buttonStyle, bool3.booleanValue(), str2, str3);
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, SelectShoppingModeMutation.OnButton value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f9089a);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.b);
            writer.F1("enabled");
            d.B(value.c, Adapters.f, writer, customScalarAdapters, UrlHandler.ACTION);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("url");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (SelectShoppingModeMutation.OnButton) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/SelectShoppingModeMutation_ResponseAdapter$OnDividerCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$OnDividerCard;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnDividerCard implements Adapter<SelectShoppingModeMutation.OnDividerCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f9130a = CollectionsKt.Q("_excluded");

        public static SelectShoppingModeMutation.OnDividerCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            while (reader.o2(f9130a) == 0) {
                bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
            }
            return new SelectShoppingModeMutation.OnDividerCard(bool);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SelectShoppingModeMutation.OnDividerCard value = (SelectShoppingModeMutation.OnDividerCard) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.f9090a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/SelectShoppingModeMutation_ResponseAdapter$OnPrice;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$OnPrice;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPrice implements Adapter<SelectShoppingModeMutation.OnPrice> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f9131a = CollectionsKt.R(TextBundle.TEXT_ENTRY, "value", "suffix");

        public static SelectShoppingModeMutation.OnPrice a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Integer num = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f9131a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, TextBundle.TEXT_ENTRY);
                throw null;
            }
            if (num != null) {
                return new SelectShoppingModeMutation.OnPrice(str, num.intValue(), str2);
            }
            Assertions.a(reader, "value");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, SelectShoppingModeMutation.OnPrice value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f9091a);
            writer.F1("value");
            d.y(value.b, Adapters.b, writer, customScalarAdapters, "suffix");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (SelectShoppingModeMutation.OnPrice) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/SelectShoppingModeMutation_ResponseAdapter$OnPriceRange;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$OnPriceRange;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPriceRange implements Adapter<SelectShoppingModeMutation.OnPriceRange> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f9132a = CollectionsKt.R(TextBundle.TEXT_ENTRY, "min", "max", "suffix");

        public static SelectShoppingModeMutation.OnPriceRange a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Integer num = null;
            Integer num2 = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f9132a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, TextBundle.TEXT_ENTRY);
                throw null;
            }
            if (num == null) {
                Assertions.a(reader, "min");
                throw null;
            }
            int iIntValue = num.intValue();
            if (num2 != null) {
                return new SelectShoppingModeMutation.OnPriceRange(str, iIntValue, num2.intValue(), str2);
            }
            Assertions.a(reader, "max");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, SelectShoppingModeMutation.OnPriceRange value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f9092a);
            writer.F1("min");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.b, adapters$IntAdapter$1, writer, customScalarAdapters, "max");
            d.y(value.c, adapters$IntAdapter$1, writer, customScalarAdapters, "suffix");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (SelectShoppingModeMutation.OnPriceRange) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/SelectShoppingModeMutation_ResponseAdapter$OnShoppingMode;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$OnShoppingMode;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnShoppingMode implements Adapter<SelectShoppingModeMutation.OnShoppingMode> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f9133a = CollectionsKt.R("type", "title", "variants");

        public static SelectShoppingModeMutation.OnShoppingMode a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ShoppingModeType shoppingModeTypeA = null;
            String str = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f9133a);
                if (iO2 == 0) {
                    shoppingModeTypeA = ShoppingModeType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Variant.f9140a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (shoppingModeTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new SelectShoppingModeMutation.OnShoppingMode(shoppingModeTypeA, str, arrayListFromJson);
            }
            Assertions.a(reader, "variants");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, SelectShoppingModeMutation.OnShoppingMode value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            ShoppingModeType_ResponseAdapter.b(writer, customScalarAdapters, value.f9093a);
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("variants");
            Adapters.a(Adapters.c(Variant.f9140a, true)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (SelectShoppingModeMutation.OnShoppingMode) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/SelectShoppingModeMutation_ResponseAdapter$OnShoppingModeVariant;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$OnShoppingModeVariant;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnShoppingModeVariant implements Adapter<SelectShoppingModeMutation.OnShoppingModeVariant> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f9134a = CollectionsKt.R("id", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "state", "status", "price", "conditions", "statusBadge", "footnote", "expressDeliveryStoreId", "fulfilment");

        public static SelectShoppingModeMutation.OnShoppingModeVariant a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ShoppingModeId shoppingModeIdA = null;
            String str = null;
            String str2 = null;
            ShoppingModeVariantState shoppingModeVariantStateA = null;
            DeliveryWindowStatus deliveryWindowStatus = null;
            SelectShoppingModeMutation.Price price = null;
            List list = null;
            SelectShoppingModeMutation.StatusBadge statusBadge = null;
            String str3 = null;
            Integer num = null;
            List list2 = null;
            while (true) {
                switch (reader.o2(f9134a)) {
                    case 0:
                        shoppingModeIdA = ShoppingModeId_ResponseAdapter.a(reader, customScalarAdapters);
                        break;
                    case 1:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        shoppingModeVariantStateA = ShoppingModeVariantState_ResponseAdapter.a(reader, customScalarAdapters);
                        break;
                    case 4:
                        deliveryWindowStatus = (DeliveryWindowStatus) Adapters.b(DeliveryWindowStatus_ResponseAdapter.f12068a).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        price = (SelectShoppingModeMutation.Price) Adapters.b(Adapters.c(Price.f9136a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        list = (List) Adapters.b(Adapters.a(Adapters.b(Adapters.c(Condition.f9123a, false)))).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        statusBadge = (SelectShoppingModeMutation.StatusBadge) Adapters.b(Adapters.c(StatusBadge.f9139a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        num = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        list2 = (List) Adapters.b(Adapters.a(Adapters.c(Fulfilment.f9125a, true))).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (shoppingModeIdA == null) {
                            Assertions.a(reader, "id");
                            throw null;
                        }
                        if (str == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
                            throw null;
                        }
                        if (shoppingModeVariantStateA != null) {
                            return new SelectShoppingModeMutation.OnShoppingModeVariant(shoppingModeIdA, str, str2, shoppingModeVariantStateA, deliveryWindowStatus, price, list, statusBadge, str3, num, list2);
                        }
                        Assertions.a(reader, "state");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, SelectShoppingModeMutation.OnShoppingModeVariant value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            ShoppingModeId_ResponseAdapter.b(writer, customScalarAdapters, value.f9094a);
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("state");
            ShoppingModeVariantState_ResponseAdapter.b(writer, customScalarAdapters, value.d);
            writer.F1("status");
            Adapters.b(DeliveryWindowStatus_ResponseAdapter.f12068a).toJson(writer, customScalarAdapters, value.e);
            writer.F1("price");
            Adapters.b(Adapters.c(Price.f9136a, true)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("conditions");
            Adapters.b(Adapters.a(Adapters.b(Adapters.c(Condition.f9123a, false)))).toJson(writer, customScalarAdapters, value.g);
            writer.F1("statusBadge");
            Adapters.b(Adapters.c(StatusBadge.f9139a, false)).toJson(writer, customScalarAdapters, value.h);
            writer.F1("footnote");
            Adapters.i.toJson(writer, customScalarAdapters, value.i);
            writer.F1("expressDeliveryStoreId");
            Adapters.k.toJson(writer, customScalarAdapters, value.j);
            writer.F1("fulfilment");
            Adapters.b(Adapters.a(Adapters.c(Fulfilment.f9125a, true))).toJson(writer, customScalarAdapters, value.k);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (SelectShoppingModeMutation.OnShoppingModeVariant) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/SelectShoppingModeMutation_ResponseAdapter$OnShoppingModeVariantFulfilmentWindowState;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$OnShoppingModeVariantFulfilmentWindowState;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnShoppingModeVariantFulfilmentWindowState implements Adapter<SelectShoppingModeMutation.OnShoppingModeVariantFulfilmentWindowState> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f9135a = CollectionsKt.R("fulfilmentWindowStateTitle", "fulfilmentWindowStateSubtitle", "fulfilmentWindowStateButton");

        public static SelectShoppingModeMutation.OnShoppingModeVariantFulfilmentWindowState a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            SelectShoppingModeMutation.FulfilmentWindowStateSubtitle fulfilmentWindowStateSubtitle = null;
            SelectShoppingModeMutation.FulfilmentWindowStateButton fulfilmentWindowStateButton = null;
            while (true) {
                int iO2 = reader.o2(f9135a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    fulfilmentWindowStateSubtitle = (SelectShoppingModeMutation.FulfilmentWindowStateSubtitle) Adapters.b(Adapters.c(FulfilmentWindowStateSubtitle.f9127a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    fulfilmentWindowStateButton = (SelectShoppingModeMutation.FulfilmentWindowStateButton) Adapters.c(FulfilmentWindowStateButton.f9126a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "fulfilmentWindowStateTitle");
                throw null;
            }
            if (fulfilmentWindowStateButton != null) {
                return new SelectShoppingModeMutation.OnShoppingModeVariantFulfilmentWindowState(str, fulfilmentWindowStateSubtitle, fulfilmentWindowStateButton);
            }
            Assertions.a(reader, "fulfilmentWindowStateButton");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, SelectShoppingModeMutation.OnShoppingModeVariantFulfilmentWindowState value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("fulfilmentWindowStateTitle");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f9095a);
            writer.F1("fulfilmentWindowStateSubtitle");
            Adapters.b(Adapters.c(FulfilmentWindowStateSubtitle.f9127a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("fulfilmentWindowStateButton");
            Adapters.c(FulfilmentWindowStateButton.f9126a, false).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (SelectShoppingModeMutation.OnShoppingModeVariantFulfilmentWindowState) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/SelectShoppingModeMutation_ResponseAdapter$Price;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$Price;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Price implements Adapter<SelectShoppingModeMutation.Price> {

        /* renamed from: a, reason: collision with root package name */
        public static final Price f9136a = new Price();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            SelectShoppingModeMutation.OnPrice onPriceA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            SelectShoppingModeMutation.OnPriceRange onPriceRangeA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("Price"))) {
                reader.o();
                onPriceA = OnPrice.a(reader, customScalarAdapters);
            } else {
                onPriceA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("PriceRange"))) {
                reader.o();
                onPriceRangeA = OnPriceRange.a(reader, customScalarAdapters);
            }
            return new SelectShoppingModeMutation.Price(str, onPriceA, onPriceRangeA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SelectShoppingModeMutation.Price value = (SelectShoppingModeMutation.Price) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f9096a);
            SelectShoppingModeMutation.OnPrice onPrice = value.b;
            if (onPrice != null) {
                OnPrice.b(writer, customScalarAdapters, onPrice);
            }
            SelectShoppingModeMutation.OnPriceRange onPriceRange = value.c;
            if (onPriceRange != null) {
                OnPriceRange.b(writer, customScalarAdapters, onPriceRange);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/SelectShoppingModeMutation_ResponseAdapter$SelectShoppingMode;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$SelectShoppingMode;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SelectShoppingMode implements Adapter<SelectShoppingModeMutation.SelectShoppingMode> {

        /* renamed from: a, reason: collision with root package name */
        public static final SelectShoppingMode f9137a = new SelectShoppingMode();
        public static final List b = CollectionsKt.R("isSuccess", "shoppingModes");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            SelectShoppingModeMutation.ShoppingModes shoppingModes = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    shoppingModes = (SelectShoppingModeMutation.ShoppingModes) Adapters.c(ShoppingModes.f9138a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (bool == null) {
                Assertions.a(reader, "isSuccess");
                throw null;
            }
            boolean zBooleanValue = bool.booleanValue();
            if (shoppingModes != null) {
                return new SelectShoppingModeMutation.SelectShoppingMode(zBooleanValue, shoppingModes);
            }
            Assertions.a(reader, "shoppingModes");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SelectShoppingModeMutation.SelectShoppingMode value = (SelectShoppingModeMutation.SelectShoppingMode) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("isSuccess");
            d.B(value.f9097a, Adapters.f, writer, customScalarAdapters, "shoppingModes");
            Adapters.c(ShoppingModes.f9138a, false).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/SelectShoppingModeMutation_ResponseAdapter$ShoppingModes;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$ShoppingModes;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShoppingModes implements Adapter<SelectShoppingModeMutation.ShoppingModes> {

        /* renamed from: a, reason: collision with root package name */
        public static final ShoppingModes f9138a = new ShoppingModes();
        public static final List b = CollectionsKt.Q("modes");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(b) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(Mode.f9128a, true)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new SelectShoppingModeMutation.ShoppingModes(arrayListFromJson);
            }
            Assertions.a(reader, "modes");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SelectShoppingModeMutation.ShoppingModes value = (SelectShoppingModeMutation.ShoppingModes) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("modes");
            Adapters.a(Adapters.c(Mode.f9128a, true)).toJson(writer, customScalarAdapters, value.f9098a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/SelectShoppingModeMutation_ResponseAdapter$StatusBadge;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$StatusBadge;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StatusBadge implements Adapter<SelectShoppingModeMutation.StatusBadge> {

        /* renamed from: a, reason: collision with root package name */
        public static final StatusBadge f9139a = new StatusBadge();
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
                return new SelectShoppingModeMutation.StatusBadge(str, badgeTypeA);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SelectShoppingModeMutation.StatusBadge value = (SelectShoppingModeMutation.StatusBadge) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f9099a);
            writer.F1("type");
            BadgeType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/SelectShoppingModeMutation_ResponseAdapter$Variant;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/SelectShoppingModeMutation$Variant;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Variant implements Adapter<SelectShoppingModeMutation.Variant> {

        /* renamed from: a, reason: collision with root package name */
        public static final Variant f9140a = new Variant();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            SelectShoppingModeMutation.OnShoppingModeVariant onShoppingModeVariantA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("ShoppingModeVariant"))) {
                reader.o();
                onShoppingModeVariantA = OnShoppingModeVariant.a(reader, customScalarAdapters);
            }
            return new SelectShoppingModeMutation.Variant(str, onShoppingModeVariantA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SelectShoppingModeMutation.Variant value = (SelectShoppingModeMutation.Variant) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f9100a);
            SelectShoppingModeMutation.OnShoppingModeVariant onShoppingModeVariant = value.b;
            if (onShoppingModeVariant != null) {
                OnShoppingModeVariant.b(writer, customScalarAdapters, onShoppingModeVariant);
            }
        }
    }
}
