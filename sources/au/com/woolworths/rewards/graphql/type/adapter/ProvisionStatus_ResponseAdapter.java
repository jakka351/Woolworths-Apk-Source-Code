package au.com.woolworths.rewards.graphql.type.adapter;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.rewards.graphql.type.ProvisionStatus;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/adapter/ProvisionStatus_ResponseAdapter;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/rewards/graphql/type/ProvisionStatus;", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProvisionStatus_ResponseAdapter implements Adapter<ProvisionStatus> {
    @Override // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
        Object next;
        String strD = a.d(jsonReader, "reader", customScalarAdapters, "customScalarAdapters");
        ProvisionStatus.e.getClass();
        Iterator it = ((AbstractList) ProvisionStatus.h).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ProvisionStatus) next).d.equals(strD)) {
                break;
            }
        }
        ProvisionStatus provisionStatus = (ProvisionStatus) next;
        return provisionStatus == null ? ProvisionStatus.f : provisionStatus;
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
        ProvisionStatus value = (ProvisionStatus) obj;
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Intrinsics.h(value, "value");
        writer.v0(value.d);
    }
}
