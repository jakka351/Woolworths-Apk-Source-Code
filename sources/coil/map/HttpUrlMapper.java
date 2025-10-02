package coil.map;

import coil.request.Options;
import kotlin.Metadata;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcoil/map/HttpUrlMapper;", "Lcoil/map/Mapper;", "Lokhttp3/HttpUrl;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HttpUrlMapper implements Mapper<HttpUrl, String> {
    @Override // coil.map.Mapper
    public final Object a(Object obj, Options options) {
        return ((HttpUrl) obj).i;
    }
}
