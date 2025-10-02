package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/TextFieldDelegate;", "", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextFieldDelegate {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/TextFieldDelegate$Companion;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static void a(Canvas canvas, long j, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, AndroidPaint androidPaint) {
            int iB = offsetMapping.b(TextRange.f(j));
            int iB2 = offsetMapping.b(TextRange.e(j));
            if (iB != iB2) {
                canvas.s(textLayoutResult.i(iB, iB2), androidPaint);
            }
        }

        public static void b(TextFieldValue textFieldValue, TextDelegate textDelegate, TextLayoutResult textLayoutResult, LayoutCoordinates layoutCoordinates, TextInputSession textInputSession, boolean z, OffsetMapping offsetMapping) {
            if (z) {
                int iB = offsetMapping.b(TextRange.e(textFieldValue.b));
                Rect rectB = iB < textLayoutResult.f2064a.f2063a.e.length() ? textLayoutResult.b(iB) : iB != 0 ? textLayoutResult.b(iB - 1) : new Rect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, (int) (TextFieldDelegateKt.a(textDelegate.b, textDelegate.g, textDelegate.h, TextFieldDelegateKt.f1129a, 1) & 4294967295L));
                float f = rectB.b;
                float f2 = rectB.f1752a;
                long jG = layoutCoordinates.G((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
                Rect rectA = RectKt.a((Float.floatToRawIntBits(Float.intBitsToFloat((int) (jG & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (jG >> 32))) << 32), (Float.floatToRawIntBits(rectB.c - f2) << 32) | (Float.floatToRawIntBits(rectB.d - f) & 4294967295L));
                if (Intrinsics.c((TextInputSession) textInputSession.f2131a.b.get(), textInputSession)) {
                    textInputSession.b.c(rectA);
                }
            }
        }
    }
}
