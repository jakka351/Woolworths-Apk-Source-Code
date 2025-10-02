package au.com.woolworths.shop.graphql.type;

import YU.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/SearchedProductInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SearchedProductInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f11889a;
    public final String b;

    public SearchedProductInput(String listItemId, String text) {
        Intrinsics.h(listItemId, "listItemId");
        Intrinsics.h(text, "text");
        this.f11889a = listItemId;
        this.b = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchedProductInput)) {
            return false;
        }
        SearchedProductInput searchedProductInput = (SearchedProductInput) obj;
        return Intrinsics.c(this.f11889a, searchedProductInput.f11889a) && Intrinsics.c(this.b, searchedProductInput.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11889a.hashCode() * 31);
    }

    public final String toString() {
        return a.j("SearchedProductInput(listItemId=", this.f11889a, ", text=", this.b, ")");
    }
}
