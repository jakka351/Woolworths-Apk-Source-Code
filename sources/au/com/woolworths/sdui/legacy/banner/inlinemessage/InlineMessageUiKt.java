package au.com.woolworths.sdui.legacy.banner.inlinemessage;

import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.modules.common.InlineErrorCause;
import au.com.woolworths.android.onesite.modules.inlinemessage.InlineMessage;
import au.com.woolworths.design.core.ui.component.stable.snackbar.a;
import au.com.woolworths.sdui.legacy.banner.InsetBannerUiKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class InlineMessageUiKt {
    public static final void a(InlineMessage inlineMessage, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        Intrinsics.h(inlineMessage, "inlineMessage");
        ComposerImpl composerImplV = composer.v(-1282399592);
        int i3 = i | (composerImplV.I(inlineMessage) ? 4 : 2);
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            Modifier modifier3 = i4 != 0 ? Modifier.Companion.d : modifier;
            float f = 12;
            float f2 = 8;
            InsetBannerUiKt.c(new PaddingValuesImpl(f, f2, f, f2), inlineMessage.f4338a, InlineErrorCause.IconConfig.Default.d, inlineMessage.b, null, modifier3, null, false, true, null, composerImplV, ((i3 << 12) & 458752) | 100687878, 704);
            modifier2 = modifier3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(inlineMessage, modifier2, i, i2, 12);
        }
    }
}
