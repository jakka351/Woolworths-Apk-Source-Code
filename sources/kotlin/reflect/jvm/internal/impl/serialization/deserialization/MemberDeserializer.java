package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations$Companion$EMPTY$1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FieldDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class MemberDeserializer {

    /* renamed from: a, reason: collision with root package name */
    public final DeserializationContext f24580a;
    public final AnnotationDeserializer b;

    public MemberDeserializer(DeserializationContext deserializationContext) {
        this.f24580a = deserializationContext;
        DeserializationComponents deserializationComponents = deserializationContext.f24572a;
        this.b = new AnnotationDeserializer(deserializationComponents.b, deserializationComponents.l);
    }

    public final ProtoContainer a(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor instanceof PackageFragmentDescriptor) {
            FqName fqNameD = ((PackageFragmentDescriptor) declarationDescriptor).d();
            DeserializationContext deserializationContext = this.f24580a;
            return new ProtoContainer.Package(fqNameD, deserializationContext.b, deserializationContext.d, deserializationContext.g);
        }
        if (declarationDescriptor instanceof DeserializedClassDescriptor) {
            return ((DeserializedClassDescriptor) declarationDescriptor).z;
        }
        return null;
    }

    public final Annotations b(final GeneratedMessageLite.ExtendableMessage extendableMessage, int i, final AnnotatedCallableKind annotatedCallableKind) {
        return !Flags.c.e(i).booleanValue() ? Annotations.Companion.f24350a : new NonEmptyDeserializedAnnotations(this.f24580a.f24572a.f24570a, new Function0(this, extendableMessage, annotatedCallableKind) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$$Lambda$2
            public final MemberDeserializer d;
            public final MessageLite e;
            public final AnnotatedCallableKind f;

            {
                this.d = this;
                this.e = extendableMessage;
                this.f = annotatedCallableKind;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MemberDeserializer memberDeserializer = this.d;
                DeserializationContext deserializationContext = memberDeserializer.f24580a;
                ProtoContainer protoContainerA = memberDeserializer.a(deserializationContext.c);
                List listG0 = protoContainerA != null ? CollectionsKt.G0(deserializationContext.f24572a.e.i(protoContainerA, this.e, this.f)) : null;
                return listG0 == null ? EmptyList.d : listG0;
            }
        });
    }

    public final Annotations c(final ProtoBuf.Property property, final boolean z) {
        return !Flags.c.e(property.g).booleanValue() ? Annotations.Companion.f24350a : new NonEmptyDeserializedAnnotations(this.f24580a.f24572a.f24570a, new Function0(this, z, property) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$$Lambda$3
            public final MemberDeserializer d;
            public final boolean e;
            public final ProtoBuf.Property f;

            {
                this.d = this;
                this.e = z;
                this.f = property;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List listG0;
                MemberDeserializer memberDeserializer = this.d;
                DeserializationContext deserializationContext = memberDeserializer.f24580a;
                DeclarationDescriptor declarationDescriptor = deserializationContext.c;
                DeserializationComponents deserializationComponents = deserializationContext.f24572a;
                ProtoContainer protoContainerA = memberDeserializer.a(declarationDescriptor);
                if (protoContainerA != null) {
                    boolean z2 = this.e;
                    ProtoBuf.Property property2 = this.f;
                    listG0 = z2 ? CollectionsKt.G0(deserializationComponents.e.k(protoContainerA, property2)) : CollectionsKt.G0(deserializationComponents.e.f(protoContainerA, property2));
                } else {
                    listG0 = null;
                }
                return listG0 == null ? EmptyList.d : listG0;
            }
        });
    }

    public final DeserializedClassConstructorDescriptor d(ProtoBuf.Constructor constructor, boolean z) {
        DeserializationContext deserializationContext = this.f24580a;
        DeclarationDescriptor declarationDescriptor = deserializationContext.c;
        Intrinsics.f(declarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
        int i = constructor.g;
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.d;
        DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor = new DeserializedClassConstructorDescriptor(classDescriptor, b(constructor, i, annotatedCallableKind), z, constructor, deserializationContext.b, deserializationContext.d, deserializationContext.e, deserializationContext.g);
        MemberDeserializer memberDeserializer = deserializationContext.a(deserializedClassConstructorDescriptor, EmptyList.d, deserializationContext.b, deserializationContext.d, deserializationContext.e, deserializationContext.f).i;
        List list = constructor.h;
        Intrinsics.g(list, "getValueParameterList(...)");
        deserializedClassConstructorDescriptor.T0(memberDeserializer.g(list, constructor, annotatedCallableKind), ProtoEnumFlagsUtilsKt.a((ProtoBuf.Visibility) Flags.d.c(constructor.g)));
        deserializedClassConstructorDescriptor.Q0(classDescriptor.t());
        deserializedClassConstructorDescriptor.u = classDescriptor.p0();
        deserializedClassConstructorDescriptor.z = !Flags.o.e(constructor.g).booleanValue();
        return deserializedClassConstructorDescriptor;
    }

    public final DeserializedSimpleFunctionDescriptor e(ProtoBuf.Function proto) {
        int i;
        KotlinType kotlinTypeG;
        DeserializationContext deserializationContext = this.f24580a;
        NameResolver nameResolver = deserializationContext.b;
        TypeTable typeTable = deserializationContext.d;
        Intrinsics.h(proto, "proto");
        if ((proto.f & 1) == 1) {
            i = proto.g;
        } else {
            int i2 = proto.h;
            i = ((i2 >> 8) << 6) + (i2 & 63);
        }
        int i3 = i;
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.d;
        Annotations annotationsB = b(proto, i3, annotatedCallableKind);
        boolean zG = ProtoTypeTableUtilKt.g(proto);
        Annotations$Companion$EMPTY$1 annotations$Companion$EMPTY$1 = Annotations.Companion.f24350a;
        Annotations deserializedAnnotations = zG ? new DeserializedAnnotations(deserializationContext.f24572a.f24570a, new MemberDeserializer$$Lambda$4(this, proto, annotatedCallableKind)) : annotations$Companion$EMPTY$1;
        DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor = new DeserializedSimpleFunctionDescriptor(deserializationContext.c, annotationsB, NameResolverUtilKt.b(nameResolver, proto.i), ProtoEnumFlagsUtilsKt.b((ProtoBuf.MemberKind) Flags.p.c(i3)), proto, deserializationContext.b, typeTable, DescriptorUtilsKt.g(deserializationContext.c).a(NameResolverUtilKt.b(nameResolver, proto.i)).equals(SuspendFunctionTypeUtilKt.f24585a) ? VersionRequirementTable.b : deserializationContext.e, deserializationContext.g);
        List list = proto.l;
        Intrinsics.g(list, "getTypeParameterList(...)");
        DeserializationContext deserializationContextA = deserializationContext.a(deserializedSimpleFunctionDescriptor, list, deserializationContext.b, deserializationContext.d, deserializationContext.e, deserializationContext.f);
        TypeDeserializer typeDeserializer = deserializationContextA.h;
        ProtoBuf.Type typeJ = ProtoTypeTableUtilKt.j(proto, typeTable);
        ReceiverParameterDescriptorImpl receiverParameterDescriptorImplH = (typeJ == null || (kotlinTypeG = typeDeserializer.g(typeJ)) == null) ? null : DescriptorFactory.h(deserializedSimpleFunctionDescriptor, kotlinTypeG, deserializedAnnotations);
        DeclarationDescriptor declarationDescriptor = deserializationContext.c;
        ClassDescriptor classDescriptor = declarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptor : null;
        ReceiverParameterDescriptor receiverParameterDescriptorU = classDescriptor != null ? classDescriptor.U() : null;
        List listC = ProtoTypeTableUtilKt.c(proto, typeTable);
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        for (Object obj : listC) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.z0();
                throw null;
            }
            ReceiverParameterDescriptorImpl receiverParameterDescriptorImplB = DescriptorFactory.b(deserializedSimpleFunctionDescriptor, typeDeserializer.g((ProtoBuf.Type) obj), null, annotations$Companion$EMPTY$1, i4);
            if (receiverParameterDescriptorImplB != null) {
                arrayList.add(receiverParameterDescriptorImplB);
            }
            i4 = i5;
        }
        List listB = typeDeserializer.b();
        MemberDeserializer memberDeserializer = deserializationContextA.i;
        List list2 = proto.r;
        Intrinsics.g(list2, "getValueParameterList(...)");
        deserializedSimpleFunctionDescriptor.V0(receiverParameterDescriptorImplH, receiverParameterDescriptorU, arrayList, listB, memberDeserializer.g(list2, proto, annotatedCallableKind), typeDeserializer.g(ProtoTypeTableUtilKt.l(proto, typeTable)), ProtoEnumFlags.a((ProtoBuf.Modality) Flags.e.c(i3)), ProtoEnumFlagsUtilsKt.a((ProtoBuf.Visibility) Flags.d.c(i3)), EmptyMap.d);
        deserializedSimpleFunctionDescriptor.p = Flags.q.e(i3).booleanValue();
        deserializedSimpleFunctionDescriptor.q = Flags.r.e(i3).booleanValue();
        deserializedSimpleFunctionDescriptor.r = Flags.u.e(i3).booleanValue();
        deserializedSimpleFunctionDescriptor.s = Flags.s.e(i3).booleanValue();
        deserializedSimpleFunctionDescriptor.t = Flags.t.e(i3).booleanValue();
        deserializedSimpleFunctionDescriptor.y = Flags.v.e(i3).booleanValue();
        deserializedSimpleFunctionDescriptor.u = Flags.w.e(i3).booleanValue();
        deserializedSimpleFunctionDescriptor.z = !Flags.x.e(i3).booleanValue();
        deserializationContext.f24572a.m.getClass();
        return deserializedSimpleFunctionDescriptor;
    }

    public final DeserializedPropertyDescriptor f(final ProtoBuf.Property proto) {
        int i;
        MemberDeserializer memberDeserializer;
        Annotations deserializedAnnotations;
        boolean z;
        int i2;
        int i3;
        DeserializationContext deserializationContext;
        boolean z2;
        Flags.FlagField flagField;
        Flags.BooleanFlagField booleanFlagField;
        Flags.FlagField flagField2;
        Flags.BooleanFlagField booleanFlagField2;
        Flags.BooleanFlagField booleanFlagField3;
        int i4;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImplC;
        final MemberDeserializer memberDeserializer2;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        PropertySetterDescriptorImpl propertySetterDescriptorImplD;
        KotlinType kotlinTypeG;
        DeserializationContext deserializationContext2 = this.f24580a;
        TypeTable typeTable = deserializationContext2.d;
        Intrinsics.h(proto, "proto");
        if ((proto.f & 1) == 1) {
            i = proto.g;
        } else {
            int i5 = proto.h;
            i = ((i5 >> 8) << 6) + (i5 & 63);
        }
        int i6 = i;
        final DeserializedPropertyDescriptor deserializedPropertyDescriptor = new DeserializedPropertyDescriptor(deserializationContext2.c, null, b(proto, i, AnnotatedCallableKind.e), ProtoEnumFlags.a((ProtoBuf.Modality) Flags.e.c(i)), ProtoEnumFlagsUtilsKt.a((ProtoBuf.Visibility) Flags.d.c(i)), Flags.y.e(i).booleanValue(), NameResolverUtilKt.b(deserializationContext2.b, proto.i), ProtoEnumFlagsUtilsKt.b((ProtoBuf.MemberKind) Flags.p.c(i)), Flags.C.e(i).booleanValue(), Flags.B.e(i).booleanValue(), Flags.E.e(i).booleanValue(), Flags.F.e(i).booleanValue(), Flags.G.e(i).booleanValue(), proto, deserializationContext2.b, typeTable, deserializationContext2.e, deserializationContext2.g);
        List list = proto.l;
        Intrinsics.g(list, "getTypeParameterList(...)");
        DeserializationContext deserializationContextA = deserializationContext2.a(deserializedPropertyDescriptor, list, deserializationContext2.b, deserializationContext2.d, deserializationContext2.e, deserializationContext2.f);
        TypeDeserializer typeDeserializer = deserializationContextA.h;
        boolean zBooleanValue = Flags.z.e(i6).booleanValue();
        Annotations$Companion$EMPTY$1 annotations$Companion$EMPTY$1 = Annotations.Companion.f24350a;
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.f;
        if (zBooleanValue && ProtoTypeTableUtilKt.h(proto)) {
            memberDeserializer = this;
            deserializedAnnotations = new DeserializedAnnotations(deserializationContext2.f24572a.f24570a, new MemberDeserializer$$Lambda$4(memberDeserializer, proto, annotatedCallableKind));
        } else {
            memberDeserializer = this;
            deserializedAnnotations = annotations$Companion$EMPTY$1;
        }
        KotlinType kotlinTypeG2 = typeDeserializer.g(ProtoTypeTableUtilKt.m(proto, typeTable));
        List listB = typeDeserializer.b();
        DeclarationDescriptor declarationDescriptor = deserializationContext2.c;
        ClassDescriptor classDescriptor = declarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptor : null;
        ReceiverParameterDescriptor receiverParameterDescriptorU = classDescriptor != null ? classDescriptor.U() : null;
        ProtoBuf.Type typeK = ProtoTypeTableUtilKt.k(proto, typeTable);
        ReceiverParameterDescriptorImpl receiverParameterDescriptorImplH = (typeK == null || (kotlinTypeG = typeDeserializer.g(typeK)) == null) ? null : DescriptorFactory.h(deserializedPropertyDescriptor, kotlinTypeG, deserializedAnnotations);
        List listD = ProtoTypeTableUtilKt.d(proto, typeTable);
        ReceiverParameterDescriptor receiverParameterDescriptor = receiverParameterDescriptorU;
        ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl = receiverParameterDescriptorImplH;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(listD, 10));
        Iterator it = listD.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i8 = i7 + 1;
            if (i7 < 0) {
                CollectionsKt.z0();
                throw null;
            }
            arrayList.add(DescriptorFactory.b(deserializedPropertyDescriptor, typeDeserializer.g((ProtoBuf.Type) next), null, annotations$Companion$EMPTY$1, i7));
            it = it;
            i7 = i8;
        }
        deserializedPropertyDescriptor.O0(kotlinTypeG2, listB, receiverParameterDescriptor, receiverParameterDescriptorImpl, arrayList);
        Flags.BooleanFlagField booleanFlagField4 = Flags.c;
        boolean zBooleanValue2 = booleanFlagField4.e(i6).booleanValue();
        Flags.FlagField flagField3 = Flags.d;
        ProtoBuf.Visibility visibility = (ProtoBuf.Visibility) flagField3.c(i6);
        Flags.FlagField flagField4 = Flags.e;
        ProtoBuf.Modality modality = (ProtoBuf.Modality) flagField4.c(i6);
        if (visibility == null) {
            Flags.a(10);
            throw null;
        }
        if (modality == null) {
            Flags.a(11);
            throw null;
        }
        if (zBooleanValue2) {
            z = true;
            i2 = 1 << booleanFlagField4.f24487a;
        } else {
            z = true;
            i2 = 0;
        }
        int iD = i2 | flagField4.d(modality) | flagField3.d(visibility);
        Flags.BooleanFlagField booleanFlagField5 = Flags.K;
        booleanFlagField5.getClass();
        Flags.BooleanFlagField booleanFlagField6 = Flags.L;
        booleanFlagField6.getClass();
        Flags.BooleanFlagField booleanFlagField7 = Flags.M;
        booleanFlagField7.getClass();
        SourceElement sourceElement = SourceElement.f24343a;
        if (zBooleanValue) {
            z2 = z;
            int i9 = (proto.f & 256) == 256 ? proto.s : iD;
            boolean zBooleanValue3 = booleanFlagField5.e(i9).booleanValue();
            boolean zBooleanValue4 = booleanFlagField6.e(i9).booleanValue();
            boolean zBooleanValue5 = booleanFlagField7.e(i9).booleanValue();
            Annotations annotationsB = memberDeserializer.b(proto, i9, annotatedCallableKind);
            if (zBooleanValue3) {
                deserializationContext = deserializationContextA;
                booleanFlagField2 = booleanFlagField6;
                booleanFlagField3 = booleanFlagField7;
                flagField = flagField3;
                flagField2 = flagField4;
                i4 = i6;
                i3 = iD;
                booleanFlagField = booleanFlagField5;
                propertyGetterDescriptorImplC = new PropertyGetterDescriptorImpl(deserializedPropertyDescriptor, annotationsB, ProtoEnumFlags.a((ProtoBuf.Modality) flagField4.c(i9)), ProtoEnumFlagsUtilsKt.a((ProtoBuf.Visibility) flagField3.c(i9)), !zBooleanValue3, zBooleanValue4, zBooleanValue5, deserializedPropertyDescriptor.f(), null, sourceElement);
            } else {
                i3 = iD;
                deserializationContext = deserializationContextA;
                flagField = flagField3;
                booleanFlagField = booleanFlagField5;
                flagField2 = flagField4;
                booleanFlagField2 = booleanFlagField6;
                booleanFlagField3 = booleanFlagField7;
                i4 = i6;
                propertyGetterDescriptorImplC = DescriptorFactory.c(deserializedPropertyDescriptor, annotationsB);
            }
            propertyGetterDescriptorImplC.M0(deserializedPropertyDescriptor.getReturnType());
        } else {
            i3 = iD;
            deserializationContext = deserializationContextA;
            z2 = z;
            flagField = flagField3;
            booleanFlagField = booleanFlagField5;
            flagField2 = flagField4;
            booleanFlagField2 = booleanFlagField6;
            booleanFlagField3 = booleanFlagField7;
            i4 = i6;
            propertyGetterDescriptorImplC = null;
        }
        if (Flags.A.e(i4).booleanValue()) {
            int i10 = (proto.f & 512) == 512 ? proto.t : i3;
            boolean zBooleanValue6 = booleanFlagField.e(i10).booleanValue();
            boolean zBooleanValue7 = booleanFlagField2.e(i10).booleanValue();
            boolean zBooleanValue8 = booleanFlagField3.e(i10).booleanValue();
            AnnotatedCallableKind annotatedCallableKind2 = AnnotatedCallableKind.g;
            memberDeserializer2 = this;
            Annotations annotationsB2 = memberDeserializer2.b(proto, i10, annotatedCallableKind2);
            if (zBooleanValue6) {
                propertyGetterDescriptorImpl = propertyGetterDescriptorImplC;
                PropertySetterDescriptorImpl propertySetterDescriptorImpl = new PropertySetterDescriptorImpl(deserializedPropertyDescriptor, annotationsB2, ProtoEnumFlags.a((ProtoBuf.Modality) flagField2.c(i10)), ProtoEnumFlagsUtilsKt.a((ProtoBuf.Visibility) flagField.c(i10)), !zBooleanValue6, zBooleanValue7, zBooleanValue8, deserializedPropertyDescriptor.f(), null, sourceElement);
                DeserializationContext deserializationContext3 = deserializationContext;
                propertySetterDescriptorImpl.N0((ValueParameterDescriptor) CollectionsKt.n0(deserializationContext3.a(propertySetterDescriptorImpl, EmptyList.d, deserializationContext3.b, deserializationContext3.d, deserializationContext3.e, deserializationContext3.f).i.g(CollectionsKt.Q(proto.r), proto, annotatedCallableKind2)));
                propertySetterDescriptorImplD = propertySetterDescriptorImpl;
            } else {
                propertyGetterDescriptorImpl = propertyGetterDescriptorImplC;
                propertySetterDescriptorImplD = DescriptorFactory.d(deserializedPropertyDescriptor, annotationsB2);
            }
        } else {
            memberDeserializer2 = this;
            propertyGetterDescriptorImpl = propertyGetterDescriptorImplC;
            propertySetterDescriptorImplD = null;
        }
        if (Flags.D.e(i4).booleanValue()) {
            deserializedPropertyDescriptor.I0(null, new Function0(memberDeserializer2, proto, deserializedPropertyDescriptor) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$$Lambda$0
                public final MemberDeserializer d;
                public final ProtoBuf.Property e;
                public final DeserializedPropertyDescriptor f;

                {
                    this.d = memberDeserializer2;
                    this.e = proto;
                    this.f = deserializedPropertyDescriptor;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    final MemberDeserializer memberDeserializer3 = this.d;
                    LockBasedStorageManager lockBasedStorageManager = memberDeserializer3.f24580a.f24572a.f24570a;
                    final ProtoBuf.Property property = this.e;
                    final DeserializedPropertyDescriptor deserializedPropertyDescriptor2 = this.f;
                    return lockBasedStorageManager.e(new Function0(memberDeserializer3, property, deserializedPropertyDescriptor2) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$$Lambda$6
                        public final MemberDeserializer d;
                        public final ProtoBuf.Property e;
                        public final DeserializedPropertyDescriptor f;

                        {
                            this.d = memberDeserializer3;
                            this.e = property;
                            this.f = deserializedPropertyDescriptor2;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MemberDeserializer memberDeserializer4 = this.d;
                            DeserializationContext deserializationContext4 = memberDeserializer4.f24580a;
                            ProtoContainer protoContainerA = memberDeserializer4.a(deserializationContext4.c);
                            Intrinsics.e(protoContainerA);
                            AnnotationAndConstantLoader annotationAndConstantLoader = deserializationContext4.f24572a.e;
                            KotlinType returnType = this.f.getReturnType();
                            Intrinsics.g(returnType, "getReturnType(...)");
                            return (ConstantValue) annotationAndConstantLoader.e(protoContainerA, this.e, returnType);
                        }
                    });
                }
            });
        }
        DeclarationDescriptor declarationDescriptor2 = deserializationContext2.c;
        ClassDescriptor classDescriptor2 = declarationDescriptor2 instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptor2 : null;
        if ((classDescriptor2 != null ? classDescriptor2.f() : null) == ClassKind.h) {
            deserializedPropertyDescriptor.I0(null, new Function0(memberDeserializer2, proto, deserializedPropertyDescriptor) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$$Lambda$1
                public final MemberDeserializer d;
                public final ProtoBuf.Property e;
                public final DeserializedPropertyDescriptor f;

                {
                    this.d = memberDeserializer2;
                    this.e = proto;
                    this.f = deserializedPropertyDescriptor;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    final MemberDeserializer memberDeserializer3 = this.d;
                    LockBasedStorageManager lockBasedStorageManager = memberDeserializer3.f24580a.f24572a.f24570a;
                    final ProtoBuf.Property property = this.e;
                    final DeserializedPropertyDescriptor deserializedPropertyDescriptor2 = this.f;
                    return lockBasedStorageManager.e(new Function0(memberDeserializer3, property, deserializedPropertyDescriptor2) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$$Lambda$7
                        public final MemberDeserializer d;
                        public final ProtoBuf.Property e;
                        public final DeserializedPropertyDescriptor f;

                        {
                            this.d = memberDeserializer3;
                            this.e = property;
                            this.f = deserializedPropertyDescriptor2;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MemberDeserializer memberDeserializer4 = this.d;
                            DeserializationContext deserializationContext4 = memberDeserializer4.f24580a;
                            ProtoContainer protoContainerA = memberDeserializer4.a(deserializationContext4.c);
                            Intrinsics.e(protoContainerA);
                            AnnotationAndConstantLoader annotationAndConstantLoader = deserializationContext4.f24572a.e;
                            KotlinType returnType = this.f.getReturnType();
                            Intrinsics.g(returnType, "getReturnType(...)");
                            return (ConstantValue) annotationAndConstantLoader.j(protoContainerA, this.e, returnType);
                        }
                    });
                }
            });
        }
        deserializedPropertyDescriptor.M0(propertyGetterDescriptorImpl, propertySetterDescriptorImplD, new FieldDescriptorImpl(memberDeserializer2.c(proto, false), deserializedPropertyDescriptor), new FieldDescriptorImpl(memberDeserializer2.c(proto, z2), deserializedPropertyDescriptor));
        return deserializedPropertyDescriptor;
    }

    public final List g(List list, final GeneratedMessageLite.ExtendableMessage extendableMessage, final AnnotatedCallableKind annotatedCallableKind) {
        final int i;
        Annotations nonEmptyDeserializedAnnotations;
        final MemberDeserializer memberDeserializer = this;
        DeserializationContext deserializationContext = memberDeserializer.f24580a;
        TypeTable typeTable = deserializationContext.d;
        TypeDeserializer typeDeserializer = deserializationContext.h;
        DeclarationDescriptor declarationDescriptor = deserializationContext.c;
        Intrinsics.f(declarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        CallableDescriptor callableDescriptor = (CallableDescriptor) declarationDescriptor;
        DeclarationDescriptor declarationDescriptorE = callableDescriptor.e();
        Intrinsics.g(declarationDescriptorE, "getContainingDeclaration(...)");
        final ProtoContainer protoContainerA = memberDeserializer.a(declarationDescriptorE);
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        int i2 = 0;
        for (Object obj : list2) {
            int i3 = i2 + 1;
            KotlinType kotlinTypeG = null;
            if (i2 < 0) {
                CollectionsKt.z0();
                throw null;
            }
            final ProtoBuf.ValueParameter valueParameter = (ProtoBuf.ValueParameter) obj;
            int i4 = (valueParameter.f & 1) == 1 ? valueParameter.g : 0;
            if (protoContainerA == null || !Flags.c.e(i4).booleanValue()) {
                i = i2;
                nonEmptyDeserializedAnnotations = Annotations.Companion.f24350a;
            } else {
                i = i2;
                nonEmptyDeserializedAnnotations = new NonEmptyDeserializedAnnotations(deserializationContext.f24572a.f24570a, new Function0(memberDeserializer, protoContainerA, extendableMessage, annotatedCallableKind, i, valueParameter) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$$Lambda$5
                    public final MemberDeserializer d;
                    public final ProtoContainer e;
                    public final MessageLite f;
                    public final AnnotatedCallableKind g;
                    public final int h;
                    public final ProtoBuf.ValueParameter i;

                    {
                        this.d = memberDeserializer;
                        this.e = protoContainerA;
                        this.f = extendableMessage;
                        this.g = annotatedCallableKind;
                        this.h = i;
                        this.i = valueParameter;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CollectionsKt.G0(this.d.f24580a.f24572a.e.a(this.e, this.f, this.g, this.h, this.i));
                    }
                });
            }
            Name nameB = NameResolverUtilKt.b(deserializationContext.b, valueParameter.h);
            KotlinType kotlinTypeG2 = typeDeserializer.g(ProtoTypeTableUtilKt.p(valueParameter, typeTable));
            boolean zBooleanValue = Flags.H.e(i4).booleanValue();
            boolean zBooleanValue2 = Flags.I.e(i4).booleanValue();
            boolean zBooleanValue3 = Flags.J.e(i4).booleanValue();
            ProtoBuf.Type typeR = ProtoTypeTableUtilKt.r(valueParameter, typeTable);
            if (typeR != null) {
                kotlinTypeG = typeDeserializer.g(typeR);
            }
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new ValueParameterDescriptorImpl(callableDescriptor, null, i, nonEmptyDeserializedAnnotations, nameB, kotlinTypeG2, zBooleanValue, zBooleanValue2, zBooleanValue3, kotlinTypeG, SourceElement.f24343a));
            arrayList = arrayList2;
            i2 = i3;
            memberDeserializer = this;
        }
        return CollectionsKt.G0(arrayList);
    }
}
