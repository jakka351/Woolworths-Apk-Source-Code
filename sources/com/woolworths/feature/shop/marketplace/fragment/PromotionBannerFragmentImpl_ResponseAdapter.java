package com.woolworths.feature.shop.marketplace.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerActionPlacement_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerDisplayType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.UrlHandler;
import com.woolworths.feature.shop.marketplace.fragment.PromotionBannerFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/fragment/PromotionBannerFragmentImpl_ResponseAdapter;", "", "PromotionBannerFragment", "Banner", "Action", "PromotionContent", "OnPromotionMarkdownContent", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PromotionBannerFragmentImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/fragment/PromotionBannerFragmentImpl_ResponseAdapter$Action;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/marketplace/fragment/PromotionBannerFragment$Action;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action implements Adapter<PromotionBannerFragment.Action> {

        /* renamed from: a, reason: collision with root package name */
        public static final Action f19839a = new Action();
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
                return new PromotionBannerFragment.Action(insetBannerActionPlacementA, insetBannerActionTypeA, str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PromotionBannerFragment.Action value = (PromotionBannerFragment.Action) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("placement");
            InsetBannerActionPlacement_ResponseAdapter.b(writer, customScalarAdapters, value.f19835a);
            writer.F1("type");
            InsetBannerActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/fragment/PromotionBannerFragmentImpl_ResponseAdapter$Banner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/marketplace/fragment/PromotionBannerFragment$Banner;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Banner implements Adapter<PromotionBannerFragment.Banner> {

        /* renamed from: a, reason: collision with root package name */
        public static final Banner f19840a = new Banner();
        public static final List b = CollectionsKt.R("displayType", "message", "iconUrl", "bannerTitle", UrlHandler.ACTION);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerDisplayType insetBannerDisplayTypeA = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            PromotionBannerFragment.Action action = null;
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
                    action = (PromotionBannerFragment.Action) Adapters.b(Adapters.c(Action.f19839a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerDisplayTypeA == null) {
                Assertions.a(reader, "displayType");
                throw null;
            }
            if (str != null) {
                return new PromotionBannerFragment.Banner(insetBannerDisplayTypeA, str, str2, str3, action);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PromotionBannerFragment.Banner value = (PromotionBannerFragment.Banner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.f19836a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("iconUrl");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("bannerTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1(UrlHandler.ACTION);
            Adapters.b(Adapters.c(Action.f19839a, false)).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/fragment/PromotionBannerFragmentImpl_ResponseAdapter$OnPromotionMarkdownContent;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/marketplace/fragment/PromotionBannerFragment$OnPromotionMarkdownContent;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPromotionMarkdownContent implements Adapter<PromotionBannerFragment.OnPromotionMarkdownContent> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19841a = CollectionsKt.R("promotionMarkdownTitle", "promotionMarkdownText");

        public static PromotionBannerFragment.OnPromotionMarkdownContent a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f19841a);
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
                Assertions.a(reader, "promotionMarkdownTitle");
                throw null;
            }
            if (str2 != null) {
                return new PromotionBannerFragment.OnPromotionMarkdownContent(str, str2);
            }
            Assertions.a(reader, "promotionMarkdownText");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, PromotionBannerFragment.OnPromotionMarkdownContent value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("promotionMarkdownTitle");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19837a);
            writer.F1("promotionMarkdownText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (PromotionBannerFragment.OnPromotionMarkdownContent) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/fragment/PromotionBannerFragmentImpl_ResponseAdapter$PromotionBannerFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/marketplace/fragment/PromotionBannerFragment;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PromotionBannerFragment implements Adapter<com.woolworths.feature.shop.marketplace.fragment.PromotionBannerFragment> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19842a = CollectionsKt.R("banner", "promotionContent");

        public static com.woolworths.feature.shop.marketplace.fragment.PromotionBannerFragment a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            PromotionBannerFragment.Banner banner = null;
            PromotionBannerFragment.PromotionContent promotionContent = null;
            while (true) {
                int iO2 = reader.o2(f19842a);
                if (iO2 == 0) {
                    banner = (PromotionBannerFragment.Banner) Adapters.c(Banner.f19840a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    promotionContent = (PromotionBannerFragment.PromotionContent) Adapters.b(Adapters.c(PromotionContent.f19843a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (banner != null) {
                return new com.woolworths.feature.shop.marketplace.fragment.PromotionBannerFragment(banner, promotionContent);
            }
            Assertions.a(reader, "banner");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, com.woolworths.feature.shop.marketplace.fragment.PromotionBannerFragment value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("banner");
            Adapters.c(Banner.f19840a, false).toJson(writer, customScalarAdapters, value.f19834a);
            writer.F1("promotionContent");
            Adapters.b(Adapters.c(PromotionContent.f19843a, true)).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (com.woolworths.feature.shop.marketplace.fragment.PromotionBannerFragment) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/fragment/PromotionBannerFragmentImpl_ResponseAdapter$PromotionContent;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/marketplace/fragment/PromotionBannerFragment$PromotionContent;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PromotionContent implements Adapter<PromotionBannerFragment.PromotionContent> {

        /* renamed from: a, reason: collision with root package name */
        public static final PromotionContent f19843a = new PromotionContent();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            PromotionBannerFragment.OnPromotionMarkdownContent onPromotionMarkdownContentA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("PromotionMarkdownContent"))) {
                reader.o();
                onPromotionMarkdownContentA = OnPromotionMarkdownContent.a(reader, customScalarAdapters);
            }
            return new PromotionBannerFragment.PromotionContent(str, onPromotionMarkdownContentA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            PromotionBannerFragment.PromotionContent value = (PromotionBannerFragment.PromotionContent) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19838a);
            PromotionBannerFragment.OnPromotionMarkdownContent onPromotionMarkdownContent = value.b;
            if (onPromotionMarkdownContent != null) {
                OnPromotionMarkdownContent.b(writer, customScalarAdapters, onPromotionMarkdownContent);
            }
        }
    }
}
