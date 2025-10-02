package au.com.woolworths.shop.graphql.type;

import YU.a;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CreateListInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CreateListInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f11298a;
    public final String b;
    public final String c;

    public CreateListInput(String title, String str, String referenceId) {
        Intrinsics.h(title, "title");
        Intrinsics.h(referenceId, "referenceId");
        this.f11298a = title;
        this.b = str;
        this.c = referenceId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateListInput)) {
            return false;
        }
        CreateListInput createListInput = (CreateListInput) obj;
        if (!Intrinsics.c(this.f11298a, createListInput.f11298a) || !this.b.equals(createListInput.b)) {
            return false;
        }
        EmptyList emptyList = EmptyList.d;
        return emptyList.equals(emptyList) && emptyList.equals(emptyList) && Intrinsics.c(this.c, createListInput.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((((((this.b.hashCode() + (this.f11298a.hashCode() * 31)) * 31) + 1) * 31) + 1) * 31);
    }

    public final String toString() {
        StringBuilder sbV = a.v("CreateListInput(title=", this.f11298a, ", color=", this.b, ", productItems=");
        EmptyList emptyList = EmptyList.d;
        sbV.append(emptyList);
        sbV.append(", freeTextItems=");
        sbV.append(emptyList);
        sbV.append(", referenceId=");
        return a.o(sbV, this.c, ")");
    }
}
