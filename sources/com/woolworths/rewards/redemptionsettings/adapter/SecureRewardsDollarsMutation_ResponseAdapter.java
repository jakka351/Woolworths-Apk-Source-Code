package com.woolworths.rewards.redemptionsettings.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.redemptionsettings.SecureRewardsDollarsMutation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/adapter/SecureRewardsDollarsMutation_ResponseAdapter;", "", "Data", "SecureRewardsDollars", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SecureRewardsDollarsMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/adapter/SecureRewardsDollarsMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/redemptionsettings/SecureRewardsDollarsMutation$Data;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<SecureRewardsDollarsMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f21093a = new Data();
        public static final List b = CollectionsKt.Q("secureRewardsDollars");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            SecureRewardsDollarsMutation.SecureRewardsDollars secureRewardsDollars = null;
            while (reader.o2(b) == 0) {
                secureRewardsDollars = (SecureRewardsDollarsMutation.SecureRewardsDollars) Adapters.b(Adapters.c(SecureRewardsDollars.f21094a, false)).fromJson(reader, customScalarAdapters);
            }
            return new SecureRewardsDollarsMutation.Data(secureRewardsDollars);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SecureRewardsDollarsMutation.Data value = (SecureRewardsDollarsMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("secureRewardsDollars");
            Adapters.b(Adapters.c(SecureRewardsDollars.f21094a, false)).toJson(writer, customScalarAdapters, value.f21081a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/adapter/SecureRewardsDollarsMutation_ResponseAdapter$SecureRewardsDollars;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/redemptionsettings/SecureRewardsDollarsMutation$SecureRewardsDollars;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SecureRewardsDollars implements Adapter<SecureRewardsDollarsMutation.SecureRewardsDollars> {

        /* renamed from: a, reason: collision with root package name */
        public static final SecureRewardsDollars f21094a = new SecureRewardsDollars();
        public static final List b = CollectionsKt.R("success", "message");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (bool != null) {
                return new SecureRewardsDollarsMutation.SecureRewardsDollars(bool.booleanValue(), str);
            }
            Assertions.a(reader, "success");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SecureRewardsDollarsMutation.SecureRewardsDollars value = (SecureRewardsDollarsMutation.SecureRewardsDollars) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("success");
            d.B(value.f21082a, Adapters.f, writer, customScalarAdapters, "message");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }
}
