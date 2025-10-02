package com.google.protobuf;

import YU.a;
import com.google.api.ResourceDescriptor;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ArrayDecoders;
import com.google.protobuf.FieldSet;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.Builder;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected UnknownFieldSetLite unknownFields;

    /* renamed from: com.google.protobuf.GeneratedMessageLite$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16054a;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            f16054a = iArr;
            try {
                iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16054a[WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class Builder<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite.Builder<MessageType, BuilderType> {
        public final GeneratedMessageLite d;
        public GeneratedMessageLite e;

        public Builder(GeneratedMessageLite generatedMessageLite) {
            this.d = generatedMessageLite;
            if (generatedMessageLite.A()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.e = generatedMessageLite.E();
        }

        public static void s(Object obj, Object obj2) {
            Protobuf.c.b(obj).a(obj, obj2);
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder
        public final Object clone() {
            Builder builder = (Builder) this.d.s(MethodToInvoke.h, null);
            builder.e = l();
            return builder;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return GeneratedMessageLite.z(this.e, false);
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder
        /* renamed from: k */
        public final Builder clone() {
            Builder builder = (Builder) this.d.s(MethodToInvoke.h, null);
            builder.e = l();
            return builder;
        }

        public final GeneratedMessageLite m() {
            GeneratedMessageLite generatedMessageLiteL = l();
            generatedMessageLiteL.getClass();
            if (GeneratedMessageLite.z(generatedMessageLiteL, true)) {
                return generatedMessageLiteL;
            }
            throw new UninitializedMessageException();
        }

        @Override // com.google.protobuf.MessageLite.Builder
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public GeneratedMessageLite l() {
            if (!this.e.A()) {
                return this.e;
            }
            GeneratedMessageLite generatedMessageLite = this.e;
            generatedMessageLite.getClass();
            Protobuf protobuf = Protobuf.c;
            protobuf.getClass();
            protobuf.a(generatedMessageLite.getClass()).c(generatedMessageLite);
            generatedMessageLite.B();
            return this.e;
        }

        public final void p() {
            if (this.e.A()) {
                return;
            }
            q();
        }

        public void q() {
            GeneratedMessageLite generatedMessageLiteE = this.d.E();
            s(generatedMessageLiteE, this.e);
            this.e = generatedMessageLiteE;
        }

        public final void r(GeneratedMessageLite generatedMessageLite) {
            if (this.d.equals(generatedMessageLite)) {
                return;
            }
            p();
            s(this.e, generatedMessageLite);
        }
    }

    /* loaded from: classes6.dex */
    public static class DefaultInstanceBasedParser<T extends GeneratedMessageLite<T, ?>> extends AbstractParser<T> {

        /* renamed from: a, reason: collision with root package name */
        public final GeneratedMessageLite f16055a;

        public DefaultInstanceBasedParser(GeneratedMessageLite generatedMessageLite) {
            this.f16055a = generatedMessageLite;
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        @Override // com.google.protobuf.GeneratedMessageLite.Builder
        public final void q() {
            super.q();
            GeneratedMessageLite generatedMessageLite = this.e;
            if (((ExtendableMessage) generatedMessageLite).extensions != FieldSet.d) {
                ((ExtendableMessage) generatedMessageLite).extensions = ((ExtendableMessage) generatedMessageLite).extensions.clone();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite.Builder
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public final ExtendableMessage l() {
            if (!((ExtendableMessage) this.e).A()) {
                return (ExtendableMessage) this.e;
            }
            ((ExtendableMessage) this.e).extensions.k();
            return (ExtendableMessage) super.l();
        }
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends GeneratedMessageLite<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected FieldSet<ExtensionDescriptor> extensions = FieldSet.d;

        /* loaded from: classes6.dex */
        public class ExtensionWriter {
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.MessageLiteOrBuilder
        public final GeneratedMessageLite a() {
            return (GeneratedMessageLite) s(MethodToInvoke.i, null);
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.MessageLite
        public final Builder newBuilderForType() {
            return (Builder) s(MethodToInvoke.h, null);
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.MessageLite
        public final /* bridge */ /* synthetic */ Builder toBuilder() {
            return toBuilder();
        }
    }

    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends MessageLiteOrBuilder {
    }

    /* loaded from: classes6.dex */
    public static final class ExtensionDescriptor implements FieldSet.FieldDescriptorLite<ExtensionDescriptor> {
        public final Internal.EnumLiteMap d;
        public final int e;
        public final WireFormat.FieldType f;
        public final boolean g;
        public final boolean h;

        public ExtensionDescriptor(Internal.EnumLiteMap enumLiteMap, int i, WireFormat.FieldType fieldType, boolean z, boolean z2) {
            this.d = enumLiteMap;
            this.e = i;
            this.f = fieldType;
            this.g = z;
            this.h = z2;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public final Builder T(MessageLite.Builder builder, MessageLite messageLite) {
            Builder builder2 = (Builder) builder;
            builder2.r((GeneratedMessageLite) messageLite);
            return builder2;
        }

        public final Internal.EnumLiteMap a() {
            return this.d;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.e - ((ExtensionDescriptor) obj).e;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public final int g() {
            return this.e;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public final WireFormat.FieldType h() {
            return this.f;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public final WireFormat.JavaType i() {
            return this.f.d;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public final boolean j() {
            return this.g;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public final boolean k() {
            return this.h;
        }
    }

    /* loaded from: classes6.dex */
    public static class GeneratedExtension<ContainingType extends MessageLite, Type> extends ExtensionLite<ContainingType, Type> {

        /* renamed from: a, reason: collision with root package name */
        public final MessageLite f16056a;
        public final Object b;
        public final MessageLite c;
        public final ExtensionDescriptor d;

        public GeneratedExtension(MessageLite messageLite, Object obj, MessageLite messageLite2, ExtensionDescriptor extensionDescriptor) {
            if (messageLite == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (extensionDescriptor.f == WireFormat.FieldType.p && messageLite2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f16056a = messageLite;
            this.b = obj;
            this.c = messageLite2;
            this.d = extensionDescriptor;
        }

        public final WireFormat.FieldType a() {
            return this.d.f;
        }

        public final MessageLite b() {
            return this.c;
        }

        public final int c() {
            return this.d.e;
        }

        public final boolean d() {
            return this.d.g;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MethodToInvoke {
        public static final MethodToInvoke d;
        public static final MethodToInvoke e;
        public static final MethodToInvoke f;
        public static final MethodToInvoke g;
        public static final MethodToInvoke h;
        public static final MethodToInvoke i;
        public static final MethodToInvoke j;
        public static final /* synthetic */ MethodToInvoke[] k;

        static {
            MethodToInvoke methodToInvoke = new MethodToInvoke("GET_MEMOIZED_IS_INITIALIZED", 0);
            d = methodToInvoke;
            MethodToInvoke methodToInvoke2 = new MethodToInvoke("SET_MEMOIZED_IS_INITIALIZED", 1);
            e = methodToInvoke2;
            MethodToInvoke methodToInvoke3 = new MethodToInvoke("BUILD_MESSAGE_INFO", 2);
            f = methodToInvoke3;
            MethodToInvoke methodToInvoke4 = new MethodToInvoke("NEW_MUTABLE_INSTANCE", 3);
            g = methodToInvoke4;
            MethodToInvoke methodToInvoke5 = new MethodToInvoke("NEW_BUILDER", 4);
            h = methodToInvoke5;
            MethodToInvoke methodToInvoke6 = new MethodToInvoke("GET_DEFAULT_INSTANCE", 5);
            i = methodToInvoke6;
            MethodToInvoke methodToInvoke7 = new MethodToInvoke("GET_PARSER", 6);
            j = methodToInvoke7;
            k = new MethodToInvoke[]{methodToInvoke, methodToInvoke2, methodToInvoke3, methodToInvoke4, methodToInvoke5, methodToInvoke6, methodToInvoke7};
        }

        public static MethodToInvoke valueOf(String str) {
            return (MethodToInvoke) java.lang.Enum.valueOf(MethodToInvoke.class, str);
        }

        public static MethodToInvoke[] values() {
            return (MethodToInvoke[]) k.clone();
        }
    }

    /* loaded from: classes6.dex */
    public static final class SerializedForm implements Serializable {
        public Object readResolve() throws ObjectStreamException, NoSuchFieldException, SecurityException {
            try {
                try {
                    java.lang.reflect.Field declaredField = Class.forName(null).getDeclaredField("DEFAULT_INSTANCE");
                    declaredField.setAccessible(true);
                    ((MessageLite) declaredField.get(null)).newBuilderForType().getClass();
                    throw null;
                } catch (InvalidProtocolBufferException e) {
                    throw new RuntimeException("Unable to understand proto buffer", e);
                } catch (ClassNotFoundException e2) {
                    throw new RuntimeException("Unable to find proto buffer class: null", e2);
                } catch (IllegalAccessException e3) {
                    throw new RuntimeException("Unable to call parsePartialFrom", e3);
                } catch (NoSuchFieldException e4) {
                    throw new RuntimeException("Unable to find defaultInstance in null", e4);
                } catch (SecurityException e5) {
                    throw new RuntimeException("Unable to call defaultInstance in null", e5);
                }
            } catch (InvalidProtocolBufferException e6) {
                throw new RuntimeException("Unable to understand proto buffer", e6);
            } catch (ClassNotFoundException e7) {
                throw new RuntimeException("Unable to find proto buffer class: null", e7);
            } catch (IllegalAccessException e8) {
                throw new RuntimeException("Unable to call parsePartialFrom", e8);
            } catch (NoSuchFieldException unused) {
                java.lang.reflect.Field declaredField2 = Class.forName(null).getDeclaredField("defaultInstance");
                declaredField2.setAccessible(true);
                ((MessageLite) declaredField2.get(null)).newBuilderForType().getClass();
                throw null;
            } catch (SecurityException e9) {
                throw new RuntimeException("Unable to call DEFAULT_INSTANCE in null", e9);
            }
        }
    }

    public GeneratedMessageLite() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = UnknownFieldSetLite.f;
    }

    public static Internal.ProtobufList C(Internal.ProtobufList protobufList) {
        int size = protobufList.size();
        return protobufList.a(size == 0 ? 10 : size * 2);
    }

    public static Object D(MessageLite messageLite, String str, Object[] objArr) {
        return new RawMessageInfo(messageLite, str, objArr);
    }

    public static void F(ExtendableMessage extendableMessage, ResourceDescriptor resourceDescriptor, Internal.EnumLiteMap enumLiteMap, int i, WireFormat.FieldType fieldType, boolean z) {
        new GeneratedExtension(extendableMessage, Collections.EMPTY_LIST, resourceDescriptor, new ExtensionDescriptor(enumLiteMap, i, fieldType, true, z));
    }

    public static void G(ExtendableMessage extendableMessage, Object obj, GeneratedMessageLite generatedMessageLite, int i, WireFormat.FieldType fieldType) {
        new GeneratedExtension(extendableMessage, obj, generatedMessageLite, new ExtensionDescriptor(null, i, fieldType, false, false));
    }

    public static GeneratedMessageLite H(GeneratedMessageLite generatedMessageLite, byte[] bArr) throws InvalidProtocolBufferException {
        int length = bArr.length;
        ExtensionRegistryLite extensionRegistryLiteB = ExtensionRegistryLite.b();
        GeneratedMessageLite generatedMessageLiteE = generatedMessageLite.E();
        try {
            Schema schemaB = Protobuf.c.b(generatedMessageLiteE);
            schemaB.f(generatedMessageLiteE, bArr, 0, length, new ArrayDecoders.Registers(extensionRegistryLiteB));
            schemaB.c(generatedMessageLiteE);
            q(generatedMessageLiteE);
            return generatedMessageLiteE;
        } catch (InvalidProtocolBufferException e) {
            if (e.d) {
                throw new InvalidProtocolBufferException(e.getMessage(), e);
            }
            throw e;
        } catch (UninitializedMessageException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3.getMessage(), e3);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.h();
        }
    }

    public static GeneratedMessageLite I(GeneratedMessageLite generatedMessageLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        GeneratedMessageLite generatedMessageLiteE = generatedMessageLite.E();
        try {
            Schema schemaB = Protobuf.c.b(generatedMessageLiteE);
            schemaB.h(generatedMessageLiteE, CodedInputStreamReader.Q(codedInputStream), extensionRegistryLite);
            schemaB.c(generatedMessageLiteE);
            return generatedMessageLiteE;
        } catch (InvalidProtocolBufferException e) {
            if (e.d) {
                throw new InvalidProtocolBufferException(e.getMessage(), e);
            }
            throw e;
        } catch (UninitializedMessageException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    public static void J(Class cls, GeneratedMessageLite generatedMessageLite) {
        generatedMessageLite.B();
        defaultInstanceMap.put(cls, generatedMessageLite);
    }

    public static void q(GeneratedMessageLite generatedMessageLite) throws InvalidProtocolBufferException {
        if (!z(generatedMessageLite, true)) {
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        }
    }

    public static Internal.DoubleList t() {
        return DoubleArrayList.g();
    }

    public static Internal.IntList u() {
        return IntArrayList.g;
    }

    public static Internal.LongList v() {
        return LongArrayList.g();
    }

    public static Internal.ProtobufList w() {
        return ProtobufArrayList.g;
    }

    public static GeneratedMessageLite x(Class cls) throws ClassNotFoundException {
        GeneratedMessageLite<?, ?> generatedMessageLite = defaultInstanceMap.get(cls);
        if (generatedMessageLite == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                generatedMessageLite = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (generatedMessageLite != null) {
            return generatedMessageLite;
        }
        GeneratedMessageLite<?, ?> generatedMessageLite2 = (GeneratedMessageLite) ((GeneratedMessageLite) UnsafeUtil.c(cls)).s(MethodToInvoke.i, null);
        if (generatedMessageLite2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, generatedMessageLite2);
        return generatedMessageLite2;
    }

    public static Object y(java.lang.reflect.Method method, GeneratedMessageLite generatedMessageLite, Object... objArr) {
        try {
            return method.invoke(generatedMessageLite, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean z(GeneratedMessageLite generatedMessageLite, boolean z) {
        byte bByteValue = ((Byte) generatedMessageLite.s(MethodToInvoke.d, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        Protobuf protobuf = Protobuf.c;
        protobuf.getClass();
        boolean zB = protobuf.a(generatedMessageLite.getClass()).b(generatedMessageLite);
        if (z) {
            generatedMessageLite.s(MethodToInvoke.e, zB ? generatedMessageLite : null);
        }
        return zB;
    }

    public final boolean A() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void B() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final GeneratedMessageLite E() {
        return (GeneratedMessageLite) s(MethodToInvoke.g, null);
    }

    @Override // com.google.protobuf.MessageLite
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final Builder toBuilder() {
        Builder builder = (Builder) s(MethodToInvoke.h, null);
        builder.r(this);
        return builder;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder
    public GeneratedMessageLite a() {
        return (GeneratedMessageLite) s(MethodToInvoke.i, null);
    }

    @Override // com.google.protobuf.MessageLite
    public final void c(CodedOutputStream codedOutputStream) {
        Protobuf protobuf = Protobuf.c;
        protobuf.getClass();
        Schema schemaA = protobuf.a(getClass());
        CodedOutputStreamWriter codedOutputStreamWriter = codedOutputStream.f16026a;
        if (codedOutputStreamWriter == null) {
            codedOutputStreamWriter = new CodedOutputStreamWriter(codedOutputStream);
        }
        schemaA.d(this, codedOutputStreamWriter);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Protobuf protobuf = Protobuf.c;
        protobuf.getClass();
        return protobuf.a(getClass()).i(this, (GeneratedMessageLite) obj);
    }

    @Override // com.google.protobuf.MessageLite
    public final int getSerializedSize() {
        return n(null);
    }

    public final int hashCode() {
        if (A()) {
            Protobuf protobuf = Protobuf.c;
            protobuf.getClass();
            return protobuf.a(getClass()).g(this);
        }
        if (this.memoizedHashCode == 0) {
            Protobuf protobuf2 = Protobuf.c;
            protobuf2.getClass();
            this.memoizedHashCode = protobuf2.a(getClass()).g(this);
        }
        return this.memoizedHashCode;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return z(this, true);
    }

    @Override // com.google.protobuf.MessageLite
    public final Parser j() {
        return (Parser) s(MethodToInvoke.j, null);
    }

    @Override // com.google.protobuf.AbstractMessageLite
    public final int m() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.AbstractMessageLite
    public final int n(Schema schema) {
        int iE;
        int iE2;
        if (A()) {
            if (schema == null) {
                Protobuf protobuf = Protobuf.c;
                protobuf.getClass();
                iE2 = protobuf.a(getClass()).e(this);
            } else {
                iE2 = schema.e(this);
            }
            if (iE2 >= 0) {
                return iE2;
            }
            throw new IllegalStateException(a.d(iE2, "serialized size must be non-negative, was "));
        }
        if (m() != Integer.MAX_VALUE) {
            return m();
        }
        if (schema == null) {
            Protobuf protobuf2 = Protobuf.c;
            protobuf2.getClass();
            iE = protobuf2.a(getClass()).e(this);
        } else {
            iE = schema.e(this);
        }
        p(iE);
        return iE;
    }

    @Override // com.google.protobuf.MessageLite
    public Builder newBuilderForType() {
        return (Builder) s(MethodToInvoke.h, null);
    }

    @Override // com.google.protobuf.AbstractMessageLite
    public final void p(int i) {
        if (i < 0) {
            throw new IllegalStateException(a.d(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final Builder r() {
        return (Builder) s(MethodToInvoke.h, null);
    }

    public abstract Object s(MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite);

    public final String toString() {
        return MessageLiteToString.d(this, super.toString());
    }
}
