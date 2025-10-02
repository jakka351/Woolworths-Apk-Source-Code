package com.woolworths.rewards.account.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.account.DeleteAccountPageQuery;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/rewards/account/adapter/DeleteAccountPageQuery_ResponseAdapter;", "", "Data", "DeleteAccountPage", "PrimaryCta", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeleteAccountPageQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/DeleteAccountPageQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/DeleteAccountPageQuery$Data;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<DeleteAccountPageQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20613a = new Data();
        public static final List b = CollectionsKt.Q("deleteAccountPage");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            DeleteAccountPageQuery.DeleteAccountPage deleteAccountPage = null;
            while (reader.o2(b) == 0) {
                deleteAccountPage = (DeleteAccountPageQuery.DeleteAccountPage) Adapters.b(Adapters.c(DeleteAccountPage.f20614a, false)).fromJson(reader, customScalarAdapters);
            }
            return new DeleteAccountPageQuery.Data(deleteAccountPage);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeleteAccountPageQuery.Data value = (DeleteAccountPageQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("deleteAccountPage");
            Adapters.b(Adapters.c(DeleteAccountPage.f20614a, false)).toJson(writer, customScalarAdapters, value.f20538a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/DeleteAccountPageQuery_ResponseAdapter$DeleteAccountPage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/DeleteAccountPageQuery$DeleteAccountPage;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeleteAccountPage implements Adapter<DeleteAccountPageQuery.DeleteAccountPage> {

        /* renamed from: a, reason: collision with root package name */
        public static final DeleteAccountPage f20614a = new DeleteAccountPage();
        public static final List b = CollectionsKt.R("navigationTitle", "title", "markdownDescription", "primaryCta", "consentLabel", "consentToken");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            DeleteAccountPageQuery.PrimaryCta primaryCta = null;
            String str4 = null;
            String str5 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    primaryCta = (DeleteAccountPageQuery.PrimaryCta) Adapters.c(PrimaryCta.f20615a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "navigationTitle");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "markdownDescription");
                throw null;
            }
            if (primaryCta == null) {
                Assertions.a(reader, "primaryCta");
                throw null;
            }
            if (str4 == null) {
                Assertions.a(reader, "consentLabel");
                throw null;
            }
            if (str5 != null) {
                return new DeleteAccountPageQuery.DeleteAccountPage(str, str2, str3, primaryCta, str4, str5);
            }
            Assertions.a(reader, "consentToken");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeleteAccountPageQuery.DeleteAccountPage value = (DeleteAccountPageQuery.DeleteAccountPage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("navigationTitle");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20539a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("markdownDescription");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("primaryCta");
            Adapters.c(PrimaryCta.f20615a, false).toJson(writer, customScalarAdapters, value.d);
            writer.F1("consentLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("consentToken");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/DeleteAccountPageQuery_ResponseAdapter$PrimaryCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/DeleteAccountPageQuery$PrimaryCta;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PrimaryCta implements Adapter<DeleteAccountPageQuery.PrimaryCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final PrimaryCta f20615a = new PrimaryCta();
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
                return new DeleteAccountPageQuery.PrimaryCta(str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeleteAccountPageQuery.PrimaryCta value = (DeleteAccountPageQuery.PrimaryCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20540a);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }
}
