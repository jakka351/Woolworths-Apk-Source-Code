package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Color;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VectorKt {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1820a = 0;

    static {
        int i = Color.l;
    }

    public static final List a(String str) {
        if (str != null) {
            PathParser pathParser = new PathParser();
            ArrayList arrayList = pathParser.f1818a;
            if (arrayList == null) {
                arrayList = new ArrayList();
                pathParser.f1818a = arrayList;
            } else {
                arrayList.clear();
            }
            pathParser.a(str, arrayList);
            ArrayList arrayList2 = pathParser.f1818a;
            if (arrayList2 != null) {
                return arrayList2;
            }
        }
        return EmptyList.d;
    }
}
