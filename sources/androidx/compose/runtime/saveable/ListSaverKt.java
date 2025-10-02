package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime-saveable_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ListSaverKt {
    public static final SaverKt$Saver$1 a(Function1 function1, final Function2 function2) {
        Function2<SaverScope, Object, Object> function22 = new Function2<SaverScope, Object, Object>(function2) { // from class: androidx.compose.runtime.saveable.ListSaverKt$listSaver$1
            public final /* synthetic */ Lambda h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
                this.h = (Lambda) function2;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.Lambda] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                SaverScope saverScope = (SaverScope) obj;
                List list = (List) this.h.invoke(saverScope, obj2);
                List list2 = list;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    Object obj3 = list.get(i);
                    if (obj3 != null && !saverScope.a(obj3)) {
                        throw new IllegalArgumentException("item can't be saved");
                    }
                }
                if (list2.isEmpty()) {
                    return null;
                }
                return new ArrayList(list2);
            }
        };
        TypeIntrinsics.d(1, function1);
        SaverKt$Saver$1 saverKt$Saver$1 = SaverKt.f1701a;
        return new SaverKt$Saver$1(function1, function22);
    }
}
