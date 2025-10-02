package io.grpc;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import io.grpc.Codec;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.concurrent.ThreadSafe;

@ExperimentalApi
@ThreadSafe
/* loaded from: classes7.dex */
public final class DecompressorRegistry {
    public static final Joiner c = new Joiner(String.valueOf(','));
    public static final DecompressorRegistry d = new DecompressorRegistry(Codec.Identity.f23926a, false, new DecompressorRegistry(new Codec.Gzip(), true, new DecompressorRegistry()));

    /* renamed from: a, reason: collision with root package name */
    public final Map f23934a;
    public final byte[] b;

    public static final class DecompressorInfo {

        /* renamed from: a, reason: collision with root package name */
        public final Decompressor f23935a;
        public final boolean b;

        public DecompressorInfo(Decompressor decompressor, boolean z) {
            Preconditions.j(decompressor, "decompressor");
            this.f23935a = decompressor;
            this.b = z;
        }
    }

    public DecompressorRegistry(Codec codec, boolean z, DecompressorRegistry decompressorRegistry) {
        String strA = codec.a();
        Preconditions.f("Comma is currently not allowed in message encoding", !strA.contains(","));
        int size = decompressorRegistry.f23934a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(decompressorRegistry.f23934a.containsKey(codec.a()) ? size : size + 1);
        for (DecompressorInfo decompressorInfo : decompressorRegistry.f23934a.values()) {
            String strA2 = decompressorInfo.f23935a.a();
            if (!strA2.equals(strA)) {
                linkedHashMap.put(strA2, new DecompressorInfo(decompressorInfo.f23935a, decompressorInfo.b));
            }
        }
        linkedHashMap.put(strA, new DecompressorInfo(codec, z));
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        this.f23934a = mapUnmodifiableMap;
        HashSet hashSet = new HashSet(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            if (((DecompressorInfo) entry.getValue()).b) {
                hashSet.add((String) entry.getKey());
            }
        }
        this.b = c.c(Collections.unmodifiableSet(hashSet)).getBytes(Charset.forName("US-ASCII"));
    }

    public final Decompressor a(String str) {
        DecompressorInfo decompressorInfo = (DecompressorInfo) this.f23934a.get(str);
        if (decompressorInfo != null) {
            return decompressorInfo.f23935a;
        }
        return null;
    }

    public DecompressorRegistry() {
        this.f23934a = new LinkedHashMap(0);
        this.b = new byte[0];
    }
}
