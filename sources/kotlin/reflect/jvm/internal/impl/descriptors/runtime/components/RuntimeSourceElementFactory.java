package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import androidx.constraintlayout.core.state.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement;

/* loaded from: classes.dex */
public final class RuntimeSourceElementFactory implements JavaSourceElementFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final RuntimeSourceElementFactory f24370a = new RuntimeSourceElementFactory();

    /* loaded from: classes7.dex */
    public static final class RuntimeSourceElement implements JavaSourceElement {
        public final ReflectJavaElement b;

        public RuntimeSourceElement(ReflectJavaElement javaElement) {
            Intrinsics.h(javaElement, "javaElement");
            this.b = javaElement;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement
        public final ReflectJavaElement b() {
            return this.b;
        }

        public final ReflectJavaElement c() {
            return this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            a.x(RuntimeSourceElement.class, sb, ": ");
            sb.append(this.b);
            return sb.toString();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory
    public final RuntimeSourceElement a(JavaElement javaElement) {
        Intrinsics.h(javaElement, "javaElement");
        return new RuntimeSourceElement((ReflectJavaElement) javaElement);
    }
}
