package au.com.woolworths.rewards.base.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeDownloadableAssetBinding;
import au.com.woolworths.rewards.coachmark.RichCoachMarkSettings;

/* loaded from: classes4.dex */
public abstract class RewardsRichCoachMarkWithImageBinding extends ViewDataBinding {
    public final TextView A;
    public final IncludeDownloadableAssetBinding B;
    public final Button C;
    public final Button D;
    public final TextView E;
    public RichCoachMarkSettings F;
    public Boolean G;
    public final ImageButton y;
    public final ConstraintLayout z;

    public RewardsRichCoachMarkWithImageBinding(DataBindingComponent dataBindingComponent, View view, ImageButton imageButton, ConstraintLayout constraintLayout, TextView textView, IncludeDownloadableAssetBinding includeDownloadableAssetBinding, Button button, Button button2, TextView textView2) {
        super(dataBindingComponent, view, 1);
        this.y = imageButton;
        this.z = constraintLayout;
        this.A = textView;
        this.B = includeDownloadableAssetBinding;
        this.C = button;
        this.D = button2;
        this.E = textView2;
    }
}
