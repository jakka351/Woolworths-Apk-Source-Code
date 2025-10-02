package au.com.woolworths.feature.shop.weblink;

import au.com.woolworths.feature.shop.weblink.model.Cookie;
import au.com.woolworths.feature.shop.weblink.model.WebLink;
import au.com.woolworths.shop.weblink.ShopMagicLinksQuery;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"web-link_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class WebLinkRepositoryKt {
    public static final WebLink a(ShopMagicLinksQuery.MagicLink magicLink) {
        String str = magicLink.f12948a;
        String str2 = magicLink.b;
        ArrayList<ShopMagicLinksQuery.Cooky> arrayList = magicLink.c;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        for (ShopMagicLinksQuery.Cooky cooky : arrayList) {
            Intrinsics.h(cooky, "<this>");
            arrayList2.add(new Cookie(cooky.f12945a, cooky.b, cooky.c, cooky.d, cooky.e, cooky.f, cooky.g));
        }
        ArrayList<ShopMagicLinksQuery.Header> arrayList3 = magicLink.d;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.s(arrayList3, 10));
        for (ShopMagicLinksQuery.Header header : arrayList3) {
            arrayList4.add(new Pair(header.f12947a, header.b));
        }
        return new WebLink(str, str2, MapsKt.p(arrayList4), arrayList2);
    }
}
