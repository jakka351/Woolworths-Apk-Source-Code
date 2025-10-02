package au.com.woolworths.feature.shop.contentpage.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.feature.shop.contentpage.data.SnackBarActionEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/data/SnackbarContent;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SnackbarContent {

    /* renamed from: a, reason: collision with root package name */
    public final Text f7024a;
    public final String b;
    public final SnackBarActionEvent c;

    public SnackbarContent(Text text, String str, SnackBarActionEvent.OnShoppingListViewClick onShoppingListViewClick) {
        this.f7024a = text;
        this.b = str;
        this.c = onShoppingListViewClick;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SnackbarContent)) {
            return false;
        }
        SnackbarContent snackbarContent = (SnackbarContent) obj;
        return Intrinsics.c(this.f7024a, snackbarContent.f7024a) && Intrinsics.c(this.b, snackbarContent.b) && Intrinsics.c(this.c, snackbarContent.c);
    }

    public final int hashCode() {
        int iHashCode = this.f7024a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        SnackBarActionEvent snackBarActionEvent = this.c;
        return iHashCode2 + (snackBarActionEvent != null ? snackBarActionEvent.hashCode() : 0);
    }

    public final String toString() {
        return "SnackbarContent(message=" + this.f7024a + ", actionLabel=" + this.b + ", snackBarActionEvent=" + this.c + ")";
    }
}
