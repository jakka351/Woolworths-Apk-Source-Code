package au.com.woolworths.rewards.base.extensions;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import au.com.woolworths.feature.product.list.legacy.k;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base-rewards-app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ActivityExtKt {
    public static final void a(AppCompatActivity appCompatActivity) {
        appCompatActivity.setRequestedOrientation(1);
        WindowCompat.b(appCompatActivity.getWindow(), false);
        ViewCompat.I(appCompatActivity.getWindow().getDecorView(), new k(24));
    }
}
