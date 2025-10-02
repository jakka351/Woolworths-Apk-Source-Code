package au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment;

import au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment.NotificationMessage;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/fragment/NotificationMessageImpl_ResponseAdapter;", "", "NotificationMessage", "Cta", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationMessageImpl_ResponseAdapter {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/fragment/NotificationMessageImpl_ResponseAdapter$Cta;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/fragment/NotificationMessage$Cta;", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Cta implements Adapter<NotificationMessage.Cta> {

        /* renamed from: a, reason: collision with root package name */
        public static final Cta f8468a = new Cta();
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
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (str2 != null) {
                return new NotificationMessage.Cta(str, str2);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            NotificationMessage.Cta value = (NotificationMessage.Cta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f8467a);
            writer.F1("url");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/fragment/NotificationMessageImpl_ResponseAdapter$NotificationMessage;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/fragment/NotificationMessage;", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NotificationMessage implements Adapter<au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment.NotificationMessage> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f8469a = CollectionsKt.R("id", "campaignCode", "campaignVariant", "title", "body", "cta", "createdOn", "ttl");

        public static au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment.NotificationMessage a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            NotificationMessage.Cta cta = null;
            String str6 = null;
            String str7 = null;
            while (true) {
                switch (reader.o2(f8469a)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        cta = (NotificationMessage.Cta) Adapters.b(Adapters.c(Cta.f8468a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str6 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        str7 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "id");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "campaignCode");
                            throw null;
                        }
                        if (str6 == null) {
                            Assertions.a(reader, "createdOn");
                            throw null;
                        }
                        if (str7 != null) {
                            return new au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment.NotificationMessage(str, str2, str3, str4, str5, cta, str6, str7);
                        }
                        Assertions.a(reader, "ttl");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment.NotificationMessage value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f8466a);
            writer.F1("campaignCode");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("campaignVariant");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("title");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("body");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("cta");
            Adapters.b(Adapters.c(Cta.f8468a, false)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("createdOn");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.g);
            writer.F1("ttl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.h);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment.NotificationMessage) obj);
        }
    }
}
