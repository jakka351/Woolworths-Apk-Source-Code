package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.JvmFunctionSignature;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "", "KotlinProperty", "JavaMethodProperty", "JavaField", "MappedKotlinProperty", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class JvmPropertySignature {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class JavaField extends JvmPropertySignature {

        /* renamed from: a, reason: collision with root package name */
        public final Field f24284a;

        public JavaField(Field field) {
            Intrinsics.h(field, "field");
            this.f24284a = field;
        }

        @Override // kotlin.reflect.jvm.internal.JvmPropertySignature
        /* renamed from: a */
        public final String getF() {
            StringBuilder sb = new StringBuilder();
            Field field = this.f24284a;
            String name = field.getName();
            Intrinsics.g(name, "getName(...)");
            sb.append(JvmAbi.a(name));
            sb.append("()");
            Class<?> type = field.getType();
            Intrinsics.g(type, "getType(...)");
            sb.append(ReflectClassUtilKt.b(type));
            return sb.toString();
        }

        /* renamed from: b, reason: from getter */
        public final Field getF24284a() {
            return this.f24284a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class JavaMethodProperty extends JvmPropertySignature {

        /* renamed from: a, reason: collision with root package name */
        public final Method f24285a;
        public final Method b;

        public JavaMethodProperty(Method getterMethod, Method method) {
            Intrinsics.h(getterMethod, "getterMethod");
            this.f24285a = getterMethod;
            this.b = method;
        }

        @Override // kotlin.reflect.jvm.internal.JvmPropertySignature
        /* renamed from: a */
        public final String getF() {
            return RuntimeTypeMapperKt.a(this.f24285a);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "signature", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "typeTable", "<init>", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;)V", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class KotlinProperty extends JvmPropertySignature {

        /* renamed from: a, reason: collision with root package name */
        public final PropertyDescriptor f24286a;
        public final ProtoBuf.Property b;
        public final JvmProtoBuf.JvmPropertySignature c;
        public final NameResolver d;
        public final TypeTable e;
        public final String f;

        /* JADX WARN: Removed duplicated region for block: B:25:0x00d9  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public KotlinProperty(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor r3, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r4, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature r5, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r6, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable r7) {
            /*
                r2 = this;
                java.lang.String r0 = "proto"
                kotlin.jvm.internal.Intrinsics.h(r4, r0)
                java.lang.String r0 = "nameResolver"
                kotlin.jvm.internal.Intrinsics.h(r6, r0)
                java.lang.String r0 = "typeTable"
                kotlin.jvm.internal.Intrinsics.h(r7, r0)
                r2.<init>()
                r2.f24286a = r3
                r2.b = r4
                r2.c = r5
                r2.d = r6
                r2.e = r7
                int r0 = r5.e
                r1 = 4
                r0 = r0 & r1
                if (r0 != r1) goto L38
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r3 = r5.h
                int r3 = r3.f
                java.lang.String r3 = r6.getString(r3)
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = r5.h
                int r4 = r4.g
                java.lang.String r4 = r6.getString(r4)
                java.lang.String r3 = r3.concat(r4)
                goto Le1
            L38:
                r5 = 1
                kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature$Field r4 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.b(r4, r6, r7, r5)
                if (r4 == 0) goto Le4
                java.lang.String r5 = r4.f24494a
                java.lang.String r4 = r4.b
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r5 = kotlin.reflect.jvm.internal.impl.load.java.JvmAbi.a(r5)
                r7.append(r5)
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r5 = r3.e()
                java.lang.String r0 = "getContainingDeclaration(...)"
                kotlin.jvm.internal.Intrinsics.g(r5, r0)
                kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility r0 = r3.getVisibility()
                kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility r1 = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.d
                boolean r0 = kotlin.jvm.internal.Intrinsics.c(r0, r1)
                java.lang.String r1 = "$"
                if (r0 == 0) goto L95
                boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor
                if (r0 == 0) goto L95
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor r5 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor) r5
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r3 = r5.h
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$GeneratedExtension r5 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.i
                java.lang.String r0 = "classModuleName"
                kotlin.jvm.internal.Intrinsics.g(r5, r0)
                java.lang.Object r3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt.a(r3, r5)
                java.lang.Integer r3 = (java.lang.Integer) r3
                if (r3 == 0) goto L86
                int r3 = r3.intValue()
                java.lang.String r3 = r6.getString(r3)
                goto L88
            L86:
                java.lang.String r3 = "main"
            L88:
                kotlin.text.Regex r5 = kotlin.reflect.jvm.internal.impl.name.NameUtils.f24502a
                java.lang.String r6 = "_"
                java.lang.String r3 = r5.g(r3, r6)
                java.lang.String r3 = r1.concat(r3)
                goto Ldb
            L95:
                kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility r6 = r3.getVisibility()
                kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility r0 = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.f24332a
                boolean r6 = kotlin.jvm.internal.Intrinsics.c(r6, r0)
                if (r6 == 0) goto Ld9
                boolean r5 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
                if (r5 == 0) goto Ld9
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor r3 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor) r3
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource r3 = r3.H
                boolean r5 = r3 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource
                if (r5 == 0) goto Ld9
                kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource r3 = (kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource) r3
                kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName r5 = r3.c
                if (r5 == 0) goto Ld9
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>(r1)
                kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName r3 = r3.b
                java.lang.String r3 = r3.d()
                java.lang.String r6 = "getInternalName(...)"
                kotlin.jvm.internal.Intrinsics.g(r3, r6)
                r6 = 47
                java.lang.String r3 = kotlin.text.StringsKt.a0(r6, r3, r3)
                kotlin.reflect.jvm.internal.impl.name.Name r3 = kotlin.reflect.jvm.internal.impl.name.Name.e(r3)
                java.lang.String r3 = r3.b()
                r5.append(r3)
                java.lang.String r3 = r5.toString()
                goto Ldb
            Ld9:
                java.lang.String r3 = ""
            Ldb:
                java.lang.String r5 = "()"
                java.lang.String r3 = YU.a.p(r7, r3, r5, r4)
            Le1:
                r2.f = r3
                return
            Le4:
                kotlin.reflect.jvm.internal.KotlinReflectionInternalError r4 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r6 = "No field signature for property: "
                r5.<init>(r6)
                r5.append(r3)
                java.lang.String r3 = r5.toString()
                r4.<init>(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.JvmPropertySignature.KotlinProperty.<init>(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable):void");
        }

        @Override // kotlin.reflect.jvm.internal.JvmPropertySignature
        /* renamed from: a, reason: from getter */
        public final String getF() {
            return this.f;
        }

        /* renamed from: b, reason: from getter */
        public final PropertyDescriptor getF24286a() {
            return this.f24286a;
        }

        /* renamed from: c, reason: from getter */
        public final NameResolver getD() {
            return this.d;
        }

        /* renamed from: d, reason: from getter */
        public final ProtoBuf.Property getB() {
            return this.b;
        }

        /* renamed from: e, reason: from getter */
        public final JvmProtoBuf.JvmPropertySignature getC() {
            return this.c;
        }

        /* renamed from: f, reason: from getter */
        public final TypeTable getE() {
            return this.e;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MappedKotlinProperty extends JvmPropertySignature {

        /* renamed from: a, reason: collision with root package name */
        public final JvmFunctionSignature.KotlinFunction f24287a;
        public final JvmFunctionSignature.KotlinFunction b;

        public MappedKotlinProperty(JvmFunctionSignature.KotlinFunction kotlinFunction, JvmFunctionSignature.KotlinFunction kotlinFunction2) {
            this.f24287a = kotlinFunction;
            this.b = kotlinFunction2;
        }

        @Override // kotlin.reflect.jvm.internal.JvmPropertySignature
        /* renamed from: a */
        public final String getF() {
            return this.f24287a.b;
        }
    }

    /* renamed from: a */
    public abstract String getF();
}
