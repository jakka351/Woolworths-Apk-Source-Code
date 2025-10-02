package androidx.compose.material;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SwipeableKt {
    public static final float a(float f, float f2, Set set, Function2 function2, float f3, float f4) {
        List listC = c(f, set);
        int size = listC.size();
        if (size == 0) {
            return f2;
        }
        if (size == 1) {
            return ((Number) listC.get(0)).floatValue();
        }
        float fFloatValue = ((Number) listC.get(0)).floatValue();
        float fFloatValue2 = ((Number) listC.get(1)).floatValue();
        return (f2 > f ? f3 > (-f4) && f > ((Number) function2.invoke(Float.valueOf(fFloatValue2), Float.valueOf(fFloatValue))).floatValue() : f3 >= f4 || f >= ((Number) function2.invoke(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).floatValue()) ? fFloatValue2 : fFloatValue;
    }

    public static final Float b(Object obj, Map map) {
        Object next;
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.c(((Map.Entry) next).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (Float) entry.getKey();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object] */
    public static final List c(float f, Set set) {
        Object obj;
        Set set2 = set;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set2) {
            if (((Number) obj2).floatValue() <= f + 0.001d) {
                arrayList.add(obj2);
            }
        }
        Float f2 = null;
        int i = 1;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            float fFloatValue = ((Number) obj).floatValue();
            int I = CollectionsKt.I(arrayList);
            if (1 <= I) {
                int i2 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i2);
                    float fFloatValue2 = ((Number) obj3).floatValue();
                    if (Float.compare(fFloatValue, fFloatValue2) < 0) {
                        obj = obj3;
                        fFloatValue = fFloatValue2;
                    }
                    if (i2 == I) {
                        break;
                    }
                    i2++;
                }
            }
        }
        Float f3 = (Float) obj;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj4 : set2) {
            if (((Number) obj4).floatValue() >= f - 0.001d) {
                arrayList2.add(obj4);
            }
        }
        if (!arrayList2.isEmpty()) {
            ?? r13 = arrayList2.get(0);
            float fFloatValue3 = ((Number) r13).floatValue();
            int I2 = CollectionsKt.I(arrayList2);
            boolean z = r13;
            if (1 <= I2) {
                while (true) {
                    Object obj5 = arrayList2.get(i);
                    float fFloatValue4 = ((Number) obj5).floatValue();
                    r13 = z;
                    if (Float.compare(fFloatValue3, fFloatValue4) > 0) {
                        r13 = obj5;
                        fFloatValue3 = fFloatValue4;
                    }
                    if (i == I2) {
                        break;
                    }
                    i++;
                    z = r13;
                }
            }
            f2 = r13;
        }
        Float f4 = f2;
        if (f3 == null) {
            return CollectionsKt.S(f4);
        }
        if (f4 != null && f3.floatValue() != f4.floatValue()) {
            return CollectionsKt.R(f3, f4);
        }
        return CollectionsKt.Q(f3);
    }
}
