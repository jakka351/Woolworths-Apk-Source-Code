package com.woolworths.feature.shop.wpay.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.wpay.LinkPayPalQuery;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/LinkPayPalQuery_ResponseAdapter;", "", "Data", "LinkPayPal", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LinkPayPalQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/LinkPayPalQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/LinkPayPalQuery$Data;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<LinkPayPalQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20423a = new Data();
        public static final List b = CollectionsKt.Q("linkPayPal");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            LinkPayPalQuery.LinkPayPal linkPayPal = null;
            while (reader.o2(b) == 0) {
                linkPayPal = (LinkPayPalQuery.LinkPayPal) Adapters.c(LinkPayPal.f20424a, false).fromJson(reader, customScalarAdapters);
            }
            if (linkPayPal != null) {
                return new LinkPayPalQuery.Data(linkPayPal);
            }
            Assertions.a(reader, "linkPayPal");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            LinkPayPalQuery.Data value = (LinkPayPalQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("linkPayPal");
            Adapters.c(LinkPayPal.f20424a, false).toJson(writer, customScalarAdapters, value.f20365a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/LinkPayPalQuery_ResponseAdapter$LinkPayPal;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/LinkPayPalQuery$LinkPayPal;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LinkPayPal implements Adapter<LinkPayPalQuery.LinkPayPal> {

        /* renamed from: a, reason: collision with root package name */
        public static final LinkPayPal f20424a = new LinkPayPal();
        public static final List b = CollectionsKt.R("id", "url", "redirectUrl");

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
                Assertions.a(reader, "id");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "url");
                throw null;
            }
            if (str3 != null) {
                return new LinkPayPalQuery.LinkPayPal(str, str2, str3);
            }
            Assertions.a(reader, "redirectUrl");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            LinkPayPalQuery.LinkPayPal value = (LinkPayPalQuery.LinkPayPal) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20366a);
            writer.F1("url");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("redirectUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }
}
