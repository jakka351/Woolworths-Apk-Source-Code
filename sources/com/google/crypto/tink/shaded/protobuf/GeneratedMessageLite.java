package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractMessageLite;
import com.google.crypto.tink.shaded.protobuf.ArrayDecoders;
import com.google.crypto.tink.shaded.protobuf.FieldSet;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder;
import com.google.crypto.tink.shaded.protobuf.Internal;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.shaded.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite<MessageType, BuilderType> {
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize;
    protected UnknownFieldSetLite unknownFields;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15100a;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            f15100a = iArr;
            try {
                iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15100a[WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class Builder<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite.Builder<MessageType, BuilderType> {
        public final GeneratedMessageLite d;
        public GeneratedMessageLite e;
        public boolean f = false;

        public Builder(GeneratedMessageLite generatedMessageLite) {
            this.d = generatedMessageLite;
            this.e = (GeneratedMessageLite) generatedMessageLite.dynamicMethod(MethodToInvoke.g);
        }

        public static void k(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
            Protobuf.c.b(generatedMessageLite).i(generatedMessageLite, generatedMessageLite2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final /* bridge */ /* synthetic */ MessageLite.Builder Y1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            i(codedInputStream, extensionRegistryLite);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        /* renamed from: b */
        public final Builder clone() {
            Builder builderNewBuilderForType = this.d.newBuilderForType();
            builderNewBuilderForType.j(l());
            return builderNewBuilderForType;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        public final Builder c(AbstractMessageLite abstractMessageLite) {
            j((GeneratedMessageLite) abstractMessageLite);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        public final Object clone() {
            Builder builderNewBuilderForType = this.d.newBuilderForType();
            builderNewBuilderForType.j(l());
            return builderNewBuilderForType;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        /* renamed from: d */
        public final /* bridge */ /* synthetic */ Builder Y1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            i(codedInputStream, extensionRegistryLite);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final GeneratedMessageLite p1() {
            GeneratedMessageLite generatedMessageLiteL = l();
            if (generatedMessageLiteL.isInitialized()) {
                return generatedMessageLiteL;
            }
            throw new UninitializedMessageException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public GeneratedMessageLite l() {
            if (this.f) {
                return this.e;
            }
            this.e.makeImmutable();
            this.f = true;
            return this.e;
        }

        public final void g() {
            if (this.f) {
                h();
                this.f = false;
            }
        }

        public void h() {
            GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) this.e.dynamicMethod(MethodToInvoke.g);
            k(generatedMessageLite, this.e);
            this.e = generatedMessageLite;
        }

        public final void i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            g();
            try {
                Schema schemaB = Protobuf.c.b(this.e);
                GeneratedMessageLite generatedMessageLite = this.e;
                CodedInputStreamReader codedInputStreamReader = codedInputStream.b;
                if (codedInputStreamReader == null) {
                    codedInputStreamReader = new CodedInputStreamReader(codedInputStream);
                }
                schemaB.g(generatedMessageLite, codedInputStreamReader, extensionRegistryLite);
            } catch (RuntimeException e) {
                if (!(e.getCause() instanceof IOException)) {
                    throw e;
                }
                throw ((IOException) e.getCause());
            }
        }

        public final void j(GeneratedMessageLite generatedMessageLite) {
            g();
            k(this.e, generatedMessageLite);
        }
    }

    /* loaded from: classes6.dex */
    public static class DefaultInstanceBasedParser<T extends GeneratedMessageLite<T, ?>> extends AbstractParser<T> {
        public DefaultInstanceBasedParser(GeneratedMessageLite generatedMessageLite) {
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder
        /* renamed from: f */
        public final GeneratedMessageLite l() {
            if (this.f) {
                return (ExtendableMessage) this.e;
            }
            ((ExtendableMessage) this.e).extensions.o();
            return (ExtendableMessage) super.l();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder
        public final void h() {
            super.h();
            GeneratedMessageLite generatedMessageLite = this.e;
            ((ExtendableMessage) generatedMessageLite).extensions = ((ExtendableMessage) generatedMessageLite).extensions.clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final MessageLite l() {
            if (this.f) {
                return (ExtendableMessage) this.e;
            }
            ((ExtendableMessage) this.e).extensions.o();
            return (ExtendableMessage) super.l();
        }
    }

    /* loaded from: classes6.dex */
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

        @Override // com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite
        public final Builder Y(MessageLite.Builder builder, MessageLite messageLite) {
            Builder builder2 = (Builder) builder;
            builder2.j((GeneratedMessageLite) messageLite);
            return builder2;
        }

        public final Internal.EnumLiteMap a() {
            return this.d;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.e - ((ExtensionDescriptor) obj).e;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite
        public final int g() {
            return this.e;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite
        public final WireFormat.FieldType h() {
            return this.f;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite
        public final WireFormat.JavaType i() {
            return this.f.d;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite
        public final boolean j() {
            return this.g;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite
        public final boolean k() {
            return this.h;
        }
    }

    /* loaded from: classes6.dex */
    public static class GeneratedExtension<ContainingType extends MessageLite, Type> extends ExtensionLite<ContainingType, Type> {

        /* renamed from: a, reason: collision with root package name */
        public final MessageLite f15102a;
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
            this.f15102a = messageLite;
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

        public final boolean c() {
            return this.d.g;
        }

        public final Object d(Object obj) {
            ExtensionDescriptor extensionDescriptor = this.d;
            return extensionDescriptor.f.d == WireFormat.JavaType.ENUM ? extensionDescriptor.d.a(((Integer) obj).intValue()) : obj;
        }

        public final Object e(Object obj) {
            return this.d.f.d == WireFormat.JavaType.ENUM ? Integer.valueOf(((Internal.EnumLite) obj).g()) : obj;
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
            return (MethodToInvoke) Enum.valueOf(MethodToInvoke.class, str);
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
                    Field declaredField = Class.forName(null).getDeclaredField("DEFAULT_INSTANCE");
                    declaredField.setAccessible(true);
                    return ((MessageLite) declaredField.get(null)).newBuilderForType().W0().l();
                } catch (InvalidProtocolBufferException e) {
                    throw new RuntimeException("Unable to understand proto buffer", e);
                } catch (ClassNotFoundException e2) {
                    throw new RuntimeException("Unable to find proto buffer class: null", e2);
                } catch (IllegalAccessException e3) {
                    throw new RuntimeException("Unable to call parsePartialFrom", e3);
                } catch (NoSuchFieldException unused) {
                    Field declaredField2 = Class.forName(null).getDeclaredField("defaultInstance");
                    declaredField2.setAccessible(true);
                    return ((MessageLite) declaredField2.get(null)).newBuilderForType().W0().l();
                } catch (SecurityException e4) {
                    throw new RuntimeException("Unable to call DEFAULT_INSTANCE in null", e4);
                }
            } catch (InvalidProtocolBufferException e5) {
                throw new RuntimeException("Unable to understand proto buffer", e5);
            } catch (ClassNotFoundException e6) {
                throw new RuntimeException("Unable to find proto buffer class: null", e6);
            } catch (IllegalAccessException e7) {
                throw new RuntimeException("Unable to call parsePartialFrom", e7);
            } catch (NoSuchFieldException e8) {
                throw new RuntimeException("Unable to find defaultInstance in null", e8);
            } catch (SecurityException e9) {
                throw new RuntimeException("Unable to call defaultInstance in null", e9);
            }
        }
    }

    public GeneratedMessageLite() {
        this.memoizedHashCode = 0;
        this.unknownFields = UnknownFieldSetLite.f;
        this.memoizedSerializedSize = -1;
    }

    public static GeneratedExtension access$000(ExtensionLite extensionLite) {
        extensionLite.getClass();
        return (GeneratedExtension) extensionLite;
    }

    public static void b(GeneratedMessageLite generatedMessageLite) throws InvalidProtocolBufferException {
        if (generatedMessageLite != null && !generatedMessageLite.isInitialized()) {
            throw generatedMessageLite.newUninitializedMessageException().a();
        }
    }

    public static GeneratedMessageLite c(GeneratedMessageLite generatedMessageLite, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            if ((i & 128) != 0) {
                i &= 127;
                int i2 = 7;
                while (true) {
                    if (i2 >= 32) {
                        while (i2 < 64) {
                            int i3 = inputStream.read();
                            if (i3 == -1) {
                                throw InvalidProtocolBufferException.i();
                            }
                            if ((i3 & 128) != 0) {
                                i2 += 7;
                            }
                        }
                        throw InvalidProtocolBufferException.e();
                    }
                    int i4 = inputStream.read();
                    if (i4 == -1) {
                        throw InvalidProtocolBufferException.i();
                    }
                    i |= (i4 & 127) << i2;
                    if ((i4 & 128) == 0) {
                        break;
                    }
                    i2 += 7;
                }
            }
            CodedInputStream codedInputStreamG = CodedInputStream.g(new AbstractMessageLite.Builder.LimitedInputStream(inputStream, i));
            GeneratedMessageLite partialFrom = parsePartialFrom(generatedMessageLite, codedInputStreamG, extensionRegistryLite);
            codedInputStreamG.a(0);
            return partialFrom;
        } catch (IOException e) {
            throw new InvalidProtocolBufferException(e.getMessage());
        }
    }

    public static Internal.BooleanList emptyBooleanList() {
        return BooleanArrayList.g();
    }

    public static Internal.DoubleList emptyDoubleList() {
        return DoubleArrayList.g();
    }

    public static Internal.FloatList emptyFloatList() {
        return FloatArrayList.g();
    }

    public static Internal.IntList emptyIntList() {
        return IntArrayList.d();
    }

    public static Internal.LongList emptyLongList() {
        return LongArrayList.g();
    }

    public static <E> Internal.ProtobufList<E> emptyProtobufList() {
        return ProtobufArrayList.g;
    }

    public static <T extends GeneratedMessageLite<?, ?>> T getDefaultInstance(Class<T> cls) throws ClassNotFoundException {
        T t = (T) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((GeneratedMessageLite) UnsafeUtil.a(cls)).getDefaultInstanceForType();
        if (t2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t2);
        return t2;
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
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

    public static Internal.IntList mutableCopy(Internal.IntList intList) {
        int size = intList.size();
        return intList.a(size == 0 ? 10 : size * 2);
    }

    public static Object newMessageInfo(MessageLite messageLite, String str, Object[] objArr) {
        return new RawMessageInfo(messageLite, str, objArr);
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i, WireFormat.FieldType fieldType, boolean z, Class cls) {
        return new GeneratedExtension<>(containingtype, Collections.EMPTY_LIST, messageLite, new ExtensionDescriptor(enumLiteMap, i, fieldType, true, z));
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i, WireFormat.FieldType fieldType, Class cls) {
        return new GeneratedExtension<>(containingtype, type, messageLite, new ExtensionDescriptor(enumLiteMap, i, fieldType, false, false));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        T t2 = (T) c(t, inputStream, ExtensionRegistryLite.b());
        b(t2);
        return t2;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        T t2 = (T) parseFrom(t, CodedInputStream.h(byteBuffer, false), extensionRegistryLite);
        b(t2);
        return t2;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        T t2 = (T) t.dynamicMethod(MethodToInvoke.g);
        try {
            Schema schemaB = Protobuf.c.b(t2);
            CodedInputStreamReader codedInputStreamReader = codedInputStream.b;
            if (codedInputStreamReader == null) {
                codedInputStreamReader = new CodedInputStreamReader(codedInputStream);
            }
            schemaB.g(t2, codedInputStreamReader, extensionRegistryLite);
            schemaB.c(t2);
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e.getCause());
            }
            throw new InvalidProtocolBufferException(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e2.getCause());
            }
            throw e2;
        }
    }

    public static <T extends GeneratedMessageLite<?, ?>> void registerDefaultInstance(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    public Object buildMessageInfo() throws Exception {
        return dynamicMethod(MethodToInvoke.f);
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(MethodToInvoke.h);
    }

    public Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj) {
        return dynamicMethod(methodToInvoke, obj, null);
    }

    public abstract Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getDefaultInstanceForType().getClass().isInstance(obj)) {
            return false;
        }
        Protobuf protobuf = Protobuf.c;
        protobuf.getClass();
        return protobuf.a(getClass()).d(this, (GeneratedMessageLite) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite
    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize;
    }

    public final Parser<MessageType> getParserForType() {
        return (Parser) dynamicMethod(MethodToInvoke.j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            Protobuf protobuf = Protobuf.c;
            protobuf.getClass();
            this.memoizedSerializedSize = protobuf.a(getClass()).f(this);
        }
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        Protobuf protobuf = Protobuf.c;
        protobuf.getClass();
        int iE = protobuf.a(getClass()).e(this);
        this.memoizedHashCode = iE;
        return iE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public void makeImmutable() {
        Protobuf protobuf = Protobuf.c;
        protobuf.getClass();
        protobuf.a(getClass()).c(this);
    }

    public void mergeLengthDelimitedField(int i, ByteString byteString) {
        if (this.unknownFields == UnknownFieldSetLite.f) {
            this.unknownFields = new UnknownFieldSetLite();
        }
        UnknownFieldSetLite unknownFieldSetLite = this.unknownFields;
        if (!unknownFieldSetLite.e) {
            throw new UnsupportedOperationException();
        }
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        unknownFieldSetLite.d((i << 3) | 2, byteString);
    }

    public final void mergeUnknownFields(UnknownFieldSetLite unknownFieldSetLite) {
        this.unknownFields = UnknownFieldSetLite.c(this.unknownFields, unknownFieldSetLite);
    }

    public void mergeVarintField(int i, int i2) {
        if (this.unknownFields == UnknownFieldSetLite.f) {
            this.unknownFields = new UnknownFieldSetLite();
        }
        UnknownFieldSetLite unknownFieldSetLite = this.unknownFields;
        if (!unknownFieldSetLite.e) {
            throw new UnsupportedOperationException();
        }
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        unknownFieldSetLite.d(i << 3, Long.valueOf(i2));
    }

    public boolean parseUnknownField(int i, CodedInputStream codedInputStream) throws IOException {
        if ((i & 7) == 4) {
            return false;
        }
        if (this.unknownFields == UnknownFieldSetLite.f) {
            this.unknownFields = new UnknownFieldSetLite();
        }
        return this.unknownFields.b(i, codedInputStream);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite
    public void setMemoizedSerializedSize(int i) {
        this.memoizedSerializedSize = i;
    }

    public String toString() {
        return MessageLiteToString.d(this, super.toString());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        Protobuf protobuf = Protobuf.c;
        protobuf.getClass();
        Schema schemaA = protobuf.a(getClass());
        CodedOutputStreamWriter codedOutputStreamWriter = codedOutputStream.f15087a;
        if (codedOutputStreamWriter == null) {
            codedOutputStreamWriter = new CodedOutputStreamWriter(codedOutputStream);
        }
        schemaA.h(this, codedOutputStreamWriter);
    }

    public static final <T extends GeneratedMessageLite<T, ?>> boolean isInitialized(T t, boolean z) {
        byte bByteValue = ((Byte) t.dynamicMethod(MethodToInvoke.d)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        Protobuf protobuf = Protobuf.c;
        protobuf.getClass();
        boolean zB = protobuf.a(t.getClass()).b(t);
        if (z) {
            t.dynamicMethod(MethodToInvoke.e, zB ? t : null);
        }
        return zB;
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> BuilderType createBuilder(MessageType messagetype) {
        BuilderType buildertype = (BuilderType) createBuilder();
        buildertype.j(messagetype);
        return buildertype;
    }

    public Object dynamicMethod(MethodToInvoke methodToInvoke) {
        return dynamicMethod(methodToInvoke, null, null);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) dynamicMethod(MethodToInvoke.i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public final BuilderType newBuilderForType() {
        return (BuilderType) dynamicMethod(MethodToInvoke.h);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public final BuilderType toBuilder() {
        BuilderType buildertype = (BuilderType) dynamicMethod(MethodToInvoke.h);
        buildertype.j(this);
        return buildertype;
    }

    public static Internal.LongList mutableCopy(Internal.LongList longList) {
        int size = longList.size();
        return longList.a(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        T t2 = (T) c(t, inputStream, extensionRegistryLite);
        b(t2);
        return t2;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (T) parseFrom(t, byteBuffer, ExtensionRegistryLite.b());
    }

    public static Internal.FloatList mutableCopy(Internal.FloatList floatList) {
        int size = floatList.size();
        return floatList.a(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteString byteString) throws InvalidProtocolBufferException {
        T t2 = (T) parseFrom(t, byteString, ExtensionRegistryLite.b());
        b(t2);
        return t2;
    }

    public static Internal.DoubleList mutableCopy(Internal.DoubleList doubleList) {
        int size = doubleList.size();
        return doubleList.a(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        CodedInputStream codedInputStreamQ = byteString.q();
        T t2 = (T) parsePartialFrom(t, codedInputStreamQ, extensionRegistryLite);
        codedInputStreamQ.a(0);
        b(t2);
        return t2;
    }

    public static Internal.BooleanList mutableCopy(Internal.BooleanList booleanList) {
        int size = booleanList.size();
        return booleanList.a(size == 0 ? 10 : size * 2);
    }

    public static <E> Internal.ProtobufList<E> mutableCopy(Internal.ProtobufList<E> protobufList) {
        int size = protobufList.size();
        return protobufList.a(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr) throws InvalidProtocolBufferException {
        T t2 = (T) parsePartialFrom(t, bArr, 0, bArr.length, ExtensionRegistryLite.b());
        b(t2);
        return t2;
    }

    /* loaded from: classes6.dex */
    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends GeneratedMessageLite<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected FieldSet<ExtensionDescriptor> extensions = FieldSet.d;

        public class ExtensionWriter {

            /* renamed from: a, reason: collision with root package name */
            public final Iterator f15101a;

            public ExtensionWriter(ExtendableMessage extendableMessage) {
                Iterator itN = extendableMessage.extensions.n();
                this.f15101a = itN;
                if (itN.hasNext()) {
                }
            }
        }

        private void eagerlyMergeMessageSetExtension(CodedInputStream codedInputStream, GeneratedExtension<?, ?> generatedExtension, ExtensionRegistryLite extensionRegistryLite, int i) throws IOException {
            parseExtension(codedInputStream, extensionRegistryLite, generatedExtension, (i << 3) | 2, i);
        }

        private void mergeMessageSetExtensionFromBytes(ByteString byteString, ExtensionRegistryLite extensionRegistryLite, GeneratedExtension<?, ?> generatedExtension) throws IOException {
            MessageLite messageLite = (MessageLite) this.extensions.g(generatedExtension.d);
            MessageLite.Builder builder = messageLite != null ? messageLite.toBuilder() : null;
            if (builder == null) {
                builder = generatedExtension.c.newBuilderForType();
            }
            builder.a1(byteString, extensionRegistryLite);
            ensureExtensionsAreMutable().r(generatedExtension.d, generatedExtension.e(((Builder) builder).p1()));
        }

        private <MessageType extends MessageLite> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int iE = 0;
            ByteString byteStringM = null;
            GeneratedExtension generatedExtensionA = null;
            while (true) {
                int iD = codedInputStream.D();
                if (iD == 0) {
                    break;
                }
                if (iD == 16) {
                    iE = codedInputStream.E();
                    if (iE != 0) {
                        generatedExtensionA = extensionRegistryLite.a(iE, messagetype);
                    }
                } else if (iD == 26) {
                    if (iE == 0 || generatedExtensionA == null) {
                        byteStringM = codedInputStream.m();
                    } else {
                        eagerlyMergeMessageSetExtension(codedInputStream, generatedExtensionA, extensionRegistryLite, iE);
                        byteStringM = null;
                    }
                } else if (!codedInputStream.G(iD)) {
                    break;
                }
            }
            codedInputStream.a(12);
            if (byteStringM == null || iE == 0) {
                return;
            }
            if (generatedExtensionA != null) {
                mergeMessageSetExtensionFromBytes(byteStringM, extensionRegistryLite, generatedExtensionA);
            } else {
                mergeLengthDelimitedField(iE, byteStringM);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:4:0x0006  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private boolean parseExtension(com.google.crypto.tink.shaded.protobuf.CodedInputStream r7, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r8, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> r9, int r10, int r11) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 233
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage.parseExtension(com.google.crypto.tink.shaded.protobuf.CodedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension, int, int):boolean");
        }

        private void verifyExtensionContainingType(GeneratedExtension<MessageType, ?> generatedExtension) {
            if (generatedExtension.f15102a != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public FieldSet<ExtensionDescriptor> ensureExtensionsAreMutable() {
            FieldSet<ExtensionDescriptor> fieldSet = this.extensions;
            if (fieldSet.b) {
                this.extensions = fieldSet.clone();
            }
            return this.extensions;
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.l();
        }

        public int extensionsSerializedSize() {
            return this.extensions.j();
        }

        public int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.h();
        }

        /* JADX WARN: Type inference failed for: r1v4, types: [Type, java.util.ArrayList] */
        public final <Type> Type getExtension(ExtensionLite<MessageType, Type> extensionLite) {
            GeneratedExtension<MessageType, ?> generatedExtensionAccess$000 = GeneratedMessageLite.access$000(extensionLite);
            verifyExtensionContainingType(generatedExtensionAccess$000);
            Type type = (Type) this.extensions.g(generatedExtensionAccess$000.d);
            if (type == null) {
                return (Type) generatedExtensionAccess$000.b;
            }
            ExtensionDescriptor extensionDescriptor = generatedExtensionAccess$000.d;
            if (!extensionDescriptor.g) {
                return (Type) generatedExtensionAccess$000.d(type);
            }
            if (extensionDescriptor.f.d != WireFormat.JavaType.ENUM) {
                return type;
            }
            ?? r1 = (Type) new ArrayList();
            Iterator it = ((List) type).iterator();
            while (it.hasNext()) {
                r1.add(generatedExtensionAccess$000.d(it.next()));
            }
            return r1;
        }

        public final <Type> int getExtensionCount(ExtensionLite<MessageType, List<Type>> extensionLite) {
            GeneratedExtension<MessageType, ?> generatedExtensionAccess$000 = GeneratedMessageLite.access$000(extensionLite);
            verifyExtensionContainingType(generatedExtensionAccess$000);
            FieldSet<ExtensionDescriptor> fieldSet = this.extensions;
            ExtensionDescriptor extensionDescriptor = generatedExtensionAccess$000.d;
            fieldSet.getClass();
            if (!extensionDescriptor.g) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objG = fieldSet.g(extensionDescriptor);
            if (objG == null) {
                return 0;
            }
            return ((List) objG).size();
        }

        public final <Type> boolean hasExtension(ExtensionLite<MessageType, Type> extensionLite) {
            GeneratedExtension<MessageType, ?> generatedExtensionAccess$000 = GeneratedMessageLite.access$000(extensionLite);
            verifyExtensionContainingType(generatedExtensionAccess$000);
            FieldSet<ExtensionDescriptor> fieldSet = this.extensions;
            ExtensionDescriptor extensionDescriptor = generatedExtensionAccess$000.d;
            fieldSet.getClass();
            if (extensionDescriptor.g) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return fieldSet.f15096a.get(extensionDescriptor) != null;
        }

        public final void mergeExtensionFields(MessageType messagetype) {
            FieldSet<ExtensionDescriptor> fieldSet = this.extensions;
            if (fieldSet.b) {
                this.extensions = fieldSet.clone();
            }
            this.extensions.p(messagetype.extensions);
        }

        public ExtendableMessage<MessageType, BuilderType>.ExtensionWriter newExtensionWriter() {
            return new ExtensionWriter(this);
        }

        public ExtendableMessage<MessageType, BuilderType>.ExtensionWriter newMessageSetExtensionWriter() {
            return new ExtensionWriter(this);
        }

        public <MessageType extends MessageLite> boolean parseUnknownField(MessageType messagetype, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i) throws IOException {
            int i2 = i >>> 3;
            return parseExtension(codedInputStream, extensionRegistryLite, extensionRegistryLite.a(i2, messagetype), i, i2);
        }

        public <MessageType extends MessageLite> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i) throws IOException {
            if (i != 11) {
                return (i & 7) == 2 ? parseUnknownField(messagetype, codedInputStream, extensionRegistryLite, i) : codedInputStream.G(i);
            }
            mergeMessageSetExtensionFromCodedStream(messagetype, codedInputStream, extensionRegistryLite);
            return true;
        }

        public final <Type> Type getExtension(ExtensionLite<MessageType, List<Type>> extensionLite, int i) {
            GeneratedExtension<MessageType, ?> generatedExtensionAccess$000 = GeneratedMessageLite.access$000(extensionLite);
            verifyExtensionContainingType(generatedExtensionAccess$000);
            FieldSet<ExtensionDescriptor> fieldSet = this.extensions;
            ExtensionDescriptor extensionDescriptor = generatedExtensionAccess$000.d;
            fieldSet.getClass();
            if (extensionDescriptor.g) {
                Object objG = fieldSet.g(extensionDescriptor);
                if (objG != null) {
                    return (Type) generatedExtensionAccess$000.d(((List) objG).get(i));
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        T t2 = (T) parsePartialFrom(t, bArr, 0, bArr.length, extensionRegistryLite);
        b(t2);
        return t2;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, byte[] bArr, int i, int i2, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        T t2 = (T) t.dynamicMethod(MethodToInvoke.g);
        try {
            Schema schemaB = Protobuf.c.b(t2);
            schemaB.a(t2, bArr, i, i + i2, new ArrayDecoders.Registers(extensionRegistryLite));
            schemaB.c(t2);
            if (t2.memoizedHashCode == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e.getCause());
            }
            throw new InvalidProtocolBufferException(e.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.i();
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        T t2 = (T) parsePartialFrom(t, CodedInputStream.g(inputStream), ExtensionRegistryLite.b());
        b(t2);
        return t2;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        T t2 = (T) parsePartialFrom(t, CodedInputStream.g(inputStream), extensionRegistryLite);
        b(t2);
        return t2;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, CodedInputStream codedInputStream) throws InvalidProtocolBufferException {
        return (T) parseFrom(t, codedInputStream, ExtensionRegistryLite.b());
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        T t2 = (T) parsePartialFrom(t, codedInputStream, extensionRegistryLite);
        b(t2);
        return t2;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, CodedInputStream codedInputStream) throws InvalidProtocolBufferException {
        return (T) parsePartialFrom(t, codedInputStream, ExtensionRegistryLite.b());
    }
}
