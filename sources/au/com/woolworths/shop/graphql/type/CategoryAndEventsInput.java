package au.com.woolworths.shop.graphql.type;

import android.support.v4.media.session.a;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CategoryAndEventsInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CategoryAndEventsInput {

    /* renamed from: a, reason: collision with root package name */
    public final Optional.Present f11168a;
    public final ShoppingModeType b;
    public final Optional.Present c;
    public final java.util.List d;

    public CategoryAndEventsInput(Optional.Present present, ShoppingModeType mode, Optional.Present present2, java.util.List list) {
        Intrinsics.h(mode, "mode");
        this.f11168a = present;
        this.b = mode;
        this.c = present2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryAndEventsInput)) {
            return false;
        }
        CategoryAndEventsInput categoryAndEventsInput = (CategoryAndEventsInput) obj;
        if (!this.f11168a.equals(categoryAndEventsInput.f11168a) || this.b != categoryAndEventsInput.b || !this.c.equals(categoryAndEventsInput.c)) {
            return false;
        }
        EmptyList emptyList = EmptyList.d;
        return emptyList.equals(emptyList) && this.d.equals(categoryAndEventsInput.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((((this.c.hashCode() + ((this.b.hashCode() + (this.f11168a.hashCode() * 31)) * 31)) * 31) + 1) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CategoryAndEventsInput(id=");
        sb.append(this.f11168a);
        sb.append(", mode=");
        sb.append(this.b);
        sb.append(", storeId=");
        sb.append(this.c);
        sb.append(", supportedActions=");
        sb.append(EmptyList.d);
        sb.append(", supportedLinks=");
        return a.t(sb, this.d, ")");
    }
}
