package androidx.security.crypto;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyFormat;
import com.google.crypto.tink.proto.AesGcmHkdfStreamingParams;
import com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKeyManager;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/* loaded from: classes2.dex */
public final class EncryptedFile {

    public static final class Builder {
    }

    public static final class EncryptedFileInputStream extends FileInputStream {
        @Override // java.io.FileInputStream, java.io.InputStream
        public final int available() {
            throw null;
        }

        @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // java.io.FileInputStream
        public final FileChannel getChannel() {
            throw new UnsupportedOperationException("For encrypted files, please open the relevant FileInput/FileOutputStream.");
        }

        @Override // java.io.InputStream
        public final synchronized void mark(int i) {
            throw null;
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            throw null;
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public final int read() {
            throw null;
        }

        @Override // java.io.InputStream
        public final synchronized void reset() {
            throw null;
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public final long skip(long j) {
            throw null;
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public final int read(byte[] bArr) {
            throw null;
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            throw null;
        }
    }

    public static final class EncryptedFileOutputStream extends FileOutputStream {
        @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
            throw null;
        }

        @Override // java.io.FileOutputStream
        public final FileChannel getChannel() {
            throw new UnsupportedOperationException("For encrypted files, please open the relevant FileInput/FileOutputStream.");
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream
        public final void write(byte[] bArr) {
            throw null;
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream
        public final void write(int i) {
            throw null;
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) {
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FileEncryptionScheme {
        public static final /* synthetic */ FileEncryptionScheme[] d;

        /* JADX INFO: Fake field, exist only in values array */
        FileEncryptionScheme EF60;

        static {
            AesGcmHkdfStreamingParams.Builder builderNewBuilder = AesGcmHkdfStreamingParams.newBuilder();
            builderNewBuilder.m(4096);
            builderNewBuilder.o(32);
            builderNewBuilder.p();
            AesGcmHkdfStreamingParams aesGcmHkdfStreamingParams = (AesGcmHkdfStreamingParams) builderNewBuilder.p1();
            AesGcmHkdfStreamingKeyFormat.Builder builderNewBuilder2 = AesGcmHkdfStreamingKeyFormat.newBuilder();
            builderNewBuilder2.m(32);
            builderNewBuilder2.o(aesGcmHkdfStreamingParams);
            AesGcmHkdfStreamingKeyFormat aesGcmHkdfStreamingKeyFormat = (AesGcmHkdfStreamingKeyFormat) builderNewBuilder2.p1();
            new AesGcmHkdfStreamingKeyManager();
            KeyTemplate.a("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey", aesGcmHkdfStreamingKeyFormat.toByteArray(), KeyTemplate.OutputPrefixType.e);
            d = new FileEncryptionScheme[]{new FileEncryptionScheme("AES256_GCM_HKDF_4KB", 0)};
        }

        public static FileEncryptionScheme valueOf(String str) {
            return (FileEncryptionScheme) Enum.valueOf(FileEncryptionScheme.class, str);
        }

        public static FileEncryptionScheme[] values() {
            return (FileEncryptionScheme[]) d.clone();
        }
    }
}
