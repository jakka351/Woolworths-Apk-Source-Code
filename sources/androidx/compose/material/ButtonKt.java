package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "contentColor", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:106:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final kotlin.jvm.functions.Function0 r29, androidx.compose.ui.Modifier r30, boolean r31, androidx.compose.foundation.interaction.MutableInteractionSource r32, androidx.compose.material.ButtonElevation r33, androidx.compose.ui.graphics.Shape r34, androidx.compose.foundation.BorderStroke r35, androidx.compose.material.ButtonColors r36, androidx.compose.foundation.layout.PaddingValues r37, final androidx.compose.runtime.internal.ComposableLambdaImpl r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 715
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ButtonKt.a(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.ButtonElevation, androidx.compose.ui.graphics.Shape, androidx.compose.foundation.BorderStroke, androidx.compose.material.ButtonColors, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.internal.ComposableLambdaImpl, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(Function0 function0, Modifier modifier, boolean z, ButtonElevation buttonElevation, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        a(function0, (i2 & 2) != 0 ? Modifier.Companion.d : modifier, (i2 & 4) != 0 ? true : z, null, (i2 & 16) != 0 ? null : buttonElevation, (i2 & 32) != 0 ? MaterialTheme.b(composer).f1321a : shape, borderStroke, (i2 & 128) != 0 ? ButtonDefaults.c(0L, 0L, 0L, composer, 7) : buttonColors, (i2 & 256) != 0 ? ButtonDefaults.f1248a : paddingValues, composableLambdaImpl, composer, i & 2147483646, 0);
    }

    public static final void c(Function0 function0, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        a(function0, (i2 & 2) != 0 ? Modifier.Companion.d : modifier, (i2 & 4) != 0 ? true : z, (i2 & 8) != 0 ? null : mutableInteractionSource, null, (i2 & 32) != 0 ? MaterialTheme.b(composer).f1321a : shape, (i2 & 64) != 0 ? null : borderStroke, (i2 & 128) != 0 ? ButtonDefaults.d(0L, 0L, 0L, composer, 7) : buttonColors, (i2 & 256) != 0 ? ButtonDefaults.d : paddingValues, composableLambdaImpl, composer, i & 2147483646, 0);
    }
}
