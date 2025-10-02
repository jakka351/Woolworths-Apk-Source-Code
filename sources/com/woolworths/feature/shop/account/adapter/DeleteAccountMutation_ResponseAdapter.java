package com.woolworths.feature.shop.account.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.account.DeleteAccountMutation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/DeleteAccountMutation_ResponseAdapter;", "", "Data", "DeleteAccount", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeleteAccountMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/DeleteAccountMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/DeleteAccountMutation$Data;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<DeleteAccountMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f19384a = new Data();
        public static final List b = CollectionsKt.Q("deleteAccount");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            DeleteAccountMutation.DeleteAccount deleteAccount = null;
            while (reader.o2(b) == 0) {
                deleteAccount = (DeleteAccountMutation.DeleteAccount) Adapters.c(DeleteAccount.f19385a, false).fromJson(reader, customScalarAdapters);
            }
            if (deleteAccount != null) {
                return new DeleteAccountMutation.Data(deleteAccount);
            }
            Assertions.a(reader, "deleteAccount");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeleteAccountMutation.Data value = (DeleteAccountMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("deleteAccount");
            Adapters.c(DeleteAccount.f19385a, false).toJson(writer, customScalarAdapters, value.f19341a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/account/adapter/DeleteAccountMutation_ResponseAdapter$DeleteAccount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/account/DeleteAccountMutation$DeleteAccount;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeleteAccount implements Adapter<DeleteAccountMutation.DeleteAccount> {

        /* renamed from: a, reason: collision with root package name */
        public static final DeleteAccount f19385a = new DeleteAccount();
        public static final List b = CollectionsKt.Q("success");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            while (reader.o2(b) == 0) {
                bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
            }
            if (bool != null) {
                return new DeleteAccountMutation.DeleteAccount(bool.booleanValue());
            }
            Assertions.a(reader, "success");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeleteAccountMutation.DeleteAccount value = (DeleteAccountMutation.DeleteAccount) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("success");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.f19342a));
        }
    }
}
