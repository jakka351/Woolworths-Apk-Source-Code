package au.com.woolworths.graphql.common.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductReviewResponse;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFieldsImpl_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.BadgeType;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.ProductReviewAlternativeType;
import au.com.woolworths.shop.graphql.type.ProductReviewGroupType;
import au.com.woolworths.shop.graphql.type.adapter.BadgeType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerActionPlacement_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerDisplayType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ProductReviewAlternativeType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ProductReviewGroupType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$DoubleAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductReviewResponseImpl_ResponseAdapter;", "", "ProductReviewResponse", "Feed", "OnProductReviewGroup", "Banner", "Action", "Product", "Badge", "QuantityInfo", "Alternative", "Analytics", "Analytic", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductReviewResponseImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductReviewResponseImpl_ResponseAdapter$Action;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductReviewResponse$Action;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action implements Adapter<ProductReviewResponse.Action> {

        /* renamed from: a, reason: collision with root package name */
        public static final Action f9014a = new Action();
        public static final List b = CollectionsKt.R("placement", "type", AnnotatedPrivateKey.LABEL, "url");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerActionPlacement insetBannerActionPlacementA = null;
            InsetBannerActionType insetBannerActionTypeA = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    insetBannerActionPlacementA = InsetBannerActionPlacement_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    insetBannerActionTypeA = InsetBannerActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerActionPlacementA == null) {
                Assertions.a(reader, "placement");
                throw null;
            }
            if (insetBannerActionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str != null) {
                return new ProductReviewResponse.Action(insetBannerActionPlacementA, insetBannerActionTypeA, str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductReviewResponse.Action value = (ProductReviewResponse.Action) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("placement");
            InsetBannerActionPlacement_ResponseAdapter.b(writer, customScalarAdapters, value.f9004a);
            writer.F1("type");
            InsetBannerActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductReviewResponseImpl_ResponseAdapter$Alternative;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductReviewResponse$Alternative;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Alternative implements Adapter<ProductReviewResponse.Alternative> {

        /* renamed from: a, reason: collision with root package name */
        public static final Alternative f9015a = new Alternative();
        public static final List b = CollectionsKt.R("title", "type");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ProductReviewAlternativeType productReviewAlternativeTypeA = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    productReviewAlternativeTypeA = ProductReviewAlternativeType_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (productReviewAlternativeTypeA != null) {
                return new ProductReviewResponse.Alternative(str, productReviewAlternativeTypeA);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductReviewResponse.Alternative value = (ProductReviewResponse.Alternative) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f9005a);
            writer.F1("type");
            writer.v0(value.b.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductReviewResponseImpl_ResponseAdapter$Analytic;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductReviewResponse$Analytic;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytic implements Adapter<ProductReviewResponse.Analytic> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytic f9016a = new Analytic();
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
            AnalyticsFields analyticsFieldsA = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductReviewResponse.Analytic(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductReviewResponse.Analytic value = (ProductReviewResponse.Analytic) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f9006a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductReviewResponseImpl_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductReviewResponse$Analytics;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<ProductReviewResponse.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f9017a = new Analytics();
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
            AnalyticsFields analyticsFieldsA = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductReviewResponse.Analytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductReviewResponse.Analytics value = (ProductReviewResponse.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f9007a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductReviewResponseImpl_ResponseAdapter$Badge;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductReviewResponse$Badge;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Badge implements Adapter<ProductReviewResponse.Badge> {

        /* renamed from: a, reason: collision with root package name */
        public static final Badge f9018a = new Badge();
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
                return new ProductReviewResponse.Badge(str, badgeTypeA);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductReviewResponse.Badge value = (ProductReviewResponse.Badge) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f9008a);
            writer.F1("type");
            BadgeType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductReviewResponseImpl_ResponseAdapter$Banner;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductReviewResponse$Banner;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Banner implements Adapter<ProductReviewResponse.Banner> {

        /* renamed from: a, reason: collision with root package name */
        public static final Banner f9019a = new Banner();
        public static final List b = CollectionsKt.R("displayType", "message", "iconUrl", "bannerTitle", UrlHandler.ACTION);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerDisplayType insetBannerDisplayTypeA = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            ProductReviewResponse.Action action = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    insetBannerDisplayTypeA = InsetBannerDisplayType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    action = (ProductReviewResponse.Action) Adapters.b(Adapters.c(Action.f9014a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerDisplayTypeA == null) {
                Assertions.a(reader, "displayType");
                throw null;
            }
            if (str != null) {
                return new ProductReviewResponse.Banner(insetBannerDisplayTypeA, str, str2, str3, action);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductReviewResponse.Banner value = (ProductReviewResponse.Banner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.f9009a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("iconUrl");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("bannerTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1(UrlHandler.ACTION);
            Adapters.b(Adapters.c(Action.f9014a, false)).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductReviewResponseImpl_ResponseAdapter$Feed;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductReviewResponse$Feed;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Feed implements Adapter<ProductReviewResponse.Feed> {

        /* renamed from: a, reason: collision with root package name */
        public static final Feed f9020a = new Feed();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductReviewResponse.OnProductReviewGroup onProductReviewGroupA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("ProductReviewGroup"))) {
                reader.o();
                onProductReviewGroupA = OnProductReviewGroup.a(reader, customScalarAdapters);
            }
            return new ProductReviewResponse.Feed(str, onProductReviewGroupA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductReviewResponse.Feed value = (ProductReviewResponse.Feed) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f9010a);
            ProductReviewResponse.OnProductReviewGroup onProductReviewGroup = value.b;
            if (onProductReviewGroup != null) {
                OnProductReviewGroup.b(writer, customScalarAdapters, onProductReviewGroup);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductReviewResponseImpl_ResponseAdapter$OnProductReviewGroup;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductReviewResponse$OnProductReviewGroup;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductReviewGroup implements Adapter<ProductReviewResponse.OnProductReviewGroup> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f9021a = CollectionsKt.R("banner", "type", "products", "analytics");

        public static ProductReviewResponse.OnProductReviewGroup a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductReviewResponse.Banner banner = null;
            ProductReviewGroupType productReviewGroupTypeA = null;
            ArrayList arrayListFromJson = null;
            ProductReviewResponse.Analytics analytics = null;
            while (true) {
                int iO2 = reader.o2(f9021a);
                if (iO2 == 0) {
                    banner = (ProductReviewResponse.Banner) Adapters.c(Banner.f9019a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    productReviewGroupTypeA = ProductReviewGroupType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    arrayListFromJson = Adapters.a(Adapters.c(Product.f9022a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    analytics = (ProductReviewResponse.Analytics) Adapters.c(Analytics.f9017a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (banner == null) {
                Assertions.a(reader, "banner");
                throw null;
            }
            if (productReviewGroupTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "products");
                throw null;
            }
            if (analytics != null) {
                return new ProductReviewResponse.OnProductReviewGroup(banner, productReviewGroupTypeA, arrayListFromJson, analytics);
            }
            Assertions.a(reader, "analytics");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductReviewResponse.OnProductReviewGroup value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("banner");
            Adapters.c(Banner.f9019a, false).toJson(writer, customScalarAdapters, value.f9011a);
            writer.F1("type");
            writer.v0(value.b.d);
            writer.F1("products");
            Adapters.a(Adapters.c(Product.f9022a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("analytics");
            Adapters.c(Analytics.f9017a, true).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductReviewResponse.OnProductReviewGroup) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductReviewResponseImpl_ResponseAdapter$Product;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductReviewResponse$Product;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Product implements Adapter<ProductReviewResponse.Product> {

        /* renamed from: a, reason: collision with root package name */
        public static final Product f9022a = new Product();
        public static final List b = CollectionsKt.R("title", "productId", "quantity", "imageUrl", "badge", "quantityInfo", "price", "isAvailable", "alternative", "availableLimit");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Double d;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Double d2 = null;
            String str = null;
            String str2 = null;
            Boolean bool = null;
            String str3 = null;
            ProductReviewResponse.Badge badge = null;
            ProductReviewResponse.QuantityInfo quantityInfo = null;
            Integer num = null;
            ProductReviewResponse.Alternative alternative = null;
            String str4 = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        d = d2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        d = d2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        d2 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                        continue;
                    case 3:
                        d = d2;
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        d = d2;
                        badge = (ProductReviewResponse.Badge) Adapters.b(Adapters.c(Badge.f9018a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        d = d2;
                        quantityInfo = (ProductReviewResponse.QuantityInfo) Adapters.b(Adapters.c(QuantityInfo.f9024a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        d = d2;
                        num = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        d = d2;
                        bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        d = d2;
                        alternative = (ProductReviewResponse.Alternative) Adapters.b(Adapters.c(Alternative.f9015a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        d = d2;
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Double d3 = d2;
                        if (str == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "productId");
                            throw null;
                        }
                        if (d3 == null) {
                            Assertions.a(reader, "quantity");
                            throw null;
                        }
                        Boolean bool2 = bool;
                        double dDoubleValue = d3.doubleValue();
                        if (str3 == null) {
                            Assertions.a(reader, "imageUrl");
                            throw null;
                        }
                        if (bool2 != null) {
                            return new ProductReviewResponse.Product(str, str2, dDoubleValue, str3, badge, quantityInfo, num, bool2.booleanValue(), alternative, str4);
                        }
                        Assertions.a(reader, "isAvailable");
                        throw null;
                }
                d2 = d;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductReviewResponse.Product value = (ProductReviewResponse.Product) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f9012a);
            writer.F1("productId");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("quantity");
            Adapters.c.toJson(writer, customScalarAdapters, Double.valueOf(value.c));
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("badge");
            Adapters.b(Adapters.c(Badge.f9018a, false)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("quantityInfo");
            Adapters.b(Adapters.c(QuantityInfo.f9024a, false)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("price");
            Adapters.k.toJson(writer, customScalarAdapters, value.g);
            writer.F1("isAvailable");
            d.B(value.h, Adapters.f, writer, customScalarAdapters, "alternative");
            Adapters.b(Adapters.c(Alternative.f9015a, false)).toJson(writer, customScalarAdapters, value.i);
            writer.F1("availableLimit");
            Adapters.i.toJson(writer, customScalarAdapters, value.j);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductReviewResponseImpl_ResponseAdapter$ProductReviewResponse;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductReviewResponse;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductReviewResponse implements Adapter<au.com.woolworths.graphql.common.fragment.ProductReviewResponse> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f9023a = CollectionsKt.R("message", "feed", "analytics");

        public static au.com.woolworths.graphql.common.fragment.ProductReviewResponse a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            ArrayList arrayListFromJson2 = null;
            while (true) {
                int iO2 = reader.o2(f9023a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson = Adapters.a(Adapters.c(Feed.f9020a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson2 = Adapters.a(Adapters.c(Analytic.f9016a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "message");
                throw null;
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "feed");
                throw null;
            }
            if (arrayListFromJson2 != null) {
                return new au.com.woolworths.graphql.common.fragment.ProductReviewResponse(str, arrayListFromJson, arrayListFromJson2);
            }
            Assertions.a(reader, "analytics");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, au.com.woolworths.graphql.common.fragment.ProductReviewResponse value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f9003a);
            writer.F1("feed");
            Adapters.a(Adapters.c(Feed.f9020a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("analytics");
            Adapters.a(Adapters.c(Analytic.f9016a, true)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (au.com.woolworths.graphql.common.fragment.ProductReviewResponse) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductReviewResponseImpl_ResponseAdapter$QuantityInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/graphql/common/fragment/ProductReviewResponse$QuantityInfo;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class QuantityInfo implements Adapter<ProductReviewResponse.QuantityInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final QuantityInfo f9024a = new QuantityInfo();
        public static final List b = CollectionsKt.R("minimum", "maximum", "increment", "defaultValue", "unit");

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
                return new ProductReviewResponse.QuantityInfo(dDoubleValue, dDoubleValue2, dDoubleValue3, d4.doubleValue(), str);
            }
            Assertions.a(reader, "defaultValue");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductReviewResponse.QuantityInfo value = (ProductReviewResponse.QuantityInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("minimum");
            Adapters$DoubleAdapter$1 adapters$DoubleAdapter$1 = Adapters.c;
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.f9013a));
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
}
