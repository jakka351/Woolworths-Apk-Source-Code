package kotlin.reflect.jvm.internal.impl.types;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class SimpleType extends UnwrappedType implements SimpleTypeMarker, TypeArgumentListMarker {
    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public abstract SimpleType N0(boolean z);

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: R0, reason: merged with bridge method [inline-methods] */
    public abstract SimpleType P0(TypeAttributes typeAttributes);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<AnnotationDescriptor> it = getAnnotations().iterator();
        while (it.hasNext()) {
            StringsKt.k(sb, "[", DescriptorRenderer.c.q(it.next(), null), "] ");
        }
        sb.append(J0());
        if (!H0().isEmpty()) {
            CollectionsKt.L(H0(), sb, ", ", "<", ">", null, 112);
        }
        if (K0()) {
            sb.append("?");
        }
        return sb.toString();
    }
}
