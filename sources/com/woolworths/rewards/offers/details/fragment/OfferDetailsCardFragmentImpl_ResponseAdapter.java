package com.woolworths.rewards.offers.details.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetFit;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetType;
import au.com.woolworths.rewards.graphql.type.LocalAssetIconName;
import au.com.woolworths.rewards.graphql.type.adapter.DownloadableAssetFit_ResponseAdapter;
import au.com.woolworths.rewards.graphql.type.adapter.DownloadableAssetType_ResponseAdapter;
import au.com.woolworths.rewards.graphql.type.adapter.LocalAssetIconName_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$IntAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.offers.details.fragment.OfferDetailsCardFragment;
import com.woolworths.scanlibrary.util.widget.CircularProgressDrawable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\bÇ\u0002\u0018\u00002\u00020\u0001:\u0014\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragmentImpl_ResponseAdapter;", "", "OfferDetailsCardFragment", "Row", "OnOfferDetailsTrackerComboRow", "TrackerRow", "RowLeadingAsset", "OnLocalAsset", "OnHostedIcon", "RowTrailingElement", "OnOfferDetailsTrackerTrailingElementLabel", "OnOfferDetailsTrackerTrailingElementPoints", "ProgressRow", "ProgressRowCircularIndicator", "PrimaryRing", "OnMarkdownTextItem", "OnSubheadTextItem", "OnOfferDetailsInfoItem", "InfoLeadingAsset", "OnLocalAsset1", "OnHostedIcon1", "OnDownloadableAsset", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OfferDetailsCardFragmentImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragmentImpl_ResponseAdapter$InfoLeadingAsset;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$InfoLeadingAsset;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InfoLeadingAsset implements Adapter<OfferDetailsCardFragment.InfoLeadingAsset> {

        /* renamed from: a, reason: collision with root package name */
        public static final InfoLeadingAsset f20822a = new InfoLeadingAsset();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            OfferDetailsCardFragment.OnLocalAsset1 onLocalAsset1A;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            OfferDetailsCardFragment.OnHostedIcon1 onHostedIcon1A = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("LocalAsset"))) {
                reader.o();
                onLocalAsset1A = OnLocalAsset1.a(reader, customScalarAdapters);
            } else {
                onLocalAsset1A = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("HostedIcon"))) {
                reader.o();
                onHostedIcon1A = OnHostedIcon1.a(reader, customScalarAdapters);
            }
            return new OfferDetailsCardFragment.InfoLeadingAsset(str, onLocalAsset1A, onHostedIcon1A);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsCardFragment.InfoLeadingAsset value = (OfferDetailsCardFragment.InfoLeadingAsset) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20803a);
            OfferDetailsCardFragment.OnLocalAsset1 onLocalAsset1 = value.b;
            if (onLocalAsset1 != null) {
                List list = OnLocalAsset1.f20828a;
                writer.F1("iconName");
                LocalAssetIconName_ResponseAdapter.b(writer, customScalarAdapters, onLocalAsset1.f20808a);
            }
            OfferDetailsCardFragment.OnHostedIcon1 onHostedIcon1 = value.c;
            if (onHostedIcon1 != null) {
                OnHostedIcon1.b(writer, customScalarAdapters, onHostedIcon1);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragmentImpl_ResponseAdapter$OfferDetailsCardFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OfferDetailsCardFragment implements Adapter<com.woolworths.rewards.offers.details.fragment.OfferDetailsCardFragment> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20823a = CollectionsKt.Q("rows");

        public static com.woolworths.rewards.offers.details.fragment.OfferDetailsCardFragment a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(f20823a) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(Row.f20838a, true)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new com.woolworths.rewards.offers.details.fragment.OfferDetailsCardFragment(arrayListFromJson);
            }
            Assertions.a(reader, "rows");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, com.woolworths.rewards.offers.details.fragment.OfferDetailsCardFragment value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("rows");
            Adapters.a(Adapters.c(Row.f20838a, true)).toJson(writer, customScalarAdapters, value.f20802a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (com.woolworths.rewards.offers.details.fragment.OfferDetailsCardFragment) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragmentImpl_ResponseAdapter$OnDownloadableAsset;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$OnDownloadableAsset;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnDownloadableAsset implements Adapter<OfferDetailsCardFragment.OnDownloadableAsset> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20824a = CollectionsKt.R("assetType", "assetUrl", "assetWidth", "assetHeight", "fit", "altText");

        public static OfferDetailsCardFragment.OnDownloadableAsset a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
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
                int iO2 = reader.o2(f20824a);
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
                return new OfferDetailsCardFragment.OnDownloadableAsset(downloadableAssetTypeA, str, iIntValue, num5.intValue(), downloadableAssetFit, str2);
            }
            Assertions.a(reader, "assetHeight");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OfferDetailsCardFragment.OnDownloadableAsset value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("assetType");
            DownloadableAssetType_ResponseAdapter.b(writer, customScalarAdapters, value.f20804a);
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

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OfferDetailsCardFragment.OnDownloadableAsset) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragmentImpl_ResponseAdapter$OnHostedIcon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$OnHostedIcon;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHostedIcon implements Adapter<OfferDetailsCardFragment.OnHostedIcon> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20825a = CollectionsKt.Q("url");

        public static OfferDetailsCardFragment.OnHostedIcon a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f20825a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new OfferDetailsCardFragment.OnHostedIcon(str);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OfferDetailsCardFragment.OnHostedIcon value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20805a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OfferDetailsCardFragment.OnHostedIcon) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragmentImpl_ResponseAdapter$OnHostedIcon1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$OnHostedIcon1;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHostedIcon1 implements Adapter<OfferDetailsCardFragment.OnHostedIcon1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20826a = CollectionsKt.Q("url");

        public static OfferDetailsCardFragment.OnHostedIcon1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f20826a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new OfferDetailsCardFragment.OnHostedIcon1(str);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OfferDetailsCardFragment.OnHostedIcon1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20806a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OfferDetailsCardFragment.OnHostedIcon1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragmentImpl_ResponseAdapter$OnLocalAsset;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$OnLocalAsset;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnLocalAsset implements Adapter<OfferDetailsCardFragment.OnLocalAsset> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20827a = CollectionsKt.Q("iconName");

        public static OfferDetailsCardFragment.OnLocalAsset a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            LocalAssetIconName localAssetIconNameA = null;
            while (reader.o2(f20827a) == 0) {
                localAssetIconNameA = LocalAssetIconName_ResponseAdapter.a(reader, customScalarAdapters);
            }
            if (localAssetIconNameA != null) {
                return new OfferDetailsCardFragment.OnLocalAsset(localAssetIconNameA);
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
            OfferDetailsCardFragment.OnLocalAsset value = (OfferDetailsCardFragment.OnLocalAsset) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("iconName");
            LocalAssetIconName_ResponseAdapter.b(writer, customScalarAdapters, value.f20807a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragmentImpl_ResponseAdapter$OnLocalAsset1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$OnLocalAsset1;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnLocalAsset1 implements Adapter<OfferDetailsCardFragment.OnLocalAsset1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20828a = CollectionsKt.Q("iconName");

        public static OfferDetailsCardFragment.OnLocalAsset1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            LocalAssetIconName localAssetIconNameA = null;
            while (reader.o2(f20828a) == 0) {
                localAssetIconNameA = LocalAssetIconName_ResponseAdapter.a(reader, customScalarAdapters);
            }
            if (localAssetIconNameA != null) {
                return new OfferDetailsCardFragment.OnLocalAsset1(localAssetIconNameA);
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
            OfferDetailsCardFragment.OnLocalAsset1 value = (OfferDetailsCardFragment.OnLocalAsset1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("iconName");
            LocalAssetIconName_ResponseAdapter.b(writer, customScalarAdapters, value.f20808a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragmentImpl_ResponseAdapter$OnMarkdownTextItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$OnMarkdownTextItem;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnMarkdownTextItem implements Adapter<OfferDetailsCardFragment.OnMarkdownTextItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20829a = CollectionsKt.Q("content");

        public static OfferDetailsCardFragment.OnMarkdownTextItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f20829a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new OfferDetailsCardFragment.OnMarkdownTextItem(str);
            }
            Assertions.a(reader, "content");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OfferDetailsCardFragment.OnMarkdownTextItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("content");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20809a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OfferDetailsCardFragment.OnMarkdownTextItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragmentImpl_ResponseAdapter$OnOfferDetailsInfoItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$OnOfferDetailsInfoItem;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnOfferDetailsInfoItem implements Adapter<OfferDetailsCardFragment.OnOfferDetailsInfoItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20830a = CollectionsKt.R("infoLeadingAsset", "infoDescription");

        public static OfferDetailsCardFragment.OnOfferDetailsInfoItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            OfferDetailsCardFragment.InfoLeadingAsset infoLeadingAsset = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(f20830a);
                if (iO2 == 0) {
                    infoLeadingAsset = (OfferDetailsCardFragment.InfoLeadingAsset) Adapters.b(Adapters.c(InfoLeadingAsset.f20822a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new OfferDetailsCardFragment.OnOfferDetailsInfoItem(infoLeadingAsset, str);
                    }
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OfferDetailsCardFragment.OnOfferDetailsInfoItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("infoLeadingAsset");
            Adapters.b(Adapters.c(InfoLeadingAsset.f20822a, true)).toJson(writer, customScalarAdapters, value.f20810a);
            writer.F1("infoDescription");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OfferDetailsCardFragment.OnOfferDetailsInfoItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragmentImpl_ResponseAdapter$OnOfferDetailsTrackerComboRow;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$OnOfferDetailsTrackerComboRow;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnOfferDetailsTrackerComboRow implements Adapter<OfferDetailsCardFragment.OnOfferDetailsTrackerComboRow> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20831a = CollectionsKt.R("trackerRow", "progressRow", "comboRowAltText");

        public static OfferDetailsCardFragment.OnOfferDetailsTrackerComboRow a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            OfferDetailsCardFragment.TrackerRow trackerRow = null;
            OfferDetailsCardFragment.ProgressRow progressRow = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(f20831a);
                if (iO2 == 0) {
                    trackerRow = (OfferDetailsCardFragment.TrackerRow) Adapters.b(Adapters.c(TrackerRow.f20841a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    progressRow = (OfferDetailsCardFragment.ProgressRow) Adapters.b(Adapters.c(ProgressRow.f20836a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new OfferDetailsCardFragment.OnOfferDetailsTrackerComboRow(trackerRow, progressRow, str);
            }
            Assertions.a(reader, "comboRowAltText");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OfferDetailsCardFragment.OnOfferDetailsTrackerComboRow value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("trackerRow");
            Adapters.b(Adapters.c(TrackerRow.f20841a, false)).toJson(writer, customScalarAdapters, value.f20811a);
            writer.F1("progressRow");
            Adapters.b(Adapters.c(ProgressRow.f20836a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("comboRowAltText");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OfferDetailsCardFragment.OnOfferDetailsTrackerComboRow) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragmentImpl_ResponseAdapter$OnOfferDetailsTrackerTrailingElementLabel;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$OnOfferDetailsTrackerTrailingElementLabel;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnOfferDetailsTrackerTrailingElementLabel implements Adapter<OfferDetailsCardFragment.OnOfferDetailsTrackerTrailingElementLabel> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20832a = CollectionsKt.Q("elementLabel");

        public static OfferDetailsCardFragment.OnOfferDetailsTrackerTrailingElementLabel a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f20832a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new OfferDetailsCardFragment.OnOfferDetailsTrackerTrailingElementLabel(str);
            }
            Assertions.a(reader, "elementLabel");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OfferDetailsCardFragment.OnOfferDetailsTrackerTrailingElementLabel value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("elementLabel");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20812a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OfferDetailsCardFragment.OnOfferDetailsTrackerTrailingElementLabel) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragmentImpl_ResponseAdapter$OnOfferDetailsTrackerTrailingElementPoints;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$OnOfferDetailsTrackerTrailingElementPoints;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnOfferDetailsTrackerTrailingElementPoints implements Adapter<OfferDetailsCardFragment.OnOfferDetailsTrackerTrailingElementPoints> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20833a = CollectionsKt.R("pointsPrefix", "pointsLabel");

        public static OfferDetailsCardFragment.OnOfferDetailsTrackerTrailingElementPoints a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f20833a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 != null) {
                return new OfferDetailsCardFragment.OnOfferDetailsTrackerTrailingElementPoints(str, str2);
            }
            Assertions.a(reader, "pointsLabel");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OfferDetailsCardFragment.OnOfferDetailsTrackerTrailingElementPoints value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("pointsPrefix");
            Adapters.i.toJson(writer, customScalarAdapters, value.f20813a);
            writer.F1("pointsLabel");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OfferDetailsCardFragment.OnOfferDetailsTrackerTrailingElementPoints) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragmentImpl_ResponseAdapter$OnSubheadTextItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$OnSubheadTextItem;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnSubheadTextItem implements Adapter<OfferDetailsCardFragment.OnSubheadTextItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20834a = CollectionsKt.Q("content");

        public static OfferDetailsCardFragment.OnSubheadTextItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f20834a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new OfferDetailsCardFragment.OnSubheadTextItem(str);
            }
            Assertions.a(reader, "content");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, OfferDetailsCardFragment.OnSubheadTextItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("content");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20814a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (OfferDetailsCardFragment.OnSubheadTextItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragmentImpl_ResponseAdapter$PrimaryRing;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$PrimaryRing;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PrimaryRing implements Adapter<OfferDetailsCardFragment.PrimaryRing> {

        /* renamed from: a, reason: collision with root package name */
        public static final PrimaryRing f20835a = new PrimaryRing();
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
                return new OfferDetailsCardFragment.PrimaryRing(dDoubleValue, str);
            }
            Assertions.a(reader, CircularProgressDrawable.RING_COLOR_PROPERTY);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsCardFragment.PrimaryRing value = (OfferDetailsCardFragment.PrimaryRing) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("ringPercent");
            Adapters.c.toJson(writer, customScalarAdapters, Double.valueOf(value.f20815a));
            writer.F1(CircularProgressDrawable.RING_COLOR_PROPERTY);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragmentImpl_ResponseAdapter$ProgressRow;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$ProgressRow;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProgressRow implements Adapter<OfferDetailsCardFragment.ProgressRow> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProgressRow f20836a = new ProgressRow();
        public static final List b = CollectionsKt.R("progressRowTitle", "progressRowDescription", "progressRowCircularIndicator");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            OfferDetailsCardFragment.ProgressRowCircularIndicator progressRowCircularIndicator = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        return new OfferDetailsCardFragment.ProgressRow(str, str2, progressRowCircularIndicator);
                    }
                    progressRowCircularIndicator = (OfferDetailsCardFragment.ProgressRowCircularIndicator) Adapters.b(Adapters.c(ProgressRowCircularIndicator.f20837a, false)).fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsCardFragment.ProgressRow value = (OfferDetailsCardFragment.ProgressRow) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("progressRowTitle");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f20816a);
            writer.F1("progressRowDescription");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("progressRowCircularIndicator");
            Adapters.b(Adapters.c(ProgressRowCircularIndicator.f20837a, false)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragmentImpl_ResponseAdapter$ProgressRowCircularIndicator;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$ProgressRowCircularIndicator;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProgressRowCircularIndicator implements Adapter<OfferDetailsCardFragment.ProgressRowCircularIndicator> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProgressRowCircularIndicator f20837a = new ProgressRowCircularIndicator();
        public static final List b = CollectionsKt.Q("primaryRing");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            OfferDetailsCardFragment.PrimaryRing primaryRing = null;
            while (reader.o2(b) == 0) {
                primaryRing = (OfferDetailsCardFragment.PrimaryRing) Adapters.c(PrimaryRing.f20835a, false).fromJson(reader, customScalarAdapters);
            }
            if (primaryRing != null) {
                return new OfferDetailsCardFragment.ProgressRowCircularIndicator(primaryRing);
            }
            Assertions.a(reader, "primaryRing");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsCardFragment.ProgressRowCircularIndicator value = (OfferDetailsCardFragment.ProgressRowCircularIndicator) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("primaryRing");
            Adapters.c(PrimaryRing.f20835a, false).toJson(writer, customScalarAdapters, value.f20817a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragmentImpl_ResponseAdapter$Row;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$Row;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Row implements Adapter<OfferDetailsCardFragment.Row> {

        /* renamed from: a, reason: collision with root package name */
        public static final Row f20838a = new Row();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            OfferDetailsCardFragment.OnOfferDetailsTrackerComboRow onOfferDetailsTrackerComboRowA;
            OfferDetailsCardFragment.OnMarkdownTextItem onMarkdownTextItemA;
            OfferDetailsCardFragment.OnSubheadTextItem onSubheadTextItemA;
            OfferDetailsCardFragment.OnOfferDetailsInfoItem onOfferDetailsInfoItemA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            OfferDetailsCardFragment.OnDownloadableAsset onDownloadableAssetA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("OfferDetailsTrackerComboRow"))) {
                reader.o();
                onOfferDetailsTrackerComboRowA = OnOfferDetailsTrackerComboRow.a(reader, customScalarAdapters);
            } else {
                onOfferDetailsTrackerComboRowA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("MarkdownTextItem"))) {
                reader.o();
                onMarkdownTextItemA = OnMarkdownTextItem.a(reader, customScalarAdapters);
            } else {
                onMarkdownTextItemA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("SubheadTextItem"))) {
                reader.o();
                onSubheadTextItemA = OnSubheadTextItem.a(reader, customScalarAdapters);
            } else {
                onSubheadTextItemA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("OfferDetailsInfoItem"))) {
                reader.o();
                onOfferDetailsInfoItemA = OnOfferDetailsInfoItem.a(reader, customScalarAdapters);
            } else {
                onOfferDetailsInfoItemA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("DownloadableAsset"))) {
                reader.o();
                onDownloadableAssetA = OnDownloadableAsset.a(reader, customScalarAdapters);
            }
            return new OfferDetailsCardFragment.Row(str, onOfferDetailsTrackerComboRowA, onMarkdownTextItemA, onSubheadTextItemA, onOfferDetailsInfoItemA, onDownloadableAssetA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsCardFragment.Row value = (OfferDetailsCardFragment.Row) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20818a);
            OfferDetailsCardFragment.OnOfferDetailsTrackerComboRow onOfferDetailsTrackerComboRow = value.b;
            if (onOfferDetailsTrackerComboRow != null) {
                OnOfferDetailsTrackerComboRow.b(writer, customScalarAdapters, onOfferDetailsTrackerComboRow);
            }
            OfferDetailsCardFragment.OnMarkdownTextItem onMarkdownTextItem = value.c;
            if (onMarkdownTextItem != null) {
                OnMarkdownTextItem.b(writer, customScalarAdapters, onMarkdownTextItem);
            }
            OfferDetailsCardFragment.OnSubheadTextItem onSubheadTextItem = value.d;
            if (onSubheadTextItem != null) {
                OnSubheadTextItem.b(writer, customScalarAdapters, onSubheadTextItem);
            }
            OfferDetailsCardFragment.OnOfferDetailsInfoItem onOfferDetailsInfoItem = value.e;
            if (onOfferDetailsInfoItem != null) {
                OnOfferDetailsInfoItem.b(writer, customScalarAdapters, onOfferDetailsInfoItem);
            }
            OfferDetailsCardFragment.OnDownloadableAsset onDownloadableAsset = value.f;
            if (onDownloadableAsset != null) {
                OnDownloadableAsset.b(writer, customScalarAdapters, onDownloadableAsset);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragmentImpl_ResponseAdapter$RowLeadingAsset;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$RowLeadingAsset;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RowLeadingAsset implements Adapter<OfferDetailsCardFragment.RowLeadingAsset> {

        /* renamed from: a, reason: collision with root package name */
        public static final RowLeadingAsset f20839a = new RowLeadingAsset();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            OfferDetailsCardFragment.OnLocalAsset onLocalAssetA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            OfferDetailsCardFragment.OnHostedIcon onHostedIconA = null;
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
            return new OfferDetailsCardFragment.RowLeadingAsset(str, onLocalAssetA, onHostedIconA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsCardFragment.RowLeadingAsset value = (OfferDetailsCardFragment.RowLeadingAsset) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20819a);
            OfferDetailsCardFragment.OnLocalAsset onLocalAsset = value.b;
            if (onLocalAsset != null) {
                List list = OnLocalAsset.f20827a;
                writer.F1("iconName");
                LocalAssetIconName_ResponseAdapter.b(writer, customScalarAdapters, onLocalAsset.f20807a);
            }
            OfferDetailsCardFragment.OnHostedIcon onHostedIcon = value.c;
            if (onHostedIcon != null) {
                OnHostedIcon.b(writer, customScalarAdapters, onHostedIcon);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragmentImpl_ResponseAdapter$RowTrailingElement;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$RowTrailingElement;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RowTrailingElement implements Adapter<OfferDetailsCardFragment.RowTrailingElement> {

        /* renamed from: a, reason: collision with root package name */
        public static final RowTrailingElement f20840a = new RowTrailingElement();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            OfferDetailsCardFragment.OnOfferDetailsTrackerTrailingElementLabel onOfferDetailsTrackerTrailingElementLabelA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            OfferDetailsCardFragment.OnOfferDetailsTrackerTrailingElementPoints onOfferDetailsTrackerTrailingElementPointsA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("OfferDetailsTrackerTrailingElementLabel"))) {
                reader.o();
                onOfferDetailsTrackerTrailingElementLabelA = OnOfferDetailsTrackerTrailingElementLabel.a(reader, customScalarAdapters);
            } else {
                onOfferDetailsTrackerTrailingElementLabelA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("OfferDetailsTrackerTrailingElementPoints"))) {
                reader.o();
                onOfferDetailsTrackerTrailingElementPointsA = OnOfferDetailsTrackerTrailingElementPoints.a(reader, customScalarAdapters);
            }
            return new OfferDetailsCardFragment.RowTrailingElement(str, onOfferDetailsTrackerTrailingElementLabelA, onOfferDetailsTrackerTrailingElementPointsA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsCardFragment.RowTrailingElement value = (OfferDetailsCardFragment.RowTrailingElement) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20820a);
            OfferDetailsCardFragment.OnOfferDetailsTrackerTrailingElementLabel onOfferDetailsTrackerTrailingElementLabel = value.b;
            if (onOfferDetailsTrackerTrailingElementLabel != null) {
                OnOfferDetailsTrackerTrailingElementLabel.b(writer, customScalarAdapters, onOfferDetailsTrackerTrailingElementLabel);
            }
            OfferDetailsCardFragment.OnOfferDetailsTrackerTrailingElementPoints onOfferDetailsTrackerTrailingElementPoints = value.c;
            if (onOfferDetailsTrackerTrailingElementPoints != null) {
                OnOfferDetailsTrackerTrailingElementPoints.b(writer, customScalarAdapters, onOfferDetailsTrackerTrailingElementPoints);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragmentImpl_ResponseAdapter$TrackerRow;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$TrackerRow;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TrackerRow implements Adapter<OfferDetailsCardFragment.TrackerRow> {

        /* renamed from: a, reason: collision with root package name */
        public static final TrackerRow f20841a = new TrackerRow();
        public static final List b = CollectionsKt.R("rowLeadingAsset", "rowLabel", "rowTrailingElement");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            OfferDetailsCardFragment.RowLeadingAsset rowLeadingAsset = null;
            String str = null;
            OfferDetailsCardFragment.RowTrailingElement rowTrailingElement = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    rowLeadingAsset = (OfferDetailsCardFragment.RowLeadingAsset) Adapters.b(Adapters.c(RowLeadingAsset.f20839a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        return new OfferDetailsCardFragment.TrackerRow(rowLeadingAsset, str, rowTrailingElement);
                    }
                    rowTrailingElement = (OfferDetailsCardFragment.RowTrailingElement) Adapters.b(Adapters.c(RowTrailingElement.f20840a, true)).fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            OfferDetailsCardFragment.TrackerRow value = (OfferDetailsCardFragment.TrackerRow) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("rowLeadingAsset");
            Adapters.b(Adapters.c(RowLeadingAsset.f20839a, true)).toJson(writer, customScalarAdapters, value.f20821a);
            writer.F1("rowLabel");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("rowTrailingElement");
            Adapters.b(Adapters.c(RowTrailingElement.f20840a, true)).toJson(writer, customScalarAdapters, value.c);
        }
    }
}
