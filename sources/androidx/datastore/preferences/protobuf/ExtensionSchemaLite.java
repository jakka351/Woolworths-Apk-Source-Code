package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ExtensionRegistryLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.util.Map;

@CheckReturnValue
/* loaded from: classes.dex */
final class ExtensionSchemaLite extends ExtensionSchema<GeneratedMessageLite.ExtensionDescriptor> {

    /* renamed from: androidx.datastore.preferences.protobuf.ExtensionSchemaLite$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2634a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f2634a = iArr;
            try {
                iArr[WireFormat.FieldType.f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2634a[WireFormat.FieldType.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2634a[WireFormat.FieldType.h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2634a[WireFormat.FieldType.i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2634a[WireFormat.FieldType.j.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2634a[WireFormat.FieldType.k.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2634a[WireFormat.FieldType.l.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2634a[WireFormat.FieldType.m.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2634a[WireFormat.FieldType.r.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2634a[WireFormat.FieldType.t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2634a[WireFormat.FieldType.u.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2634a[WireFormat.FieldType.v.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2634a[WireFormat.FieldType.w.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2634a[WireFormat.FieldType.s.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2634a[WireFormat.FieldType.q.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2634a[WireFormat.FieldType.n.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2634a[WireFormat.FieldType.o.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f2634a[WireFormat.FieldType.p.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final int a(Map.Entry entry) {
        ((GeneratedMessageLite.ExtensionDescriptor) entry.getKey()).getClass();
        return 1001;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final GeneratedMessageLite.GeneratedExtension b(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i) {
        return (GeneratedMessageLite.GeneratedExtension) extensionRegistryLite.f2632a.get(new ExtensionRegistryLite.ObjectIntPair(i, messageLite));
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final FieldSet c(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final FieldSet d(Object obj) {
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSet = extendableMessage.extensions;
        if (fieldSet.b) {
            extendableMessage.extensions = fieldSet.clone();
        }
        return extendableMessage.extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final boolean e(MessageLite messageLite) {
        return messageLite instanceof GeneratedMessageLite.ExtendableMessage;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final void f(Object obj) {
        ((GeneratedMessageLite.ExtendableMessage) obj).extensions.j();
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final Object g(Object obj, Reader reader, Object obj2, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet, Object obj3, UnknownFieldSchema unknownFieldSchema) {
        Object objE;
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj2;
        generatedExtension.c();
        GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = generatedExtension.b;
        extensionDescriptor.getClass();
        Object objL = null;
        if (generatedExtension.a() == WireFormat.FieldType.s) {
            reader.B();
            throw null;
        }
        switch (generatedExtension.a().ordinal()) {
            case 0:
                objL = Double.valueOf(reader.readDouble());
                break;
            case 1:
                objL = Float.valueOf(reader.readFloat());
                break;
            case 2:
                objL = Long.valueOf(reader.t());
                break;
            case 3:
                objL = Long.valueOf(reader.j());
                break;
            case 4:
                objL = Integer.valueOf(reader.B());
                break;
            case 5:
                objL = Long.valueOf(reader.u());
                break;
            case 6:
                objL = Integer.valueOf(reader.E());
                break;
            case 7:
                objL = Boolean.valueOf(reader.w());
                break;
            case 8:
                objL = reader.G();
                break;
            case 9:
                generatedExtension.d();
                Object objE2 = fieldSet.e(extensionDescriptor);
                if (!(objE2 instanceof GeneratedMessageLite)) {
                    objL = reader.M(generatedExtension.b().getClass(), extensionRegistryLite);
                    break;
                } else {
                    Protobuf protobuf = Protobuf.c;
                    protobuf.getClass();
                    Schema schemaA = protobuf.a(objE2.getClass());
                    if (!((GeneratedMessageLite) objE2).n()) {
                        Object objNewInstance = schemaA.newInstance();
                        schemaA.a(objNewInstance, objE2);
                        fieldSet.l(extensionDescriptor, objNewInstance);
                        objE2 = objNewInstance;
                    }
                    reader.O(objE2, schemaA, extensionRegistryLite);
                    return obj3;
                }
            case 10:
                generatedExtension.d();
                Object objE3 = fieldSet.e(extensionDescriptor);
                if (!(objE3 instanceof GeneratedMessageLite)) {
                    objL = reader.J(generatedExtension.b().getClass(), extensionRegistryLite);
                    break;
                } else {
                    Protobuf protobuf2 = Protobuf.c;
                    protobuf2.getClass();
                    Schema schemaA2 = protobuf2.a(objE3.getClass());
                    if (!((GeneratedMessageLite) objE3).n()) {
                        Object objNewInstance2 = schemaA2.newInstance();
                        schemaA2.a(objNewInstance2, objE3);
                        fieldSet.l(extensionDescriptor, objNewInstance2);
                        objE3 = objNewInstance2;
                    }
                    reader.K(objE3, schemaA2, extensionRegistryLite);
                    return obj3;
                }
            case 11:
                objL = reader.h();
                break;
            case 12:
                objL = Integer.valueOf(reader.d());
                break;
            case 13:
                throw new IllegalStateException("Shouldn't reach here.");
            case 14:
                objL = Integer.valueOf(reader.H());
                break;
            case 15:
                objL = Long.valueOf(reader.c());
                break;
            case 16:
                objL = Integer.valueOf(reader.f());
                break;
            case 17:
                objL = Long.valueOf(reader.F());
                break;
        }
        generatedExtension.d();
        int iOrdinal = generatedExtension.a().ordinal();
        if ((iOrdinal == 9 || iOrdinal == 10) && (objE = fieldSet.e(extensionDescriptor)) != null) {
            GeneratedMessageLite.Builder builder = ((MessageLite) objE).toBuilder();
            MessageLite messageLite = (MessageLite) objL;
            if (!builder.d.getClass().isInstance(messageLite)) {
                throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
            }
            builder.getClass();
            builder.h((GeneratedMessageLite) ((AbstractMessageLite) messageLite));
            objL = builder.l();
        }
        fieldSet.l(extensionDescriptor, objL);
        return obj3;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final void h(Reader reader, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet) {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        fieldSet.l(generatedExtension.b, reader.J(generatedExtension.b().getClass(), extensionRegistryLite));
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final void i(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        GeneratedMessageLite.Builder builderNewBuilderForType = generatedExtension.b().newBuilderForType();
        CodedInputStream codedInputStreamO = byteString.o();
        builderNewBuilderForType.f();
        try {
            Protobuf protobuf = Protobuf.c;
            GeneratedMessageLite generatedMessageLite = builderNewBuilderForType.e;
            protobuf.getClass();
            Schema schemaA = protobuf.a(generatedMessageLite.getClass());
            GeneratedMessageLite generatedMessageLite2 = builderNewBuilderForType.e;
            CodedInputStreamReader codedInputStreamReader = codedInputStreamO.b;
            if (codedInputStreamReader == null) {
                codedInputStreamReader = new CodedInputStreamReader(codedInputStreamO);
            }
            schemaA.g(generatedMessageLite2, codedInputStreamReader, extensionRegistryLite);
            fieldSet.l(generatedExtension.b, builderNewBuilderForType.l());
            codedInputStreamO.a(0);
        } catch (RuntimeException e) {
            if (!(e.getCause() instanceof IOException)) {
                throw e;
            }
            throw ((IOException) e.getCause());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public final void j(Writer writer, Map.Entry entry) {
        GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = (GeneratedMessageLite.ExtensionDescriptor) entry.getKey();
        extensionDescriptor.getClass();
        switch (extensionDescriptor.h().ordinal()) {
            case 0:
                writer.w(((Double) entry.getValue()).doubleValue(), 1001);
                break;
            case 1:
                writer.D(((Float) entry.getValue()).floatValue(), 1001);
                break;
            case 2:
                writer.E(1001, ((Long) entry.getValue()).longValue());
                break;
            case 3:
                writer.e(1001, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                writer.g(1001, ((Integer) entry.getValue()).intValue());
                break;
            case 5:
                writer.m(1001, ((Long) entry.getValue()).longValue());
                break;
            case 6:
                writer.c(1001, ((Integer) entry.getValue()).intValue());
                break;
            case 7:
                writer.n(1001, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 8:
                writer.d(1001, (String) entry.getValue());
                break;
            case 9:
                writer.O(1001, entry.getValue(), Protobuf.c.a(entry.getValue().getClass()));
                break;
            case 10:
                writer.L(1001, entry.getValue(), Protobuf.c.a(entry.getValue().getClass()));
                break;
            case 11:
                writer.K(1001, (ByteString) entry.getValue());
                break;
            case 12:
                writer.k(1001, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                writer.g(1001, ((Integer) entry.getValue()).intValue());
                break;
            case 14:
                writer.o(1001, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                writer.x(1001, ((Long) entry.getValue()).longValue());
                break;
            case 16:
                writer.J(1001, ((Integer) entry.getValue()).intValue());
                break;
            case 17:
                writer.j(1001, ((Long) entry.getValue()).longValue());
                break;
        }
    }
}
