package com.google.android.material.sidesheet;

import android.content.Context;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.woolworths.R;

/* loaded from: classes6.dex */
public class SideSheetDialog extends SheetDialog<SideSheetCallback> {
    public SideSheetDialog(@NonNull Context context) {
        TypedValue typedValue = new TypedValue();
        super(context, context.getTheme().resolveAttribute(R.attr.sideSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Material3_Light_SideSheetDialog);
        this.l = true;
        this.m = true;
        c().w(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.material.sidesheet.SideSheetDialog$1] */
    @Override // com.google.android.material.sidesheet.SheetDialog
    public final void e(Sheet sheet) {
        sheet.a(new SideSheetCallback() { // from class: com.google.android.material.sidesheet.SideSheetDialog.1
            @Override // com.google.android.material.sidesheet.SheetCallback
            public final void a(int i) {
                if (i == 5) {
                    SideSheetDialog.this.cancel();
                }
            }
        });
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public final Sheet g() {
        Sheet sheetG = super.g();
        if (sheetG instanceof SideSheetBehavior) {
            return (SideSheetBehavior) sheetG;
        }
        throw new IllegalStateException("The view is not associated with SideSheetBehavior");
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public final SideSheetBehavior h(FrameLayout frameLayout) {
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).f2382a;
        if (behavior instanceof SideSheetBehavior) {
            return (SideSheetBehavior) behavior;
        }
        throw new IllegalArgumentException("The view is not associated with SideSheetBehavior");
    }
}
