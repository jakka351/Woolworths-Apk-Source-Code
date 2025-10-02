package au.com.woolworths.shop.graphql.type.adapter;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.shop.graphql.type.ToggleOrderLeaveUnattendedReason;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/adapter/ToggleOrderLeaveUnattendedReason_ResponseAdapter;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/graphql/type/ToggleOrderLeaveUnattendedReason;", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ToggleOrderLeaveUnattendedReason_ResponseAdapter implements Adapter<ToggleOrderLeaveUnattendedReason> {

    /* renamed from: a, reason: collision with root package name */
    public static final ToggleOrderLeaveUnattendedReason_ResponseAdapter f12129a = new ToggleOrderLeaveUnattendedReason_ResponseAdapter();

    @Override // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
        Object next;
        String strD = a.d(jsonReader, "reader", customScalarAdapters, "customScalarAdapters");
        ToggleOrderLeaveUnattendedReason.e.getClass();
        Iterator it = ((AbstractList) ToggleOrderLeaveUnattendedReason.j).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ToggleOrderLeaveUnattendedReason) next).d.equals(strD)) {
                break;
            }
        }
        ToggleOrderLeaveUnattendedReason toggleOrderLeaveUnattendedReason = (ToggleOrderLeaveUnattendedReason) next;
        return toggleOrderLeaveUnattendedReason == null ? ToggleOrderLeaveUnattendedReason.h : toggleOrderLeaveUnattendedReason;
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
        ToggleOrderLeaveUnattendedReason value = (ToggleOrderLeaveUnattendedReason) obj;
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Intrinsics.h(value, "value");
        writer.v0(value.d);
    }
}
