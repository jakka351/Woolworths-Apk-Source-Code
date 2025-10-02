package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextSelectionColorsKt {

    /* renamed from: a, reason: collision with root package name */
    public static final DynamicProvidableCompositionLocal f1228a = new DynamicProvidableCompositionLocal(TextSelectionColorsKt$LocalTextSelectionColors$1.h);
    public static final TextSelectionColors b;

    static {
        long jD = ColorKt.d(4282550004L);
        b = new TextSelectionColors(jD, Color.b(jD, 0.4f));
    }
}
