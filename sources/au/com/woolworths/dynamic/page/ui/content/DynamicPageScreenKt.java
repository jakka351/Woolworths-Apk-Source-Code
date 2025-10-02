package au.com.woolworths.dynamic.page.ui.content;

import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"dynamic-page_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class DynamicPageScreenKt {
    public static final void a(List list, Function2 onLinkClick, Modifier modifier, Composer composer, int i) {
        Intrinsics.h(onLinkClick, "onLinkClick");
        ComposerImpl composerImplV = composer.v(1627118332);
        int i2 = (composerImplV.I(list) ? 4 : 2) | i | (composerImplV.I(onLinkClick) ? 32 : 16) | (composerImplV.n(modifier) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(-1633490746);
            boolean zI = composerImplV.I(list) | ((i2 & 112) == 32);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new f(list, onLinkClick, 1);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            LazyDslKt.b(modifier, null, null, false, null, null, null, false, null, (Function1) objG, composerImplV, (i2 >> 6) & 14, 510);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(list, onLinkClick, modifier, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final au.com.woolworths.dynamic.page.ui.DynamicPageContract.ViewState r24, final kotlin.jvm.functions.Function2 r25, final kotlin.jvm.functions.Function0 r26, final kotlin.jvm.functions.Function0 r27, final kotlin.jvm.functions.Function0 r28, final kotlin.jvm.functions.Function0 r29, kotlin.jvm.functions.Function0 r30, androidx.compose.ui.Modifier r31, kotlin.jvm.functions.Function0 r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.dynamic.page.ui.content.DynamicPageScreenKt.b(au.com.woolworths.dynamic.page.ui.DynamicPageContract$ViewState, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }
}
