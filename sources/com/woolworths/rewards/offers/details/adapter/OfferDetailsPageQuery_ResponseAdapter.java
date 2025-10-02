package com.woolworths.rewards.offers.details.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.rewards.graphql.type.LocalAssetIconName;
import au.com.woolworths.rewards.graphql.type.adapter.LocalAssetIconName_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.offers.details.OfferDetailsPageQuery;
import com.woolworths.rewards.offers.details.fragment.OfferDetailsPageFragment;
import com.woolworths.rewards.offers.details.fragment.OfferDetailsPageFragmentImpl_ResponseAdapter;
import com.woolworths.rewards.offers.fragment.fragment.ContentCtaFields;
import com.woolworths.rewards.offers.fragment.fragment.ContentCtaFieldsImpl_ResponseAdapter;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/woolworths/rewards/offers/details/adapter/OfferDetailsPageQuery_ResponseAdapter;", "", "Data", "OfferDetails", "OnOfferDetailsPage", "OnRewardsErrorEmptyState", "EmptyStateIconAsset", "OnLocalAsset", "OnHostedIcon", "EmptyStateAction", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OfferDetailsPageQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/adapter/OfferDetailsPageQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/OfferDetailsPageQuery$Data;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<OfferDetailsPageQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20794a = new Data();
        public static final List b = CollectionsKt.Q("offerDetails");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            OfferDetailsPageQuery.OfferDetails offerDetails = null;
            while (reader.o2(b) == 0) {
                offerDetails = (OfferDetailsPageQuery.OfferDetails) Adapters.c(OfferDetails.f20797a, true).fromJson(reader, customScalarAdapters);
            }
            if (offerDetails != null) {
                return new OfferDetailsPageQuery.Data(offerDetails);
            }
            Assertions.a(reader, "offerDetails");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsPageQuery.Data value = (OfferDetailsPageQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("offerDetails");
            Adapters.c(OfferDetails.f20797a, true).toJson(writer, customScalarAdapters, value.f20781a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/adapter/OfferDetailsPageQuery_ResponseAdapter$EmptyStateAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/OfferDetailsPageQuery$EmptyStateAction;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EmptyStateAction implements Adapter<OfferDetailsPageQuery.EmptyStateAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final EmptyStateAction f20795a = new EmptyStateAction();
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
                return new OfferDetailsPageQuery.EmptyStateAction(str, contentCtaFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsPageQuery.EmptyStateAction value = (OfferDetailsPageQuery.EmptyStateAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20782a);
            List list = ContentCtaFieldsImpl_ResponseAdapter.ContentCtaFields.f20976a;
            ContentCtaFieldsImpl_ResponseAdapter.ContentCtaFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/adapter/OfferDetailsPageQuery_ResponseAdapter$EmptyStateIconAsset;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/OfferDetailsPageQuery$EmptyStateIconAsset;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EmptyStateIconAsset implements Adapter<OfferDetailsPageQuery.EmptyStateIconAsset> {

        /* renamed from: a, reason: collision with root package name */
        public static final EmptyStateIconAsset f20796a = new EmptyStateIconAsset();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            OfferDetailsPageQuery.OnLocalAsset onLocalAssetA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            OfferDetailsPageQuery.OnHostedIcon onHostedIconA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("LocalAsset"))) {
                reader.o();
                onLocalAssetA = OnLocalAsset.a(reader, customScalarAdapters);
            } else {
                onLocalAssetA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("HostedIcon"))) {
                reader.o();
                onHostedIconA = OnHostedIcon.a(reader, customScalarAdapters);
            }
            return new OfferDetailsPageQuery.EmptyStateIconAsset(str, onLocalAssetA, onHostedIconA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsPageQuery.EmptyStateIconAsset value = (OfferDetailsPageQuery.EmptyStateIconAsset) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20783a);
            OfferDetailsPageQuery.OnLocalAsset onLocalAsset = value.b;
            if (onLocalAsset != null) {
                List list = OnLocalAsset.f20799a;
                writer.F1("iconName");
                LocalAssetIconName_ResponseAdapter.b(writer, customScalarAdapters, onLocalAsset.f20786a);
            }
            OfferDetailsPageQuery.OnHostedIcon onHostedIcon = value.c;
            if (onHostedIcon != null) {
                OnHostedIcon.b(writer, customScalarAdapters, onHostedIcon);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/adapter/OfferDetailsPageQuery_ResponseAdapter$OfferDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/OfferDetailsPageQuery$OfferDetails;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OfferDetails implements Adapter<OfferDetailsPageQuery.OfferDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final OfferDetails f20797a = new OfferDetails();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            OfferDetailsPageQuery.OnOfferDetailsPage onOfferDetailsPageA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            OfferDetailsPageQuery.OnRewardsErrorEmptyState onRewardsErrorEmptyStateA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("OfferDetailsPage"))) {
                reader.o();
                onOfferDetailsPageA = OnOfferDetailsPage.a(reader, customScalarAdapters);
            } else {
                onOfferDetailsPageA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RewardsErrorEmptyState"))) {
                reader.o();
                onRewardsErrorEmptyStateA = OnRewardsErrorEmptyState.a(reader, customScalarAdapters);
            }
            return new OfferDetailsPageQuery.OfferDetails(str, onOfferDetailsPageA, onRewardsErrorEmptyStateA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsPageQuery.OfferDetails value = (OfferDetailsPageQuery.OfferDetails) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20784a);
            OfferDetailsPageQuery.OnOfferDetailsPage onOfferDetailsPage = value.b;
            if (onOfferDetailsPage != null) {
                OnOfferDetailsPage.b(writer, customScalarAdapters, onOfferDetailsPage);
            }
            OfferDetailsPageQuery.OnRewardsErrorEmptyState onRewardsErrorEmptyState = value.c;
            if (onRewardsErrorEmptyState != null) {
                OnRewardsErrorEmptyState.b(writer, customScalarAdapters, onRewardsErrorEmptyState);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/adapter/OfferDetailsPageQuery_ResponseAdapter$OnHostedIcon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/OfferDetailsPageQuery$OnHostedIcon;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHostedIcon implements Adapter<OfferDetailsPageQuery.OnHostedIcon> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20798a = CollectionsKt.Q("url");

        public static OfferDetailsPageQuery.OnHostedIcon a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f20798a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new OfferDetailsPageQuery.OnHostedIcon(str);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OfferDetailsPageQuery.OnHostedIcon value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20785a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OfferDetailsPageQuery.OnHostedIcon) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/adapter/OfferDetailsPageQuery_ResponseAdapter$OnLocalAsset;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/OfferDetailsPageQuery$OnLocalAsset;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnLocalAsset implements Adapter<OfferDetailsPageQuery.OnLocalAsset> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20799a = CollectionsKt.Q("iconName");

        public static OfferDetailsPageQuery.OnLocalAsset a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            LocalAssetIconName localAssetIconNameA = null;
            while (reader.o2(f20799a) == 0) {
                localAssetIconNameA = LocalAssetIconName_ResponseAdapter.a(reader, customScalarAdapters);
            }
            if (localAssetIconNameA != null) {
                return new OfferDetailsPageQuery.OnLocalAsset(localAssetIconNameA);
            }
            Assertions.a(reader, "iconName");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsPageQuery.OnLocalAsset value = (OfferDetailsPageQuery.OnLocalAsset) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("iconName");
            LocalAssetIconName_ResponseAdapter.b(writer, customScalarAdapters, value.f20786a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/adapter/OfferDetailsPageQuery_ResponseAdapter$OnOfferDetailsPage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/OfferDetailsPageQuery$OnOfferDetailsPage;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnOfferDetailsPage implements Adapter<OfferDetailsPageQuery.OnOfferDetailsPage> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20800a = CollectionsKt.Q("__typename");

        public static OfferDetailsPageQuery.OnOfferDetailsPage a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f20800a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            OfferDetailsPageFragment offerDetailsPageFragmentA = OfferDetailsPageFragmentImpl_ResponseAdapter.OfferDetailsPageFragment.a(reader, customScalarAdapters);
            if (str != null) {
                return new OfferDetailsPageQuery.OnOfferDetailsPage(str, offerDetailsPageFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OfferDetailsPageQuery.OnOfferDetailsPage value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20787a);
            List list = OfferDetailsPageFragmentImpl_ResponseAdapter.OfferDetailsPageFragment.f20873a;
            OfferDetailsPageFragmentImpl_ResponseAdapter.OfferDetailsPageFragment.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OfferDetailsPageQuery.OnOfferDetailsPage) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/adapter/OfferDetailsPageQuery_ResponseAdapter$OnRewardsErrorEmptyState;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/OfferDetailsPageQuery$OnRewardsErrorEmptyState;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRewardsErrorEmptyState implements Adapter<OfferDetailsPageQuery.OnRewardsErrorEmptyState> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20801a = CollectionsKt.R("emptyStateIconAsset", "emptyStateTitle", "emptyStateMessage", "emptyStateAction");

        public static OfferDetailsPageQuery.OnRewardsErrorEmptyState a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            OfferDetailsPageQuery.EmptyStateIconAsset emptyStateIconAsset = null;
            String str = null;
            String str2 = null;
            OfferDetailsPageQuery.EmptyStateAction emptyStateAction = null;
            while (true) {
                int iO2 = reader.o2(f20801a);
                if (iO2 == 0) {
                    emptyStateIconAsset = (OfferDetailsPageQuery.EmptyStateIconAsset) Adapters.b(Adapters.c(EmptyStateIconAsset.f20796a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        return new OfferDetailsPageQuery.OnRewardsErrorEmptyState(emptyStateIconAsset, str, str2, emptyStateAction);
                    }
                    emptyStateAction = (OfferDetailsPageQuery.EmptyStateAction) Adapters.b(Adapters.c(EmptyStateAction.f20795a, true)).fromJson(reader, customScalarAdapters);
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OfferDetailsPageQuery.OnRewardsErrorEmptyState value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("emptyStateIconAsset");
            Adapters.b(Adapters.c(EmptyStateIconAsset.f20796a, true)).toJson(writer, customScalarAdapters, value.f20788a);
            writer.F1("emptyStateTitle");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("emptyStateMessage");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("emptyStateAction");
            Adapters.b(Adapters.c(EmptyStateAction.f20795a, true)).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OfferDetailsPageQuery.OnRewardsErrorEmptyState) obj);
        }
    }
}
