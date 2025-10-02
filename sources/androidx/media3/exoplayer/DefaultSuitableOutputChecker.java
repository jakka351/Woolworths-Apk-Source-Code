package androidx.media3.exoplayer;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
import android.media.MediaRouter2$RouteCallback;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;

/* loaded from: classes2.dex */
final class DefaultSuitableOutputChecker implements SuitableOutputChecker {

    /* renamed from: a, reason: collision with root package name */
    public final SuitableOutputChecker f2999a;

    @RequiresApi
    public static final class ImplApi23 implements SuitableOutputChecker {

        /* renamed from: androidx.media3.exoplayer.DefaultSuitableOutputChecker$ImplApi23$1, reason: invalid class name */
        class AnonymousClass1 extends AudioDeviceCallback {
            @Override // android.media.AudioDeviceCallback
            public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                Assertions.g(null);
                throw null;
            }

            @Override // android.media.AudioDeviceCallback
            public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                Assertions.g(null);
                throw null;
            }
        }
    }

    @RequiresApi
    public static final class ImplApi35 implements SuitableOutputChecker {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f3000a = 0;

        /* renamed from: androidx.media3.exoplayer.DefaultSuitableOutputChecker$ImplApi35$1, reason: invalid class name */
        class AnonymousClass1 extends MediaRouter2$RouteCallback {
        }

        /* renamed from: androidx.media3.exoplayer.DefaultSuitableOutputChecker$ImplApi35$2, reason: invalid class name */
        class AnonymousClass2 extends MediaRouter2$ControllerCallback {
            public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
                int i = ImplApi35.f3000a;
                throw null;
            }
        }

        static {
            androidx.core.view.h.m();
            androidx.core.view.h.f(ImmutableList.t()).build();
        }
    }

    public DefaultSuitableOutputChecker() {
        int i = Util.f2928a;
        if (i >= 35) {
            this.f2999a = new ImplApi35();
        } else if (i >= 23) {
            this.f2999a = new ImplApi23();
        } else {
            this.f2999a = null;
        }
    }
}
