package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.Format;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public interface ExoTrackSelection extends TrackSelection {

    public static final class Definition {

        /* renamed from: a, reason: collision with root package name */
        public final TrackGroup f3166a;
        public final int[] b;

        public Definition(int i, TrackGroup trackGroup, int[] iArr) {
            if (iArr.length == 0) {
                Log.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f3166a = trackGroup;
            this.b = iArr;
        }
    }

    public interface Factory {
    }

    int a();

    default void c() {
    }

    void disable();

    void enable();

    int f();

    Format g();

    default void h() {
    }

    void j(float f);

    default void k(boolean z) {
    }
}
