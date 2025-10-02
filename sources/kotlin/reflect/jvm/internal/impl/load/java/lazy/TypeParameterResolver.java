package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;

/* loaded from: classes.dex */
public interface TypeParameterResolver {

    public static final class EMPTY implements TypeParameterResolver {

        /* renamed from: a, reason: collision with root package name */
        public static final EMPTY f24428a = new EMPTY();

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver
        public final TypeParameterDescriptor a(JavaTypeParameter javaTypeParameter) {
            Intrinsics.h(javaTypeParameter, "javaTypeParameter");
            return null;
        }
    }

    TypeParameterDescriptor a(JavaTypeParameter javaTypeParameter);
}
