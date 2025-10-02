package au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/terms/TermItemUiModel;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TermItemUiModel {

    /* renamed from: a, reason: collision with root package name */
    public final String f10869a;
    public final List b;
    public final boolean c;

    public TermItemUiModel(String content, boolean z, List links) {
        Intrinsics.h(content, "content");
        Intrinsics.h(links, "links");
        this.f10869a = content;
        this.b = links;
        this.c = z;
    }

    public static TermItemUiModel a(TermItemUiModel termItemUiModel, boolean z) {
        String content = termItemUiModel.f10869a;
        List links = termItemUiModel.b;
        termItemUiModel.getClass();
        Intrinsics.h(content, "content");
        Intrinsics.h(links, "links");
        return new TermItemUiModel(content, z, links);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TermItemUiModel)) {
            return false;
        }
        TermItemUiModel termItemUiModel = (TermItemUiModel) obj;
        return Intrinsics.c(this.f10869a, termItemUiModel.f10869a) && Intrinsics.c(this.b, termItemUiModel.b) && this.c == termItemUiModel.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + b.d(this.f10869a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return a.k(")", au.com.woolworths.android.onesite.a.s("TermItemUiModel(content=", this.f10869a, ", links=", ", checked=", this.b), this.c);
    }
}
