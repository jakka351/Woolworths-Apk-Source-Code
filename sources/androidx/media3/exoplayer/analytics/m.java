package androidx.media3.exoplayer.analytics;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.google.android.material.search.SearchView;

/* loaded from: classes2.dex */
public final /* synthetic */ class m implements ListenerSet.Event, OnApplyWindowInsetsListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m(int i, int i2, Object obj) {
        this.f = obj;
        this.d = i;
        this.e = i2;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).h((AnalyticsListener.EventTime) this.f, this.d, this.e);
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f;
        int i = SearchView.G;
        marginLayoutParams.leftMargin = windowInsetsCompat.i() + this.d;
        marginLayoutParams.rightMargin = windowInsetsCompat.j() + this.e;
        return windowInsetsCompat;
    }
}
