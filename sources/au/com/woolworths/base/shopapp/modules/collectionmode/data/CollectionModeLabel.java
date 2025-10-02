package au.com.woolworths.base.shopapp.modules.collectionmode.data;

import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/collectionmode/data/CollectionModeLabel;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CollectionModeLabel {

    /* renamed from: a, reason: collision with root package name */
    public final CollectionMode f4625a;
    public final String b;

    public CollectionModeLabel(CollectionMode collectionMode, String str) {
        Intrinsics.h(collectionMode, "collectionMode");
        this.f4625a = collectionMode;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionModeLabel)) {
            return false;
        }
        CollectionModeLabel collectionModeLabel = (CollectionModeLabel) obj;
        return Intrinsics.c(this.f4625a, collectionModeLabel.f4625a) && Intrinsics.c(this.b, collectionModeLabel.b);
    }

    public final int hashCode() {
        int iHashCode = this.f4625a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CollectionModeLabel(collectionMode=" + this.f4625a + ", pickUpOptionLabel=" + this.b + ")";
    }
}
