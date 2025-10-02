package au.com.woolworths.android.onesite.legacy.databinding;

import android.view.View;
import android.widget.CheckedTextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.base.shopapp.modules.collectionmode.data.Condition;
import au.com.woolworths.views.CheckableConstraintLayout;

/* loaded from: classes3.dex */
public abstract class EpoxyItemCollectionModeVariantConditionBinding extends ViewDataBinding {
    public Condition A;
    public Boolean B;
    public Boolean C;
    public final CheckableConstraintLayout y;
    public final CheckedTextView z;

    public EpoxyItemCollectionModeVariantConditionBinding(DataBindingComponent dataBindingComponent, View view, CheckableConstraintLayout checkableConstraintLayout, CheckedTextView checkedTextView) {
        super(dataBindingComponent, view, 0);
        this.y = checkableConstraintLayout;
        this.z = checkedTextView;
    }
}
