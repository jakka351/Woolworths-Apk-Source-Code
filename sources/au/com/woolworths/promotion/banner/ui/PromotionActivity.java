package au.com.woolworths.promotion.banner.ui;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.promotion.banner.databinding.ActivityPromotionBinding;
import au.com.woolworths.promotion.banner.ui.PromotionContract;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/promotion/banner/ui/PromotionActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "promotion-banner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PromotionActivity extends Hilt_PromotionActivity {
    public static final /* synthetic */ int z = 0;
    public final ViewModelLazy x = new ViewModelLazy(Reflection.f24268a.b(PromotionViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.promotion.banner.ui.PromotionActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.promotion.banner.ui.PromotionActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.promotion.banner.ui.PromotionActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public ActivityPromotionBinding y;

    @Override // au.com.woolworths.promotion.banner.ui.Hilt_PromotionActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Activities.Promotion.Extras extras;
        super.onCreate(bundle);
        ActivityPromotionBinding activityPromotionBinding = (ActivityPromotionBinding) DataBindingUtil.d(this, R.layout.activity_promotion);
        activityPromotionBinding.D(this);
        this.y = activityPromotionBinding;
        setSupportActionBar(activityPromotionBinding.y);
        Bundle extras2 = getIntent().getExtras();
        if (extras2 == null || (extras = (Activities.Promotion.Extras) extras2.getParcelable("extra_promo")) == null) {
            throw new IllegalStateException("PromotionActivity extras is required.");
        }
        PromotionViewModel promotionViewModel = (PromotionViewModel) this.x.getD();
        String title = extras.d;
        String content = extras.e;
        Intrinsics.h(title, "title");
        Intrinsics.h(content, "content");
        promotionViewModel.e.setValue(new PromotionContract.ViewState(title, content));
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new PromotionActivity$observeViewState$1(this, null), 3);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean zOnOptionsItemSelected;
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            if (item.getItemId() == 16908332) {
                onBackPressed();
                zOnOptionsItemSelected = true;
            } else {
                zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            }
            Callback.q();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }
}
