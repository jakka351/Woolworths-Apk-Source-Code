package androidx.media3.exoplayer.source.mediaparser;

import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.net.wifi.WifiNetworkSuggestion;
import android.view.SurfaceControl;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ boolean C(Drawable drawable) {
        return drawable instanceof ColorStateListDrawable;
    }

    public static /* bridge */ /* synthetic */ ColorStateListDrawable i(Drawable drawable) {
        return (ColorStateListDrawable) drawable;
    }

    public static /* synthetic */ WifiNetworkSuggestion.Builder l() {
        return new WifiNetworkSuggestion.Builder();
    }

    public static /* bridge */ /* synthetic */ WifiNetworkSuggestion n(Object obj) {
        return (WifiNetworkSuggestion) obj;
    }

    public static /* synthetic */ SurfaceControl.Transaction p() {
        return new SurfaceControl.Transaction();
    }

    public static /* synthetic */ void q() {
    }
}
