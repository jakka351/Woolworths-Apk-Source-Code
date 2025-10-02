package com.woolworths.shop.deliveryunlimited.signup.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.BadgeType;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.DownloadableAssetFit;
import au.com.woolworths.shop.graphql.type.DownloadableAssetType;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.SpacerType;
import au.com.woolworths.shop.graphql.type.adapter.BadgeType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ButtonStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.DownloadableAssetFit_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.DownloadableAssetType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerActionPlacement_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerDisplayType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.SpacerType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$IntAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.woolworths.shop.deliveryunlimited.signup.DeliveryUnlimitedSubscribeQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\bÇ\u0002\u0018\u00002\u00020\u0001:\u0017\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/adapter/DeliveryUnlimitedSubscribeQuery_ResponseAdapter;", "", "Data", "DeliveryUnlimitedSubscribe", "Summary", "BannerAsset", "Badge", "Feature", "Link", "Footer", "Button", "Disclaimer", "Link1", "TermsMarkdown", "Plans", "PlanType", "Feed", "OnInsetBanner", "Action", "OnDeliveryUnlimitedSubscribeFeature", "OnDeliveryUnlimitedSubscribePlan", "Badge1", "OnSpacer", "Footer1", "Button1", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeliveryUnlimitedSubscribeQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/adapter/DeliveryUnlimitedSubscribeQuery_ResponseAdapter$Action;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$Action;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action implements Adapter<DeliveryUnlimitedSubscribeQuery.Action> {

        /* renamed from: a, reason: collision with root package name */
        public static final Action f22647a = new Action();
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
                return new DeliveryUnlimitedSubscribeQuery.Action(insetBannerActionPlacementA, insetBannerActionTypeA, str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribeQuery.Action value = (DeliveryUnlimitedSubscribeQuery.Action) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("placement");
            InsetBannerActionPlacement_ResponseAdapter.b(writer, customScalarAdapters, value.f22617a);
            writer.F1("type");
            InsetBannerActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/adapter/DeliveryUnlimitedSubscribeQuery_ResponseAdapter$Badge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$Badge;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Badge implements Adapter<DeliveryUnlimitedSubscribeQuery.Badge> {

        /* renamed from: a, reason: collision with root package name */
        public static final Badge f22648a = new Badge();
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
                return new DeliveryUnlimitedSubscribeQuery.Badge(str, badgeTypeA);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribeQuery.Badge value = (DeliveryUnlimitedSubscribeQuery.Badge) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22618a);
            writer.F1("type");
            BadgeType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/adapter/DeliveryUnlimitedSubscribeQuery_ResponseAdapter$Badge1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$Badge1;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Badge1 implements Adapter<DeliveryUnlimitedSubscribeQuery.Badge1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Badge1 f22649a = new Badge1();
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
                return new DeliveryUnlimitedSubscribeQuery.Badge1(str, badgeTypeA);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribeQuery.Badge1 value = (DeliveryUnlimitedSubscribeQuery.Badge1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22619a);
            writer.F1("type");
            BadgeType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/adapter/DeliveryUnlimitedSubscribeQuery_ResponseAdapter$BannerAsset;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$BannerAsset;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BannerAsset implements Adapter<DeliveryUnlimitedSubscribeQuery.BannerAsset> {

        /* renamed from: a, reason: collision with root package name */
        public static final BannerAsset f22650a = new BannerAsset();
        public static final List b = CollectionsKt.R("assetType", "assetUrl", "assetWidth", "assetHeight", "fit", "altText");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            DownloadableAssetType downloadableAssetTypeA = null;
            String str = null;
            Integer num3 = null;
            DownloadableAssetFit downloadableAssetFit = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 != 0) {
                    if (iO2 == 1) {
                        num = num2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                    } else if (iO2 == 2) {
                        num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                    } else if (iO2 == 3) {
                        num = num2;
                        num3 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                    } else if (iO2 == 4) {
                        num = num2;
                        downloadableAssetFit = (DownloadableAssetFit) Adapters.b(DownloadableAssetFit_ResponseAdapter.f12070a).fromJson(reader, customScalarAdapters);
                    } else {
                        if (iO2 != 5) {
                            break;
                        }
                        num = num2;
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                    }
                    num2 = num;
                } else {
                    downloadableAssetTypeA = DownloadableAssetType_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            Integer num4 = num2;
            if (downloadableAssetTypeA == null) {
                Assertions.a(reader, "assetType");
                throw null;
            }
            if (str == null) {
                Assertions.a(reader, "assetUrl");
                throw null;
            }
            if (num4 == null) {
                Assertions.a(reader, "assetWidth");
                throw null;
            }
            Integer num5 = num3;
            int iIntValue = num4.intValue();
            if (num5 != null) {
                return new DeliveryUnlimitedSubscribeQuery.BannerAsset(downloadableAssetTypeA, str, iIntValue, num5.intValue(), downloadableAssetFit, str2);
            }
            Assertions.a(reader, "assetHeight");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribeQuery.BannerAsset value = (DeliveryUnlimitedSubscribeQuery.BannerAsset) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("assetType");
            DownloadableAssetType_ResponseAdapter.b(writer, customScalarAdapters, value.f22620a);
            writer.F1("assetUrl");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("assetWidth");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.c, adapters$IntAdapter$1, writer, customScalarAdapters, "assetHeight");
            d.y(value.d, adapters$IntAdapter$1, writer, customScalarAdapters, "fit");
            Adapters.b(DownloadableAssetFit_ResponseAdapter.f12070a).toJson(writer, customScalarAdapters, value.e);
            writer.F1("altText");
            Adapters.i.toJson(writer, customScalarAdapters, value.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/adapter/DeliveryUnlimitedSubscribeQuery_ResponseAdapter$Button;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$Button;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Button implements Adapter<DeliveryUnlimitedSubscribeQuery.Button> {

        /* renamed from: a, reason: collision with root package name */
        public static final Button f22651a = new Button();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "style", "enabled");

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
                return new DeliveryUnlimitedSubscribeQuery.Button(str, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribeQuery.Button value = (DeliveryUnlimitedSubscribeQuery.Button) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22621a);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.b);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.c));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/adapter/DeliveryUnlimitedSubscribeQuery_ResponseAdapter$Button1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$Button1;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Button1 implements Adapter<DeliveryUnlimitedSubscribeQuery.Button1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Button1 f22652a = new Button1();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "style", "enabled");

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
                return new DeliveryUnlimitedSubscribeQuery.Button1(str, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribeQuery.Button1 value = (DeliveryUnlimitedSubscribeQuery.Button1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22622a);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.b);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.c));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/adapter/DeliveryUnlimitedSubscribeQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$Data;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<DeliveryUnlimitedSubscribeQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f22653a = new Data();
        public static final List b = CollectionsKt.Q("deliveryUnlimitedSubscribe");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            DeliveryUnlimitedSubscribeQuery.DeliveryUnlimitedSubscribe deliveryUnlimitedSubscribe = null;
            while (reader.o2(b) == 0) {
                deliveryUnlimitedSubscribe = (DeliveryUnlimitedSubscribeQuery.DeliveryUnlimitedSubscribe) Adapters.b(Adapters.c(DeliveryUnlimitedSubscribe.f22654a, false)).fromJson(reader, customScalarAdapters);
            }
            return new DeliveryUnlimitedSubscribeQuery.Data(deliveryUnlimitedSubscribe);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribeQuery.Data value = (DeliveryUnlimitedSubscribeQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("deliveryUnlimitedSubscribe");
            Adapters.b(Adapters.c(DeliveryUnlimitedSubscribe.f22654a, false)).toJson(writer, customScalarAdapters, value.f22623a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/adapter/DeliveryUnlimitedSubscribeQuery_ResponseAdapter$DeliveryUnlimitedSubscribe;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$DeliveryUnlimitedSubscribe;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeliveryUnlimitedSubscribe implements Adapter<DeliveryUnlimitedSubscribeQuery.DeliveryUnlimitedSubscribe> {

        /* renamed from: a, reason: collision with root package name */
        public static final DeliveryUnlimitedSubscribe f22654a = new DeliveryUnlimitedSubscribe();
        public static final List b = CollectionsKt.R(ErrorBundle.SUMMARY_ENTRY, "plans", "isUserWPayMigrated");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            DeliveryUnlimitedSubscribeQuery.Summary summary = null;
            DeliveryUnlimitedSubscribeQuery.Plans plans = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    summary = (DeliveryUnlimitedSubscribeQuery.Summary) Adapters.c(Summary.f22668a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    plans = (DeliveryUnlimitedSubscribeQuery.Plans) Adapters.c(Plans.f22667a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                }
            }
            if (summary == null) {
                Assertions.a(reader, ErrorBundle.SUMMARY_ENTRY);
                throw null;
            }
            if (plans != null) {
                return new DeliveryUnlimitedSubscribeQuery.DeliveryUnlimitedSubscribe(summary, plans, bool);
            }
            Assertions.a(reader, "plans");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribeQuery.DeliveryUnlimitedSubscribe value = (DeliveryUnlimitedSubscribeQuery.DeliveryUnlimitedSubscribe) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(ErrorBundle.SUMMARY_ENTRY);
            Adapters.c(Summary.f22668a, false).toJson(writer, customScalarAdapters, value.f22624a);
            writer.F1("plans");
            Adapters.c(Plans.f22667a, false).toJson(writer, customScalarAdapters, value.b);
            writer.F1("isUserWPayMigrated");
            Adapters.l.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/adapter/DeliveryUnlimitedSubscribeQuery_ResponseAdapter$Disclaimer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$Disclaimer;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Disclaimer implements Adapter<DeliveryUnlimitedSubscribeQuery.Disclaimer> {

        /* renamed from: a, reason: collision with root package name */
        public static final Disclaimer f22655a = new Disclaimer();
        public static final List b = CollectionsKt.R("title", "content", "links");

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
                    arrayListFromJson = Adapters.a(Adapters.c(Link1.f22661a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "content");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new DeliveryUnlimitedSubscribeQuery.Disclaimer(str, str2, arrayListFromJson);
            }
            Assertions.a(reader, "links");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribeQuery.Disclaimer value = (DeliveryUnlimitedSubscribeQuery.Disclaimer) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22625a);
            writer.F1("content");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("links");
            Adapters.a(Adapters.c(Link1.f22661a, false)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/adapter/DeliveryUnlimitedSubscribeQuery_ResponseAdapter$Feature;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$Feature;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Feature implements Adapter<DeliveryUnlimitedSubscribeQuery.Feature> {

        /* renamed from: a, reason: collision with root package name */
        public static final Feature f22656a = new Feature();
        public static final List b = CollectionsKt.R("title", "iconUrl", lqlqqlq.mmm006Dm006Dm, "link");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            DeliveryUnlimitedSubscribeQuery.Link link = null;
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
                    link = (DeliveryUnlimitedSubscribeQuery.Link) Adapters.b(Adapters.c(Link.f22660a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "iconUrl");
                throw null;
            }
            if (str3 != null) {
                return new DeliveryUnlimitedSubscribeQuery.Feature(str, str2, str3, link);
            }
            Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribeQuery.Feature value = (DeliveryUnlimitedSubscribeQuery.Feature) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22626a);
            writer.F1("iconUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("link");
            Adapters.b(Adapters.c(Link.f22660a, false)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/adapter/DeliveryUnlimitedSubscribeQuery_ResponseAdapter$Feed;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$Feed;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Feed implements Adapter<DeliveryUnlimitedSubscribeQuery.Feed> {

        /* renamed from: a, reason: collision with root package name */
        public static final Feed f22657a = new Feed();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            DeliveryUnlimitedSubscribeQuery.OnInsetBanner onInsetBannerA;
            DeliveryUnlimitedSubscribeQuery.OnDeliveryUnlimitedSubscribeFeature onDeliveryUnlimitedSubscribeFeatureA;
            DeliveryUnlimitedSubscribeQuery.OnDeliveryUnlimitedSubscribePlan onDeliveryUnlimitedSubscribePlanA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            DeliveryUnlimitedSubscribeQuery.OnSpacer onSpacerA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("InsetBanner"))) {
                reader.o();
                onInsetBannerA = OnInsetBanner.a(reader, customScalarAdapters);
            } else {
                onInsetBannerA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("DeliveryUnlimitedSubscribeFeature"))) {
                reader.o();
                onDeliveryUnlimitedSubscribeFeatureA = OnDeliveryUnlimitedSubscribeFeature.a(reader, customScalarAdapters);
            } else {
                onDeliveryUnlimitedSubscribeFeatureA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("DeliveryUnlimitedSubscribePlan"))) {
                reader.o();
                onDeliveryUnlimitedSubscribePlanA = OnDeliveryUnlimitedSubscribePlan.a(reader, customScalarAdapters);
            } else {
                onDeliveryUnlimitedSubscribePlanA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("Spacer"))) {
                reader.o();
                onSpacerA = OnSpacer.a(reader, customScalarAdapters);
            }
            return new DeliveryUnlimitedSubscribeQuery.Feed(str, onInsetBannerA, onDeliveryUnlimitedSubscribeFeatureA, onDeliveryUnlimitedSubscribePlanA, onSpacerA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribeQuery.Feed value = (DeliveryUnlimitedSubscribeQuery.Feed) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22627a);
            DeliveryUnlimitedSubscribeQuery.OnInsetBanner onInsetBanner = value.b;
            if (onInsetBanner != null) {
                OnInsetBanner.b(writer, customScalarAdapters, onInsetBanner);
            }
            DeliveryUnlimitedSubscribeQuery.OnDeliveryUnlimitedSubscribeFeature onDeliveryUnlimitedSubscribeFeature = value.c;
            if (onDeliveryUnlimitedSubscribeFeature != null) {
                OnDeliveryUnlimitedSubscribeFeature.b(writer, customScalarAdapters, onDeliveryUnlimitedSubscribeFeature);
            }
            DeliveryUnlimitedSubscribeQuery.OnDeliveryUnlimitedSubscribePlan onDeliveryUnlimitedSubscribePlan = value.d;
            if (onDeliveryUnlimitedSubscribePlan != null) {
                OnDeliveryUnlimitedSubscribePlan.b(writer, customScalarAdapters, onDeliveryUnlimitedSubscribePlan);
            }
            DeliveryUnlimitedSubscribeQuery.OnSpacer onSpacer = value.e;
            if (onSpacer != null) {
                List list = OnSpacer.f22665a;
                writer.F1("size");
                writer.v0(onSpacer.f22635a.d);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/adapter/DeliveryUnlimitedSubscribeQuery_ResponseAdapter$Footer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$Footer;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Footer implements Adapter<DeliveryUnlimitedSubscribeQuery.Footer> {

        /* renamed from: a, reason: collision with root package name */
        public static final Footer f22658a = new Footer();
        public static final List b = CollectionsKt.R("button", "disclaimer");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            DeliveryUnlimitedSubscribeQuery.Button button = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    button = (DeliveryUnlimitedSubscribeQuery.Button) Adapters.c(Button.f22651a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (button == null) {
                Assertions.a(reader, "button");
                throw null;
            }
            if (str != null) {
                return new DeliveryUnlimitedSubscribeQuery.Footer(button, str);
            }
            Assertions.a(reader, "disclaimer");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribeQuery.Footer value = (DeliveryUnlimitedSubscribeQuery.Footer) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("button");
            Adapters.c(Button.f22651a, false).toJson(writer, customScalarAdapters, value.f22628a);
            writer.F1("disclaimer");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/adapter/DeliveryUnlimitedSubscribeQuery_ResponseAdapter$Footer1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$Footer1;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Footer1 implements Adapter<DeliveryUnlimitedSubscribeQuery.Footer1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Footer1 f22659a = new Footer1();
        public static final List b = CollectionsKt.R("button", "disclaimer");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            DeliveryUnlimitedSubscribeQuery.Button1 button1 = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    button1 = (DeliveryUnlimitedSubscribeQuery.Button1) Adapters.c(Button1.f22652a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (button1 == null) {
                Assertions.a(reader, "button");
                throw null;
            }
            if (str != null) {
                return new DeliveryUnlimitedSubscribeQuery.Footer1(button1, str);
            }
            Assertions.a(reader, "disclaimer");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribeQuery.Footer1 value = (DeliveryUnlimitedSubscribeQuery.Footer1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("button");
            Adapters.c(Button1.f22652a, false).toJson(writer, customScalarAdapters, value.f22629a);
            writer.F1("disclaimer");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/adapter/DeliveryUnlimitedSubscribeQuery_ResponseAdapter$Link;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$Link;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Link implements Adapter<DeliveryUnlimitedSubscribeQuery.Link> {

        /* renamed from: a, reason: collision with root package name */
        public static final Link f22660a = new Link();
        public static final List b = CollectionsKt.R(TextBundle.TEXT_ENTRY, "url");

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
                return new DeliveryUnlimitedSubscribeQuery.Link(str, str2);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribeQuery.Link value = (DeliveryUnlimitedSubscribeQuery.Link) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22630a);
            writer.F1("url");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/adapter/DeliveryUnlimitedSubscribeQuery_ResponseAdapter$Link1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$Link1;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Link1 implements Adapter<DeliveryUnlimitedSubscribeQuery.Link1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Link1 f22661a = new Link1();
        public static final List b = CollectionsKt.R(TextBundle.TEXT_ENTRY, "url");

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
                return new DeliveryUnlimitedSubscribeQuery.Link1(str, str2);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribeQuery.Link1 value = (DeliveryUnlimitedSubscribeQuery.Link1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22631a);
            writer.F1("url");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/adapter/DeliveryUnlimitedSubscribeQuery_ResponseAdapter$OnDeliveryUnlimitedSubscribeFeature;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$OnDeliveryUnlimitedSubscribeFeature;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnDeliveryUnlimitedSubscribeFeature implements Adapter<DeliveryUnlimitedSubscribeQuery.OnDeliveryUnlimitedSubscribeFeature> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22662a = CollectionsKt.R("iconUrl", lqlqqlq.mmm006Dm006Dm);

        public static DeliveryUnlimitedSubscribeQuery.OnDeliveryUnlimitedSubscribeFeature a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f22662a);
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
                Assertions.a(reader, "iconUrl");
                throw null;
            }
            if (str2 != null) {
                return new DeliveryUnlimitedSubscribeQuery.OnDeliveryUnlimitedSubscribeFeature(str, str2);
            }
            Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, DeliveryUnlimitedSubscribeQuery.OnDeliveryUnlimitedSubscribeFeature value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("iconUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22632a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (DeliveryUnlimitedSubscribeQuery.OnDeliveryUnlimitedSubscribeFeature) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/adapter/DeliveryUnlimitedSubscribeQuery_ResponseAdapter$OnDeliveryUnlimitedSubscribePlan;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$OnDeliveryUnlimitedSubscribePlan;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnDeliveryUnlimitedSubscribePlan implements Adapter<DeliveryUnlimitedSubscribeQuery.OnDeliveryUnlimitedSubscribePlan> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22663a = CollectionsKt.R("identifier", "planTitle", NotificationMessage.NOTIF_KEY_SUB_TITLE, "price", "badge");

        public static DeliveryUnlimitedSubscribeQuery.OnDeliveryUnlimitedSubscribePlan a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            DeliveryUnlimitedSubscribeQuery.Badge1 badge1 = null;
            while (true) {
                int iO2 = reader.o2(f22663a);
                if (iO2 == 0) {
                    num = num2;
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    num = num2;
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    num = num2;
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    num = num2;
                    badge1 = (DeliveryUnlimitedSubscribeQuery.Badge1) Adapters.b(Adapters.c(Badge1.f22649a, false)).fromJson(reader, customScalarAdapters);
                }
                num2 = num;
            }
            Integer num3 = num2;
            if (str == null) {
                Assertions.a(reader, "identifier");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "planTitle");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
                throw null;
            }
            if (num3 != null) {
                return new DeliveryUnlimitedSubscribeQuery.OnDeliveryUnlimitedSubscribePlan(str, str2, str3, num3.intValue(), badge1);
            }
            Assertions.a(reader, "price");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, DeliveryUnlimitedSubscribeQuery.OnDeliveryUnlimitedSubscribePlan value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("identifier");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22633a);
            writer.F1("planTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("price");
            d.y(value.d, Adapters.b, writer, customScalarAdapters, "badge");
            Adapters.b(Adapters.c(Badge1.f22649a, false)).toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (DeliveryUnlimitedSubscribeQuery.OnDeliveryUnlimitedSubscribePlan) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/adapter/DeliveryUnlimitedSubscribeQuery_ResponseAdapter$OnInsetBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$OnInsetBanner;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnInsetBanner implements Adapter<DeliveryUnlimitedSubscribeQuery.OnInsetBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22664a = CollectionsKt.R("displayType", "message", "bannerTitle", UrlHandler.ACTION);

        public static DeliveryUnlimitedSubscribeQuery.OnInsetBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerDisplayType insetBannerDisplayTypeA = null;
            String str = null;
            String str2 = null;
            DeliveryUnlimitedSubscribeQuery.Action action = null;
            while (true) {
                int iO2 = reader.o2(f22664a);
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
                    action = (DeliveryUnlimitedSubscribeQuery.Action) Adapters.b(Adapters.c(Action.f22647a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerDisplayTypeA == null) {
                Assertions.a(reader, "displayType");
                throw null;
            }
            if (str != null) {
                return new DeliveryUnlimitedSubscribeQuery.OnInsetBanner(insetBannerDisplayTypeA, str, str2, action);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, DeliveryUnlimitedSubscribeQuery.OnInsetBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.f22634a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("bannerTitle");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1(UrlHandler.ACTION);
            Adapters.b(Adapters.c(Action.f22647a, false)).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (DeliveryUnlimitedSubscribeQuery.OnInsetBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/adapter/DeliveryUnlimitedSubscribeQuery_ResponseAdapter$OnSpacer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$OnSpacer;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnSpacer implements Adapter<DeliveryUnlimitedSubscribeQuery.OnSpacer> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22665a = CollectionsKt.Q("size");

        public static DeliveryUnlimitedSubscribeQuery.OnSpacer a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            SpacerType spacerTypeA = null;
            while (reader.o2(f22665a) == 0) {
                spacerTypeA = SpacerType_ResponseAdapter.a(reader, customScalarAdapters);
            }
            if (spacerTypeA != null) {
                return new DeliveryUnlimitedSubscribeQuery.OnSpacer(spacerTypeA);
            }
            Assertions.a(reader, "size");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribeQuery.OnSpacer value = (DeliveryUnlimitedSubscribeQuery.OnSpacer) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("size");
            writer.v0(value.f22635a.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/adapter/DeliveryUnlimitedSubscribeQuery_ResponseAdapter$PlanType;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$PlanType;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PlanType implements Adapter<DeliveryUnlimitedSubscribeQuery.PlanType> {

        /* renamed from: a, reason: collision with root package name */
        public static final PlanType f22666a = new PlanType();
        public static final List b = CollectionsKt.R("title", "defaultPlanSelection", "feed");

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
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Feed.f22657a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new DeliveryUnlimitedSubscribeQuery.PlanType(str, str2, arrayListFromJson);
            }
            Assertions.a(reader, "feed");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribeQuery.PlanType value = (DeliveryUnlimitedSubscribeQuery.PlanType) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22636a);
            writer.F1("defaultPlanSelection");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("feed");
            Adapters.a(Adapters.c(Feed.f22657a, true)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/adapter/DeliveryUnlimitedSubscribeQuery_ResponseAdapter$Plans;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$Plans;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Plans implements Adapter<DeliveryUnlimitedSubscribeQuery.Plans> {

        /* renamed from: a, reason: collision with root package name */
        public static final Plans f22667a = new Plans();
        public static final List b = CollectionsKt.R("title", "planTypes", "footer");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            DeliveryUnlimitedSubscribeQuery.Footer1 footer1 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson = Adapters.a(Adapters.c(PlanType.f22666a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    footer1 = (DeliveryUnlimitedSubscribeQuery.Footer1) Adapters.c(Footer1.f22659a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "planTypes");
                throw null;
            }
            if (footer1 != null) {
                return new DeliveryUnlimitedSubscribeQuery.Plans(str, arrayListFromJson, footer1);
            }
            Assertions.a(reader, "footer");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribeQuery.Plans value = (DeliveryUnlimitedSubscribeQuery.Plans) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22637a);
            writer.F1("planTypes");
            Adapters.a(Adapters.c(PlanType.f22666a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("footer");
            Adapters.c(Footer1.f22659a, false).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/adapter/DeliveryUnlimitedSubscribeQuery_ResponseAdapter$Summary;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$Summary;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Summary implements Adapter<DeliveryUnlimitedSubscribeQuery.Summary> {

        /* renamed from: a, reason: collision with root package name */
        public static final Summary f22668a = new Summary();
        public static final List b = CollectionsKt.R("title", "bannerAsset", "badge", "features", "footer", "disclaimer", "termsMarkdown");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            DeliveryUnlimitedSubscribeQuery.BannerAsset bannerAsset = null;
            DeliveryUnlimitedSubscribeQuery.Badge badge = null;
            ArrayList arrayListFromJson = null;
            DeliveryUnlimitedSubscribeQuery.Footer footer = null;
            DeliveryUnlimitedSubscribeQuery.Disclaimer disclaimer = null;
            DeliveryUnlimitedSubscribeQuery.TermsMarkdown termsMarkdown = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        bannerAsset = (DeliveryUnlimitedSubscribeQuery.BannerAsset) Adapters.b(Adapters.c(BannerAsset.f22650a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        badge = (DeliveryUnlimitedSubscribeQuery.Badge) Adapters.b(Adapters.c(Badge.f22648a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        arrayListFromJson = Adapters.a(Adapters.c(Feature.f22656a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        footer = (DeliveryUnlimitedSubscribeQuery.Footer) Adapters.c(Footer.f22658a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        disclaimer = (DeliveryUnlimitedSubscribeQuery.Disclaimer) Adapters.b(Adapters.c(Disclaimer.f22655a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        termsMarkdown = (DeliveryUnlimitedSubscribeQuery.TermsMarkdown) Adapters.c(TermsMarkdown.f22669a, false).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (arrayListFromJson == null) {
                            Assertions.a(reader, "features");
                            throw null;
                        }
                        if (footer == null) {
                            Assertions.a(reader, "footer");
                            throw null;
                        }
                        if (termsMarkdown != null) {
                            return new DeliveryUnlimitedSubscribeQuery.Summary(str, bannerAsset, badge, arrayListFromJson, footer, disclaimer, termsMarkdown);
                        }
                        Assertions.a(reader, "termsMarkdown");
                        throw null;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribeQuery.Summary value = (DeliveryUnlimitedSubscribeQuery.Summary) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22638a);
            writer.F1("bannerAsset");
            Adapters.b(Adapters.c(BannerAsset.f22650a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("badge");
            Adapters.b(Adapters.c(Badge.f22648a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("features");
            Adapters.a(Adapters.c(Feature.f22656a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("footer");
            Adapters.c(Footer.f22658a, false).toJson(writer, customScalarAdapters, value.e);
            writer.F1("disclaimer");
            Adapters.b(Adapters.c(Disclaimer.f22655a, false)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("termsMarkdown");
            Adapters.c(TermsMarkdown.f22669a, false).toJson(writer, customScalarAdapters, value.g);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/signup/adapter/DeliveryUnlimitedSubscribeQuery_ResponseAdapter$TermsMarkdown;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/signup/DeliveryUnlimitedSubscribeQuery$TermsMarkdown;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TermsMarkdown implements Adapter<DeliveryUnlimitedSubscribeQuery.TermsMarkdown> {

        /* renamed from: a, reason: collision with root package name */
        public static final TermsMarkdown f22669a = new TermsMarkdown();
        public static final List b = CollectionsKt.R("title", "content");

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
                return new DeliveryUnlimitedSubscribeQuery.TermsMarkdown(str, str2);
            }
            Assertions.a(reader, "content");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribeQuery.TermsMarkdown value = (DeliveryUnlimitedSubscribeQuery.TermsMarkdown) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22639a);
            writer.F1("content");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }
}
