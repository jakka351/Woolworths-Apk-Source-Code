package coil3.map;

import android.net.Uri;
import coil3.Uri_androidKt;
import coil3.request.Options;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcoil3/map/AndroidUriMapper;", "Lcoil3/map/Mapper;", "Landroid/net/Uri;", "Lcoil3/Uri;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidUriMapper implements Mapper<Uri, coil3.Uri> {
    @Override // coil3.map.Mapper
    public final coil3.Uri a(Object obj, Options options) {
        return Uri_androidKt.a((Uri) obj);
    }
}
