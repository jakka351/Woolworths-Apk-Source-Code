package androidx.compose.runtime;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectList;
import androidx.compose.runtime.collection.MultiValueMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/NestedContentMap;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class NestedContentMap {

    /* renamed from: a, reason: collision with root package name */
    public final MutableScatterMap f1648a = new MutableScatterMap();
    public final MutableScatterMap b = new MutableScatterMap();

    public final void a(final MovableContentStateReference movableContentStateReference) {
        Object objE = this.b.e(movableContentStateReference);
        if (objE != null) {
            boolean z = objE instanceof MutableObjectList;
            MutableScatterMap mutableScatterMap = this.f1648a;
            if (!z) {
                MultiValueMap.c(mutableScatterMap, (MovableContent) objE, new Function1<NestedMovableContent, Boolean>() { // from class: androidx.compose.runtime.NestedContentMap$usedContainer$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(Intrinsics.c(((NestedMovableContent) obj).b, movableContentStateReference));
                    }
                });
                return;
            }
            ObjectList objectList = (ObjectList) objE;
            Object[] objArr = objectList.f694a;
            int i = objectList.b;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = objArr[i2];
                Intrinsics.f(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                MultiValueMap.c(mutableScatterMap, (MovableContent) obj, new Function1<NestedMovableContent, Boolean>() { // from class: androidx.compose.runtime.NestedContentMap$usedContainer$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(Intrinsics.c(((NestedMovableContent) obj2).b, movableContentStateReference));
                    }
                });
            }
        }
    }
}
