package au.com.woolworths.android.onesite.haptic;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.haptic.HapticExtKt", f = "HapticExt.kt", l = {40}, m = "performHapticFeedbackFailureAsync")
/* loaded from: classes3.dex */
final class HapticExtKt$performHapticFeedbackFailureAsync$1 extends ContinuationImpl {
    public Activity p;
    public int q;
    public int r;
    public /* synthetic */ Object s;
    public int t;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.t |= Integer.MIN_VALUE;
        return HapticExtKt.b(null, this);
    }
}
