package au.com.woolworths.feature.rewards.everydayextras.signup.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeOnboardingContentFragment;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetFit;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetType;
import au.com.woolworths.rewards.graphql.type.adapter.DownloadableAssetFit_ResponseAdapter;
import au.com.woolworths.rewards.graphql.type.adapter.DownloadableAssetType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$IntAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeOnboardingContentFragmentImpl_ResponseAdapter;", "", "SubscribeOnboardingContentFragment", "ContentItem", "OnDownloadableAsset", "OnTitleTextItem", "OnParagraphTextItem", "OnIconListItemWithNestedItems", "NestedItem", "OnNestedMarkdownContent", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscribeOnboardingContentFragmentImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeOnboardingContentFragmentImpl_ResponseAdapter$ContentItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeOnboardingContentFragment$ContentItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContentItem implements Adapter<SubscribeOnboardingContentFragment.ContentItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final ContentItem f6192a = new ContentItem();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            SubscribeOnboardingContentFragment.OnDownloadableAsset onDownloadableAssetA;
            SubscribeOnboardingContentFragment.OnTitleTextItem onTitleTextItemA;
            SubscribeOnboardingContentFragment.OnParagraphTextItem onParagraphTextItemA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            SubscribeOnboardingContentFragment.OnIconListItemWithNestedItems onIconListItemWithNestedItemsA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("DownloadableAsset"))) {
                reader.o();
                onDownloadableAssetA = OnDownloadableAsset.a(reader, customScalarAdapters);
            } else {
                onDownloadableAssetA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("TitleTextItem"))) {
                reader.o();
                onTitleTextItemA = OnTitleTextItem.a(reader, customScalarAdapters);
            } else {
                onTitleTextItemA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ParagraphTextItem"))) {
                reader.o();
                onParagraphTextItemA = OnParagraphTextItem.a(reader, customScalarAdapters);
            } else {
                onParagraphTextItemA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("IconListItemWithNestedItems"))) {
                reader.o();
                onIconListItemWithNestedItemsA = OnIconListItemWithNestedItems.a(reader, customScalarAdapters);
            }
            return new SubscribeOnboardingContentFragment.ContentItem(str, onDownloadableAssetA, onTitleTextItemA, onParagraphTextItemA, onIconListItemWithNestedItemsA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SubscribeOnboardingContentFragment.ContentItem value = (SubscribeOnboardingContentFragment.ContentItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f6185a);
            SubscribeOnboardingContentFragment.OnDownloadableAsset onDownloadableAsset = value.b;
            if (onDownloadableAsset != null) {
                OnDownloadableAsset.b(writer, customScalarAdapters, onDownloadableAsset);
            }
            SubscribeOnboardingContentFragment.OnTitleTextItem onTitleTextItem = value.c;
            if (onTitleTextItem != null) {
                OnTitleTextItem.b(writer, customScalarAdapters, onTitleTextItem);
            }
            SubscribeOnboardingContentFragment.OnParagraphTextItem onParagraphTextItem = value.d;
            if (onParagraphTextItem != null) {
                OnParagraphTextItem.b(writer, customScalarAdapters, onParagraphTextItem);
            }
            SubscribeOnboardingContentFragment.OnIconListItemWithNestedItems onIconListItemWithNestedItems = value.e;
            if (onIconListItemWithNestedItems != null) {
                OnIconListItemWithNestedItems.b(writer, customScalarAdapters, onIconListItemWithNestedItems);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeOnboardingContentFragmentImpl_ResponseAdapter$NestedItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeOnboardingContentFragment$NestedItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NestedItem implements Adapter<SubscribeOnboardingContentFragment.NestedItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final NestedItem f6193a = new NestedItem();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            SubscribeOnboardingContentFragment.OnNestedMarkdownContent onNestedMarkdownContentA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("NestedMarkdownContent"))) {
                reader.o();
                onNestedMarkdownContentA = OnNestedMarkdownContent.a(reader, customScalarAdapters);
            }
            return new SubscribeOnboardingContentFragment.NestedItem(str, onNestedMarkdownContentA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SubscribeOnboardingContentFragment.NestedItem value = (SubscribeOnboardingContentFragment.NestedItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f6186a);
            SubscribeOnboardingContentFragment.OnNestedMarkdownContent onNestedMarkdownContent = value.b;
            if (onNestedMarkdownContent != null) {
                OnNestedMarkdownContent.b(writer, customScalarAdapters, onNestedMarkdownContent);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeOnboardingContentFragmentImpl_ResponseAdapter$OnDownloadableAsset;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeOnboardingContentFragment$OnDownloadableAsset;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnDownloadableAsset implements Adapter<SubscribeOnboardingContentFragment.OnDownloadableAsset> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6194a = CollectionsKt.R("__typename", "assetType", "assetUrl", "assetWidth", "assetHeight", "fit", "altText");

        public static SubscribeOnboardingContentFragment.OnDownloadableAsset a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            String str = null;
            DownloadableAssetType downloadableAssetTypeA = null;
            String str2 = null;
            Integer num3 = null;
            DownloadableAssetFit downloadableAssetFit = null;
            String str3 = null;
            while (true) {
                switch (reader.o2(f6194a)) {
                    case 0:
                        num = num2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        downloadableAssetTypeA = DownloadableAssetType_ResponseAdapter.a(reader, customScalarAdapters);
                        continue;
                    case 2:
                        num = num2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        continue;
                    case 4:
                        num = num2;
                        num3 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        num = num2;
                        downloadableAssetFit = (DownloadableAssetFit) Adapters.b(DownloadableAssetFit_ResponseAdapter.f9949a).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        num = num2;
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Integer num4 = num2;
                        if (str == null) {
                            Assertions.a(reader, "__typename");
                            throw null;
                        }
                        if (downloadableAssetTypeA == null) {
                            Assertions.a(reader, "assetType");
                            throw null;
                        }
                        if (str2 == null) {
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
                            return new SubscribeOnboardingContentFragment.OnDownloadableAsset(str, downloadableAssetTypeA, str2, iIntValue, num5.intValue(), downloadableAssetFit, str3);
                        }
                        Assertions.a(reader, "assetHeight");
                        throw null;
                }
                num2 = num;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, SubscribeOnboardingContentFragment.OnDownloadableAsset value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f6187a);
            writer.F1("assetType");
            DownloadableAssetType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1("assetUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("assetWidth");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.d, adapters$IntAdapter$1, writer, customScalarAdapters, "assetHeight");
            d.y(value.e, adapters$IntAdapter$1, writer, customScalarAdapters, "fit");
            Adapters.b(DownloadableAssetFit_ResponseAdapter.f9949a).toJson(writer, customScalarAdapters, value.f);
            writer.F1("altText");
            Adapters.i.toJson(writer, customScalarAdapters, value.g);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (SubscribeOnboardingContentFragment.OnDownloadableAsset) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeOnboardingContentFragmentImpl_ResponseAdapter$OnIconListItemWithNestedItems;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeOnboardingContentFragment$OnIconListItemWithNestedItems;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnIconListItemWithNestedItems implements Adapter<SubscribeOnboardingContentFragment.OnIconListItemWithNestedItems> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6195a = CollectionsKt.R("__typename", "iconUrl", "nestedItems");

        public static SubscribeOnboardingContentFragment.OnIconListItemWithNestedItems a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f6195a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(NestedItem.f6193a, true)).fromJson(reader, customScalarAdapters);
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
            if (arrayListFromJson != null) {
                return new SubscribeOnboardingContentFragment.OnIconListItemWithNestedItems(str, str2, arrayListFromJson);
            }
            Assertions.a(reader, "nestedItems");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, SubscribeOnboardingContentFragment.OnIconListItemWithNestedItems value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f6188a);
            writer.F1("iconUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("nestedItems");
            Adapters.a(Adapters.c(NestedItem.f6193a, true)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (SubscribeOnboardingContentFragment.OnIconListItemWithNestedItems) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeOnboardingContentFragmentImpl_ResponseAdapter$OnNestedMarkdownContent;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeOnboardingContentFragment$OnNestedMarkdownContent;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnNestedMarkdownContent implements Adapter<SubscribeOnboardingContentFragment.OnNestedMarkdownContent> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6196a = CollectionsKt.R("__typename", "content");

        public static SubscribeOnboardingContentFragment.OnNestedMarkdownContent a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f6196a);
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
                return new SubscribeOnboardingContentFragment.OnNestedMarkdownContent(str, str2);
            }
            Assertions.a(reader, "content");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, SubscribeOnboardingContentFragment.OnNestedMarkdownContent value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f6189a);
            writer.F1("content");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (SubscribeOnboardingContentFragment.OnNestedMarkdownContent) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeOnboardingContentFragmentImpl_ResponseAdapter$OnParagraphTextItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeOnboardingContentFragment$OnParagraphTextItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnParagraphTextItem implements Adapter<SubscribeOnboardingContentFragment.OnParagraphTextItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6197a = CollectionsKt.R("__typename", "content", "alignment");

        public static SubscribeOnboardingContentFragment.OnParagraphTextItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(f6197a);
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
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 != null) {
                return new SubscribeOnboardingContentFragment.OnParagraphTextItem(str, str2, str3);
            }
            Assertions.a(reader, "content");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, SubscribeOnboardingContentFragment.OnParagraphTextItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f6190a);
            writer.F1("content");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("alignment");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (SubscribeOnboardingContentFragment.OnParagraphTextItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeOnboardingContentFragmentImpl_ResponseAdapter$OnTitleTextItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeOnboardingContentFragment$OnTitleTextItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnTitleTextItem implements Adapter<SubscribeOnboardingContentFragment.OnTitleTextItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6198a = CollectionsKt.R("__typename", "content");

        public static SubscribeOnboardingContentFragment.OnTitleTextItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f6198a);
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
                return new SubscribeOnboardingContentFragment.OnTitleTextItem(str, str2);
            }
            Assertions.a(reader, "content");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, SubscribeOnboardingContentFragment.OnTitleTextItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f6191a);
            writer.F1("content");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (SubscribeOnboardingContentFragment.OnTitleTextItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeOnboardingContentFragmentImpl_ResponseAdapter$SubscribeOnboardingContentFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeOnboardingContentFragment;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SubscribeOnboardingContentFragment implements Adapter<au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeOnboardingContentFragment> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6199a = CollectionsKt.R("__typename", "id", "contentItems");

        public static au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeOnboardingContentFragment a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f6199a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(ContentItem.f6192a, true)).fromJson(reader, customScalarAdapters);
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
                return new au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeOnboardingContentFragment(str, str2, arrayListFromJson);
            }
            Assertions.a(reader, "contentItems");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeOnboardingContentFragment value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f6184a);
            writer.F1("id");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("contentItems");
            Adapters.a(Adapters.c(ContentItem.f6192a, true)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (au.com.woolworths.feature.rewards.everydayextras.signup.fragment.SubscribeOnboardingContentFragment) obj);
        }
    }
}
