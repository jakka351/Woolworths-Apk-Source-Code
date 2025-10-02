package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ConstantValueFactory {
    public static ArrayValue a(List list, ModuleDescriptor moduleDescriptor, final PrimitiveType primitiveType) {
        List listG0 = CollectionsKt.G0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listG0.iterator();
        while (it.hasNext()) {
            ConstantValue constantValueC = c(it.next(), null);
            if (constantValueC != null) {
                arrayList.add(constantValueC);
            }
        }
        return moduleDescriptor != null ? new TypedArrayValue(arrayList, moduleDescriptor.p().r(primitiveType)) : new ArrayValue(arrayList, new Function1(primitiveType) { // from class: kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory$$Lambda$0
            public final PrimitiveType d;

            {
                this.d = primitiveType;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ModuleDescriptor it2 = (ModuleDescriptor) obj;
                Intrinsics.h(it2, "it");
                return it2.p().r(this.d);
            }
        });
    }

    public static TypedArrayValue b(List list, KotlinType kotlinType) {
        return new TypedArrayValue(list, kotlinType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.ArrayList] */
    public static ConstantValue c(Object obj, ModuleDescriptorImpl moduleDescriptorImpl) {
        ?? Q;
        if (obj instanceof Byte) {
            return new ByteValue(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new ShortValue(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new IntValue(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new LongValue(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new CharValue((Character) obj);
        }
        if (obj instanceof Float) {
            return new FloatValue(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new DoubleValue(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new BooleanValue((Boolean) obj);
        }
        if (obj instanceof String) {
            return new StringValue(obj);
        }
        if (obj instanceof byte[]) {
            return a(ArraysKt.g0((byte[]) obj), moduleDescriptorImpl, PrimitiveType.k);
        }
        if (obj instanceof short[]) {
            return a(ArraysKt.m0((short[]) obj), moduleDescriptorImpl, PrimitiveType.l);
        }
        if (obj instanceof int[]) {
            return a(ArraysKt.j0((int[]) obj), moduleDescriptorImpl, PrimitiveType.m);
        }
        if (obj instanceof long[]) {
            return a(ArraysKt.k0((long[]) obj), moduleDescriptorImpl, PrimitiveType.o);
        }
        if (!(obj instanceof char[])) {
            if (obj instanceof float[]) {
                return a(ArraysKt.i0((float[]) obj), moduleDescriptorImpl, PrimitiveType.n);
            }
            if (obj instanceof double[]) {
                return a(ArraysKt.h0((double[]) obj), moduleDescriptorImpl, PrimitiveType.p);
            }
            if (obj instanceof boolean[]) {
                return a(ArraysKt.n0((boolean[]) obj), moduleDescriptorImpl, PrimitiveType.i);
            }
            if (obj == null) {
                return new NullValue(null);
            }
            return null;
        }
        char[] cArr = (char[]) obj;
        int length = cArr.length;
        if (length != 0) {
            if (length != 1) {
                Q = new ArrayList(cArr.length);
                for (char c : cArr) {
                    Q.add(Character.valueOf(c));
                }
            } else {
                Q = CollectionsKt.Q(Character.valueOf(cArr[0]));
            }
        } else {
            Q = EmptyList.d;
        }
        return a(Q, moduleDescriptorImpl, PrimitiveType.j);
    }
}
