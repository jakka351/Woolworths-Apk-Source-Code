package com.woolworths.rewards.card.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
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
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.card.RedemptionUnlockMutation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/woolworths/rewards/card/adapter/RedemptionUnlockMutation_ResponseAdapter;", "", "Data", "RewardsRedemptionUnlock", "HeaderImage", "Button", "CallToAction", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RedemptionUnlockMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/card/adapter/RedemptionUnlockMutation_ResponseAdapter$Button;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/card/RedemptionUnlockMutation$Button;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Button implements Adapter<RedemptionUnlockMutation.Button> {

        /* renamed from: a, reason: collision with root package name */
        public static final Button f20669a = new Button();
        public static final List b = CollectionsKt.R("loadingStateLabel", AnnotatedPrivateKey.LABEL, "iconUrl");

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
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 != null) {
                return new RedemptionUnlockMutation.Button(str, str2, str3);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RedemptionUnlockMutation.Button value = (RedemptionUnlockMutation.Button) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("loadingStateLabel");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f20647a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("iconUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/card/adapter/RedemptionUnlockMutation_ResponseAdapter$CallToAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/card/RedemptionUnlockMutation$CallToAction;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CallToAction implements Adapter<RedemptionUnlockMutation.CallToAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final CallToAction f20670a = new CallToAction();
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
                return new RedemptionUnlockMutation.CallToAction(str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RedemptionUnlockMutation.CallToAction value = (RedemptionUnlockMutation.CallToAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20648a);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/card/adapter/RedemptionUnlockMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/card/RedemptionUnlockMutation$Data;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<RedemptionUnlockMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20671a = new Data();
        public static final List b = CollectionsKt.Q("rewardsRedemptionUnlock");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            RedemptionUnlockMutation.RewardsRedemptionUnlock rewardsRedemptionUnlock = null;
            while (reader.o2(b) == 0) {
                rewardsRedemptionUnlock = (RedemptionUnlockMutation.RewardsRedemptionUnlock) Adapters.b(Adapters.c(RewardsRedemptionUnlock.f20673a, false)).fromJson(reader, customScalarAdapters);
            }
            return new RedemptionUnlockMutation.Data(rewardsRedemptionUnlock);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RedemptionUnlockMutation.Data value = (RedemptionUnlockMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("rewardsRedemptionUnlock");
            Adapters.b(Adapters.c(RewardsRedemptionUnlock.f20673a, false)).toJson(writer, customScalarAdapters, value.f20649a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/card/adapter/RedemptionUnlockMutation_ResponseAdapter$HeaderImage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/card/RedemptionUnlockMutation$HeaderImage;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HeaderImage implements Adapter<RedemptionUnlockMutation.HeaderImage> {

        /* renamed from: a, reason: collision with root package name */
        public static final HeaderImage f20672a = new HeaderImage();
        public static final List b = CollectionsKt.R("assetType", "assetUrl", "assetWidth", "assetHeight", "fit");

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
                    } else {
                        if (iO2 != 4) {
                            break;
                        }
                        num = num2;
                        downloadableAssetFit = (DownloadableAssetFit) Adapters.b(DownloadableAssetFit_ResponseAdapter.f9949a).fromJson(reader, customScalarAdapters);
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
                return new RedemptionUnlockMutation.HeaderImage(downloadableAssetTypeA, str, iIntValue, num5.intValue(), downloadableAssetFit);
            }
            Assertions.a(reader, "assetHeight");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RedemptionUnlockMutation.HeaderImage value = (RedemptionUnlockMutation.HeaderImage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("assetType");
            DownloadableAssetType_ResponseAdapter.b(writer, customScalarAdapters, value.f20650a);
            writer.F1("assetUrl");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("assetWidth");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.c, adapters$IntAdapter$1, writer, customScalarAdapters, "assetHeight");
            d.y(value.d, adapters$IntAdapter$1, writer, customScalarAdapters, "fit");
            Adapters.b(DownloadableAssetFit_ResponseAdapter.f9949a).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/card/adapter/RedemptionUnlockMutation_ResponseAdapter$RewardsRedemptionUnlock;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/card/RedemptionUnlockMutation$RewardsRedemptionUnlock;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsRedemptionUnlock implements Adapter<RedemptionUnlockMutation.RewardsRedemptionUnlock> {

        /* renamed from: a, reason: collision with root package name */
        public static final RewardsRedemptionUnlock f20673a = new RewardsRedemptionUnlock();
        public static final List b = CollectionsKt.R("iconUrl", "headerImage", "title", "showAnimation", "content", "button", "analyticsLabel", "callToAction", "showUnlock");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            RedemptionUnlockMutation.HeaderImage headerImage = null;
            String str2 = null;
            String str3 = null;
            RedemptionUnlockMutation.Button button = null;
            String str4 = null;
            RedemptionUnlockMutation.CallToAction callToAction = null;
            Boolean bool3 = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        bool = bool2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        bool = bool2;
                        headerImage = (RedemptionUnlockMutation.HeaderImage) Adapters.c(HeaderImage.f20672a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        bool = bool2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 4:
                        bool = bool2;
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        bool = bool2;
                        button = (RedemptionUnlockMutation.Button) Adapters.c(Button.f20669a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = bool2;
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        bool = bool2;
                        callToAction = (RedemptionUnlockMutation.CallToAction) Adapters.b(Adapters.c(CallToAction.f20670a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        bool = bool2;
                        bool3 = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Boolean bool4 = bool2;
                        if (str == null) {
                            Assertions.a(reader, "iconUrl");
                            throw null;
                        }
                        if (headerImage == null) {
                            Assertions.a(reader, "headerImage");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (bool4 == null) {
                            Assertions.a(reader, "showAnimation");
                            throw null;
                        }
                        boolean zBooleanValue = bool4.booleanValue();
                        if (str3 == null) {
                            Assertions.a(reader, "content");
                            throw null;
                        }
                        if (button == null) {
                            Assertions.a(reader, "button");
                            throw null;
                        }
                        if (str4 != null) {
                            return new RedemptionUnlockMutation.RewardsRedemptionUnlock(str, headerImage, str2, zBooleanValue, str3, button, str4, callToAction, bool3);
                        }
                        Assertions.a(reader, "analyticsLabel");
                        throw null;
                }
                bool2 = bool;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RedemptionUnlockMutation.RewardsRedemptionUnlock value = (RedemptionUnlockMutation.RewardsRedemptionUnlock) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("iconUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20651a);
            writer.F1("headerImage");
            Adapters.c(HeaderImage.f20672a, false).toJson(writer, customScalarAdapters, value.b);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("showAnimation");
            d.B(value.d, Adapters.f, writer, customScalarAdapters, "content");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("button");
            Adapters.c(Button.f20669a, false).toJson(writer, customScalarAdapters, value.f);
            writer.F1("analyticsLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.g);
            writer.F1("callToAction");
            Adapters.b(Adapters.c(CallToAction.f20670a, false)).toJson(writer, customScalarAdapters, value.h);
            writer.F1("showUnlock");
            Adapters.l.toJson(writer, customScalarAdapters, value.i);
        }
    }
}
