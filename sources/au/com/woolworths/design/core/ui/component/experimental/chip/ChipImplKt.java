package au.com.woolworths.design.core.ui.component.experimental.chip;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
import au.com.woolworths.design.core.ui.component.experimental.chip.spec.ChipVariant;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0002\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "animatedBgColor", "animatedTextColor", "animatedBadgeTextColor", "ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ChipImplKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ChipVariant.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ChipVariant chipVariant = ChipVariant.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final void a(ImageVector imageVector, ChipVariant variant, Modifier modifier, Color color, Composer composer, int i, int i2) {
        int i3;
        long j;
        Modifier modifier2;
        Color color2;
        Intrinsics.h(imageVector, "imageVector");
        Intrinsics.h(variant, "variant");
        ComposerImpl composerImplV = composer.v(310879503);
        int i4 = (composerImplV.n(imageVector) ? 4 : 2) | i | (composerImplV.r(variant.ordinal()) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 |= KyberEngine.KyberPolyBytes;
        } else if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= composerImplV.n(modifier) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 = i4 | 3072;
        } else {
            i3 = i4 | (composerImplV.n(color) ? 2048 : 1024);
        }
        if ((i3 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            color2 = color;
        } else {
            Modifier modifier3 = i5 != 0 ? Modifier.Companion.d : modifier;
            Color color3 = i6 != 0 ? null : color;
            composerImplV.o(-1892500415);
            if (color3 == null) {
                int iOrdinal = variant.ordinal();
                if (iOrdinal == 0) {
                    composerImplV.o(-1892497258);
                    j = CoreTheme.b(composerImplV).c.c.f4824a.b.f4827a;
                    composerImplV.V(false);
                } else {
                    if (iOrdinal != 1) {
                        throw au.com.woolworths.android.onesite.a.w(-1892500167, composerImplV, false);
                    }
                    composerImplV.o(-1892494314);
                    j = CoreTheme.b(composerImplV).c.c.b.b.f4830a;
                    composerImplV.V(false);
                }
            } else {
                j = color3.f1766a;
            }
            composerImplV.V(false);
            IconKt.b(imageVector, null, SizeKt.q(modifier3, 20), j, composerImplV, (i3 & 14) | 48, 0);
            modifier2 = modifier3;
            color2 = color3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(imageVector, variant, modifier2, color2, i, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:247:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final boolean r25, final au.com.woolworths.design.core.ui.component.experimental.chip.spec.ChipSpec r26, final java.lang.String r27, final java.lang.String r28, final kotlin.jvm.functions.Function0 r29, final androidx.compose.ui.Modifier r30, final java.lang.String r31, kotlin.jvm.functions.Function2 r32, kotlin.jvm.functions.Function2 r33, androidx.compose.foundation.layout.Arrangement.Horizontal r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 1664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.design.core.ui.component.experimental.chip.ChipImplKt.b(boolean, au.com.woolworths.design.core.ui.component.experimental.chip.spec.ChipSpec, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, java.lang.String, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.runtime.Composer, int, int):void");
    }
}
