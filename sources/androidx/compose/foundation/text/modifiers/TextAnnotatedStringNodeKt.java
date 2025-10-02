package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.LinkAnnotation;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextAnnotatedStringNodeKt {
    public static final boolean a(AnnotatedString annotatedString) {
        int length = annotatedString.e.length();
        List list = annotatedString.d;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AnnotatedString.Range range = (AnnotatedString.Range) list.get(i);
                if ((range.f2032a instanceof LinkAnnotation) && AnnotatedStringKt.b(0, length, range.b, range.c)) {
                    return true;
                }
            }
        }
        return false;
    }
}
