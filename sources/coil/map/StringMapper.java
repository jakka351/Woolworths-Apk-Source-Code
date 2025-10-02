package coil.map;

import android.net.Uri;
import coil.request.Options;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcoil/map/StringMapper;", "Lcoil/map/Mapper;", "", "Landroid/net/Uri;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class StringMapper implements Mapper<String, Uri> {
    @Override // coil.map.Mapper
    public final Object a(Object obj, Options options) {
        return Uri.parse((String) obj);
    }
}
