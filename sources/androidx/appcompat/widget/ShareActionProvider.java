package androidx.appcompat.widget;

import android.content.Context;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.view.ActionProvider;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;

/* loaded from: classes2.dex */
public class ShareActionProvider extends ActionProvider {
    public final int c;
    public final Context d;
    public final String e;

    public interface OnShareTargetSelectedListener {
    }

    public class ShareActivityChooserModelPolicy implements ActivityChooserModel.OnChooseActivityListener {
    }

    public class ShareMenuItemOnMenuItemClickListener implements MenuItem.OnMenuItemClickListener {
        public ShareMenuItemOnMenuItemClickListener() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Callback.n(menuItem);
            try {
                ShareActionProvider shareActionProvider = ShareActionProvider.this;
                ActivityChooserModel activityChooserModelB = ActivityChooserModel.b(shareActionProvider.d, shareActionProvider.e);
                menuItem.getItemId();
                synchronized (activityChooserModelB.f143a) {
                }
                return true;
            } finally {
                Callback.o();
            }
        }
    }

    public ShareActionProvider(Context context) {
        super(context);
        this.c = 4;
        new ShareMenuItemOnMenuItemClickListener();
        this.e = "share_history.xml";
        this.d = context;
    }

    @Override // androidx.core.view.ActionProvider
    public final View c() {
        Context context = this.d;
        ActivityChooserView activityChooserView = new ActivityChooserView(context);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(ActivityChooserModel.b(context, this.e));
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.actionModeShareDrawable, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(AppCompatResources.b(typedValue.resourceId, context));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(R.string.abc_shareactionprovider_share_with_application);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(R.string.abc_shareactionprovider_share_with);
        return activityChooserView;
    }

    @Override // androidx.core.view.ActionProvider
    public final void f(SubMenuBuilder subMenuBuilder) {
        subMenuBuilder.clear();
        String str = this.e;
        Context context = this.d;
        ActivityChooserModel activityChooserModelB = ActivityChooserModel.b(context, str);
        context.getPackageManager();
        int iD = activityChooserModelB.d();
        int iMin = Math.min(iD, this.c);
        if (iMin > 0) {
            activityChooserModelB.c(0);
            throw null;
        }
        if (iMin < iD) {
            subMenuBuilder.addSubMenu(0, iMin, iMin, context.getString(R.string.abc_activity_chooser_view_see_all));
            if (iD <= 0) {
                return;
            }
            activityChooserModelB.c(0);
            throw null;
        }
    }
}
