package androidx.media3.ui;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public interface TimeBar {

    public interface OnScrubListener {
        void C(long j);

        void F(long j);

        void H(long j, boolean z);
    }

    void a(long[] jArr, boolean[] zArr, int i);

    void b(OnScrubListener onScrubListener);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j);

    void setDuration(long j);

    void setEnabled(boolean z);

    void setPosition(long j);
}
