package androidx.media3.exoplayer.drm;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.C;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.UUID;
import me.oriient.internal.infra.rest.RequestBuilder;

@UnstableApi
/* loaded from: classes2.dex */
public final class HttpMediaDrmCallback implements MediaDrmCallback {

    /* renamed from: a, reason: collision with root package name */
    public final DefaultHttpDataSource.Factory f3087a;
    public final String b;
    public final HashMap c = new HashMap();

    public HttpMediaDrmCallback(String str, DefaultHttpDataSource.Factory factory) {
        this.f3087a = factory;
        this.b = str;
    }

    @Override // androidx.media3.exoplayer.drm.MediaDrmCallback
    public final byte[] a(UUID uuid, ExoMediaDrm.KeyRequest keyRequest) throws MediaDrmCallbackException {
        String str = keyRequest.b;
        if (TextUtils.isEmpty(str)) {
            str = this.b;
        }
        if (TextUtils.isEmpty(str)) {
            DataSpec.Builder builder = new DataSpec.Builder();
            Uri uri = Uri.EMPTY;
            builder.f2958a = uri;
            throw new MediaDrmCallbackException(builder.a(), uri, ImmutableMap.l(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = C.e;
        map.put(RequestBuilder.CONTENT_TYPE, uuid2.equals(uuid) ? "text/xml" : C.c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.c) {
            map.putAll(this.c);
        }
        return DrmUtil.a(this.f3087a.a(), str, keyRequest.f3083a, map);
    }

    @Override // androidx.media3.exoplayer.drm.MediaDrmCallback
    public final byte[] b(ExoMediaDrm.ProvisionRequest provisionRequest) {
        return DrmUtil.a(this.f3087a.a(), provisionRequest.b + "&signedRequest=" + Util.n(provisionRequest.f3084a), null, Collections.EMPTY_MAP);
    }
}
