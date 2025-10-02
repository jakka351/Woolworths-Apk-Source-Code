package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.FieldSet;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.LazyField;
import androidx.datastore.preferences.protobuf.SmallSortedMap;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.util.Iterator;
import java.util.Map;

@CheckReturnValue
/* loaded from: classes2.dex */
final class MessageSetSchema<T> implements Schema<T> {

    /* renamed from: a, reason: collision with root package name */
    public final MessageLite f2663a;
    public final UnknownFieldSchema b;
    public final boolean c;
    public final ExtensionSchema d;

    public MessageSetSchema(UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MessageLite messageLite) {
        this.b = unknownFieldSchema;
        this.c = extensionSchema.e(messageLite);
        this.d = extensionSchema;
        this.f2663a = messageLite;
    }

    public static MessageSetSchema i(UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MessageLite messageLite) {
        return new MessageSetSchema(unknownFieldSchema, extensionSchema, messageLite);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final void a(Object obj, Object obj2) {
        Class cls = SchemaUtil.f2670a;
        UnknownFieldSchema unknownFieldSchema = this.b;
        unknownFieldSchema.o(obj, unknownFieldSchema.k(unknownFieldSchema.g(obj), unknownFieldSchema.g(obj2)));
        if (this.c) {
            SchemaUtil.k(this.d, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final boolean b(Object obj) {
        return this.d.c(obj).g();
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final void c(Object obj) {
        this.b.j(obj);
        this.d.f(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final int d(AbstractMessageLite abstractMessageLite) {
        UnknownFieldSchema unknownFieldSchema = this.b;
        int i = unknownFieldSchema.i(unknownFieldSchema.g(abstractMessageLite));
        if (!this.c) {
            return i;
        }
        SmallSortedMap.AnonymousClass1 anonymousClass1 = this.d.c(abstractMessageLite).f2639a;
        int size = anonymousClass1.d.size();
        int iF = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iF += FieldSet.f(anonymousClass1.c(i2));
        }
        Iterator<T> it = anonymousClass1.d().iterator();
        while (it.hasNext()) {
            iF += FieldSet.f((Map.Entry) it.next());
        }
        return i + iF;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final void e(Object obj, Writer writer) {
        Iterator itI = this.d.c(obj).i();
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
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

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final boolean f(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
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

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final void g(Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite) {
        UnknownFieldSchema unknownFieldSchema = this.b;
        UnknownFieldSetLite unknownFieldSetLiteF = unknownFieldSchema.f(obj);
        ExtensionSchema extensionSchema = this.d;
        FieldSet fieldSetD = extensionSchema.d(obj);
        while (reader.n() != Integer.MAX_VALUE) {
            try {
                Reader reader2 = reader;
                ExtensionRegistryLite extensionRegistryLite2 = extensionRegistryLite;
                if (!j(reader2, extensionRegistryLite2, extensionSchema, fieldSetD, unknownFieldSchema, unknownFieldSetLiteF)) {
                    return;
                }
                reader = reader2;
                extensionRegistryLite = extensionRegistryLite2;
            } finally {
                unknownFieldSchema.n(obj, unknownFieldSetLiteF);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final int h(GeneratedMessageLite generatedMessageLite) {
        int iHashCode = this.b.g(generatedMessageLite).hashCode();
        return this.c ? (iHashCode * 53) + this.d.c(generatedMessageLite).f2639a.hashCode() : iHashCode;
    }

    public final boolean j(Reader reader, ExtensionRegistryLite extensionRegistryLite, ExtensionSchema extensionSchema, FieldSet fieldSet, UnknownFieldSchema unknownFieldSchema, Object obj) throws InvalidProtocolBufferException {
        int iB = reader.b();
        int iD = 0;
        MessageLite messageLite = this.f2663a;
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

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final Object newInstance() {
        MessageLite messageLite = this.f2663a;
        return messageLite instanceof GeneratedMessageLite ? ((GeneratedMessageLite) messageLite).q() : messageLite.newBuilderForType().l();
    }
}
