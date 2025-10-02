package au.com.woolworths.graphql.common.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.graphql.common.fragment.ProductTrolleyImpl_ResponseAdapter;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFieldsImpl_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.AisleSide;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.InStoreLocationType;
import au.com.woolworths.shop.graphql.type.ProductPromotionTypes;
import au.com.woolworths.shop.graphql.type.PurchaseRestriction;
import au.com.woolworths.shop.graphql.type.RewardsOfferStatus;
import au.com.woolworths.shop.graphql.type.TagStyle;
import au.com.woolworths.shop.graphql.type.adapter.ActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.AisleSide_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ButtonStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InStoreLocationType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ProductPromotionTypes_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.PurchaseRestriction_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.RewardsOfferStatus_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.TagStyle_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.Adapters$DoubleAdapter$1;
import com.apollographql.apollo.api.Adapters$IntAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\bÇ\u0002\u0018\u00002\u00020\u0001:\u001b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCardImpl_ResponseAdapter;", "", "ProductCard", "InStoreAvailabilityInfo", "Button", "InfoSheet", "Button1", "PromotionInfo", "InlineLabel", "Trolley", "Trolley1", "List", "InStoreDetails", "InStoreLocation", "Details", "DisplayInfo", "Marketplace", "RewardsOfferInfo", "OfferAnalytics", "BoostButton", "TagLabel", "ProductVarieties", "Category", "MemberPriceInfo", "MultiBuyPriceInfo", "CartProductInfo", "ProductCardAnalytics", "ProductCardAction", "Analytics", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductCardImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCardImpl_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductCard$Analytics;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<ProductCard.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f8976a = new Analytics();
        public static final java.util.List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            AnalyticsFields analyticsFieldsA = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductCard.Analytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductCard.Analytics value = (ProductCard.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f8950a);
            java.util.List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCardImpl_ResponseAdapter$BoostButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductCard$BoostButton;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BoostButton implements Adapter<ProductCard.BoostButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final BoostButton f8977a = new BoostButton();
        public static final java.util.List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "style", "enabled");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ButtonStyle buttonStyle = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool != null) {
                return new ProductCard.BoostButton(str, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductCard.BoostButton value = (ProductCard.BoostButton) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f8951a);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.b);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.c));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCardImpl_ResponseAdapter$Button;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductCard$Button;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Button implements Adapter<ProductCard.Button> {

        /* renamed from: a, reason: collision with root package name */
        public static final Button f8978a = new Button();
        public static final java.util.List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, UrlHandler.ACTION, "style", "enabled");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ButtonStyle buttonStyle = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool != null) {
                return new ProductCard.Button(str, str2, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductCard.Button value = (ProductCard.Button) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f8952a);
            writer.F1(UrlHandler.ACTION);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.c);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.d));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCardImpl_ResponseAdapter$Button1;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductCard$Button1;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Button1 implements Adapter<ProductCard.Button1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Button1 f8979a = new Button1();
        public static final java.util.List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, UrlHandler.ACTION, "style", "enabled");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ButtonStyle buttonStyle = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool != null) {
                return new ProductCard.Button1(str, str2, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductCard.Button1 value = (ProductCard.Button1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f8953a);
            writer.F1(UrlHandler.ACTION);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.c);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.d));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCardImpl_ResponseAdapter$CartProductInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductCard$CartProductInfo;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CartProductInfo implements Adapter<ProductCard.CartProductInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final CartProductInfo f8980a = new CartProductInfo();
        public static final java.util.List b = CollectionsKt.R("totalPrice", "totalOriginalPrice", "totalDiscount");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        return new ProductCard.CartProductInfo(str, str2, str3);
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductCard.CartProductInfo value = (ProductCard.CartProductInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("totalPrice");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f8954a);
            writer.F1("totalOriginalPrice");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("totalDiscount");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCardImpl_ResponseAdapter$Category;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductCard$Category;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Category implements Adapter<ProductCard.Category> {

        /* renamed from: a, reason: collision with root package name */
        public static final Category f8981a = new Category();
        public static final java.util.List b = CollectionsKt.R(AppMeasurementSdk.ConditionalUserProperty.NAME, "categoryLevel");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Integer num = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new ProductCard.Category(str, num);
                    }
                    num = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductCard.Category value = (ProductCard.Category) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AppMeasurementSdk.ConditionalUserProperty.NAME);
            Adapters.i.toJson(writer, customScalarAdapters, value.f8955a);
            writer.F1("categoryLevel");
            Adapters.k.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCardImpl_ResponseAdapter$Details;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductCard$Details;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Details implements Adapter<ProductCard.Details> {

        /* renamed from: a, reason: collision with root package name */
        public static final Details f8982a = new Details();
        public static final java.util.List b = CollectionsKt.R("aisleNumber", "aisleSide", "bayNumber", "bayNumberAlternate", "floorNumber", "location", "x", "y", "z");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            Double d = null;
            Double d2 = null;
            Double d3 = null;
            AisleSide aisleSideA = null;
            Integer num5 = null;
            String str = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        continue;
                    case 1:
                        aisleSideA = AisleSide_ResponseAdapter.a(reader, customScalarAdapters);
                        continue;
                    case 2:
                        num3 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        continue;
                    case 3:
                        num = num3;
                        num5 = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        num = num3;
                        num4 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        num = num3;
                        str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        num = num3;
                        d = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        num = num3;
                        d2 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        num = num3;
                        d3 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Integer num6 = num3;
                        if (num2 == null) {
                            Assertions.a(reader, "aisleNumber");
                            throw null;
                        }
                        int iIntValue = num2.intValue();
                        if (aisleSideA == null) {
                            Assertions.a(reader, "aisleSide");
                            throw null;
                        }
                        if (num6 == null) {
                            Assertions.a(reader, "bayNumber");
                            throw null;
                        }
                        int iIntValue2 = num6.intValue();
                        if (num4 == null) {
                            Assertions.a(reader, "floorNumber");
                            throw null;
                        }
                        int iIntValue3 = num4.intValue();
                        if (d == null) {
                            Assertions.a(reader, "x");
                            throw null;
                        }
                        double dDoubleValue = d.doubleValue();
                        if (d2 == null) {
                            Assertions.a(reader, "y");
                            throw null;
                        }
                        Double d4 = d3;
                        double dDoubleValue2 = d2.doubleValue();
                        if (d4 != null) {
                            return new ProductCard.Details(dDoubleValue, dDoubleValue2, d4.doubleValue(), iIntValue, iIntValue2, iIntValue3, aisleSideA, num5, str);
                        }
                        Assertions.a(reader, "z");
                        throw null;
                }
                num3 = num;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductCard.Details value = (ProductCard.Details) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("aisleNumber");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.f8956a, adapters$IntAdapter$1, writer, customScalarAdapters, "aisleSide");
            AisleSide_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1("bayNumber");
            d.y(value.c, adapters$IntAdapter$1, writer, customScalarAdapters, "bayNumberAlternate");
            Adapters.k.toJson(writer, customScalarAdapters, value.d);
            writer.F1("floorNumber");
            d.y(value.e, adapters$IntAdapter$1, writer, customScalarAdapters, "location");
            Adapters.i.toJson(writer, customScalarAdapters, value.f);
            writer.F1("x");
            Adapters$DoubleAdapter$1 adapters$DoubleAdapter$1 = Adapters.c;
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.g));
            writer.F1("y");
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.h));
            writer.F1("z");
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.i));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCardImpl_ResponseAdapter$DisplayInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductCard$DisplayInfo;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DisplayInfo implements Adapter<ProductCard.DisplayInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final DisplayInfo f8983a = new DisplayInfo();
        public static final java.util.List b = CollectionsKt.R("locationText", "locationType");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            InStoreLocationType inStoreLocationType = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new ProductCard.DisplayInfo(str, inStoreLocationType);
                    }
                    inStoreLocationType = (InStoreLocationType) Adapters.b(InStoreLocationType_ResponseAdapter.f12080a).fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductCard.DisplayInfo value = (ProductCard.DisplayInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("locationText");
            Adapters.i.toJson(writer, customScalarAdapters, value.f8957a);
            writer.F1("locationType");
            Adapters.b(InStoreLocationType_ResponseAdapter.f12080a).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCardImpl_ResponseAdapter$InStoreAvailabilityInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductCard$InStoreAvailabilityInfo;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InStoreAvailabilityInfo implements Adapter<ProductCard.InStoreAvailabilityInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final InStoreAvailabilityInfo f8984a = new InStoreAvailabilityInfo();
        public static final java.util.List b = CollectionsKt.R("button", "status", "infoSheet");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductCard.Button button = null;
            String str = null;
            ProductCard.InfoSheet infoSheet = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    button = (ProductCard.Button) Adapters.c(Button.f8978a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    infoSheet = (ProductCard.InfoSheet) Adapters.b(Adapters.c(InfoSheet.f8987a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (button != null) {
                return new ProductCard.InStoreAvailabilityInfo(button, str, infoSheet);
            }
            Assertions.a(reader, "button");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductCard.InStoreAvailabilityInfo value = (ProductCard.InStoreAvailabilityInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("button");
            Adapters.c(Button.f8978a, false).toJson(writer, customScalarAdapters, value.f8958a);
            writer.F1("status");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("infoSheet");
            Adapters.b(Adapters.c(InfoSheet.f8987a, false)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCardImpl_ResponseAdapter$InStoreDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductCard$InStoreDetails;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InStoreDetails implements Adapter<ProductCard.InStoreDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final InStoreDetails f8985a = new InStoreDetails();
        public static final java.util.List b = CollectionsKt.R("locationText", "locationType");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            InStoreLocationType inStoreLocationType = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new ProductCard.InStoreDetails(str, inStoreLocationType);
                    }
                    inStoreLocationType = (InStoreLocationType) Adapters.b(InStoreLocationType_ResponseAdapter.f12080a).fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductCard.InStoreDetails value = (ProductCard.InStoreDetails) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("locationText");
            Adapters.i.toJson(writer, customScalarAdapters, value.f8959a);
            writer.F1("locationType");
            Adapters.b(InStoreLocationType_ResponseAdapter.f12080a).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCardImpl_ResponseAdapter$InStoreLocation;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductCard$InStoreLocation;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InStoreLocation implements Adapter<ProductCard.InStoreLocation> {

        /* renamed from: a, reason: collision with root package name */
        public static final InStoreLocation f8986a = new InStoreLocation();
        public static final java.util.List b = CollectionsKt.R(ErrorBundle.DETAIL_ENTRY, "displayInfo");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductCard.Details details = null;
            ProductCard.DisplayInfo displayInfo = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    details = (ProductCard.Details) Adapters.b(Adapters.c(Details.f8982a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new ProductCard.InStoreLocation(details, displayInfo);
                    }
                    displayInfo = (ProductCard.DisplayInfo) Adapters.b(Adapters.c(DisplayInfo.f8983a, false)).fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductCard.InStoreLocation value = (ProductCard.InStoreLocation) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(ErrorBundle.DETAIL_ENTRY);
            Adapters.b(Adapters.c(Details.f8982a, false)).toJson(writer, customScalarAdapters, value.f8960a);
            writer.F1("displayInfo");
            Adapters.b(Adapters.c(DisplayInfo.f8983a, false)).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCardImpl_ResponseAdapter$InfoSheet;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductCard$InfoSheet;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InfoSheet implements Adapter<ProductCard.InfoSheet> {

        /* renamed from: a, reason: collision with root package name */
        public static final InfoSheet f8987a = new InfoSheet();
        public static final java.util.List b = CollectionsKt.R("title", "message", "button");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ProductCard.Button1 button1 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    button1 = (ProductCard.Button1) Adapters.c(Button1.f8979a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "message");
                throw null;
            }
            if (button1 != null) {
                return new ProductCard.InfoSheet(str, str2, button1);
            }
            Assertions.a(reader, "button");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductCard.InfoSheet value = (ProductCard.InfoSheet) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f8961a);
            writer.F1("message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("button");
            Adapters.c(Button1.f8979a, false).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCardImpl_ResponseAdapter$InlineLabel;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductCard$InlineLabel;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InlineLabel implements Adapter<ProductCard.InlineLabel> {

        /* renamed from: a, reason: collision with root package name */
        public static final InlineLabel f8988a = new InlineLabel();
        public static final java.util.List b = CollectionsKt.R("type", AnnotatedPrivateKey.LABEL, "priority");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            Integer num = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    num = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str2 != null) {
                return new ProductCard.InlineLabel(str, str2, num);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductCard.InlineLabel value = (ProductCard.InlineLabel) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f8962a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("priority");
            Adapters.k.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCardImpl_ResponseAdapter$List;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductCard$List;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class List implements Adapter<ProductCard.List> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f8989a = new List();
        public static final java.util.List b = CollectionsKt.R("minimum", "maximum", "increment", "defaultValue", "unit");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Double d = null;
            Double d2 = null;
            Double d3 = null;
            Double d4 = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    d = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    d2 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    d3 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    d4 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (d == null) {
                Assertions.a(reader, "minimum");
                throw null;
            }
            double dDoubleValue = d.doubleValue();
            if (d2 == null) {
                Assertions.a(reader, "maximum");
                throw null;
            }
            double dDoubleValue2 = d2.doubleValue();
            if (d3 == null) {
                Assertions.a(reader, "increment");
                throw null;
            }
            double dDoubleValue3 = d3.doubleValue();
            if (d4 != null) {
                return new ProductCard.List(dDoubleValue, dDoubleValue2, dDoubleValue3, d4.doubleValue(), str);
            }
            Assertions.a(reader, "defaultValue");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductCard.List value = (ProductCard.List) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("minimum");
            Adapters$DoubleAdapter$1 adapters$DoubleAdapter$1 = Adapters.c;
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.f8963a));
            writer.F1("maximum");
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.b));
            writer.F1("increment");
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.c));
            writer.F1("defaultValue");
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.d));
            writer.F1("unit");
            Adapters.i.toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCardImpl_ResponseAdapter$Marketplace;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductCard$Marketplace;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Marketplace implements Adapter<ProductCard.Marketplace> {

        /* renamed from: a, reason: collision with root package name */
        public static final Marketplace f8990a = new Marketplace();
        public static final java.util.List b = CollectionsKt.R("imageUrl", "title", "sellerName", "brandName", "lowestMarketPriceDescription");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "imageUrl");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "sellerName");
                throw null;
            }
            if (str4 != null) {
                return new ProductCard.Marketplace(str, str2, str3, str4, str5);
            }
            Assertions.a(reader, "brandName");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductCard.Marketplace value = (ProductCard.Marketplace) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("imageUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f8964a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("sellerName");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("brandName");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("lowestMarketPriceDescription");
            Adapters.i.toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCardImpl_ResponseAdapter$MemberPriceInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductCard$MemberPriceInfo;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MemberPriceInfo implements Adapter<ProductCard.MemberPriceInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final MemberPriceInfo f8991a = new MemberPriceInfo();
        public static final java.util.List b = CollectionsKt.R("header", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "header");
                throw null;
            }
            if (str2 != null) {
                return new ProductCard.MemberPriceInfo(str, str2, str3);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductCard.MemberPriceInfo value = (ProductCard.MemberPriceInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("header");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f8965a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCardImpl_ResponseAdapter$MultiBuyPriceInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductCard$MultiBuyPriceInfo;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MultiBuyPriceInfo implements Adapter<ProductCard.MultiBuyPriceInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final MultiBuyPriceInfo f8992a = new MultiBuyPriceInfo();
        public static final java.util.List b = CollectionsKt.R("price", "unitPrice");

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
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new ProductCard.MultiBuyPriceInfo(str, str2);
            }
            Assertions.a(reader, "price");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductCard.MultiBuyPriceInfo value = (ProductCard.MultiBuyPriceInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("price");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f8966a);
            writer.F1("unitPrice");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCardImpl_ResponseAdapter$OfferAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductCard$OfferAnalytics;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OfferAnalytics implements Adapter<ProductCard.OfferAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final OfferAnalytics f8993a = new OfferAnalytics();
        public static final java.util.List b = CollectionsKt.R("offerName", "campaignStream", "channel", "status", "offerType", "partnerId", "rtlAccountID", "rtlCampaignID", "rtlCampaignCode");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str6 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str7 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        str8 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        str9 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        return new ProductCard.OfferAnalytics(str, str2, str3, str4, str5, str6, str7, str8, str9);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductCard.OfferAnalytics value = (ProductCard.OfferAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("offerName");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f8967a);
            writer.F1("campaignStream");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("channel");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("status");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("offerType");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("partnerId");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
            writer.F1("rtlAccountID");
            nullableAdapter.toJson(writer, customScalarAdapters, value.g);
            writer.F1("rtlCampaignID");
            nullableAdapter.toJson(writer, customScalarAdapters, value.h);
            writer.F1("rtlCampaignCode");
            nullableAdapter.toJson(writer, customScalarAdapters, value.i);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCardImpl_ResponseAdapter$ProductCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductCard;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductCard implements Adapter<au.com.woolworths.graphql.common.fragment.ProductCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final java.util.List f8994a = CollectionsKt.R("productId", AppMeasurementSdk.ConditionalUserProperty.NAME, "isNew", "purchaseRestriction", "productImage", "isAvailable", "inStoreAvailabilityInfo", "price", "unitOfMeasureLabel", "badgeImage", "promotionInfo", "unitPriceDescription", "wasPrice", "purchaseWarning", "inlineLabels", "trolley", "trolleys", "list", "inStoreDetails", "inStoreLocation", "adId", "source", "marketplace", "rewardsOfferInfo", "disclaimer", "tagLabel", "productVarieties", "categories", "isTobacco", "memberPriceInfo", "multiBuyPriceInfo", "cartProductInfo", "productCardAnalytics", "productCardAction", "pricingFootnoteMd");

        public static au.com.woolworths.graphql.common.fragment.ProductCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            Boolean bool3 = null;
            PurchaseRestriction purchaseRestriction = null;
            String str3 = null;
            Boolean bool4 = null;
            ProductCard.InStoreAvailabilityInfo inStoreAvailabilityInfo = null;
            Integer num = null;
            String str4 = null;
            String str5 = null;
            ProductCard.PromotionInfo promotionInfo = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            java.util.List list = null;
            ProductCard.Trolley trolley = null;
            java.util.List list2 = null;
            ProductCard.List list3 = null;
            ProductCard.InStoreDetails inStoreDetails = null;
            ProductCard.InStoreLocation inStoreLocation = null;
            String str9 = null;
            String str10 = null;
            ProductCard.Marketplace marketplace = null;
            ProductCard.RewardsOfferInfo rewardsOfferInfo = null;
            String str11 = null;
            ProductCard.TagLabel tagLabel = null;
            ProductCard.ProductVarieties productVarieties = null;
            java.util.List list4 = null;
            ProductCard.MemberPriceInfo memberPriceInfo = null;
            ProductCard.MultiBuyPriceInfo multiBuyPriceInfo = null;
            ProductCard.CartProductInfo cartProductInfo = null;
            ProductCard.ProductCardAnalytics productCardAnalytics = null;
            ProductCard.ProductCardAction productCardAction = null;
            String str12 = null;
            while (true) {
                switch (reader.o2(f8994a)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 1:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 2:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 3:
                        purchaseRestriction = (PurchaseRestriction) Adapters.b(PurchaseRestriction_ResponseAdapter.f12109a).fromJson(reader, customScalarAdapters);
                        continue;
                    case 4:
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        continue;
                    case 5:
                        bool3 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 6:
                        bool = bool2;
                        inStoreAvailabilityInfo = (ProductCard.InStoreAvailabilityInfo) Adapters.b(Adapters.c(InStoreAvailabilityInfo.f8984a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        num = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                        continue;
                    case 8:
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        continue;
                    case 9:
                        str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        continue;
                    case 10:
                        bool = bool2;
                        promotionInfo = (ProductCard.PromotionInfo) Adapters.b(Adapters.c(PromotionInfo.f8998a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 11:
                        str6 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        continue;
                    case 12:
                        str7 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        continue;
                    case 13:
                        str8 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        continue;
                    case 14:
                        bool = bool2;
                        list = (java.util.List) Adapters.b(Adapters.a(Adapters.b(Adapters.c(InlineLabel.f8988a, false)))).fromJson(reader, customScalarAdapters);
                        break;
                    case 15:
                        bool = bool2;
                        trolley = (ProductCard.Trolley) Adapters.b(Adapters.c(Trolley.f9001a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 16:
                        bool = bool2;
                        list2 = (java.util.List) Adapters.b(Adapters.a(Adapters.c(Trolley1.f9002a, true))).fromJson(reader, customScalarAdapters);
                        break;
                    case 17:
                        bool = bool2;
                        list3 = (ProductCard.List) Adapters.c(List.f8989a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 18:
                        bool = bool2;
                        inStoreDetails = (ProductCard.InStoreDetails) Adapters.b(Adapters.c(InStoreDetails.f8985a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 19:
                        bool = bool2;
                        inStoreLocation = (ProductCard.InStoreLocation) Adapters.b(Adapters.c(InStoreLocation.f8986a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 20:
                        str9 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        continue;
                    case 21:
                        str10 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        continue;
                    case 22:
                        bool = bool2;
                        marketplace = (ProductCard.Marketplace) Adapters.b(Adapters.c(Marketplace.f8990a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 23:
                        bool = bool2;
                        rewardsOfferInfo = (ProductCard.RewardsOfferInfo) Adapters.b(Adapters.c(RewardsOfferInfo.f8999a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 24:
                        str11 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        continue;
                    case 25:
                        bool = bool2;
                        tagLabel = (ProductCard.TagLabel) Adapters.b(Adapters.c(TagLabel.f9000a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 26:
                        bool = bool2;
                        productVarieties = (ProductCard.ProductVarieties) Adapters.b(Adapters.c(ProductVarieties.f8997a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 27:
                        bool = bool2;
                        list4 = (java.util.List) Adapters.b(Adapters.a(Adapters.c(Category.f8981a, false))).fromJson(reader, customScalarAdapters);
                        break;
                    case 28:
                        bool4 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 29:
                        bool = bool2;
                        memberPriceInfo = (ProductCard.MemberPriceInfo) Adapters.b(Adapters.c(MemberPriceInfo.f8991a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 30:
                        bool = bool2;
                        multiBuyPriceInfo = (ProductCard.MultiBuyPriceInfo) Adapters.b(Adapters.c(MultiBuyPriceInfo.f8992a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 31:
                        bool = bool2;
                        cartProductInfo = (ProductCard.CartProductInfo) Adapters.b(Adapters.c(CartProductInfo.f8980a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 32:
                        bool = bool2;
                        productCardAnalytics = (ProductCard.ProductCardAnalytics) Adapters.b(Adapters.c(ProductCardAnalytics.f8996a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 33:
                        bool = bool2;
                        productCardAction = (ProductCard.ProductCardAction) Adapters.b(Adapters.c(ProductCardAction.f8995a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 34:
                        str12 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        continue;
                    default:
                        Boolean bool5 = bool2;
                        if (str == null) {
                            Assertions.a(reader, "productId");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, AppMeasurementSdk.ConditionalUserProperty.NAME);
                            throw null;
                        }
                        if (bool5 == null) {
                            Assertions.a(reader, "isNew");
                            throw null;
                        }
                        Boolean bool6 = bool3;
                        boolean zBooleanValue = bool5.booleanValue();
                        if (bool6 == null) {
                            Assertions.a(reader, "isAvailable");
                            throw null;
                        }
                        Boolean bool7 = bool4;
                        boolean zBooleanValue2 = bool6.booleanValue();
                        if (list3 == null) {
                            Assertions.a(reader, "list");
                            throw null;
                        }
                        if (bool7 != null) {
                            return new au.com.woolworths.graphql.common.fragment.ProductCard(str, str2, zBooleanValue, purchaseRestriction, str3, zBooleanValue2, inStoreAvailabilityInfo, num, str4, str5, promotionInfo, str6, str7, str8, list, trolley, list2, list3, inStoreDetails, inStoreLocation, str9, str10, marketplace, rewardsOfferInfo, str11, tagLabel, productVarieties, list4, bool7.booleanValue(), memberPriceInfo, multiBuyPriceInfo, cartProductInfo, productCardAnalytics, productCardAction, str12);
                        }
                        Assertions.a(reader, "isTobacco");
                        throw null;
                }
                bool2 = bool;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, au.com.woolworths.graphql.common.fragment.ProductCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productId");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f8949a);
            writer.F1(AppMeasurementSdk.ConditionalUserProperty.NAME);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("isNew");
            Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
            d.B(value.c, adapters$BooleanAdapter$1, writer, customScalarAdapters, "purchaseRestriction");
            Adapters.b(PurchaseRestriction_ResponseAdapter.f12109a).toJson(writer, customScalarAdapters, value.d);
            writer.F1("productImage");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("isAvailable");
            d.B(value.f, adapters$BooleanAdapter$1, writer, customScalarAdapters, "inStoreAvailabilityInfo");
            Adapters.b(Adapters.c(InStoreAvailabilityInfo.f8984a, false)).toJson(writer, customScalarAdapters, value.g);
            writer.F1("price");
            Adapters.k.toJson(writer, customScalarAdapters, value.h);
            writer.F1("unitOfMeasureLabel");
            nullableAdapter.toJson(writer, customScalarAdapters, value.i);
            writer.F1("badgeImage");
            nullableAdapter.toJson(writer, customScalarAdapters, value.j);
            writer.F1("promotionInfo");
            Adapters.b(Adapters.c(PromotionInfo.f8998a, false)).toJson(writer, customScalarAdapters, value.k);
            writer.F1("unitPriceDescription");
            nullableAdapter.toJson(writer, customScalarAdapters, value.l);
            writer.F1("wasPrice");
            nullableAdapter.toJson(writer, customScalarAdapters, value.m);
            writer.F1("purchaseWarning");
            nullableAdapter.toJson(writer, customScalarAdapters, value.n);
            writer.F1("inlineLabels");
            Adapters.b(Adapters.a(Adapters.b(Adapters.c(InlineLabel.f8988a, false)))).toJson(writer, customScalarAdapters, value.o);
            writer.F1("trolley");
            Adapters.b(Adapters.c(Trolley.f9001a, true)).toJson(writer, customScalarAdapters, value.p);
            writer.F1("trolleys");
            Adapters.b(Adapters.a(Adapters.c(Trolley1.f9002a, true))).toJson(writer, customScalarAdapters, value.q);
            writer.F1("list");
            Adapters.c(List.f8989a, false).toJson(writer, customScalarAdapters, value.r);
            writer.F1("inStoreDetails");
            Adapters.b(Adapters.c(InStoreDetails.f8985a, false)).toJson(writer, customScalarAdapters, value.s);
            writer.F1("inStoreLocation");
            Adapters.b(Adapters.c(InStoreLocation.f8986a, false)).toJson(writer, customScalarAdapters, value.t);
            writer.F1("adId");
            nullableAdapter.toJson(writer, customScalarAdapters, value.u);
            writer.F1("source");
            nullableAdapter.toJson(writer, customScalarAdapters, value.v);
            writer.F1("marketplace");
            Adapters.b(Adapters.c(Marketplace.f8990a, false)).toJson(writer, customScalarAdapters, value.w);
            writer.F1("rewardsOfferInfo");
            Adapters.b(Adapters.c(RewardsOfferInfo.f8999a, false)).toJson(writer, customScalarAdapters, value.x);
            writer.F1("disclaimer");
            nullableAdapter.toJson(writer, customScalarAdapters, value.y);
            writer.F1("tagLabel");
            Adapters.b(Adapters.c(TagLabel.f9000a, false)).toJson(writer, customScalarAdapters, value.z);
            writer.F1("productVarieties");
            Adapters.b(Adapters.c(ProductVarieties.f8997a, false)).toJson(writer, customScalarAdapters, value.A);
            writer.F1("categories");
            Adapters.b(Adapters.a(Adapters.c(Category.f8981a, false))).toJson(writer, customScalarAdapters, value.B);
            writer.F1("isTobacco");
            d.B(value.C, adapters$BooleanAdapter$1, writer, customScalarAdapters, "memberPriceInfo");
            Adapters.b(Adapters.c(MemberPriceInfo.f8991a, false)).toJson(writer, customScalarAdapters, value.D);
            writer.F1("multiBuyPriceInfo");
            Adapters.b(Adapters.c(MultiBuyPriceInfo.f8992a, false)).toJson(writer, customScalarAdapters, value.E);
            writer.F1("cartProductInfo");
            Adapters.b(Adapters.c(CartProductInfo.f8980a, false)).toJson(writer, customScalarAdapters, value.F);
            writer.F1("productCardAnalytics");
            Adapters.b(Adapters.c(ProductCardAnalytics.f8996a, true)).toJson(writer, customScalarAdapters, value.G);
            writer.F1("productCardAction");
            Adapters.b(Adapters.c(ProductCardAction.f8995a, false)).toJson(writer, customScalarAdapters, value.H);
            writer.F1("pricingFootnoteMd");
            nullableAdapter.toJson(writer, customScalarAdapters, value.I);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (au.com.woolworths.graphql.common.fragment.ProductCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCardImpl_ResponseAdapter$ProductCardAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductCard$ProductCardAction;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductCardAction implements Adapter<ProductCard.ProductCardAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductCardAction f8995a = new ProductCardAction();
        public static final java.util.List b = CollectionsKt.R(UrlHandler.ACTION, "type", "id", "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ActionType actionTypeA = null;
            String str2 = null;
            ProductCard.Analytics analytics = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    analytics = (ProductCard.Analytics) Adapters.b(Adapters.c(Analytics.f8976a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, UrlHandler.ACTION);
                throw null;
            }
            if (actionTypeA != null) {
                return new ProductCard.ProductCardAction(str, actionTypeA, str2, analytics);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductCard.ProductCardAction value = (ProductCard.ProductCardAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f8968a);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics.f8976a, true)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCardImpl_ResponseAdapter$ProductCardAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductCard$ProductCardAnalytics;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductCardAnalytics implements Adapter<ProductCard.ProductCardAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductCardAnalytics f8996a = new ProductCardAnalytics();
        public static final java.util.List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            AnalyticsFields analyticsFieldsA = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductCard.ProductCardAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductCard.ProductCardAnalytics value = (ProductCard.ProductCardAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f8969a);
            java.util.List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCardImpl_ResponseAdapter$ProductVarieties;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductCard$ProductVarieties;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductVarieties implements Adapter<ProductCard.ProductVarieties> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductVarieties f8997a = new ProductVarieties();
        public static final java.util.List b = CollectionsKt.R("totalCount", AnnotatedPrivateKey.LABEL, "priceFamilyId");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (num == null) {
                Assertions.a(reader, "totalCount");
                throw null;
            }
            int iIntValue = num.intValue();
            if (str2 != null) {
                return new ProductCard.ProductVarieties(iIntValue, str, str2);
            }
            Assertions.a(reader, "priceFamilyId");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductCard.ProductVarieties value = (ProductCard.ProductVarieties) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("totalCount");
            d.y(value.f8970a, Adapters.b, writer, customScalarAdapters, AnnotatedPrivateKey.LABEL);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("priceFamilyId");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCardImpl_ResponseAdapter$PromotionInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductCard$PromotionInfo;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PromotionInfo implements Adapter<ProductCard.PromotionInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final PromotionInfo f8998a = new PromotionInfo();
        public static final java.util.List b = CollectionsKt.R("type", AnnotatedPrivateKey.LABEL);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductPromotionTypes productPromotionTypesA = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    productPromotionTypesA = ProductPromotionTypes_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (productPromotionTypesA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str != null) {
                return new ProductCard.PromotionInfo(productPromotionTypesA, str);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductCard.PromotionInfo value = (ProductCard.PromotionInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            writer.v0(value.f8971a.d);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCardImpl_ResponseAdapter$RewardsOfferInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductCard$RewardsOfferInfo;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsOfferInfo implements Adapter<ProductCard.RewardsOfferInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final RewardsOfferInfo f8999a = new RewardsOfferInfo();
        public static final java.util.List b = CollectionsKt.R("offerId", "offerStatus", "displayStatus", "displayExpiry", "minimumSpend", "offerAnalytics", "boostButton");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            RewardsOfferStatus rewardsOfferStatusA = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ProductCard.OfferAnalytics offerAnalytics = null;
            ProductCard.BoostButton boostButton = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        rewardsOfferStatusA = RewardsOfferStatus_ResponseAdapter.a(reader, customScalarAdapters);
                        break;
                    case 2:
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        offerAnalytics = (ProductCard.OfferAnalytics) Adapters.b(Adapters.c(OfferAnalytics.f8993a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        boostButton = (ProductCard.BoostButton) Adapters.b(Adapters.c(BoostButton.f8977a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "offerId");
                            throw null;
                        }
                        if (rewardsOfferStatusA == null) {
                            Assertions.a(reader, "offerStatus");
                            throw null;
                        }
                        if (str3 != null) {
                            return new ProductCard.RewardsOfferInfo(str, rewardsOfferStatusA, str2, str3, str4, offerAnalytics, boostButton);
                        }
                        Assertions.a(reader, "displayExpiry");
                        throw null;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductCard.RewardsOfferInfo value = (ProductCard.RewardsOfferInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("offerId");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f8972a);
            writer.F1("offerStatus");
            RewardsOfferStatus_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1("displayStatus");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("displayExpiry");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("minimumSpend");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("offerAnalytics");
            Adapters.b(Adapters.c(OfferAnalytics.f8993a, false)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("boostButton");
            Adapters.b(Adapters.c(BoostButton.f8977a, false)).toJson(writer, customScalarAdapters, value.g);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCardImpl_ResponseAdapter$TagLabel;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductCard$TagLabel;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TagLabel implements Adapter<ProductCard.TagLabel> {

        /* renamed from: a, reason: collision with root package name */
        public static final TagLabel f9000a = new TagLabel();
        public static final java.util.List b = CollectionsKt.R(TextBundle.TEXT_ENTRY, "style");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            TagStyle tagStyle = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    tagStyle = (TagStyle) Adapters.b(TagStyle_ResponseAdapter.f12127a).fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new ProductCard.TagLabel(str, tagStyle);
            }
            Assertions.a(reader, TextBundle.TEXT_ENTRY);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductCard.TagLabel value = (ProductCard.TagLabel) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f8973a);
            writer.F1("style");
            Adapters.b(TagStyle_ResponseAdapter.f12127a).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCardImpl_ResponseAdapter$Trolley;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductCard$Trolley;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Trolley implements Adapter<ProductCard.Trolley> {

        /* renamed from: a, reason: collision with root package name */
        public static final Trolley f9001a = new Trolley();
        public static final java.util.List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ProductTrolley productTrolleyA = ProductTrolleyImpl_ResponseAdapter.ProductTrolley.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductCard.Trolley(str, productTrolleyA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductCard.Trolley value = (ProductCard.Trolley) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f8974a);
            java.util.List list = ProductTrolleyImpl_ResponseAdapter.ProductTrolley.f9026a;
            ProductTrolleyImpl_ResponseAdapter.ProductTrolley.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductCardImpl_ResponseAdapter$Trolley1;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductCard$Trolley1;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Trolley1 implements Adapter<ProductCard.Trolley1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Trolley1 f9002a = new Trolley1();
        public static final java.util.List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ProductTrolley productTrolleyA = ProductTrolleyImpl_ResponseAdapter.ProductTrolley.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductCard.Trolley1(str, productTrolleyA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductCard.Trolley1 value = (ProductCard.Trolley1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f8975a);
            java.util.List list = ProductTrolleyImpl_ResponseAdapter.ProductTrolley.f9026a;
            ProductTrolleyImpl_ResponseAdapter.ProductTrolley.b(writer, customScalarAdapters, value.b);
        }
    }
}
