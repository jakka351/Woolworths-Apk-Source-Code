package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DescriptorBasedTypeSignatureMappingKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String a(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r3, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration r4) {
        /*
            java.lang.String r0 = "klass"
            kotlin.jvm.internal.Intrinsics.h(r3, r0)
            java.lang.String r0 = "typeMappingConfiguration"
            kotlin.jvm.internal.Intrinsics.h(r4, r0)
            r4.b(r3)
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r0 = r3.e()
            java.lang.String r1 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.Intrinsics.g(r0, r1)
            kotlin.reflect.jvm.internal.impl.name.Name r1 = r3.getName()
            if (r1 == 0) goto L23
            kotlin.reflect.jvm.internal.impl.name.Name r2 = kotlin.reflect.jvm.internal.impl.name.SpecialNames.f24503a
            boolean r2 = r1.e
            if (r2 != 0) goto L23
            goto L25
        L23:
            kotlin.reflect.jvm.internal.impl.name.Name r1 = kotlin.reflect.jvm.internal.impl.name.SpecialNames.c
        L25:
            java.lang.String r1 = r1.c()
            boolean r2 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
            if (r2 == 0) goto L5b
            kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) r0
            kotlin.reflect.jvm.internal.impl.name.FqName r3 = r0.d()
            kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe r4 = r3.f24500a
            boolean r4 = r4.c()
            if (r4 == 0) goto L3c
            return r1
        L3c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe r3 = r3.f24500a
            java.lang.String r3 = r3.f24501a
            r0 = 46
            r2 = 47
            java.lang.String r3 = kotlin.text.StringsKt.R(r3, r0, r2)
            r4.append(r3)
            r4.append(r2)
            r4.append(r1)
            java.lang.String r3 = r4.toString()
            return r3
        L5b:
            boolean r2 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
            if (r2 == 0) goto L63
            r2 = r0
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r2
            goto L64
        L63:
            r2 = 0
        L64:
            if (r2 == 0) goto L82
            r4.a(r2)
            java.lang.String r3 = a(r2, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r3 = 36
            r4.append(r3)
            r4.append(r1)
            java.lang.String r3 = r4.toString()
            return r3
        L82:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected container: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " for "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.DescriptorBasedTypeSignatureMappingKt.a(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d6 A[EDGE_INSN: B:79:0x01d6->B:83:0x0201 BREAK  A[LOOP:1: B:75:0x01c2->B:185:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(kotlin.reflect.jvm.internal.impl.types.KotlinType r23, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode r24, kotlin.jvm.functions.Function3 r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1104
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.DescriptorBasedTypeSignatureMappingKt.b(kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode, kotlin.jvm.functions.Function3):java.lang.Object");
    }
}
