package io.jsonwebtoken.impl.compression;

import io.jsonwebtoken.CompressionCodec;
import io.jsonwebtoken.impl.compression.AbstractCompressionCodec;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes7.dex */
public class GzipCompressionCodec extends AbstractCompressionCodec implements CompressionCodec {
    private static final String GZIP = "GZIP";
    private static final AbstractCompressionCodec.StreamWrapper WRAPPER = new AbstractCompressionCodec.StreamWrapper() { // from class: io.jsonwebtoken.impl.compression.GzipCompressionCodec.1
        @Override // io.jsonwebtoken.impl.compression.AbstractCompressionCodec.StreamWrapper
        public OutputStream wrap(OutputStream outputStream) throws IOException {
            return new GZIPOutputStream(outputStream);
        }
    };

    @Override // io.jsonwebtoken.impl.compression.AbstractCompressionCodec
    public byte[] doCompress(byte[] bArr) throws IOException {
        return writeAndClose(bArr, WRAPPER);
    }

    @Override // io.jsonwebtoken.impl.compression.AbstractCompressionCodec
    public byte[] doDecompress(byte[] bArr) throws IOException {
        return readAndClose(new GZIPInputStream(new ByteArrayInputStream(bArr)));
    }

    @Override // io.jsonwebtoken.CompressionCodec
    public String getAlgorithmName() {
        return GZIP;
    }
}
