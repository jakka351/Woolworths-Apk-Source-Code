package au.com.woolworths.shop.productcard.data;

import au.com.woolworths.sdui.common.IconAsset;
import au.com.woolworths.sdui.common.corecolortheme.Background;
import au.com.woolworths.sdui.common.corecolortheme.CoreColorTheme;
import au.com.woolworths.sdui.common.corecolortheme.Foreground;
import au.com.woolworths.sdui.common.corecolortheme.Highlight;
import au.com.woolworths.sdui.common.corecolortheme.Primary;
import au.com.woolworths.sdui.common.corecolortheme.Secondary;
import au.com.woolworths.sdui.common.coretag.model.CoreTagModel;
import au.com.woolworths.sdui.shop.fragment.CoreTagUI;
import au.com.woolworths.sdui.shop.fragment.IconFragment;
import com.woolworths.shop.productcard.data.fragment.ProductTile;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productcard-data_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductTileProductTagExtKt {
    public static final CoreTagModel a(ProductTile.ProductTag productTag) {
        Intrinsics.h(productTag, "<this>");
        CoreTagUI coreTagUI = productTag.b;
        String str = coreTagUI.b;
        CoreTagUI.CoreColorTheme coreColorTheme = coreTagUI.c;
        Background background = new Background(CompatibleColorExtKt.a(coreColorTheme.b.b));
        CoreTagUI.Foreground foreground = coreColorTheme.c;
        CoreColorTheme coreColorTheme2 = new CoreColorTheme(background, new Foreground(new Primary(CompatibleColorExtKt.a(foreground.b.b)), new Secondary(CompatibleColorExtKt.a(foreground.c.b)), new Highlight(CompatibleColorExtKt.a(foreground.d.b))));
        boolean z = coreTagUI.d;
        CoreTagUI.Icon icon = coreTagUI.e;
        IconAsset hostedIcon = null;
        if (icon != null) {
            IconFragment iconFragment = icon.b;
            IconFragment.OnCoreIcon onCoreIcon = iconFragment.c;
            if (onCoreIcon != null) {
                hostedIcon = new IconAsset.CoreIcon(onCoreIcon.b);
            } else {
                IconFragment.OnHostedIcon onHostedIcon = iconFragment.b;
                if (onHostedIcon != null) {
                    hostedIcon = new IconAsset.HostedIcon(onHostedIcon.b);
                }
            }
        }
        return new CoreTagModel(str, coreColorTheme2, z, hostedIcon);
    }
}
