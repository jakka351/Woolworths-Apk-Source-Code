package au.com.woolworths.feature.shop.wpay.ui.wpay;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import io.jsonwebtoken.JwtParser;
import java.text.DecimalFormat;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/CurrencyVisualTransformation;", "Landroidx/compose/ui/text/input/VisualTransformation;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class CurrencyVisualTransformation implements VisualTransformation {

    /* renamed from: a, reason: collision with root package name */
    public final DecimalFormat f8359a = new DecimalFormat("#,###");

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public final TransformedText a(AnnotatedString text) {
        Intrinsics.h(text, "text");
        final String str = text.e;
        String strB = b(str);
        return new TransformedText(new AnnotatedString(YU.a.A("$", strB)), new OffsetMapping() { // from class: au.com.woolworths.feature.shop.wpay.ui.wpay.CurrencyVisualTransformation$filter$offsetMapping$1
            @Override // androidx.compose.ui.text.input.OffsetMapping
            public final int a(int i) {
                int i2 = i - 1;
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = str.length();
                return length > i2 ? i2 : length;
            }

            @Override // androidx.compose.ui.text.input.OffsetMapping
            public final int b(int i) {
                String strSubstring = str.substring(0, i);
                Intrinsics.g(strSubstring, "substring(...)");
                return this.b(strSubstring).length() + 1;
            }
        });
    }

    public final String b(String str) {
        String string;
        if (str.length() == 0) {
            return "";
        }
        List listU = StringsKt.U(str, new char[]{JwtParser.SEPARATOR_CHAR});
        String str2 = (String) listU.get(0);
        StringBuilder sb = new StringBuilder();
        int length = str2.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str2.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String string2 = sb.toString();
        if (listU.size() > 1) {
            String str3 = (String) listU.get(1);
            StringBuilder sb2 = new StringBuilder();
            int length2 = str3.length();
            for (int i2 = 0; i2 < length2; i2++) {
                char cCharAt2 = str3.charAt(i2);
                if (Character.isDigit(cCharAt2)) {
                    sb2.append(cCharAt2);
                }
            }
            string = sb2.toString();
        } else {
            string = "";
        }
        String str4 = string2.length() > 0 ? this.f8359a.format(Long.parseLong(string2)) : "";
        if (StringsKt.v(str, ".", false)) {
            return YU.a.g(str4, ".");
        }
        if (string.length() > 0) {
            return androidx.camera.core.impl.b.o(str4, ".", string);
        }
        Intrinsics.e(str4);
        return str4;
    }
}
