package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.swrve.sdk.messaging.SwrveMessageView;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class p implements View.OnTouchListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.d) {
            case 0:
                WebView webView = (WebView) this.e;
                view.getParent().requestDisallowInterceptTouchEvent(true);
                webView.performClick();
                return false;
            case 1:
                Function2 tmp0 = (Function2) this.e;
                Intrinsics.h(tmp0, "$tmp0");
                return ((Boolean) tmp0.invoke(view, motionEvent)).booleanValue();
            default:
                WeakReference weakReference = ((SwrveMessageView) this.e).l;
                if (weakReference == null || weakReference.get() == null) {
                    return false;
                }
                return ((GestureDetector) weakReference.get()).onTouchEvent(motionEvent);
        }
    }
}
