package coil.map;

import coil.request.Options;
import java.nio.ByteBuffer;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcoil/map/ByteArrayMapper;", "Lcoil/map/Mapper;", "", "Ljava/nio/ByteBuffer;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ByteArrayMapper implements Mapper<byte[], ByteBuffer> {
    @Override // coil.map.Mapper
    public final Object a(Object obj, Options options) {
        return ByteBuffer.wrap((byte[]) obj);
    }
}
