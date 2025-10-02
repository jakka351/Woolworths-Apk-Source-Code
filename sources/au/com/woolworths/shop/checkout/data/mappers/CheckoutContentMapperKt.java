package au.com.woolworths.shop.checkout.data.mappers;

import au.com.woolworths.sdui.common.IconAsset;
import au.com.woolworths.sdui.shop.fragment.CoreTagUI;
import au.com.woolworths.sdui.shop.fragment.IconFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckoutContentMapperKt {
    public static final IconAsset a(CoreTagUI.Icon icon) {
        Intrinsics.h(icon, "<this>");
        IconFragment iconFragment = icon.b;
        IconFragment.OnCoreIcon onCoreIcon = iconFragment.c;
        if (onCoreIcon != null) {
            if (onCoreIcon != null) {
                return new IconAsset.CoreIcon(onCoreIcon.b);
            }
            return null;
        }
        IconFragment.OnHostedIcon onHostedIcon = iconFragment.b;
        if (onHostedIcon == null || onHostedIcon == null) {
            return null;
        }
        return new IconAsset.HostedIcon(onHostedIcon.b);
    }
}
