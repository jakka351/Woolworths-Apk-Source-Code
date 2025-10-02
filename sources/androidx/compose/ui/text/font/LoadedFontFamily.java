package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.platform.AndroidTypefaceWrapper;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/LoadedFontFamily;", "Landroidx/compose/ui/text/font/FontFamily;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LoadedFontFamily extends FontFamily {
    public final AndroidTypefaceWrapper i;

    public LoadedFontFamily(AndroidTypefaceWrapper androidTypefaceWrapper) {
        this.i = androidTypefaceWrapper;
    }

    public final Typeface b() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LoadedFontFamily) {
            return this.i.equals(((LoadedFontFamily) obj).i);
        }
        return false;
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final String toString() {
        return "LoadedFontFamily(typeface=" + this.i + ')';
    }
}
