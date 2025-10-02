package kotlinx.serialization.json.internal;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/json/internal/DescriptorSchemaCache;", "", "Key", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class DescriptorSchemaCache {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f24858a = new ConcurrentHashMap(16);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Key<T> {
    }

    public final Object a(SerialDescriptor descriptor, Key key) {
        Intrinsics.h(descriptor, "descriptor");
        Map map = (Map) this.f24858a.get(descriptor);
        Object obj = map != null ? map.get(key) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }
}
