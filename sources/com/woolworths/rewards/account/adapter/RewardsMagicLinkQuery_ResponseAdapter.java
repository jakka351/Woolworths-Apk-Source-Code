package com.woolworths.rewards.account.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.account.RewardsMagicLinkQuery;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/rewards/account/adapter/RewardsMagicLinkQuery_ResponseAdapter;", "", "Data", "RewardsMagicLink", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RewardsMagicLinkQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/RewardsMagicLinkQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/RewardsMagicLinkQuery$Data;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<RewardsMagicLinkQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20636a = new Data();
        public static final List b = CollectionsKt.Q("rewardsMagicLink");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            RewardsMagicLinkQuery.RewardsMagicLink rewardsMagicLink = null;
            while (reader.o2(b) == 0) {
                rewardsMagicLink = (RewardsMagicLinkQuery.RewardsMagicLink) Adapters.b(Adapters.c(RewardsMagicLink.f20637a, false)).fromJson(reader, customScalarAdapters);
            }
            return new RewardsMagicLinkQuery.Data(rewardsMagicLink);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsMagicLinkQuery.Data value = (RewardsMagicLinkQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("rewardsMagicLink");
            Adapters.b(Adapters.c(RewardsMagicLink.f20637a, false)).toJson(writer, customScalarAdapters, value.f20564a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/account/adapter/RewardsMagicLinkQuery_ResponseAdapter$RewardsMagicLink;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/account/RewardsMagicLinkQuery$RewardsMagicLink;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsMagicLink implements Adapter<RewardsMagicLinkQuery.RewardsMagicLink> {

        /* renamed from: a, reason: collision with root package name */
        public static final RewardsMagicLink f20637a = new RewardsMagicLink();
        public static final List b = CollectionsKt.R("url", AnnotatedPrivateKey.LABEL);

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
                Assertions.a(reader, "url");
                throw null;
            }
            if (str2 != null) {
                return new RewardsMagicLinkQuery.RewardsMagicLink(str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsMagicLinkQuery.RewardsMagicLink value = (RewardsMagicLinkQuery.RewardsMagicLink) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20565a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }
}
