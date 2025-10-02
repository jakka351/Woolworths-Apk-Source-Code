package androidx.media3.datasource.cache;

import androidx.camera.core.internal.a;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;

@UnstableApi
/* loaded from: classes2.dex */
public interface CacheKeyFactory {
    public static final a h3 = new a(8);

    String c(DataSpec dataSpec);
}
