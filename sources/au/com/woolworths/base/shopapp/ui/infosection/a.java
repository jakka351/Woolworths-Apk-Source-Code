package au.com.woolworths.base.shopapp.ui.infosection;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.View;
import au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements DialogInterface.OnShowListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4631a;
    public final /* synthetic */ BottomSheetDialogFragment b;

    public /* synthetic */ a(BottomSheetDialogFragment bottomSheetDialogFragment, int i) {
        this.f4631a = i;
        this.b = bottomSheetDialogFragment;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) throws Resources.NotFoundException {
        View viewFindViewById;
        switch (this.f4631a) {
            case 0:
                ((InfoSectionFragment) this.b).getClass();
                BottomSheetDialog bottomSheetDialog = dialogInterface instanceof BottomSheetDialog ? (BottomSheetDialog) dialogInterface : null;
                if (bottomSheetDialog != null && (viewFindViewById = bottomSheetDialog.findViewById(R.id.design_bottom_sheet)) != null) {
                    BottomSheetBehavior bottomSheetBehaviorF = BottomSheetBehavior.F(viewFindViewById);
                    bottomSheetBehaviorF.M = true;
                    bottomSheetBehaviorF.f(3);
                    break;
                }
                break;
            default:
                BaseBottomSheetFragment baseBottomSheetFragment = (BaseBottomSheetFragment) this.b;
                if (baseBottomSheetFragment.isAdded()) {
                    Intrinsics.f(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                    View viewFindViewById2 = ((BottomSheetDialog) dialogInterface).findViewById(R.id.design_bottom_sheet);
                    if (viewFindViewById2 != null) {
                        if (viewFindViewById2.getHeight() > baseBottomSheetFragment.requireActivity().getResources().getDisplayMetrics().heightPixels / 2) {
                            BottomSheetBehavior.F(viewFindViewById2).f(3);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
