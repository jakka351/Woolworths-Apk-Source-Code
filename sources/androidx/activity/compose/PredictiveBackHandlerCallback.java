package androidx.activity.compose;

import androidx.activity.BackEventCompat;
import androidx.activity.OnBackPressedCallback;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/compose/PredictiveBackHandlerCallback;", "Landroidx/activity/OnBackPressedCallback;", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PredictiveBackHandlerCallback extends OnBackPressedCallback {
    public CoroutineScope d;
    public Function2 e;
    public OnBackInstance f;
    public boolean g;

    @Override // androidx.activity.OnBackPressedCallback
    public final void d() {
        OnBackInstance onBackInstance = this.f;
        if (onBackInstance != null) {
            onBackInstance.a();
        }
        OnBackInstance onBackInstance2 = this.f;
        if (onBackInstance2 != null) {
            onBackInstance2.f70a = false;
        }
        this.g = false;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void e() {
        OnBackInstance onBackInstance = this.f;
        if (onBackInstance != null && !onBackInstance.f70a) {
            onBackInstance.a();
            this.f = null;
        }
        if (this.f == null) {
            this.f = new OnBackInstance(this.d, false, this.e, this);
        }
        OnBackInstance onBackInstance2 = this.f;
        if (onBackInstance2 != null) {
            onBackInstance2.b.y(null);
        }
        OnBackInstance onBackInstance3 = this.f;
        if (onBackInstance3 != null) {
            onBackInstance3.f70a = false;
        }
        this.g = false;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void f(BackEventCompat backEventCompat) {
        super.f(backEventCompat);
        OnBackInstance onBackInstance = this.f;
        if (onBackInstance != null) {
            onBackInstance.b.k(backEventCompat);
        }
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void g(BackEventCompat backEventCompat) {
        super.g(backEventCompat);
        OnBackInstance onBackInstance = this.f;
        if (onBackInstance != null) {
            onBackInstance.a();
        }
        if (this.f56a) {
            this.f = new OnBackInstance(this.d, true, this.e, this);
        }
        this.g = true;
    }
}
