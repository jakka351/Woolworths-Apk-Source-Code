package androidx.compose.ui.text;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ParagraphKt {
    public static AndroidParagraph a(String str, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, int i, int i2) {
        EmptyList emptyList = EmptyList.d;
        return new AndroidParagraph(new AndroidParagraphIntrinsics(str, textStyle, emptyList, emptyList, resolver, density), i, 1, j);
    }
}
