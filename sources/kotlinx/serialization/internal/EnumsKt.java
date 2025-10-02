package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class EnumsKt {
    public static final EnumSerializer a(String str, Enum[] values, String[] strArr, Annotation[][] annotationArr) {
        Intrinsics.h(values, "values");
        EnumDescriptor enumDescriptor = new EnumDescriptor(str, values.length);
        int length = values.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Enum r5 = values[i];
            int i3 = i2 + 1;
            String strName = (String) ArraysKt.M(i2, strArr);
            if (strName == null) {
                strName = r5.name();
            }
            enumDescriptor.k(strName, false);
            Annotation[] annotationArr2 = (Annotation[]) ArraysKt.M(i2, annotationArr);
            if (annotationArr2 != null) {
                for (Annotation annotation : annotationArr2) {
                    Intrinsics.h(annotation, "annotation");
                    int i4 = enumDescriptor.d;
                    List[] listArr = enumDescriptor.f;
                    List arrayList = listArr[i4];
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                        listArr[enumDescriptor.d] = arrayList;
                    }
                    arrayList.add(annotation);
                }
            }
            i++;
            i2 = i3;
        }
        EnumSerializer enumSerializer = new EnumSerializer(values, str);
        enumSerializer.b = enumDescriptor;
        return enumSerializer;
    }

    public static final EnumSerializer b(Enum[] values, String str) {
        Intrinsics.h(values, "values");
        return new EnumSerializer(values, str);
    }
}
