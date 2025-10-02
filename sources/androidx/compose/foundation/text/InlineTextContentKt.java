package androidx.compose.foundation.text;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class InlineTextContentKt {
    public static final void a(AnnotatedString.Builder builder, String str, String str2) {
        if (str2.length() <= 0) {
            InlineClassHelperKt.a("alternateText can't be an empty string.");
        }
        builder.k("androidx.compose.foundation.text.inlineContent", str);
        builder.e(str2);
        builder.h();
    }
}
