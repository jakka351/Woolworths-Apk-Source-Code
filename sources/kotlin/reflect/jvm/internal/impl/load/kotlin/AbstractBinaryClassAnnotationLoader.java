package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectAnnotationSource;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.AnnotationsContainer;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class AbstractBinaryClassAnnotationLoader<A, S extends AnnotationsContainer<? extends A>> implements AnnotationLoader<A> {

    /* renamed from: a, reason: collision with root package name */
    public final ReflectKotlinClassFinder f24460a;

    /* loaded from: classes7.dex */
    public static abstract class AnnotationsContainer<A> {
    }

    @SourceDebugExtension
    public static final class Companion {
        /* JADX WARN: Removed duplicated region for block: B:49:0x00bc  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass a(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer r4, boolean r5, boolean r6, java.lang.Boolean r7, boolean r8, kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClassFinder r9, kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion r10) {
            /*
                java.lang.String r0 = "container"
                kotlin.jvm.internal.Intrinsics.h(r4, r0)
                kotlin.reflect.jvm.internal.impl.descriptors.SourceElement r0 = r4.c
                java.lang.String r1 = "metadataVersion"
                kotlin.jvm.internal.Intrinsics.h(r10, r1)
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.INTERFACE
                r2 = 0
                if (r5 == 0) goto L88
                if (r7 == 0) goto L6b
                boolean r5 = r4 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class
                if (r5 == 0) goto L2f
                r5 = r4
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer$Class r5 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class) r5
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r3 = r5.g
                if (r3 != r1) goto L2f
                kotlin.reflect.jvm.internal.impl.name.ClassId r4 = r5.f
                java.lang.String r5 = "DefaultImpls"
                kotlin.reflect.jvm.internal.impl.name.Name r5 = kotlin.reflect.jvm.internal.impl.name.Name.e(r5)
                kotlin.reflect.jvm.internal.impl.name.ClassId r4 = r4.d(r5)
                kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass r4 = kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt.a(r9, r4, r10)
                return r4
            L2f:
                boolean r5 = r7.booleanValue()
                if (r5 == 0) goto L88
                boolean r5 = r4 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Package
                if (r5 == 0) goto L88
                boolean r5 = r0 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource
                if (r5 == 0) goto L41
                r5 = r0
                kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource r5 = (kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource) r5
                goto L42
            L41:
                r5 = r2
            L42:
                if (r5 == 0) goto L49
                kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName r5 = r5.d()
                goto L4a
            L49:
                r5 = r2
            L4a:
                if (r5 == 0) goto L88
                kotlin.reflect.jvm.internal.impl.name.FqName r4 = new kotlin.reflect.jvm.internal.impl.name.FqName
                java.lang.String r5 = r5.d()
                java.lang.String r6 = "getInternalName(...)"
                kotlin.jvm.internal.Intrinsics.g(r5, r6)
                r6 = 47
                r7 = 46
                java.lang.String r5 = kotlin.text.StringsKt.R(r5, r6, r7)
                r4.<init>(r5)
                kotlin.reflect.jvm.internal.impl.name.ClassId r4 = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.b(r4)
                kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass r4 = kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt.a(r9, r4, r10)
                return r4
            L6b:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r6 = "isConst should not be null for property (container="
                r5.<init>(r6)
                r5.append(r4)
                r4 = 41
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r4 = r4.toString()
                r5.<init>(r4)
                throw r5
            L88:
                if (r6 == 0) goto Lbc
                boolean r5 = r4 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class
                if (r5 == 0) goto Lbc
                r5 = r4
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer$Class r5 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class) r5
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r6 = r5.g
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.COMPANION_OBJECT
                if (r6 != r7) goto Lbc
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer$Class r5 = r5.e
                if (r5 == 0) goto Lbc
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r6 = r5.g
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.CLASS
                if (r6 == r7) goto Lad
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.ENUM_CLASS
                if (r6 == r7) goto Lad
                if (r8 == 0) goto Lbc
                if (r6 == r1) goto Lad
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.ANNOTATION_CLASS
                if (r6 != r7) goto Lbc
            Lad:
                kotlin.reflect.jvm.internal.impl.descriptors.SourceElement r4 = r5.c
                boolean r5 = r4 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement
                if (r5 == 0) goto Lb6
                kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement r4 = (kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement) r4
                goto Lb7
            Lb6:
                r4 = r2
            Lb7:
                if (r4 == 0) goto Ld5
                kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass r4 = r4.b
                return r4
            Lbc:
                boolean r4 = r4 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Package
                if (r4 == 0) goto Ld5
                boolean r4 = r0 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource
                if (r4 == 0) goto Ld5
                kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource r0 = (kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource) r0
                kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass r4 = r0.e()
                if (r4 != 0) goto Ld4
                kotlin.reflect.jvm.internal.impl.name.ClassId r4 = r0.c()
                kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass r4 = kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt.a(r9, r4, r10)
            Ld4:
                return r4
            Ld5:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.Companion.a(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer, boolean, boolean, java.lang.Boolean, boolean, kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClassFinder, kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion):kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public static final class PropertyRelatedElement {
        public static final PropertyRelatedElement d;
        public static final PropertyRelatedElement e;
        public static final PropertyRelatedElement f;
        public static final /* synthetic */ PropertyRelatedElement[] g;
        public static final /* synthetic */ EnumEntries h;

        static {
            PropertyRelatedElement propertyRelatedElement = new PropertyRelatedElement("PROPERTY", 0);
            d = propertyRelatedElement;
            PropertyRelatedElement propertyRelatedElement2 = new PropertyRelatedElement("BACKING_FIELD", 1);
            e = propertyRelatedElement2;
            PropertyRelatedElement propertyRelatedElement3 = new PropertyRelatedElement("DELEGATE_FIELD", 2);
            f = propertyRelatedElement3;
            PropertyRelatedElement[] propertyRelatedElementArr = {propertyRelatedElement, propertyRelatedElement2, propertyRelatedElement3};
            g = propertyRelatedElementArr;
            h = EnumEntriesKt.a(propertyRelatedElementArr);
        }

        public static PropertyRelatedElement valueOf(String str) {
            return (PropertyRelatedElement) Enum.valueOf(PropertyRelatedElement.class, str);
        }

        public static PropertyRelatedElement[] values() {
            return (PropertyRelatedElement[]) g.clone();
        }
    }

    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[AnnotatedCallableKind.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public AbstractBinaryClassAnnotationLoader(ReflectKotlinClassFinder reflectKotlinClassFinder) {
        this.f24460a = reflectKotlinClassFinder;
    }

    public static /* synthetic */ List m(AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader, ProtoContainer protoContainer, MemberSignature memberSignature, Boolean bool, boolean z, int i) {
        boolean z2 = (i & 4) == 0;
        if ((i & 16) != 0) {
            bool = null;
        }
        return abstractBinaryClassAnnotationLoader.l(protoContainer, memberSignature, z2, false, bool, (i & 32) != 0 ? false : z);
    }

    public static MemberSignature o(MessageLite proto, NameResolver nameResolver, TypeTable typeTable, AnnotatedCallableKind annotatedCallableKind, boolean z) {
        Intrinsics.h(proto, "proto");
        Intrinsics.h(nameResolver, "nameResolver");
        if (proto instanceof ProtoBuf.Constructor) {
            ExtensionRegistryLite extensionRegistryLite = JvmProtoBufUtil.f24497a;
            JvmMemberSignature.Method methodA = JvmProtoBufUtil.a((ProtoBuf.Constructor) proto, nameResolver, typeTable);
            if (methodA != null) {
                return MemberSignature.Companion.b(methodA);
            }
        } else if (proto instanceof ProtoBuf.Function) {
            ExtensionRegistryLite extensionRegistryLite2 = JvmProtoBufUtil.f24497a;
            JvmMemberSignature.Method methodC = JvmProtoBufUtil.c((ProtoBuf.Function) proto, nameResolver, typeTable);
            if (methodC != null) {
                return MemberSignature.Companion.b(methodC);
            }
        } else if (proto instanceof ProtoBuf.Property) {
            GeneratedMessageLite.GeneratedExtension propertySignature = JvmProtoBuf.d;
            Intrinsics.g(propertySignature, "propertySignature");
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.a((GeneratedMessageLite.ExtendableMessage) proto, propertySignature);
            if (jvmPropertySignature != null) {
                int iOrdinal = annotatedCallableKind.ordinal();
                if (iOrdinal == 1) {
                    return AbstractBinaryClassAnnotationLoaderKt.a((ProtoBuf.Property) proto, nameResolver, typeTable, true, true, z);
                }
                if (iOrdinal == 2) {
                    if ((jvmPropertySignature.e & 4) != 4) {
                        return null;
                    }
                    JvmProtoBuf.JvmMethodSignature jvmMethodSignature = jvmPropertySignature.h;
                    Intrinsics.g(jvmMethodSignature, "getGetter(...)");
                    return MemberSignature.Companion.c(nameResolver, jvmMethodSignature);
                }
                if (iOrdinal != 3 || (jvmPropertySignature.e & 8) != 8) {
                    return null;
                }
                JvmProtoBuf.JvmMethodSignature jvmMethodSignature2 = jvmPropertySignature.i;
                Intrinsics.g(jvmMethodSignature2, "getSetter(...)");
                return MemberSignature.Companion.c(nameResolver, jvmMethodSignature2);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List a(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer r7, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r8, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r9, int r10, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter r11) {
        /*
            r6 = this;
            java.lang.String r11 = "callableProto"
            kotlin.jvm.internal.Intrinsics.h(r8, r11)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r11 = r7.f24582a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable r0 = r7.b
            r1 = 0
            kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature r9 = o(r8, r11, r0, r9, r1)
            if (r9 == 0) goto L68
            boolean r11 = r8 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function
            r0 = 1
            if (r11 == 0) goto L1f
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r8 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) r8
            boolean r8 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.g(r8)
            if (r8 == 0) goto L40
        L1d:
            r1 = r0
            goto L40
        L1f:
            boolean r11 = r8 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property
            if (r11 == 0) goto L2c
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r8 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) r8
            boolean r8 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.h(r8)
            if (r8 == 0) goto L40
            goto L1d
        L2c:
            boolean r11 = r8 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor
            if (r11 == 0) goto L50
            r8 = r7
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer$Class r8 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class) r8
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r11 = r8.g
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r2 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.ENUM_CLASS
            if (r11 != r2) goto L3b
            r1 = 2
            goto L40
        L3b:
            boolean r8 = r8.h
            if (r8 == 0) goto L40
            goto L1d
        L40:
            int r10 = r10 + r1
            kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature r2 = kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion.e(r9, r10)
            r4 = 0
            r5 = 60
            r3 = 0
            r0 = r6
            r1 = r7
            java.util.List r7 = m(r0, r1, r2, r3, r4, r5)
            return r7
        L50:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Unsupported message: "
            r9.<init>(r10)
            java.lang.Class r8 = r8.getClass()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.<init>(r8)
            throw r7
        L68:
            kotlin.collections.EmptyList r7 = kotlin.collections.EmptyList.d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.a(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind, int, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter):java.util.List");
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final ArrayList b(ProtoContainer.Class container) {
        Intrinsics.h(container, "container");
        SourceElement sourceElement = container.c;
        KotlinJvmBinarySourceElement kotlinJvmBinarySourceElement = sourceElement instanceof KotlinJvmBinarySourceElement ? (KotlinJvmBinarySourceElement) sourceElement : null;
        KotlinJvmBinaryClass kotlinJvmBinaryClass = kotlinJvmBinarySourceElement != null ? kotlinJvmBinarySourceElement.b : null;
        if (kotlinJvmBinaryClass != null) {
            final ArrayList arrayList = new ArrayList(1);
            kotlinJvmBinaryClass.d(new KotlinJvmBinaryClass.AnnotationVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader$loadClassAnnotations$1
                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
                public final void a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
                public final KotlinJvmBinaryClass.AnnotationArgumentVisitor b(ClassId classId, ReflectAnnotationSource reflectAnnotationSource) {
                    return this.f24461a.s(classId, reflectAnnotationSource, arrayList);
                }
            });
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + container.f.a()).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final List c(ProtoContainer container, ProtoBuf.EnumEntry enumEntry) {
        Intrinsics.h(container, "container");
        return m(this, container, MemberSignature.Companion.a(container.f24582a.getString(enumEntry.g), ClassMapperLite.b(((ProtoContainer.Class) container).f.b())), null, false, 60);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final ArrayList d(ProtoBuf.TypeParameter proto, NameResolver nameResolver) {
        Intrinsics.h(proto, "proto");
        Intrinsics.h(nameResolver, "nameResolver");
        Object objF = proto.f(JvmProtoBuf.h);
        Intrinsics.g(objF, "getExtension(...)");
        Iterable<ProtoBuf.Annotation> iterable = (Iterable) objF;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(iterable, 10));
        for (ProtoBuf.Annotation annotation : iterable) {
            Intrinsics.e(annotation);
            arrayList.add(((BinaryClassAnnotationAndConstantLoaderImpl) this).e.a(annotation, nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final List f(ProtoContainer protoContainer, ProtoBuf.Property proto) {
        Intrinsics.h(proto, "proto");
        return t(protoContainer, proto, PropertyRelatedElement.e);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final List g(ProtoContainer protoContainer, MessageLite proto, AnnotatedCallableKind annotatedCallableKind) {
        Intrinsics.h(proto, "proto");
        MemberSignature memberSignatureO = o(proto, protoContainer.f24582a, protoContainer.b, annotatedCallableKind, false);
        return memberSignatureO != null ? m(this, protoContainer, MemberSignature.Companion.e(memberSignatureO, 0), null, false, 60) : EmptyList.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final ArrayList h(ProtoBuf.Type proto, NameResolver nameResolver) {
        Intrinsics.h(proto, "proto");
        Intrinsics.h(nameResolver, "nameResolver");
        Object objF = proto.f(JvmProtoBuf.f);
        Intrinsics.g(objF, "getExtension(...)");
        Iterable<ProtoBuf.Annotation> iterable = (Iterable) objF;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(iterable, 10));
        for (ProtoBuf.Annotation annotation : iterable) {
            Intrinsics.e(annotation);
            arrayList.add(((BinaryClassAnnotationAndConstantLoaderImpl) this).e.a(annotation, nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final List i(ProtoContainer protoContainer, MessageLite proto, AnnotatedCallableKind annotatedCallableKind) {
        Intrinsics.h(proto, "proto");
        if (annotatedCallableKind == AnnotatedCallableKind.e) {
            return t(protoContainer, (ProtoBuf.Property) proto, PropertyRelatedElement.d);
        }
        MemberSignature memberSignatureO = o(proto, protoContainer.f24582a, protoContainer.b, annotatedCallableKind, false);
        return memberSignatureO == null ? EmptyList.d : m(this, protoContainer, memberSignatureO, null, false, 60);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final List k(ProtoContainer protoContainer, ProtoBuf.Property proto) {
        Intrinsics.h(proto, "proto");
        return t(protoContainer, proto, PropertyRelatedElement.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List l(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer r8, kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature r9, boolean r10, boolean r11, java.lang.Boolean r12, boolean r13) {
        /*
            r7 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClassFinder r5 = r7.f24460a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion r6 = r7.p()
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass r8 = kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.Companion.a(r0, r1, r2, r3, r4, r5, r6)
            if (r8 != 0) goto L29
            boolean r8 = r0 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class
            r10 = 0
            if (r8 == 0) goto L28
            r8 = r0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer$Class r8 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class) r8
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement r8 = r8.c
            boolean r11 = r8 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement
            if (r11 == 0) goto L22
            kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement r8 = (kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement) r8
            goto L23
        L22:
            r8 = r10
        L23:
            if (r8 == 0) goto L28
            kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass r8 = r8.b
            goto L29
        L28:
            r8 = r10
        L29:
            if (r8 != 0) goto L2c
            goto L3e
        L2c:
            kotlin.reflect.jvm.internal.impl.load.kotlin.AnnotationsContainerWithConstants r8 = r7.n(r8)
            java.util.Map r8 = r8.a()
            java.util.HashMap r8 = (java.util.HashMap) r8
            java.lang.Object r8 = r8.get(r9)
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L40
        L3e:
            kotlin.collections.EmptyList r8 = kotlin.collections.EmptyList.d
        L40:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.l(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer, kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature, boolean, boolean, java.lang.Boolean, boolean):java.util.List");
    }

    public abstract AnnotationsContainerWithConstants n(KotlinJvmBinaryClass kotlinJvmBinaryClass);

    public abstract MetadataVersion p();

    public final boolean q(ClassId classId) {
        KotlinJvmBinaryClass kotlinJvmBinaryClassA;
        Intrinsics.h(classId, "classId");
        return classId.e() != null && Intrinsics.c(classId.f().b(), "Container") && (kotlinJvmBinaryClassA = KotlinClassFinderKt.a(this.f24460a, classId, p())) != null && SpecialJvmAnnotations.b(kotlinJvmBinaryClassA);
    }

    public abstract BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1 r(ClassId classId, SourceElement sourceElement, List list);

    public final KotlinJvmBinaryClass.AnnotationArgumentVisitor s(ClassId classId, ReflectAnnotationSource reflectAnnotationSource, List result) {
        Intrinsics.h(result, "result");
        if (SpecialJvmAnnotations.a().contains(classId)) {
            return null;
        }
        return r(classId, reflectAnnotationSource, result);
    }

    public final List t(ProtoContainer protoContainer, ProtoBuf.Property property, PropertyRelatedElement propertyRelatedElement) {
        TypeTable typeTable = protoContainer.b;
        NameResolver nameResolver = protoContainer.f24582a;
        Boolean boolE = Flags.B.e(property.g);
        boolean zD = JvmProtoBufUtil.d(property);
        if (propertyRelatedElement == PropertyRelatedElement.d) {
            MemberSignature memberSignatureA = AbstractBinaryClassAnnotationLoaderKt.a(property, nameResolver, typeTable, (40 & 8) == 0, (40 & 16) == 0, true);
            if (memberSignatureA != null) {
                return m(this, protoContainer, memberSignatureA, boolE, zD, 8);
            }
        } else {
            MemberSignature memberSignatureA2 = AbstractBinaryClassAnnotationLoaderKt.a(property, nameResolver, typeTable, (40 & 8) == 0, (40 & 16) == 0, true);
            if (memberSignatureA2 != null) {
                if (StringsKt.o(memberSignatureA2.a(), "$delegate", false) == (propertyRelatedElement == PropertyRelatedElement.f)) {
                    return l(protoContainer, memberSignatureA2, true, true, boolE, zD);
                }
            }
        }
        return EmptyList.d;
    }
}
