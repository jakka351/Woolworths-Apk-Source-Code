package au.com.woolworths.rewards.base;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.rewards.base.adapter.FetchFeatureAccesslistQuery_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/rewards/base/FetchFeatureAccesslistQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/rewards/base/FetchFeatureAccesslistQuery$Data;", "Data", "Companion", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FetchFeatureAccesslistQuery implements Query<Data> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/rewards/base/FetchFeatureAccesslistQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/base/FetchFeatureAccesslistQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f9348a;
        public final ArrayList b;

        public Data(ArrayList arrayList, ArrayList arrayList2) {
            this.f9348a = arrayList;
            this.b = arrayList2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return this.f9348a.equals(data.f9348a) && this.b.equals(data.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f9348a.hashCode() * 31);
        }

        public final String toString() {
            return "Data(featureAccessList=" + this.f9348a + ", allFeaturesInAccessList=" + this.b + ")";
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(FetchFeatureAccesslistQuery_ResponseAdapter.Data.f9354a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query FetchFeatureAccesslist { featureAccessList allFeaturesInAccessList }";
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == FetchFeatureAccesslistQuery.class;
    }

    public final int hashCode() {
        return Reflection.f24268a.b(FetchFeatureAccesslistQuery.class).hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "76d7d0a89a8b48dab2967c39b64d31e8a3166bebba406205b491e3e3ae8e71a0";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "FetchFeatureAccesslist";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
    }
}
