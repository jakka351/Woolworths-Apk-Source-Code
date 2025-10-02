package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TextFieldKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1341a = 20;
    public static final float b = 10;
    public static final float c = 2;

    /* JADX WARN: Removed duplicated region for block: B:101:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final androidx.compose.ui.text.input.TextFieldValue r59, final kotlin.jvm.functions.Function1 r60, final androidx.compose.ui.Modifier r61, boolean r62, boolean r63, final androidx.compose.ui.text.TextStyle r64, kotlin.jvm.functions.Function2 r65, final kotlin.jvm.functions.Function2 r66, kotlin.jvm.functions.Function2 r67, final kotlin.jvm.functions.Function2 r68, boolean r69, androidx.compose.ui.text.input.VisualTransformation r70, final androidx.compose.foundation.text.KeyboardOptions r71, final androidx.compose.foundation.text.KeyboardActions r72, final boolean r73, final int r74, int r75, androidx.compose.foundation.interaction.MutableInteractionSource r76, androidx.compose.ui.graphics.Shape r77, final androidx.compose.material.TextFieldColors r78, androidx.compose.runtime.Composer r79, final int r80, final int r81, final int r82) {
        /*
            Method dump skipped, instructions count: 997
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.a(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:292:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final java.lang.String r48, final kotlin.jvm.functions.Function1 r49, final androidx.compose.ui.Modifier r50, boolean r51, boolean r52, androidx.compose.ui.text.TextStyle r53, kotlin.jvm.functions.Function2 r54, kotlin.jvm.functions.Function2 r55, kotlin.jvm.functions.Function2 r56, kotlin.jvm.functions.Function2 r57, boolean r58, androidx.compose.ui.text.input.VisualTransformation r59, androidx.compose.foundation.text.KeyboardOptions r60, androidx.compose.foundation.text.KeyboardActions r61, final boolean r62, int r63, int r64, androidx.compose.foundation.interaction.MutableInteractionSource r65, androidx.compose.ui.graphics.Shape r66, final androidx.compose.material.TextFieldColors r67, androidx.compose.runtime.Composer r68, final int r69, final int r70, final int r71) {
        /*
            Method dump skipped, instructions count: 1222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.b(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x033b  */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v7, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final androidx.compose.ui.Modifier r23, kotlin.jvm.functions.Function2 r24, kotlin.jvm.functions.Function2 r25, kotlin.jvm.functions.Function3 r26, final kotlin.jvm.functions.Function2 r27, final kotlin.jvm.functions.Function2 r28, final boolean r29, final float r30, androidx.compose.foundation.layout.PaddingValues r31, androidx.compose.runtime.Composer r32, final int r33) {
        /*
            Method dump skipped, instructions count: 887
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.c(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, float, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):void");
    }

    public static final int d(int i, boolean z, int i2, int i3, int i4, int i5, long j, float f, PaddingValues paddingValues) {
        float f2 = c * f;
        float b2 = paddingValues.getB() * f;
        float d = paddingValues.getD() * f;
        int iMax = Math.max(i, i5);
        return ConstraintsKt.f(Math.max(MathKt.b(z ? i2 + f2 + iMax + d : b2 + iMax + d), Math.max(i3, i4)), j);
    }
}
