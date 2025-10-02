package kotlin.text;

import androidx.compose.ui.platform.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes.dex */
class StringsKt__StringNumberConversionsKt extends StringsKt__StringNumberConversionsJVMKt {
    public static final void b(String input) {
        Intrinsics.h(input, "input");
        throw new NumberFormatException(i.a('\'', "Invalid number format: '", input));
    }
}
