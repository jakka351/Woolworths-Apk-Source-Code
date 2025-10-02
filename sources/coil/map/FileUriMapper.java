package coil.map;

import android.net.Uri;
import coil.request.Options;
import coil.util.Utils;
import java.io.File;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcoil/map/FileUriMapper;", "Lcoil/map/Mapper;", "Landroid/net/Uri;", "Ljava/io/File;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class FileUriMapper implements Mapper<Uri, File> {
    @Override // coil.map.Mapper
    public final Object a(Object obj, Options options) {
        Uri uri = (Uri) obj;
        if (Utils.d(uri)) {
            return null;
        }
        String scheme = uri.getScheme();
        if (scheme != null && !scheme.equals("file")) {
            return null;
        }
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        if (!StringsKt.X(path, '/') || ((String) CollectionsKt.F(uri.getPathSegments())) == null) {
            return null;
        }
        if (!Intrinsics.c(uri.getScheme(), "file")) {
            return new File(uri.toString());
        }
        String path2 = uri.getPath();
        if (path2 != null) {
            return new File(path2);
        }
        return null;
    }
}
