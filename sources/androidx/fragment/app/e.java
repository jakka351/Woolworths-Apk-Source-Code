package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.os.SavedStateRegistry;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements SavedStateRegistry.SavedStateProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2771a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i) {
        this.f2771a = i;
        this.b = obj;
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public final Bundle a() {
        int i = this.f2771a;
        Object obj = this.b;
        switch (i) {
            case 0:
                FragmentActivity fragmentActivity = (FragmentActivity) obj;
                int i2 = FragmentActivity.s;
                fragmentActivity.markFragmentsCreated();
                fragmentActivity.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_STOP);
                return new Bundle();
            default:
                return ((FragmentManager) obj).j0();
        }
    }
}
