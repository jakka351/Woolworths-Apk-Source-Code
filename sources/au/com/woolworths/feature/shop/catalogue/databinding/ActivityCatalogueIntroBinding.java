package au.com.woolworths.feature.shop.catalogue.databinding;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.catalogue.intro.CatalogueIntroViewModel;

/* loaded from: classes3.dex */
public abstract class ActivityCatalogueIntroBinding extends ViewDataBinding {
    public CatalogueIntroViewModel A;
    public final Button y;
    public final Toolbar z;

    public ActivityCatalogueIntroBinding(DataBindingComponent dataBindingComponent, View view, Button button, Toolbar toolbar) {
        super(dataBindingComponent, view, 0);
        this.y = button;
        this.z = toolbar;
    }

    public abstract void L(CatalogueIntroViewModel catalogueIntroViewModel);
}
