package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes6.dex */
final class LeftSheetDelegate extends SheetDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final SideSheetBehavior f14646a;

    public LeftSheetDelegate(SideSheetBehavior sideSheetBehavior) {
        this.f14646a = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final float b(int i) {
        float fE = e();
        return (i - fE) / (d() - fE);
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int d() {
        SideSheetBehavior sideSheetBehavior = this.f14646a;
        return Math.max(0, sideSheetBehavior.q + sideSheetBehavior.r);
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int e() {
        SideSheetBehavior sideSheetBehavior = this.f14646a;
        return (-sideSheetBehavior.o) - sideSheetBehavior.r;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int f() {
        return this.f14646a.r;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int g() {
        return -this.f14646a.o;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int h(View view) {
        return view.getRight() + this.f14646a.r;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int i(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int j() {
        return 1;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final boolean k(float f) {
        return f > BitmapDescriptorFactory.HUE_RED;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final boolean l(View view) {
        return view.getRight() < (d() - e()) / 2;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final boolean m(float f, float f2) {
        return Math.abs(f) > Math.abs(f2) && Math.abs(f) > ((float) 500);
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final boolean n(View view, float f) {
        float left = view.getLeft();
        SideSheetBehavior sideSheetBehavior = this.f14646a;
        float fAbs = Math.abs((f * sideSheetBehavior.n) + left);
        sideSheetBehavior.getClass();
        return fAbs > 0.5f;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.leftMargin = i;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        if (i <= this.f14646a.p) {
            marginLayoutParams.leftMargin = i2;
        }
    }
}
