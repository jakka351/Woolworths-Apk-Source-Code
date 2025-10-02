package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.ExoPlayerImplInternal;
import androidx.media3.exoplayer.MediaSourceList;
import androidx.media3.exoplayer.source.MediaSource;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ v(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                MediaSourceList.ForwardingEventListener forwardingEventListener = (MediaSourceList.ForwardingEventListener) this.e;
                Pair pair = (Pair) this.f;
                MediaSourceList.this.h.Q(((Integer) pair.first).intValue(), (MediaSource.MediaPeriodId) pair.second);
                break;
            case 1:
                MediaSourceList.ForwardingEventListener forwardingEventListener2 = (MediaSourceList.ForwardingEventListener) this.e;
                Pair pair2 = (Pair) this.f;
                MediaSourceList.this.h.k0(((Integer) pair2.first).intValue(), (MediaSource.MediaPeriodId) pair2.second);
                break;
            case 2:
                MediaSourceList.ForwardingEventListener forwardingEventListener3 = (MediaSourceList.ForwardingEventListener) this.e;
                Pair pair3 = (Pair) this.f;
                MediaSourceList.this.h.F(((Integer) pair3.first).intValue(), (MediaSource.MediaPeriodId) pair3.second);
                break;
            default:
                ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) this.e;
                ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate = (ExoPlayerImplInternal.PlaybackInfoUpdate) this.f;
                int i = exoPlayerImpl.I - playbackInfoUpdate.c;
                exoPlayerImpl.I = i;
                boolean z = true;
                if (playbackInfoUpdate.d) {
                    exoPlayerImpl.J = playbackInfoUpdate.e;
                    exoPlayerImpl.K = true;
                }
                if (i == 0) {
                    Timeline timeline = playbackInfoUpdate.b.f3020a;
                    if (!exoPlayerImpl.h0.f3020a.p() && timeline.p()) {
                        exoPlayerImpl.i0 = -1;
                        exoPlayerImpl.j0 = 0L;
                    }
                    if (!timeline.p()) {
                        List listAsList = Arrays.asList(((PlaylistTimeline) timeline).i);
                        Assertions.f(listAsList.size() == exoPlayerImpl.p.size());
                        for (int i2 = 0; i2 < listAsList.size(); i2++) {
                            ((ExoPlayerImpl.MediaSourceHolderSnapshot) exoPlayerImpl.p.get(i2)).b = (Timeline) listAsList.get(i2);
                        }
                    }
                    long j = -9223372036854775807L;
                    if (exoPlayerImpl.K) {
                        if (playbackInfoUpdate.b.b.equals(exoPlayerImpl.h0.b) && playbackInfoUpdate.b.d == exoPlayerImpl.h0.s) {
                            z = false;
                        }
                        if (z) {
                            if (timeline.p() || playbackInfoUpdate.b.b.b()) {
                                j = playbackInfoUpdate.b.d;
                            } else {
                                PlaybackInfo playbackInfo = playbackInfoUpdate.b;
                                MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.b;
                                long j2 = playbackInfo.d;
                                Object obj = mediaPeriodId.f3130a;
                                Timeline.Period period = exoPlayerImpl.o;
                                timeline.g(obj, period);
                                j = j2 + period.e;
                            }
                        }
                    } else {
                        z = false;
                    }
                    exoPlayerImpl.K = false;
                    exoPlayerImpl.y0(playbackInfoUpdate.b, 1, z, exoPlayerImpl.J, j, -1, false);
                    break;
                }
                break;
        }
    }
}
