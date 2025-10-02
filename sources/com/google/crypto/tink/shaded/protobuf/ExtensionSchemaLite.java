package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.BinaryReader;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.WireFormat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
final class ExtensionSchemaLite extends ExtensionSchema<GeneratedMessageLite.ExtensionDescriptor> {

    /* renamed from: com.google.crypto.tink.shaded.protobuf.ExtensionSchemaLite$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15093a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f15093a = iArr;
            try {
                iArr[WireFormat.FieldType.f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15093a[WireFormat.FieldType.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15093a[WireFormat.FieldType.h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15093a[WireFormat.FieldType.i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15093a[WireFormat.FieldType.j.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15093a[WireFormat.FieldType.k.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15093a[WireFormat.FieldType.l.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15093a[WireFormat.FieldType.m.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15093a[WireFormat.FieldType.r.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15093a[WireFormat.FieldType.t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f15093a[WireFormat.FieldType.u.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f15093a[WireFormat.FieldType.v.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f15093a[WireFormat.FieldType.w.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f15093a[WireFormat.FieldType.s.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f15093a[WireFormat.FieldType.q.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f15093a[WireFormat.FieldType.n.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f15093a[WireFormat.FieldType.o.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f15093a[WireFormat.FieldType.p.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ExtensionSchema
    public final int a(Map.Entry entry) {
        return ((GeneratedMessageLite.ExtensionDescriptor) entry.getKey()).e;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ExtensionSchema
    public final GeneratedMessageLite.GeneratedExtension b(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i) {
        return extensionRegistryLite.a(i, messageLite);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ExtensionSchema
    public final FieldSet c(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ExtensionSchema
    public final FieldSet d(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ExtensionSchema
    public final boolean e(MessageLite messageLite) {
        return messageLite instanceof GeneratedMessageLite.ExtendableMessage;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ExtensionSchema
    public final void f(Object obj) {
        ((GeneratedMessageLite.ExtendableMessage) obj).extensions.o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ExtensionSchema
    public final Object g(Reader reader, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet, Object obj2, UnknownFieldSchema unknownFieldSchema) {
        Object objValueOf;
        Object objG;
        ArrayList arrayList;
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = generatedExtension.d;
        MessageLite messageLite = generatedExtension.c;
        int i = extensionDescriptor.e;
        WireFormat.FieldType fieldType = extensionDescriptor.f;
        if (extensionDescriptor.g && extensionDescriptor.h) {
            switch (fieldType.ordinal()) {
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
                    throw new IllegalStateException("Type cannot be packed: " + extensionDescriptor.f);
                case 12:
                    arrayList = new ArrayList();
                    reader.D(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    reader.z(arrayList);
                    obj2 = SchemaUtil.w(i, arrayList, extensionDescriptor.d, obj2, unknownFieldSchema);
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
            fieldSet.r(extensionDescriptor, arrayList);
            return obj2;
        }
        if (fieldType != WireFormat.FieldType.s) {
            switch (fieldType.ordinal()) {
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
                    objValueOf = reader.K(messageLite.getClass(), extensionRegistryLite);
                    break;
                case 10:
                    objValueOf = reader.O(messageLite.getClass(), extensionRegistryLite);
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
            if (extensionDescriptor.d.a(iB) == null) {
                return SchemaUtil.A(i, iB, obj2, unknownFieldSchema);
            }
            objValueOf = Integer.valueOf(iB);
        }
        if (extensionDescriptor.g) {
            fieldSet.a(extensionDescriptor, objValueOf);
            return obj2;
        }
        int iOrdinal = extensionDescriptor.f.ordinal();
        if ((iOrdinal == 9 || iOrdinal == 10) && (objG = fieldSet.g(extensionDescriptor)) != null) {
            objValueOf = Internal.c(objG, objValueOf);
        }
        fieldSet.r(extensionDescriptor, objValueOf);
        return obj2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ExtensionSchema
    public final void h(Reader reader, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet) {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        fieldSet.r(generatedExtension.d, reader.O(generatedExtension.c.getClass(), extensionRegistryLite));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ExtensionSchema
    public final void i(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet) throws InvalidProtocolBufferException {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        MessageLite messageLiteL = generatedExtension.c.newBuilderForType().l();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(byteString.w());
        if (!byteBufferWrap.hasArray()) {
            throw new IllegalArgumentException("Direct buffers not yet supported");
        }
        BinaryReader.SafeHeapReader safeHeapReader = new BinaryReader.SafeHeapReader(byteBufferWrap);
        Protobuf.c.b(messageLiteL).g(messageLiteL, safeHeapReader, extensionRegistryLite);
        fieldSet.r(generatedExtension.d, messageLiteL);
        if (safeHeapReader.n() != Integer.MAX_VALUE) {
            throw InvalidProtocolBufferException.a();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ExtensionSchema
    public final void j(Writer writer, Map.Entry entry) {
        GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = (GeneratedMessageLite.ExtensionDescriptor) entry.getKey();
        boolean z = extensionDescriptor.g;
        WireFormat.FieldType fieldType = extensionDescriptor.f;
        boolean z2 = extensionDescriptor.h;
        int i = extensionDescriptor.e;
        if (!z) {
            switch (fieldType.ordinal()) {
                case 0:
                    writer.w(((Double) entry.getValue()).doubleValue(), i);
                    break;
                case 1:
                    writer.D(((Float) entry.getValue()).floatValue(), i);
                    break;
                case 2:
                    writer.E(i, ((Long) entry.getValue()).longValue());
                    break;
                case 3:
                    writer.e(i, ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    writer.g(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 5:
                    writer.m(i, ((Long) entry.getValue()).longValue());
                    break;
                case 6:
                    writer.c(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 7:
                    writer.n(i, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 8:
                    writer.d(i, (String) entry.getValue());
                    break;
                case 9:
                    writer.L(i, entry.getValue(), Protobuf.c.a(entry.getValue().getClass()));
                    break;
                case 10:
                    writer.N(i, entry.getValue(), Protobuf.c.a(entry.getValue().getClass()));
                    break;
                case 11:
                    writer.P(i, (ByteString) entry.getValue());
                    break;
                case 12:
                    writer.k(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    writer.g(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 14:
                    writer.o(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    writer.x(i, ((Long) entry.getValue()).longValue());
                    break;
                case 16:
                    writer.J(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 17:
                    writer.j(i, ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        switch (fieldType.ordinal()) {
            case 0:
                SchemaUtil.C(i, (List) entry.getValue(), writer, z2);
                break;
            case 1:
                SchemaUtil.G(i, (List) entry.getValue(), writer, z2);
                break;
            case 2:
                SchemaUtil.I(i, (List) entry.getValue(), writer, z2);
                break;
            case 3:
                SchemaUtil.O(i, (List) entry.getValue(), writer, z2);
                break;
            case 4:
                SchemaUtil.H(i, (List) entry.getValue(), writer, z2);
                break;
            case 5:
                SchemaUtil.F(i, (List) entry.getValue(), writer, z2);
                break;
            case 6:
                SchemaUtil.E(i, (List) entry.getValue(), writer, z2);
                break;
            case 7:
                SchemaUtil.B(i, (List) entry.getValue(), writer, z2);
                break;
            case 8:
                List list = (List) entry.getValue();
                Class cls = SchemaUtil.f15116a;
                if (list != null && !list.isEmpty()) {
                    writer.v(i, list);
                    break;
                }
                break;
            case 9:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    List list3 = (List) entry.getValue();
                    Schema schemaA = Protobuf.c.a(list2.get(0).getClass());
                    Class cls2 = SchemaUtil.f15116a;
                    if (list3 != null && !list3.isEmpty()) {
                        writer.O(i, list3, schemaA);
                        break;
                    }
                }
                break;
            case 10:
                List list4 = (List) entry.getValue();
                if (list4 != null && !list4.isEmpty()) {
                    List list5 = (List) entry.getValue();
                    Schema schemaA2 = Protobuf.c.a(list4.get(0).getClass());
                    Class cls3 = SchemaUtil.f15116a;
                    if (list5 != null && !list5.isEmpty()) {
                        writer.M(i, list5, schemaA2);
                        break;
                    }
                }
                break;
            case 11:
                List list6 = (List) entry.getValue();
                Class cls4 = SchemaUtil.f15116a;
                if (list6 != null && !list6.isEmpty()) {
                    writer.u(i, list6);
                    break;
                }
                break;
            case 12:
                SchemaUtil.N(i, (List) entry.getValue(), writer, z2);
                break;
            case 13:
                SchemaUtil.H(i, (List) entry.getValue(), writer, z2);
                break;
            case 14:
                SchemaUtil.J(i, (List) entry.getValue(), writer, z2);
                break;
            case 15:
                SchemaUtil.K(i, (List) entry.getValue(), writer, z2);
                break;
            case 16:
                SchemaUtil.L(i, (List) entry.getValue(), writer, z2);
                break;
            case 17:
                SchemaUtil.M(i, (List) entry.getValue(), writer, z2);
                break;
        }
    }
}
