package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@CheckReturnValue
/* loaded from: classes.dex */
final class ExtensionSchemaLite extends ExtensionSchema<GeneratedMessageLite.ExtensionDescriptor> {

    /* renamed from: com.google.protobuf.ExtensionSchemaLite$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16044a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f16044a = iArr;
            try {
                iArr[WireFormat.FieldType.f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16044a[WireFormat.FieldType.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16044a[WireFormat.FieldType.h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16044a[WireFormat.FieldType.i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16044a[WireFormat.FieldType.j.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16044a[WireFormat.FieldType.k.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16044a[WireFormat.FieldType.l.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16044a[WireFormat.FieldType.m.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16044a[WireFormat.FieldType.r.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16044a[WireFormat.FieldType.t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16044a[WireFormat.FieldType.u.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f16044a[WireFormat.FieldType.v.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f16044a[WireFormat.FieldType.w.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f16044a[WireFormat.FieldType.s.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f16044a[WireFormat.FieldType.q.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f16044a[WireFormat.FieldType.n.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f16044a[WireFormat.FieldType.o.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f16044a[WireFormat.FieldType.p.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // com.google.protobuf.ExtensionSchema
    public final int a(Map.Entry entry) {
        return ((GeneratedMessageLite.ExtensionDescriptor) entry.getKey()).g();
    }

    @Override // com.google.protobuf.ExtensionSchema
    public final GeneratedMessageLite.GeneratedExtension b(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i) {
        return extensionRegistryLite.a(i, messageLite);
    }

    @Override // com.google.protobuf.ExtensionSchema
    public final FieldSet c(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    @Override // com.google.protobuf.ExtensionSchema
    public final FieldSet d(Object obj) {
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSet = extendableMessage.extensions;
        if (fieldSet.b) {
            extendableMessage.extensions = fieldSet.clone();
        }
        return extendableMessage.extensions;
    }

    @Override // com.google.protobuf.ExtensionSchema
    public final boolean e(MessageLite messageLite) {
        return messageLite instanceof GeneratedMessageLite.ExtendableMessage;
    }

    @Override // com.google.protobuf.ExtensionSchema
    public final void f(Object obj) {
        ((GeneratedMessageLite.ExtendableMessage) obj).extensions.k();
    }

    @Override // com.google.protobuf.ExtensionSchema
    public final Object g(Object obj, Reader reader, Object obj2, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet, Object obj3, UnknownFieldSchema unknownFieldSchema) {
        Object objValueOf;
        Object objF;
        List arrayList;
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj2;
        int iC = generatedExtension.c();
        GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = generatedExtension.d;
        if (extensionDescriptor.j() && extensionDescriptor.k()) {
            switch (generatedExtension.a().ordinal()) {
                case 0:
                    arrayList = new ArrayList();
                    reader.s(arrayList);
                    break;
                case 1:
                    arrayList = new ArrayList();
                    reader.p(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    reader.y(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    reader.x(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    reader.l(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    reader.C(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    reader.m(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    reader.g(arrayList);
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    throw new IllegalStateException("Type cannot be packed: " + extensionDescriptor.h());
                case 12:
                    arrayList = new ArrayList();
                    reader.D(arrayList);
                    break;
                case 13:
                    ArrayList arrayList2 = new ArrayList();
                    reader.z(arrayList2);
                    obj3 = SchemaUtil.j(obj, iC, arrayList2, extensionDescriptor.a(), obj3, unknownFieldSchema);
                    arrayList = arrayList2;
                    break;
                case 14:
                    arrayList = new ArrayList();
                    reader.v(arrayList);
                    break;
                case 15:
                    arrayList = new ArrayList();
                    reader.k(arrayList);
                    break;
                case 16:
                    arrayList = new ArrayList();
                    reader.i(arrayList);
                    break;
                case 17:
                    arrayList = new ArrayList();
                    reader.a(arrayList);
                    break;
            }
            fieldSet.m(extensionDescriptor, arrayList);
            return obj3;
        }
        if (generatedExtension.a() != WireFormat.FieldType.s) {
            switch (generatedExtension.a().ordinal()) {
                case 0:
                    objValueOf = Double.valueOf(reader.readDouble());
                    break;
                case 1:
                    objValueOf = Float.valueOf(reader.readFloat());
                    break;
                case 2:
                    objValueOf = Long.valueOf(reader.t());
                    break;
                case 3:
                    objValueOf = Long.valueOf(reader.j());
                    break;
                case 4:
                    objValueOf = Integer.valueOf(reader.B());
                    break;
                case 5:
                    objValueOf = Long.valueOf(reader.u());
                    break;
                case 6:
                    objValueOf = Integer.valueOf(reader.E());
                    break;
                case 7:
                    objValueOf = Boolean.valueOf(reader.w());
                    break;
                case 8:
                    objValueOf = reader.G();
                    break;
                case 9:
                    if (!generatedExtension.d()) {
                        Object objF2 = fieldSet.f(extensionDescriptor);
                        if (objF2 instanceof GeneratedMessageLite) {
                            Protobuf protobuf = Protobuf.c;
                            protobuf.getClass();
                            Schema schemaA = protobuf.a(objF2.getClass());
                            if (!((GeneratedMessageLite) objF2).A()) {
                                Object objNewInstance = schemaA.newInstance();
                                schemaA.a(objNewInstance, objF2);
                                fieldSet.m(extensionDescriptor, objNewInstance);
                                objF2 = objNewInstance;
                            }
                            reader.K(objF2, schemaA, extensionRegistryLite);
                            return obj3;
                        }
                    }
                    objValueOf = reader.O(generatedExtension.b().getClass(), extensionRegistryLite);
                    break;
                case 10:
                    if (!generatedExtension.d()) {
                        Object objF3 = fieldSet.f(extensionDescriptor);
                        if (objF3 instanceof GeneratedMessageLite) {
                            Protobuf protobuf2 = Protobuf.c;
                            protobuf2.getClass();
                            Schema schemaA2 = protobuf2.a(objF3.getClass());
                            if (!((GeneratedMessageLite) objF3).A()) {
                                Object objNewInstance2 = schemaA2.newInstance();
                                schemaA2.a(objNewInstance2, objF3);
                                fieldSet.m(extensionDescriptor, objNewInstance2);
                                objF3 = objNewInstance2;
                            }
                            reader.L(objF3, schemaA2, extensionRegistryLite);
                            return obj3;
                        }
                    }
                    objValueOf = reader.P(generatedExtension.b().getClass(), extensionRegistryLite);
                    break;
                case 11:
                    objValueOf = reader.h();
                    break;
                case 12:
                    objValueOf = Integer.valueOf(reader.d());
                    break;
                case 13:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 14:
                    objValueOf = Integer.valueOf(reader.H());
                    break;
                case 15:
                    objValueOf = Long.valueOf(reader.c());
                    break;
                case 16:
                    objValueOf = Integer.valueOf(reader.f());
                    break;
                case 17:
                    objValueOf = Long.valueOf(reader.F());
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        } else {
            int iB = reader.B();
            if (extensionDescriptor.a().a(iB) == null) {
                return SchemaUtil.n(obj, iC, iB, obj3, unknownFieldSchema);
            }
            objValueOf = Integer.valueOf(iB);
        }
        if (generatedExtension.d()) {
            fieldSet.a(extensionDescriptor, objValueOf);
            return obj3;
        }
        int iOrdinal = generatedExtension.a().ordinal();
        if ((iOrdinal == 9 || iOrdinal == 10) && (objF = fieldSet.f(extensionDescriptor)) != null) {
            GeneratedMessageLite.Builder builder = ((MessageLite) objF).toBuilder();
            MessageLite messageLite = (MessageLite) objValueOf;
            if (!builder.d.getClass().isInstance(messageLite)) {
                throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
            }
            builder.getClass();
            builder.r((GeneratedMessageLite) ((AbstractMessageLite) messageLite));
            objValueOf = builder.l();
        }
        fieldSet.m(extensionDescriptor, objValueOf);
        return obj3;
    }

    @Override // com.google.protobuf.ExtensionSchema
    public final void h(Reader reader, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet) {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        fieldSet.m(generatedExtension.d, reader.P(generatedExtension.b().getClass(), extensionRegistryLite));
    }

    @Override // com.google.protobuf.ExtensionSchema
    public final void i(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        GeneratedMessageLite.Builder builderNewBuilderForType = generatedExtension.b().newBuilderForType();
        CodedInputStream codedInputStreamT = byteString.t();
        builderNewBuilderForType.p();
        try {
            Protobuf.c.b(builderNewBuilderForType.e).h(builderNewBuilderForType.e, CodedInputStreamReader.Q(codedInputStreamT), extensionRegistryLite);
            fieldSet.m(generatedExtension.d, builderNewBuilderForType.l());
            codedInputStreamT.a(0);
        } catch (RuntimeException e) {
            if (!(e.getCause() instanceof IOException)) {
                throw e;
            }
            throw ((IOException) e.getCause());
        }
    }

    @Override // com.google.protobuf.ExtensionSchema
    public final void j(Writer writer, Map.Entry entry) {
        GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = (GeneratedMessageLite.ExtensionDescriptor) entry.getKey();
        if (!extensionDescriptor.j()) {
            switch (extensionDescriptor.h().ordinal()) {
                case 0:
                    writer.w(((Double) entry.getValue()).doubleValue(), extensionDescriptor.g());
                    break;
                case 1:
                    writer.D(((Float) entry.getValue()).floatValue(), extensionDescriptor.g());
                    break;
                case 2:
                    writer.E(extensionDescriptor.g(), ((Long) entry.getValue()).longValue());
                    break;
                case 3:
                    writer.e(extensionDescriptor.g(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    writer.g(extensionDescriptor.g(), ((Integer) entry.getValue()).intValue());
                    break;
                case 5:
                    writer.m(extensionDescriptor.g(), ((Long) entry.getValue()).longValue());
                    break;
                case 6:
                    writer.c(extensionDescriptor.g(), ((Integer) entry.getValue()).intValue());
                    break;
                case 7:
                    writer.n(extensionDescriptor.g(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 8:
                    writer.d(extensionDescriptor.g(), (String) entry.getValue());
                    break;
                case 9:
                    writer.N(extensionDescriptor.g(), entry.getValue(), Protobuf.c.a(entry.getValue().getClass()));
                    break;
                case 10:
                    writer.P(extensionDescriptor.g(), entry.getValue(), Protobuf.c.a(entry.getValue().getClass()));
                    break;
                case 11:
                    writer.K(extensionDescriptor.g(), (ByteString) entry.getValue());
                    break;
                case 12:
                    writer.k(extensionDescriptor.g(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    writer.g(extensionDescriptor.g(), ((Integer) entry.getValue()).intValue());
                    break;
                case 14:
                    writer.o(extensionDescriptor.g(), ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    writer.x(extensionDescriptor.g(), ((Long) entry.getValue()).longValue());
                    break;
                case 16:
                    writer.J(extensionDescriptor.g(), ((Integer) entry.getValue()).intValue());
                    break;
                case 17:
                    writer.j(extensionDescriptor.g(), ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        switch (extensionDescriptor.h().ordinal()) {
            case 0:
                SchemaUtil.p(extensionDescriptor.g(), (List) entry.getValue(), writer, extensionDescriptor.k());
                break;
            case 1:
                SchemaUtil.s(extensionDescriptor.g(), (List) entry.getValue(), writer, extensionDescriptor.k());
                break;
            case 2:
                SchemaUtil.u(extensionDescriptor.g(), (List) entry.getValue(), writer, extensionDescriptor.k());
                break;
            case 3:
                SchemaUtil.A(extensionDescriptor.g(), (List) entry.getValue(), writer, extensionDescriptor.k());
                break;
            case 4:
                SchemaUtil.t(extensionDescriptor.g(), (List) entry.getValue(), writer, extensionDescriptor.k());
                break;
            case 5:
                SchemaUtil.r(extensionDescriptor.g(), (List) entry.getValue(), writer, extensionDescriptor.k());
                break;
            case 6:
                SchemaUtil.q(extensionDescriptor.g(), (List) entry.getValue(), writer, extensionDescriptor.k());
                break;
            case 7:
                SchemaUtil.o(extensionDescriptor.g(), (List) entry.getValue(), writer, extensionDescriptor.k());
                break;
            case 8:
                int iG = extensionDescriptor.g();
                List list = (List) entry.getValue();
                Class cls = SchemaUtil.f16080a;
                if (list != null && !list.isEmpty()) {
                    writer.v(iG, list);
                    break;
                }
                break;
            case 9:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    int iG2 = extensionDescriptor.g();
                    List list3 = (List) entry.getValue();
                    Schema schemaA = Protobuf.c.a(list2.get(0).getClass());
                    Class cls2 = SchemaUtil.f16080a;
                    if (list3 != null && !list3.isEmpty()) {
                        writer.O(iG2, list3, schemaA);
                        break;
                    }
                }
                break;
            case 10:
                List list4 = (List) entry.getValue();
                if (list4 != null && !list4.isEmpty()) {
                    int iG3 = extensionDescriptor.g();
                    List list5 = (List) entry.getValue();
                    Schema schemaA2 = Protobuf.c.a(list4.get(0).getClass());
                    Class cls3 = SchemaUtil.f16080a;
                    if (list5 != null && !list5.isEmpty()) {
                        writer.M(iG3, list5, schemaA2);
                        break;
                    }
                }
                break;
            case 11:
                int iG4 = extensionDescriptor.g();
                List list6 = (List) entry.getValue();
                Class cls4 = SchemaUtil.f16080a;
                if (list6 != null && !list6.isEmpty()) {
                    writer.u(iG4, list6);
                    break;
                }
                break;
            case 12:
                SchemaUtil.z(extensionDescriptor.g(), (List) entry.getValue(), writer, extensionDescriptor.k());
                break;
            case 13:
                SchemaUtil.t(extensionDescriptor.g(), (List) entry.getValue(), writer, extensionDescriptor.k());
                break;
            case 14:
                SchemaUtil.v(extensionDescriptor.g(), (List) entry.getValue(), writer, extensionDescriptor.k());
                break;
            case 15:
                SchemaUtil.w(extensionDescriptor.g(), (List) entry.getValue(), writer, extensionDescriptor.k());
                break;
            case 16:
                SchemaUtil.x(extensionDescriptor.g(), (List) entry.getValue(), writer, extensionDescriptor.k());
                break;
            case 17:
                SchemaUtil.y(extensionDescriptor.g(), (List) entry.getValue(), writer, extensionDescriptor.k());
                break;
        }
    }
}
