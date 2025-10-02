package au.com.woolworths.shop.graphql.type;

import androidx.compose.ui.input.pointer.a;
import com.apollographql.apollo.api.Optional;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/NodeInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NodeInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f11617a;
    public final ShoppingModeType b;
    public final Optional c;
    public final ArrayList d;
    public final java.util.List e;

    public NodeInput(String nodeId, ShoppingModeType shoppingModeType, Optional optional, ArrayList arrayList, java.util.List list) {
        Intrinsics.h(nodeId, "nodeId");
        this.f11617a = nodeId;
        this.b = shoppingModeType;
        this.c = optional;
        this.d = arrayList;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NodeInput)) {
            return false;
        }
        NodeInput nodeInput = (NodeInput) obj;
        return Intrinsics.c(this.f11617a, nodeInput.f11617a) && this.b == nodeInput.b && this.c.equals(nodeInput.c) && this.d.equals(nodeInput.d) && this.e.equals(nodeInput.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + a.b(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.c, (this.b.hashCode() + (this.f11617a.hashCode() * 31)) * 31, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NodeInput(nodeId=");
        sb.append(this.f11617a);
        sb.append(", mode=");
        sb.append(this.b);
        sb.append(", storeId=");
        sb.append(this.c);
        sb.append(", supportedActions=");
        sb.append(this.d);
        sb.append(", supportedLinks=");
        return android.support.v4.media.session.a.t(sb, this.e, ")");
    }
}
