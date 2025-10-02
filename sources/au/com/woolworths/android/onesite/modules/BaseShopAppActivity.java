package au.com.woolworths.android.onesite.modules;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.network.ApiEventListener;
import au.com.woolworths.base.shopapp.appdata.LegacyShopAnalyticsManager;
import au.com.woolworths.base.shopapp.utils.Views;
import butterknife.ButterKnife;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.observers.LambdaObserver;
import java.util.LinkedHashMap;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Deprecated
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/android/onesite/modules/BaseShopAppActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lau/com/woolworths/android/onesite/network/ApiEventListener;", "<init>", "()V", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class BaseShopAppActivity extends AppCompatActivity implements ApiEventListener {
    public final CompositeDisposable t = new CompositeDisposable();
    public boolean u;
    public AnalyticsManager v;
    public LegacyShopAnalyticsManager w;

    public final void N4(LambdaObserver lambdaObserver) {
        this.t.d(lambdaObserver);
    }

    public final AnalyticsManager O4() {
        AnalyticsManager analyticsManager = this.v;
        if (analyticsManager != null) {
            return analyticsManager;
        }
        Intrinsics.p("analyticsManager");
        throw null;
    }

    public abstract int P4();

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws NoSuchMethodException, SecurityException {
        super.onCreate(bundle);
        if (this.u) {
            return;
        }
        setContentView(P4());
        LinkedHashMap linkedHashMap = ButterKnife.f12957a;
        ButterKnife.a(getWindow().getDecorView(), this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.t.e();
    }

    public final void u() {
        Views.c(this, 0);
    }

    public final void y() {
        Views.b(this);
    }
}
