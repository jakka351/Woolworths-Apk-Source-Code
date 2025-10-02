package com.woolworths.rewards.offers.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.woolworths.rewards.offers.fragment.RewardsOfferFeedFields;
import com.woolworths.rewards.offers.fragment.fragment.ContentCtaFields;
import com.woolworths.rewards.offers.fragment.fragment.ContentCtaFieldsImpl_ResponseAdapter;
import com.woolworths.rewards.offers.fragment.fragment.OffersSectionsFragment;
import com.woolworths.rewards.offers.fragment.fragment.OffersSectionsFragmentImpl_ResponseAdapter;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\bÇ\u0002\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFieldsImpl_ResponseAdapter;", "", "RewardsOfferFeedFields", "Header", "Summary", "OnRewardsSummaryText", "ErrorMessage", "PrimaryCta", "SecondaryCta", "Message", "Filter", "Message1", "Analytics", "SectionConfigsFeed", "OnOffersSectionConfig", "OnBannerSectionConfig", "Section", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RewardsOfferFeedFieldsImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFieldsImpl_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFields$Analytics;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<RewardsOfferFeedFields.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f20925a = new Analytics();
        public static final List b = CollectionsKt.Q(AnnotatedPrivateKey.LABEL);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new RewardsOfferFeedFields.Analytics(str);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsOfferFeedFields.Analytics value = (RewardsOfferFeedFields.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20911a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFieldsImpl_ResponseAdapter$ErrorMessage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFields$ErrorMessage;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ErrorMessage implements Adapter<RewardsOfferFeedFields.ErrorMessage> {

        /* renamed from: a, reason: collision with root package name */
        public static final ErrorMessage f20926a = new ErrorMessage();
        public static final List b = CollectionsKt.R("title", lqlqqlq.mmm006Dm006Dm, "primaryCta", "secondaryCta");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            RewardsOfferFeedFields.PrimaryCta primaryCta = null;
            RewardsOfferFeedFields.SecondaryCta secondaryCta = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    primaryCta = (RewardsOfferFeedFields.PrimaryCta) Adapters.b(Adapters.c(PrimaryCta.f20934a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    secondaryCta = (RewardsOfferFeedFields.SecondaryCta) Adapters.b(Adapters.c(SecondaryCta.f20936a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new RewardsOfferFeedFields.ErrorMessage(str, str2, primaryCta, secondaryCta);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsOfferFeedFields.ErrorMessage value = (RewardsOfferFeedFields.ErrorMessage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20912a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("primaryCta");
            Adapters.b(Adapters.c(PrimaryCta.f20934a, true)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("secondaryCta");
            Adapters.b(Adapters.c(SecondaryCta.f20936a, true)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFieldsImpl_ResponseAdapter$Filter;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFields$Filter;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Filter implements Adapter<RewardsOfferFeedFields.Filter> {

        /* renamed from: a, reason: collision with root package name */
        public static final Filter f20927a = new Filter();
        public static final List b = CollectionsKt.R("id", AnnotatedPrivateKey.LABEL, "offerIds", "message", "analytics", "sectionConfigsFeed");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            RewardsOfferFeedFields.Message1 message1 = null;
            RewardsOfferFeedFields.Analytics analytics = null;
            List list = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    arrayListFromJson = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    message1 = (RewardsOfferFeedFields.Message1) Adapters.b(Adapters.c(Message1.f20930a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    analytics = (RewardsOfferFeedFields.Analytics) Adapters.b(Adapters.c(Analytics.f20925a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    list = (List) Adapters.b(Adapters.a(Adapters.c(SectionConfigsFeed.f20938a, true))).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (arrayListFromJson != null) {
                return new RewardsOfferFeedFields.Filter(str, str2, arrayListFromJson, message1, analytics, list);
            }
            Assertions.a(reader, "offerIds");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsOfferFeedFields.Filter value = (RewardsOfferFeedFields.Filter) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20913a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("offerIds");
            Adapters.a(adapters$StringAdapter$1).toJson(writer, customScalarAdapters, value.c);
            writer.F1("message");
            Adapters.b(Adapters.c(Message1.f20930a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics.f20925a, false)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("sectionConfigsFeed");
            Adapters.b(Adapters.a(Adapters.c(SectionConfigsFeed.f20938a, true))).toJson(writer, customScalarAdapters, value.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFieldsImpl_ResponseAdapter$Header;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFields$Header;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Header implements Adapter<RewardsOfferFeedFields.Header> {

        /* renamed from: a, reason: collision with root package name */
        public static final Header f20928a = new Header();
        public static final List b = CollectionsKt.R("title", ErrorBundle.SUMMARY_ENTRY);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            RewardsOfferFeedFields.Summary summary = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    summary = (RewardsOfferFeedFields.Summary) Adapters.b(Adapters.c(Summary.f20939a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new RewardsOfferFeedFields.Header(str, summary);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsOfferFeedFields.Header value = (RewardsOfferFeedFields.Header) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20914a);
            writer.F1(ErrorBundle.SUMMARY_ENTRY);
            Adapters.b(Adapters.c(Summary.f20939a, true)).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFieldsImpl_ResponseAdapter$Message;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFields$Message;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Message implements Adapter<RewardsOfferFeedFields.Message> {

        /* renamed from: a, reason: collision with root package name */
        public static final Message f20929a = new Message();
        public static final List b = CollectionsKt.R(BarcodePickDeserializer.FIELD_ICON, "title", "message");

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
                Assertions.a(reader, BarcodePickDeserializer.FIELD_ICON);
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 != null) {
                return new RewardsOfferFeedFields.Message(str, str2, str3);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsOfferFeedFields.Message value = (RewardsOfferFeedFields.Message) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(BarcodePickDeserializer.FIELD_ICON);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20915a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFieldsImpl_ResponseAdapter$Message1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFields$Message1;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Message1 implements Adapter<RewardsOfferFeedFields.Message1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Message1 f20930a = new Message1();
        public static final List b = CollectionsKt.R(BarcodePickDeserializer.FIELD_ICON, "title", "message");

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
                Assertions.a(reader, BarcodePickDeserializer.FIELD_ICON);
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 != null) {
                return new RewardsOfferFeedFields.Message1(str, str2, str3);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsOfferFeedFields.Message1 value = (RewardsOfferFeedFields.Message1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(BarcodePickDeserializer.FIELD_ICON);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20916a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFieldsImpl_ResponseAdapter$OnBannerSectionConfig;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFields$OnBannerSectionConfig;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnBannerSectionConfig implements Adapter<RewardsOfferFeedFields.OnBannerSectionConfig> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20931a = CollectionsKt.R("sectionId", "showBanner");

        public static RewardsOfferFeedFields.OnBannerSectionConfig a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(f20931a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "sectionId");
                throw null;
            }
            if (bool != null) {
                return new RewardsOfferFeedFields.OnBannerSectionConfig(str, bool.booleanValue());
            }
            Assertions.a(reader, "showBanner");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, RewardsOfferFeedFields.OnBannerSectionConfig value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("sectionId");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20917a);
            writer.F1("showBanner");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.b));
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (RewardsOfferFeedFields.OnBannerSectionConfig) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFieldsImpl_ResponseAdapter$OnOffersSectionConfig;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFields$OnOffersSectionConfig;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnOffersSectionConfig implements Adapter<RewardsOfferFeedFields.OnOffersSectionConfig> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20932a = CollectionsKt.R("sectionId", "showSectionTitle");

        public static RewardsOfferFeedFields.OnOffersSectionConfig a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(f20932a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "sectionId");
                throw null;
            }
            if (bool != null) {
                return new RewardsOfferFeedFields.OnOffersSectionConfig(str, bool.booleanValue());
            }
            Assertions.a(reader, "showSectionTitle");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, RewardsOfferFeedFields.OnOffersSectionConfig value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("sectionId");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20918a);
            writer.F1("showSectionTitle");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.b));
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (RewardsOfferFeedFields.OnOffersSectionConfig) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFieldsImpl_ResponseAdapter$OnRewardsSummaryText;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFields$OnRewardsSummaryText;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRewardsSummaryText implements Adapter<RewardsOfferFeedFields.OnRewardsSummaryText> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20933a = CollectionsKt.Q(TextBundle.TEXT_ENTRY);

        public static RewardsOfferFeedFields.OnRewardsSummaryText a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f20933a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new RewardsOfferFeedFields.OnRewardsSummaryText(str);
            }
            Assertions.a(reader, TextBundle.TEXT_ENTRY);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, RewardsOfferFeedFields.OnRewardsSummaryText value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20919a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (RewardsOfferFeedFields.OnRewardsSummaryText) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFieldsImpl_ResponseAdapter$PrimaryCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFields$PrimaryCta;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PrimaryCta implements Adapter<RewardsOfferFeedFields.PrimaryCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final PrimaryCta f20934a = new PrimaryCta();
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
            ContentCtaFields contentCtaFieldsA = ContentCtaFieldsImpl_ResponseAdapter.ContentCtaFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new RewardsOfferFeedFields.PrimaryCta(str, contentCtaFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsOfferFeedFields.PrimaryCta value = (RewardsOfferFeedFields.PrimaryCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20920a);
            List list = ContentCtaFieldsImpl_ResponseAdapter.ContentCtaFields.f20976a;
            ContentCtaFieldsImpl_ResponseAdapter.ContentCtaFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFieldsImpl_ResponseAdapter$RewardsOfferFeedFields;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFields;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsOfferFeedFields implements Adapter<com.woolworths.rewards.offers.fragment.RewardsOfferFeedFields> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20935a = CollectionsKt.R("header", "errorMessage", "message", "filters", "sections", "onLoadDeepLinkUrl", "eligibleForOnboardingBanner", "isAutoBoostEnabled");

        public static com.woolworths.rewards.offers.fragment.RewardsOfferFeedFields a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            RewardsOfferFeedFields.Header header = null;
            RewardsOfferFeedFields.ErrorMessage errorMessage = null;
            RewardsOfferFeedFields.Message message = null;
            ArrayList arrayListFromJson = null;
            ArrayList arrayListFromJson2 = null;
            String str = null;
            Boolean bool3 = null;
            while (true) {
                switch (reader.o2(f20935a)) {
                    case 0:
                        bool = bool2;
                        header = (RewardsOfferFeedFields.Header) Adapters.b(Adapters.c(Header.f20928a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        bool = bool2;
                        errorMessage = (RewardsOfferFeedFields.ErrorMessage) Adapters.b(Adapters.c(ErrorMessage.f20926a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        bool = bool2;
                        message = (RewardsOfferFeedFields.Message) Adapters.b(Adapters.c(Message.f20929a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool = bool2;
                        arrayListFromJson = Adapters.a(Adapters.c(Filter.f20927a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool = bool2;
                        arrayListFromJson2 = Adapters.a(Adapters.c(Section.f20937a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        bool = bool2;
                        str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = bool2;
                        bool3 = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    default:
                        Boolean bool4 = bool2;
                        if (arrayListFromJson == null) {
                            Assertions.a(reader, "filters");
                            throw null;
                        }
                        if (arrayListFromJson2 == null) {
                            Assertions.a(reader, "sections");
                            throw null;
                        }
                        if (bool4 != null) {
                            return new com.woolworths.rewards.offers.fragment.RewardsOfferFeedFields(header, errorMessage, message, arrayListFromJson, arrayListFromJson2, str, bool3, bool4.booleanValue());
                        }
                        Assertions.a(reader, "isAutoBoostEnabled");
                        throw null;
                }
                bool2 = bool;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, com.woolworths.rewards.offers.fragment.RewardsOfferFeedFields value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("header");
            Adapters.b(Adapters.c(Header.f20928a, false)).toJson(writer, customScalarAdapters, value.f20910a);
            writer.F1("errorMessage");
            Adapters.b(Adapters.c(ErrorMessage.f20926a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("message");
            Adapters.b(Adapters.c(Message.f20929a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("filters");
            Adapters.a(Adapters.c(Filter.f20927a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("sections");
            Adapters.a(Adapters.c(Section.f20937a, true)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("onLoadDeepLinkUrl");
            Adapters.i.toJson(writer, customScalarAdapters, value.f);
            writer.F1("eligibleForOnboardingBanner");
            Adapters.l.toJson(writer, customScalarAdapters, value.g);
            writer.F1("isAutoBoostEnabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.h));
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (com.woolworths.rewards.offers.fragment.RewardsOfferFeedFields) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFieldsImpl_ResponseAdapter$SecondaryCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFields$SecondaryCta;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SecondaryCta implements Adapter<RewardsOfferFeedFields.SecondaryCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final SecondaryCta f20936a = new SecondaryCta();
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
            ContentCtaFields contentCtaFieldsA = ContentCtaFieldsImpl_ResponseAdapter.ContentCtaFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new RewardsOfferFeedFields.SecondaryCta(str, contentCtaFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsOfferFeedFields.SecondaryCta value = (RewardsOfferFeedFields.SecondaryCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20921a);
            List list = ContentCtaFieldsImpl_ResponseAdapter.ContentCtaFields.f20976a;
            ContentCtaFieldsImpl_ResponseAdapter.ContentCtaFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFieldsImpl_ResponseAdapter$Section;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFields$Section;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Section implements Adapter<RewardsOfferFeedFields.Section> {

        /* renamed from: a, reason: collision with root package name */
        public static final Section f20937a = new Section();
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
            OffersSectionsFragment offersSectionsFragmentA = OffersSectionsFragmentImpl_ResponseAdapter.OffersSectionsFragment.a(reader, customScalarAdapters);
            if (str != null) {
                return new RewardsOfferFeedFields.Section(str, offersSectionsFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsOfferFeedFields.Section value = (RewardsOfferFeedFields.Section) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20922a);
            List list = OffersSectionsFragmentImpl_ResponseAdapter.OffersSectionsFragment.f21022a;
            OffersSectionsFragmentImpl_ResponseAdapter.OffersSectionsFragment.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFieldsImpl_ResponseAdapter$SectionConfigsFeed;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFields$SectionConfigsFeed;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SectionConfigsFeed implements Adapter<RewardsOfferFeedFields.SectionConfigsFeed> {

        /* renamed from: a, reason: collision with root package name */
        public static final SectionConfigsFeed f20938a = new SectionConfigsFeed();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            RewardsOfferFeedFields.OnOffersSectionConfig onOffersSectionConfigA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            RewardsOfferFeedFields.OnBannerSectionConfig onBannerSectionConfigA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("OffersSectionConfig"))) {
                reader.o();
                onOffersSectionConfigA = OnOffersSectionConfig.a(reader, customScalarAdapters);
            } else {
                onOffersSectionConfigA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("BannerSectionConfig"))) {
                reader.o();
                onBannerSectionConfigA = OnBannerSectionConfig.a(reader, customScalarAdapters);
            }
            return new RewardsOfferFeedFields.SectionConfigsFeed(str, onOffersSectionConfigA, onBannerSectionConfigA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsOfferFeedFields.SectionConfigsFeed value = (RewardsOfferFeedFields.SectionConfigsFeed) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20923a);
            RewardsOfferFeedFields.OnOffersSectionConfig onOffersSectionConfig = value.b;
            if (onOffersSectionConfig != null) {
                OnOffersSectionConfig.b(writer, customScalarAdapters, onOffersSectionConfig);
            }
            RewardsOfferFeedFields.OnBannerSectionConfig onBannerSectionConfig = value.c;
            if (onBannerSectionConfig != null) {
                OnBannerSectionConfig.b(writer, customScalarAdapters, onBannerSectionConfig);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFieldsImpl_ResponseAdapter$Summary;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFields$Summary;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Summary implements Adapter<RewardsOfferFeedFields.Summary> {

        /* renamed from: a, reason: collision with root package name */
        public static final Summary f20939a = new Summary();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            RewardsOfferFeedFields.OnRewardsSummaryText onRewardsSummaryTextA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ContentCtaFields contentCtaFieldsA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RewardsSummaryText"))) {
                reader.o();
                onRewardsSummaryTextA = OnRewardsSummaryText.a(reader, customScalarAdapters);
            } else {
                onRewardsSummaryTextA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ContentCta"))) {
                reader.o();
                contentCtaFieldsA = ContentCtaFieldsImpl_ResponseAdapter.ContentCtaFields.a(reader, customScalarAdapters);
            }
            return new RewardsOfferFeedFields.Summary(str, onRewardsSummaryTextA, contentCtaFieldsA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsOfferFeedFields.Summary value = (RewardsOfferFeedFields.Summary) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20924a);
            RewardsOfferFeedFields.OnRewardsSummaryText onRewardsSummaryText = value.b;
            if (onRewardsSummaryText != null) {
                OnRewardsSummaryText.b(writer, customScalarAdapters, onRewardsSummaryText);
            }
            ContentCtaFields contentCtaFields = value.c;
            if (contentCtaFields != null) {
                ContentCtaFieldsImpl_ResponseAdapter.ContentCtaFields.b(writer, customScalarAdapters, contentCtaFields);
            }
        }
    }
}
