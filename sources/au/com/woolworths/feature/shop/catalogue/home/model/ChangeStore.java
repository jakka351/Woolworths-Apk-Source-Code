package au.com.woolworths.feature.shop.catalogue.home.model;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/home/model/ChangeStore;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ChangeStore {

    /* renamed from: a, reason: collision with root package name */
    public final String f6857a;
    public final String b;
    public final ButtonApiData c;

    public ChangeStore(String str, String str2, ButtonApiData buttonApiData) {
        this.f6857a = str;
        this.b = str2;
        this.c = buttonApiData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeStore)) {
            return false;
        }
        ChangeStore changeStore = (ChangeStore) obj;
        return Intrinsics.c(this.f6857a, changeStore.f6857a) && Intrinsics.c(this.b, changeStore.b) && Intrinsics.c(this.c, changeStore.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b.c(this.f6857a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbV = a.v("ChangeStore(storeName=", this.f6857a, ", postcode=", this.b, ", button=");
        sbV.append(this.c);
        sbV.append(")");
        return sbV.toString();
    }
}
