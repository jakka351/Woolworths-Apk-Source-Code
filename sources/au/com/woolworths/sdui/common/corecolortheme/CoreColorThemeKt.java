package au.com.woolworths.sdui.common.corecolortheme;

import androidx.compose.ui.graphics.ColorKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CoreColorThemeKt {
    public static final long a(CompatibleColorData compatibleColorData) {
        String lowerCase = StringsKt.L("#", compatibleColorData.f9991a).toLowerCase(Locale.ROOT);
        Intrinsics.g(lowerCase, "toLowerCase(...)");
        String strConcat = "ff".concat(lowerCase);
        CharsKt.b(16);
        return ColorKt.d(Long.parseLong(strConcat, 16));
    }
}
