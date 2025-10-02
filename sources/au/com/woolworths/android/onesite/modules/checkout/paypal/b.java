package au.com.woolworths.android.onesite.modules.checkout.paypal;

import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import androidx.camera.core.impl.e;
import androidx.fragment.app.FragmentActivity;
import io.reactivex.Observable;
import io.reactivex.internal.operators.observable.ObservableSingleSingle;
import io.reactivex.internal.operators.observable.ObservableTake;
import io.reactivex.internal.operators.single.SingleMap;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Callable {
    public final /* synthetic */ String d;
    public final /* synthetic */ ActivityResultLauncher e;
    public final /* synthetic */ FragmentActivity f;
    public final /* synthetic */ Observable g;

    public /* synthetic */ b(String str, ActivityResultLauncher activityResultLauncher, FragmentActivity fragmentActivity, Observable observable) {
        this.d = str;
        this.e = activityResultLauncher;
        this.f = fragmentActivity;
        this.g = observable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str = this.d;
        if (str != null) {
            Intent intentPutExtra = new Intent(this.f, (Class<?>) BraintreeResultActivity.class).putExtra("auth", str);
            Intrinsics.g(intentPutExtra, "putExtra(...)");
            this.e.a(intentPutExtra, null);
        }
        Observable observable = this.g;
        observable.getClass();
        return new SingleMap(new ObservableSingleSingle(new ObservableTake(observable)), new e(new androidx.navigation.a(25), 17));
    }
}
