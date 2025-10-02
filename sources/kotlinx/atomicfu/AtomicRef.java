package kotlinx.atomicfu;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\tR*\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00008\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlinx/atomicfu/AtomicRef;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "value", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "Companion", "atomicfu"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AtomicRef<T> {
    private volatile T value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001Rd\u0010\u0005\u001aR\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*(\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/atomicfu/AtomicRef$Companion;", "", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lkotlinx/atomicfu/AtomicRef;", "kotlin.jvm.PlatformType", "FU", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "atomicfu"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        AtomicReferenceFieldUpdater.newUpdater(AtomicRef.class, Object.class, "value");
    }

    public final String toString() {
        return String.valueOf(this.value);
    }
}
