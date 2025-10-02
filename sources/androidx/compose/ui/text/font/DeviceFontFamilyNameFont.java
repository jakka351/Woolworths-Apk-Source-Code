package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/DeviceFontFamilyNameFont;", "Landroidx/compose/ui/text/font/AndroidFont;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DeviceFontFamilyNameFont extends AndroidFont {
    @Override // androidx.compose.ui.text.font.Font
    public final FontWeight a() {
        return null;
    }

    @Override // androidx.compose.ui.text.font.Font
    public final int c() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeviceFontFamilyNameFont) && Intrinsics.c(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "Font(familyName=\"DeviceFontFamilyName(name=null)\", weight=null, style=" + ((Object) FontStyle.a(0)) + ')';
    }
}
