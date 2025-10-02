package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;

/* loaded from: classes.dex */
public interface JavaPropertyInitializerEvaluator {

    public static final class DoNothing implements JavaPropertyInitializerEvaluator {

        /* renamed from: a, reason: collision with root package name */
        public static final DoNothing f24418a = new DoNothing();

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator
        public final void a(JavaField javaField, PropertyDescriptor descriptor) {
            Intrinsics.h(descriptor, "descriptor");
        }
    }

    void a(JavaField javaField, PropertyDescriptor propertyDescriptor);
}
