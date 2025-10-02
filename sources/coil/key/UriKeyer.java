package coil.key;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import coil.request.Options;
import coil.util.Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcoil/key/UriKeyer;", "Lcoil/key/Keyer;", "Landroid/net/Uri;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UriKeyer implements Keyer<Uri> {
    @Override // coil.key.Keyer
    public final String a(Object obj, Options options) {
        Uri uri = (Uri) obj;
        if (!Intrinsics.c(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(uri);
        sb.append('-');
        Configuration configuration = options.f13021a.getResources().getConfiguration();
        Bitmap.Config[] configArr = Utils.f13033a;
        sb.append(configuration.uiMode & 48);
        return sb.toString();
    }
}
