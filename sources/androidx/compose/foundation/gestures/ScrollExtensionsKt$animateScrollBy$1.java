package androidx.compose.foundation.gestures;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", l = {38}, m = "animateScrollBy")
/* loaded from: classes2.dex */
final class ScrollExtensionsKt$animateScrollBy$1 extends ContinuationImpl {
    public Ref.FloatRef p;
    public /* synthetic */ Object q;
    public int r;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.r |= Integer.MIN_VALUE;
        return ScrollExtensionsKt.a(null, BitmapDescriptorFactory.HUE_RED, null, this);
    }
}
