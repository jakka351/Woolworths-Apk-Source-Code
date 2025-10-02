package au.com.woolworths.shop.lists.ui.substitutions;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/substitutions/ScrollSizes;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* data */ class ScrollSizes {

    /* renamed from: a, reason: collision with root package name */
    public final float f12471a;
    public final float b;
    public final float c;
    public final Integer d;
    public final float e;

    public ScrollSizes(float f, float f2, float f3, Integer num, float f4) {
        this.f12471a = f;
        this.b = f2;
        this.c = f3;
        this.d = num;
        this.e = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollSizes)) {
            return false;
        }
        ScrollSizes scrollSizes = (ScrollSizes) obj;
        return Dp.a(this.f12471a, scrollSizes.f12471a) && Dp.a(this.b, scrollSizes.b) && Dp.a(this.c, scrollSizes.c) && Intrinsics.c(this.d, scrollSizes.d) && Dp.a(this.e, scrollSizes.e);
    }

    public final int hashCode() {
        int iB = android.support.v4.media.session.a.b(this.c, android.support.v4.media.session.a.b(this.b, Float.hashCode(this.f12471a) * 31, 31), 31);
        Integer num = this.d;
        return Float.hashCode(this.e) + ((iB + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        String strB = Dp.b(this.f12471a);
        String strB2 = Dp.b(this.b);
        String strB3 = Dp.b(this.c);
        String strB4 = Dp.b(this.e);
        StringBuilder sbV = YU.a.v("ScrollSizes(imageSize=", strB, ", targetVerticalPadding=", strB2, ", productEndMargin=");
        sbV.append(strB3);
        sbV.append(", requiredProductNameLineCount=");
        sbV.append(this.d);
        sbV.append(", elevation=");
        return YU.a.o(sbV, strB4, ")");
    }
}
