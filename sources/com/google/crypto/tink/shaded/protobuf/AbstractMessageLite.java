package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractMessageLite;
import com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.CodedOutputStream;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class AbstractMessageLite<MessageType extends AbstractMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> implements MessageLite {
    protected int memoizedHashCode;

    /* loaded from: classes6.dex */
    public interface InternalOneOfEnum {
    }

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        Builder.a(iterable, (List) collection);
    }

    public static void checkByteStringIsUtf8(ByteString byteString) throws IllegalArgumentException {
        if (!byteString.n()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    public final String a(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    public int getSerializedSize(Schema schema) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int iF = schema.f(this);
        setMemoizedSerializedSize(iF);
        return iF;
    }

    public UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException();
    }

    public void setMemoizedSerializedSize(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            Logger logger = CodedOutputStream.b;
            CodedOutputStream.ArrayEncoder arrayEncoder = new CodedOutputStream.ArrayEncoder(bArr, serializedSize);
            writeTo(arrayEncoder);
            if (arrayEncoder.g0() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(a("byte array"), e);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public ByteString toByteString() {
        try {
            int serializedSize = getSerializedSize();
            ByteString byteString = ByteString.e;
            ByteString.CodedBuilder codedBuilder = new ByteString.CodedBuilder(serializedSize);
            writeTo(codedBuilder.b());
            return codedBuilder.a();
        } catch (IOException e) {
            throw new RuntimeException(a("ByteString"), e);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        int iB0 = CodedOutputStream.b0(serializedSize) + serializedSize;
        if (iB0 > 4096) {
            iB0 = 4096;
        }
        CodedOutputStream.OutputStreamEncoder outputStreamEncoder = new CodedOutputStream.OutputStreamEncoder(outputStream, iB0);
        outputStreamEncoder.q0(serializedSize);
        writeTo(outputStreamEncoder);
        outputStreamEncoder.z0();
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        Logger logger = CodedOutputStream.b;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        CodedOutputStream.OutputStreamEncoder outputStreamEncoder = new CodedOutputStream.OutputStreamEncoder(outputStream, serializedSize);
        writeTo(outputStreamEncoder);
        outputStreamEncoder.z0();
    }

    public static abstract class Builder<MessageType extends AbstractMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> implements MessageLite.Builder {
        public static void a(Iterable iterable, List list) {
            Charset charset = Internal.f15103a;
            iterable.getClass();
            if (iterable instanceof LazyStringList) {
                List listE = ((LazyStringList) iterable).e();
                LazyStringList lazyStringList = (LazyStringList) list;
                int size = list.size();
                for (Object obj : listE) {
                    if (obj == null) {
                        String str = "Element at index " + (lazyStringList.size() - size) + " is null.";
                        for (int size2 = lazyStringList.size() - 1; size2 >= size; size2--) {
                            lazyStringList.remove(size2);
                        }
                        throw new NullPointerException(str);
                    }
                    if (obj instanceof ByteString) {
                        lazyStringList.P0((ByteString) obj);
                    } else {
                        lazyStringList.add((String) obj);
                    }
                }
                return;
            }
            if (iterable instanceof PrimitiveNonBoxingCollection) {
                list.addAll((Collection) iterable);
                return;
            }
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size3 = list.size();
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    String str2 = "Element at index " + (list.size() - size3) + " is null.";
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(str2);
                }
                list.add(obj2);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final Builder W0() {
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final Builder a1(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            try {
                CodedInputStream codedInputStreamQ = byteString.q();
                Y1(codedInputStreamQ, extensionRegistryLite);
                codedInputStreamQ.a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading " + getClass().getName() + " from a ByteString threw an IOException (should never happen).", e2);
            }
        }

        @Override // 
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public abstract GeneratedMessageLite.Builder clone();

        public abstract GeneratedMessageLite.Builder c(AbstractMessageLite abstractMessageLite);

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public abstract GeneratedMessageLite.Builder Y1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final Builder f2(MessageLite messageLite) {
            if (((GeneratedMessageLite.Builder) this).d.getClass().isInstance(messageLite)) {
                return c((AbstractMessageLite) messageLite);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }

        /* loaded from: classes6.dex */
        public static final class LimitedInputStream extends FilterInputStream {
            public int d;

            public LimitedInputStream(InputStream inputStream, int i) {
                super(inputStream);
                this.d = i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int available() {
                return Math.min(super.available(), this.d);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read() throws IOException {
                if (this.d <= 0) {
                    return -1;
                }
                int i = super.read();
                if (i >= 0) {
                    this.d--;
                }
                return i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final long skip(long j) throws IOException {
                long jSkip = super.skip(Math.min(j, this.d));
                if (jSkip >= 0) {
                    this.d = (int) (this.d - jSkip);
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.d;
                if (i3 <= 0) {
                    return -1;
                }
                int i4 = super.read(bArr, i, Math.min(i2, i3));
                if (i4 >= 0) {
                    this.d -= i4;
                }
                return i4;
            }
        }
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        Builder.a(iterable, list);
    }
}
