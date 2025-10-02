package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime-saveable_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MapSaverKt {
    public static final SaverKt$Saver$1 a(final Function1 function1, final Function2 function2) {
        return ListSaverKt.a(new Function1<List<? extends Object>, Object>() { // from class: androidx.compose.runtime.saveable.MapSaverKt$mapSaver$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List list = (List) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (list.size() % 2 != 0) {
                    throw new IllegalStateException("non-zero remainder");
                }
                for (int i = 0; i < list.size(); i += 2) {
                    Object obj2 = list.get(i);
                    Intrinsics.f(obj2, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put((String) obj2, list.get(i + 1));
                }
                return function1.invoke(linkedHashMap);
            }
        }, new Function2<SaverScope, Object, List<? extends Object>>() { // from class: androidx.compose.runtime.saveable.MapSaverKt$mapSaver$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : ((Map) function2.invoke((SaverScope) obj, obj2)).entrySet()) {
                    arrayList.add(entry.getKey());
                    arrayList.add(entry.getValue());
                }
                return arrayList;
            }
        });
    }
}
