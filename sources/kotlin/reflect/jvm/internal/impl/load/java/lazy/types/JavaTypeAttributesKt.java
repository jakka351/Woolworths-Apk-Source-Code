package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.collections.SetsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class JavaTypeAttributesKt {
    public static JavaTypeAttributes a(TypeUsage typeUsage, boolean z, LazyJavaTypeParameterDescriptor lazyJavaTypeParameterDescriptor, int i) {
        boolean z2 = (i & 1) != 0 ? false : z;
        boolean z3 = (i & 2) == 0;
        if ((i & 4) != 0) {
            lazyJavaTypeParameterDescriptor = null;
        }
        return new JavaTypeAttributes(typeUsage, z3, z2, lazyJavaTypeParameterDescriptor != null ? SetsKt.i(lazyJavaTypeParameterDescriptor) : null, 34);
    }
}
