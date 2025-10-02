package androidx.datastore.preferences.protobuf;

import YU.a;
import androidx.datastore.preferences.protobuf.AbstractMessageLite;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.datastore.preferences.protobuf.FieldSet;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.JavaFeaturesProto;
import androidx.datastore.preferences.protobuf.MessageLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
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

    /* renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2644a;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            f2644a = iArr;
            try {
                iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2644a[WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class Builder<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite.Builder<MessageType, BuilderType> {
        public final GeneratedMessageLite d;
        public GeneratedMessageLite e;

        public Builder(GeneratedMessageLite generatedMessageLite) {
            this.d = generatedMessageLite;
            if (generatedMessageLite.n()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.e = generatedMessageLite.q();
        }

        public static void i(Object obj, Object obj2) {
            Protobuf protobuf = Protobuf.c;
            protobuf.getClass();
            protobuf.a(obj.getClass()).a(obj, obj2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder
        /* renamed from: c */
        public final Builder clone() {
            Builder builder = (Builder) this.d.h(MethodToInvoke.h, null);
            builder.e = l();
            return builder;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder
        public final Object clone() {
            Builder builder = (Builder) this.d.h(MethodToInvoke.h, null);
            builder.e = l();
            return builder;
        }

        public final GeneratedMessageLite d() {
            GeneratedMessageLite generatedMessageLiteL = l();
            generatedMessageLiteL.getClass();
            if (GeneratedMessageLite.m(generatedMessageLiteL, true)) {
                return generatedMessageLiteL;
            }
            throw new UninitializedMessageException();
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public GeneratedMessageLite l() {
            if (!this.e.n()) {
                return this.e;
            }
            GeneratedMessageLite generatedMessageLite = this.e;
            generatedMessageLite.getClass();
            Protobuf protobuf = Protobuf.c;
            protobuf.getClass();
            protobuf.a(generatedMessageLite.getClass()).c(generatedMessageLite);
            generatedMessageLite.o();
            return this.e;
        }

        public final void f() {
            if (this.e.n()) {
                return;
            }
            g();
        }

        public void g() {
            GeneratedMessageLite generatedMessageLiteQ = this.d.q();
            i(generatedMessageLiteQ, this.e);
            this.e = generatedMessageLiteQ;
        }

        public final void h(GeneratedMessageLite generatedMessageLite) {
            if (this.d.equals(generatedMessageLite)) {
                return;
            }
            f();
            i(this.e, generatedMessageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return GeneratedMessageLite.m(this.e, false);
        }
    }

    /* loaded from: classes2.dex */
    public static class DefaultInstanceBasedParser<T extends GeneratedMessageLite<T, ?>> extends AbstractParser<T> {
        public DefaultInstanceBasedParser(GeneratedMessageLite generatedMessageLite) {
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder
        public final void g() {
            super.g();
            GeneratedMessageLite generatedMessageLite = this.e;
            if (((ExtendableMessage) generatedMessageLite).extensions != FieldSet.d) {
                ((ExtendableMessage) generatedMessageLite).extensions = ((ExtendableMessage) generatedMessageLite).extensions.clone();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder, androidx.datastore.preferences.protobuf.MessageLite.Builder
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public final ExtendableMessage l() {
            if (!((ExtendableMessage) this.e).n()) {
                return (ExtendableMessage) this.e;
            }
            ((ExtendableMessage) this.e).extensions.j();
            return (ExtendableMessage) super.l();
        }
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends GeneratedMessageLite<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected FieldSet<ExtensionDescriptor> extensions = FieldSet.d;

        /* loaded from: classes2.dex */
        public class ExtensionWriter {
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
        public final GeneratedMessageLite a() {
            return (GeneratedMessageLite) h(MethodToInvoke.i, null);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.MessageLite
        public final Builder newBuilderForType() {
            return (Builder) h(MethodToInvoke.h, null);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.MessageLite
        public final Builder toBuilder() {
            Builder builder = (Builder) h(MethodToInvoke.h, null);
            builder.h(this);
            return builder;
        }
    }

    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends MessageLiteOrBuilder {
    }

    /* loaded from: classes2.dex */
    public static final class ExtensionDescriptor implements FieldSet.FieldDescriptorLite<ExtensionDescriptor> {
        public final WireFormat.FieldType d;

        public ExtensionDescriptor(WireFormat.FieldType fieldType) {
            this.d = fieldType;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((ExtensionDescriptor) obj).getClass();
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final int g() {
            return 1001;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final WireFormat.FieldType h() {
            return this.d;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final WireFormat.JavaType i() {
            return this.d.d;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final boolean j() {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final boolean k() {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final Builder m0(MessageLite.Builder builder, MessageLite messageLite) {
            Builder builder2 = (Builder) builder;
            builder2.h((GeneratedMessageLite) messageLite);
            return builder2;
        }
    }

    /* loaded from: classes2.dex */
    public static class GeneratedExtension<ContainingType extends MessageLite, Type> extends ExtensionLite<ContainingType, Type> {

        /* renamed from: a, reason: collision with root package name */
        public final MessageLite f2645a;
        public final ExtensionDescriptor b;

        public GeneratedExtension(DescriptorProtos.FeatureSet featureSet, JavaFeaturesProto.JavaFeatures javaFeatures, JavaFeaturesProto.JavaFeatures javaFeatures2, ExtensionDescriptor extensionDescriptor) {
            if (featureSet == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (extensionDescriptor.d == WireFormat.FieldType.p && javaFeatures2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f2645a = javaFeatures2;
            this.b = extensionDescriptor;
        }

        public final WireFormat.FieldType a() {
            return this.b.d;
        }

        public final MessageLite b() {
            return this.f2645a;
        }

        public final int c() {
            this.b.getClass();
            return 1001;
        }

        public final boolean d() {
            this.b.getClass();
            return false;
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
        public static final /* synthetic */ MethodToInvoke[] j;

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
            j = new MethodToInvoke[]{methodToInvoke, methodToInvoke2, methodToInvoke3, methodToInvoke4, methodToInvoke5, methodToInvoke6, new MethodToInvoke("GET_PARSER", 6)};
        }

        public static MethodToInvoke valueOf(String str) {
            return (MethodToInvoke) java.lang.Enum.valueOf(MethodToInvoke.class, str);
        }

        public static MethodToInvoke[] values() {
            return (MethodToInvoke[]) j.clone();
        }
    }

    /* loaded from: classes2.dex */
    public static final class SerializedForm implements Serializable {
        public Object readResolve() throws ObjectStreamException, NoSuchFieldException, SecurityException {
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
                throw new RuntimeException("Unable to find DEFAULT_INSTANCE in null", e4);
            } catch (SecurityException e5) {
                throw new RuntimeException("Unable to call DEFAULT_INSTANCE in null", e5);
            }
        }
    }

    public GeneratedMessageLite() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = UnknownFieldSetLite.f;
    }

    public static Internal.ProtobufList i() {
        return ProtobufArrayList.g;
    }

    public static GeneratedMessageLite j(Class cls) throws ClassNotFoundException {
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
        GeneratedMessageLite<?, ?> generatedMessageLite2 = (GeneratedMessageLite) ((GeneratedMessageLite) UnsafeUtil.c(cls)).h(MethodToInvoke.i, null);
        if (generatedMessageLite2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, generatedMessageLite2);
        return generatedMessageLite2;
    }

    public static Object k(java.lang.reflect.Method method, GeneratedMessageLite generatedMessageLite, Object... objArr) {
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

    public static final boolean m(GeneratedMessageLite generatedMessageLite, boolean z) {
        byte bByteValue = ((Byte) generatedMessageLite.h(MethodToInvoke.d, null)).byteValue();
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
            generatedMessageLite.h(MethodToInvoke.e, zB ? generatedMessageLite : null);
        }
        return zB;
    }

    public static Object p(GeneratedMessageLite generatedMessageLite, String str, Object[] objArr) {
        return new RawMessageInfo(generatedMessageLite, str, objArr);
    }

    public static GeneratedMessageLite r(GeneratedMessageLite generatedMessageLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        GeneratedMessageLite generatedMessageLiteQ = generatedMessageLite.q();
        try {
            Protobuf protobuf = Protobuf.c;
            protobuf.getClass();
            Schema schemaA = protobuf.a(generatedMessageLiteQ.getClass());
            CodedInputStreamReader codedInputStreamReader = codedInputStream.b;
            if (codedInputStreamReader == null) {
                codedInputStreamReader = new CodedInputStreamReader(codedInputStream);
            }
            schemaA.g(generatedMessageLiteQ, codedInputStreamReader, extensionRegistryLite);
            schemaA.c(generatedMessageLiteQ);
            return generatedMessageLiteQ;
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

    public static void s(Class cls, GeneratedMessageLite generatedMessageLite) {
        generatedMessageLite.o();
        defaultInstanceMap.put(cls, generatedMessageLite);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
    public GeneratedMessageLite a() {
        return (GeneratedMessageLite) h(MethodToInvoke.i, null);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public final void b(CodedOutputStream codedOutputStream) {
        Protobuf protobuf = Protobuf.c;
        protobuf.getClass();
        Schema schemaA = protobuf.a(getClass());
        CodedOutputStreamWriter codedOutputStreamWriter = codedOutputStream.f2605a;
        if (codedOutputStreamWriter == null) {
            codedOutputStreamWriter = new CodedOutputStreamWriter(codedOutputStream);
        }
        schemaA.e(this, codedOutputStreamWriter);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite
    public final int d() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite
    public final int e(Schema schema) {
        int iD;
        int iD2;
        if (n()) {
            if (schema == null) {
                Protobuf protobuf = Protobuf.c;
                protobuf.getClass();
                iD2 = protobuf.a(getClass()).d(this);
            } else {
                iD2 = schema.d(this);
            }
            if (iD2 >= 0) {
                return iD2;
            }
            throw new IllegalStateException(a.d(iD2, "serialized size must be non-negative, was "));
        }
        if (d() != Integer.MAX_VALUE) {
            return d();
        }
        if (schema == null) {
            Protobuf protobuf2 = Protobuf.c;
            protobuf2.getClass();
            iD = protobuf2.a(getClass()).d(this);
        } else {
            iD = schema.d(this);
        }
        f(iD);
        return iD;
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
        return protobuf.a(getClass()).f(this, (GeneratedMessageLite) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite
    public final void f(int i) {
        if (i < 0) {
            throw new IllegalStateException(a.d(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public final int getSerializedSize() {
        return e(null);
    }

    public abstract Object h(MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite);

    public final int hashCode() {
        if (n()) {
            Protobuf protobuf = Protobuf.c;
            protobuf.getClass();
            return protobuf.a(getClass()).h(this);
        }
        if (this.memoizedHashCode == 0) {
            Protobuf protobuf2 = Protobuf.c;
            protobuf2.getClass();
            this.memoizedHashCode = protobuf2.a(getClass()).h(this);
        }
        return this.memoizedHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return m(this, true);
    }

    public final boolean n() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public Builder newBuilderForType() {
        return (Builder) h(MethodToInvoke.h, null);
    }

    public final void o() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final GeneratedMessageLite q() {
        return (GeneratedMessageLite) h(MethodToInvoke.g, null);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public Builder toBuilder() {
        Builder builder = (Builder) h(MethodToInvoke.h, null);
        builder.h(this);
        return builder;
    }

    public final String toString() {
        return MessageLiteToString.d(this, super.toString());
    }
}
