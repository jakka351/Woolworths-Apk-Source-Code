package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TextFieldSelectionManagerKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1225a;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                Handle handle = Handle.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Handle handle2 = Handle.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Handle handle3 = Handle.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1225a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final boolean r16, final androidx.compose.ui.text.style.ResolvedTextDirection r17, final androidx.compose.foundation.text.selection.TextFieldSelectionManager r18, androidx.compose.runtime.Composer r19, final int r20) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.a(boolean, androidx.compose.ui.text.style.ResolvedTextDirection, androidx.compose.foundation.text.selection.TextFieldSelectionManager, androidx.compose.runtime.Composer, int):void");
    }

    public static final boolean b(TextFieldSelectionManager textFieldSelectionManager, boolean z) {
        LayoutCoordinates layoutCoordinatesC;
        LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.d;
        if (legacyTextFieldState == null || (layoutCoordinatesC = legacyTextFieldState.c()) == null) {
            return false;
        }
        return SelectionManagerKt.a(textFieldSelectionManager.l(z), SelectionManagerKt.c(layoutCoordinatesC));
    }
}
