package com.google.protobuf;

import com.google.protobuf.FieldSet;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.LazyField;
import com.google.protobuf.SmallSortedMap;
import com.google.protobuf.WireFormat;
import java.util.Iterator;
import java.util.Map;

@CheckReturnValue
/* loaded from: classes6.dex */
final class MessageSetSchema<T> implements Schema<T> {

    /* renamed from: a, reason: collision with root package name */
    public final MessageLite f16072a;
    public final UnknownFieldSchema b;
    public final boolean c;
    public final ExtensionSchema d;

    public MessageSetSchema(UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MessageLite messageLite) {
        this.b = unknownFieldSchema;
        this.c = extensionSchema.e(messageLite);
        this.d = extensionSchema;
        this.f16072a = messageLite;
    }

    public static MessageSetSchema j(UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MessageLite messageLite) {
        return new MessageSetSchema(unknownFieldSchema, extensionSchema, messageLite);
    }

    @Override // com.google.protobuf.Schema
    public final void a(Object obj, Object obj2) {
        Class cls = SchemaUtil.f16080a;
        UnknownFieldSchema unknownFieldSchema = this.b;
        unknownFieldSchema.o(obj, unknownFieldSchema.k(unknownFieldSchema.g(obj), unknownFieldSchema.g(obj2)));
        if (this.c) {
            SchemaUtil.l(this.d, obj, obj2);
        }
    }

    @Override // com.google.protobuf.Schema
    public final boolean b(Object obj) {
        return this.d.c(obj).h();
    }

    @Override // com.google.protobuf.Schema
    public final void c(Object obj) {
        this.b.j(obj);
        this.d.f(obj);
    }

    @Override // com.google.protobuf.Schema
    public final void d(Object obj, Writer writer) {
        Iterator itJ = this.d.c(obj).j();
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            FieldSet.FieldDescriptorLite fieldDescriptorLite = (FieldSet.FieldDescriptorLite) entry.getKey();
            if (fieldDescriptorLite.i() != WireFormat.JavaType.MESSAGE || fieldDescriptorLite.j() || fieldDescriptorLite.k()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof LazyField.LazyEntry) {
                writer.b(fieldDescriptorLite.g(), ((LazyField) ((LazyField.LazyEntry) entry).d.getValue()).b());
            } else {
                writer.b(fieldDescriptorLite.g(), entry.getValue());
            }
        }
        UnknownFieldSchema unknownFieldSchema = this.b;
        unknownFieldSchema.q(unknownFieldSchema.g(obj), writer);
    }

    @Override // com.google.protobuf.Schema
    public final int e(AbstractMessageLite abstractMessageLite) {
        UnknownFieldSchema unknownFieldSchema = this.b;
        int i = unknownFieldSchema.i(unknownFieldSchema.g(abstractMessageLite));
        if (!this.c) {
            return i;
        }
        SmallSortedMap.AnonymousClass1 anonymousClass1 = this.d.c(abstractMessageLite).f16049a;
        int iG = 0;
        for (int i2 = 0; i2 < anonymousClass1.e.size(); i2++) {
            iG += FieldSet.g(anonymousClass1.c(i2));
        }
        Iterator<T> it = anonymousClass1.d().iterator();
        while (it.hasNext()) {
            iG += FieldSet.g((Map.Entry) it.next());
        }
        return i + iG;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    @Override // com.google.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.lang.Object r17, byte[] r18, int r19, int r20, com.google.protobuf.ArrayDecoders.Registers r21) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSetSchema.f(java.lang.Object, byte[], int, int, com.google.protobuf.ArrayDecoders$Registers):void");
    }

    @Override // com.google.protobuf.Schema
    public final int g(GeneratedMessageLite generatedMessageLite) {
        int iHashCode = this.b.g(generatedMessageLite).hashCode();
        return this.c ? (iHashCode * 53) + this.d.c(generatedMessageLite).f16049a.hashCode() : iHashCode;
    }

    @Override // com.google.protobuf.Schema
    public final void h(Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite) {
        UnknownFieldSchema unknownFieldSchema = this.b;
        UnknownFieldSetLite unknownFieldSetLiteF = unknownFieldSchema.f(obj);
        ExtensionSchema extensionSchema = this.d;
        FieldSet fieldSetD = extensionSchema.d(obj);
        while (reader.n() != Integer.MAX_VALUE) {
            try {
                Reader reader2 = reader;
                ExtensionRegistryLite extensionRegistryLite2 = extensionRegistryLite;
                if (!k(reader2, extensionRegistryLite2, extensionSchema, fieldSetD, unknownFieldSchema, unknownFieldSetLiteF)) {
                    return;
                }
                reader = reader2;
                extensionRegistryLite = extensionRegistryLite2;
            } finally {
                unknownFieldSchema.n(obj, unknownFieldSetLiteF);
            }
        }
    }

    @Override // com.google.protobuf.Schema
    public final boolean i(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        UnknownFieldSchema unknownFieldSchema = this.b;
        if (!unknownFieldSchema.g(generatedMessageLite).equals(unknownFieldSchema.g(generatedMessageLite2))) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        ExtensionSchema extensionSchema = this.d;
        return extensionSchema.c(generatedMessageLite).equals(extensionSchema.c(generatedMessageLite2));
    }

    public final boolean k(Reader reader, ExtensionRegistryLite extensionRegistryLite, ExtensionSchema extensionSchema, FieldSet fieldSet, UnknownFieldSchema unknownFieldSchema, Object obj) throws InvalidProtocolBufferException {
        int iB = reader.b();
        int iD = 0;
        MessageLite messageLite = this.f16072a;
        if (iB != 11) {
            if ((iB & 7) != 2) {
                return reader.q();
            }
            GeneratedMessageLite.GeneratedExtension generatedExtensionB = extensionSchema.b(extensionRegistryLite, messageLite, iB >>> 3);
            if (generatedExtensionB == null) {
                return unknownFieldSchema.l(0, reader, obj);
            }
            extensionSchema.h(reader, generatedExtensionB, extensionRegistryLite, fieldSet);
            return true;
        }
        GeneratedMessageLite.GeneratedExtension generatedExtensionB2 = null;
        ByteString byteStringH = null;
        while (reader.n() != Integer.MAX_VALUE) {
            int iB2 = reader.b();
            if (iB2 == 16) {
                iD = reader.d();
                generatedExtensionB2 = extensionSchema.b(extensionRegistryLite, messageLite, iD);
            } else if (iB2 == 26) {
                if (generatedExtensionB2 != null) {
                    extensionSchema.h(reader, generatedExtensionB2, extensionRegistryLite, fieldSet);
                } else {
                    byteStringH = reader.h();
                }
            } else if (!reader.q()) {
                break;
            }
        }
        if (reader.b() != 12) {
            throw InvalidProtocolBufferException.a();
        }
        if (byteStringH != null) {
            if (generatedExtensionB2 != null) {
                extensionSchema.i(byteStringH, generatedExtensionB2, extensionRegistryLite, fieldSet);
                return true;
            }
            unknownFieldSchema.d(obj, iD, byteStringH);
        }
        return true;
    }

    @Override // com.google.protobuf.Schema
    public final Object newInstance() {
        MessageLite messageLite = this.f16072a;
        return messageLite instanceof GeneratedMessageLite ? ((GeneratedMessageLite) messageLite).E() : messageLite.newBuilderForType().l();
    }
}
