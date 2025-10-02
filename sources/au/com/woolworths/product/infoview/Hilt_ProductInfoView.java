package au.com.woolworths.product.infoview;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;

/* loaded from: classes4.dex */
public abstract class Hilt_ProductInfoView extends ConstraintLayout implements GeneratedComponentManagerHolder {
    public ViewComponentManager d;
    public final boolean e;

    public Hilt_ProductInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode() || this.e) {
            return;
        }
        this.e = true;
        ((ProductInfoView_GeneratedInjector) t3()).d((ProductInfoView) this);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object t3() {
        if (this.d == null) {
            this.d = new ViewComponentManager(this);
        }
        return this.d.t3();
    }
}
