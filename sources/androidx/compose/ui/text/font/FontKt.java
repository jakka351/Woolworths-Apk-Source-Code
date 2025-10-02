package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.FontVariation;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FontKt {
    public static ResourceFont a(int i, FontWeight fontWeight) {
        return new ResourceFont(i, fontWeight, new FontVariation.Settings(new FontVariation.Setting[0]));
    }
}
