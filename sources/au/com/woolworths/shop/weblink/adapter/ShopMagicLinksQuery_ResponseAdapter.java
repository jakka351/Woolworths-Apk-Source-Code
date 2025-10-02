package au.com.woolworths.shop.weblink.adapter;

import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.weblink.ShopMagicLinksQuery;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.salesforce.marketingcloud.config.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/weblink/adapter/ShopMagicLinksQuery_ResponseAdapter;", "", "Data", "MagicLink", "Cooky", "Header", "web-link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShopMagicLinksQuery_ResponseAdapter {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/weblink/adapter/ShopMagicLinksQuery_ResponseAdapter$Cooky;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/weblink/ShopMagicLinksQuery$Cooky;", "web-link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Cooky implements Adapter<ShopMagicLinksQuery.Cooky> {

        /* renamed from: a, reason: collision with root package name */
        public static final Cooky f12949a = new Cooky();
        public static final List b = CollectionsKt.R(AppMeasurementSdk.ConditionalUserProperty.NAME, "value", "domain", a.j, "maxAge", "httpOnly", "secure");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        num = num2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        num = num2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        num = num2;
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        num = num2;
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        continue;
                    case 5:
                        num = num2;
                        bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        num = num2;
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Integer num3 = num2;
                        if (str == null) {
                            Assertions.a(reader, AppMeasurementSdk.ConditionalUserProperty.NAME);
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "value");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "domain");
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, a.j);
                            throw null;
                        }
                        if (num3 == null) {
                            Assertions.a(reader, "maxAge");
                            throw null;
                        }
                        Boolean bool3 = bool;
                        int iIntValue = num3.intValue();
                        if (bool3 == null) {
                            Assertions.a(reader, "httpOnly");
                            throw null;
                        }
                        Boolean bool4 = bool2;
                        boolean zBooleanValue = bool3.booleanValue();
                        if (bool4 != null) {
                            return new ShopMagicLinksQuery.Cooky(str, str2, str3, str4, iIntValue, zBooleanValue, bool4.booleanValue());
                        }
                        Assertions.a(reader, "secure");
                        throw null;
                }
                num2 = num;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShopMagicLinksQuery.Cooky value = (ShopMagicLinksQuery.Cooky) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AppMeasurementSdk.ConditionalUserProperty.NAME);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f12945a);
            writer.F1("value");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("domain");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1(a.j);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("maxAge");
            d.y(value.e, Adapters.b, writer, customScalarAdapters, "httpOnly");
            Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
            d.B(value.f, adapters$BooleanAdapter$1, writer, customScalarAdapters, "secure");
            adapters$BooleanAdapter$1.toJson(writer, customScalarAdapters, Boolean.valueOf(value.g));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/weblink/adapter/ShopMagicLinksQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/weblink/ShopMagicLinksQuery$Data;", "web-link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<ShopMagicLinksQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f12950a = new Data();
        public static final List b = CollectionsKt.Q("magicLink");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ShopMagicLinksQuery.MagicLink magicLink = null;
            while (reader.o2(b) == 0) {
                magicLink = (ShopMagicLinksQuery.MagicLink) Adapters.c(MagicLink.f12952a, false).fromJson(reader, customScalarAdapters);
            }
            if (magicLink != null) {
                return new ShopMagicLinksQuery.Data(magicLink);
            }
            Assertions.a(reader, "magicLink");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShopMagicLinksQuery.Data value = (ShopMagicLinksQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("magicLink");
            Adapters.c(MagicLink.f12952a, false).toJson(writer, customScalarAdapters, value.f12946a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/weblink/adapter/ShopMagicLinksQuery_ResponseAdapter$Header;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/weblink/ShopMagicLinksQuery$Header;", "web-link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Header implements Adapter<ShopMagicLinksQuery.Header> {

        /* renamed from: a, reason: collision with root package name */
        public static final Header f12951a = new Header();
        public static final List b = CollectionsKt.R("key", "value");

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
                Assertions.a(reader, "key");
                throw null;
            }
            if (str2 != null) {
                return new ShopMagicLinksQuery.Header(str, str2);
            }
            Assertions.a(reader, "value");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShopMagicLinksQuery.Header value = (ShopMagicLinksQuery.Header) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("key");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f12947a);
            writer.F1("value");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/weblink/adapter/ShopMagicLinksQuery_ResponseAdapter$MagicLink;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/weblink/ShopMagicLinksQuery$MagicLink;", "web-link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MagicLink implements Adapter<ShopMagicLinksQuery.MagicLink> {

        /* renamed from: a, reason: collision with root package name */
        public static final MagicLink f12952a = new MagicLink();
        public static final List b = CollectionsKt.R("title", "url", "cookies", "headers");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            ArrayList arrayListFromJson2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    arrayListFromJson = Adapters.a(Adapters.c(Cooky.f12949a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    arrayListFromJson2 = Adapters.a(Adapters.c(Header.f12951a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "url");
                throw null;
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "cookies");
                throw null;
            }
            if (arrayListFromJson2 != null) {
                return new ShopMagicLinksQuery.MagicLink(str, str2, arrayListFromJson, arrayListFromJson2);
            }
            Assertions.a(reader, "headers");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ShopMagicLinksQuery.MagicLink value = (ShopMagicLinksQuery.MagicLink) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f12948a);
            writer.F1("url");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("cookies");
            Adapters.a(Adapters.c(Cooky.f12949a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("headers");
            Adapters.a(Adapters.c(Header.f12951a, false)).toJson(writer, customScalarAdapters, value.d);
        }
    }
}
