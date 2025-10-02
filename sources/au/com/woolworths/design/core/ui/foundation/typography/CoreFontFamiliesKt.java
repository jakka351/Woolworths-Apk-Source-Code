package au.com.woolworths.design.core.ui.foundation.typography;

import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.font.FontListFontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.ResourceFont;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CoreFontFamiliesKt {

    /* renamed from: a, reason: collision with root package name */
    public static final FontListFontFamily f5118a;
    public static final FontListFontFamily b;

    static {
        FontWeight fontWeight = FontWeight.j;
        ResourceFont resourceFontA = FontKt.a(R.font.roboto_regular, fontWeight);
        FontWeight fontWeight2 = FontWeight.k;
        ResourceFont resourceFontA2 = FontKt.a(R.font.roboto_medium, fontWeight2);
        FontWeight fontWeight3 = FontWeight.m;
        f5118a = new FontListFontFamily(ArraysKt.f(new Font[]{resourceFontA, resourceFontA2, FontKt.a(R.font.roboto_bold, fontWeight3)}));
        b = new FontListFontFamily(ArraysKt.f(new Font[]{FontKt.a(R.font.fresh_sans_regular, fontWeight), FontKt.a(R.font.fresh_sans_medium, fontWeight2), FontKt.a(R.font.fresh_sans_bold, fontWeight3)}));
    }

    public static final FontListFontFamily a() {
        return b;
    }

    public static final FontListFontFamily b() {
        return f5118a;
    }
}
