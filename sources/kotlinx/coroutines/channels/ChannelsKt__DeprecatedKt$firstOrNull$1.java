package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {105}, m = "firstOrNull")
/* loaded from: classes7.dex */
final class ChannelsKt__DeprecatedKt$firstOrNull$1<E> extends ContinuationImpl {
    public /* synthetic */ Object p;
    public int q;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChannelsKt__DeprecatedKt$firstOrNull$1<E> channelsKt__DeprecatedKt$firstOrNull$1;
        this.p = obj;
        int i = this.q | Integer.MIN_VALUE;
        this.q = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.q = i - Integer.MIN_VALUE;
            channelsKt__DeprecatedKt$firstOrNull$1 = this;
        } else {
            channelsKt__DeprecatedKt$firstOrNull$1 = new ChannelsKt__DeprecatedKt$firstOrNull$1<>(this);
        }
        Object obj2 = channelsKt__DeprecatedKt$firstOrNull$1.p;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i2 = channelsKt__DeprecatedKt$firstOrNull$1.q;
        try {
            if (i2 == 0) {
                ResultKt.b(obj2);
                throw null;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj2);
            if (((Boolean) obj2).booleanValue()) {
                throw null;
            }
            throw null;
        } finally {
        }
    }
}
