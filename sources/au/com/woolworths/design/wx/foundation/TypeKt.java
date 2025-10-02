package au.com.woolworths.design.wx.foundation;

import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.font.FontListFontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.ResourceFont;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.compose.d;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"design-wx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TypeKt {

    /* renamed from: a, reason: collision with root package name */
    public static final WxTypography f5163a;
    public static final StaticProvidableCompositionLocal b;

    static {
        FontWeight fontWeight = FontWeight.j;
        ResourceFont resourceFontA = FontKt.a(R.font.roboto_regular, fontWeight);
        FontWeight fontWeight2 = FontWeight.k;
        ResourceFont resourceFontA2 = FontKt.a(R.font.roboto_medium, fontWeight2);
        FontWeight fontWeight3 = FontWeight.m;
        FontListFontFamily fontListFontFamily = new FontListFontFamily(ArraysKt.f(new Font[]{resourceFontA, resourceFontA2, FontKt.a(R.font.roboto_bold, fontWeight3)}));
        FontListFontFamily fontListFontFamily2 = new FontListFontFamily(ArraysKt.f(new Font[]{FontKt.a(R.font.fresh_sans_regular, fontWeight), FontKt.a(R.font.fresh_sans_medium, fontWeight2), FontKt.a(R.font.fresh_sans_bold, fontWeight3)}));
        f5163a = new WxTypography(new TextStyle(0L, TextUnitKt.c(96), fontWeight, null, fontListFontFamily, TextUnitKt.b(-0.015625d), null, 0, 0, 0L, new PlatformTextStyle(true), 16252761), new TextStyle(0L, TextUnitKt.c(60), fontWeight, null, fontListFontFamily, TextUnitKt.b(-0.00833333333d), null, 0, 0, 0L, new PlatformTextStyle(true), 16252761), new TextStyle(0L, TextUnitKt.c(48), fontWeight, null, fontListFontFamily, TextUnitKt.c(0), null, 0, 0, 0L, new PlatformTextStyle(true), 16252761), new TextStyle(0L, TextUnitKt.c(34), fontWeight, null, fontListFontFamily, TextUnitKt.b(0.00735294118d), null, 0, 0, 0L, new PlatformTextStyle(true), 16252761), new TextStyle(0L, TextUnitKt.c(24), fontWeight, null, fontListFontFamily, TextUnitKt.c(0), null, 0, 0, 0L, new PlatformTextStyle(true), 16252761), new TextStyle(0L, TextUnitKt.c(24), fontWeight2, null, fontListFontFamily, TextUnitKt.c(0), null, 0, 0, 0L, new PlatformTextStyle(true), 16252761), new TextStyle(0L, TextUnitKt.c(24), fontWeight3, null, fontListFontFamily, TextUnitKt.c(0), null, 0, 0, 0L, new PlatformTextStyle(true), 16252761), new TextStyle(0L, TextUnitKt.c(20), fontWeight, null, fontListFontFamily, TextUnitKt.b(0.0125d), null, 0, 0, 0L, new PlatformTextStyle(true), 16252761), new TextStyle(0L, TextUnitKt.c(20), fontWeight2, null, fontListFontFamily, TextUnitKt.b(0.0125d), null, 0, 0, 0L, new PlatformTextStyle(true), 16252761), new TextStyle(0L, TextUnitKt.c(18), fontWeight, null, fontListFontFamily, TextUnitKt.b(0.009375d), null, 0, 0, 0L, new PlatformTextStyle(true), 16252761), new TextStyle(0L, TextUnitKt.c(18), fontWeight2, null, fontListFontFamily, TextUnitKt.b(0.009375d), null, 0, 0, 0L, new PlatformTextStyle(true), 16252761), new TextStyle(0L, TextUnitKt.c(16), fontWeight, null, fontListFontFamily, TextUnitKt.b(0.009375d), null, 0, 0, 0L, new PlatformTextStyle(true), 16252761), new TextStyle(0L, TextUnitKt.c(16), fontWeight2, null, fontListFontFamily, TextUnitKt.b(0.009375d), null, 0, 0, 0L, new PlatformTextStyle(true), 16252761), new TextStyle(0L, TextUnitKt.c(14), fontWeight, null, fontListFontFamily, TextUnitKt.b(0.0178571429d), null, 0, 0, 0L, new PlatformTextStyle(true), 16252761), new TextStyle(0L, TextUnitKt.c(14), fontWeight2, null, fontListFontFamily, TextUnitKt.b(0.0178571429d), null, 0, 0, 0L, new PlatformTextStyle(true), 16252761), new TextStyle(0L, TextUnitKt.c(14), fontWeight3, null, fontListFontFamily, TextUnitKt.b(0.0178571429d), null, 0, 0, 0L, new PlatformTextStyle(true), 16252761), new TextStyle(0L, TextUnitKt.c(14), fontWeight2, null, fontListFontFamily, TextUnitKt.c(0), null, 0, 0, 0L, new PlatformTextStyle(true), 16252761), new TextStyle(0L, TextUnitKt.c(12), fontWeight, null, fontListFontFamily, TextUnitKt.b(0.0333333333d), null, 0, 0, 0L, new PlatformTextStyle(true), 16252761), new TextStyle(0L, TextUnitKt.c(12), fontWeight2, null, fontListFontFamily, TextUnitKt.b(0.0333333333d), null, 0, 0, 0L, new PlatformTextStyle(true), 16252761), new TextStyle(0L, TextUnitKt.c(10), fontWeight2, null, fontListFontFamily, TextUnitKt.b(0.0333333333d), null, 0, 0, 0L, new PlatformTextStyle(true), 16252761), new TextStyle(0L, TextUnitKt.c(34), fontWeight2, null, fontListFontFamily2, TextUnitKt.b(0.00735294118d), null, 0, 0, 0L, new PlatformTextStyle(true), 16252761), new TextStyle(0L, TextUnitKt.c(24), fontWeight2, null, fontListFontFamily2, TextUnitKt.c(0), null, 0, 0, 0L, new PlatformTextStyle(true), 16252761), new TextStyle(0L, TextUnitKt.c(20), fontWeight2, null, fontListFontFamily2, TextUnitKt.b(0.0125d), null, 0, 0, 0L, new PlatformTextStyle(true), 16252761), new TextStyle(0L, TextUnitKt.c(20), fontWeight3, null, fontListFontFamily2, TextUnitKt.b(0.0125d), null, 0, 0, 0L, new PlatformTextStyle(true), 16252761), new TextStyle(0L, TextUnitKt.c(18), fontWeight2, null, fontListFontFamily2, TextUnitKt.b(0.009375d), null, 0, 0, 0L, new PlatformTextStyle(true), 16252761), new TextStyle(0L, TextUnitKt.c(14), fontWeight2, null, fontListFontFamily2, TextUnitKt.b(0.0178571429d), null, 0, 0, 0L, new PlatformTextStyle(true), 16252761), new TextStyle(0L, TextUnitKt.c(12), fontWeight2, null, fontListFontFamily2, TextUnitKt.b(0.0333333333d), null, 0, 0, 0L, new PlatformTextStyle(true), 16252761), new TextStyle(0L, TextUnitKt.c(10), fontWeight2, null, fontListFontFamily2, TextUnitKt.c(0), null, 0, 0, 0L, new PlatformTextStyle(true), 16252761));
        b = new StaticProvidableCompositionLocal(new d(11));
    }
}
