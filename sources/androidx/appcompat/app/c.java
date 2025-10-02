package androidx.appcompat.app;

import android.graphics.text.LineBreakConfig;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static /* synthetic */ LineBreakConfig.Builder e() {
        return new LineBreakConfig.Builder();
    }

    public static /* synthetic */ BoringLayout i(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z, TextUtils.TruncateAt truncateAt, int i2) {
        return new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, BitmapDescriptorFactory.HUE_RED, metrics, z, truncateAt, i2, true);
    }
}
