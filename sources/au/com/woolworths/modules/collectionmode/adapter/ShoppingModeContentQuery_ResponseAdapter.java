package au.com.woolworths.modules.collectionmode.adapter;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.modules.collectionmode.ShoppingModeContentQuery;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001:\u0011\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/ShoppingModeContentQuery_ResponseAdapter;", "", "Data", "ShoppingModes", "Mode", "OnShoppingMode", "Variant", "OnShoppingModeVariant", "Price", "OnPrice", "OnPriceRange", "Condition", "StatusBadge", "Fulfilment", "OnDividerCard", "OnShoppingModeVariantFulfilmentWindowState", "FulfilmentWindowStateSubtitle", "FulfilmentWindowStateButton", "OnButton", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShoppingModeContentQuery_ResponseAdapter {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/ShoppingModeContentQuery_ResponseAdapter$Condition;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$Condition;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Condition implements Adapter<ShoppingModeContentQuery.Condition> {

        /* renamed from: a, reason: collision with root package name */
        public static final Condition f9141a = new Condition();
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
                return new ShoppingModeContentQuery.Condition(str);
            }
            Assertions.a(reader, TextBundle.TEXT_ENTRY);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShoppingModeContentQuery.Condition value = (ShoppingModeContentQuery.Condition) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f9101a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/ShoppingModeContentQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$Data;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<ShoppingModeContentQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f9142a = new Data();
        public static final List b = CollectionsKt.Q("shoppingModes");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ShoppingModeContentQuery.ShoppingModes shoppingModes = null;
            while (reader.o2(b) == 0) {
                shoppingModes = (ShoppingModeContentQuery.ShoppingModes) Adapters.c(ShoppingModes.f9155a, false).fromJson(reader, customScalarAdapters);
            }
            if (shoppingModes != null) {
                return new ShoppingModeContentQuery.Data(shoppingModes);
            }
            Assertions.a(reader, "shoppingModes");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShoppingModeContentQuery.Data value = (ShoppingModeContentQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("shoppingModes");
            Adapters.c(ShoppingModes.f9155a, false).toJson(writer, customScalarAdapters, value.f9102a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/ShoppingModeContentQuery_ResponseAdapter$Fulfilment;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$Fulfilment;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Fulfilment implements Adapter<ShoppingModeContentQuery.Fulfilment> {

        /* renamed from: a, reason: collision with root package name */
        public static final Fulfilment f9143a = new Fulfilment();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            ShoppingModeContentQuery.OnDividerCard onDividerCardA;
            ShoppingModeContentQuery.OnShoppingModeVariantFulfilmentWindowState onShoppingModeVariantFulfilmentWindowStateA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ShoppingModeContentQuery.OnButton onButtonA = null;
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
            return new ShoppingModeContentQuery.Fulfilment(str, onDividerCardA, onShoppingModeVariantFulfilmentWindowStateA, onButtonA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShoppingModeContentQuery.Fulfilment value = (ShoppingModeContentQuery.Fulfilment) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f9103a);
            ShoppingModeContentQuery.OnDividerCard onDividerCard = value.b;
            if (onDividerCard != null) {
                List list = OnDividerCard.f9148a;
                writer.F1("_excluded");
                Adapters.l.toJson(writer, customScalarAdapters, onDividerCard.f9108a);
            }
            ShoppingModeContentQuery.OnShoppingModeVariantFulfilmentWindowState onShoppingModeVariantFulfilmentWindowState = value.c;
            if (onShoppingModeVariantFulfilmentWindowState != null) {
                OnShoppingModeVariantFulfilmentWindowState.b(writer, customScalarAdapters, onShoppingModeVariantFulfilmentWindowState);
            }
            ShoppingModeContentQuery.OnButton onButton = value.d;
            if (onButton != null) {
                OnButton.b(writer, customScalarAdapters, onButton);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/ShoppingModeContentQuery_ResponseAdapter$FulfilmentWindowStateButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$FulfilmentWindowStateButton;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FulfilmentWindowStateButton implements Adapter<ShoppingModeContentQuery.FulfilmentWindowStateButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final FulfilmentWindowStateButton f9144a = new FulfilmentWindowStateButton();
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
                return new ShoppingModeContentQuery.FulfilmentWindowStateButton(str, buttonStyle, bool3.booleanValue(), str2, str3);
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShoppingModeContentQuery.FulfilmentWindowStateButton value = (ShoppingModeContentQuery.FulfilmentWindowStateButton) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f9104a);
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/ShoppingModeContentQuery_ResponseAdapter$FulfilmentWindowStateSubtitle;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$FulfilmentWindowStateSubtitle;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FulfilmentWindowStateSubtitle implements Adapter<ShoppingModeContentQuery.FulfilmentWindowStateSubtitle> {

        /* renamed from: a, reason: collision with root package name */
        public static final FulfilmentWindowStateSubtitle f9145a = new FulfilmentWindowStateSubtitle();
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
                return new ShoppingModeContentQuery.FulfilmentWindowStateSubtitle(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShoppingModeContentQuery.FulfilmentWindowStateSubtitle value = (ShoppingModeContentQuery.FulfilmentWindowStateSubtitle) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f9105a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/ShoppingModeContentQuery_ResponseAdapter$Mode;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$Mode;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Mode implements Adapter<ShoppingModeContentQuery.Mode> {

        /* renamed from: a, reason: collision with root package name */
        public static final Mode f9146a = new Mode();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ShoppingModeContentQuery.OnShoppingMode onShoppingModeA = null;
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
            return new ShoppingModeContentQuery.Mode(str, onShoppingModeA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShoppingModeContentQuery.Mode value = (ShoppingModeContentQuery.Mode) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f9106a);
            ShoppingModeContentQuery.OnShoppingMode onShoppingMode = value.b;
            if (onShoppingMode != null) {
                OnShoppingMode.b(writer, customScalarAdapters, onShoppingMode);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/ShoppingModeContentQuery_ResponseAdapter$OnButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$OnButton;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnButton implements Adapter<ShoppingModeContentQuery.OnButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f9147a = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "style", "enabled", UrlHandler.ACTION, "url");

        public static ShoppingModeContentQuery.OnButton a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            ButtonStyle buttonStyle = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(f9147a);
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
                return new ShoppingModeContentQuery.OnButton(str, buttonStyle, bool3.booleanValue(), str2, str3);
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ShoppingModeContentQuery.OnButton value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f9107a);
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
            b(jsonWriter, customScalarAdapters, (ShoppingModeContentQuery.OnButton) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/ShoppingModeContentQuery_ResponseAdapter$OnDividerCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$OnDividerCard;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnDividerCard implements Adapter<ShoppingModeContentQuery.OnDividerCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f9148a = CollectionsKt.Q("_excluded");

        public static ShoppingModeContentQuery.OnDividerCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            while (reader.o2(f9148a) == 0) {
                bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
            }
            return new ShoppingModeContentQuery.OnDividerCard(bool);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShoppingModeContentQuery.OnDividerCard value = (ShoppingModeContentQuery.OnDividerCard) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.f9108a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/ShoppingModeContentQuery_ResponseAdapter$OnPrice;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$OnPrice;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPrice implements Adapter<ShoppingModeContentQuery.OnPrice> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f9149a = CollectionsKt.R(TextBundle.TEXT_ENTRY, "value", "suffix");

        public static ShoppingModeContentQuery.OnPrice a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Integer num = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f9149a);
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
                return new ShoppingModeContentQuery.OnPrice(str, num.intValue(), str2);
            }
            Assertions.a(reader, "value");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ShoppingModeContentQuery.OnPrice value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f9109a);
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
            b(jsonWriter, customScalarAdapters, (ShoppingModeContentQuery.OnPrice) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/ShoppingModeContentQuery_ResponseAdapter$OnPriceRange;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$OnPriceRange;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPriceRange implements Adapter<ShoppingModeContentQuery.OnPriceRange> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f9150a = CollectionsKt.R(TextBundle.TEXT_ENTRY, "min", "max", "suffix");

        public static ShoppingModeContentQuery.OnPriceRange a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Integer num = null;
            Integer num2 = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f9150a);
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
                return new ShoppingModeContentQuery.OnPriceRange(str, iIntValue, num2.intValue(), str2);
            }
            Assertions.a(reader, "max");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ShoppingModeContentQuery.OnPriceRange value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f9110a);
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
            b(jsonWriter, customScalarAdapters, (ShoppingModeContentQuery.OnPriceRange) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/ShoppingModeContentQuery_ResponseAdapter$OnShoppingMode;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$OnShoppingMode;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnShoppingMode implements Adapter<ShoppingModeContentQuery.OnShoppingMode> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f9151a = CollectionsKt.R("type", "title", "variants");

        public static ShoppingModeContentQuery.OnShoppingMode a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ShoppingModeType shoppingModeTypeA = null;
            String str = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f9151a);
                if (iO2 == 0) {
                    shoppingModeTypeA = ShoppingModeType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Variant.f9157a, true)).fromJson(reader, customScalarAdapters);
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
                return new ShoppingModeContentQuery.OnShoppingMode(shoppingModeTypeA, str, arrayListFromJson);
            }
            Assertions.a(reader, "variants");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ShoppingModeContentQuery.OnShoppingMode value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            ShoppingModeType_ResponseAdapter.b(writer, customScalarAdapters, value.f9111a);
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("variants");
            Adapters.a(Adapters.c(Variant.f9157a, true)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ShoppingModeContentQuery.OnShoppingMode) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/ShoppingModeContentQuery_ResponseAdapter$OnShoppingModeVariant;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$OnShoppingModeVariant;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnShoppingModeVariant implements Adapter<ShoppingModeContentQuery.OnShoppingModeVariant> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f9152a = CollectionsKt.R("id", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "state", "status", "price", "conditions", "statusBadge", "footnote", "expressDeliveryStoreId", "fulfilment");

        public static ShoppingModeContentQuery.OnShoppingModeVariant a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ShoppingModeId shoppingModeIdA = null;
            String str = null;
            String str2 = null;
            ShoppingModeVariantState shoppingModeVariantStateA = null;
            DeliveryWindowStatus deliveryWindowStatus = null;
            ShoppingModeContentQuery.Price price = null;
            List list = null;
            ShoppingModeContentQuery.StatusBadge statusBadge = null;
            String str3 = null;
            Integer num = null;
            List list2 = null;
            while (true) {
                switch (reader.o2(f9152a)) {
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
                        price = (ShoppingModeContentQuery.Price) Adapters.b(Adapters.c(Price.f9154a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        list = (List) Adapters.b(Adapters.a(Adapters.b(Adapters.c(Condition.f9141a, false)))).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        statusBadge = (ShoppingModeContentQuery.StatusBadge) Adapters.b(Adapters.c(StatusBadge.f9156a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        num = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        list2 = (List) Adapters.b(Adapters.a(Adapters.c(Fulfilment.f9143a, true))).fromJson(reader, customScalarAdapters);
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
                            return new ShoppingModeContentQuery.OnShoppingModeVariant(shoppingModeIdA, str, str2, shoppingModeVariantStateA, deliveryWindowStatus, price, list, statusBadge, str3, num, list2);
                        }
                        Assertions.a(reader, "state");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ShoppingModeContentQuery.OnShoppingModeVariant value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            ShoppingModeId_ResponseAdapter.b(writer, customScalarAdapters, value.f9112a);
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
            Adapters.b(Adapters.c(Price.f9154a, true)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("conditions");
            Adapters.b(Adapters.a(Adapters.b(Adapters.c(Condition.f9141a, false)))).toJson(writer, customScalarAdapters, value.g);
            writer.F1("statusBadge");
            Adapters.b(Adapters.c(StatusBadge.f9156a, false)).toJson(writer, customScalarAdapters, value.h);
            writer.F1("footnote");
            Adapters.i.toJson(writer, customScalarAdapters, value.i);
            writer.F1("expressDeliveryStoreId");
            Adapters.k.toJson(writer, customScalarAdapters, value.j);
            writer.F1("fulfilment");
            Adapters.b(Adapters.a(Adapters.c(Fulfilment.f9143a, true))).toJson(writer, customScalarAdapters, value.k);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ShoppingModeContentQuery.OnShoppingModeVariant) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/ShoppingModeContentQuery_ResponseAdapter$OnShoppingModeVariantFulfilmentWindowState;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$OnShoppingModeVariantFulfilmentWindowState;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnShoppingModeVariantFulfilmentWindowState implements Adapter<ShoppingModeContentQuery.OnShoppingModeVariantFulfilmentWindowState> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f9153a = CollectionsKt.R("fulfilmentWindowStateTitle", "fulfilmentWindowStateSubtitle", "fulfilmentWindowStateButton");

        public static ShoppingModeContentQuery.OnShoppingModeVariantFulfilmentWindowState a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ShoppingModeContentQuery.FulfilmentWindowStateSubtitle fulfilmentWindowStateSubtitle = null;
            ShoppingModeContentQuery.FulfilmentWindowStateButton fulfilmentWindowStateButton = null;
            while (true) {
                int iO2 = reader.o2(f9153a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    fulfilmentWindowStateSubtitle = (ShoppingModeContentQuery.FulfilmentWindowStateSubtitle) Adapters.b(Adapters.c(FulfilmentWindowStateSubtitle.f9145a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    fulfilmentWindowStateButton = (ShoppingModeContentQuery.FulfilmentWindowStateButton) Adapters.c(FulfilmentWindowStateButton.f9144a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "fulfilmentWindowStateTitle");
                throw null;
            }
            if (fulfilmentWindowStateButton != null) {
                return new ShoppingModeContentQuery.OnShoppingModeVariantFulfilmentWindowState(str, fulfilmentWindowStateSubtitle, fulfilmentWindowStateButton);
            }
            Assertions.a(reader, "fulfilmentWindowStateButton");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ShoppingModeContentQuery.OnShoppingModeVariantFulfilmentWindowState value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("fulfilmentWindowStateTitle");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f9113a);
            writer.F1("fulfilmentWindowStateSubtitle");
            Adapters.b(Adapters.c(FulfilmentWindowStateSubtitle.f9145a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("fulfilmentWindowStateButton");
            Adapters.c(FulfilmentWindowStateButton.f9144a, false).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ShoppingModeContentQuery.OnShoppingModeVariantFulfilmentWindowState) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/ShoppingModeContentQuery_ResponseAdapter$Price;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$Price;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Price implements Adapter<ShoppingModeContentQuery.Price> {

        /* renamed from: a, reason: collision with root package name */
        public static final Price f9154a = new Price();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            ShoppingModeContentQuery.OnPrice onPriceA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ShoppingModeContentQuery.OnPriceRange onPriceRangeA = null;
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
            return new ShoppingModeContentQuery.Price(str, onPriceA, onPriceRangeA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShoppingModeContentQuery.Price value = (ShoppingModeContentQuery.Price) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f9114a);
            ShoppingModeContentQuery.OnPrice onPrice = value.b;
            if (onPrice != null) {
                OnPrice.b(writer, customScalarAdapters, onPrice);
            }
            ShoppingModeContentQuery.OnPriceRange onPriceRange = value.c;
            if (onPriceRange != null) {
                OnPriceRange.b(writer, customScalarAdapters, onPriceRange);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/ShoppingModeContentQuery_ResponseAdapter$ShoppingModes;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$ShoppingModes;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShoppingModes implements Adapter<ShoppingModeContentQuery.ShoppingModes> {

        /* renamed from: a, reason: collision with root package name */
        public static final ShoppingModes f9155a = new ShoppingModes();
        public static final List b = CollectionsKt.Q("modes");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(b) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(Mode.f9146a, true)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new ShoppingModeContentQuery.ShoppingModes(arrayListFromJson);
            }
            Assertions.a(reader, "modes");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShoppingModeContentQuery.ShoppingModes value = (ShoppingModeContentQuery.ShoppingModes) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("modes");
            Adapters.a(Adapters.c(Mode.f9146a, true)).toJson(writer, customScalarAdapters, value.f9115a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/ShoppingModeContentQuery_ResponseAdapter$StatusBadge;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$StatusBadge;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StatusBadge implements Adapter<ShoppingModeContentQuery.StatusBadge> {

        /* renamed from: a, reason: collision with root package name */
        public static final StatusBadge f9156a = new StatusBadge();
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
                return new ShoppingModeContentQuery.StatusBadge(str, badgeTypeA);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShoppingModeContentQuery.StatusBadge value = (ShoppingModeContentQuery.StatusBadge) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f9116a);
            writer.F1("type");
            BadgeType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/ShoppingModeContentQuery_ResponseAdapter$Variant;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/ShoppingModeContentQuery$Variant;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Variant implements Adapter<ShoppingModeContentQuery.Variant> {

        /* renamed from: a, reason: collision with root package name */
        public static final Variant f9157a = new Variant();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ShoppingModeContentQuery.OnShoppingModeVariant onShoppingModeVariantA = null;
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
            return new ShoppingModeContentQuery.Variant(str, onShoppingModeVariantA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShoppingModeContentQuery.Variant value = (ShoppingModeContentQuery.Variant) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f9117a);
            ShoppingModeContentQuery.OnShoppingModeVariant onShoppingModeVariant = value.b;
            if (onShoppingModeVariant != null) {
                OnShoppingModeVariant.b(writer, customScalarAdapters, onShoppingModeVariant);
            }
        }
    }
}
