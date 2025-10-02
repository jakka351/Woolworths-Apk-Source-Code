package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;

/* loaded from: classes.dex */
public interface JavaResolverCache {

    /* renamed from: a, reason: collision with root package name */
    public static final JavaResolverCache f24419a = new AnonymousClass1();

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache$1, reason: invalid class name */
    public static class AnonymousClass1 implements JavaResolverCache {
        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
        public final void a(JavaField javaField, PropertyDescriptor propertyDescriptor) {
            if (propertyDescriptor != null) {
                return;
            }
            Object[] objArr = new Object[3];
            switch (6) {
                case 1:
                    objArr[0] = "member";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (6) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    void a(JavaField javaField, PropertyDescriptor propertyDescriptor);
}
