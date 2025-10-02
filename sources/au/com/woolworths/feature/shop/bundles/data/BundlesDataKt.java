package au.com.woolworths.feature.shop.bundles.data;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"bundles_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BundlesDataKt {
    public static final ArrayList a(List list) {
        Intrinsics.h(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof BundleProductCard) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final int b(Bundle bundle) {
        Intrinsics.h(bundle, "<this>");
        return bundle.c.d - 1;
    }
}
