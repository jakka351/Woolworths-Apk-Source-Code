package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* loaded from: classes7.dex */
final class SignatureSerializer {
    public static String a(Constructor constructor) {
        StringBuilder sb = new StringBuilder("(");
        Iterator itA = ArrayIteratorKt.a(constructor.getParameterTypes());
        while (itA.hasNext()) {
            Class cls = (Class) itA.next();
            Intrinsics.e(cls);
            sb.append(ReflectClassUtilKt.b(cls));
        }
        sb.append(")V");
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }

    public static String b(Field field) {
        Class<?> type = field.getType();
        Intrinsics.g(type, "getType(...)");
        return ReflectClassUtilKt.b(type);
    }

    public static String c(Method method) {
        StringBuilder sb = new StringBuilder("(");
        Iterator itA = ArrayIteratorKt.a(method.getParameterTypes());
        while (itA.hasNext()) {
            Class cls = (Class) itA.next();
            Intrinsics.e(cls);
            sb.append(ReflectClassUtilKt.b(cls));
        }
        sb.append(")");
        Class<?> returnType = method.getReturnType();
        Intrinsics.g(returnType, "getReturnType(...)");
        sb.append(ReflectClassUtilKt.b(returnType));
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }
}
