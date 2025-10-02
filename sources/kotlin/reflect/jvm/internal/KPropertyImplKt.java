package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class KPropertyImplKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0104  */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.reflect.jvm.internal.calls.Caller a(kotlin.reflect.jvm.internal.KPropertyImpl.Accessor r7, boolean r8) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KPropertyImplKt.a(kotlin.reflect.jvm.internal.KPropertyImpl$Accessor, boolean):kotlin.reflect.jvm.internal.calls.Caller");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.reflect.jvm.internal.calls.CallerImpl b(kotlin.reflect.jvm.internal.KPropertyImpl.Accessor r4, boolean r5, java.lang.reflect.Field r6) {
        /*
            kotlin.reflect.jvm.internal.KPropertyImpl r0 = r4.D()
            kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor r0 = r0.t()
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r1 = r0.e()
            java.lang.String r2 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.Intrinsics.g(r1, r2)
            boolean r2 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.l(r1)
            r3 = 1
            if (r2 != 0) goto L19
            goto L3c
        L19:
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r1 = r1.e()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r2 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.e
            boolean r2 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.n(r1, r2)
            if (r2 != 0) goto L2d
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r2 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.h
            boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.n(r1, r2)
            if (r1 == 0) goto L46
        L2d:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor
            if (r1 == 0) goto L3c
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor r0 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor) r0
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r0 = r0.D
            boolean r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.d(r0)
            if (r0 == 0) goto L3c
            goto L46
        L3c:
            int r0 = r6.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L84
        L46:
            java.lang.String r0 = "field"
            if (r5 == 0) goto L63
            boolean r5 = r4.A()
            if (r5 == 0) goto L5a
            kotlin.reflect.jvm.internal.calls.CallerImpl$FieldGetter$BoundInstance r5 = new kotlin.reflect.jvm.internal.calls.CallerImpl$FieldGetter$BoundInstance
            java.lang.Object r4 = d(r4)
            r5.<init>(r4, r6)
            return r5
        L5a:
            kotlin.reflect.jvm.internal.calls.CallerImpl$FieldGetter$Instance r4 = new kotlin.reflect.jvm.internal.calls.CallerImpl$FieldGetter$Instance
            kotlin.jvm.internal.Intrinsics.h(r6, r0)
            r4.<init>(r6, r3)
            return r4
        L63:
            boolean r5 = r4.A()
            if (r5 == 0) goto L77
            kotlin.reflect.jvm.internal.calls.CallerImpl$FieldSetter$BoundInstance r5 = new kotlin.reflect.jvm.internal.calls.CallerImpl$FieldSetter$BoundInstance
            boolean r0 = c(r4)
            java.lang.Object r4 = d(r4)
            r5.<init>(r6, r0, r4)
            return r5
        L77:
            kotlin.reflect.jvm.internal.calls.CallerImpl$FieldSetter$Instance r5 = new kotlin.reflect.jvm.internal.calls.CallerImpl$FieldSetter$Instance
            boolean r4 = c(r4)
            kotlin.jvm.internal.Intrinsics.h(r6, r0)
            r5.<init>(r6, r4, r3)
            return r5
        L84:
            kotlin.reflect.jvm.internal.KPropertyImpl r0 = r4.D()
            kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor r0 = r0.t()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r0 = r0.getAnnotations()
            kotlin.reflect.jvm.internal.impl.name.FqName r1 = kotlin.reflect.jvm.internal.UtilKt.f24294a
            boolean r0 = r0.m2(r1)
            r1 = 0
            if (r0 == 0) goto Lc7
            if (r5 == 0) goto Lad
            boolean r4 = r4.A()
            if (r4 == 0) goto La7
            kotlin.reflect.jvm.internal.calls.CallerImpl$FieldGetter$BoundJvmStaticInObject r4 = new kotlin.reflect.jvm.internal.calls.CallerImpl$FieldGetter$BoundJvmStaticInObject
            r4.<init>(r6, r1)
            return r4
        La7:
            kotlin.reflect.jvm.internal.calls.CallerImpl$FieldGetter$JvmStaticInObject r4 = new kotlin.reflect.jvm.internal.calls.CallerImpl$FieldGetter$JvmStaticInObject
            r4.<init>(r6, r3)
            return r4
        Lad:
            boolean r5 = r4.A()
            if (r5 == 0) goto Lbd
            kotlin.reflect.jvm.internal.calls.CallerImpl$FieldSetter$BoundJvmStaticInObject r5 = new kotlin.reflect.jvm.internal.calls.CallerImpl$FieldSetter$BoundJvmStaticInObject
            boolean r4 = c(r4)
            r5.<init>(r6, r4, r1)
            return r5
        Lbd:
            kotlin.reflect.jvm.internal.calls.CallerImpl$FieldSetter$JvmStaticInObject r5 = new kotlin.reflect.jvm.internal.calls.CallerImpl$FieldSetter$JvmStaticInObject
            boolean r4 = c(r4)
            r5.<init>(r6, r4, r3)
            return r5
        Lc7:
            if (r5 == 0) goto Lcf
            kotlin.reflect.jvm.internal.calls.CallerImpl$FieldGetter$Static r4 = new kotlin.reflect.jvm.internal.calls.CallerImpl$FieldGetter$Static
            r4.<init>(r6, r1)
            return r4
        Lcf:
            kotlin.reflect.jvm.internal.calls.CallerImpl$FieldSetter$Static r5 = new kotlin.reflect.jvm.internal.calls.CallerImpl$FieldSetter$Static
            boolean r4 = c(r4)
            r5.<init>(r6, r4, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KPropertyImplKt.b(kotlin.reflect.jvm.internal.KPropertyImpl$Accessor, boolean, java.lang.reflect.Field):kotlin.reflect.jvm.internal.calls.CallerImpl");
    }

    public static final boolean c(KPropertyImpl.Accessor accessor) {
        return !TypeUtils.f(accessor.D().t().getType());
    }

    public static final Object d(KPropertyImpl.Accessor accessor) {
        KPropertyImpl kPropertyImplD = accessor.D();
        return ValueClassAwareCallerKt.a(kPropertyImplD.m, kPropertyImplD.t());
    }
}
