package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.unit.Density;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TextFieldScrollKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Orientation orientation = Orientation.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final Rect a(Density density, int i, TransformedText transformedText, TextLayoutResult textLayoutResult, boolean z, int i2) {
        Rect rectC = textLayoutResult != null ? textLayoutResult.c(transformedText.b.b(i)) : Rect.e;
        float f = rectC.f1752a;
        int iR1 = density.r1(TextFieldCursor_androidKt.f1128a);
        return Rect.b(rectC, z ? (i2 - f) - iR1 : f, BitmapDescriptorFactory.HUE_RED, z ? i2 - f : iR1 + f, BitmapDescriptorFactory.HUE_RED, 10);
    }
}
