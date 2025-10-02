package io.jsonwebtoken.impl.compression;

import io.jsonwebtoken.impl.compression.AbstractCompressionCodec;
import io.jsonwebtoken.lang.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;
import java.util.zip.InflaterOutputStream;

/* loaded from: classes7.dex */
public class DeflateCompressionCodec extends AbstractCompressionCodec {
    private static final String DEFLATE = "DEF";
    private static final AbstractCompressionCodec.StreamWrapper WRAPPER = new AbstractCompressionCodec.StreamWrapper() { // from class: io.jsonwebtoken.impl.compression.DeflateCompressionCodec.1
        @Override // io.jsonwebtoken.impl.compression.AbstractCompressionCodec.StreamWrapper
        public OutputStream wrap(OutputStream outputStream) {
            return new DeflaterOutputStream(outputStream);
        }
    };

    @Override // io.jsonwebtoken.impl.compression.AbstractCompressionCodec
    public byte[] doCompress(byte[] bArr) throws IOException {
        return writeAndClose(bArr, WRAPPER);
    }

    @Override // io.jsonwebtoken.impl.compression.AbstractCompressionCodec
    public byte[] doDecompress(byte[] bArr) throws IOException {
        try {
            return readAndClose(new InflaterInputStream(new ByteArrayInputStream(bArr)));
        } catch (IOException e) {
            try {
                return doDecompressBackCompat(bArr);
            } catch (IOException unused) {
                throw e;
            }
        }
    }

    public byte[] doDecompressBackCompat(byte[] bArr) throws Throwable {
        InflaterOutputStream inflaterOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                inflaterOutputStream = new InflaterOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
                inflaterOutputStream = null;
            }
        } catch (Throwable th2) {
            th = th2;
            inflaterOutputStream = null;
        }
        try {
            inflaterOutputStream.write(bArr);
            inflaterOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Objects.nullSafeClose(byteArrayOutputStream, inflaterOutputStream);
            return byteArray;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream2 = byteArrayOutputStream;
            Objects.nullSafeClose(byteArrayOutputStream2, inflaterOutputStream);
            throw th;
        }
    }

    @Override // io.jsonwebtoken.CompressionCodec
    public String getAlgorithmName() {
        return DEFLATE;
    }
}
