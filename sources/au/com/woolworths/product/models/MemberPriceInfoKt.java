package au.com.woolworths.product.models;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.product.extensions.StringExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"contentDescription", "", "Lau/com/woolworths/product/models/MemberPriceInfo;", "shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MemberPriceInfoKt {
    @NotNull
    public static final String contentDescription(@NotNull MemberPriceInfo memberPriceInfo) {
        Intrinsics.h(memberPriceInfo, "<this>");
        return a.j(memberPriceInfo.getHeader(), ", ", memberPriceInfo.getTitle(), ", ", StringExtKt.a(memberPriceInfo.getSubtitle()));
    }
}
