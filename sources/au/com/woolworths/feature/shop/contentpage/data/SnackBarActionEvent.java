package au.com.woolworths.feature.shop.contentpage.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/data/SnackBarActionEvent;", "", "OnShoppingListViewClick", "Lau/com/woolworths/feature/shop/contentpage/data/SnackBarActionEvent$OnShoppingListViewClick;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class SnackBarActionEvent {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/contentpage/data/SnackBarActionEvent$OnShoppingListViewClick;", "Lau/com/woolworths/feature/shop/contentpage/data/SnackBarActionEvent;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnShoppingListViewClick extends SnackBarActionEvent {

        /* renamed from: a, reason: collision with root package name */
        public final String f7023a;

        public OnShoppingListViewClick(String id) {
            Intrinsics.h(id, "id");
            this.f7023a = id;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnShoppingListViewClick) && Intrinsics.c(this.f7023a, ((OnShoppingListViewClick) obj).f7023a);
        }

        public final int hashCode() {
            return this.f7023a.hashCode();
        }

        public final String toString() {
            return a.h("OnShoppingListViewClick(id=", this.f7023a, ")");
        }
    }
}
