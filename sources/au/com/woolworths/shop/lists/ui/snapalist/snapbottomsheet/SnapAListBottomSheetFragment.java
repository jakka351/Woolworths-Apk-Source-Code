package au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultCaller;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.constraintlayout.core.state.a;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentManager;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.lists.SnapAListAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.extensions.DialogFragmentExtKt;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet.SnapAListBottomSheetFragment;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.reflect.KFunction;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/shop/lists/ui/snapalist/snapbottomsheet/SnapAListBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "BottomSheetHost", "Extras", "Companion", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class SnapAListBottomSheetFragment extends Hilt_SnapAListBottomSheetFragment {
    public final Lazy i;
    public final Lazy j;
    public AnalyticsManager k;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/lists/ui/snapalist/snapbottomsheet/SnapAListBottomSheetFragment$BottomSheetHost;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface BottomSheetHost {
        void l(SnapAListMenuOption snapAListMenuOption);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/lists/ui/snapalist/snapbottomsheet/SnapAListBottomSheetFragment$Companion;", "", "", "TAG", "Ljava/lang/String;", "SNAP_A_LIST_BOTTOM_SHEET_FRAGMENT_EXTRAS", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static void a(FragmentManager fragmentManager, Extras extras) {
            if (fragmentManager != null) {
                SnapAListBottomSheetFragment snapAListBottomSheetFragment = new SnapAListBottomSheetFragment();
                Bundle bundle = new Bundle();
                bundle.putParcelable("SNAP_A_LIST_BOTTOM_SHEET_FRAGMENT_EXTRAS", extras);
                snapAListBottomSheetFragment.setArguments(bundle);
                DialogFragmentExtKt.a(snapAListBottomSheetFragment, fragmentManager, "SnapAListBottomSheetFragment");
            }
        }
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/snapalist/snapbottomsheet/SnapAListBottomSheetFragment$Extras;", "Landroid/os/Parcelable;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Extras implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Extras> CREATOR = new Creator();
        public final SnapAListBottomSheetType d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Extras> {
            @Override // android.os.Parcelable.Creator
            public final Extras createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Extras(SnapAListBottomSheetType.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Extras[] newArray(int i) {
                return new Extras[i];
            }
        }

        public Extras(SnapAListBottomSheetType type) {
            Intrinsics.h(type, "type");
            this.d = type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Extras) && this.d == ((Extras) obj).d;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "Extras(type=" + this.d + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d.name());
        }
    }

    public SnapAListBottomSheetFragment() {
        final int i = 0;
        this.i = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet.a
            public final /* synthetic */ SnapAListBottomSheetFragment e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        SnapAListBottomSheetFragment snapAListBottomSheetFragment = this.e;
                        ActivityResultCaller parentFragment = snapAListBottomSheetFragment.getParentFragment();
                        SnapAListBottomSheetFragment.BottomSheetHost bottomSheetHost = parentFragment instanceof SnapAListBottomSheetFragment.BottomSheetHost ? (SnapAListBottomSheetFragment.BottomSheetHost) parentFragment : null;
                        if (bottomSheetHost != null) {
                            return bottomSheetHost;
                        }
                        KeyEventDispatcher.Component activity = snapAListBottomSheetFragment.getActivity();
                        Intrinsics.f(activity, "null cannot be cast to non-null type au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet.SnapAListBottomSheetFragment.BottomSheetHost");
                        return (SnapAListBottomSheetFragment.BottomSheetHost) activity;
                    default:
                        Bundle arguments = this.e.getArguments();
                        SnapAListBottomSheetFragment.Extras extras = arguments != null ? (SnapAListBottomSheetFragment.Extras) arguments.getParcelable("SNAP_A_LIST_BOTTOM_SHEET_FRAGMENT_EXTRAS") : null;
                        if (extras != null) {
                            return extras;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                }
            }
        });
        final int i2 = 1;
        this.j = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet.a
            public final /* synthetic */ SnapAListBottomSheetFragment e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        SnapAListBottomSheetFragment snapAListBottomSheetFragment = this.e;
                        ActivityResultCaller parentFragment = snapAListBottomSheetFragment.getParentFragment();
                        SnapAListBottomSheetFragment.BottomSheetHost bottomSheetHost = parentFragment instanceof SnapAListBottomSheetFragment.BottomSheetHost ? (SnapAListBottomSheetFragment.BottomSheetHost) parentFragment : null;
                        if (bottomSheetHost != null) {
                            return bottomSheetHost;
                        }
                        KeyEventDispatcher.Component activity = snapAListBottomSheetFragment.getActivity();
                        Intrinsics.f(activity, "null cannot be cast to non-null type au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet.SnapAListBottomSheetFragment.BottomSheetHost");
                        return (SnapAListBottomSheetFragment.BottomSheetHost) activity;
                    default:
                        Bundle arguments = this.e.getArguments();
                        SnapAListBottomSheetFragment.Extras extras = arguments != null ? (SnapAListBottomSheetFragment.Extras) arguments.getParcelable("SNAP_A_LIST_BOTTOM_SHEET_FRAGMENT_EXTRAS") : null;
                        if (extras != null) {
                            return extras;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        Context contextRequireContext = requireContext();
        Intrinsics.g(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.f1985a);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet.SnapAListBottomSheetFragment$setContent$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final SnapAListBottomSheetFragment snapAListBottomSheetFragment = this.d;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-983651775, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet.SnapAListBottomSheetFragment$setContent$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                SnapAListBottomSheetFragment snapAListBottomSheetFragment2 = snapAListBottomSheetFragment;
                                SnapAListBottomSheetType snapAListBottomSheetType = ((SnapAListBottomSheetFragment.Extras) snapAListBottomSheetFragment2.j.getD()).d;
                                composer2.o(5004770);
                                boolean zI = composer2.I(snapAListBottomSheetFragment2);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    SnapAListBottomSheetFragment$setContent$1$1$1$1 snapAListBottomSheetFragment$setContent$1$1$1$1 = new SnapAListBottomSheetFragment$setContent$1$1$1$1(1, snapAListBottomSheetFragment2, SnapAListBottomSheetFragment.class, "onSelected", "onSelected(Lau/com/woolworths/shop/lists/ui/snapalist/snapbottomsheet/SnapAListMenuOption;)V", 0);
                                    composer2.A(snapAListBottomSheetFragment$setContent$1$1$1$1);
                                    objG = snapAListBottomSheetFragment$setContent$1$1$1$1;
                                }
                                composer2.l();
                                SnapAListBottomSheetScreenKt.c(snapAListBottomSheetType, (Function1) ((KFunction) objG), composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -711372059));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        AnalyticsManager analyticsManager = this.k;
        if (analyticsManager == null) {
            Intrinsics.p("analyticsManager");
            throw null;
        }
        SnapAListAnalytics.ListDetails.Action.Companion companion = SnapAListAnalytics.ListDetails.Action.d;
        String string = getString(R.string.shop_lists_snap_menu_title);
        Intrinsics.g(string, "getString(...)");
        final String lowerCase = string.toLowerCase(Locale.ROOT);
        Intrinsics.g(lowerCase, "toLowerCase(...)");
        companion.getClass();
        analyticsManager.g(new Event(lowerCase) { // from class: au.com.woolworths.analytics.supers.lists.SnapAListAnalytics$ListDetails$Action$Companion$bottomSheetImpression$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                spreadBuilder.b(SnapAListAnalytics.ListDetails.e);
                spreadBuilder.a(new Pair("event.Category", "snap a list"));
                spreadBuilder.a(new Pair("event.Action", "bottomsheet_impression"));
                a.y("event.Label", lowerCase, spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "snap_a_list_bottomsheet_impression";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "snap_a_list_bottomsheet_impression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
    }
}
