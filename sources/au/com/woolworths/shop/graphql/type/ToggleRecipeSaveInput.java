package au.com.woolworths.shop.graphql.type;

import au.com.woolworths.android.onesite.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ToggleRecipeSaveInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ToggleRecipeSaveInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f11972a;
    public final boolean b;

    public ToggleRecipeSaveInput(String id, boolean z) {
        Intrinsics.h(id, "id");
        this.f11972a = id;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToggleRecipeSaveInput)) {
            return false;
        }
        ToggleRecipeSaveInput toggleRecipeSaveInput = (ToggleRecipeSaveInput) obj;
        return Intrinsics.c(this.f11972a, toggleRecipeSaveInput.f11972a) && this.b == toggleRecipeSaveInput.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f11972a.hashCode() * 31);
    }

    public final String toString() {
        return a.j("ToggleRecipeSaveInput(id=", this.f11972a, ", enabled=", this.b, ")");
    }
}
