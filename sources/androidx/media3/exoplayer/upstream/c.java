package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.Consumer;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Consumer {
    @Override // androidx.media3.common.util.Consumer
    public final void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }
}
