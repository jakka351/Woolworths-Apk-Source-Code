package androidx.compose.ui.text.style;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextGeometricTransformKt {
    public static final TextGeometricTransform a(TextGeometricTransform textGeometricTransform, TextGeometricTransform textGeometricTransform2, float f) {
        return new TextGeometricTransform(MathHelpersKt.b(textGeometricTransform.f2160a, textGeometricTransform2.f2160a, f), MathHelpersKt.b(textGeometricTransform.b, textGeometricTransform2.b, f));
    }
}
