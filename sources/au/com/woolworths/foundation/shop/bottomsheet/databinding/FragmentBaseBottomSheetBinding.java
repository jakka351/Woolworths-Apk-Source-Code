package au.com.woolworths.foundation.shop.bottomsheet.databinding;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetViewModel;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* loaded from: classes4.dex */
public abstract class FragmentBaseBottomSheetBinding extends ViewDataBinding {
    public static final /* synthetic */ int C = 0;
    public final ImageView A;
    public BaseBottomSheetViewModel B;
    public final ImageButton y;
    public final EpoxyRecyclerView z;

    public FragmentBaseBottomSheetBinding(DataBindingComponent dataBindingComponent, View view, ImageButton imageButton, EpoxyRecyclerView epoxyRecyclerView, ImageView imageView) {
        super(dataBindingComponent, view, 1);
        this.y = imageButton;
        this.z = epoxyRecyclerView;
        this.A = imageView;
    }

    public abstract void L(BaseBottomSheetViewModel baseBottomSheetViewModel);
}
