package kotlinx.coroutines.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a?\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0003H\u0082\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlinx/atomicfu/AtomicInt;", "", "delta", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "cur", "", "condition", "addConditionally", "(Lkotlinx/atomicfu/AtomicInt;ILkotlin/jvm/functions/Function1;)Z", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ConcurrentLinkedListKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Symbol f24718a = new Symbol("CLOSED");

    public static final Object a(Segment segment, long j, Function2 function2) {
        while (true) {
            if (segment.f >= j && !segment.d()) {
                return segment;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ConcurrentLinkedListNode.d;
            Object obj = atomicReferenceFieldUpdater.get(segment);
            Symbol symbol = f24718a;
            if (obj == symbol) {
                return symbol;
            }
            Segment segment2 = (Segment) ((ConcurrentLinkedListNode) obj);
            if (segment2 == null) {
                segment2 = (Segment) function2.invoke(Long.valueOf(segment.f + 1), segment);
                while (!atomicReferenceFieldUpdater.compareAndSet(segment, null, segment2)) {
                    if (atomicReferenceFieldUpdater.get(segment) != null) {
                        break;
                    }
                }
                if (segment.d()) {
                    segment.e();
                }
            }
            segment = segment2;
        }
    }
}
