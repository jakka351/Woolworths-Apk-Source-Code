package au.com.woolworths.shop.lists.ui.details.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.shop.lists.ui.details.models.ListDetails;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/lists/ui/details/ui/ListDetailsContract;", "", "ViewState", "Actions", "BottomSheetViewState", "Companion", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ListDetailsContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/lists/ui/details/ui/ListDetailsContract$Actions;", "", "ShowSnackbar", "Lau/com/woolworths/shop/lists/ui/details/ui/ListDetailsContract$Actions$ShowSnackbar;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/details/ui/ListDetailsContract$Actions$ShowSnackbar;", "Lau/com/woolworths/shop/lists/ui/details/ui/ListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackbar extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ResText f12316a;

            public ShowSnackbar(ResText resText) {
                this.f12316a = resText;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowSnackbar) && this.f12316a.equals(((ShowSnackbar) obj).f12316a);
            }

            public final int hashCode() {
                return this.f12316a.hashCode();
            }

            public final String toString() {
                return "ShowSnackbar(text=" + this.f12316a + ")";
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/details/ui/ListDetailsContract$BottomSheetViewState;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BottomSheetViewState {
        public static final BottomSheetViewState e;
        public static final BottomSheetViewState f;
        public static final /* synthetic */ BottomSheetViewState[] g;
        public static final /* synthetic */ EnumEntries h;
        public final int d;

        static {
            BottomSheetViewState bottomSheetViewState = new BottomSheetViewState("EXPANDED", 0, 3);
            e = bottomSheetViewState;
            BottomSheetViewState bottomSheetViewState2 = new BottomSheetViewState("COLLAPSED", 1, 4);
            f = bottomSheetViewState2;
            BottomSheetViewState[] bottomSheetViewStateArr = {bottomSheetViewState, bottomSheetViewState2};
            g = bottomSheetViewStateArr;
            h = EnumEntriesKt.a(bottomSheetViewStateArr);
        }

        public BottomSheetViewState(String str, int i, int i2) {
            this.d = i2;
        }

        public static BottomSheetViewState valueOf(String str) {
            return (BottomSheetViewState) Enum.valueOf(BottomSheetViewState.class, str);
        }

        public static BottomSheetViewState[] values() {
            return (BottomSheetViewState[]) g.clone();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/details/ui/ListDetailsContract$Companion;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/details/ui/ListDetailsContract$ViewState;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final ListDetails f12317a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final float e;

        public /* synthetic */ ViewState(ListDetails listDetails) {
            this(listDetails, false, false, false, BitmapDescriptorFactory.HUE_RED);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.c(this.f12317a, viewState.f12317a) && this.b == viewState.b && this.c == viewState.c && this.d == viewState.d && Float.compare(this.e, viewState.e) == 0;
        }

        public final int hashCode() {
            ListDetails listDetails = this.f12317a;
            return Float.hashCode(this.e) + androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e((listDetails == null ? 0 : listDetails.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(listDetails=");
            sb.append(this.f12317a);
            sb.append(", displayListDetails=");
            sb.append(this.b);
            sb.append(", forceHidden=");
            au.com.woolworths.android.onesite.a.D(sb, this.c, ", isLoading=", this.d, ", chevronRotation=");
            return android.support.v4.media.session.a.j(this.e, ")", sb);
        }

        public ViewState(ListDetails listDetails, boolean z, boolean z2, boolean z3, float f) {
            this.f12317a = listDetails;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = f;
        }
    }
}
