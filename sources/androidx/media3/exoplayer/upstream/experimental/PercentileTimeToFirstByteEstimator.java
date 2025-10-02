package androidx.media3.exoplayer.upstream.experimental;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator;
import java.util.LinkedHashMap;
import java.util.Map;

@UnstableApi
/* loaded from: classes2.dex */
public final class PercentileTimeToFirstByteEstimator implements TimeToFirstByteEstimator {

    public static class FixedSizeLinkedHashMap<K, V> extends LinkedHashMap<K, V> {
        public final int d = 10;

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry entry) {
            return size() > this.d;
        }
    }
}
