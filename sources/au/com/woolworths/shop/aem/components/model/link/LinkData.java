package au.com.woolworths.shop.aem.components.model.link;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.aem.components.model.GenericPageFeedItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/link/LinkData;", "Lau/com/woolworths/shop/aem/components/model/GenericPageFeedItem;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LinkData implements GenericPageFeedItem {

    /* renamed from: a, reason: collision with root package name */
    public final String f10169a;
    public final ActionData b;
    public final TextWithAltData c;

    public LinkData(String str, ActionData linkAction, TextWithAltData linkTextWithAlt) {
        Intrinsics.h(linkAction, "linkAction");
        Intrinsics.h(linkTextWithAlt, "linkTextWithAlt");
        this.f10169a = str;
        this.b = linkAction;
        this.c = linkTextWithAlt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkData)) {
            return false;
        }
        LinkData linkData = (LinkData) obj;
        return Intrinsics.c(this.f10169a, linkData.f10169a) && Intrinsics.c(this.b, linkData.b) && Intrinsics.c(this.c, linkData.c);
    }

    public final int hashCode() {
        String str = this.f10169a;
        return (this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31;
    }

    public final String toString() {
        return "LinkData(linkId=" + this.f10169a + ", linkAction=" + this.b + ", linkTextWithAlt=" + this.c + ", analytics=null)";
    }
}
