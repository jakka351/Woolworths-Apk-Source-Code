package androidx.core.splashscreen;

import android.content.ClipData;
import android.media.metrics.NetworkEvent;
import android.media.metrics.TrackChangeEvent;
import android.view.ContentInfo;
import android.view.View;
import android.window.SplashScreenView;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ NetworkEvent.Builder d() {
        return new NetworkEvent.Builder();
    }

    public static /* synthetic */ TrackChangeEvent.Builder g(int i) {
        return new TrackChangeEvent.Builder(i);
    }

    public static /* synthetic */ ContentInfo.Builder h(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* bridge */ /* synthetic */ ContentInfo j(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* bridge */ /* synthetic */ SplashScreenView k(View view) {
        return (SplashScreenView) view;
    }
}
