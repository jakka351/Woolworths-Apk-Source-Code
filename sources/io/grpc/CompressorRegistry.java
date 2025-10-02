package io.grpc;

import io.grpc.Codec;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.concurrent.ThreadSafe;

@ExperimentalApi
@ThreadSafe
/* loaded from: classes7.dex */
public final class CompressorRegistry {
    public static final CompressorRegistry b = new CompressorRegistry(new Codec.Gzip(), Codec.Identity.f23926a);

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f23929a = new ConcurrentHashMap();

    public CompressorRegistry(Compressor... compressorArr) {
        for (Compressor compressor : compressorArr) {
            this.f23929a.put(compressor.a(), compressor);
        }
    }
}
