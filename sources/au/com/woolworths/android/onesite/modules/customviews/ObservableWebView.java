package au.com.woolworths.android.onesite.modules.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;

/* loaded from: classes3.dex */
public class ObservableWebView extends WebView {
    public OnScrollChangedCallback d;

    public interface OnScrollChangedCallback {
        void a();
    }

    public ObservableWebView(Context context) {
        super(context);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        OnScrollChangedCallback onScrollChangedCallback = this.d;
        if (onScrollChangedCallback != null) {
            onScrollChangedCallback.a();
        }
    }

    public void setOnScrollChangedCallback(OnScrollChangedCallback onScrollChangedCallback) {
        this.d = onScrollChangedCallback;
    }

    public ObservableWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ObservableWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
