package com.woolworths.rewards.offers.spinsurprise;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.offers.spinsurprise.adapter.SpinSurpriseLinksQuery_ResponseAdapter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/offers/spinsurprise/SpinSurpriseLinksQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/rewards/offers/spinsurprise/SpinSurpriseLinksQuery$Data;", "Data", "SpinSurpriseLinks", "Companion", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SpinSurpriseLinksQuery implements Query<Data> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/offers/spinsurprise/SpinSurpriseLinksQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/spinsurprise/SpinSurpriseLinksQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final SpinSurpriseLinks f21052a;

        public Data(SpinSurpriseLinks spinSurpriseLinks) {
            this.f21052a = spinSurpriseLinks;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21052a, ((Data) obj).f21052a);
        }

        public final int hashCode() {
            SpinSurpriseLinks spinSurpriseLinks = this.f21052a;
            if (spinSurpriseLinks == null) {
                return 0;
            }
            return spinSurpriseLinks.hashCode();
        }

        public final String toString() {
            return "Data(spinSurpriseLinks=" + this.f21052a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/spinsurprise/SpinSurpriseLinksQuery$SpinSurpriseLinks;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SpinSurpriseLinks {

        /* renamed from: a, reason: collision with root package name */
        public final String f21053a;
        public final ArrayList b;

        public SpinSurpriseLinks(String str, ArrayList arrayList) {
            this.f21053a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpinSurpriseLinks)) {
                return false;
            }
            SpinSurpriseLinks spinSurpriseLinks = (SpinSurpriseLinks) obj;
            return this.f21053a.equals(spinSurpriseLinks.f21053a) && this.b.equals(spinSurpriseLinks.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21053a.hashCode() * 31);
        }

        public final String toString() {
            return d.q("SpinSurpriseLinks(initialUrl=", this.f21053a, ", internalUrls=", ")", this.b);
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(SpinSurpriseLinksQuery_ResponseAdapter.Data.f21054a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query SpinSurpriseLinks { spinSurpriseLinks { initialUrl internalUrls } }";
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == SpinSurpriseLinksQuery.class;
    }

    public final int hashCode() {
        return Reflection.f24268a.b(SpinSurpriseLinksQuery.class).hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "4ef65933e6b1438dfca163d699621fa43ec4eaf6713059dc2c44f24b9a0e9313";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "SpinSurpriseLinks";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
    }
}
