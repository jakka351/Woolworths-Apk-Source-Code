package au.com.woolworths.shop.buyagain.domain;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.shopapp.modules.text.TextWithAltApiData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/domain/BuyAgainChip;", "", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BuyAgainChip {

    /* renamed from: a, reason: collision with root package name */
    public final String f10251a;
    public final TextWithAltApiData b;
    public final boolean c;
    public final Integer d;

    public BuyAgainChip(String str, TextWithAltApiData textWithAltApiData, boolean z, Integer num) {
        this.f10251a = str;
        this.b = textWithAltApiData;
        this.c = z;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuyAgainChip)) {
            return false;
        }
        BuyAgainChip buyAgainChip = (BuyAgainChip) obj;
        return Intrinsics.c(this.f10251a, buyAgainChip.f10251a) && Intrinsics.c(this.b, buyAgainChip.b) && this.c == buyAgainChip.c && Intrinsics.c(this.d, buyAgainChip.d);
    }

    public final int hashCode() {
        int iE = b.e((this.b.hashCode() + (this.f10251a.hashCode() * 31)) * 31, 31, this.c);
        Integer num = this.d;
        return iE + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "BuyAgainChip(id=" + this.f10251a + ", text=" + this.b + ", isSelected=" + this.c + ", count=" + this.d + ")";
    }
}
