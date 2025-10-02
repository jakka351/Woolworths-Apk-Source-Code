package androidx.compose.ui.text.font;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AndroidFontUtils_androidKt {
    public static final FontWeight a() {
        FontWeight fontWeight = FontWeight.e;
        return FontWeight.g;
    }

    public static final int b(int i, FontWeight fontWeight) {
        boolean z = fontWeight.compareTo(FontWeight.g) >= 0;
        boolean z2 = i == 1;
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }
}
