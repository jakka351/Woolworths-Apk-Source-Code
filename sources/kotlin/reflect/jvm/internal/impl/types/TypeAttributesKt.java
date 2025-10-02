package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class TypeAttributesKt {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.reflect.jvm.internal.impl.types.TypeAttributes a(kotlin.reflect.jvm.internal.impl.types.TypeAttributes r5, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.h(r5, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r0 = kotlin.reflect.jvm.internal.impl.types.AnnotationsTypeAttributeKt.a(r5)
            if (r0 != r6) goto Lc
            return r5
        Lc:
            kotlin.reflect.jvm.internal.impl.util.NullableArrayMapAccessor r0 = kotlin.reflect.jvm.internal.impl.types.AnnotationsTypeAttributeKt.b
            kotlin.reflect.KProperty[] r1 = kotlin.reflect.jvm.internal.impl.types.AnnotationsTypeAttributeKt.f24602a
            r2 = 0
            r1 = r1[r2]
            java.lang.Object r0 = r0.getValue(r5, r1)
            kotlin.reflect.jvm.internal.impl.types.AnnotationsTypeAttribute r0 = (kotlin.reflect.jvm.internal.impl.types.AnnotationsTypeAttribute) r0
            if (r0 == 0) goto L5f
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L22
            goto L50
        L22:
            kotlin.reflect.jvm.internal.impl.util.ArrayMap r1 = r5.d
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L44
            java.lang.Object r3 = r1.next()
            r4 = r3
            kotlin.reflect.jvm.internal.impl.types.TypeAttribute r4 = (kotlin.reflect.jvm.internal.impl.types.TypeAttribute) r4
            boolean r4 = kotlin.jvm.internal.Intrinsics.c(r4, r0)
            if (r4 != 0) goto L2d
            r2.add(r3)
            goto L2d
        L44:
            int r0 = r2.size()
            kotlin.reflect.jvm.internal.impl.util.ArrayMap r1 = r5.d
            int r1 = r1.b()
            if (r0 != r1) goto L52
        L50:
            r0 = r5
            goto L5b
        L52:
            kotlin.reflect.jvm.internal.impl.types.TypeAttributes$Companion r0 = kotlin.reflect.jvm.internal.impl.types.TypeAttributes.e
            r0.getClass()
            kotlin.reflect.jvm.internal.impl.types.TypeAttributes r0 = kotlin.reflect.jvm.internal.impl.types.TypeAttributes.Companion.c(r2)
        L5b:
            if (r0 != 0) goto L5e
            goto L5f
        L5e:
            r5 = r0
        L5f:
            java.util.Iterator r0 = r6.iterator()
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L70
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L70
            goto L87
        L70:
            kotlin.reflect.jvm.internal.impl.types.AnnotationsTypeAttribute r0 = new kotlin.reflect.jvm.internal.impl.types.AnnotationsTypeAttribute
            r0.<init>(r6)
            kotlin.reflect.jvm.internal.impl.types.TypeAttributes$Companion r6 = kotlin.reflect.jvm.internal.impl.types.TypeAttributes.e
            kotlin.reflect.KClass r1 = r0.b()
            int r6 = r6.b(r1)
            kotlin.reflect.jvm.internal.impl.util.ArrayMap r1 = r5.d
            java.lang.Object r6 = r1.get(r6)
            if (r6 == 0) goto L88
        L87:
            return r5
        L88:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L98
            kotlin.reflect.jvm.internal.impl.types.TypeAttributes r5 = new kotlin.reflect.jvm.internal.impl.types.TypeAttributes
            java.util.List r6 = kotlin.collections.CollectionsKt.Q(r0)
            r5.<init>(r6)
            return r5
        L98:
            java.util.List r5 = kotlin.collections.CollectionsKt.G0(r5)
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.ArrayList r5 = kotlin.collections.CollectionsKt.d0(r0, r5)
            kotlin.reflect.jvm.internal.impl.types.TypeAttributes r5 = kotlin.reflect.jvm.internal.impl.types.TypeAttributes.Companion.c(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt.a(kotlin.reflect.jvm.internal.impl.types.TypeAttributes, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations):kotlin.reflect.jvm.internal.impl.types.TypeAttributes");
    }

    public static final TypeAttributes b(Annotations annotations) {
        Intrinsics.h(annotations, "<this>");
        return DefaultTypeAttributeTranslator.f24604a.a(annotations);
    }
}
