package au.com.woolworths.shop.graphql.type;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/DeepLinkInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeepLinkInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f11307a;
    public final ShoppingModeType b;
    public final Optional.Present c;
    public final java.util.List d;

    public DeepLinkInput(String id, ShoppingModeType mode, Optional.Present present, java.util.List list) {
        Intrinsics.h(id, "id");
        Intrinsics.h(mode, "mode");
        this.f11307a = id;
        this.b = mode;
        this.c = present;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeepLinkInput)) {
            return false;
        }
        DeepLinkInput deepLinkInput = (DeepLinkInput) obj;
        return Intrinsics.c(this.f11307a, deepLinkInput.f11307a) && this.b == deepLinkInput.b && this.c.equals(deepLinkInput.c) && this.d.equals(deepLinkInput.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a.b(this.c, (this.b.hashCode() + (this.f11307a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "DeepLinkInput(id=" + this.f11307a + ", mode=" + this.b + ", storeId=" + this.c + ", supportedLinks=" + this.d + ")";
    }
}
