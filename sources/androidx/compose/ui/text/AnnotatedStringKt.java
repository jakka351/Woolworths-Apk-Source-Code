package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AnnotatedStringKt {

    /* renamed from: a, reason: collision with root package name */
    public static final AnnotatedString f2033a = new AnnotatedString("");

    public static final List a(AnnotatedString annotatedString, int i, int i2, Function1 function1) {
        List list;
        if (i == i2 || (list = annotatedString.d) == null) {
            return null;
        }
        if (i != 0 || i2 < annotatedString.e.length()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                AnnotatedString.Range range = (AnnotatedString.Range) list.get(i3);
                if ((function1 != null ? ((Boolean) ((AnnotatedStringKt$substringWithoutParagraphStyles$1) function1).invoke(range.f2032a)).booleanValue() : true) && b(i, i2, range.b, range.c)) {
                    arrayList.add(new AnnotatedString.Range(RangesKt.c(range.b, i, i2) - i, RangesKt.c(range.c, i, i2) - i, (AnnotatedString.Annotation) range.f2032a, range.d));
                }
            }
            return arrayList;
        }
        if (function1 == null) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Object obj = list.get(i4);
            if (((Boolean) ((AnnotatedStringKt$substringWithoutParagraphStyles$1) function1).invoke(((AnnotatedString.Range) obj).f2032a)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final boolean b(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
