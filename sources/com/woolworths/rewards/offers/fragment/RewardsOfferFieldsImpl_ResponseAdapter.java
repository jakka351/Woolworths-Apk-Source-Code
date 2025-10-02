package com.woolworths.rewards.offers.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.rewards.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.rewards.graphql.type.InsetBannerActionType;
import au.com.woolworths.rewards.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.rewards.graphql.type.RewardsOfferStatus;
import au.com.woolworths.rewards.graphql.type.adapter.InsetBannerActionPlacement_ResponseAdapter;
import au.com.woolworths.rewards.graphql.type.adapter.InsetBannerActionType_ResponseAdapter;
import au.com.woolworths.rewards.graphql.type.adapter.InsetBannerDisplayType_ResponseAdapter;
import au.com.woolworths.rewards.graphql.type.adapter.RewardsOfferStatus_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.common.Scopes;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.woolworths.rewards.offers.fragment.IconAssetImpl_ResponseAdapter;
import com.woolworths.rewards.offers.fragment.RewardsOfferFields;
import com.woolworths.rewards.offers.fragment.fragment.StandardBannerFields;
import com.woolworths.rewards.offers.fragment.fragment.StandardBannerFieldsImpl_ResponseAdapter;
import com.woolworths.scanlibrary.util.widget.CircularProgressDrawable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\bÇ\u0002\u0018\u00002\u00020\u0001:\u0011\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFieldsImpl_ResponseAdapter;", "", "RewardsOfferFields", "StandardBanner", "BoostedOfferInsetBanner", "Action", "Mechanics", "Item", "StatusIcon", "OfferAnalytics", "ActivationMessage", "Roundel", "OfferListCta", "Cta", "OfferDetailsCta", "Cta1", "OfferTileProgressTracker", "CircularProgressIndicator", "PrimaryRing", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RewardsOfferFieldsImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFieldsImpl_ResponseAdapter$Action;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsOfferFields$Action;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action implements Adapter<RewardsOfferFields.Action> {

        /* renamed from: a, reason: collision with root package name */
        public static final Action f20957a = new Action();
        public static final List b = CollectionsKt.R("placement", "type", AnnotatedPrivateKey.LABEL, "url", "actionAccessibilityHint");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerActionPlacement insetBannerActionPlacementA = null;
            InsetBannerActionType insetBannerActionTypeA = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    insetBannerActionPlacementA = InsetBannerActionPlacement_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    insetBannerActionTypeA = InsetBannerActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
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
                return new RewardsOfferFields.Action(insetBannerActionPlacementA, insetBannerActionTypeA, str, str2, str3);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsOfferFields.Action value = (RewardsOfferFields.Action) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("placement");
            writer.v0(value.f20941a.d);
            writer.F1("type");
            writer.v0(value.b.d);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
            writer.F1("url");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("actionAccessibilityHint");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFieldsImpl_ResponseAdapter$ActivationMessage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsOfferFields$ActivationMessage;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ActivationMessage implements Adapter<RewardsOfferFields.ActivationMessage> {

        /* renamed from: a, reason: collision with root package name */
        public static final ActivationMessage f20958a = new ActivationMessage();
        public static final List b = CollectionsKt.R("title", "message", "buttonLabel");

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
                        break;
                    }
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str3 != null) {
                return new RewardsOfferFields.ActivationMessage(str, str2, str3);
            }
            Assertions.a(reader, "buttonLabel");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsOfferFields.ActivationMessage value = (RewardsOfferFields.ActivationMessage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f20942a);
            writer.F1("message");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("buttonLabel");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFieldsImpl_ResponseAdapter$BoostedOfferInsetBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsOfferFields$BoostedOfferInsetBanner;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BoostedOfferInsetBanner implements Adapter<RewardsOfferFields.BoostedOfferInsetBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final BoostedOfferInsetBanner f20959a = new BoostedOfferInsetBanner();
        public static final List b = CollectionsKt.R("displayType", "message", "title", "iconUrl", UrlHandler.ACTION);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerDisplayType insetBannerDisplayTypeA = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            RewardsOfferFields.Action action = null;
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
                    action = (RewardsOfferFields.Action) Adapters.b(Adapters.c(Action.f20957a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerDisplayTypeA == null) {
                Assertions.a(reader, "displayType");
                throw null;
            }
            if (str != null) {
                return new RewardsOfferFields.BoostedOfferInsetBanner(insetBannerDisplayTypeA, str, str2, str3, action);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsOfferFields.BoostedOfferInsetBanner value = (RewardsOfferFields.BoostedOfferInsetBanner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            writer.v0(value.f20943a.d);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("title");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("iconUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1(UrlHandler.ACTION);
            Adapters.b(Adapters.c(Action.f20957a, false)).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFieldsImpl_ResponseAdapter$CircularProgressIndicator;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsOfferFields$CircularProgressIndicator;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CircularProgressIndicator implements Adapter<RewardsOfferFields.CircularProgressIndicator> {

        /* renamed from: a, reason: collision with root package name */
        public static final CircularProgressIndicator f20960a = new CircularProgressIndicator();
        public static final List b = CollectionsKt.Q("primaryRing");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            RewardsOfferFields.PrimaryRing primaryRing = null;
            while (reader.o2(b) == 0) {
                primaryRing = (RewardsOfferFields.PrimaryRing) Adapters.c(PrimaryRing.f20969a, false).fromJson(reader, customScalarAdapters);
            }
            if (primaryRing != null) {
                return new RewardsOfferFields.CircularProgressIndicator(primaryRing);
            }
            Assertions.a(reader, "primaryRing");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsOfferFields.CircularProgressIndicator value = (RewardsOfferFields.CircularProgressIndicator) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("primaryRing");
            Adapters.c(PrimaryRing.f20969a, false).toJson(writer, customScalarAdapters, value.f20944a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFieldsImpl_ResponseAdapter$Cta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsOfferFields$Cta;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Cta implements Adapter<RewardsOfferFields.Cta> {

        /* renamed from: a, reason: collision with root package name */
        public static final Cta f20961a = new Cta();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "url", "isExternalUrl");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            Boolean bool = null;
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
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new RewardsOfferFields.Cta(bool, str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsOfferFields.Cta value = (RewardsOfferFields.Cta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20945a);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("isExternalUrl");
            Adapters.l.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFieldsImpl_ResponseAdapter$Cta1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsOfferFields$Cta1;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Cta1 implements Adapter<RewardsOfferFields.Cta1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Cta1 f20962a = new Cta1();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "url", "isExternalUrl");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            Boolean bool = null;
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
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new RewardsOfferFields.Cta1(bool, str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsOfferFields.Cta1 value = (RewardsOfferFields.Cta1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20946a);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("isExternalUrl");
            Adapters.l.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFieldsImpl_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsOfferFields$Item;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<RewardsOfferFields.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f20963a = new Item();
        public static final List b = CollectionsKt.R(BarcodePickDeserializer.FIELD_ICON, "caption", "altText", "title");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, BarcodePickDeserializer.FIELD_ICON);
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "caption");
                throw null;
            }
            if (str4 != null) {
                return new RewardsOfferFields.Item(str, str2, str3, str4);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsOfferFields.Item value = (RewardsOfferFields.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(BarcodePickDeserializer.FIELD_ICON);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20947a);
            writer.F1("caption");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("altText");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFieldsImpl_ResponseAdapter$Mechanics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsOfferFields$Mechanics;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Mechanics implements Adapter<RewardsOfferFields.Mechanics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Mechanics f20964a = new Mechanics();
        public static final List b = CollectionsKt.R("displayLastUpdated", "separator", "selectedIndex", "items");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            Integer num = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Item.f20963a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "displayLastUpdated");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "separator");
                throw null;
            }
            if (num == null) {
                Assertions.a(reader, "selectedIndex");
                throw null;
            }
            int iIntValue = num.intValue();
            if (arrayListFromJson != null) {
                return new RewardsOfferFields.Mechanics(str, str2, iIntValue, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsOfferFields.Mechanics value = (RewardsOfferFields.Mechanics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayLastUpdated");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20948a);
            writer.F1("separator");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("selectedIndex");
            d.y(value.c, Adapters.b, writer, customScalarAdapters, "items");
            Adapters.a(Adapters.c(Item.f20963a, false)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFieldsImpl_ResponseAdapter$OfferAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsOfferFields$OfferAnalytics;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OfferAnalytics implements Adapter<RewardsOfferFields.OfferAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final OfferAnalytics f20965a = new OfferAnalytics();
        public static final List b = CollectionsKt.R("offerName", "commId", "uoid", "campaignCode", "campaignStream", "channel", "status", "offerType", "partnerId", "rtlAccountID", "rtlCampaignID", "rtlCampaignCode", "rtlCouponStart", Scopes.PROFILE);

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
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
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
                    case 9:
                        str10 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        str11 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 11:
                        str12 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 12:
                        str13 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 13:
                        str14 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        return new RewardsOfferFields.OfferAnalytics(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsOfferFields.OfferAnalytics value = (RewardsOfferFields.OfferAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("offerName");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f20949a);
            writer.F1("commId");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("uoid");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("campaignCode");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("campaignStream");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("channel");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
            writer.F1("status");
            nullableAdapter.toJson(writer, customScalarAdapters, value.g);
            writer.F1("offerType");
            nullableAdapter.toJson(writer, customScalarAdapters, value.h);
            writer.F1("partnerId");
            nullableAdapter.toJson(writer, customScalarAdapters, value.i);
            writer.F1("rtlAccountID");
            nullableAdapter.toJson(writer, customScalarAdapters, value.j);
            writer.F1("rtlCampaignID");
            nullableAdapter.toJson(writer, customScalarAdapters, value.k);
            writer.F1("rtlCampaignCode");
            nullableAdapter.toJson(writer, customScalarAdapters, value.l);
            writer.F1("rtlCouponStart");
            nullableAdapter.toJson(writer, customScalarAdapters, value.m);
            writer.F1(Scopes.PROFILE);
            nullableAdapter.toJson(writer, customScalarAdapters, value.n);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFieldsImpl_ResponseAdapter$OfferDetailsCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsOfferFields$OfferDetailsCta;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OfferDetailsCta implements Adapter<RewardsOfferFields.OfferDetailsCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final OfferDetailsCta f20966a = new OfferDetailsCta();
        public static final List b = CollectionsKt.R("cta", "displayStatus");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            RewardsOfferFields.Cta1 cta1 = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    cta1 = (RewardsOfferFields.Cta1) Adapters.c(Cta1.f20962a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (cta1 != null) {
                return new RewardsOfferFields.OfferDetailsCta(cta1, str);
            }
            Assertions.a(reader, "cta");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsOfferFields.OfferDetailsCta value = (RewardsOfferFields.OfferDetailsCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("cta");
            Adapters.c(Cta1.f20962a, false).toJson(writer, customScalarAdapters, value.f20950a);
            writer.F1("displayStatus");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFieldsImpl_ResponseAdapter$OfferListCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsOfferFields$OfferListCta;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OfferListCta implements Adapter<RewardsOfferFields.OfferListCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final OfferListCta f20967a = new OfferListCta();
        public static final List b = CollectionsKt.R("cta", "displayStatus");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            RewardsOfferFields.Cta cta = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    cta = (RewardsOfferFields.Cta) Adapters.c(Cta.f20961a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (cta != null) {
                return new RewardsOfferFields.OfferListCta(cta, str);
            }
            Assertions.a(reader, "cta");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsOfferFields.OfferListCta value = (RewardsOfferFields.OfferListCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("cta");
            Adapters.c(Cta.f20961a, false).toJson(writer, customScalarAdapters, value.f20951a);
            writer.F1("displayStatus");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFieldsImpl_ResponseAdapter$OfferTileProgressTracker;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsOfferFields$OfferTileProgressTracker;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OfferTileProgressTracker implements Adapter<RewardsOfferFields.OfferTileProgressTracker> {

        /* renamed from: a, reason: collision with root package name */
        public static final OfferTileProgressTracker f20968a = new OfferTileProgressTracker();
        public static final List b = CollectionsKt.R("title", "titleSuffix", lqlqqlq.mmm006Dm006Dm, "circularProgressIndicator");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            RewardsOfferFields.CircularProgressIndicator circularProgressIndicator = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    circularProgressIndicator = (RewardsOfferFields.CircularProgressIndicator) Adapters.c(CircularProgressIndicator.f20960a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
                throw null;
            }
            if (circularProgressIndicator != null) {
                return new RewardsOfferFields.OfferTileProgressTracker(str, str2, str3, circularProgressIndicator);
            }
            Assertions.a(reader, "circularProgressIndicator");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsOfferFields.OfferTileProgressTracker value = (RewardsOfferFields.OfferTileProgressTracker) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20952a);
            writer.F1("titleSuffix");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("circularProgressIndicator");
            Adapters.c(CircularProgressIndicator.f20960a, false).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFieldsImpl_ResponseAdapter$PrimaryRing;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsOfferFields$PrimaryRing;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PrimaryRing implements Adapter<RewardsOfferFields.PrimaryRing> {

        /* renamed from: a, reason: collision with root package name */
        public static final PrimaryRing f20969a = new PrimaryRing();
        public static final List b = CollectionsKt.R("ringPercent", CircularProgressDrawable.RING_COLOR_PROPERTY);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Double d = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    d = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (d == null) {
                Assertions.a(reader, "ringPercent");
                throw null;
            }
            double dDoubleValue = d.doubleValue();
            if (str != null) {
                return new RewardsOfferFields.PrimaryRing(dDoubleValue, str);
            }
            Assertions.a(reader, CircularProgressDrawable.RING_COLOR_PROPERTY);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsOfferFields.PrimaryRing value = (RewardsOfferFields.PrimaryRing) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("ringPercent");
            Adapters.c.toJson(writer, customScalarAdapters, Double.valueOf(value.f20953a));
            writer.F1(CircularProgressDrawable.RING_COLOR_PROPERTY);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFieldsImpl_ResponseAdapter$RewardsOfferFields;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsOfferFields;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsOfferFields implements Adapter<com.woolworths.rewards.offers.fragment.RewardsOfferFields> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20970a = CollectionsKt.R("offerId", "image", "bannerUrl", "standardBanner", "boostedOfferInsetBanner", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, ErrorBundle.SUMMARY_ENTRY, "body", "formattedTermsAndConditions", "markdownTermsAndConditions", "displayStatus", "offerStatus", "mechanics", "displayExpiry", "displayExpiryExtended", "statusIcons", "offerAnalytics", "activationAnimation", "displayAnimation", "activationMessage", "brandLogoUrl", "brandLogoUrlCompact", "roundel", "offerListCta", "offerDetailsCta", "offerTileProgressTracker", "offerTileAltText");

        public static com.woolworths.rewards.offers.fragment.RewardsOfferFields a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            RewardsOfferFields.StandardBanner standardBanner = null;
            RewardsOfferFields.BoostedOfferInsetBanner boostedOfferInsetBanner = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            RewardsOfferStatus rewardsOfferStatusA = null;
            RewardsOfferFields.Mechanics mechanics = null;
            String str11 = null;
            String str12 = null;
            List list = null;
            RewardsOfferFields.OfferAnalytics offerAnalytics = null;
            String str13 = null;
            String str14 = null;
            RewardsOfferFields.ActivationMessage activationMessage = null;
            String str15 = null;
            String str16 = null;
            RewardsOfferFields.Roundel roundel = null;
            RewardsOfferFields.OfferListCta offerListCta = null;
            RewardsOfferFields.OfferDetailsCta offerDetailsCta = null;
            RewardsOfferFields.OfferTileProgressTracker offerTileProgressTracker = null;
            String str17 = null;
            while (true) {
                switch (reader.o2(f20970a)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        standardBanner = (RewardsOfferFields.StandardBanner) Adapters.b(Adapters.c(StandardBanner.f20972a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        boostedOfferInsetBanner = (RewardsOfferFields.BoostedOfferInsetBanner) Adapters.b(Adapters.c(BoostedOfferInsetBanner.f20959a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        str6 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        str7 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        str8 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        str9 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 11:
                        str10 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 12:
                        rewardsOfferStatusA = RewardsOfferStatus_ResponseAdapter.a(reader, customScalarAdapters);
                        break;
                    case 13:
                        mechanics = (RewardsOfferFields.Mechanics) Adapters.b(Adapters.c(Mechanics.f20964a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 14:
                        str11 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 15:
                        str12 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 16:
                        list = (List) Adapters.b(Adapters.a(Adapters.c(StatusIcon.f20973a, false))).fromJson(reader, customScalarAdapters);
                        break;
                    case 17:
                        offerAnalytics = (RewardsOfferFields.OfferAnalytics) Adapters.b(Adapters.c(OfferAnalytics.f20965a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 18:
                        str13 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 19:
                        str14 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 20:
                        activationMessage = (RewardsOfferFields.ActivationMessage) Adapters.b(Adapters.c(ActivationMessage.f20958a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 21:
                        str15 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 22:
                        str16 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 23:
                        roundel = (RewardsOfferFields.Roundel) Adapters.b(Adapters.c(Roundel.f20971a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 24:
                        offerListCta = (RewardsOfferFields.OfferListCta) Adapters.b(Adapters.c(OfferListCta.f20967a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 25:
                        offerDetailsCta = (RewardsOfferFields.OfferDetailsCta) Adapters.b(Adapters.c(OfferDetailsCta.f20966a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 26:
                        offerTileProgressTracker = (RewardsOfferFields.OfferTileProgressTracker) Adapters.b(Adapters.c(OfferTileProgressTracker.f20968a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 27:
                        str17 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "offerId");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "image");
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str5 == null) {
                            Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
                            throw null;
                        }
                        if (str10 == null) {
                            Assertions.a(reader, "displayStatus");
                            throw null;
                        }
                        if (rewardsOfferStatusA == null) {
                            Assertions.a(reader, "offerStatus");
                            throw null;
                        }
                        if (str11 != null) {
                            return new com.woolworths.rewards.offers.fragment.RewardsOfferFields(str, str2, str3, standardBanner, boostedOfferInsetBanner, str4, str5, str6, str7, str8, str9, str10, rewardsOfferStatusA, mechanics, str11, str12, list, offerAnalytics, str13, str14, activationMessage, str15, str16, roundel, offerListCta, offerDetailsCta, offerTileProgressTracker, str17);
                        }
                        Assertions.a(reader, "displayExpiry");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, com.woolworths.rewards.offers.fragment.RewardsOfferFields value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("offerId");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20940a);
            writer.F1("image");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("bannerUrl");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("standardBanner");
            Adapters.b(Adapters.c(StandardBanner.f20972a, true)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("boostedOfferInsetBanner");
            Adapters.b(Adapters.c(BoostedOfferInsetBanner.f20959a, false)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.g);
            writer.F1(ErrorBundle.SUMMARY_ENTRY);
            nullableAdapter.toJson(writer, customScalarAdapters, value.h);
            writer.F1("body");
            nullableAdapter.toJson(writer, customScalarAdapters, value.i);
            writer.F1("formattedTermsAndConditions");
            nullableAdapter.toJson(writer, customScalarAdapters, value.j);
            writer.F1("markdownTermsAndConditions");
            nullableAdapter.toJson(writer, customScalarAdapters, value.k);
            writer.F1("displayStatus");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.l);
            writer.F1("offerStatus");
            RewardsOfferStatus_ResponseAdapter.b(writer, customScalarAdapters, value.m);
            writer.F1("mechanics");
            Adapters.b(Adapters.c(Mechanics.f20964a, false)).toJson(writer, customScalarAdapters, value.n);
            writer.F1("displayExpiry");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.o);
            writer.F1("displayExpiryExtended");
            nullableAdapter.toJson(writer, customScalarAdapters, value.p);
            writer.F1("statusIcons");
            Adapters.b(Adapters.a(Adapters.c(StatusIcon.f20973a, false))).toJson(writer, customScalarAdapters, value.q);
            writer.F1("offerAnalytics");
            Adapters.b(Adapters.c(OfferAnalytics.f20965a, false)).toJson(writer, customScalarAdapters, value.r);
            writer.F1("activationAnimation");
            nullableAdapter.toJson(writer, customScalarAdapters, value.s);
            writer.F1("displayAnimation");
            nullableAdapter.toJson(writer, customScalarAdapters, value.t);
            writer.F1("activationMessage");
            Adapters.b(Adapters.c(ActivationMessage.f20958a, false)).toJson(writer, customScalarAdapters, value.u);
            writer.F1("brandLogoUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.v);
            writer.F1("brandLogoUrlCompact");
            nullableAdapter.toJson(writer, customScalarAdapters, value.w);
            writer.F1("roundel");
            Adapters.b(Adapters.c(Roundel.f20971a, true)).toJson(writer, customScalarAdapters, value.x);
            writer.F1("offerListCta");
            Adapters.b(Adapters.c(OfferListCta.f20967a, false)).toJson(writer, customScalarAdapters, value.y);
            writer.F1("offerDetailsCta");
            Adapters.b(Adapters.c(OfferDetailsCta.f20966a, false)).toJson(writer, customScalarAdapters, value.z);
            writer.F1("offerTileProgressTracker");
            Adapters.b(Adapters.c(OfferTileProgressTracker.f20968a, false)).toJson(writer, customScalarAdapters, value.A);
            writer.F1("offerTileAltText");
            nullableAdapter.toJson(writer, customScalarAdapters, value.B);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (com.woolworths.rewards.offers.fragment.RewardsOfferFields) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFieldsImpl_ResponseAdapter$Roundel;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsOfferFields$Roundel;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Roundel implements Adapter<RewardsOfferFields.Roundel> {

        /* renamed from: a, reason: collision with root package name */
        public static final Roundel f20971a = new Roundel();
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
            IconAsset iconAssetA = IconAssetImpl_ResponseAdapter.IconAsset.a(reader, customScalarAdapters);
            if (str != null) {
                return new RewardsOfferFields.Roundel(str, iconAssetA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsOfferFields.Roundel value = (RewardsOfferFields.Roundel) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20954a);
            List list = IconAssetImpl_ResponseAdapter.IconAsset.f20890a;
            IconAssetImpl_ResponseAdapter.IconAsset.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFieldsImpl_ResponseAdapter$StandardBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsOfferFields$StandardBanner;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StandardBanner implements Adapter<RewardsOfferFields.StandardBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final StandardBanner f20972a = new StandardBanner();
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
            StandardBannerFields standardBannerFieldsA = StandardBannerFieldsImpl_ResponseAdapter.StandardBannerFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new RewardsOfferFields.StandardBanner(str, standardBannerFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsOfferFields.StandardBanner value = (RewardsOfferFields.StandardBanner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20955a);
            List list = StandardBannerFieldsImpl_ResponseAdapter.StandardBannerFields.f21035a;
            StandardBannerFieldsImpl_ResponseAdapter.StandardBannerFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFieldsImpl_ResponseAdapter$StatusIcon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsOfferFields$StatusIcon;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StatusIcon implements Adapter<RewardsOfferFields.StatusIcon> {

        /* renamed from: a, reason: collision with root package name */
        public static final StatusIcon f20973a = new StatusIcon();
        public static final List b = CollectionsKt.Q(BarcodePickDeserializer.FIELD_ICON);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new RewardsOfferFields.StatusIcon(str);
            }
            Assertions.a(reader, BarcodePickDeserializer.FIELD_ICON);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsOfferFields.StatusIcon value = (RewardsOfferFields.StatusIcon) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(BarcodePickDeserializer.FIELD_ICON);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20956a);
        }
    }
}
