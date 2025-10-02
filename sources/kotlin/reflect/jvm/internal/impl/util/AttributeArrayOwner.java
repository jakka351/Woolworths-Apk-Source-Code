package kotlin.reflect.jvm.internal.impl.util;

import androidx.camera.core.impl.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.types.TypeAttribute;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;

@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class AttributeArrayOwner<K, T> extends AbstractArrayMapOwner<K, T> {
    public ArrayMap d;

    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    public final ArrayMap b() {
        return this.d;
    }

    public final String g(ArrayMap arrayMap, int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Race condition happened, the size of ArrayMap is " + i + " but it isn't an `" + str + '`');
        sb.append('\n');
        StringBuilder sb2 = new StringBuilder("Type: ");
        sb2.append(arrayMap.getClass());
        sb.append(sb2.toString());
        sb.append('\n');
        StringBuilder sb3 = new StringBuilder();
        ConcurrentHashMap concurrentHashMap = d().f24648a;
        sb3.append("[\n");
        ArrayList arrayList = new ArrayList(CollectionsKt.s(arrayMap, 10));
        int i2 = 0;
        for (T t : arrayMap) {
            int i3 = i2 + 1;
            T t2 = null;
            if (i2 < 0) {
                CollectionsKt.z0();
                throw null;
            }
            Iterator<T> it = concurrentHashMap.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    T next = it.next();
                    if (((Number) ((Map.Entry) next).getValue()).intValue() == i2) {
                        t2 = next;
                        break;
                    }
                }
            }
            sb3.append("  " + ((Map.Entry) t2) + '[' + i2 + "]: " + t);
            sb3.append('\n');
            arrayList.add(sb3);
            i2 = i3;
        }
        sb.append("Content: " + b.r(sb3, "]", '\n'));
        sb.append('\n');
        return sb.toString();
    }

    public final void h(String str, TypeAttribute typeAttribute) {
        TypeAttributes.Companion companionD = d();
        int iA = companionD.a(companionD.f24648a, str, new TypeRegistry$$Lambda$0(companionD));
        int iB = this.d.b();
        if (iB == 0) {
            ArrayMap arrayMap = this.d;
            if (!(arrayMap instanceof EmptyArrayMap)) {
                throw new IllegalStateException(g(arrayMap, 0, "EmptyArrayMap"));
            }
            this.d = new OneElementArrayMap(typeAttribute, iA);
            return;
        }
        if (iB == 1) {
            ArrayMap arrayMap2 = this.d;
            try {
                Intrinsics.f(arrayMap2, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                OneElementArrayMap oneElementArrayMap = (OneElementArrayMap) arrayMap2;
                if (oneElementArrayMap.g() == iA) {
                    this.d = new OneElementArrayMap(typeAttribute, iA);
                    return;
                } else {
                    ArrayMapImpl arrayMapImpl = new ArrayMapImpl();
                    arrayMapImpl.d(oneElementArrayMap.g(), oneElementArrayMap.h());
                    this.d = arrayMapImpl;
                }
            } catch (ClassCastException e) {
                throw new IllegalStateException(g(arrayMap2, 1, "OneElementArrayMap"), e);
            }
        }
        this.d.d(iA, typeAttribute);
    }
}
