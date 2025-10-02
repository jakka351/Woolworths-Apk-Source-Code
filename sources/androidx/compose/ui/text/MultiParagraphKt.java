package androidx.compose.ui.text;

import YU.a;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.util.ListUtilsKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class MultiParagraphKt {
    public static final int a(int i, List list) {
        int i2;
        int i3 = ((ParagraphInfo) CollectionsKt.O(list)).c;
        if (i > ((ParagraphInfo) CollectionsKt.O(list)).c) {
            InlineClassHelperKt.a("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            ParagraphInfo paragraphInfo = (ParagraphInfo) list.get(i2);
            char c = paragraphInfo.b > i ? (char) 1 : paragraphInfo.c <= i ? (char) 65535 : (char) 0;
            if (c >= 0) {
                if (c <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        StringBuilder sbR = a.r(i2, "Found paragraph index ", " should be in range [0, ");
        sbR.append(list.size());
        sbR.append(").\nDebug info: index=");
        sbR.append(i);
        sbR.append(", paragraphs=[");
        sbR.append(ListUtilsKt.b(list, null, MultiParagraphKt$findParagraphByIndex$2$1.h, 31));
        sbR.append(']');
        InlineClassHelperKt.a(sbR.toString());
        return i2;
    }

    public static final int b(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            ParagraphInfo paragraphInfo = (ParagraphInfo) list.get(i3);
            char c = paragraphInfo.d > i ? (char) 1 : paragraphInfo.e <= i ? (char) 65535 : (char) 0;
            if (c < 0) {
                i2 = i3 + 1;
            } else {
                if (c <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int c(ArrayList arrayList, float f) {
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            return 0;
        }
        if (f >= ((ParagraphInfo) CollectionsKt.O(arrayList)).g) {
            return CollectionsKt.I(arrayList);
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i2);
            char c = paragraphInfo.f > f ? (char) 1 : paragraphInfo.g <= f ? (char) 65535 : (char) 0;
            if (c < 0) {
                i = i2 + 1;
            } else {
                if (c <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void d(ArrayList arrayList, long j, Function1 function1) {
        int size = arrayList.size();
        for (int iA = a(TextRange.f(j), arrayList); iA < size; iA++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(iA);
            if (paragraphInfo.b >= TextRange.e(j)) {
                return;
            }
            if (paragraphInfo.b != paragraphInfo.c) {
                function1.invoke(paragraphInfo);
            }
        }
    }
}
