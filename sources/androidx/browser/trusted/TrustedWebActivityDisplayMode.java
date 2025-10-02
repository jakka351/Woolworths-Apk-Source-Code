package androidx.browser.trusted;

import android.os.Bundle;

/* loaded from: classes2.dex */
public interface TrustedWebActivityDisplayMode {

    public static class DefaultMode implements TrustedWebActivityDisplayMode {
        @Override // androidx.browser.trusted.TrustedWebActivityDisplayMode
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt("androidx.browser.trusted.displaymode.KEY_ID", 0);
            return bundle;
        }
    }

    public static class ImmersiveMode implements TrustedWebActivityDisplayMode {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f216a;

        public ImmersiveMode(boolean z) {
            this.f216a = z;
        }

        @Override // androidx.browser.trusted.TrustedWebActivityDisplayMode
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt("androidx.browser.trusted.displaymode.KEY_ID", 1);
            bundle.putBoolean("androidx.browser.trusted.displaymode.KEY_STICKY", this.f216a);
            bundle.putInt("androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE", 0);
            return bundle;
        }
    }

    Bundle toBundle();
}
