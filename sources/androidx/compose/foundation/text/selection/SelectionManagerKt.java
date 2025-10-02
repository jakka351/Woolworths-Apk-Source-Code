package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SelectionManagerKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1215a;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                Handle handle = Handle.d;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Handle handle2 = Handle.d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Handle handle3 = Handle.d;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1215a = iArr;
        }
    }

    static {
        new Rect(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    }

    public static final boolean a(long j, Rect rect) {
        float f = rect.f1752a;
        float f2 = rect.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (f > fIntBitsToFloat || fIntBitsToFloat > f2) {
            return false;
        }
        float f3 = rect.b;
        float f4 = rect.d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return f3 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f4;
    }

    public static final long b(SelectionManager selectionManager, long j, Selection.AnchorInfo anchorInfo) {
        Selectable selectableC = selectionManager.c(anchorInfo);
        if (selectableC == null || selectionManager.b == null || selectableC.a() == null || anchorInfo.b > selectableC.e()) {
            return 9205357640488583168L;
        }
        throw null;
    }

    public static final Rect c(LayoutCoordinates layoutCoordinates) {
        Rect rectB = LayoutCoordinatesKt.b(layoutCoordinates);
        long jP = layoutCoordinates.P(rectB.f());
        float f = rectB.c;
        float f2 = rectB.d;
        long jP2 = layoutCoordinates.P((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
        return new Rect(Float.intBitsToFloat((int) (jP >> 32)), Float.intBitsToFloat((int) (jP & 4294967295L)), Float.intBitsToFloat((int) (jP2 >> 32)), Float.intBitsToFloat((int) (jP2 & 4294967295L)));
    }
}
