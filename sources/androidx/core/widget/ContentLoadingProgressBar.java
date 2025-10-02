package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: classes2.dex */
public class ContentLoadingProgressBar extends ProgressBar {
    public static final /* synthetic */ int f = 0;
    public final a d;
    public final a e;

    public ContentLoadingProgressBar(Context context) {
        this(context, null);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.d);
        removeCallbacks(this.e);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.d);
        removeCallbacks(this.e);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.core.widget.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.core.widget.a] */
    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        final int i = 0;
        this.d = new Runnable(this) { // from class: androidx.core.widget.a
            public final /* synthetic */ ContentLoadingProgressBar e;

            {
                this.e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                ContentLoadingProgressBar contentLoadingProgressBar = this.e;
                switch (i2) {
                    case 0:
                        int i3 = ContentLoadingProgressBar.f;
                        contentLoadingProgressBar.setVisibility(8);
                        break;
                    default:
                        int i4 = ContentLoadingProgressBar.f;
                        contentLoadingProgressBar.getClass();
                        System.currentTimeMillis();
                        contentLoadingProgressBar.setVisibility(0);
                        break;
                }
            }
        };
        final int i2 = 1;
        this.e = new Runnable(this) { // from class: androidx.core.widget.a
            public final /* synthetic */ ContentLoadingProgressBar e;

            {
                this.e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                ContentLoadingProgressBar contentLoadingProgressBar = this.e;
                switch (i22) {
                    case 0:
                        int i3 = ContentLoadingProgressBar.f;
                        contentLoadingProgressBar.setVisibility(8);
                        break;
                    default:
                        int i4 = ContentLoadingProgressBar.f;
                        contentLoadingProgressBar.getClass();
                        System.currentTimeMillis();
                        contentLoadingProgressBar.setVisibility(0);
                        break;
                }
            }
        };
    }
}
