package kotlinx.coroutines.flow.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "S", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class AbstractSharedFlow<S extends AbstractSharedFlowSlot<?>> {
    public AbstractSharedFlowSlot[] d;
    public int e;
    public int f;
    public SubscriptionCountStateFlow g;

    public final AbstractSharedFlowSlot c() {
        AbstractSharedFlowSlot abstractSharedFlowSlotH;
        SubscriptionCountStateFlow subscriptionCountStateFlow;
        synchronized (this) {
            try {
                AbstractSharedFlowSlot[] abstractSharedFlowSlotArrI = this.d;
                if (abstractSharedFlowSlotArrI == null) {
                    abstractSharedFlowSlotArrI = i();
                    this.d = abstractSharedFlowSlotArrI;
                } else if (this.e >= abstractSharedFlowSlotArrI.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(abstractSharedFlowSlotArrI, abstractSharedFlowSlotArrI.length * 2);
                    Intrinsics.g(objArrCopyOf, "copyOf(...)");
                    this.d = (AbstractSharedFlowSlot[]) objArrCopyOf;
                    abstractSharedFlowSlotArrI = (AbstractSharedFlowSlot[]) objArrCopyOf;
                }
                int i = this.f;
                do {
                    abstractSharedFlowSlotH = abstractSharedFlowSlotArrI[i];
                    if (abstractSharedFlowSlotH == null) {
                        abstractSharedFlowSlotH = h();
                        abstractSharedFlowSlotArrI[i] = abstractSharedFlowSlotH;
                    }
                    i++;
                    if (i >= abstractSharedFlowSlotArrI.length) {
                        i = 0;
                    }
                } while (!abstractSharedFlowSlotH.a(this));
                this.f = i;
                this.e++;
                subscriptionCountStateFlow = this.g;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (subscriptionCountStateFlow != null) {
            subscriptionCountStateFlow.x(1);
        }
        return abstractSharedFlowSlotH;
    }

    public final StateFlow g() {
        SubscriptionCountStateFlow subscriptionCountStateFlow;
        synchronized (this) {
            subscriptionCountStateFlow = this.g;
            if (subscriptionCountStateFlow == null) {
                int i = this.e;
                subscriptionCountStateFlow = new SubscriptionCountStateFlow(1, Integer.MAX_VALUE, BufferOverflow.e);
                subscriptionCountStateFlow.f(Integer.valueOf(i));
                this.g = subscriptionCountStateFlow;
            }
        }
        return subscriptionCountStateFlow;
    }

    public abstract AbstractSharedFlowSlot h();

    public abstract AbstractSharedFlowSlot[] i();

    public final void j(AbstractSharedFlowSlot abstractSharedFlowSlot) {
        SubscriptionCountStateFlow subscriptionCountStateFlow;
        int i;
        Continuation[] continuationArrB;
        synchronized (this) {
            try {
                int i2 = this.e - 1;
                this.e = i2;
                subscriptionCountStateFlow = this.g;
                if (i2 == 0) {
                    this.f = 0;
                }
                Intrinsics.f(abstractSharedFlowSlot, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                continuationArrB = abstractSharedFlowSlot.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : continuationArrB) {
            if (continuation != null) {
                continuation.resumeWith(Unit.f24250a);
            }
        }
        if (subscriptionCountStateFlow != null) {
            subscriptionCountStateFlow.x(-1);
        }
    }
}
