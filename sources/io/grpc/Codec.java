package io.grpc;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

@ExperimentalApi
/* loaded from: classes7.dex */
public interface Codec extends Compressor, Decompressor {

    public static final class Gzip implements Codec {
        @Override // io.grpc.Compressor, io.grpc.Decompressor
        public final String a() {
            return "gzip";
        }

        @Override // io.grpc.Decompressor
        public final InputStream b(InputStream inputStream) {
            return new GZIPInputStream(inputStream);
        }

        @Override // io.grpc.Compressor
        public final OutputStream c(OutputStream outputStream) {
            return new GZIPOutputStream(outputStream);
        }
    }

    public static final class Identity implements Codec {

        /* renamed from: a, reason: collision with root package name */
        public static final Identity f23926a = new Identity();

        @Override // io.grpc.Compressor, io.grpc.Decompressor
        public final String a() {
            return "identity";
        }

        @Override // io.grpc.Decompressor
        public final InputStream b(InputStream inputStream) {
            return inputStream;
        }

        @Override // io.grpc.Compressor
        public final OutputStream c(OutputStream outputStream) {
            return outputStream;
        }
    }
}
