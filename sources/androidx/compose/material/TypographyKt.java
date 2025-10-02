package androidx.compose.material;

import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.LineHeightStyle;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TypographyKt {

    /* renamed from: a, reason: collision with root package name */
    public static final TextStyle f1349a = TextStyle.a(TextStyle.d, 0, 0, null, null, 0, 0, DefaultPlatformTextStyle_androidKt.f1268a, new LineHeightStyle(LineHeightStyle.Alignment.b, 0), 0, 15204351);
    public static final StaticProvidableCompositionLocal b = new StaticProvidableCompositionLocal(TypographyKt$LocalTypography$1.h);

    public static final TextStyle a(TextStyle textStyle, FontFamily fontFamily) {
        return textStyle.f2068a.fontFamily != null ? textStyle : TextStyle.a(textStyle, 0L, 0L, null, fontFamily, 0L, 0L, null, null, 0, 16777183);
    }
}
