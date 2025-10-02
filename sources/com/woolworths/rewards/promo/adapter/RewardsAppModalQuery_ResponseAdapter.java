package com.woolworths.rewards.promo.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
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
import com.woolworths.rewards.promo.RewardsAppModalQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/woolworths/rewards/promo/adapter/RewardsAppModalQuery_ResponseAdapter;", "", "Data", "RewardsAppModal", "HeaderImage", "InfoItem", "OnFeatureInfoBulletItem", "OnFeatureInfoText", "Footer", "PrimaryCta", "SecondaryCta", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RewardsAppModalQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/promo/adapter/RewardsAppModalQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/promo/RewardsAppModalQuery$Data;", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<RewardsAppModalQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f21066a = new Data();
        public static final List b = CollectionsKt.Q("rewardsAppModal");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            RewardsAppModalQuery.RewardsAppModal rewardsAppModal = null;
            while (reader.o2(b) == 0) {
                rewardsAppModal = (RewardsAppModalQuery.RewardsAppModal) Adapters.b(Adapters.c(RewardsAppModal.f21073a, false)).fromJson(reader, customScalarAdapters);
            }
            return new RewardsAppModalQuery.Data(rewardsAppModal);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsAppModalQuery.Data value = (RewardsAppModalQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("rewardsAppModal");
            Adapters.b(Adapters.c(RewardsAppModal.f21073a, false)).toJson(writer, customScalarAdapters, value.f21057a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/promo/adapter/RewardsAppModalQuery_ResponseAdapter$Footer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/promo/RewardsAppModalQuery$Footer;", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Footer implements Adapter<RewardsAppModalQuery.Footer> {

        /* renamed from: a, reason: collision with root package name */
        public static final Footer f21067a = new Footer();
        public static final List b = CollectionsKt.R("primaryCta", "secondaryCta");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            RewardsAppModalQuery.PrimaryCta primaryCta = null;
            RewardsAppModalQuery.SecondaryCta secondaryCta = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    primaryCta = (RewardsAppModalQuery.PrimaryCta) Adapters.c(PrimaryCta.f21072a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    secondaryCta = (RewardsAppModalQuery.SecondaryCta) Adapters.b(Adapters.c(SecondaryCta.f21074a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (primaryCta != null) {
                return new RewardsAppModalQuery.Footer(primaryCta, secondaryCta);
            }
            Assertions.a(reader, "primaryCta");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsAppModalQuery.Footer value = (RewardsAppModalQuery.Footer) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("primaryCta");
            Adapters.c(PrimaryCta.f21072a, false).toJson(writer, customScalarAdapters, value.f21058a);
            writer.F1("secondaryCta");
            Adapters.b(Adapters.c(SecondaryCta.f21074a, false)).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/promo/adapter/RewardsAppModalQuery_ResponseAdapter$HeaderImage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/promo/RewardsAppModalQuery$HeaderImage;", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HeaderImage implements Adapter<RewardsAppModalQuery.HeaderImage> {

        /* renamed from: a, reason: collision with root package name */
        public static final HeaderImage f21068a = new HeaderImage();
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
                return new RewardsAppModalQuery.HeaderImage(downloadableAssetTypeA, str, iIntValue, num5.intValue(), downloadableAssetFit, str2);
            }
            Assertions.a(reader, "assetHeight");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsAppModalQuery.HeaderImage value = (RewardsAppModalQuery.HeaderImage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("assetType");
            DownloadableAssetType_ResponseAdapter.b(writer, customScalarAdapters, value.f21059a);
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
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/promo/adapter/RewardsAppModalQuery_ResponseAdapter$InfoItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/promo/RewardsAppModalQuery$InfoItem;", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InfoItem implements Adapter<RewardsAppModalQuery.InfoItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final InfoItem f21069a = new InfoItem();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            RewardsAppModalQuery.OnFeatureInfoBulletItem onFeatureInfoBulletItemA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            RewardsAppModalQuery.OnFeatureInfoText onFeatureInfoTextA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("FeatureInfoBulletItem"))) {
                reader.o();
                onFeatureInfoBulletItemA = OnFeatureInfoBulletItem.a(reader, customScalarAdapters);
            } else {
                onFeatureInfoBulletItemA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("FeatureInfoText"))) {
                reader.o();
                onFeatureInfoTextA = OnFeatureInfoText.a(reader, customScalarAdapters);
            }
            return new RewardsAppModalQuery.InfoItem(str, onFeatureInfoBulletItemA, onFeatureInfoTextA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsAppModalQuery.InfoItem value = (RewardsAppModalQuery.InfoItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21060a);
            RewardsAppModalQuery.OnFeatureInfoBulletItem onFeatureInfoBulletItem = value.b;
            if (onFeatureInfoBulletItem != null) {
                OnFeatureInfoBulletItem.b(writer, customScalarAdapters, onFeatureInfoBulletItem);
            }
            RewardsAppModalQuery.OnFeatureInfoText onFeatureInfoText = value.c;
            if (onFeatureInfoText != null) {
                OnFeatureInfoText.b(writer, customScalarAdapters, onFeatureInfoText);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/promo/adapter/RewardsAppModalQuery_ResponseAdapter$OnFeatureInfoBulletItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/promo/RewardsAppModalQuery$OnFeatureInfoBulletItem;", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnFeatureInfoBulletItem implements Adapter<RewardsAppModalQuery.OnFeatureInfoBulletItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21070a = CollectionsKt.R("iconUrl", "title", "content");

        public static RewardsAppModalQuery.OnFeatureInfoBulletItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(f21070a);
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
                Assertions.a(reader, "iconUrl");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 != null) {
                return new RewardsAppModalQuery.OnFeatureInfoBulletItem(str, str2, str3);
            }
            Assertions.a(reader, "content");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, RewardsAppModalQuery.OnFeatureInfoBulletItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("iconUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21061a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("content");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (RewardsAppModalQuery.OnFeatureInfoBulletItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/promo/adapter/RewardsAppModalQuery_ResponseAdapter$OnFeatureInfoText;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/promo/RewardsAppModalQuery$OnFeatureInfoText;", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnFeatureInfoText implements Adapter<RewardsAppModalQuery.OnFeatureInfoText> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21071a = CollectionsKt.Q("markdownContent");

        public static RewardsAppModalQuery.OnFeatureInfoText a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f21071a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new RewardsAppModalQuery.OnFeatureInfoText(str);
            }
            Assertions.a(reader, "markdownContent");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, RewardsAppModalQuery.OnFeatureInfoText value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("markdownContent");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21062a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (RewardsAppModalQuery.OnFeatureInfoText) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/promo/adapter/RewardsAppModalQuery_ResponseAdapter$PrimaryCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/promo/RewardsAppModalQuery$PrimaryCta;", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PrimaryCta implements Adapter<RewardsAppModalQuery.PrimaryCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final PrimaryCta f21072a = new PrimaryCta();
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
                return new RewardsAppModalQuery.PrimaryCta(str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsAppModalQuery.PrimaryCta value = (RewardsAppModalQuery.PrimaryCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21063a);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/promo/adapter/RewardsAppModalQuery_ResponseAdapter$RewardsAppModal;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/promo/RewardsAppModalQuery$RewardsAppModal;", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsAppModal implements Adapter<RewardsAppModalQuery.RewardsAppModal> {

        /* renamed from: a, reason: collision with root package name */
        public static final RewardsAppModal f21073a = new RewardsAppModal();
        public static final List b = CollectionsKt.R("headerImage", "title", ErrorBundle.SUMMARY_ENTRY, "infoItems", "footer");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            RewardsAppModalQuery.HeaderImage headerImage = null;
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            RewardsAppModalQuery.Footer footer = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    headerImage = (RewardsAppModalQuery.HeaderImage) Adapters.b(Adapters.c(HeaderImage.f21068a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    arrayListFromJson = Adapters.a(Adapters.c(InfoItem.f21069a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    footer = (RewardsAppModalQuery.Footer) Adapters.b(Adapters.c(Footer.f21067a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, ErrorBundle.SUMMARY_ENTRY);
                throw null;
            }
            if (arrayListFromJson != null) {
                return new RewardsAppModalQuery.RewardsAppModal(headerImage, str, str2, arrayListFromJson, footer);
            }
            Assertions.a(reader, "infoItems");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsAppModalQuery.RewardsAppModal value = (RewardsAppModalQuery.RewardsAppModal) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("headerImage");
            Adapters.b(Adapters.c(HeaderImage.f21068a, false)).toJson(writer, customScalarAdapters, value.f21064a);
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(ErrorBundle.SUMMARY_ENTRY);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("infoItems");
            Adapters.a(Adapters.c(InfoItem.f21069a, true)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("footer");
            Adapters.b(Adapters.c(Footer.f21067a, false)).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/promo/adapter/RewardsAppModalQuery_ResponseAdapter$SecondaryCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/promo/RewardsAppModalQuery$SecondaryCta;", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SecondaryCta implements Adapter<RewardsAppModalQuery.SecondaryCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final SecondaryCta f21074a = new SecondaryCta();
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
                return new RewardsAppModalQuery.SecondaryCta(str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsAppModalQuery.SecondaryCta value = (RewardsAppModalQuery.SecondaryCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21065a);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }
}
