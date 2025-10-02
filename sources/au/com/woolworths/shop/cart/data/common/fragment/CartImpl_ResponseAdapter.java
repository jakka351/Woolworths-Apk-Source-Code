package au.com.woolworths.shop.cart.data.common.fragment;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFieldsImpl_ResponseAdapter;
import au.com.woolworths.shop.cart.data.common.fragment.Cart;
import au.com.woolworths.shop.cart.data.common.fragment.CartProductCardImpl_ResponseAdapter;
import au.com.woolworths.shop.cart.data.common.fragment.CartProductCategoryImpl_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.CartBannerType;
import au.com.woolworths.shop.graphql.type.CouponBannerColorTheme;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.adapter.ButtonStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CartBannerType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CouponBannerColorTheme_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerActionPlacement_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerDisplayType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b-\bÆ\u0002\u0018\u00002\u00020\u0001:,\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-¨\u0006."}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter;", "", "Cart", "Header", "SavingsOnCart", "CartCheckoutBtn", "RewardsInfo", "CartSection", "OnCouponBanner", "CouponBannerTermsAndConditions", "OnInlineMessage", "OnCartAvailableProductSection", "SectionHeader", "Product", "OnCartProductCard", "OnCartProductCategory", "OnCartPromotionSection", "Info", "TooltipMessage", "Product1", "OnCartProductCard1", "OnCartProductCategory1", "OnCartMarketProductSection", "SectionHeader1", "CartTracker", "ShippingMessageBanner", "OnPromotionBanner", "Banner", "Action", "PromotionContent", "OnPromotionMarkdownContent", "SellerGroup", "Product2", "OnCartProductCard2", "OnCartProductCategory2", "OnImageTextBanner", "OnCartBanner", "Banner1", "Analytics", "Action1", "Footer", "Button", "Analytic", "RequiredAlert", "Analytics1", "CartProductQuantity", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CartImpl_ResponseAdapter {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$Action;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$Action;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action implements Adapter<Cart.Action> {

        /* renamed from: a, reason: collision with root package name */
        public static final Action f10354a = new Action();
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
                return new Cart.Action(insetBannerActionPlacementA, insetBannerActionTypeA, str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Cart.Action value = (Cart.Action) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("placement");
            InsetBannerActionPlacement_ResponseAdapter.b(writer, customScalarAdapters, value.f10311a);
            writer.F1("type");
            InsetBannerActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$Action1;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$Action1;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action1 implements Adapter<Cart.Action1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Action1 f10355a = new Action1();
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
                return new Cart.Action1(insetBannerActionPlacementA, insetBannerActionTypeA, str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Cart.Action1 value = (Cart.Action1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("placement");
            InsetBannerActionPlacement_ResponseAdapter.b(writer, customScalarAdapters, value.f10312a);
            writer.F1("type");
            InsetBannerActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$Analytic;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$Analytic;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytic implements Adapter<Cart.Analytic> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytic f10356a = new Analytic();
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
                return new Cart.Analytic(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Cart.Analytic value = (Cart.Analytic) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10313a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$Analytics;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<Cart.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f10357a = new Analytics();
        public static final List b = CollectionsKt.R("eventLabel", "eventDescription", "eventValue");

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
                        return new Cart.Analytics(str, str2, str3);
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Cart.Analytics value = (Cart.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("eventLabel");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f10314a);
            writer.F1("eventDescription");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("eventValue");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$Analytics1;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$Analytics1;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics1 implements Adapter<Cart.Analytics1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics1 f10358a = new Analytics1();
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
                return new Cart.Analytics1(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Cart.Analytics1 value = (Cart.Analytics1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10315a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$Banner;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$Banner;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Banner implements Adapter<Cart.Banner> {

        /* renamed from: a, reason: collision with root package name */
        public static final Banner f10359a = new Banner();
        public static final List b = CollectionsKt.R("displayType", "message", "iconUrl", "bannerTitle", UrlHandler.ACTION);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerDisplayType insetBannerDisplayTypeA = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            Cart.Action action = null;
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
                    action = (Cart.Action) Adapters.b(Adapters.c(Action.f10354a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerDisplayTypeA == null) {
                Assertions.a(reader, "displayType");
                throw null;
            }
            if (str != null) {
                return new Cart.Banner(insetBannerDisplayTypeA, str, str2, str3, action);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Cart.Banner value = (Cart.Banner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.f10316a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("iconUrl");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("bannerTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1(UrlHandler.ACTION);
            Adapters.b(Adapters.c(Action.f10354a, false)).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$Banner1;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$Banner1;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Banner1 implements Adapter<Cart.Banner1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Banner1 f10360a = new Banner1();
        public static final List b = CollectionsKt.R("displayType", "message", "iconUrl", "bannerTitle", "analytics", UrlHandler.ACTION);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerDisplayType insetBannerDisplayTypeA = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            Cart.Analytics analytics = null;
            Cart.Action1 action1 = null;
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
                } else if (iO2 == 4) {
                    analytics = (Cart.Analytics) Adapters.b(Adapters.c(Analytics.f10357a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    action1 = (Cart.Action1) Adapters.b(Adapters.c(Action1.f10355a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerDisplayTypeA == null) {
                Assertions.a(reader, "displayType");
                throw null;
            }
            if (str != null) {
                return new Cart.Banner1(insetBannerDisplayTypeA, str, str2, str3, analytics, action1);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Cart.Banner1 value = (Cart.Banner1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.f10317a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("iconUrl");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("bannerTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics.f10357a, false)).toJson(writer, customScalarAdapters, value.e);
            writer.F1(UrlHandler.ACTION);
            Adapters.b(Adapters.c(Action1.f10355a, false)).toJson(writer, customScalarAdapters, value.f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$Button;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$Button;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Button implements Adapter<Cart.Button> {

        /* renamed from: a, reason: collision with root package name */
        public static final Button f10361a = new Button();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, UrlHandler.ACTION, "style", "enabled");

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
                return new Cart.Button(str, str2, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Cart.Button value = (Cart.Button) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10318a);
            writer.F1(UrlHandler.ACTION);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.c);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.d));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$Cart;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Cart implements Adapter<au.com.woolworths.shop.cart.data.common.fragment.Cart> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f10362a = CollectionsKt.R("totalProducts", "header", "rewardsInfo", "cartSections", "footer", "requiresProductReview", "requiresFulfilmentWindow", "requiresHaveYouForgotten", "requiresFulfilmentAddress", "analytics", "requiredAlert", "cartProductQuantities");

        public static au.com.woolworths.shop.cart.data.common.fragment.Cart a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Cart.Header header = null;
            Cart.RewardsInfo rewardsInfo = null;
            ArrayList arrayListFromJson = null;
            Cart.Footer footer = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            ArrayList arrayListFromJson2 = null;
            Cart.RequiredAlert requiredAlert = null;
            ArrayList arrayListFromJson3 = null;
            while (true) {
                switch (reader.o2(f10362a)) {
                    case 0:
                        num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        continue;
                    case 1:
                        header = (Cart.Header) Adapters.c(Header.f10369a, false).fromJson(reader, customScalarAdapters);
                        continue;
                    case 2:
                        rewardsInfo = (Cart.RewardsInfo) Adapters.b(Adapters.c(RewardsInfo.f10391a, false)).fromJson(reader, customScalarAdapters);
                        continue;
                    case 3:
                        bool = bool2;
                        arrayListFromJson = Adapters.a(Adapters.c(CartSection.f10365a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        footer = (Cart.Footer) Adapters.c(Footer.f10368a, false).fromJson(reader, customScalarAdapters);
                        continue;
                    case 5:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 6:
                        bool3 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 7:
                        bool4 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 8:
                        bool5 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 9:
                        bool = bool2;
                        arrayListFromJson2 = Adapters.a(Adapters.c(Analytic.f10356a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        requiredAlert = (Cart.RequiredAlert) Adapters.b(Adapters.c(RequiredAlert.f10390a, false)).fromJson(reader, customScalarAdapters);
                        continue;
                    case 11:
                        arrayListFromJson3 = Adapters.a(Adapters.c(CartProductQuantity.f10364a, false)).fromJson(reader, customScalarAdapters);
                        continue;
                    default:
                        Boolean bool6 = bool2;
                        if (num == null) {
                            Assertions.a(reader, "totalProducts");
                            throw null;
                        }
                        Boolean bool7 = bool3;
                        int iIntValue = num.intValue();
                        if (header == null) {
                            Assertions.a(reader, "header");
                            throw null;
                        }
                        if (arrayListFromJson == null) {
                            Assertions.a(reader, "cartSections");
                            throw null;
                        }
                        if (footer == null) {
                            Assertions.a(reader, "footer");
                            throw null;
                        }
                        if (bool6 == null) {
                            Assertions.a(reader, "requiresProductReview");
                            throw null;
                        }
                        Boolean bool8 = bool4;
                        boolean zBooleanValue = bool6.booleanValue();
                        if (bool7 == null) {
                            Assertions.a(reader, "requiresFulfilmentWindow");
                            throw null;
                        }
                        Boolean bool9 = bool5;
                        boolean zBooleanValue2 = bool7.booleanValue();
                        if (bool8 == null) {
                            Assertions.a(reader, "requiresHaveYouForgotten");
                            throw null;
                        }
                        boolean zBooleanValue3 = bool8.booleanValue();
                        if (bool9 == null) {
                            Assertions.a(reader, "requiresFulfilmentAddress");
                            throw null;
                        }
                        boolean zBooleanValue4 = bool9.booleanValue();
                        if (arrayListFromJson2 == null) {
                            Assertions.a(reader, "analytics");
                            throw null;
                        }
                        if (arrayListFromJson3 != null) {
                            return new au.com.woolworths.shop.cart.data.common.fragment.Cart(iIntValue, header, rewardsInfo, arrayListFromJson, footer, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, arrayListFromJson2, requiredAlert, arrayListFromJson3);
                        }
                        Assertions.a(reader, "cartProductQuantities");
                        throw null;
                }
                bool2 = bool;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, au.com.woolworths.shop.cart.data.common.fragment.Cart value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("totalProducts");
            d.y(value.f10310a, Adapters.b, writer, customScalarAdapters, "header");
            Adapters.c(Header.f10369a, false).toJson(writer, customScalarAdapters, value.b);
            writer.F1("rewardsInfo");
            Adapters.b(Adapters.c(RewardsInfo.f10391a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("cartSections");
            Adapters.a(Adapters.c(CartSection.f10365a, true)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("footer");
            Adapters.c(Footer.f10368a, false).toJson(writer, customScalarAdapters, value.e);
            writer.F1("requiresProductReview");
            Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
            d.B(value.f, adapters$BooleanAdapter$1, writer, customScalarAdapters, "requiresFulfilmentWindow");
            d.B(value.g, adapters$BooleanAdapter$1, writer, customScalarAdapters, "requiresHaveYouForgotten");
            d.B(value.h, adapters$BooleanAdapter$1, writer, customScalarAdapters, "requiresFulfilmentAddress");
            d.B(value.i, adapters$BooleanAdapter$1, writer, customScalarAdapters, "analytics");
            Adapters.a(Adapters.c(Analytic.f10356a, true)).toJson(writer, customScalarAdapters, value.j);
            writer.F1("requiredAlert");
            Adapters.b(Adapters.c(RequiredAlert.f10390a, false)).toJson(writer, customScalarAdapters, value.k);
            writer.F1("cartProductQuantities");
            Adapters.a(Adapters.c(CartProductQuantity.f10364a, false)).toJson(writer, customScalarAdapters, value.l);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (au.com.woolworths.shop.cart.data.common.fragment.Cart) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$CartCheckoutBtn;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$CartCheckoutBtn;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CartCheckoutBtn implements Adapter<Cart.CartCheckoutBtn> {

        /* renamed from: a, reason: collision with root package name */
        public static final CartCheckoutBtn f10363a = new CartCheckoutBtn();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, UrlHandler.ACTION, "style", "enabled");

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
                return new Cart.CartCheckoutBtn(str, str2, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Cart.CartCheckoutBtn value = (Cart.CartCheckoutBtn) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10319a);
            writer.F1(UrlHandler.ACTION);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.c);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.d));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$CartProductQuantity;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$CartProductQuantity;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CartProductQuantity implements Adapter<Cart.CartProductQuantity> {

        /* renamed from: a, reason: collision with root package name */
        public static final CartProductQuantity f10364a = new CartProductQuantity();
        public static final List b = CollectionsKt.R("productId", "quantity");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Double d = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    d = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "productId");
                throw null;
            }
            if (d != null) {
                return new Cart.CartProductQuantity(str, d.doubleValue());
            }
            Assertions.a(reader, "quantity");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Cart.CartProductQuantity value = (Cart.CartProductQuantity) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productId");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10320a);
            writer.F1("quantity");
            Adapters.c.toJson(writer, customScalarAdapters, Double.valueOf(value.b));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$CartSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$CartSection;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CartSection implements Adapter<Cart.CartSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final CartSection f10365a = new CartSection();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Cart.OnCouponBanner onCouponBannerA;
            Cart.OnInlineMessage onInlineMessageA;
            Cart.OnCartAvailableProductSection onCartAvailableProductSectionA;
            Cart.OnCartPromotionSection onCartPromotionSectionA;
            Cart.OnCartMarketProductSection onCartMarketProductSectionA;
            Cart.OnImageTextBanner onImageTextBannerA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            Cart.OnCartBanner onCartBannerA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CouponBanner"))) {
                reader.o();
                onCouponBannerA = OnCouponBanner.a(reader, customScalarAdapters);
            } else {
                onCouponBannerA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("InlineMessage"))) {
                reader.o();
                onInlineMessageA = OnInlineMessage.a(reader, customScalarAdapters);
            } else {
                onInlineMessageA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CartAvailableProductSection"))) {
                reader.o();
                onCartAvailableProductSectionA = OnCartAvailableProductSection.a(reader, customScalarAdapters);
            } else {
                onCartAvailableProductSectionA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CartPromotionSection"))) {
                reader.o();
                onCartPromotionSectionA = OnCartPromotionSection.a(reader, customScalarAdapters);
            } else {
                onCartPromotionSectionA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CartMarketProductSection"))) {
                reader.o();
                onCartMarketProductSectionA = OnCartMarketProductSection.a(reader, customScalarAdapters);
            } else {
                onCartMarketProductSectionA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ImageTextBanner"))) {
                reader.o();
                onImageTextBannerA = OnImageTextBanner.a(reader, customScalarAdapters);
            } else {
                onImageTextBannerA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CartBanner"))) {
                reader.o();
                onCartBannerA = OnCartBanner.a(reader, customScalarAdapters);
            }
            return new Cart.CartSection(str, onCouponBannerA, onInlineMessageA, onCartAvailableProductSectionA, onCartPromotionSectionA, onCartMarketProductSectionA, onImageTextBannerA, onCartBannerA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Cart.CartSection value = (Cart.CartSection) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10321a);
            Cart.OnCouponBanner onCouponBanner = value.b;
            if (onCouponBanner != null) {
                OnCouponBanner.b(writer, customScalarAdapters, onCouponBanner);
            }
            Cart.OnInlineMessage onInlineMessage = value.c;
            if (onInlineMessage != null) {
                OnInlineMessage.b(writer, customScalarAdapters, onInlineMessage);
            }
            Cart.OnCartAvailableProductSection onCartAvailableProductSection = value.d;
            if (onCartAvailableProductSection != null) {
                OnCartAvailableProductSection.b(writer, customScalarAdapters, onCartAvailableProductSection);
            }
            Cart.OnCartPromotionSection onCartPromotionSection = value.e;
            if (onCartPromotionSection != null) {
                OnCartPromotionSection.b(writer, customScalarAdapters, onCartPromotionSection);
            }
            Cart.OnCartMarketProductSection onCartMarketProductSection = value.f;
            if (onCartMarketProductSection != null) {
                OnCartMarketProductSection.b(writer, customScalarAdapters, onCartMarketProductSection);
            }
            Cart.OnImageTextBanner onImageTextBanner = value.g;
            if (onImageTextBanner != null) {
                OnImageTextBanner.b(writer, customScalarAdapters, onImageTextBanner);
            }
            Cart.OnCartBanner onCartBanner = value.h;
            if (onCartBanner != null) {
                OnCartBanner.b(writer, customScalarAdapters, onCartBanner);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$CartTracker;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$CartTracker;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CartTracker implements Adapter<Cart.CartTracker> {

        /* renamed from: a, reason: collision with root package name */
        public static final CartTracker f10366a = new CartTracker();
        public static final List b = CollectionsKt.R("title", "freeShippingPercentage", lqlqqlq.mmm006Dm006Dm);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Double d = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    d = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (d == null) {
                Assertions.a(reader, "freeShippingPercentage");
                throw null;
            }
            double dDoubleValue = d.doubleValue();
            if (str2 != null) {
                return new Cart.CartTracker(dDoubleValue, str, str2);
            }
            Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Cart.CartTracker value = (Cart.CartTracker) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f10322a);
            writer.F1("freeShippingPercentage");
            Adapters.c.toJson(writer, customScalarAdapters, Double.valueOf(value.b));
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$CouponBannerTermsAndConditions;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$CouponBannerTermsAndConditions;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CouponBannerTermsAndConditions implements Adapter<Cart.CouponBannerTermsAndConditions> {

        /* renamed from: a, reason: collision with root package name */
        public static final CouponBannerTermsAndConditions f10367a = new CouponBannerTermsAndConditions();
        public static final List b = CollectionsKt.R("url", "title");

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
                Assertions.a(reader, "url");
                throw null;
            }
            if (str2 != null) {
                return new Cart.CouponBannerTermsAndConditions(str, str2);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Cart.CouponBannerTermsAndConditions value = (Cart.CouponBannerTermsAndConditions) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f10323a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$Footer;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$Footer;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Footer implements Adapter<Cart.Footer> {

        /* renamed from: a, reason: collision with root package name */
        public static final Footer f10368a = new Footer();
        public static final List b = CollectionsKt.R("button", "totalLabel", "totalAmount", "totalDescription", "panelMarkdown", "savings");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Cart.Button button = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    button = (Cart.Button) Adapters.c(Button.f10361a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (button == null) {
                Assertions.a(reader, "button");
                throw null;
            }
            if (str == null) {
                Assertions.a(reader, "totalLabel");
                throw null;
            }
            if (str2 != null) {
                return new Cart.Footer(button, str, str2, str3, str4, str5);
            }
            Assertions.a(reader, "totalAmount");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Cart.Footer value = (Cart.Footer) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("button");
            Adapters.c(Button.f10361a, false).toJson(writer, customScalarAdapters, value.f10324a);
            writer.F1("totalLabel");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("totalAmount");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("totalDescription");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("panelMarkdown");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("savings");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$Header;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$Header;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Header implements Adapter<Cart.Header> {

        /* renamed from: a, reason: collision with root package name */
        public static final Header f10369a = new Header();
        public static final List b = CollectionsKt.R("subtotalInclDelivery", "savingsOnCart", "cartCheckoutBtn", NotificationMessage.NOTIF_KEY_SUB_TITLE);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Cart.SavingsOnCart savingsOnCart = null;
            Cart.CartCheckoutBtn cartCheckoutBtn = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    savingsOnCart = (Cart.SavingsOnCart) Adapters.b(Adapters.c(SavingsOnCart.f10392a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    cartCheckoutBtn = (Cart.CartCheckoutBtn) Adapters.c(CartCheckoutBtn.f10363a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "subtotalInclDelivery");
                throw null;
            }
            if (cartCheckoutBtn == null) {
                Assertions.a(reader, "cartCheckoutBtn");
                throw null;
            }
            if (str2 != null) {
                return new Cart.Header(str, savingsOnCart, cartCheckoutBtn, str2);
            }
            Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Cart.Header value = (Cart.Header) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("subtotalInclDelivery");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f10325a);
            writer.F1("savingsOnCart");
            Adapters.b(Adapters.c(SavingsOnCart.f10392a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("cartCheckoutBtn");
            Adapters.c(CartCheckoutBtn.f10363a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$Info;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$Info;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Info implements Adapter<Cart.Info> {

        /* renamed from: a, reason: collision with root package name */
        public static final Info f10370a = new Info();
        public static final List b = CollectionsKt.R(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "imageUrl", lqlqqlq.mmm006Dm006Dm, "tooltipMessage");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            String str = null;
            String str2 = null;
            Cart.TooltipMessage tooltipMessage = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    tooltipMessage = (Cart.TooltipMessage) Adapters.c(TooltipMessage.f10397a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (bool == null) {
                Assertions.a(reader, AppMeasurementSdk.ConditionalUserProperty.ACTIVE);
                throw null;
            }
            boolean zBooleanValue = bool.booleanValue();
            if (str == null) {
                Assertions.a(reader, "imageUrl");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
                throw null;
            }
            if (tooltipMessage != null) {
                return new Cart.Info(zBooleanValue, str, str2, tooltipMessage);
            }
            Assertions.a(reader, "tooltipMessage");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Cart.Info value = (Cart.Info) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AppMeasurementSdk.ConditionalUserProperty.ACTIVE);
            d.B(value.f10326a, Adapters.f, writer, customScalarAdapters, "imageUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("tooltipMessage");
            Adapters.c(TooltipMessage.f10397a, false).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$OnCartAvailableProductSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$OnCartAvailableProductSection;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCartAvailableProductSection implements Adapter<Cart.OnCartAvailableProductSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f10371a = CollectionsKt.R("title", "sectionHeader", "products");

        public static Cart.OnCartAvailableProductSection a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Cart.SectionHeader sectionHeader = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f10371a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    sectionHeader = (Cart.SectionHeader) Adapters.b(Adapters.c(SectionHeader.f10393a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Product.f10386a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new Cart.OnCartAvailableProductSection(str, sectionHeader, arrayListFromJson);
            }
            Assertions.a(reader, "products");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Cart.OnCartAvailableProductSection value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.i.toJson(writer, customScalarAdapters, value.f10327a);
            writer.F1("sectionHeader");
            Adapters.b(Adapters.c(SectionHeader.f10393a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("products");
            Adapters.a(Adapters.c(Product.f10386a, true)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (Cart.OnCartAvailableProductSection) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$OnCartBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$OnCartBanner;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCartBanner implements Adapter<Cart.OnCartBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f10372a = CollectionsKt.R("banner", "type");

        public static Cart.OnCartBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Cart.Banner1 banner1 = null;
            CartBannerType cartBannerTypeA = null;
            while (true) {
                int iO2 = reader.o2(f10372a);
                if (iO2 == 0) {
                    banner1 = (Cart.Banner1) Adapters.c(Banner1.f10360a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    cartBannerTypeA = CartBannerType_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (banner1 == null) {
                Assertions.a(reader, "banner");
                throw null;
            }
            if (cartBannerTypeA != null) {
                return new Cart.OnCartBanner(banner1, cartBannerTypeA);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Cart.OnCartBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("banner");
            Adapters.c(Banner1.f10360a, false).toJson(writer, customScalarAdapters, value.f10328a);
            writer.F1("type");
            writer.v0(value.b.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (Cart.OnCartBanner) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$OnCartMarketProductSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$OnCartMarketProductSection;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCartMarketProductSection implements Adapter<Cart.OnCartMarketProductSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f10373a = CollectionsKt.R("sectionHeader", "cartTracker", "shippingMessageBanner", "sellerGroups");

        public static Cart.OnCartMarketProductSection a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Cart.SectionHeader1 sectionHeader1 = null;
            Cart.CartTracker cartTracker = null;
            Cart.ShippingMessageBanner shippingMessageBanner = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f10373a);
                if (iO2 == 0) {
                    sectionHeader1 = (Cart.SectionHeader1) Adapters.b(Adapters.c(SectionHeader1.f10394a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    cartTracker = (Cart.CartTracker) Adapters.b(Adapters.c(CartTracker.f10366a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    shippingMessageBanner = (Cart.ShippingMessageBanner) Adapters.b(Adapters.c(ShippingMessageBanner.f10396a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.b(Adapters.c(SellerGroup.f10395a, false))).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new Cart.OnCartMarketProductSection(sectionHeader1, cartTracker, shippingMessageBanner, arrayListFromJson);
            }
            Assertions.a(reader, "sellerGroups");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Cart.OnCartMarketProductSection value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("sectionHeader");
            Adapters.b(Adapters.c(SectionHeader1.f10394a, false)).toJson(writer, customScalarAdapters, value.f10329a);
            writer.F1("cartTracker");
            Adapters.b(Adapters.c(CartTracker.f10366a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("shippingMessageBanner");
            Adapters.b(Adapters.c(ShippingMessageBanner.f10396a, true)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("sellerGroups");
            Adapters.a(Adapters.b(Adapters.c(SellerGroup.f10395a, false))).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (Cart.OnCartMarketProductSection) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$OnCartProductCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$OnCartProductCard;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCartProductCard implements Adapter<Cart.OnCartProductCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f10374a = CollectionsKt.Q("__typename");

        public static Cart.OnCartProductCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f10374a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            CartProductCard cartProductCardA = CartProductCardImpl_ResponseAdapter.CartProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new Cart.OnCartProductCard(str, cartProductCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Cart.OnCartProductCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10330a);
            List list = CartProductCardImpl_ResponseAdapter.CartProductCard.f10411a;
            CartProductCardImpl_ResponseAdapter.CartProductCard.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (Cart.OnCartProductCard) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$OnCartProductCard1;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$OnCartProductCard1;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCartProductCard1 implements Adapter<Cart.OnCartProductCard1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f10375a = CollectionsKt.Q("__typename");

        public static Cart.OnCartProductCard1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f10375a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            CartProductCard cartProductCardA = CartProductCardImpl_ResponseAdapter.CartProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new Cart.OnCartProductCard1(str, cartProductCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Cart.OnCartProductCard1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10331a);
            List list = CartProductCardImpl_ResponseAdapter.CartProductCard.f10411a;
            CartProductCardImpl_ResponseAdapter.CartProductCard.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (Cart.OnCartProductCard1) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$OnCartProductCard2;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$OnCartProductCard2;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCartProductCard2 implements Adapter<Cart.OnCartProductCard2> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f10376a = CollectionsKt.Q("__typename");

        public static Cart.OnCartProductCard2 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f10376a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            CartProductCard cartProductCardA = CartProductCardImpl_ResponseAdapter.CartProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new Cart.OnCartProductCard2(str, cartProductCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Cart.OnCartProductCard2 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10332a);
            List list = CartProductCardImpl_ResponseAdapter.CartProductCard.f10411a;
            CartProductCardImpl_ResponseAdapter.CartProductCard.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (Cart.OnCartProductCard2) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$OnCartProductCategory;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$OnCartProductCategory;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCartProductCategory implements Adapter<Cart.OnCartProductCategory> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f10377a = CollectionsKt.Q("__typename");

        public static Cart.OnCartProductCategory a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f10377a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            CartProductCategory cartProductCategoryA = CartProductCategoryImpl_ResponseAdapter.CartProductCategory.a(reader, customScalarAdapters);
            if (str != null) {
                return new Cart.OnCartProductCategory(str, cartProductCategoryA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Cart.OnCartProductCategory value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10333a);
            List list = CartProductCategoryImpl_ResponseAdapter.CartProductCategory.f10421a;
            CartProductCategoryImpl_ResponseAdapter.CartProductCategory.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (Cart.OnCartProductCategory) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$OnCartProductCategory1;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$OnCartProductCategory1;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCartProductCategory1 implements Adapter<Cart.OnCartProductCategory1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f10378a = CollectionsKt.Q("__typename");

        public static Cart.OnCartProductCategory1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f10378a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            CartProductCategory cartProductCategoryA = CartProductCategoryImpl_ResponseAdapter.CartProductCategory.a(reader, customScalarAdapters);
            if (str != null) {
                return new Cart.OnCartProductCategory1(str, cartProductCategoryA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Cart.OnCartProductCategory1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10334a);
            List list = CartProductCategoryImpl_ResponseAdapter.CartProductCategory.f10421a;
            CartProductCategoryImpl_ResponseAdapter.CartProductCategory.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (Cart.OnCartProductCategory1) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$OnCartProductCategory2;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$OnCartProductCategory2;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCartProductCategory2 implements Adapter<Cart.OnCartProductCategory2> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f10379a = CollectionsKt.Q("__typename");

        public static Cart.OnCartProductCategory2 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f10379a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            CartProductCategory cartProductCategoryA = CartProductCategoryImpl_ResponseAdapter.CartProductCategory.a(reader, customScalarAdapters);
            if (str != null) {
                return new Cart.OnCartProductCategory2(str, cartProductCategoryA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Cart.OnCartProductCategory2 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10335a);
            List list = CartProductCategoryImpl_ResponseAdapter.CartProductCategory.f10421a;
            CartProductCategoryImpl_ResponseAdapter.CartProductCategory.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (Cart.OnCartProductCategory2) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$OnCartPromotionSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$OnCartPromotionSection;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCartPromotionSection implements Adapter<Cart.OnCartPromotionSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f10380a = CollectionsKt.R("promotionSectionTitle", "promotionId", "info", "products");

        public static Cart.OnCartPromotionSection a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            Cart.Info info = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f10380a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    info = (Cart.Info) Adapters.c(Info.f10370a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Product1.f10387a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 == null) {
                Assertions.a(reader, "promotionId");
                throw null;
            }
            if (info == null) {
                Assertions.a(reader, "info");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new Cart.OnCartPromotionSection(str, str2, info, arrayListFromJson);
            }
            Assertions.a(reader, "products");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Cart.OnCartPromotionSection value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("promotionSectionTitle");
            Adapters.i.toJson(writer, customScalarAdapters, value.f10336a);
            writer.F1("promotionId");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("info");
            Adapters.c(Info.f10370a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("products");
            Adapters.a(Adapters.c(Product1.f10387a, true)).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (Cart.OnCartPromotionSection) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$OnCouponBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$OnCouponBanner;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCouponBanner implements Adapter<Cart.OnCouponBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f10381a = CollectionsKt.R("couponBannerColorTheme", "couponBannerCouponCode", "couponBannerDescription", "couponBannerImage", "couponBannerMinimumSpend", "couponBannerTermsAndConditions");

        public static Cart.OnCouponBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CouponBannerColorTheme couponBannerColorThemeA = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Cart.CouponBannerTermsAndConditions couponBannerTermsAndConditions = null;
            while (true) {
                int iO2 = reader.o2(f10381a);
                if (iO2 == 0) {
                    couponBannerColorThemeA = CouponBannerColorTheme_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    couponBannerTermsAndConditions = (Cart.CouponBannerTermsAndConditions) Adapters.c(CouponBannerTermsAndConditions.f10367a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (couponBannerColorThemeA == null) {
                Assertions.a(reader, "couponBannerColorTheme");
                throw null;
            }
            if (str == null) {
                Assertions.a(reader, "couponBannerCouponCode");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "couponBannerDescription");
                throw null;
            }
            if (str4 == null) {
                Assertions.a(reader, "couponBannerMinimumSpend");
                throw null;
            }
            if (couponBannerTermsAndConditions != null) {
                return new Cart.OnCouponBanner(couponBannerColorThemeA, str, str2, str3, str4, couponBannerTermsAndConditions);
            }
            Assertions.a(reader, "couponBannerTermsAndConditions");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Cart.OnCouponBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("couponBannerColorTheme");
            CouponBannerColorTheme_ResponseAdapter.b(writer, customScalarAdapters, value.f10337a);
            writer.F1("couponBannerCouponCode");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("couponBannerDescription");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("couponBannerImage");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
            writer.F1("couponBannerMinimumSpend");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("couponBannerTermsAndConditions");
            Adapters.c(CouponBannerTermsAndConditions.f10367a, false).toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (Cart.OnCouponBanner) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$OnImageTextBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$OnImageTextBanner;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnImageTextBanner implements Adapter<Cart.OnImageTextBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f10382a = CollectionsKt.R("imageUrl", "message");

        public static Cart.OnImageTextBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f10382a);
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
                Assertions.a(reader, "imageUrl");
                throw null;
            }
            if (str2 != null) {
                return new Cart.OnImageTextBanner(str, str2);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Cart.OnImageTextBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("imageUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f10338a);
            writer.F1("message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (Cart.OnImageTextBanner) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$OnInlineMessage;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$OnInlineMessage;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnInlineMessage implements Adapter<Cart.OnInlineMessage> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f10383a = CollectionsKt.R("displayType", "message");

        public static Cart.OnInlineMessage a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerDisplayType insetBannerDisplayTypeA = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(f10383a);
                if (iO2 == 0) {
                    insetBannerDisplayTypeA = InsetBannerDisplayType_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerDisplayTypeA == null) {
                Assertions.a(reader, "displayType");
                throw null;
            }
            if (str != null) {
                return new Cart.OnInlineMessage(insetBannerDisplayTypeA, str);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Cart.OnInlineMessage value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.f10339a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (Cart.OnInlineMessage) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$OnPromotionBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$OnPromotionBanner;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPromotionBanner implements Adapter<Cart.OnPromotionBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f10384a = CollectionsKt.R("banner", "promotionContent");

        public static Cart.OnPromotionBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Cart.Banner banner = null;
            Cart.PromotionContent promotionContent = null;
            while (true) {
                int iO2 = reader.o2(f10384a);
                if (iO2 == 0) {
                    banner = (Cart.Banner) Adapters.c(Banner.f10359a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    promotionContent = (Cart.PromotionContent) Adapters.b(Adapters.c(PromotionContent.f10389a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (banner != null) {
                return new Cart.OnPromotionBanner(banner, promotionContent);
            }
            Assertions.a(reader, "banner");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Cart.OnPromotionBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("banner");
            Adapters.c(Banner.f10359a, false).toJson(writer, customScalarAdapters, value.f10340a);
            writer.F1("promotionContent");
            Adapters.b(Adapters.c(PromotionContent.f10389a, true)).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (Cart.OnPromotionBanner) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$OnPromotionMarkdownContent;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$OnPromotionMarkdownContent;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPromotionMarkdownContent implements Adapter<Cart.OnPromotionMarkdownContent> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f10385a = CollectionsKt.R("promotionMarkdownTitle", "promotionMarkdownText");

        public static Cart.OnPromotionMarkdownContent a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f10385a);
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
                Assertions.a(reader, "promotionMarkdownTitle");
                throw null;
            }
            if (str2 != null) {
                return new Cart.OnPromotionMarkdownContent(str, str2);
            }
            Assertions.a(reader, "promotionMarkdownText");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Cart.OnPromotionMarkdownContent value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("promotionMarkdownTitle");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f10341a);
            writer.F1("promotionMarkdownText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (Cart.OnPromotionMarkdownContent) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$Product;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$Product;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Product implements Adapter<Cart.Product> {

        /* renamed from: a, reason: collision with root package name */
        public static final Product f10386a = new Product();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Cart.OnCartProductCard onCartProductCardA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            Cart.OnCartProductCategory onCartProductCategoryA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CartProductCard"))) {
                reader.o();
                onCartProductCardA = OnCartProductCard.a(reader, customScalarAdapters);
            } else {
                onCartProductCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CartProductCategory"))) {
                reader.o();
                onCartProductCategoryA = OnCartProductCategory.a(reader, customScalarAdapters);
            }
            return new Cart.Product(str, onCartProductCardA, onCartProductCategoryA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Cart.Product value = (Cart.Product) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10342a);
            Cart.OnCartProductCard onCartProductCard = value.b;
            if (onCartProductCard != null) {
                OnCartProductCard.b(writer, customScalarAdapters, onCartProductCard);
            }
            Cart.OnCartProductCategory onCartProductCategory = value.c;
            if (onCartProductCategory != null) {
                OnCartProductCategory.b(writer, customScalarAdapters, onCartProductCategory);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$Product1;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$Product1;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Product1 implements Adapter<Cart.Product1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Product1 f10387a = new Product1();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Cart.OnCartProductCard1 onCartProductCard1A;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            Cart.OnCartProductCategory1 onCartProductCategory1A = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CartProductCard"))) {
                reader.o();
                onCartProductCard1A = OnCartProductCard1.a(reader, customScalarAdapters);
            } else {
                onCartProductCard1A = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CartProductCategory"))) {
                reader.o();
                onCartProductCategory1A = OnCartProductCategory1.a(reader, customScalarAdapters);
            }
            return new Cart.Product1(str, onCartProductCard1A, onCartProductCategory1A);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Cart.Product1 value = (Cart.Product1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10343a);
            Cart.OnCartProductCard1 onCartProductCard1 = value.b;
            if (onCartProductCard1 != null) {
                OnCartProductCard1.b(writer, customScalarAdapters, onCartProductCard1);
            }
            Cart.OnCartProductCategory1 onCartProductCategory1 = value.c;
            if (onCartProductCategory1 != null) {
                OnCartProductCategory1.b(writer, customScalarAdapters, onCartProductCategory1);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$Product2;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$Product2;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Product2 implements Adapter<Cart.Product2> {

        /* renamed from: a, reason: collision with root package name */
        public static final Product2 f10388a = new Product2();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Cart.OnCartProductCard2 onCartProductCard2A;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            Cart.OnCartProductCategory2 onCartProductCategory2A = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CartProductCard"))) {
                reader.o();
                onCartProductCard2A = OnCartProductCard2.a(reader, customScalarAdapters);
            } else {
                onCartProductCard2A = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CartProductCategory"))) {
                reader.o();
                onCartProductCategory2A = OnCartProductCategory2.a(reader, customScalarAdapters);
            }
            return new Cart.Product2(str, onCartProductCard2A, onCartProductCategory2A);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Cart.Product2 value = (Cart.Product2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10344a);
            Cart.OnCartProductCard2 onCartProductCard2 = value.b;
            if (onCartProductCard2 != null) {
                OnCartProductCard2.b(writer, customScalarAdapters, onCartProductCard2);
            }
            Cart.OnCartProductCategory2 onCartProductCategory2 = value.c;
            if (onCartProductCategory2 != null) {
                OnCartProductCategory2.b(writer, customScalarAdapters, onCartProductCategory2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$PromotionContent;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$PromotionContent;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PromotionContent implements Adapter<Cart.PromotionContent> {

        /* renamed from: a, reason: collision with root package name */
        public static final PromotionContent f10389a = new PromotionContent();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Cart.OnPromotionMarkdownContent onPromotionMarkdownContentA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("PromotionMarkdownContent"))) {
                reader.o();
                onPromotionMarkdownContentA = OnPromotionMarkdownContent.a(reader, customScalarAdapters);
            }
            return new Cart.PromotionContent(str, onPromotionMarkdownContentA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Cart.PromotionContent value = (Cart.PromotionContent) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10345a);
            Cart.OnPromotionMarkdownContent onPromotionMarkdownContent = value.b;
            if (onPromotionMarkdownContent != null) {
                OnPromotionMarkdownContent.b(writer, customScalarAdapters, onPromotionMarkdownContent);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$RequiredAlert;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$RequiredAlert;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RequiredAlert implements Adapter<Cart.RequiredAlert> {

        /* renamed from: a, reason: collision with root package name */
        public static final RequiredAlert f10390a = new RequiredAlert();
        public static final List b = CollectionsKt.R("title", "message", "buttonTitle", "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            Cart.Analytics1 analytics1 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    analytics1 = (Cart.Analytics1) Adapters.b(Adapters.c(Analytics1.f10358a, true)).fromJson(reader, customScalarAdapters);
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
            if (str3 != null) {
                return new Cart.RequiredAlert(str, str2, str3, analytics1);
            }
            Assertions.a(reader, "buttonTitle");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Cart.RequiredAlert value = (Cart.RequiredAlert) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f10346a);
            writer.F1("message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("buttonTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics1.f10358a, true)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$RewardsInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$RewardsInfo;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsInfo implements Adapter<Cart.RewardsInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final RewardsInfo f10391a = new RewardsInfo();
        public static final List b = CollectionsKt.R("imageUrl", "title");

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
                Assertions.a(reader, "imageUrl");
                throw null;
            }
            if (str2 != null) {
                return new Cart.RewardsInfo(str, str2);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Cart.RewardsInfo value = (Cart.RewardsInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("imageUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f10347a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$SavingsOnCart;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$SavingsOnCart;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SavingsOnCart implements Adapter<Cart.SavingsOnCart> {

        /* renamed from: a, reason: collision with root package name */
        public static final SavingsOnCart f10392a = new SavingsOnCart();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "amount");

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
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (str2 != null) {
                return new Cart.SavingsOnCart(str, str2);
            }
            Assertions.a(reader, "amount");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Cart.SavingsOnCart value = (Cart.SavingsOnCart) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f10348a);
            writer.F1("amount");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$SectionHeader;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$SectionHeader;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SectionHeader implements Adapter<Cart.SectionHeader> {

        /* renamed from: a, reason: collision with root package name */
        public static final SectionHeader f10393a = new SectionHeader();
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
                return new Cart.SectionHeader(str, str2);
            }
            Assertions.a(reader, "imageUrl");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Cart.SectionHeader value = (Cart.SectionHeader) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f10349a);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$SectionHeader1;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$SectionHeader1;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SectionHeader1 implements Adapter<Cart.SectionHeader1> {

        /* renamed from: a, reason: collision with root package name */
        public static final SectionHeader1 f10394a = new SectionHeader1();
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
                return new Cart.SectionHeader1(str, str2);
            }
            Assertions.a(reader, "imageUrl");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Cart.SectionHeader1 value = (Cart.SectionHeader1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f10350a);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$SellerGroup;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$SellerGroup;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SellerGroup implements Adapter<Cart.SellerGroup> {

        /* renamed from: a, reason: collision with root package name */
        public static final SellerGroup f10395a = new SellerGroup();
        public static final List b = CollectionsKt.R("sellerName", "dispatchNote", "products");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
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
                    arrayListFromJson = Adapters.a(Adapters.c(Product2.f10388a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "sellerName");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "dispatchNote");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new Cart.SellerGroup(str, str2, arrayListFromJson);
            }
            Assertions.a(reader, "products");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Cart.SellerGroup value = (Cart.SellerGroup) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("sellerName");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f10351a);
            writer.F1("dispatchNote");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("products");
            Adapters.a(Adapters.c(Product2.f10388a, true)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$ShippingMessageBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$ShippingMessageBanner;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShippingMessageBanner implements Adapter<Cart.ShippingMessageBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final ShippingMessageBanner f10396a = new ShippingMessageBanner();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Cart.OnPromotionBanner onPromotionBannerA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("PromotionBanner"))) {
                reader.o();
                onPromotionBannerA = OnPromotionBanner.a(reader, customScalarAdapters);
            }
            return new Cart.ShippingMessageBanner(str, onPromotionBannerA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Cart.ShippingMessageBanner value = (Cart.ShippingMessageBanner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f10352a);
            Cart.OnPromotionBanner onPromotionBanner = value.b;
            if (onPromotionBanner != null) {
                OnPromotionBanner.b(writer, customScalarAdapters, onPromotionBanner);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartImpl_ResponseAdapter$TooltipMessage;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/cart/data/common/fragment/Cart$TooltipMessage;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TooltipMessage implements Adapter<Cart.TooltipMessage> {

        /* renamed from: a, reason: collision with root package name */
        public static final TooltipMessage f10397a = new TooltipMessage();
        public static final List b = CollectionsKt.R("title", "message");

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
                return new Cart.TooltipMessage(str, str2);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Cart.TooltipMessage value = (Cart.TooltipMessage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f10353a);
            writer.F1("message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }
}
