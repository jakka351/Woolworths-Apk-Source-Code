package androidx.compose.ui.contentcapture;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.channels.ChannelIterator;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.contentcapture.AndroidContentCaptureManager", f = "AndroidContentCaptureManager.android.kt", l = {177, 186}, m = "boundsUpdatesEventLoop$ui_release")
/* loaded from: classes.dex */
final class AndroidContentCaptureManager$boundsUpdatesEventLoop$1 extends ContinuationImpl {
    public AndroidContentCaptureManager p;
    public ChannelIterator q;
    public /* synthetic */ Object r;
    public final /* synthetic */ AndroidContentCaptureManager s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidContentCaptureManager$boundsUpdatesEventLoop$1(AndroidContentCaptureManager androidContentCaptureManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = androidContentCaptureManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.a(this);
    }
}
