package com.woolworths.shop.deliveryunlimited.signup.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerActionPlacement_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerDisplayType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.UrlHandler;
import com.woolworths.shop.deliveryunlimited.signup.DeliveryUnlimitedSubscribeConfirmationQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/adapter/DeliveryUnlimitedSubscribeConfirmationQuery_ResponseAdapter;", "", "Data", "DeliveryUnlimitedSubscribeConfirmation", "Feed", "OnDeliveryUnlimitedSubscribeConfirmationLineItem", "OnInsetBanner", "Action", "Analytics", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeliveryUnlimitedSubscribeConfirmationQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/adapter/DeliveryUnlimitedSubscribeConfirmationQuery_ResponseAdapter$Action;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeConfirmationQuery$Action;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action implements Adapter<DeliveryUnlimitedSubscribeConfirmationQuery.Action> {

        /* renamed from: a, reason: collision with root package name */
        public static final Action f22640a = new Action();
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
                return new DeliveryUnlimitedSubscribeConfirmationQuery.Action(insetBannerActionPlacementA, insetBannerActionTypeA, str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribeConfirmationQuery.Action value = (DeliveryUnlimitedSubscribeConfirmationQuery.Action) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("placement");
            InsetBannerActionPlacement_ResponseAdapter.b(writer, customScalarAdapters, value.f22609a);
            writer.F1("type");
            InsetBannerActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/adapter/DeliveryUnlimitedSubscribeConfirmationQuery_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeConfirmationQuery$Analytics;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<DeliveryUnlimitedSubscribeConfirmationQuery.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f22641a = new Analytics();
        public static final List b = CollectionsKt.Q("subscriptionType");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new DeliveryUnlimitedSubscribeConfirmationQuery.Analytics(str);
            }
            Assertions.a(reader, "subscriptionType");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribeConfirmationQuery.Analytics value = (DeliveryUnlimitedSubscribeConfirmationQuery.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("subscriptionType");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22610a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/adapter/DeliveryUnlimitedSubscribeConfirmationQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeConfirmationQuery$Data;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<DeliveryUnlimitedSubscribeConfirmationQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f22642a = new Data();
        public static final List b = CollectionsKt.Q("deliveryUnlimitedSubscribeConfirmation");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            DeliveryUnlimitedSubscribeConfirmationQuery.DeliveryUnlimitedSubscribeConfirmation deliveryUnlimitedSubscribeConfirmation = null;
            while (reader.o2(b) == 0) {
                deliveryUnlimitedSubscribeConfirmation = (DeliveryUnlimitedSubscribeConfirmationQuery.DeliveryUnlimitedSubscribeConfirmation) Adapters.c(DeliveryUnlimitedSubscribeConfirmation.f22643a, false).fromJson(reader, customScalarAdapters);
            }
            if (deliveryUnlimitedSubscribeConfirmation != null) {
                return new DeliveryUnlimitedSubscribeConfirmationQuery.Data(deliveryUnlimitedSubscribeConfirmation);
            }
            Assertions.a(reader, "deliveryUnlimitedSubscribeConfirmation");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribeConfirmationQuery.Data value = (DeliveryUnlimitedSubscribeConfirmationQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("deliveryUnlimitedSubscribeConfirmation");
            Adapters.c(DeliveryUnlimitedSubscribeConfirmation.f22643a, false).toJson(writer, customScalarAdapters, value.f22611a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/adapter/DeliveryUnlimitedSubscribeConfirmationQuery_ResponseAdapter$DeliveryUnlimitedSubscribeConfirmation;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeConfirmationQuery$DeliveryUnlimitedSubscribeConfirmation;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeliveryUnlimitedSubscribeConfirmation implements Adapter<DeliveryUnlimitedSubscribeConfirmationQuery.DeliveryUnlimitedSubscribeConfirmation> {

        /* renamed from: a, reason: collision with root package name */
        public static final DeliveryUnlimitedSubscribeConfirmation f22643a = new DeliveryUnlimitedSubscribeConfirmation();
        public static final List b = CollectionsKt.R("feed", "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            DeliveryUnlimitedSubscribeConfirmationQuery.Analytics analytics = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    arrayListFromJson = Adapters.a(Adapters.c(Feed.f22644a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    analytics = (DeliveryUnlimitedSubscribeConfirmationQuery.Analytics) Adapters.c(Analytics.f22641a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "feed");
                throw null;
            }
            if (analytics != null) {
                return new DeliveryUnlimitedSubscribeConfirmationQuery.DeliveryUnlimitedSubscribeConfirmation(arrayListFromJson, analytics);
            }
            Assertions.a(reader, "analytics");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribeConfirmationQuery.DeliveryUnlimitedSubscribeConfirmation value = (DeliveryUnlimitedSubscribeConfirmationQuery.DeliveryUnlimitedSubscribeConfirmation) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("feed");
            Adapters.a(Adapters.c(Feed.f22644a, true)).toJson(writer, customScalarAdapters, value.f22612a);
            writer.F1("analytics");
            Adapters.c(Analytics.f22641a, false).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/adapter/DeliveryUnlimitedSubscribeConfirmationQuery_ResponseAdapter$Feed;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeConfirmationQuery$Feed;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Feed implements Adapter<DeliveryUnlimitedSubscribeConfirmationQuery.Feed> {

        /* renamed from: a, reason: collision with root package name */
        public static final Feed f22644a = new Feed();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            DeliveryUnlimitedSubscribeConfirmationQuery.OnDeliveryUnlimitedSubscribeConfirmationLineItem onDeliveryUnlimitedSubscribeConfirmationLineItemA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            DeliveryUnlimitedSubscribeConfirmationQuery.OnInsetBanner onInsetBannerA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("DeliveryUnlimitedSubscribeConfirmationLineItem"))) {
                reader.o();
                onDeliveryUnlimitedSubscribeConfirmationLineItemA = OnDeliveryUnlimitedSubscribeConfirmationLineItem.a(reader, customScalarAdapters);
            } else {
                onDeliveryUnlimitedSubscribeConfirmationLineItemA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("InsetBanner"))) {
                reader.o();
                onInsetBannerA = OnInsetBanner.a(reader, customScalarAdapters);
            }
            return new DeliveryUnlimitedSubscribeConfirmationQuery.Feed(str, onDeliveryUnlimitedSubscribeConfirmationLineItemA, onInsetBannerA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribeConfirmationQuery.Feed value = (DeliveryUnlimitedSubscribeConfirmationQuery.Feed) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22613a);
            DeliveryUnlimitedSubscribeConfirmationQuery.OnDeliveryUnlimitedSubscribeConfirmationLineItem onDeliveryUnlimitedSubscribeConfirmationLineItem = value.b;
            if (onDeliveryUnlimitedSubscribeConfirmationLineItem != null) {
                OnDeliveryUnlimitedSubscribeConfirmationLineItem.b(writer, customScalarAdapters, onDeliveryUnlimitedSubscribeConfirmationLineItem);
            }
            DeliveryUnlimitedSubscribeConfirmationQuery.OnInsetBanner onInsetBanner = value.c;
            if (onInsetBanner != null) {
                OnInsetBanner.b(writer, customScalarAdapters, onInsetBanner);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/adapter/DeliveryUnlimitedSubscribeConfirmationQuery_ResponseAdapter$OnDeliveryUnlimitedSubscribeConfirmationLineItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeConfirmationQuery$OnDeliveryUnlimitedSubscribeConfirmationLineItem;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnDeliveryUnlimitedSubscribeConfirmationLineItem implements Adapter<DeliveryUnlimitedSubscribeConfirmationQuery.OnDeliveryUnlimitedSubscribeConfirmationLineItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22645a = CollectionsKt.R("title", AnnotatedPrivateKey.LABEL, "iconUrl");

        public static DeliveryUnlimitedSubscribeConfirmationQuery.OnDeliveryUnlimitedSubscribeConfirmationLineItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(f22645a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 != null) {
                return new DeliveryUnlimitedSubscribeConfirmationQuery.OnDeliveryUnlimitedSubscribeConfirmationLineItem(str, str2, str3);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, DeliveryUnlimitedSubscribeConfirmationQuery.OnDeliveryUnlimitedSubscribeConfirmationLineItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f22614a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("iconUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (DeliveryUnlimitedSubscribeConfirmationQuery.OnDeliveryUnlimitedSubscribeConfirmationLineItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/adapter/DeliveryUnlimitedSubscribeConfirmationQuery_ResponseAdapter$OnInsetBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeConfirmationQuery$OnInsetBanner;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnInsetBanner implements Adapter<DeliveryUnlimitedSubscribeConfirmationQuery.OnInsetBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22646a = CollectionsKt.R("displayType", "message", "bannerTitle", UrlHandler.ACTION);

        public static DeliveryUnlimitedSubscribeConfirmationQuery.OnInsetBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerDisplayType insetBannerDisplayTypeA = null;
            String str = null;
            String str2 = null;
            DeliveryUnlimitedSubscribeConfirmationQuery.Action action = null;
            while (true) {
                int iO2 = reader.o2(f22646a);
                if (iO2 == 0) {
                    insetBannerDisplayTypeA = InsetBannerDisplayType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    action = (DeliveryUnlimitedSubscribeConfirmationQuery.Action) Adapters.b(Adapters.c(Action.f22640a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerDisplayTypeA == null) {
                Assertions.a(reader, "displayType");
                throw null;
            }
            if (str != null) {
                return new DeliveryUnlimitedSubscribeConfirmationQuery.OnInsetBanner(insetBannerDisplayTypeA, str, str2, action);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, DeliveryUnlimitedSubscribeConfirmationQuery.OnInsetBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.f22615a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("bannerTitle");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1(UrlHandler.ACTION);
            Adapters.b(Adapters.c(Action.f22640a, false)).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (DeliveryUnlimitedSubscribeConfirmationQuery.OnInsetBanner) obj);
        }
    }
}
