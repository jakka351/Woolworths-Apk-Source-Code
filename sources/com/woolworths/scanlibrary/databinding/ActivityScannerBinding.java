package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woolworths.scanlibrary.util.widget.OverlayWithHoleImageView;
import com.woolworths.scanlibrary.util.widget.WeightedListView;

/* loaded from: classes7.dex */
public abstract class ActivityScannerBinding extends ViewDataBinding {
    public static final /* synthetic */ int H = 0;
    public final ImageView A;
    public final ProgressBar B;
    public final View C;
    public final RelativeLayout D;
    public final Toolbar E;
    public final TextView F;
    public final WeightedListView G;
    public final OverlayWithHoleImageView y;
    public final CoordinatorLayout z;

    public ActivityScannerBinding(DataBindingComponent dataBindingComponent, View view, OverlayWithHoleImageView overlayWithHoleImageView, CoordinatorLayout coordinatorLayout, ImageView imageView, ProgressBar progressBar, View view2, RelativeLayout relativeLayout, Toolbar toolbar, TextView textView, WeightedListView weightedListView) {
        super(dataBindingComponent, view, 0);
        this.y = overlayWithHoleImageView;
        this.z = coordinatorLayout;
        this.A = imageView;
        this.B = progressBar;
        this.C = view2;
        this.D = relativeLayout;
        this.E = toolbar;
        this.F = textView;
        this.G = weightedListView;
    }
}
