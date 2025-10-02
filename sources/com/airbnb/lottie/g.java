package com.airbnb.lottie;

import com.airbnb.lottie.model.layer.CompositionLayer;
import com.airbnb.lottie.utils.Utils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;

/* loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                HashMap map = LottieCompositionFactory.f13343a;
                Utils.b((ByteArrayInputStream) obj);
                return;
            case 1:
                LottieDrawable lottieDrawable = (LottieDrawable) obj;
                Semaphore semaphore = lottieDrawable.R;
                CompositionLayer compositionLayer = lottieDrawable.v;
                if (compositionLayer == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    compositionLayer.r(lottieDrawable.e.c());
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    semaphore.release();
                    throw th;
                }
                semaphore.release();
                return;
            default:
                ExecutorService executorService = LottieTask.e;
                ((LottieTask) obj).c();
                return;
        }
    }
}
