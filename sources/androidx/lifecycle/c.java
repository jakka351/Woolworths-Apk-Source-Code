package androidx.lifecycle;

import android.animation.Animator;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.lifecycle.LiveDataPublisher;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c(Object obj, long j, int i) {
        this.d = i;
        this.f = obj;
        this.e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                LiveDataPublisher.LiveDataSubscription liveDataSubscription = (LiveDataPublisher.LiveDataSubscription) this.f;
                long j = this.e;
                if (liveDataSubscription.e) {
                    return;
                }
                if (j <= 0) {
                    liveDataSubscription.e = true;
                    if (liveDataSubscription.f) {
                        throw null;
                    }
                    liveDataSubscription.h = null;
                    liveDataSubscription.d.onError(new IllegalArgumentException("Non-positive request"));
                    return;
                }
                long j2 = liveDataSubscription.g;
                long j3 = j + j2;
                if (j3 < j2) {
                    j3 = Long.MAX_VALUE;
                }
                liveDataSubscription.g = j3;
                if (!liveDataSubscription.f) {
                    liveDataSubscription.f = true;
                    throw null;
                }
                Object obj = liveDataSubscription.h;
                if (obj != null) {
                    liveDataSubscription.onChanged(obj);
                    liveDataSubscription.h = null;
                    return;
                }
                return;
            case 1:
                AudioRendererEventListener.EventDispatcher eventDispatcher = (AudioRendererEventListener.EventDispatcher) this.f;
                long j4 = this.e;
                AudioRendererEventListener audioRendererEventListener = eventDispatcher.b;
                int i = Util.f2928a;
                audioRendererEventListener.r(j4);
                return;
            default:
                View this_circularRevealed = (View) this.f;
                long j5 = this.e;
                Intrinsics.h(this_circularRevealed, "$this_circularRevealed");
                if (this_circularRevealed.isAttachedToWindow()) {
                    this_circularRevealed.setVisibility(0);
                    Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(this_circularRevealed, (this_circularRevealed.getRight() + this_circularRevealed.getLeft()) / 2, (this_circularRevealed.getBottom() + this_circularRevealed.getTop()) / 2, BitmapDescriptorFactory.HUE_RED, Math.max(this_circularRevealed.getWidth(), this_circularRevealed.getHeight()));
                    animatorCreateCircularReveal.setDuration(j5);
                    animatorCreateCircularReveal.start();
                    return;
                }
                return;
        }
    }
}
