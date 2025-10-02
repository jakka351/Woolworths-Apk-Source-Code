package au.com.woolworths.design.core.ui.component.stable.iconbutton;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonSpec;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.foundation.ui.toolbar.collapsingtoolbar.core.ComposableSingletons$CollapsingTopAppBarPreviewKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class IconButtonKt {
    public static final void a(int i, Composer composer, Modifier modifier, Function0 onClick, boolean z) {
        Function0 function0;
        ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$CollapsingTopAppBarPreviewKt.b;
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(-1400813709);
        if (((i | 432) & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            function0 = onClick;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            function0 = onClick;
            androidx.compose.material3.IconButtonKt.a(function0, companion, true, null, composableLambdaImpl, composerImplV, 197046, 24);
            modifier = companion;
            z = true;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(function0, modifier, z, i);
        }
    }

    public static final void b(final Painter painter, final String contentDescription, final Function0 onClick, final Modifier modifier, boolean z, IconButtonSpec.Size size, final long j, Composer composer, final int i, final int i2) {
        final boolean z2;
        final IconButtonSpec.Size size2;
        ComposerImpl composerImpl;
        boolean z3;
        final IconButtonSpec.Size size3;
        Intrinsics.h(painter, "painter");
        Intrinsics.h(contentDescription, "contentDescription");
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(1663540022);
        int i3 = i | (composerImplV.I(painter) ? 4 : 2) | (composerImplV.n(contentDescription) ? 32 : 16) | (composerImplV.I(onClick) ? 256 : 128) | (composerImplV.n(modifier) ? 2048 : 1024);
        int i4 = i3 | 24576;
        int i5 = i2 & 32;
        if (i5 != 0) {
            i4 = 221184 | i3;
        } else if ((i & 196608) == 0) {
            i4 |= composerImplV.r(size == null ? -1 : size.ordinal()) ? 131072 : 65536;
        }
        int i6 = i4 | (composerImplV.s(j) ? 1048576 : 524288);
        if ((599187 & i6) == 599186 && composerImplV.c()) {
            composerImplV.j();
            z3 = z;
            size3 = size;
            composerImpl = composerImplV;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                z2 = true;
                size2 = i5 != 0 ? IconButtonSpec.Size.f : size;
            } else {
                composerImplV.j();
                z2 = z;
                size2 = size;
            }
            composerImplV.W();
            boolean z4 = z2;
            composerImpl = composerImplV;
            androidx.compose.material3.IconButtonKt.a(onClick, SizeKt.q(modifier, size2.d), z4, null, ComposableLambdaKt.c(-2113019719, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt$IconButton$3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        composer2.o(907584920);
                        long j2 = z2 ? j : CoreTheme.b(composer2).d.c.f4844a;
                        composer2.l();
                        IconKt.a(painter, contentDescription, SizeKt.q(Modifier.Companion.d, size2.e), j2, composer2, 0, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, ((i6 >> 6) & 14) | 196992, 24);
            z3 = z4;
            size3 = size2;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            final boolean z5 = z3;
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.design.core.ui.component.stable.iconbutton.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    IconButtonKt.b(painter, contentDescription, onClick, modifier, z5, size3, j, (Composer) obj, RecomposeScopeImplKt.a(i | 1), i2);
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final androidx.compose.ui.graphics.vector.ImageVector r16, final java.lang.String r17, final kotlin.jvm.functions.Function0 r18, androidx.compose.ui.Modifier r19, boolean r20, au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonSpec.Size r21, long r22, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt.c(androidx.compose.ui.graphics.vector.ImageVector, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonSpec$Size, long, androidx.compose.runtime.Composer, int, int):void");
    }
}
