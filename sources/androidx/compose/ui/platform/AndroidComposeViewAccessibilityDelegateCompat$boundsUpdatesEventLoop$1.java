package androidx.compose.ui.platform;

import androidx.collection.MutableIntSet;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.channels.ChannelIterator;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", l = {1916, 1951}, m = "boundsUpdatesEventLoop$ui_release")
/* loaded from: classes.dex */
final class AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 extends ContinuationImpl {
    public AndroidComposeViewAccessibilityDelegateCompat p;
    public MutableIntSet q;
    public ChannelIterator r;
    public /* synthetic */ Object s;
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.t = androidComposeViewAccessibilityDelegateCompat;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.l(this);
    }
}
