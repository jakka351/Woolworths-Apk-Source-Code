package au.com.woolworths.foundation.advertising.data.google;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"advertising-data_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class GoogleAdManagerRepositoryKt {
    public static final Map a(NativeCustomFormatAd nativeCustomFormatAd) {
        List<String> availableAssetNames = nativeCustomFormatAd.getAvailableAssetNames();
        if (availableAssetNames == null) {
            Map map = Collections.EMPTY_MAP;
            Intrinsics.g(map, "emptyMap(...)");
            return map;
        }
        List<String> list = availableAssetNames;
        int iH = MapsKt.h(CollectionsKt.s(list, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        for (String str : list) {
            linkedHashMap.put(str, nativeCustomFormatAd.getText(str));
        }
        return linkedHashMap;
    }
}
