package io.grpc.protobuf.lite;

import YU.a;
import com.google.common.base.Preconditions;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import io.grpc.ExperimentalApi;
import io.grpc.KnownLength;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

@ExperimentalApi
/* loaded from: classes7.dex */
public final class ProtoLiteUtils {

    /* renamed from: a, reason: collision with root package name */
    public static volatile ExtensionRegistryLite f24156a = ExtensionRegistryLite.b();

    public static final class MessageMarshaller<T extends MessageLite> implements MethodDescriptor.PrototypeMarshaller<T> {
        public static final ThreadLocal d = new ThreadLocal();

        /* renamed from: a, reason: collision with root package name */
        public final Parser f24157a;
        public final MessageLite b;
        public final int c;

        public MessageMarshaller(MessageLite messageLite) {
            Preconditions.j(messageLite, "defaultInstance cannot be null");
            this.b = messageLite;
            this.f24157a = messageLite.j();
            this.c = -1;
        }

        @Override // io.grpc.MethodDescriptor.Marshaller
        public final InputStream a(Object obj) {
            return new ProtoInputStream((MessageLite) obj, this.f24157a);
        }

        @Override // io.grpc.MethodDescriptor.Marshaller
        public final Object b(InputStream inputStream) throws IOException {
            CodedInputStream codedInputStreamF;
            byte[] bArr;
            if ((inputStream instanceof ProtoInputStream) && ((ProtoInputStream) inputStream).e == this.f24157a) {
                try {
                    MessageLite messageLite = ((ProtoInputStream) inputStream).d;
                    if (messageLite != null) {
                        return messageLite;
                    }
                    throw new IllegalStateException("message not available");
                } catch (IllegalStateException unused) {
                }
            }
            try {
                if (inputStream instanceof KnownLength) {
                    int iAvailable = inputStream.available();
                    if (iAvailable <= 0 || iAvailable > 4194304) {
                        if (iAvailable == 0) {
                            return this.b;
                        }
                        codedInputStreamF = null;
                    } else {
                        ThreadLocal threadLocal = d;
                        Reference reference = (Reference) threadLocal.get();
                        if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < iAvailable) {
                            bArr = new byte[iAvailable];
                            threadLocal.set(new WeakReference(bArr));
                        }
                        int i = iAvailable;
                        while (i > 0) {
                            int i2 = inputStream.read(bArr, iAvailable - i, i);
                            if (i2 == -1) {
                                break;
                            }
                            i -= i2;
                        }
                        if (i != 0) {
                            throw new RuntimeException("size inaccurate: " + iAvailable + " != " + (iAvailable - i));
                        }
                        codedInputStreamF = CodedInputStream.g(bArr, 0, iAvailable, false);
                    }
                } else {
                    codedInputStreamF = null;
                }
                if (codedInputStreamF == null) {
                    codedInputStreamF = CodedInputStream.f(inputStream);
                }
                int i3 = this.c;
                if (i3 >= 0) {
                    if (i3 < 0) {
                        throw new IllegalArgumentException(a.d(i3, "Recursion limit cannot be negative: "));
                    }
                    codedInputStreamF.b = i3;
                }
                try {
                    GeneratedMessageLite generatedMessageLiteA = this.f24157a.a(codedInputStreamF, ProtoLiteUtils.f24156a);
                    try {
                        codedInputStreamF.a(0);
                        return generatedMessageLiteA;
                    } catch (InvalidProtocolBufferException e) {
                        throw e;
                    }
                } catch (InvalidProtocolBufferException e2) {
                    throw Status.m.i("Invalid protobuf byte sequence").h(e2).a();
                }
            } catch (IOException e3) {
                throw new RuntimeException(e3);
            }
        }
    }

    public static final class MetadataMarshaller<T extends MessageLite> implements Metadata.BinaryMarshaller<T> {
    }

    public static MethodDescriptor.Marshaller a(GeneratedMessageLite generatedMessageLite) {
        return new MessageMarshaller(generatedMessageLite);
    }
}
