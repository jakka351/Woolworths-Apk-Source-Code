package au.com.woolworths.shop.lists.ui.details.ui;

import androidx.compose.ui.layout.LayoutCoordinates;
import au.com.woolworths.shop.lists.ui.details.ui.ListDetailsContract;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ListDetailsView e;

    public /* synthetic */ b(ListDetailsView listDetailsView, int i) {
        this.d = i;
        this.e = listDetailsView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                ListDetailsView.a(this.e, (ListDetailsContract.ViewState) obj);
                return Unit.f24250a;
            default:
                LayoutCoordinates coordinates = (LayoutCoordinates) obj;
                Intrinsics.h(coordinates, "coordinates");
                ListDetailsView listDetailsView = this.e;
                ListDetailsViewListener hostViewListener = listDetailsView.getHostViewListener();
                if (hostViewListener != null) {
                    BottomSheetBehavior bottomSheetBehavior = listDetailsView.k;
                    if (bottomSheetBehavior == null) {
                        Intrinsics.p("bottomSheetBehavior");
                        throw null;
                    }
                    hostViewListener.q(bottomSheetBehavior.i ? -1 : bottomSheetBehavior.h);
                }
                return Unit.f24250a;
        }
    }
}
