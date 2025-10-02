package com.woolworths.rewards.offers.adapter;

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
import com.woolworths.rewards.offers.OfferListPageQuery;
import com.woolworths.rewards.offers.fragment.fragment.OffersSectionsFragment;
import com.woolworths.rewards.offers.fragment.fragment.OffersSectionsFragmentImpl_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/OfferListPageQuery_ResponseAdapter;", "", "Data", "RewardsOffersListPage", "OnRewardsOffersSection", "Section", "Footer", "Cta", "OnRewardsEmptyPage", "State", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OfferListPageQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/OfferListPageQuery_ResponseAdapter$Cta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/OfferListPageQuery$Cta;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Cta implements Adapter<OfferListPageQuery.Cta> {

        /* renamed from: a, reason: collision with root package name */
        public static final Cta f20765a = new Cta();
        public static final List b = CollectionsKt.R("isExternalUrl", AnnotatedPrivateKey.LABEL, "url");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new OfferListPageQuery.Cta(bool, str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferListPageQuery.Cta value = (OfferListPageQuery.Cta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("isExternalUrl");
            Adapters.l.toJson(writer, customScalarAdapters, value.f20728a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/OfferListPageQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/OfferListPageQuery$Data;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<OfferListPageQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20766a = new Data();
        public static final List b = CollectionsKt.Q("rewardsOffersListPage");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            OfferListPageQuery.RewardsOffersListPage rewardsOffersListPage = null;
            while (reader.o2(b) == 0) {
                rewardsOffersListPage = (OfferListPageQuery.RewardsOffersListPage) Adapters.b(Adapters.c(RewardsOffersListPage.f20770a, true)).fromJson(reader, customScalarAdapters);
            }
            return new OfferListPageQuery.Data(rewardsOffersListPage);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferListPageQuery.Data value = (OfferListPageQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("rewardsOffersListPage");
            Adapters.b(Adapters.c(RewardsOffersListPage.f20770a, true)).toJson(writer, customScalarAdapters, value.f20729a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/OfferListPageQuery_ResponseAdapter$Footer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/OfferListPageQuery$Footer;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Footer implements Adapter<OfferListPageQuery.Footer> {

        /* renamed from: a, reason: collision with root package name */
        public static final Footer f20767a = new Footer();
        public static final List b = CollectionsKt.R("cta", "title");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            OfferListPageQuery.Cta cta = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    cta = (OfferListPageQuery.Cta) Adapters.c(Cta.f20765a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (cta != null) {
                return new OfferListPageQuery.Footer(cta, str);
            }
            Assertions.a(reader, "cta");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferListPageQuery.Footer value = (OfferListPageQuery.Footer) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("cta");
            Adapters.c(Cta.f20765a, false).toJson(writer, customScalarAdapters, value.f20730a);
            writer.F1("title");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/OfferListPageQuery_ResponseAdapter$OnRewardsEmptyPage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/OfferListPageQuery$OnRewardsEmptyPage;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRewardsEmptyPage implements Adapter<OfferListPageQuery.OnRewardsEmptyPage> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20768a = CollectionsKt.R("navigationTitle", "state");

        public static OfferListPageQuery.OnRewardsEmptyPage a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            OfferListPageQuery.State state = null;
            while (true) {
                int iO2 = reader.o2(f20768a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    state = (OfferListPageQuery.State) Adapters.c(State.f20772a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (state != null) {
                return new OfferListPageQuery.OnRewardsEmptyPage(str, state);
            }
            Assertions.a(reader, "state");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OfferListPageQuery.OnRewardsEmptyPage value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("navigationTitle");
            Adapters.i.toJson(writer, customScalarAdapters, value.f20731a);
            writer.F1("state");
            Adapters.c(State.f20772a, false).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OfferListPageQuery.OnRewardsEmptyPage) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/OfferListPageQuery_ResponseAdapter$OnRewardsOffersSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/OfferListPageQuery$OnRewardsOffersSection;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRewardsOffersSection implements Adapter<OfferListPageQuery.OnRewardsOffersSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20769a = CollectionsKt.R("navigationTitle", "sections", "footer");

        public static OfferListPageQuery.OnRewardsOffersSection a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            OfferListPageQuery.Footer footer = null;
            while (true) {
                int iO2 = reader.o2(f20769a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson = Adapters.a(Adapters.c(Section.f20771a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    footer = (OfferListPageQuery.Footer) Adapters.b(Adapters.c(Footer.f20767a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new OfferListPageQuery.OnRewardsOffersSection(str, arrayListFromJson, footer);
            }
            Assertions.a(reader, "sections");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OfferListPageQuery.OnRewardsOffersSection value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("navigationTitle");
            Adapters.i.toJson(writer, customScalarAdapters, value.f20732a);
            writer.F1("sections");
            Adapters.a(Adapters.c(Section.f20771a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("footer");
            Adapters.b(Adapters.c(Footer.f20767a, false)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OfferListPageQuery.OnRewardsOffersSection) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/OfferListPageQuery_ResponseAdapter$RewardsOffersListPage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/OfferListPageQuery$RewardsOffersListPage;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsOffersListPage implements Adapter<OfferListPageQuery.RewardsOffersListPage> {

        /* renamed from: a, reason: collision with root package name */
        public static final RewardsOffersListPage f20770a = new RewardsOffersListPage();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            OfferListPageQuery.OnRewardsOffersSection onRewardsOffersSectionA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            OfferListPageQuery.OnRewardsEmptyPage onRewardsEmptyPageA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RewardsOffersSection"))) {
                reader.o();
                onRewardsOffersSectionA = OnRewardsOffersSection.a(reader, customScalarAdapters);
            } else {
                onRewardsOffersSectionA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RewardsEmptyPage"))) {
                reader.o();
                onRewardsEmptyPageA = OnRewardsEmptyPage.a(reader, customScalarAdapters);
            }
            return new OfferListPageQuery.RewardsOffersListPage(str, onRewardsOffersSectionA, onRewardsEmptyPageA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferListPageQuery.RewardsOffersListPage value = (OfferListPageQuery.RewardsOffersListPage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20733a);
            OfferListPageQuery.OnRewardsOffersSection onRewardsOffersSection = value.b;
            if (onRewardsOffersSection != null) {
                OnRewardsOffersSection.b(writer, customScalarAdapters, onRewardsOffersSection);
            }
            OfferListPageQuery.OnRewardsEmptyPage onRewardsEmptyPage = value.c;
            if (onRewardsEmptyPage != null) {
                OnRewardsEmptyPage.b(writer, customScalarAdapters, onRewardsEmptyPage);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/OfferListPageQuery_ResponseAdapter$Section;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/OfferListPageQuery$Section;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Section implements Adapter<OfferListPageQuery.Section> {

        /* renamed from: a, reason: collision with root package name */
        public static final Section f20771a = new Section();
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
                return new OfferListPageQuery.Section(str, offersSectionsFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferListPageQuery.Section value = (OfferListPageQuery.Section) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20734a);
            List list = OffersSectionsFragmentImpl_ResponseAdapter.OffersSectionsFragment.f21022a;
            OffersSectionsFragmentImpl_ResponseAdapter.OffersSectionsFragment.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/adapter/OfferListPageQuery_ResponseAdapter$State;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/OfferListPageQuery$State;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class State implements Adapter<OfferListPageQuery.State> {

        /* renamed from: a, reason: collision with root package name */
        public static final State f20772a = new State();
        public static final List b = CollectionsKt.R("title", "imageUrl", "message");

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
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "imageUrl");
                throw null;
            }
            if (str3 != null) {
                return new OfferListPageQuery.State(str, str2, str3);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferListPageQuery.State value = (OfferListPageQuery.State) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20735a);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }
}
