package coil.map;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v4.media.session.a;
import coil.request.Options;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcoil/map/ResourceUriMapper;", "Lcoil/map/Mapper;", "Landroid/net/Uri;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ResourceUriMapper implements Mapper<Uri, Uri> {
    @Override // coil.map.Mapper
    public final Object a(Object obj, Options options) throws PackageManager.NameNotFoundException {
        String authority;
        Uri uri = (Uri) obj;
        if (!Intrinsics.c(uri.getScheme(), "android.resource") || (authority = uri.getAuthority()) == null || StringsKt.D(authority) || uri.getPathSegments().size() != 2) {
            return null;
        }
        String authority2 = uri.getAuthority();
        if (authority2 == null) {
            authority2 = "";
        }
        Resources resourcesForApplication = options.f13021a.getPackageManager().getResourcesForApplication(authority2);
        List<String> pathSegments = uri.getPathSegments();
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
        if (identifier == 0) {
            throw new IllegalStateException(a.m(uri, "Invalid android.resource URI: ").toString());
        }
        return Uri.parse("android.resource://" + authority2 + '/' + identifier);
    }
}
