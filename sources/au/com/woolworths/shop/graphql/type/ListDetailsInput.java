package au.com.woolworths.shop.graphql.type;

import androidx.camera.core.impl.b;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ListDetailsInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ListDetailsInput {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f11522a;
    public final java.util.List b;
    public final Optional c;

    public ListDetailsInput(Optional optional, java.util.List productItems, Optional optional2) {
        Intrinsics.h(productItems, "productItems");
        this.f11522a = optional;
        this.b = productItems;
        this.c = optional2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListDetailsInput)) {
            return false;
        }
        ListDetailsInput listDetailsInput = (ListDetailsInput) obj;
        return Intrinsics.c(this.f11522a, listDetailsInput.f11522a) && Intrinsics.c(this.b, listDetailsInput.b) && Intrinsics.c(this.c, listDetailsInput.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b.d(this.f11522a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListDetailsInput(storeId=");
        sb.append(this.f11522a);
        sb.append(", productItems=");
        sb.append(this.b);
        sb.append(", listId=");
        return a.o(sb, this.c, ")");
    }
}
