package androidx.compose.ui.text.input;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CursorAnchorInfoBuilder_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.view.inputmethod.CursorAnchorInfo a(android.view.inputmethod.CursorAnchorInfo.Builder r16, androidx.compose.ui.text.input.TextFieldValue r17, androidx.compose.ui.text.input.OffsetMapping r18, androidx.compose.ui.text.TextLayoutResult r19, android.graphics.Matrix r20, androidx.compose.ui.geometry.Rect r21, androidx.compose.ui.geometry.Rect r22, boolean r23, boolean r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.input.CursorAnchorInfoBuilder_androidKt.a(android.view.inputmethod.CursorAnchorInfo$Builder, androidx.compose.ui.text.input.TextFieldValue, androidx.compose.ui.text.input.OffsetMapping, androidx.compose.ui.text.TextLayoutResult, android.graphics.Matrix, androidx.compose.ui.geometry.Rect, androidx.compose.ui.geometry.Rect, boolean, boolean, boolean, boolean):android.view.inputmethod.CursorAnchorInfo");
    }

    public static final boolean b(Rect rect, float f, float f2) {
        float f3 = rect.f1752a;
        if (f > rect.c || f3 > f) {
            return false;
        }
        return f2 <= rect.d && rect.b <= f2;
    }
}
