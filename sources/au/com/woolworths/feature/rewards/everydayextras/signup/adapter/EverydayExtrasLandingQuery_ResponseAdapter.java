package au.com.woolworths.feature.rewards.everydayextras.signup.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasLandingQuery;
import au.com.woolworths.rewards.graphql.type.DividerType;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetFit;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetType;
import au.com.woolworths.rewards.graphql.type.EverydayExtraButtonStyle;
import au.com.woolworths.rewards.graphql.type.adapter.DividerType_ResponseAdapter;
import au.com.woolworths.rewards.graphql.type.adapter.DownloadableAssetFit_ResponseAdapter;
import au.com.woolworths.rewards.graphql.type.adapter.DownloadableAssetType_ResponseAdapter;
import au.com.woolworths.rewards.graphql.type.adapter.EverydayExtraButtonStyle_ResponseAdapter;
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
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b'\bÇ\u0002\u0018\u00002\u00020\u0001:&\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006("}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter;", "", "Data", "EverydayExtraLanding", "Header", "Tab", "OnEverydayExtraKeyBenefitsTab", "Section", "OnEverydayExtraKeyBenefitsSection", "KeyBenefitsItem", "OnTitleTextItem", "OnMediumIconListItem", "OnEverydayExtraComparisonSection", "ComparisonItem", "OnTitleTextItem1", "OnEverydayExtraBenefitsCompare", "ColumnHeadings", "LabelColumn", "RewardsColumn", "ExtraColumn", "Row", "LabelValue", "RewardsValue", "ExtraValue", "OnEverydayExtraFaqsTab", "Section1", "OnEverydayExtraFaqsSection", "FaqItem", "OnTitleTextItem2", "OnSubheadTextItem", "OnDivider", "OnFaqItem", "OnNoteTextItem", "TermsAndConditions", "Footer", "FooterItem", "AlertDialog", "Analytics", "PrimaryCta", "SecondaryCta", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EverydayExtrasLandingQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$AlertDialog;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$AlertDialog;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AlertDialog implements Adapter<EverydayExtrasLandingQuery.AlertDialog> {

        /* renamed from: a, reason: collision with root package name */
        public static final AlertDialog f6006a = new AlertDialog();
        public static final List b = CollectionsKt.R("title", "message", "analytics", "primaryCta", "secondaryCta");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            EverydayExtrasLandingQuery.Analytics analytics = null;
            EverydayExtrasLandingQuery.PrimaryCta primaryCta = null;
            EverydayExtrasLandingQuery.SecondaryCta secondaryCta = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    analytics = (EverydayExtrasLandingQuery.Analytics) Adapters.b(Adapters.c(Analytics.f6007a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    primaryCta = (EverydayExtrasLandingQuery.PrimaryCta) Adapters.c(PrimaryCta.f6035a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    secondaryCta = (EverydayExtrasLandingQuery.SecondaryCta) Adapters.b(Adapters.c(SecondaryCta.f6039a, false)).fromJson(reader, customScalarAdapters);
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
            if (primaryCta != null) {
                return new EverydayExtrasLandingQuery.AlertDialog(str, str2, analytics, primaryCta, secondaryCta);
            }
            Assertions.a(reader, "primaryCta");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasLandingQuery.AlertDialog value = (EverydayExtrasLandingQuery.AlertDialog) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5889a);
            writer.F1("message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics.f6007a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("primaryCta");
            Adapters.c(PrimaryCta.f6035a, false).toJson(writer, customScalarAdapters, value.d);
            writer.F1("secondaryCta");
            Adapters.b(Adapters.c(SecondaryCta.f6039a, false)).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$Analytics;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<EverydayExtrasLandingQuery.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f6007a = new Analytics();
        public static final List b = CollectionsKt.R("eventCategory", "eventDescription");

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
                Assertions.a(reader, "eventCategory");
                throw null;
            }
            if (str2 != null) {
                return new EverydayExtrasLandingQuery.Analytics(str, str2);
            }
            Assertions.a(reader, "eventDescription");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasLandingQuery.Analytics value = (EverydayExtrasLandingQuery.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("eventCategory");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5890a);
            writer.F1("eventDescription");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$ColumnHeadings;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$ColumnHeadings;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ColumnHeadings implements Adapter<EverydayExtrasLandingQuery.ColumnHeadings> {

        /* renamed from: a, reason: collision with root package name */
        public static final ColumnHeadings f6008a = new ColumnHeadings();
        public static final List b = CollectionsKt.R("labelColumn", "rewardsColumn", "extraColumn");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            EverydayExtrasLandingQuery.LabelColumn labelColumn = null;
            EverydayExtrasLandingQuery.RewardsColumn rewardsColumn = null;
            EverydayExtrasLandingQuery.ExtraColumn extraColumn = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    labelColumn = (EverydayExtrasLandingQuery.LabelColumn) Adapters.c(LabelColumn.f6019a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    rewardsColumn = (EverydayExtrasLandingQuery.RewardsColumn) Adapters.c(RewardsColumn.f6036a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    extraColumn = (EverydayExtrasLandingQuery.ExtraColumn) Adapters.c(ExtraColumn.f6012a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (labelColumn == null) {
                Assertions.a(reader, "labelColumn");
                throw null;
            }
            if (rewardsColumn == null) {
                Assertions.a(reader, "rewardsColumn");
                throw null;
            }
            if (extraColumn != null) {
                return new EverydayExtrasLandingQuery.ColumnHeadings(labelColumn, rewardsColumn, extraColumn);
            }
            Assertions.a(reader, "extraColumn");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasLandingQuery.ColumnHeadings value = (EverydayExtrasLandingQuery.ColumnHeadings) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("labelColumn");
            Adapters.c(LabelColumn.f6019a, false).toJson(writer, customScalarAdapters, value.f5891a);
            writer.F1("rewardsColumn");
            Adapters.c(RewardsColumn.f6036a, false).toJson(writer, customScalarAdapters, value.b);
            writer.F1("extraColumn");
            Adapters.c(ExtraColumn.f6012a, false).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$ComparisonItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$ComparisonItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ComparisonItem implements Adapter<EverydayExtrasLandingQuery.ComparisonItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final ComparisonItem f6009a = new ComparisonItem();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            EverydayExtrasLandingQuery.OnTitleTextItem1 onTitleTextItem1A;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            EverydayExtrasLandingQuery.OnEverydayExtraBenefitsCompare onEverydayExtraBenefitsCompareA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("TitleTextItem"))) {
                reader.o();
                onTitleTextItem1A = OnTitleTextItem1.a(reader, customScalarAdapters);
            } else {
                onTitleTextItem1A = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("EverydayExtraBenefitsCompare"))) {
                reader.o();
                onEverydayExtraBenefitsCompareA = OnEverydayExtraBenefitsCompare.a(reader, customScalarAdapters);
            }
            return new EverydayExtrasLandingQuery.ComparisonItem(str, onTitleTextItem1A, onEverydayExtraBenefitsCompareA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasLandingQuery.ComparisonItem value = (EverydayExtrasLandingQuery.ComparisonItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5892a);
            EverydayExtrasLandingQuery.OnTitleTextItem1 onTitleTextItem1 = value.b;
            if (onTitleTextItem1 != null) {
                OnTitleTextItem1.b(writer, customScalarAdapters, onTitleTextItem1);
            }
            EverydayExtrasLandingQuery.OnEverydayExtraBenefitsCompare onEverydayExtraBenefitsCompare = value.c;
            if (onEverydayExtraBenefitsCompare != null) {
                OnEverydayExtraBenefitsCompare.b(writer, customScalarAdapters, onEverydayExtraBenefitsCompare);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$Data;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<EverydayExtrasLandingQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f6010a = new Data();
        public static final List b = CollectionsKt.Q("everydayExtraLanding");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            EverydayExtrasLandingQuery.EverydayExtraLanding everydayExtraLanding = null;
            while (reader.o2(b) == 0) {
                everydayExtraLanding = (EverydayExtrasLandingQuery.EverydayExtraLanding) Adapters.b(Adapters.c(EverydayExtraLanding.f6011a, false)).fromJson(reader, customScalarAdapters);
            }
            return new EverydayExtrasLandingQuery.Data(everydayExtraLanding);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasLandingQuery.Data value = (EverydayExtrasLandingQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("everydayExtraLanding");
            Adapters.b(Adapters.c(EverydayExtraLanding.f6011a, false)).toJson(writer, customScalarAdapters, value.f5893a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$EverydayExtraLanding;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$EverydayExtraLanding;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EverydayExtraLanding implements Adapter<EverydayExtrasLandingQuery.EverydayExtraLanding> {

        /* renamed from: a, reason: collision with root package name */
        public static final EverydayExtraLanding f6011a = new EverydayExtraLanding();
        public static final List b = CollectionsKt.R("__typename", "navigationTitle", "header", "tabs", "termsAndConditions", "footer", "alertDialog");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            EverydayExtrasLandingQuery.Header header = null;
            ArrayList arrayListFromJson = null;
            EverydayExtrasLandingQuery.TermsAndConditions termsAndConditions = null;
            EverydayExtrasLandingQuery.Footer footer = null;
            EverydayExtrasLandingQuery.AlertDialog alertDialog = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        header = (EverydayExtrasLandingQuery.Header) Adapters.c(Header.f6017a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        arrayListFromJson = Adapters.a(Adapters.c(Tab.f6042a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        termsAndConditions = (EverydayExtrasLandingQuery.TermsAndConditions) Adapters.b(Adapters.c(TermsAndConditions.f6043a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        footer = (EverydayExtrasLandingQuery.Footer) Adapters.b(Adapters.c(Footer.f6015a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        alertDialog = (EverydayExtrasLandingQuery.AlertDialog) Adapters.b(Adapters.c(AlertDialog.f6006a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "__typename");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "navigationTitle");
                            throw null;
                        }
                        if (header == null) {
                            Assertions.a(reader, "header");
                            throw null;
                        }
                        if (arrayListFromJson != null) {
                            return new EverydayExtrasLandingQuery.EverydayExtraLanding(str, str2, header, arrayListFromJson, termsAndConditions, footer, alertDialog);
                        }
                        Assertions.a(reader, "tabs");
                        throw null;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasLandingQuery.EverydayExtraLanding value = (EverydayExtrasLandingQuery.EverydayExtraLanding) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5894a);
            writer.F1("navigationTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("header");
            Adapters.c(Header.f6017a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("tabs");
            Adapters.a(Adapters.c(Tab.f6042a, true)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("termsAndConditions");
            Adapters.b(Adapters.c(TermsAndConditions.f6043a, false)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("footer");
            Adapters.b(Adapters.c(Footer.f6015a, false)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("alertDialog");
            Adapters.b(Adapters.c(AlertDialog.f6006a, false)).toJson(writer, customScalarAdapters, value.g);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$ExtraColumn;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$ExtraColumn;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ExtraColumn implements Adapter<EverydayExtrasLandingQuery.ExtraColumn> {

        /* renamed from: a, reason: collision with root package name */
        public static final ExtraColumn f6012a = new ExtraColumn();
        public static final List b = CollectionsKt.R("iconName", AnnotatedPrivateKey.LABEL);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new EverydayExtrasLandingQuery.ExtraColumn(str, str2);
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasLandingQuery.ExtraColumn value = (EverydayExtrasLandingQuery.ExtraColumn) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("iconName");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f5895a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$ExtraValue;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$ExtraValue;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ExtraValue implements Adapter<EverydayExtrasLandingQuery.ExtraValue> {

        /* renamed from: a, reason: collision with root package name */
        public static final ExtraValue f6013a = new ExtraValue();
        public static final List b = CollectionsKt.R("iconName", AnnotatedPrivateKey.LABEL);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new EverydayExtrasLandingQuery.ExtraValue(str, str2);
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasLandingQuery.ExtraValue value = (EverydayExtrasLandingQuery.ExtraValue) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("iconName");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f5896a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$FaqItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$FaqItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FaqItem implements Adapter<EverydayExtrasLandingQuery.FaqItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final FaqItem f6014a = new FaqItem();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            EverydayExtrasLandingQuery.OnTitleTextItem2 onTitleTextItem2A;
            EverydayExtrasLandingQuery.OnSubheadTextItem onSubheadTextItemA;
            EverydayExtrasLandingQuery.OnDivider onDividerA;
            EverydayExtrasLandingQuery.OnFaqItem onFaqItemA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            EverydayExtrasLandingQuery.OnNoteTextItem onNoteTextItemA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("TitleTextItem"))) {
                reader.o();
                onTitleTextItem2A = OnTitleTextItem2.a(reader, customScalarAdapters);
            } else {
                onTitleTextItem2A = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("SubheadTextItem"))) {
                reader.o();
                onSubheadTextItemA = OnSubheadTextItem.a(reader, customScalarAdapters);
            } else {
                onSubheadTextItemA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("Divider"))) {
                reader.o();
                onDividerA = OnDivider.a(reader, customScalarAdapters);
            } else {
                onDividerA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("FaqItem"))) {
                reader.o();
                onFaqItemA = OnFaqItem.a(reader, customScalarAdapters);
            } else {
                onFaqItemA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("NoteTextItem"))) {
                reader.o();
                onNoteTextItemA = OnNoteTextItem.a(reader, customScalarAdapters);
            }
            return new EverydayExtrasLandingQuery.FaqItem(str, onTitleTextItem2A, onSubheadTextItemA, onDividerA, onFaqItemA, onNoteTextItemA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasLandingQuery.FaqItem value = (EverydayExtrasLandingQuery.FaqItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5897a);
            EverydayExtrasLandingQuery.OnTitleTextItem2 onTitleTextItem2 = value.b;
            if (onTitleTextItem2 != null) {
                OnTitleTextItem2.b(writer, customScalarAdapters, onTitleTextItem2);
            }
            EverydayExtrasLandingQuery.OnSubheadTextItem onSubheadTextItem = value.c;
            if (onSubheadTextItem != null) {
                OnSubheadTextItem.b(writer, customScalarAdapters, onSubheadTextItem);
            }
            EverydayExtrasLandingQuery.OnDivider onDivider = value.d;
            if (onDivider != null) {
                List list = OnDivider.f6021a;
                writer.F1("type");
                DividerType_ResponseAdapter.b(writer, customScalarAdapters, onDivider.f5904a);
            }
            EverydayExtrasLandingQuery.OnFaqItem onFaqItem = value.e;
            if (onFaqItem != null) {
                OnFaqItem.b(writer, customScalarAdapters, onFaqItem);
            }
            EverydayExtrasLandingQuery.OnNoteTextItem onNoteTextItem = value.f;
            if (onNoteTextItem != null) {
                OnNoteTextItem.b(writer, customScalarAdapters, onNoteTextItem);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$Footer;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$Footer;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Footer implements Adapter<EverydayExtrasLandingQuery.Footer> {

        /* renamed from: a, reason: collision with root package name */
        public static final Footer f6015a = new Footer();
        public static final List b = CollectionsKt.R("__typename", "id", "footerItems");

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
                    arrayListFromJson = Adapters.a(Adapters.c(FooterItem.f6016a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new EverydayExtrasLandingQuery.Footer(str, str2, arrayListFromJson);
            }
            Assertions.a(reader, "footerItems");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasLandingQuery.Footer value = (EverydayExtrasLandingQuery.Footer) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5898a);
            writer.F1("id");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("footerItems");
            Adapters.a(Adapters.c(FooterItem.f6016a, false)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$FooterItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$FooterItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FooterItem implements Adapter<EverydayExtrasLandingQuery.FooterItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final FooterItem f6016a = new FooterItem();
        public static final List b = CollectionsKt.R("__typename", AnnotatedPrivateKey.LABEL, UrlHandler.ACTION, "actionUrl", "style");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            EverydayExtraButtonStyle everydayExtraButtonStyle = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    everydayExtraButtonStyle = (EverydayExtraButtonStyle) Adapters.b(EverydayExtraButtonStyle_ResponseAdapter.f9950a).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (str3 != null) {
                return new EverydayExtrasLandingQuery.FooterItem(str, str2, str3, str4, everydayExtraButtonStyle);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasLandingQuery.FooterItem value = (EverydayExtrasLandingQuery.FooterItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5899a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("actionUrl");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
            writer.F1("style");
            Adapters.b(EverydayExtraButtonStyle_ResponseAdapter.f9950a).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$Header;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$Header;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Header implements Adapter<EverydayExtrasLandingQuery.Header> {

        /* renamed from: a, reason: collision with root package name */
        public static final Header f6017a = new Header();
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
                        downloadableAssetFit = (DownloadableAssetFit) Adapters.b(DownloadableAssetFit_ResponseAdapter.f9949a).fromJson(reader, customScalarAdapters);
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
                return new EverydayExtrasLandingQuery.Header(downloadableAssetTypeA, str, iIntValue, num5.intValue(), downloadableAssetFit, str2);
            }
            Assertions.a(reader, "assetHeight");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasLandingQuery.Header value = (EverydayExtrasLandingQuery.Header) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("assetType");
            DownloadableAssetType_ResponseAdapter.b(writer, customScalarAdapters, value.f5900a);
            writer.F1("assetUrl");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("assetWidth");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.c, adapters$IntAdapter$1, writer, customScalarAdapters, "assetHeight");
            d.y(value.d, adapters$IntAdapter$1, writer, customScalarAdapters, "fit");
            Adapters.b(DownloadableAssetFit_ResponseAdapter.f9949a).toJson(writer, customScalarAdapters, value.e);
            writer.F1("altText");
            Adapters.i.toJson(writer, customScalarAdapters, value.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$KeyBenefitsItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$KeyBenefitsItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class KeyBenefitsItem implements Adapter<EverydayExtrasLandingQuery.KeyBenefitsItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final KeyBenefitsItem f6018a = new KeyBenefitsItem();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            EverydayExtrasLandingQuery.OnTitleTextItem onTitleTextItemA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            EverydayExtrasLandingQuery.OnMediumIconListItem onMediumIconListItemA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("TitleTextItem"))) {
                reader.o();
                onTitleTextItemA = OnTitleTextItem.a(reader, customScalarAdapters);
            } else {
                onTitleTextItemA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("MediumIconListItem"))) {
                reader.o();
                onMediumIconListItemA = OnMediumIconListItem.a(reader, customScalarAdapters);
            }
            return new EverydayExtrasLandingQuery.KeyBenefitsItem(str, onTitleTextItemA, onMediumIconListItemA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasLandingQuery.KeyBenefitsItem value = (EverydayExtrasLandingQuery.KeyBenefitsItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5901a);
            EverydayExtrasLandingQuery.OnTitleTextItem onTitleTextItem = value.b;
            if (onTitleTextItem != null) {
                OnTitleTextItem.b(writer, customScalarAdapters, onTitleTextItem);
            }
            EverydayExtrasLandingQuery.OnMediumIconListItem onMediumIconListItem = value.c;
            if (onMediumIconListItem != null) {
                OnMediumIconListItem.b(writer, customScalarAdapters, onMediumIconListItem);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$LabelColumn;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$LabelColumn;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LabelColumn implements Adapter<EverydayExtrasLandingQuery.LabelColumn> {

        /* renamed from: a, reason: collision with root package name */
        public static final LabelColumn f6019a = new LabelColumn();
        public static final List b = CollectionsKt.R("iconName", AnnotatedPrivateKey.LABEL);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new EverydayExtrasLandingQuery.LabelColumn(str, str2);
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasLandingQuery.LabelColumn value = (EverydayExtrasLandingQuery.LabelColumn) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("iconName");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f5902a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$LabelValue;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$LabelValue;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LabelValue implements Adapter<EverydayExtrasLandingQuery.LabelValue> {

        /* renamed from: a, reason: collision with root package name */
        public static final LabelValue f6020a = new LabelValue();
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
                return new EverydayExtrasLandingQuery.LabelValue(str);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasLandingQuery.LabelValue value = (EverydayExtrasLandingQuery.LabelValue) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5903a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$OnDivider;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$OnDivider;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnDivider implements Adapter<EverydayExtrasLandingQuery.OnDivider> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6021a = CollectionsKt.Q("type");

        public static EverydayExtrasLandingQuery.OnDivider a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            DividerType dividerTypeA = null;
            while (reader.o2(f6021a) == 0) {
                dividerTypeA = DividerType_ResponseAdapter.a(reader, customScalarAdapters);
            }
            if (dividerTypeA != null) {
                return new EverydayExtrasLandingQuery.OnDivider(dividerTypeA);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasLandingQuery.OnDivider value = (EverydayExtrasLandingQuery.OnDivider) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            DividerType_ResponseAdapter.b(writer, customScalarAdapters, value.f5904a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$OnEverydayExtraBenefitsCompare;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$OnEverydayExtraBenefitsCompare;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnEverydayExtraBenefitsCompare implements Adapter<EverydayExtrasLandingQuery.OnEverydayExtraBenefitsCompare> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6022a = CollectionsKt.R("__typename", "columnHeadings", "rows");

        public static EverydayExtrasLandingQuery.OnEverydayExtraBenefitsCompare a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            EverydayExtrasLandingQuery.ColumnHeadings columnHeadings = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f6022a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    columnHeadings = (EverydayExtrasLandingQuery.ColumnHeadings) Adapters.c(ColumnHeadings.f6008a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Row.f6038a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (columnHeadings == null) {
                Assertions.a(reader, "columnHeadings");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new EverydayExtrasLandingQuery.OnEverydayExtraBenefitsCompare(str, columnHeadings, arrayListFromJson);
            }
            Assertions.a(reader, "rows");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EverydayExtrasLandingQuery.OnEverydayExtraBenefitsCompare value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5905a);
            writer.F1("columnHeadings");
            Adapters.c(ColumnHeadings.f6008a, false).toJson(writer, customScalarAdapters, value.b);
            writer.F1("rows");
            Adapters.a(Adapters.c(Row.f6038a, false)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EverydayExtrasLandingQuery.OnEverydayExtraBenefitsCompare) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$OnEverydayExtraComparisonSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$OnEverydayExtraComparisonSection;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnEverydayExtraComparisonSection implements Adapter<EverydayExtrasLandingQuery.OnEverydayExtraComparisonSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6023a = CollectionsKt.Q("comparisonItems");

        public static EverydayExtrasLandingQuery.OnEverydayExtraComparisonSection a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(f6023a) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(ComparisonItem.f6009a, true)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new EverydayExtrasLandingQuery.OnEverydayExtraComparisonSection(arrayListFromJson);
            }
            Assertions.a(reader, "comparisonItems");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EverydayExtrasLandingQuery.OnEverydayExtraComparisonSection value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("comparisonItems");
            Adapters.a(Adapters.c(ComparisonItem.f6009a, true)).toJson(writer, customScalarAdapters, value.f5906a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EverydayExtrasLandingQuery.OnEverydayExtraComparisonSection) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$OnEverydayExtraFaqsSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$OnEverydayExtraFaqsSection;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnEverydayExtraFaqsSection implements Adapter<EverydayExtrasLandingQuery.OnEverydayExtraFaqsSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6024a = CollectionsKt.Q("faqItems");

        public static EverydayExtrasLandingQuery.OnEverydayExtraFaqsSection a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(f6024a) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(FaqItem.f6014a, true)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new EverydayExtrasLandingQuery.OnEverydayExtraFaqsSection(arrayListFromJson);
            }
            Assertions.a(reader, "faqItems");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EverydayExtrasLandingQuery.OnEverydayExtraFaqsSection value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("faqItems");
            Adapters.a(Adapters.c(FaqItem.f6014a, true)).toJson(writer, customScalarAdapters, value.f5907a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EverydayExtrasLandingQuery.OnEverydayExtraFaqsSection) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$OnEverydayExtraFaqsTab;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$OnEverydayExtraFaqsTab;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnEverydayExtraFaqsTab implements Adapter<EverydayExtrasLandingQuery.OnEverydayExtraFaqsTab> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6025a = CollectionsKt.R("id", "tabName", "sections");

        public static EverydayExtrasLandingQuery.OnEverydayExtraFaqsTab a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f6025a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Section1.f6041a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "tabName");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new EverydayExtrasLandingQuery.OnEverydayExtraFaqsTab(str, str2, arrayListFromJson);
            }
            Assertions.a(reader, "sections");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EverydayExtrasLandingQuery.OnEverydayExtraFaqsTab value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5908a);
            writer.F1("tabName");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("sections");
            Adapters.a(Adapters.c(Section1.f6041a, true)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EverydayExtrasLandingQuery.OnEverydayExtraFaqsTab) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$OnEverydayExtraKeyBenefitsSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$OnEverydayExtraKeyBenefitsSection;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnEverydayExtraKeyBenefitsSection implements Adapter<EverydayExtrasLandingQuery.OnEverydayExtraKeyBenefitsSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6026a = CollectionsKt.Q("keyBenefitsItems");

        public static EverydayExtrasLandingQuery.OnEverydayExtraKeyBenefitsSection a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(f6026a) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(KeyBenefitsItem.f6018a, true)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new EverydayExtrasLandingQuery.OnEverydayExtraKeyBenefitsSection(arrayListFromJson);
            }
            Assertions.a(reader, "keyBenefitsItems");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EverydayExtrasLandingQuery.OnEverydayExtraKeyBenefitsSection value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("keyBenefitsItems");
            Adapters.a(Adapters.c(KeyBenefitsItem.f6018a, true)).toJson(writer, customScalarAdapters, value.f5909a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EverydayExtrasLandingQuery.OnEverydayExtraKeyBenefitsSection) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$OnEverydayExtraKeyBenefitsTab;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$OnEverydayExtraKeyBenefitsTab;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnEverydayExtraKeyBenefitsTab implements Adapter<EverydayExtrasLandingQuery.OnEverydayExtraKeyBenefitsTab> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6027a = CollectionsKt.R("id", "tabName", "sections");

        public static EverydayExtrasLandingQuery.OnEverydayExtraKeyBenefitsTab a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f6027a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Section.f6040a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "tabName");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new EverydayExtrasLandingQuery.OnEverydayExtraKeyBenefitsTab(str, str2, arrayListFromJson);
            }
            Assertions.a(reader, "sections");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EverydayExtrasLandingQuery.OnEverydayExtraKeyBenefitsTab value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5910a);
            writer.F1("tabName");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("sections");
            Adapters.a(Adapters.c(Section.f6040a, true)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EverydayExtrasLandingQuery.OnEverydayExtraKeyBenefitsTab) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$OnFaqItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$OnFaqItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnFaqItem implements Adapter<EverydayExtrasLandingQuery.OnFaqItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6028a = CollectionsKt.R("id", "question", "markdownAnswer");

        public static EverydayExtrasLandingQuery.OnFaqItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(f6028a);
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
                Assertions.a(reader, "id");
                throw null;
            }
            if (str2 != null) {
                return new EverydayExtrasLandingQuery.OnFaqItem(str, str2, str3);
            }
            Assertions.a(reader, "question");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EverydayExtrasLandingQuery.OnFaqItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5911a);
            writer.F1("question");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("markdownAnswer");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EverydayExtrasLandingQuery.OnFaqItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$OnMediumIconListItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$OnMediumIconListItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnMediumIconListItem implements Adapter<EverydayExtrasLandingQuery.OnMediumIconListItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6029a = CollectionsKt.R("__typename", "iconUrl", "title", lqlqqlq.mmm006Dm006Dm);

        public static EverydayExtrasLandingQuery.OnMediumIconListItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int iO2 = reader.o2(f6029a);
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
                    str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "iconUrl");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str4 != null) {
                return new EverydayExtrasLandingQuery.OnMediumIconListItem(str, str2, str3, str4);
            }
            Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EverydayExtrasLandingQuery.OnMediumIconListItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5912a);
            writer.F1("iconUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EverydayExtrasLandingQuery.OnMediumIconListItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$OnNoteTextItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$OnNoteTextItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnNoteTextItem implements Adapter<EverydayExtrasLandingQuery.OnNoteTextItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6030a = CollectionsKt.Q("content");

        public static EverydayExtrasLandingQuery.OnNoteTextItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f6030a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new EverydayExtrasLandingQuery.OnNoteTextItem(str);
            }
            Assertions.a(reader, "content");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EverydayExtrasLandingQuery.OnNoteTextItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("content");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5913a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EverydayExtrasLandingQuery.OnNoteTextItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$OnSubheadTextItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$OnSubheadTextItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnSubheadTextItem implements Adapter<EverydayExtrasLandingQuery.OnSubheadTextItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6031a = CollectionsKt.Q("content");

        public static EverydayExtrasLandingQuery.OnSubheadTextItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f6031a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new EverydayExtrasLandingQuery.OnSubheadTextItem(str);
            }
            Assertions.a(reader, "content");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EverydayExtrasLandingQuery.OnSubheadTextItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("content");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5914a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EverydayExtrasLandingQuery.OnSubheadTextItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$OnTitleTextItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$OnTitleTextItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnTitleTextItem implements Adapter<EverydayExtrasLandingQuery.OnTitleTextItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6032a = CollectionsKt.R("__typename", "content");

        public static EverydayExtrasLandingQuery.OnTitleTextItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f6032a);
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
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 != null) {
                return new EverydayExtrasLandingQuery.OnTitleTextItem(str, str2);
            }
            Assertions.a(reader, "content");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EverydayExtrasLandingQuery.OnTitleTextItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5915a);
            writer.F1("content");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EverydayExtrasLandingQuery.OnTitleTextItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$OnTitleTextItem1;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$OnTitleTextItem1;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnTitleTextItem1 implements Adapter<EverydayExtrasLandingQuery.OnTitleTextItem1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6033a = CollectionsKt.R("__typename", "content");

        public static EverydayExtrasLandingQuery.OnTitleTextItem1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f6033a);
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
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 != null) {
                return new EverydayExtrasLandingQuery.OnTitleTextItem1(str, str2);
            }
            Assertions.a(reader, "content");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EverydayExtrasLandingQuery.OnTitleTextItem1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5916a);
            writer.F1("content");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EverydayExtrasLandingQuery.OnTitleTextItem1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$OnTitleTextItem2;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$OnTitleTextItem2;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnTitleTextItem2 implements Adapter<EverydayExtrasLandingQuery.OnTitleTextItem2> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6034a = CollectionsKt.Q("content");

        public static EverydayExtrasLandingQuery.OnTitleTextItem2 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f6034a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new EverydayExtrasLandingQuery.OnTitleTextItem2(str);
            }
            Assertions.a(reader, "content");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EverydayExtrasLandingQuery.OnTitleTextItem2 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("content");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5917a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EverydayExtrasLandingQuery.OnTitleTextItem2) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$PrimaryCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$PrimaryCta;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PrimaryCta implements Adapter<EverydayExtrasLandingQuery.PrimaryCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final PrimaryCta f6035a = new PrimaryCta();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "url");

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
                return new EverydayExtrasLandingQuery.PrimaryCta(str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasLandingQuery.PrimaryCta value = (EverydayExtrasLandingQuery.PrimaryCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5918a);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$RewardsColumn;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$RewardsColumn;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsColumn implements Adapter<EverydayExtrasLandingQuery.RewardsColumn> {

        /* renamed from: a, reason: collision with root package name */
        public static final RewardsColumn f6036a = new RewardsColumn();
        public static final List b = CollectionsKt.R("iconName", AnnotatedPrivateKey.LABEL);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new EverydayExtrasLandingQuery.RewardsColumn(str, str2);
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasLandingQuery.RewardsColumn value = (EverydayExtrasLandingQuery.RewardsColumn) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("iconName");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f5919a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$RewardsValue;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$RewardsValue;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsValue implements Adapter<EverydayExtrasLandingQuery.RewardsValue> {

        /* renamed from: a, reason: collision with root package name */
        public static final RewardsValue f6037a = new RewardsValue();
        public static final List b = CollectionsKt.R("iconName", AnnotatedPrivateKey.LABEL);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new EverydayExtrasLandingQuery.RewardsValue(str, str2);
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasLandingQuery.RewardsValue value = (EverydayExtrasLandingQuery.RewardsValue) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("iconName");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f5920a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$Row;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$Row;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Row implements Adapter<EverydayExtrasLandingQuery.Row> {

        /* renamed from: a, reason: collision with root package name */
        public static final Row f6038a = new Row();
        public static final List b = CollectionsKt.R("rowId", "altBackground", "labelValue", "rewardsValue", "extraValue");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            ArrayList arrayListFromJson = null;
            List list = null;
            ArrayList arrayListFromJson2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    bool = bool2;
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool = bool2;
                    arrayListFromJson = Adapters.a(Adapters.c(LabelValue.f6020a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    bool = bool2;
                    list = (List) Adapters.b(Adapters.a(Adapters.b(Adapters.c(RewardsValue.f6037a, false)))).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    bool = bool2;
                    arrayListFromJson2 = Adapters.a(Adapters.c(ExtraValue.f6013a, false)).fromJson(reader, customScalarAdapters);
                }
                bool2 = bool;
            }
            Boolean bool3 = bool2;
            if (str == null) {
                Assertions.a(reader, "rowId");
                throw null;
            }
            if (bool3 == null) {
                Assertions.a(reader, "altBackground");
                throw null;
            }
            boolean zBooleanValue = bool3.booleanValue();
            if (arrayListFromJson == null) {
                Assertions.a(reader, "labelValue");
                throw null;
            }
            if (arrayListFromJson2 != null) {
                return new EverydayExtrasLandingQuery.Row(str, zBooleanValue, arrayListFromJson, list, arrayListFromJson2);
            }
            Assertions.a(reader, "extraValue");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasLandingQuery.Row value = (EverydayExtrasLandingQuery.Row) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("rowId");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5921a);
            writer.F1("altBackground");
            d.B(value.b, Adapters.f, writer, customScalarAdapters, "labelValue");
            Adapters.a(Adapters.c(LabelValue.f6020a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("rewardsValue");
            Adapters.b(Adapters.a(Adapters.b(Adapters.c(RewardsValue.f6037a, false)))).toJson(writer, customScalarAdapters, value.d);
            writer.F1("extraValue");
            Adapters.a(Adapters.c(ExtraValue.f6013a, false)).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$SecondaryCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$SecondaryCta;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SecondaryCta implements Adapter<EverydayExtrasLandingQuery.SecondaryCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final SecondaryCta f6039a = new SecondaryCta();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "url");

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
                return new EverydayExtrasLandingQuery.SecondaryCta(str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasLandingQuery.SecondaryCta value = (EverydayExtrasLandingQuery.SecondaryCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5922a);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$Section;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$Section;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Section implements Adapter<EverydayExtrasLandingQuery.Section> {

        /* renamed from: a, reason: collision with root package name */
        public static final Section f6040a = new Section();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            EverydayExtrasLandingQuery.OnEverydayExtraKeyBenefitsSection onEverydayExtraKeyBenefitsSectionA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            EverydayExtrasLandingQuery.OnEverydayExtraComparisonSection onEverydayExtraComparisonSectionA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("EverydayExtraKeyBenefitsSection"))) {
                reader.o();
                onEverydayExtraKeyBenefitsSectionA = OnEverydayExtraKeyBenefitsSection.a(reader, customScalarAdapters);
            } else {
                onEverydayExtraKeyBenefitsSectionA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("EverydayExtraComparisonSection"))) {
                reader.o();
                onEverydayExtraComparisonSectionA = OnEverydayExtraComparisonSection.a(reader, customScalarAdapters);
            }
            return new EverydayExtrasLandingQuery.Section(str, onEverydayExtraKeyBenefitsSectionA, onEverydayExtraComparisonSectionA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasLandingQuery.Section value = (EverydayExtrasLandingQuery.Section) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5923a);
            EverydayExtrasLandingQuery.OnEverydayExtraKeyBenefitsSection onEverydayExtraKeyBenefitsSection = value.b;
            if (onEverydayExtraKeyBenefitsSection != null) {
                OnEverydayExtraKeyBenefitsSection.b(writer, customScalarAdapters, onEverydayExtraKeyBenefitsSection);
            }
            EverydayExtrasLandingQuery.OnEverydayExtraComparisonSection onEverydayExtraComparisonSection = value.c;
            if (onEverydayExtraComparisonSection != null) {
                OnEverydayExtraComparisonSection.b(writer, customScalarAdapters, onEverydayExtraComparisonSection);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$Section1;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$Section1;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Section1 implements Adapter<EverydayExtrasLandingQuery.Section1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Section1 f6041a = new Section1();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            EverydayExtrasLandingQuery.OnEverydayExtraFaqsSection onEverydayExtraFaqsSectionA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("EverydayExtraFaqsSection"))) {
                reader.o();
                onEverydayExtraFaqsSectionA = OnEverydayExtraFaqsSection.a(reader, customScalarAdapters);
            }
            return new EverydayExtrasLandingQuery.Section1(str, onEverydayExtraFaqsSectionA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasLandingQuery.Section1 value = (EverydayExtrasLandingQuery.Section1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5924a);
            EverydayExtrasLandingQuery.OnEverydayExtraFaqsSection onEverydayExtraFaqsSection = value.b;
            if (onEverydayExtraFaqsSection != null) {
                OnEverydayExtraFaqsSection.b(writer, customScalarAdapters, onEverydayExtraFaqsSection);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$Tab;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$Tab;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Tab implements Adapter<EverydayExtrasLandingQuery.Tab> {

        /* renamed from: a, reason: collision with root package name */
        public static final Tab f6042a = new Tab();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            EverydayExtrasLandingQuery.OnEverydayExtraKeyBenefitsTab onEverydayExtraKeyBenefitsTabA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            EverydayExtrasLandingQuery.OnEverydayExtraFaqsTab onEverydayExtraFaqsTabA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("EverydayExtraKeyBenefitsTab"))) {
                reader.o();
                onEverydayExtraKeyBenefitsTabA = OnEverydayExtraKeyBenefitsTab.a(reader, customScalarAdapters);
            } else {
                onEverydayExtraKeyBenefitsTabA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("EverydayExtraFaqsTab"))) {
                reader.o();
                onEverydayExtraFaqsTabA = OnEverydayExtraFaqsTab.a(reader, customScalarAdapters);
            }
            return new EverydayExtrasLandingQuery.Tab(str, onEverydayExtraKeyBenefitsTabA, onEverydayExtraFaqsTabA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasLandingQuery.Tab value = (EverydayExtrasLandingQuery.Tab) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5925a);
            EverydayExtrasLandingQuery.OnEverydayExtraKeyBenefitsTab onEverydayExtraKeyBenefitsTab = value.b;
            if (onEverydayExtraKeyBenefitsTab != null) {
                OnEverydayExtraKeyBenefitsTab.b(writer, customScalarAdapters, onEverydayExtraKeyBenefitsTab);
            }
            EverydayExtrasLandingQuery.OnEverydayExtraFaqsTab onEverydayExtraFaqsTab = value.c;
            if (onEverydayExtraFaqsTab != null) {
                OnEverydayExtraFaqsTab.b(writer, customScalarAdapters, onEverydayExtraFaqsTab);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasLandingQuery_ResponseAdapter$TermsAndConditions;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$TermsAndConditions;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TermsAndConditions implements Adapter<EverydayExtrasLandingQuery.TermsAndConditions> {

        /* renamed from: a, reason: collision with root package name */
        public static final TermsAndConditions f6043a = new TermsAndConditions();
        public static final List b = CollectionsKt.R("__typename", "title", "termsAndConditions");

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
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 != null) {
                return new EverydayExtrasLandingQuery.TermsAndConditions(str, str2, str3);
            }
            Assertions.a(reader, "termsAndConditions");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasLandingQuery.TermsAndConditions value = (EverydayExtrasLandingQuery.TermsAndConditions) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5926a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("termsAndConditions");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }
}
