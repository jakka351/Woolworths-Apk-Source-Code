package au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.clickablerect;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/clickablerect/ClickableRect;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ClickableRect {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f8043a;
    public final String b;

    public ClickableRect(Rect rect, String str) {
        this.f8043a = rect;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableRect)) {
            return false;
        }
        ClickableRect clickableRect = (ClickableRect) obj;
        return Intrinsics.c(this.f8043a, clickableRect.f8043a) && Intrinsics.c(this.b, clickableRect.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8043a.hashCode() * 31);
    }

    public final String toString() {
        return "ClickableRect(coordinates=" + this.f8043a + ", url=" + this.b + ")";
    }
}
