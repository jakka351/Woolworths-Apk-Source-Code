package au.com.woolworths.feature.rewards.card.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeDownloadableAssetBinding;
import au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundsViewModel;
import au.com.woolworths.views.unlockslider.UnlockSlider;

/* loaded from: classes3.dex */
public abstract class FragmentUnlockChristmasFundsBottomSheetBinding extends ViewDataBinding {
    public static final /* synthetic */ int J = 0;
    public final IncludeDownloadableAssetBinding A;
    public final TextView B;
    public final Space C;
    public final TextView D;
    public final Button E;
    public final FrameLayout F;
    public final UnlockSlider G;
    public final ImageView H;
    public UnlockChristmasFundsViewModel I;
    public final Button y;
    public final Button z;

    public FragmentUnlockChristmasFundsBottomSheetBinding(DataBindingComponent dataBindingComponent, View view, Button button, Button button2, IncludeDownloadableAssetBinding includeDownloadableAssetBinding, TextView textView, Space space, TextView textView2, Button button3, FrameLayout frameLayout, UnlockSlider unlockSlider, ImageView imageView) {
        super(dataBindingComponent, view, 2);
        this.y = button;
        this.z = button2;
        this.A = includeDownloadableAssetBinding;
        this.B = textView;
        this.C = space;
        this.D = textView2;
        this.E = button3;
        this.F = frameLayout;
        this.G = unlockSlider;
        this.H = imageView;
    }

    public abstract void L(UnlockChristmasFundsViewModel unlockChristmasFundsViewModel);
}
