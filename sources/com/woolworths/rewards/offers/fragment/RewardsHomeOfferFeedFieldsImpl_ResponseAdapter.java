package com.woolworths.rewards.offers.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.woolworths.rewards.offers.fragment.RewardsHomeOfferFeedFields;
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

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsHomeOfferFeedFieldsImpl_ResponseAdapter;", "", "RewardsHomeOfferFeedFields", "Header", "Summary", "OnRewardsSummaryText", "ErrorMessage", "PrimaryCta", "SecondaryCta", "Section", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RewardsHomeOfferFeedFieldsImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsHomeOfferFeedFieldsImpl_ResponseAdapter$ErrorMessage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsHomeOfferFeedFields$ErrorMessage;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ErrorMessage implements Adapter<RewardsHomeOfferFeedFields.ErrorMessage> {

        /* renamed from: a, reason: collision with root package name */
        public static final ErrorMessage f20902a = new ErrorMessage();
        public static final List b = CollectionsKt.R("title", lqlqqlq.mmm006Dm006Dm, "primaryCta", "secondaryCta");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            RewardsHomeOfferFeedFields.PrimaryCta primaryCta = null;
            RewardsHomeOfferFeedFields.SecondaryCta secondaryCta = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    primaryCta = (RewardsHomeOfferFeedFields.PrimaryCta) Adapters.b(Adapters.c(PrimaryCta.f20905a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    secondaryCta = (RewardsHomeOfferFeedFields.SecondaryCta) Adapters.b(Adapters.c(SecondaryCta.f20907a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new RewardsHomeOfferFeedFields.ErrorMessage(str, str2, primaryCta, secondaryCta);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsHomeOfferFeedFields.ErrorMessage value = (RewardsHomeOfferFeedFields.ErrorMessage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20895a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("primaryCta");
            Adapters.b(Adapters.c(PrimaryCta.f20905a, true)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("secondaryCta");
            Adapters.b(Adapters.c(SecondaryCta.f20907a, true)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsHomeOfferFeedFieldsImpl_ResponseAdapter$Header;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsHomeOfferFeedFields$Header;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Header implements Adapter<RewardsHomeOfferFeedFields.Header> {

        /* renamed from: a, reason: collision with root package name */
        public static final Header f20903a = new Header();
        public static final List b = CollectionsKt.R("title", ErrorBundle.SUMMARY_ENTRY);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            RewardsHomeOfferFeedFields.Summary summary = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    summary = (RewardsHomeOfferFeedFields.Summary) Adapters.b(Adapters.c(Summary.f20909a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new RewardsHomeOfferFeedFields.Header(str, summary);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsHomeOfferFeedFields.Header value = (RewardsHomeOfferFeedFields.Header) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20896a);
            writer.F1(ErrorBundle.SUMMARY_ENTRY);
            Adapters.b(Adapters.c(Summary.f20909a, true)).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsHomeOfferFeedFieldsImpl_ResponseAdapter$OnRewardsSummaryText;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsHomeOfferFeedFields$OnRewardsSummaryText;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRewardsSummaryText implements Adapter<RewardsHomeOfferFeedFields.OnRewardsSummaryText> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20904a = CollectionsKt.Q(TextBundle.TEXT_ENTRY);

        public static RewardsHomeOfferFeedFields.OnRewardsSummaryText a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f20904a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new RewardsHomeOfferFeedFields.OnRewardsSummaryText(str);
            }
            Assertions.a(reader, TextBundle.TEXT_ENTRY);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, RewardsHomeOfferFeedFields.OnRewardsSummaryText value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20897a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (RewardsHomeOfferFeedFields.OnRewardsSummaryText) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsHomeOfferFeedFieldsImpl_ResponseAdapter$PrimaryCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsHomeOfferFeedFields$PrimaryCta;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PrimaryCta implements Adapter<RewardsHomeOfferFeedFields.PrimaryCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final PrimaryCta f20905a = new PrimaryCta();
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
                return new RewardsHomeOfferFeedFields.PrimaryCta(str, contentCtaFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsHomeOfferFeedFields.PrimaryCta value = (RewardsHomeOfferFeedFields.PrimaryCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20898a);
            List list = ContentCtaFieldsImpl_ResponseAdapter.ContentCtaFields.f20976a;
            ContentCtaFieldsImpl_ResponseAdapter.ContentCtaFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsHomeOfferFeedFieldsImpl_ResponseAdapter$RewardsHomeOfferFeedFields;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsHomeOfferFeedFields;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsHomeOfferFeedFields implements Adapter<com.woolworths.rewards.offers.fragment.RewardsHomeOfferFeedFields> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20906a = CollectionsKt.R("header", "errorMessage", "sections", "onLoadDeepLinkUrl", "eligibleForOnboardingBanner", "isAutoBoostEnabled");

        public static com.woolworths.rewards.offers.fragment.RewardsHomeOfferFeedFields a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            RewardsHomeOfferFeedFields.Header header = null;
            RewardsHomeOfferFeedFields.ErrorMessage errorMessage = null;
            ArrayList arrayListFromJson = null;
            String str = null;
            Boolean bool3 = null;
            while (true) {
                int iO2 = reader.o2(f20906a);
                if (iO2 == 0) {
                    bool = bool2;
                    header = (RewardsHomeOfferFeedFields.Header) Adapters.b(Adapters.c(Header.f20903a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = bool2;
                    errorMessage = (RewardsHomeOfferFeedFields.ErrorMessage) Adapters.b(Adapters.c(ErrorMessage.f20902a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool = bool2;
                    arrayListFromJson = Adapters.a(Adapters.c(Section.f20908a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    bool = bool2;
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    bool = bool2;
                    bool3 = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
                bool2 = bool;
            }
            Boolean bool4 = bool2;
            if (arrayListFromJson == null) {
                Assertions.a(reader, "sections");
                throw null;
            }
            if (bool4 != null) {
                return new com.woolworths.rewards.offers.fragment.RewardsHomeOfferFeedFields(header, errorMessage, arrayListFromJson, str, bool3, bool4.booleanValue());
            }
            Assertions.a(reader, "isAutoBoostEnabled");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, com.woolworths.rewards.offers.fragment.RewardsHomeOfferFeedFields value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("header");
            Adapters.b(Adapters.c(Header.f20903a, false)).toJson(writer, customScalarAdapters, value.f20894a);
            writer.F1("errorMessage");
            Adapters.b(Adapters.c(ErrorMessage.f20902a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("sections");
            Adapters.a(Adapters.c(Section.f20908a, true)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("onLoadDeepLinkUrl");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
            writer.F1("eligibleForOnboardingBanner");
            Adapters.l.toJson(writer, customScalarAdapters, value.e);
            writer.F1("isAutoBoostEnabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.f));
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (com.woolworths.rewards.offers.fragment.RewardsHomeOfferFeedFields) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsHomeOfferFeedFieldsImpl_ResponseAdapter$SecondaryCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsHomeOfferFeedFields$SecondaryCta;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SecondaryCta implements Adapter<RewardsHomeOfferFeedFields.SecondaryCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final SecondaryCta f20907a = new SecondaryCta();
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
                return new RewardsHomeOfferFeedFields.SecondaryCta(str, contentCtaFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsHomeOfferFeedFields.SecondaryCta value = (RewardsHomeOfferFeedFields.SecondaryCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20899a);
            List list = ContentCtaFieldsImpl_ResponseAdapter.ContentCtaFields.f20976a;
            ContentCtaFieldsImpl_ResponseAdapter.ContentCtaFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsHomeOfferFeedFieldsImpl_ResponseAdapter$Section;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsHomeOfferFeedFields$Section;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Section implements Adapter<RewardsHomeOfferFeedFields.Section> {

        /* renamed from: a, reason: collision with root package name */
        public static final Section f20908a = new Section();
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
                return new RewardsHomeOfferFeedFields.Section(str, offersSectionsFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsHomeOfferFeedFields.Section value = (RewardsHomeOfferFeedFields.Section) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20900a);
            List list = OffersSectionsFragmentImpl_ResponseAdapter.OffersSectionsFragment.f21022a;
            OffersSectionsFragmentImpl_ResponseAdapter.OffersSectionsFragment.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsHomeOfferFeedFieldsImpl_ResponseAdapter$Summary;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/RewardsHomeOfferFeedFields$Summary;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Summary implements Adapter<RewardsHomeOfferFeedFields.Summary> {

        /* renamed from: a, reason: collision with root package name */
        public static final Summary f20909a = new Summary();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            RewardsHomeOfferFeedFields.OnRewardsSummaryText onRewardsSummaryTextA;
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
            return new RewardsHomeOfferFeedFields.Summary(str, onRewardsSummaryTextA, contentCtaFieldsA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsHomeOfferFeedFields.Summary value = (RewardsHomeOfferFeedFields.Summary) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20901a);
            RewardsHomeOfferFeedFields.OnRewardsSummaryText onRewardsSummaryText = value.b;
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
