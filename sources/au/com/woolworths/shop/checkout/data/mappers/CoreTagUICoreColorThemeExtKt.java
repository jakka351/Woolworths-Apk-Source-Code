package au.com.woolworths.shop.checkout.data.mappers;

import au.com.woolworths.sdui.common.corecolortheme.Background;
import au.com.woolworths.sdui.common.corecolortheme.CoreColorTheme;
import au.com.woolworths.sdui.common.corecolortheme.Foreground;
import au.com.woolworths.sdui.common.corecolortheme.Highlight;
import au.com.woolworths.sdui.common.corecolortheme.Primary;
import au.com.woolworths.sdui.common.corecolortheme.Secondary;
import au.com.woolworths.sdui.shop.fragment.CoreTagUI;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CoreTagUICoreColorThemeExtKt {
    public static final CoreColorTheme a(CoreTagUI.CoreColorTheme coreColorTheme) {
        Intrinsics.h(coreColorTheme, "<this>");
        Background background = new Background(CompatibleColorExtKt.a(coreColorTheme.b.b));
        CoreTagUI.Foreground foreground = coreColorTheme.c;
        return new CoreColorTheme(background, new Foreground(new Primary(CompatibleColorExtKt.a(foreground.b.b)), new Secondary(CompatibleColorExtKt.a(foreground.c.b)), new Highlight(CompatibleColorExtKt.a(foreground.d.b))));
    }
}
