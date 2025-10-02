package coil.memory;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import coil.EventListener;
import coil.RealImageLoader;
import coil.decode.DataSource;
import coil.intercept.Interceptor;
import coil.intercept.RealInterceptorChain;
import coil.key.Keyer;
import coil.memory.MemoryCache;
import coil.request.ImageRequest;
import coil.request.Options;
import coil.request.Parameters;
import coil.request.RequestService;
import coil.request.SuccessResult;
import coil.transform.Transformation;
import coil.util.Utils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil/memory/MemoryCacheService;", "", "Companion", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class MemoryCacheService {

    /* renamed from: a, reason: collision with root package name */
    public final RealImageLoader f13003a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil/memory/MemoryCacheService$Companion;", "", "", "TAG", "Ljava/lang/String;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public MemoryCacheService(RealImageLoader realImageLoader, RequestService requestService) {
        this.f13003a = realImageLoader;
    }

    public static SuccessResult c(Interceptor.Chain chain, ImageRequest imageRequest, MemoryCache.Key key, MemoryCache.Value value) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(imageRequest.f13017a.getResources(), value.f13002a);
        DataSource dataSource = DataSource.d;
        Map map = value.b;
        Object obj = map.get("coil#disk_cache_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("coil#is_sampled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean z = false;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Bitmap.Config[] configArr = Utils.f13033a;
        if ((chain instanceof RealInterceptorChain) && ((RealInterceptorChain) chain).g) {
            z = true;
        }
        return new SuccessResult(bitmapDrawable, imageRequest, dataSource, key, str, zBooleanValue, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00f1 A[PHI: r17 r18
  0x00f1: PHI (r17v1 coil.memory.MemoryCache$Value) = (r17v0 coil.memory.MemoryCache$Value), (r17v0 coil.memory.MemoryCache$Value), (r17v2 coil.memory.MemoryCache$Value) binds: [B:64:0x00ee, B:59:0x00e2, B:52:0x00cf] A[DONT_GENERATE, DONT_INLINE]
  0x00f1: PHI (r18v1 coil.memory.MemoryCache$Value) = (r18v0 coil.memory.MemoryCache$Value), (r18v0 coil.memory.MemoryCache$Value), (r18v2 coil.memory.MemoryCache$Value) binds: [B:64:0x00ee, B:59:0x00e2, B:52:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ff A[PHI: r17 r18
  0x00ff: PHI (r17v3 coil.memory.MemoryCache$Value) = (r17v1 coil.memory.MemoryCache$Value), (r17v1 coil.memory.MemoryCache$Value), (r17v5 coil.memory.MemoryCache$Value) binds: [B:73:0x00fd, B:69:0x00f6, B:28:0x0060] A[DONT_GENERATE, DONT_INLINE]
  0x00ff: PHI (r18v4 coil.memory.MemoryCache$Value) = (r18v1 coil.memory.MemoryCache$Value), (r18v1 coil.memory.MemoryCache$Value), (r18v6 coil.memory.MemoryCache$Value) binds: [B:73:0x00fd, B:69:0x00f6, B:28:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0104 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final coil.memory.MemoryCache.Value a(coil.request.ImageRequest r20, coil.memory.MemoryCache.Key r21, coil.size.Size r22, coil.size.Scale r23) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.memory.MemoryCacheService.a(coil.request.ImageRequest, coil.memory.MemoryCache$Key, coil.size.Size, coil.size.Scale):coil.memory.MemoryCache$Value");
    }

    public final MemoryCache.Key b(ImageRequest imageRequest, Object obj, Options options, EventListener eventListener) {
        String strA;
        Map map;
        List list = imageRequest.f;
        List list2 = this.f13003a.g.c;
        int size = list2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                strA = null;
                break;
            }
            Pair pair = (Pair) list2.get(i);
            Keyer keyer = (Keyer) pair.d;
            if (((Class) pair.e).isAssignableFrom(obj.getClass())) {
                Intrinsics.f(keyer, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
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
        Map map2 = imageRequest.x.d;
        if (map2.isEmpty()) {
            map = EmptyMap.d;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = map2.entrySet().iterator();
            while (it.hasNext()) {
                ((Parameters.Entry) ((Map.Entry) it.next()).getValue()).getClass();
            }
            map = linkedHashMap;
        }
        if (list.isEmpty() && map.isEmpty()) {
            return new MemoryCache.Key(strA, EmptyMap.d);
        }
        LinkedHashMap linkedHashMapS = MapsKt.s(map);
        if (!list.isEmpty()) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((Transformation) list.get(i2)).getClass();
                linkedHashMapS.put("coil#transformation_" + i2, null);
            }
            linkedHashMapS.put("coil#transformation_size", options.c.toString());
        }
        return new MemoryCache.Key(strA, linkedHashMapS);
    }
}
