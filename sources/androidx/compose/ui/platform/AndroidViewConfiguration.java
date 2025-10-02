package androidx.compose.ui.platform;

import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidViewConfiguration;", "Landroidx/compose/ui/platform/ViewConfiguration;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidViewConfiguration implements ViewConfiguration {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewConfiguration f1956a;

    public AndroidViewConfiguration(android.view.ViewConfiguration viewConfiguration) {
        this.f1956a = viewConfiguration;
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public final float a() {
        if (Build.VERSION.SDK_INT >= 34) {
            return AndroidViewConfigurationApi34.b(this.f1956a);
        }
        return 2.0f;
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public final float b() {
        return this.f1956a.getScaledTouchSlop();
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public final float c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return AndroidViewConfigurationApi34.a(this.f1956a);
        }
        return 16.0f;
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public final long d() {
        return android.view.ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public final long e() {
        return android.view.ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public final float g() {
        return this.f1956a.getScaledMaximumFlingVelocity();
    }
}
