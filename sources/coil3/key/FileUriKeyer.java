package coil3.key;

import android.graphics.Bitmap;
import coil3.ExtrasKt;
import coil3.Uri;
import coil3.UriKt;
import coil3.request.ImageRequestsKt;
import coil3.request.Options;
import coil3.util.UtilsKt;
import coil3.util.Utils_androidKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okio.FileSystem;
import okio.Path;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcoil3/key/FileUriKeyer;", "Lcoil3/key/Keyer;", "Lcoil3/Uri;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FileUriKeyer implements Keyer<Uri> {
    @Override // coil3.key.Keyer
    public final String a(Object obj, Options options) {
        String strB;
        Uri uri = (Uri) obj;
        Function1 function1 = UtilsKt.f13156a;
        String str = uri.c;
        if ((str != null && !str.equals("file")) || uri.e == null) {
            return null;
        }
        Bitmap.Config[] configArr = Utils_androidKt.f13157a;
        if ((Intrinsics.c(uri.c, "file") && Intrinsics.c(CollectionsKt.F(UriKt.c(uri)), "android_asset")) || !((Boolean) ExtrasKt.b(options, ImageRequestsKt.b)).booleanValue() || (strB = UriKt.b(uri)) == null) {
            return null;
        }
        FileSystem fileSystem = options.f;
        String str2 = Path.e;
        Long l = fileSystem.j(Path.Companion.a(strB, false)).f;
        StringBuilder sb = new StringBuilder();
        sb.append(uri);
        sb.append('-');
        sb.append(l);
        return sb.toString();
    }
}
