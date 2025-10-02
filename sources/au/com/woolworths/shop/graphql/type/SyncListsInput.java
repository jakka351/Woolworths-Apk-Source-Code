package au.com.woolworths.shop.graphql.type;

import androidx.compose.ui.input.pointer.a;
import com.apollographql.apollo.api.Optional;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/SyncListsInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SyncListsInput {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f11956a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;

    public SyncListsInput(Optional optional, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f11956a = optional;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = arrayList4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyncListsInput)) {
            return false;
        }
        SyncListsInput syncListsInput = (SyncListsInput) obj;
        return this.f11956a.equals(syncListsInput.f11956a) && this.b.equals(syncListsInput.b) && this.c.equals(syncListsInput.c) && this.d.equals(syncListsInput.d) && this.e.equals(syncListsInput.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + a.b(a.b(a.b(this.f11956a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SyncListsInput(options=");
        sb.append(this.f11956a);
        sb.append(", localLists=");
        sb.append(this.b);
        sb.append(", createdLists=");
        sb.append(this.c);
        sb.append(", updatedLists=");
        sb.append(this.d);
        sb.append(", deletedLists=");
        return android.support.v4.media.session.a.q(")", sb, this.e);
    }
}
