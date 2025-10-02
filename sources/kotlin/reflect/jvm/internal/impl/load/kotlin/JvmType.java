package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* loaded from: classes7.dex */
public abstract class JvmType {

    /* renamed from: a, reason: collision with root package name */
    public static final Primitive f24471a = new Primitive(JvmPrimitiveType.BOOLEAN);
    public static final Primitive b = new Primitive(JvmPrimitiveType.CHAR);
    public static final Primitive c = new Primitive(JvmPrimitiveType.BYTE);
    public static final Primitive d = new Primitive(JvmPrimitiveType.SHORT);
    public static final Primitive e = new Primitive(JvmPrimitiveType.INT);
    public static final Primitive f = new Primitive(JvmPrimitiveType.FLOAT);
    public static final Primitive g = new Primitive(JvmPrimitiveType.LONG);
    public static final Primitive h = new Primitive(JvmPrimitiveType.DOUBLE);

    public static final class Array extends JvmType {
        public final JvmType i;

        public Array(JvmType elementType) {
            Intrinsics.h(elementType, "elementType");
            this.i = elementType;
        }
    }

    public static final class Companion {
    }

    public static final class Object extends JvmType {
        public final String i;

        public Object(String internalName) {
            Intrinsics.h(internalName, "internalName");
            this.i = internalName;
        }
    }

    public static final class Primitive extends JvmType {
        public final JvmPrimitiveType i;

        public Primitive(JvmPrimitiveType jvmPrimitiveType) {
            this.i = jvmPrimitiveType;
        }
    }

    public final String toString() {
        return JvmTypeFactoryImpl.c(this);
    }
}
