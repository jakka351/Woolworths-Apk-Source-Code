package androidx.core.view;

import android.os.Build;
import android.view.ScrollFeedbackProvider;
import androidx.annotation.RequiresApi;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes2.dex */
public class ScrollFeedbackProviderCompat {

    /* renamed from: a, reason: collision with root package name */
    public final ScrollFeedbackProviderImpl f2482a;

    @RequiresApi
    public static class ScrollFeedbackProviderApi35Impl implements ScrollFeedbackProviderImpl {

        /* renamed from: a, reason: collision with root package name */
        public final ScrollFeedbackProvider f2483a;

        public ScrollFeedbackProviderApi35Impl(NestedScrollView nestedScrollView) {
            this.f2483a = ScrollFeedbackProvider.createProvider(nestedScrollView);
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public final void onScrollLimit(int i, int i2, int i3, boolean z) {
            this.f2483a.onScrollLimit(i, i2, i3, z);
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public final void onScrollProgress(int i, int i2, int i3, int i4) {
            this.f2483a.onScrollProgress(i, i2, i3, i4);
        }
    }

    public static class ScrollFeedbackProviderBaseImpl implements ScrollFeedbackProviderImpl {
        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public final void onScrollProgress(int i, int i2, int i3, int i4) {
        }
    }

    public interface ScrollFeedbackProviderImpl {
        void onScrollLimit(int i, int i2, int i3, boolean z);

        void onScrollProgress(int i, int i2, int i3, int i4);
    }

    public ScrollFeedbackProviderCompat(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f2482a = new ScrollFeedbackProviderApi35Impl(nestedScrollView);
        } else {
            this.f2482a = new ScrollFeedbackProviderBaseImpl();
        }
    }

    public final void a(int i, int i2, int i3, boolean z) {
        this.f2482a.onScrollLimit(i, i2, i3, z);
    }

    public final void b(int i, int i2, int i3, int i4) {
        this.f2482a.onScrollProgress(i, i2, i3, i4);
    }
}
