package au.com.woolworths.feature.rewards.offers.spinsurprise;

import au.com.woolworths.feature.rewards.offers.spinsurprise.data.SpinSurpriseLinks;
import com.woolworths.rewards.offers.spinsurprise.SpinSurpriseLinksQuery;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SpinSurpriseLinksQuerySpinSurpriseLinksExtKt {
    public static final SpinSurpriseLinks a(SpinSurpriseLinksQuery.SpinSurpriseLinks spinSurpriseLinks) {
        Intrinsics.h(spinSurpriseLinks, "<this>");
        String str = spinSurpriseLinks.f21053a;
        ArrayList arrayList = spinSurpriseLinks.b;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) it.next());
        }
        return new SpinSurpriseLinks(str, arrayList2);
    }
}
