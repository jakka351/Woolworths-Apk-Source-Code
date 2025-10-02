package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@UnstableApi
/* loaded from: classes2.dex */
public final class LoadEventInfo {
    public static final AtomicLong b = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final Map f3125a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoadEventInfo(long j, DataSpec dataSpec) {
        this(j, Collections.EMPTY_MAP);
        Uri uri = dataSpec.f2957a;
    }

    public LoadEventInfo(long j, Map map) {
        this.f3125a = map;
    }
}
