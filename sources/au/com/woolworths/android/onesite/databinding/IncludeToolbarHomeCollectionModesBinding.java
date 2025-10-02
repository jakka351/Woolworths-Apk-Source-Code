package au.com.woolworths.android.onesite.databinding;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.main.MainContract;
import au.com.woolworths.android.onesite.modules.main.MainViewModel;
import au.com.woolworths.base.shopapp.modules.collectionmode.data.CollectionModeLabel;
import com.google.android.material.chip.Chip;

/* loaded from: classes3.dex */
public abstract class IncludeToolbarHomeCollectionModesBinding extends ViewDataBinding {
    public final HorizontalScrollView A;
    public final Chip B;
    public final Chip C;
    public final Chip D;
    public final TextView E;
    public final Toolbar F;
    public String G;
    public Integer H;
    public MainContract.ModeChipsConfiguration I;
    public Text J;
    public CollectionModeLabel K;
    public MainViewModel L;
    public final TextView y;
    public final Chip z;

    public IncludeToolbarHomeCollectionModesBinding(DataBindingComponent dataBindingComponent, View view, TextView textView, Chip chip, HorizontalScrollView horizontalScrollView, Chip chip2, Chip chip3, Chip chip4, TextView textView2, Toolbar toolbar) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = chip;
        this.A = horizontalScrollView;
        this.B = chip2;
        this.C = chip3;
        this.D = chip4;
        this.E = textView2;
        this.F = toolbar;
    }

    public abstract void L(CollectionModeLabel collectionModeLabel);

    public abstract void M(Text text);

    public abstract void N(MainViewModel mainViewModel);

    public abstract void O(MainContract.ModeChipsConfiguration modeChipsConfiguration);

    public abstract void P(Integer num);

    public abstract void Q(String str);
}
