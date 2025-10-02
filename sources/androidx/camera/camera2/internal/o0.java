package androidx.camera.camera2.internal;

import androidx.camera.core.Logger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ VideoUsageControl e;

    public /* synthetic */ o0(VideoUsageControl videoUsageControl, int i) {
        this.d = i;
        this.e = videoUsageControl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                VideoUsageControl this$0 = this.e;
                Intrinsics.h(this$0, "this$0");
                int iDecrementAndGet = this$0.b.decrementAndGet();
                if (iDecrementAndGet >= 0) {
                    Logger.a("VideoUsageControl", "decrementUsage: mVideoUsage = " + iDecrementAndGet);
                    break;
                } else {
                    Logger.e("VideoUsageControl", "decrementUsage: mVideoUsage = " + iDecrementAndGet + ", which is less than 0!");
                    break;
                }
            default:
                VideoUsageControl this$02 = this.e;
                Intrinsics.h(this$02, "this$0");
                Logger.a("VideoUsageControl", "incrementUsage: mVideoUsage = " + this$02.b.incrementAndGet());
                break;
        }
    }
}
