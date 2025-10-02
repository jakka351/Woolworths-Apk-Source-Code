package au.com.woolworths.sdui.legacy.banner.designcoreadapter;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class StandardAlertKt {
    public static final void a(int i, Composer composer, Modifier modifier, Function0 onActionClick) {
        Intrinsics.h(null, "inlineErrorCause");
        Intrinsics.h(onActionClick, "onActionClick");
        ComposerImpl composerImplV = composer.v(2147420436);
        if ((((composerImplV.I(null) ? 4 : 2) | i | 48) & 147) != 146 || !composerImplV.c()) {
            throw null;
        }
        composerImplV.j();
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.offers.ui.a(modifier, onActionClick, i, 4);
        }
    }

    public static final void b(Modifier modifier, Composer composer, int i) {
        Intrinsics.h(null, "inlineMessage");
        ComposerImpl composerImplV = composer.v(1940353762);
        if ((((composerImplV.I(null) ? 4 : 2) | i | 48) & 19) != 18 || !composerImplV.c()) {
            throw null;
        }
        composerImplV.j();
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(i, 0, modifier);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner r15, androidx.compose.ui.Modifier r16, kotlin.jvm.functions.Function1 r17, androidx.compose.runtime.Composer r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.sdui.legacy.banner.designcoreadapter.StandardAlertKt.c(au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }
}
