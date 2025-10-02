package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessageLite.Builder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLite;
import java.io.FilterInputStream;
import java.io.IOException;
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

    public static void k(Iterable iterable, List list) {
        Charset charset = Internal.f16059a;
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
                    lazyStringList.R((ByteString) obj);
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

    public int m() {
        throw new UnsupportedOperationException();
    }

    public int n(Schema schema) {
        int iM = m();
        if (iM != -1) {
            return iM;
        }
        int iE = schema.e(this);
        p(iE);
        return iE;
    }

    public final String o(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public void p(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.MessageLite
    public final byte[] toByteArray() {
        try {
            int iN = ((GeneratedMessageLite) this).n(null);
            byte[] bArr = new byte[iN];
            Logger logger = CodedOutputStream.b;
            CodedOutputStream.ArrayEncoder arrayEncoder = new CodedOutputStream.ArrayEncoder(bArr, 0, iN);
            ((GeneratedMessageLite) this).c(arrayEncoder);
            if (arrayEncoder.c0() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(o("byte array"), e);
        }
    }

    @Override // com.google.protobuf.MessageLite
    public final ByteString toByteString() {
        try {
            int iN = ((GeneratedMessageLite) this).n(null);
            ByteString byteString = ByteString.e;
            ByteString.CodedBuilder codedBuilder = new ByteString.CodedBuilder(iN);
            ((GeneratedMessageLite) this).c(codedBuilder.b());
            return codedBuilder.a();
        } catch (IOException e) {
            throw new RuntimeException(o("ByteString"), e);
        }
    }

    @Override // com.google.protobuf.MessageLite
    public final void writeTo(OutputStream outputStream) throws IOException {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) this;
        int iN = generatedMessageLite.n(null);
        Logger logger = CodedOutputStream.b;
        if (iN > 4096) {
            iN = 4096;
        }
        CodedOutputStream.OutputStreamEncoder outputStreamEncoder = new CodedOutputStream.OutputStreamEncoder(outputStream, iN);
        generatedMessageLite.c(outputStreamEncoder);
        outputStreamEncoder.z0();
    }

    public static abstract class Builder<MessageType extends AbstractMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> implements MessageLite.Builder {
        @Override // 
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public abstract GeneratedMessageLite.Builder clone();

        /* loaded from: classes6.dex */
        public static final class LimitedInputStream extends FilterInputStream {
            public int d;

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
            public final long skip(long j) {
                int iSkip = (int) super.skip(Math.min(j, this.d));
                if (iSkip >= 0) {
                    this.d -= iSkip;
                }
                return iSkip;
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
}
