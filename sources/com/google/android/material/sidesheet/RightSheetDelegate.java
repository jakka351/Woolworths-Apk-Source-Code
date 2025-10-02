package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes6.dex */
final class RightSheetDelegate extends SheetDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final SideSheetBehavior f14647a;

    public RightSheetDelegate(SideSheetBehavior sideSheetBehavior) {
        this.f14647a = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final float b(int i) {
        float f = this.f14647a.p;
        return (f - i) / (f - d());
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int d() {
        SideSheetBehavior sideSheetBehavior = this.f14647a;
        return Math.max(0, (sideSheetBehavior.p - sideSheetBehavior.o) - sideSheetBehavior.r);
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int e() {
        return this.f14647a.p;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int f() {
        return this.f14647a.p;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int g() {
        return d();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int h(View view) {
        return view.getLeft() - this.f14647a.r;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int i(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int j() {
        return 0;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final boolean k(float f) {
        return f < BitmapDescriptorFactory.HUE_RED;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final boolean l(View view) {
        return view.getLeft() > (this.f14647a.p + d()) / 2;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final boolean m(float f, float f2) {
        return Math.abs(f) > Math.abs(f2) && Math.abs(f) > ((float) 500);
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final boolean n(View view, float f) {
        float right = view.getRight();
        SideSheetBehavior sideSheetBehavior = this.f14647a;
        float fAbs = Math.abs((f * sideSheetBehavior.n) + right);
        sideSheetBehavior.getClass();
        return fAbs > 0.5f;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.rightMargin = i;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int i3 = this.f14647a.p;
        if (i <= i3) {
            marginLayoutParams.rightMargin = i3 - i;
        }
    }
}
