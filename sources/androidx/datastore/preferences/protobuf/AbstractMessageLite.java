package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractMessageLite;
import androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.MessageLite;
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

    /* loaded from: classes2.dex */
    public interface InternalOneOfEnum {
    }

    public static void c(Iterable iterable, List list) {
        Charset charset = Internal.f2648a;
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
                    lazyStringList.B0((ByteString) obj);
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    lazyStringList.B0(ByteString.i(0, bArr.length, bArr));
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

    public int d() {
        throw new UnsupportedOperationException();
    }

    public int e(Schema schema) {
        int iD = d();
        if (iD != -1) {
            return iD;
        }
        int iD2 = schema.d(this);
        f(iD2);
        return iD2;
    }

    public void f(int i) {
        throw new UnsupportedOperationException();
    }

    public final void g(OutputStream outputStream) throws IOException {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) this;
        int iE = generatedMessageLite.e(null);
        Logger logger = CodedOutputStream.b;
        if (iE > 4096) {
            iE = 4096;
        }
        CodedOutputStream.OutputStreamEncoder outputStreamEncoder = new CodedOutputStream.OutputStreamEncoder(outputStream, iE);
        generatedMessageLite.b(outputStreamEncoder);
        if (outputStreamEncoder.f > 0) {
            outputStreamEncoder.y0();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public final ByteString toByteString() {
        try {
            int iE = ((GeneratedMessageLite) this).e(null);
            ByteString byteString = ByteString.e;
            ByteString.CodedBuilder codedBuilder = new ByteString.CodedBuilder(iE);
            ((GeneratedMessageLite) this).b(codedBuilder.b());
            return codedBuilder.a();
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    public static abstract class Builder<MessageType extends AbstractMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> implements MessageLite.Builder {
        @Override // 
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public abstract GeneratedMessageLite.Builder clone();

        /* loaded from: classes2.dex */
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
