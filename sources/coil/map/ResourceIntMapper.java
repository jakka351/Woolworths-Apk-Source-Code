package coil.map;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import coil.request.Options;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcoil/map/ResourceIntMapper;", "Lcoil/map/Mapper;", "", "Landroid/net/Uri;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ResourceIntMapper implements Mapper<Integer, Uri> {
    @Override // coil.map.Mapper
    public final Object a(Object obj, Options options) {
        int iIntValue = ((Number) obj).intValue();
        Context context = options.f13021a;
        try {
            if (context.getResources().getResourceEntryName(iIntValue) == null) {
                return null;
            }
            return Uri.parse("android.resource://" + context.getPackageName() + '/' + iIntValue);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
