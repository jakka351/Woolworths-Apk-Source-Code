package au.com.woolworths.shop.rewards.priming.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.R;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/rewards/priming/data/TitleItem;", "", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TitleItem {

    /* renamed from: a, reason: collision with root package name */
    public final int f12908a;
    public final int b;

    public TitleItem(int i, int i2) {
        this.f12908a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TitleItem)) {
            return false;
        }
        TitleItem titleItem = (TitleItem) obj;
        return this.f12908a == titleItem.f12908a && this.b == titleItem.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + b.a(this.f12908a, Integer.hashCode(R.drawable.edr_logo) * 31, 31);
    }

    public final String toString() {
        return b.j(this.f12908a, this.b, "TitleItem(logoRes=2131231140, titleRes=", ", subTitleRes=", ")");
    }
}
