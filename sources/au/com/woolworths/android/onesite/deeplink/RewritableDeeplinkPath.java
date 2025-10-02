package au.com.woolworths.android.onesite.deeplink;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/deeplink/RewritableDeeplinkPath;", "", "Companion", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public abstract class RewritableDeeplinkPath {
    public static final Companion d;
    public static final LinkedHashMap e;
    public static final /* synthetic */ RewritableDeeplinkPath[] f;
    public static final /* synthetic */ EnumEntries g;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/android/onesite/deeplink/RewritableDeeplinkPath$Companion;", "", "", "", "Lau/com/woolworths/android/onesite/deeplink/RewritableDeeplinkPath;", "map", "Ljava/util/Map;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/android/onesite/deeplink/RewritableDeeplinkPath.PRODUCT_LIST", "Lau/com/woolworths/android/onesite/deeplink/RewritableDeeplinkPath;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PRODUCT_LIST extends RewritableDeeplinkPath {
        @Override // au.com.woolworths.android.onesite.deeplink.RewritableDeeplinkPath
        public final List a() {
            return CollectionsKt.G0(ProductListPathPlaceholders.e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        RewritableDeeplinkPath[] rewritableDeeplinkPathArr = {new PRODUCT_LIST("PRODUCT_LIST", 0)};
        f = rewritableDeeplinkPathArr;
        EnumEntries enumEntriesA = EnumEntriesKt.a(rewritableDeeplinkPathArr);
        g = enumEntriesA;
        d = new Companion();
        int iH = MapsKt.h(CollectionsKt.s(enumEntriesA, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH < 16 ? 16 : iH);
        Iterator it = ((AbstractList) enumEntriesA).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            ((RewritableDeeplinkPath) next).getClass();
            linkedHashMap.put("products", next);
        }
        e = linkedHashMap;
    }

    public static RewritableDeeplinkPath valueOf(String str) {
        return (RewritableDeeplinkPath) Enum.valueOf(RewritableDeeplinkPath.class, str);
    }

    public static RewritableDeeplinkPath[] values() {
        return (RewritableDeeplinkPath[]) f.clone();
    }

    public abstract List a();
}
