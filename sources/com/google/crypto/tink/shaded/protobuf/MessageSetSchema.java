package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.FieldSet;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.LazyField;
import com.google.crypto.tink.shaded.protobuf.WireFormat;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
final class MessageSetSchema<T> implements Schema<T> {

    /* renamed from: a, reason: collision with root package name */
    public final MessageLite f15112a;
    public final UnknownFieldSchema b;
    public final boolean c;
    public final ExtensionSchema d;

    public MessageSetSchema(UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MessageLite messageLite) {
        this.b = unknownFieldSchema;
        this.c = extensionSchema.e(messageLite);
        this.d = extensionSchema;
        this.f15112a = messageLite;
    }

    public static MessageSetSchema j(UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MessageLite messageLite) {
        return new MessageSetSchema(unknownFieldSchema, extensionSchema, messageLite);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r17, byte[] r18, int r19, int r20, com.google.crypto.tink.shaded.protobuf.ArrayDecoders.Registers r21) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        /*
            r16 = this;
            r0 = r16
            r2 = r18
            r4 = r20
            r6 = r21
            r1 = r17
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r1
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r3 = r1.unknownFields
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r5 = com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite.f
            if (r3 != r5) goto L19
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r3 = new com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite
            r3.<init>()
            r1.unknownFields = r3
        L19:
            r5 = r3
            r1 = r17
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r1 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) r1
            com.google.crypto.tink.shaded.protobuf.FieldSet r7 = r1.ensureExtensionsAreMutable()
            r1 = r19
            r3 = 0
        L25:
            if (r1 >= r4) goto Lca
            r9 = r3
            int r3 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.s(r2, r1, r6)
            int r1 = r6.f15078a
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r10 = r6.d
            r11 = 11
            com.google.crypto.tink.shaded.protobuf.MessageLite r12 = r0.f15112a
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema r13 = r0.d
            r14 = 2
            if (r1 == r11) goto L68
            r11 = r1 & 7
            if (r11 != r14) goto L63
            int r9 = r1 >>> 3
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r9 = r13.b(r10, r12, r9)
            if (r9 == 0) goto L5e
            com.google.crypto.tink.shaded.protobuf.Protobuf r1 = com.google.crypto.tink.shaded.protobuf.Protobuf.c
            com.google.crypto.tink.shaded.protobuf.MessageLite r10 = r9.c
            java.lang.Class r10 = r10.getClass()
            com.google.crypto.tink.shaded.protobuf.Schema r1 = r1.a(r10)
            int r1 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.e(r1, r2, r3, r4, r6)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r3 = r9.d
            java.lang.Object r10 = r6.c
            r7.r(r3, r10)
        L5c:
            r3 = r9
            goto L25
        L5e:
            int r1 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.q(r1, r2, r3, r4, r5, r6)
            goto L5c
        L63:
            int r1 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.v(r1, r2, r3, r4, r6)
            goto L5c
        L68:
            r1 = 0
            r11 = 0
        L6a:
            if (r3 >= r4) goto Lbd
            int r3 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.s(r2, r3, r6)
            int r15 = r6.f15078a
            int r8 = r15 >>> 3
            r0 = r15 & 7
            if (r8 == r14) goto La6
            r14 = 3
            if (r8 == r14) goto L7c
            goto Lb3
        L7c:
            if (r9 == 0) goto L99
            com.google.crypto.tink.shaded.protobuf.Protobuf r0 = com.google.crypto.tink.shaded.protobuf.Protobuf.c
            com.google.crypto.tink.shaded.protobuf.MessageLite r8 = r9.c
            java.lang.Class r8 = r8.getClass()
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r0.a(r8)
            int r3 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.e(r0, r2, r3, r4, r6)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = r9.d
            java.lang.Object r8 = r6.c
            r7.r(r0, r8)
        L95:
            r14 = 2
            r0 = r16
            goto L6a
        L99:
            r8 = 2
            if (r0 != r8) goto Lb3
            int r3 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.a(r2, r3, r6)
            java.lang.Object r0 = r6.c
            r11 = r0
            com.google.crypto.tink.shaded.protobuf.ByteString r11 = (com.google.crypto.tink.shaded.protobuf.ByteString) r11
            goto L95
        La6:
            if (r0 != 0) goto Lb3
            int r3 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.s(r2, r3, r6)
            int r1 = r6.f15078a
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r9 = r13.b(r10, r12, r1)
            goto L95
        Lb3:
            r0 = 12
            if (r15 != r0) goto Lb8
            goto Lbd
        Lb8:
            int r3 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.v(r15, r2, r3, r4, r6)
            goto L95
        Lbd:
            if (r11 == 0) goto Lc6
            int r0 = r1 << 3
            r8 = 2
            r0 = r0 | r8
            r5.d(r0, r11)
        Lc6:
            r0 = r16
            r1 = r3
            goto L5c
        Lca:
            if (r1 != r4) goto Lcd
            return
        Lcd:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.MessageSetSchema.a(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.ArrayDecoders$Registers):void");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public final boolean b(Object obj) {
        return this.d.c(obj).l();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public final void c(Object obj) {
        this.b.j(obj);
        this.d.f(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public final boolean d(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
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

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public final int e(GeneratedMessageLite generatedMessageLite) {
        int iHashCode = this.b.g(generatedMessageLite).hashCode();
        return this.c ? (iHashCode * 53) + this.d.c(generatedMessageLite).f15096a.hashCode() : iHashCode;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public final int f(AbstractMessageLite abstractMessageLite) {
        UnknownFieldSchema unknownFieldSchema = this.b;
        int i = unknownFieldSchema.i(unknownFieldSchema.g(abstractMessageLite));
        return this.c ? i + this.d.c(abstractMessageLite).h() : i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public final void g(Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite) {
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

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public final void h(Object obj, Writer writer) {
        Iterator itN = this.d.c(obj).n();
        while (itN.hasNext()) {
            Map.Entry entry = (Map.Entry) itN.next();
            FieldSet.FieldDescriptorLite fieldDescriptorLite = (FieldSet.FieldDescriptorLite) entry.getKey();
            if (fieldDescriptorLite.i() != WireFormat.JavaType.MESSAGE || fieldDescriptorLite.j() || fieldDescriptorLite.k()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof LazyField.LazyEntry) {
                writer.b(fieldDescriptorLite.g(), ((LazyField) ((LazyField.LazyEntry) entry).d.getValue()).c());
            } else {
                writer.b(fieldDescriptorLite.g(), entry.getValue());
            }
        }
        UnknownFieldSchema unknownFieldSchema = this.b;
        unknownFieldSchema.q(unknownFieldSchema.g(obj), writer);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public final void i(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        Class cls = SchemaUtil.f15116a;
        UnknownFieldSchema unknownFieldSchema = this.b;
        unknownFieldSchema.o(generatedMessageLite, unknownFieldSchema.k(unknownFieldSchema.g(generatedMessageLite), unknownFieldSchema.g(generatedMessageLite2)));
        if (this.c) {
            ExtensionSchema extensionSchema = this.d;
            FieldSet fieldSetC = extensionSchema.c(generatedMessageLite2);
            if (fieldSetC.k()) {
                return;
            }
            extensionSchema.d(generatedMessageLite).p(fieldSetC);
        }
    }

    public final boolean k(Reader reader, ExtensionRegistryLite extensionRegistryLite, ExtensionSchema extensionSchema, FieldSet fieldSet, UnknownFieldSchema unknownFieldSchema, Object obj) throws InvalidProtocolBufferException {
        int iB = reader.b();
        MessageLite messageLite = this.f15112a;
        if (iB != 11) {
            if ((iB & 7) != 2) {
                return reader.q();
            }
            GeneratedMessageLite.GeneratedExtension generatedExtensionB = extensionSchema.b(extensionRegistryLite, messageLite, iB >>> 3);
            if (generatedExtensionB == null) {
                return unknownFieldSchema.l(obj, reader);
            }
            extensionSchema.h(reader, generatedExtensionB, extensionRegistryLite, fieldSet);
            return true;
        }
        GeneratedMessageLite.GeneratedExtension generatedExtensionB2 = null;
        int iD = 0;
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

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public final Object newInstance() {
        return this.f15112a.newBuilderForType().l();
    }
}
