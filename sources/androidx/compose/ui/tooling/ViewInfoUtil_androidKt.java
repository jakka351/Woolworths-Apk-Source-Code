package androidx.compose.ui.tooling;

import androidx.camera.core.internal.compat.workaround.a;
import androidx.compose.ui.unit.IntRect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-tooling_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ViewInfoUtil_androidKt {
    public static final ArrayList a(List list, Function1 function1) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ViewInfo viewInfo = (ViewInfo) it.next();
            ArrayList<ViewInfo> arrayListA = a(viewInfo.e, function1);
            ArrayList arrayList2 = new ArrayList();
            for (ViewInfo viewInfo2 : arrayListA) {
                CollectionsKt.h(viewInfo2.d == null ? viewInfo2.e : CollectionsKt.Q(viewInfo2), arrayList2);
            }
            CollectionsKt.h(((Boolean) function1.invoke(viewInfo)).booleanValue() ? CollectionsKt.Q(new ViewInfo(viewInfo.f2170a, viewInfo.b, viewInfo.c, viewInfo.d, arrayList2, viewInfo.f)) : CollectionsKt.Q(new ViewInfo("<root>", -1, IntRect.e, null, arrayList2, null)), arrayList);
        }
        return arrayList;
    }

    public static final String b(int i, List list, Function1 function1) {
        String strP = StringsKt.P(i, ".");
        StringBuilder sb = new StringBuilder();
        for (ViewInfo viewInfo : CollectionsKt.u0(new a(new Function1[]{ViewInfoUtil_androidKt$toDebugString$2.h, ViewInfoUtil_androidKt$toDebugString$3.h, ViewInfoUtil_androidKt$toDebugString$4.h}, 2), a(list, function1))) {
            if (viewInfo.d != null) {
                sb.append(strP + '|' + viewInfo.f2170a + ':' + viewInfo.b);
                sb.append('\n');
            } else {
                sb.append(strP + "|<root>");
                sb.append('\n');
            }
            String string = StringsKt.k0(b(i + 1, viewInfo.e, function1)).toString();
            if (string.length() > 0) {
                sb.append(string);
                sb.append('\n');
            }
        }
        return sb.toString();
    }
}
