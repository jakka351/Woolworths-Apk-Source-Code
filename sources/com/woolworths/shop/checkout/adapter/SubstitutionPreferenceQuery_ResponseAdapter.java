package com.woolworths.shop.checkout.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.BroadcastBannerType;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.adapter.BroadcastBannerType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ButtonStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerActionPlacement_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerDisplayType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.woolworths.shop.checkout.SubstitutionPreferenceQuery;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/SubstitutionPreferenceQuery_ResponseAdapter;", "", "Data", "SubstitutionPreference", "ProductToBeSubstituteSection", "CheaperSubstitutesSection", "Banner", "SubstitutionPreferenceOptionsSection", "InsetBanner", "Action", "Item", "ProductSubstitutesSection", "Substitution", "SubstitutionPreferenceFooter", "Button", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SubstitutionPreferenceQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/SubstitutionPreferenceQuery_ResponseAdapter$Action;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/SubstitutionPreferenceQuery$Action;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action implements Adapter<SubstitutionPreferenceQuery.Action> {

        /* renamed from: a, reason: collision with root package name */
        public static final Action f22024a = new Action();
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
                return new SubstitutionPreferenceQuery.Action(insetBannerActionPlacementA, insetBannerActionTypeA, str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SubstitutionPreferenceQuery.Action value = (SubstitutionPreferenceQuery.Action) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("placement");
            InsetBannerActionPlacement_ResponseAdapter.b(writer, customScalarAdapters, value.f21896a);
            writer.F1("type");
            InsetBannerActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/SubstitutionPreferenceQuery_ResponseAdapter$Banner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/SubstitutionPreferenceQuery$Banner;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Banner implements Adapter<SubstitutionPreferenceQuery.Banner> {

        /* renamed from: a, reason: collision with root package name */
        public static final Banner f22025a = new Banner();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "type", "imageUrl", "dismissible", "bannerId", "analyticsLabel");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            BroadcastBannerType broadcastBannerTypeA = null;
            Boolean bool = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        broadcastBannerTypeA = BroadcastBannerType_ResponseAdapter.a(reader, customScalarAdapters);
                        break;
                    case 3:
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (broadcastBannerTypeA == null) {
                            Assertions.a(reader, "type");
                            throw null;
                        }
                        if (str3 != null) {
                            return new SubstitutionPreferenceQuery.Banner(broadcastBannerTypeA, bool, str, str2, str3, str4, str5);
                        }
                        Assertions.a(reader, "imageUrl");
                        throw null;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SubstitutionPreferenceQuery.Banner value = (SubstitutionPreferenceQuery.Banner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21897a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("type");
            BroadcastBannerType_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("dismissible");
            Adapters.l.toJson(writer, customScalarAdapters, value.e);
            writer.F1("bannerId");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
            writer.F1("analyticsLabel");
            nullableAdapter.toJson(writer, customScalarAdapters, value.g);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/SubstitutionPreferenceQuery_ResponseAdapter$Button;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/SubstitutionPreferenceQuery$Button;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Button implements Adapter<SubstitutionPreferenceQuery.Button> {

        /* renamed from: a, reason: collision with root package name */
        public static final Button f22026a = new Button();
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
                return new SubstitutionPreferenceQuery.Button(str, str2, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SubstitutionPreferenceQuery.Button value = (SubstitutionPreferenceQuery.Button) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21898a);
            writer.F1(UrlHandler.ACTION);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.c);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.d));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/SubstitutionPreferenceQuery_ResponseAdapter$CheaperSubstitutesSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/SubstitutionPreferenceQuery$CheaperSubstitutesSection;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CheaperSubstitutesSection implements Adapter<SubstitutionPreferenceQuery.CheaperSubstitutesSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final CheaperSubstitutesSection f22027a = new CheaperSubstitutesSection();
        public static final List b = CollectionsKt.Q("banner");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            SubstitutionPreferenceQuery.Banner banner = null;
            while (reader.o2(b) == 0) {
                banner = (SubstitutionPreferenceQuery.Banner) Adapters.c(Banner.f22025a, false).fromJson(reader, customScalarAdapters);
            }
            if (banner != null) {
                return new SubstitutionPreferenceQuery.CheaperSubstitutesSection(banner);
            }
            Assertions.a(reader, "banner");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SubstitutionPreferenceQuery.CheaperSubstitutesSection value = (SubstitutionPreferenceQuery.CheaperSubstitutesSection) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("banner");
            Adapters.c(Banner.f22025a, false).toJson(writer, customScalarAdapters, value.f21899a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/SubstitutionPreferenceQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/SubstitutionPreferenceQuery$Data;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<SubstitutionPreferenceQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f22028a = new Data();
        public static final List b = CollectionsKt.Q("substitutionPreference");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            SubstitutionPreferenceQuery.SubstitutionPreference substitutionPreference = null;
            while (reader.o2(b) == 0) {
                substitutionPreference = (SubstitutionPreferenceQuery.SubstitutionPreference) Adapters.c(SubstitutionPreference.f22034a, false).fromJson(reader, customScalarAdapters);
            }
            if (substitutionPreference != null) {
                return new SubstitutionPreferenceQuery.Data(substitutionPreference);
            }
            Assertions.a(reader, "substitutionPreference");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SubstitutionPreferenceQuery.Data value = (SubstitutionPreferenceQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("substitutionPreference");
            Adapters.c(SubstitutionPreference.f22034a, false).toJson(writer, customScalarAdapters, value.f21900a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/SubstitutionPreferenceQuery_ResponseAdapter$InsetBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/SubstitutionPreferenceQuery$InsetBanner;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InsetBanner implements Adapter<SubstitutionPreferenceQuery.InsetBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final InsetBanner f22029a = new InsetBanner();
        public static final List b = CollectionsKt.R("message", "displayType", UrlHandler.ACTION);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            InsetBannerDisplayType insetBannerDisplayTypeA = null;
            SubstitutionPreferenceQuery.Action action = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    insetBannerDisplayTypeA = InsetBannerDisplayType_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    action = (SubstitutionPreferenceQuery.Action) Adapters.b(Adapters.c(Action.f22024a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "message");
                throw null;
            }
            if (insetBannerDisplayTypeA != null) {
                return new SubstitutionPreferenceQuery.InsetBanner(str, insetBannerDisplayTypeA, action);
            }
            Assertions.a(reader, "displayType");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SubstitutionPreferenceQuery.InsetBanner value = (SubstitutionPreferenceQuery.InsetBanner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21901a);
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            Adapters.b(Adapters.c(Action.f22024a, false)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/SubstitutionPreferenceQuery_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/SubstitutionPreferenceQuery$Item;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<SubstitutionPreferenceQuery.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f22030a = new Item();
        public static final List b = CollectionsKt.R("id", "title", "isSelected", "isEnabled", lqlqqlq.mmm006Dm006Dm, "showProducts");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    bool = bool2;
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = bool2;
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    bool = bool2;
                    bool3 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    bool = bool2;
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    bool = bool2;
                    bool4 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
                bool2 = bool;
            }
            Boolean bool5 = bool2;
            if (str == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (bool5 == null) {
                Assertions.a(reader, "isSelected");
                throw null;
            }
            Boolean bool6 = bool3;
            boolean zBooleanValue = bool5.booleanValue();
            if (bool6 == null) {
                Assertions.a(reader, "isEnabled");
                throw null;
            }
            Boolean bool7 = bool4;
            boolean zBooleanValue2 = bool6.booleanValue();
            if (bool7 != null) {
                return new SubstitutionPreferenceQuery.Item(str, str2, zBooleanValue, zBooleanValue2, bool7.booleanValue(), str3);
            }
            Assertions.a(reader, "showProducts");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SubstitutionPreferenceQuery.Item value = (SubstitutionPreferenceQuery.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21902a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("isSelected");
            Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
            d.B(value.c, adapters$BooleanAdapter$1, writer, customScalarAdapters, "isEnabled");
            d.B(value.d, adapters$BooleanAdapter$1, writer, customScalarAdapters, lqlqqlq.mmm006Dm006Dm);
            Adapters.i.toJson(writer, customScalarAdapters, value.e);
            writer.F1("showProducts");
            adapters$BooleanAdapter$1.toJson(writer, customScalarAdapters, Boolean.valueOf(value.f));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/SubstitutionPreferenceQuery_ResponseAdapter$ProductSubstitutesSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/SubstitutionPreferenceQuery$ProductSubstitutesSection;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductSubstitutesSection implements Adapter<SubstitutionPreferenceQuery.ProductSubstitutesSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductSubstitutesSection f22031a = new ProductSubstitutesSection();
        public static final List b = CollectionsKt.Q("substitutions");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            List list = null;
            while (reader.o2(b) == 0) {
                list = (List) Adapters.b(Adapters.a(Adapters.c(Substitution.f22033a, false))).fromJson(reader, customScalarAdapters);
            }
            return new SubstitutionPreferenceQuery.ProductSubstitutesSection(list);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SubstitutionPreferenceQuery.ProductSubstitutesSection value = (SubstitutionPreferenceQuery.ProductSubstitutesSection) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("substitutions");
            Adapters.b(Adapters.a(Adapters.c(Substitution.f22033a, false))).toJson(writer, customScalarAdapters, value.f21903a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/SubstitutionPreferenceQuery_ResponseAdapter$ProductToBeSubstituteSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/SubstitutionPreferenceQuery$ProductToBeSubstituteSection;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductToBeSubstituteSection implements Adapter<SubstitutionPreferenceQuery.ProductToBeSubstituteSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductToBeSubstituteSection f22032a = new ProductToBeSubstituteSection();
        public static final List b = CollectionsKt.R(AppMeasurementSdk.ConditionalUserProperty.NAME, "productId", "imageUrl");

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
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AppMeasurementSdk.ConditionalUserProperty.NAME);
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "productId");
                throw null;
            }
            if (str3 != null) {
                return new SubstitutionPreferenceQuery.ProductToBeSubstituteSection(str, str2, str3);
            }
            Assertions.a(reader, "imageUrl");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SubstitutionPreferenceQuery.ProductToBeSubstituteSection value = (SubstitutionPreferenceQuery.ProductToBeSubstituteSection) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AppMeasurementSdk.ConditionalUserProperty.NAME);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21904a);
            writer.F1("productId");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/SubstitutionPreferenceQuery_ResponseAdapter$Substitution;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/SubstitutionPreferenceQuery$Substitution;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Substitution implements Adapter<SubstitutionPreferenceQuery.Substitution> {

        /* renamed from: a, reason: collision with root package name */
        public static final Substitution f22033a = new Substitution();
        public static final List b = CollectionsKt.R(AppMeasurementSdk.ConditionalUserProperty.NAME, "quantity", "productId", "imageUrl", "isSelected");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Double d;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Double d2 = null;
            Boolean bool = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    d = d2;
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    d2 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    d = d2;
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    d = d2;
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    d = d2;
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
                d2 = d;
            }
            Double d3 = d2;
            if (str == null) {
                Assertions.a(reader, AppMeasurementSdk.ConditionalUserProperty.NAME);
                throw null;
            }
            if (d3 == null) {
                Assertions.a(reader, "quantity");
                throw null;
            }
            Boolean bool2 = bool;
            double dDoubleValue = d3.doubleValue();
            if (str2 == null) {
                Assertions.a(reader, "productId");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "imageUrl");
                throw null;
            }
            if (bool2 != null) {
                return new SubstitutionPreferenceQuery.Substitution(dDoubleValue, str, str2, str3, bool2.booleanValue());
            }
            Assertions.a(reader, "isSelected");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SubstitutionPreferenceQuery.Substitution value = (SubstitutionPreferenceQuery.Substitution) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AppMeasurementSdk.ConditionalUserProperty.NAME);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21905a);
            writer.F1("quantity");
            Adapters.c.toJson(writer, customScalarAdapters, Double.valueOf(value.b));
            writer.F1("productId");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("isSelected");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.e));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/SubstitutionPreferenceQuery_ResponseAdapter$SubstitutionPreference;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/SubstitutionPreferenceQuery$SubstitutionPreference;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SubstitutionPreference implements Adapter<SubstitutionPreferenceQuery.SubstitutionPreference> {

        /* renamed from: a, reason: collision with root package name */
        public static final SubstitutionPreference f22034a = new SubstitutionPreference();
        public static final List b = CollectionsKt.R("productToBeSubstituteSection", "cheaperSubstitutesSection", "substitutionPreferenceOptionsSection", "productSubstitutesSection", "substitutionPreferenceFooter");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            SubstitutionPreferenceQuery.ProductToBeSubstituteSection productToBeSubstituteSection = null;
            SubstitutionPreferenceQuery.CheaperSubstitutesSection cheaperSubstitutesSection = null;
            SubstitutionPreferenceQuery.SubstitutionPreferenceOptionsSection substitutionPreferenceOptionsSection = null;
            SubstitutionPreferenceQuery.ProductSubstitutesSection productSubstitutesSection = null;
            SubstitutionPreferenceQuery.SubstitutionPreferenceFooter substitutionPreferenceFooter = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    productToBeSubstituteSection = (SubstitutionPreferenceQuery.ProductToBeSubstituteSection) Adapters.c(ProductToBeSubstituteSection.f22032a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    cheaperSubstitutesSection = (SubstitutionPreferenceQuery.CheaperSubstitutesSection) Adapters.c(CheaperSubstitutesSection.f22027a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    substitutionPreferenceOptionsSection = (SubstitutionPreferenceQuery.SubstitutionPreferenceOptionsSection) Adapters.c(SubstitutionPreferenceOptionsSection.f22036a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    productSubstitutesSection = (SubstitutionPreferenceQuery.ProductSubstitutesSection) Adapters.c(ProductSubstitutesSection.f22031a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    substitutionPreferenceFooter = (SubstitutionPreferenceQuery.SubstitutionPreferenceFooter) Adapters.c(SubstitutionPreferenceFooter.f22035a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (productToBeSubstituteSection == null) {
                Assertions.a(reader, "productToBeSubstituteSection");
                throw null;
            }
            if (cheaperSubstitutesSection == null) {
                Assertions.a(reader, "cheaperSubstitutesSection");
                throw null;
            }
            if (substitutionPreferenceOptionsSection == null) {
                Assertions.a(reader, "substitutionPreferenceOptionsSection");
                throw null;
            }
            if (productSubstitutesSection == null) {
                Assertions.a(reader, "productSubstitutesSection");
                throw null;
            }
            if (substitutionPreferenceFooter != null) {
                return new SubstitutionPreferenceQuery.SubstitutionPreference(productToBeSubstituteSection, cheaperSubstitutesSection, substitutionPreferenceOptionsSection, productSubstitutesSection, substitutionPreferenceFooter);
            }
            Assertions.a(reader, "substitutionPreferenceFooter");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SubstitutionPreferenceQuery.SubstitutionPreference value = (SubstitutionPreferenceQuery.SubstitutionPreference) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productToBeSubstituteSection");
            Adapters.c(ProductToBeSubstituteSection.f22032a, false).toJson(writer, customScalarAdapters, value.f21906a);
            writer.F1("cheaperSubstitutesSection");
            Adapters.c(CheaperSubstitutesSection.f22027a, false).toJson(writer, customScalarAdapters, value.b);
            writer.F1("substitutionPreferenceOptionsSection");
            Adapters.c(SubstitutionPreferenceOptionsSection.f22036a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("productSubstitutesSection");
            Adapters.c(ProductSubstitutesSection.f22031a, false).toJson(writer, customScalarAdapters, value.d);
            writer.F1("substitutionPreferenceFooter");
            Adapters.c(SubstitutionPreferenceFooter.f22035a, false).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/SubstitutionPreferenceQuery_ResponseAdapter$SubstitutionPreferenceFooter;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/SubstitutionPreferenceQuery$SubstitutionPreferenceFooter;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SubstitutionPreferenceFooter implements Adapter<SubstitutionPreferenceQuery.SubstitutionPreferenceFooter> {

        /* renamed from: a, reason: collision with root package name */
        public static final SubstitutionPreferenceFooter f22035a = new SubstitutionPreferenceFooter();
        public static final List b = CollectionsKt.Q("button");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            SubstitutionPreferenceQuery.Button button = null;
            while (reader.o2(b) == 0) {
                button = (SubstitutionPreferenceQuery.Button) Adapters.c(Button.f22026a, false).fromJson(reader, customScalarAdapters);
            }
            if (button != null) {
                return new SubstitutionPreferenceQuery.SubstitutionPreferenceFooter(button);
            }
            Assertions.a(reader, "button");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SubstitutionPreferenceQuery.SubstitutionPreferenceFooter value = (SubstitutionPreferenceQuery.SubstitutionPreferenceFooter) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("button");
            Adapters.c(Button.f22026a, false).toJson(writer, customScalarAdapters, value.f21907a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/SubstitutionPreferenceQuery_ResponseAdapter$SubstitutionPreferenceOptionsSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/SubstitutionPreferenceQuery$SubstitutionPreferenceOptionsSection;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SubstitutionPreferenceOptionsSection implements Adapter<SubstitutionPreferenceQuery.SubstitutionPreferenceOptionsSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final SubstitutionPreferenceOptionsSection f22036a = new SubstitutionPreferenceOptionsSection();
        public static final List b = CollectionsKt.R("title", "insetBanner", "items");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            SubstitutionPreferenceQuery.InsetBanner insetBanner = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    insetBanner = (SubstitutionPreferenceQuery.InsetBanner) Adapters.b(Adapters.c(InsetBanner.f22029a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Item.f22030a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new SubstitutionPreferenceQuery.SubstitutionPreferenceOptionsSection(str, insetBanner, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SubstitutionPreferenceQuery.SubstitutionPreferenceOptionsSection value = (SubstitutionPreferenceQuery.SubstitutionPreferenceOptionsSection) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21908a);
            writer.F1("insetBanner");
            Adapters.b(Adapters.c(InsetBanner.f22029a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("items");
            Adapters.a(Adapters.c(Item.f22030a, false)).toJson(writer, customScalarAdapters, value.c);
        }
    }
}
