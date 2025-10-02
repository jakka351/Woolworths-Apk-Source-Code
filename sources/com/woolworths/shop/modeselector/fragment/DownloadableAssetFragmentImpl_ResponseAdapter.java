package com.woolworths.shop.modeselector.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.DownloadableAssetFit;
import au.com.woolworths.shop.graphql.type.DownloadableAssetType;
import au.com.woolworths.shop.graphql.type.adapter.DownloadableAssetFit_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.DownloadableAssetType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$IntAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/fragment/DownloadableAssetFragmentImpl_ResponseAdapter;", "", "DownloadableAssetFragment", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DownloadableAssetFragmentImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/modeselector/fragment/DownloadableAssetFragmentImpl_ResponseAdapter$DownloadableAssetFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/modeselector/fragment/DownloadableAssetFragment;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DownloadableAssetFragment implements Adapter<com.woolworths.shop.modeselector.fragment.DownloadableAssetFragment> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23353a = CollectionsKt.R("assetType", "assetUrl", "assetWidth", "assetHeight", "fit", "altText");

        public static com.woolworths.shop.modeselector.fragment.DownloadableAssetFragment a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
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
                int iO2 = reader.o2(f23353a);
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
                        downloadableAssetFit = (DownloadableAssetFit) Adapters.b(DownloadableAssetFit_ResponseAdapter.f12070a).fromJson(reader, customScalarAdapters);
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
                return new com.woolworths.shop.modeselector.fragment.DownloadableAssetFragment(downloadableAssetTypeA, str, iIntValue, num5.intValue(), downloadableAssetFit, str2);
            }
            Assertions.a(reader, "assetHeight");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, com.woolworths.shop.modeselector.fragment.DownloadableAssetFragment value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("assetType");
            DownloadableAssetType_ResponseAdapter.b(writer, customScalarAdapters, value.f23352a);
            writer.F1("assetUrl");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("assetWidth");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.c, adapters$IntAdapter$1, writer, customScalarAdapters, "assetHeight");
            d.y(value.d, adapters$IntAdapter$1, writer, customScalarAdapters, "fit");
            Adapters.b(DownloadableAssetFit_ResponseAdapter.f12070a).toJson(writer, customScalarAdapters, value.e);
            writer.F1("altText");
            Adapters.i.toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (com.woolworths.shop.modeselector.fragment.DownloadableAssetFragment) obj);
        }
    }
}
