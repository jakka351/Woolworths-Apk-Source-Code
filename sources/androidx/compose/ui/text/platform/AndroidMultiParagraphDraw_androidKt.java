package androidx.compose.ui.text.platform;

import android.graphics.Matrix;
import android.graphics.Shader;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt$ShaderBrush$1;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AndroidParagraph;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.ParagraphInfo;
import androidx.compose.ui.text.style.TextDecoration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AndroidMultiParagraphDraw_androidKt {
    public static final void a(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle) {
        canvas.save();
        ArrayList arrayList = multiParagraph.h;
        if (arrayList.size() <= 1 || (brush instanceof SolidColor)) {
            b(multiParagraph, canvas, brush, f, shadow, textDecoration, drawStyle);
        } else if (brush instanceof ShaderBrush) {
            int size = arrayList.size();
            float fMax = 0.0f;
            float fD = 0.0f;
            for (int i = 0; i < size; i++) {
                ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i);
                fD += paragraphInfo.f2047a.d();
                fMax = Math.max(fMax, paragraphInfo.f2047a.i());
            }
            Shader shaderB = ((ShaderBrush) brush).b((Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fD) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                AndroidParagraph androidParagraph = ((ParagraphInfo) arrayList.get(i2)).f2047a;
                androidParagraph.l(canvas, new BrushKt$ShaderBrush$1(shaderB), f, shadow, textDecoration, drawStyle);
                canvas.c(BitmapDescriptorFactory.HUE_RED, androidParagraph.d());
                matrix.setTranslate(BitmapDescriptorFactory.HUE_RED, -androidParagraph.d());
                shaderB.setLocalMatrix(matrix);
            }
        }
        canvas.m();
    }

    public static final void b(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle) {
        ArrayList arrayList = multiParagraph.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i);
            paragraphInfo.f2047a.l(canvas, brush, f, shadow, textDecoration, drawStyle);
            canvas.c(BitmapDescriptorFactory.HUE_RED, paragraphInfo.f2047a.d());
        }
    }
}
