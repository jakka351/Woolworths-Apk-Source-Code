package au.com.woolworths.shop.graphql.type;

import androidx.camera.core.impl.b;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ContentPageExtraInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ContentPageExtraInput {

    /* renamed from: a, reason: collision with root package name */
    public final ShoppingModeType f11285a;
    public final Optional b;
    public final java.util.List c;
    public final Optional d;

    public ContentPageExtraInput(ShoppingModeType mode, Optional optional, java.util.List list, Optional optional2) {
        Intrinsics.h(mode, "mode");
        this.f11285a = mode;
        this.b = optional;
        this.c = list;
        this.d = optional2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPageExtraInput)) {
            return false;
        }
        ContentPageExtraInput contentPageExtraInput = (ContentPageExtraInput) obj;
        if (this.f11285a != contentPageExtraInput.f11285a || !this.b.equals(contentPageExtraInput.b)) {
            return false;
        }
        EmptyList emptyList = EmptyList.d;
        return emptyList.equals(emptyList) && this.c.equals(contentPageExtraInput.c) && this.d.equals(contentPageExtraInput.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + b.d((((this.b.hashCode() + (this.f11285a.hashCode() * 31)) * 31) + 1) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentPageExtraInput(mode=");
        sb.append(this.f11285a);
        sb.append(", storeId=");
        sb.append(this.b);
        sb.append(", supportedActions=");
        sb.append(EmptyList.d);
        sb.append(", supportedLinks=");
        sb.append(this.c);
        sb.append(", pageNumber=");
        return a.o(sb, this.d, ")");
    }
}
