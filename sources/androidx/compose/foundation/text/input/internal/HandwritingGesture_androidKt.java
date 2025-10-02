package androidx.compose.foundation.text.input.internal;

import android.graphics.PointF;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class HandwritingGesture_androidKt {
    public static final long a(LegacyTextFieldState legacyTextFieldState, Rect rect, Rect rect2, int i) {
        long jG = g(legacyTextFieldState, rect, i);
        if (TextRange.c(jG)) {
            return TextRange.b;
        }
        long jG2 = g(legacyTextFieldState, rect2, i);
        if (TextRange.c(jG2)) {
            return TextRange.b;
        }
        int i2 = (int) (jG >> 32);
        int i3 = (int) (jG2 & 4294967295L);
        return TextRangeKt.a(Math.min(i2, i2), Math.max(i3, i3));
    }

    public static final long b(TextLayoutState textLayoutState, Rect rect, Rect rect2, int i) {
        long jH = h(textLayoutState, rect, i);
        if (TextRange.c(jH)) {
            return TextRange.b;
        }
        textLayoutState.b();
        textLayoutState.c();
        long j = TextRange.b;
        if (TextRange.c(j)) {
            return j;
        }
        int i2 = (int) (jH >> 32);
        int i3 = (int) (4294967295L & j);
        return TextRangeKt.a(Math.min(i2, i2), Math.max(i3, i3));
    }

    public static final boolean c(TextLayoutResult textLayoutResult, int i) {
        MultiParagraph multiParagraph = textLayoutResult.b;
        int iD = multiParagraph.d(i);
        return i == textLayoutResult.g(iD) || i == multiParagraph.c(iD, false) ? textLayoutResult.h(i) != textLayoutResult.a(i) : textLayoutResult.a(i) != textLayoutResult.a(i - 1);
    }

    public static final long d(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public static final int e(MultiParagraph multiParagraph, long j, ViewConfiguration viewConfiguration) {
        float fC = viewConfiguration != null ? viewConfiguration.c() : BitmapDescriptorFactory.HUE_RED;
        int i = (int) (4294967295L & j);
        int iE = multiParagraph.e(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) < multiParagraph.f(iE) - fC || Float.intBitsToFloat(i) > multiParagraph.b(iE) + fC) {
            return -1;
        }
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) < (-fC) || Float.intBitsToFloat(i2) > multiParagraph.d + fC) {
            return -1;
        }
        return iE;
    }

    public static final int f(MultiParagraph multiParagraph, long j, LayoutCoordinates layoutCoordinates, ViewConfiguration viewConfiguration) {
        long jN;
        int iE;
        if (layoutCoordinates == null || (iE = e(multiParagraph, (jN = layoutCoordinates.n(j)), viewConfiguration)) == -1) {
            return -1;
        }
        return multiParagraph.g(Offset.a(jN, (multiParagraph.b(iE) + multiParagraph.f(iE)) / 2.0f, 1));
    }

    public static final long g(LegacyTextFieldState legacyTextFieldState, Rect rect, int i) {
        TextLayoutResultProxy textLayoutResultProxyD = legacyTextFieldState.d();
        MultiParagraph multiParagraph = textLayoutResultProxyD != null ? textLayoutResultProxyD.f1135a.b : null;
        LayoutCoordinates layoutCoordinatesC = legacyTextFieldState.c();
        return (multiParagraph == null || layoutCoordinatesC == null) ? TextRange.b : multiParagraph.h(rect.k(layoutCoordinatesC.n(0L)), i, TextInclusionStrategy.Companion.b);
    }

    public static final long h(TextLayoutState textLayoutState, Rect rect, int i) {
        textLayoutState.b();
        textLayoutState.c();
        return TextRange.b;
    }

    public static final boolean i(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean j(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    public static final boolean k(int i) {
        int type;
        return (!j(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }
}
