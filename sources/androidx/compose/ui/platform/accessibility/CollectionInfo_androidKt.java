package androidx.compose.ui.platform.accessibility;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.CollectionItemInfo;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CollectionInfo_androidKt {
    public static final boolean a(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = EmptyList.d;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int I = CollectionsKt.I(arrayList);
                int i = 0;
                while (i < I) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    SemanticsNode semanticsNode = (SemanticsNode) obj2;
                    SemanticsNode semanticsNode2 = (SemanticsNode) obj;
                    float fAbs = Math.abs(Float.intBitsToFloat((int) (semanticsNode2.e().d() >> 32)) - Float.intBitsToFloat((int) (semanticsNode.e().d() >> 32)));
                    float fAbs2 = Math.abs(Float.intBitsToFloat((int) (semanticsNode2.e().d() & 4294967295L)) - Float.intBitsToFloat((int) (semanticsNode.e().d() & 4294967295L)));
                    arrayList2.add(new Offset((Float.floatToRawIntBits(fAbs) << 32) | (Float.floatToRawIntBits(fAbs2) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((Offset) CollectionsKt.D(list)).f1751a;
            } else {
                if (list.isEmpty()) {
                    ListUtilsKt.c("Empty collection can't be reduced.");
                }
                Object objD = CollectionsKt.D(list);
                int I2 = CollectionsKt.I(list);
                if (1 <= I2) {
                    int i2 = 1;
                    while (true) {
                        objD = new Offset(Offset.h(((Offset) objD).f1751a, ((Offset) list.get(i2)).f1751a));
                        if (i2 == I2) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((Offset) objD).f1751a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final void b(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (((CollectionItemInfo) SemanticsConfigurationKt.a(semanticsNode.i(), SemanticsProperties.g)) != null) {
            accessibilityNodeInfoCompat.o(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.a(0, 0, 0, 0, false, ((Boolean) semanticsNode.i().h(SemanticsProperties.G, CollectionInfo_androidKt$toAccessibilityCollectionItemInfo$1.h)).booleanValue()));
        }
        SemanticsNode semanticsNodeJ = semanticsNode.j();
        if (semanticsNodeJ == null || SemanticsConfigurationKt.a(semanticsNodeJ.i(), SemanticsProperties.e) == null) {
            return;
        }
        CollectionInfo collectionInfo = (CollectionInfo) SemanticsConfigurationKt.a(semanticsNodeJ.i(), SemanticsProperties.f);
        if (collectionInfo == null || (collectionInfo.f2010a >= 0 && collectionInfo.b >= 0)) {
            if (semanticsNode.i().d.c(SemanticsProperties.G)) {
                ArrayList arrayList = new ArrayList();
                List listH = SemanticsNode.h(4, semanticsNodeJ);
                int size = listH.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    SemanticsNode semanticsNode2 = (SemanticsNode) listH.get(i2);
                    if (semanticsNode2.i().d.c(SemanticsProperties.G)) {
                        arrayList.add(semanticsNode2);
                        if (semanticsNode2.c.L() < semanticsNode.c.L()) {
                            i++;
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                boolean zA = a(arrayList);
                accessibilityNodeInfoCompat.o(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.a(zA ? 0 : i, 1, zA ? i : 0, 1, false, ((Boolean) semanticsNode.i().h(SemanticsProperties.G, CollectionInfo_androidKt$setCollectionItemInfo$itemInfo$1.h)).booleanValue()));
            }
        }
    }
}
