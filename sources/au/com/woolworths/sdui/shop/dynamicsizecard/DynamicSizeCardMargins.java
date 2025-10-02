package au.com.woolworths.sdui.shop.dynamicsizecard;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.R;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/shop/dynamicsizecard/DynamicSizeCardMargins;", "", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DynamicSizeCardMargins {

    /* renamed from: a, reason: collision with root package name */
    public final int f10031a;

    public DynamicSizeCardMargins(int i) {
        this.f10031a = (i & 2) != 0 ? R.dimen.half_quarter_margin : R.dimen.default_margin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DynamicSizeCardMargins) && this.f10031a == ((DynamicSizeCardMargins) obj).f10031a;
    }

    public final int hashCode() {
        return Integer.hashCode(R.dimen.default_margin) + b.a(R.dimen.default_margin, b.a(this.f10031a, Integer.hashCode(R.dimen.default_margin) * 31, 31), 31);
    }

    public final String toString() {
        return a.e(this.f10031a, "DynamicSizeCardMargins(leftResId=2131165325, topResId=", ", rightResId=2131165325, bottomResId=2131165325)");
    }
}
