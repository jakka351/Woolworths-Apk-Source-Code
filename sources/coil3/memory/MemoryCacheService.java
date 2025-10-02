package coil3.memory;

import coil3.EventListener;
import coil3.ExtrasKt;
import coil3.RealImageLoader;
import coil3.key.Keyer;
import coil3.memory.MemoryCache;
import coil3.request.AndroidRequestService;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import coil3.request.Options;
import coil3.size.Precision;
import coil3.size.Scale;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil3/memory/MemoryCacheService;", "", "Companion", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class MemoryCacheService {

    /* renamed from: a, reason: collision with root package name */
    public final RealImageLoader f13115a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcoil3/memory/MemoryCacheService$Companion;", "", "", "TAG", "Ljava/lang/String;", "EXTRA_SIZE", "EXTRA_IS_SAMPLED", "EXTRA_DISK_CACHE_KEY", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Scale.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Scale scale = Scale.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Precision.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Precision precision = Precision.d;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public MemoryCacheService(RealImageLoader realImageLoader, AndroidRequestService androidRequestService) {
        this.f13115a = realImageLoader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        if (r1.equals(r19.toString()) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final coil3.memory.MemoryCache.Value a(coil3.request.ImageRequest r17, coil3.memory.MemoryCache.Key r18, coil3.size.Size r19, coil3.size.Scale r20) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.memory.MemoryCacheService.a(coil3.request.ImageRequest, coil3.memory.MemoryCache$Key, coil3.size.Size, coil3.size.Scale):coil3.memory.MemoryCache$Value");
    }

    public final MemoryCache.Key b(ImageRequest imageRequest, Object obj, Options options, EventListener eventListener) {
        String strA;
        Map map = imageRequest.e;
        List list = this.f13115a.d.c;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                strA = null;
                break;
            }
            Pair pair = (Pair) list.get(i);
            Keyer keyer = (Keyer) pair.d;
            if (((KClass) pair.e).z(obj)) {
                Intrinsics.f(keyer, "null cannot be cast to non-null type coil3.key.Keyer<kotlin.Any>");
                strA = keyer.a(obj, options);
                if (strA != null) {
                    break;
                }
            }
            i++;
        }
        if (strA == null) {
            return null;
        }
        LinkedHashMap linkedHashMapS = MapsKt.s(map);
        if (!((List) ExtrasKt.a(imageRequest, ImageRequests_androidKt.f13142a)).isEmpty()) {
            linkedHashMapS.put("coil#size", options.b.toString());
        }
        return new MemoryCache.Key(strA, linkedHashMapS);
    }
}
