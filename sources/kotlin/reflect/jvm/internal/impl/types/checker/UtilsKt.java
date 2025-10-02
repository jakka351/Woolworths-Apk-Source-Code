package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class UtilsKt {
    public static final String a(TypeConstructor typeConstructor) {
        StringBuilder sb = new StringBuilder();
        b(sb, "type: " + typeConstructor);
        b(sb, "hashCode: " + typeConstructor.hashCode());
        b(sb, "javaClass: " + typeConstructor.getClass().getCanonicalName());
        for (DeclarationDescriptor declarationDescriptorC = typeConstructor.c(); declarationDescriptorC != null; declarationDescriptorC = declarationDescriptorC.e()) {
            b(sb, "fqName: " + DescriptorRenderer.f24521a.z(declarationDescriptorC));
            b(sb, "javaClass: " + declarationDescriptorC.getClass().getCanonicalName());
        }
        return sb.toString();
    }

    public static final void b(StringBuilder sb, String str) {
        Intrinsics.h(str, "<this>");
        sb.append(str);
        sb.append('\n');
    }
}
