package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.wallet.WalletConstants;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006R\u0011\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/flow/StateFlowImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/StateFlowSlot;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "Lkotlinx/atomicfu/AtomicRef;", "", "_state", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class StateFlowImpl<T> extends AbstractSharedFlow<StateFlowSlot> implements MutableStateFlow<T>, CancellableFlow<T>, FusibleFlow<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(StateFlowImpl.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int h;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {389, 401, WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED}, m = "collect")
    /* renamed from: kotlinx.coroutines.flow.StateFlowImpl$collect$1, reason: invalid class name */
    final class AnonymousClass1 extends ContinuationImpl {
        public Object p;
        public FlowCollector q;
        public Object r;
        public Job s;
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            StateFlowImpl.this.collect(null, this);
            return CoroutineSingletons.d;
        }
    }

    public StateFlowImpl(Object obj) {
        this._state$volatile = obj;
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public final List a() {
        return CollectionsKt.Q(getValue());
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public final Flow b(CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        return (((i2 < 0 || i2 >= 2) && i2 != -2) || bufferOverflow != BufferOverflow.e) ? SharedFlowKt.d(this, coroutineContext, i2, bufferOverflow) : this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        if (((kotlinx.coroutines.flow.SubscribedFlowCollector) r0).a(r3) == r4) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00a4, code lost:
    
        if (r2 != r4) goto L36;
     */
    /* JADX WARN: Path cross not found for [B:44:0x00ba, B:46:0x00c0], limit reached: 74 */
    /* JADX WARN: Path cross not found for [B:46:0x00c0, B:44:0x00ba], limit reached: 74 */
    /* JADX WARN: Path cross not found for [B:46:0x00c0, B:54:0x00db], limit reached: 74 */
    /* JADX WARN: Path cross not found for [B:66:0x011f, B:67:0x0120], limit reached: 74 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac A[Catch: all -> 0x0041, TryCatch #1 {all -> 0x0041, blocks: (B:14:0x003d, B:36:0x00a4, B:38:0x00ac, B:41:0x00b3, B:42:0x00b7, B:44:0x00ba, B:54:0x00db, B:57:0x00eb, B:58:0x0107, B:64:0x0117, B:61:0x010e, B:63:0x0114, B:46:0x00c0, B:50:0x00c7, B:21:0x005a, B:24:0x006b, B:35:0x0095), top: B:73:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba A[Catch: all -> 0x0041, TryCatch #1 {all -> 0x0041, blocks: (B:14:0x003d, B:36:0x00a4, B:38:0x00ac, B:41:0x00b3, B:42:0x00b7, B:44:0x00ba, B:54:0x00db, B:57:0x00eb, B:58:0x0107, B:64:0x0117, B:61:0x010e, B:63:0x0114, B:46:0x00c0, B:50:0x00c7, B:21:0x005a, B:24:0x006b, B:35:0x0095), top: B:73:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb A[Catch: all -> 0x0041, TryCatch #1 {all -> 0x0041, blocks: (B:14:0x003d, B:36:0x00a4, B:38:0x00ac, B:41:0x00b3, B:42:0x00b7, B:44:0x00ba, B:54:0x00db, B:57:0x00eb, B:58:0x0107, B:64:0x0117, B:61:0x010e, B:63:0x0114, B:46:0x00c0, B:50:0x00c7, B:21:0x005a, B:24:0x006b, B:35:0x0095), top: B:73:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00ea -> B:36:0x00a4). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r18, kotlin.coroutines.Continuation r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public final boolean d(Object obj, Object obj2) {
        Symbol symbol = NullSurrogateKt.f24716a;
        if (obj == null) {
            obj = symbol;
        }
        if (obj2 == null) {
            obj2 = symbol;
        }
        return k(obj, obj2);
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public final void e() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        setValue(obj);
        return Unit.f24250a;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public final boolean f(Object obj) {
        setValue(obj);
        return true;
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow, kotlinx.coroutines.flow.StateFlow
    public final Object getValue() {
        Object obj = i.get(this);
        if (obj == NullSurrogateKt.f24716a) {
            return null;
        }
        return obj;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public final AbstractSharedFlowSlot h() {
        return new StateFlowSlot();
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public final AbstractSharedFlowSlot[] i() {
        return new StateFlowSlot[2];
    }

    public final boolean k(Object obj, Object obj2) {
        int i2;
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        Symbol symbol;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !Intrinsics.c(obj3, obj)) {
                return false;
            }
            if (Intrinsics.c(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i3 = this.h;
            if ((i3 & 1) != 0) {
                this.h = i3 + 2;
                return true;
            }
            int i4 = i3 + 1;
            this.h = i4;
            AbstractSharedFlowSlot[] abstractSharedFlowSlotArr2 = this.d;
            while (true) {
                StateFlowSlot[] stateFlowSlotArr = (StateFlowSlot[]) abstractSharedFlowSlotArr2;
                if (stateFlowSlotArr != null) {
                    for (StateFlowSlot stateFlowSlot : stateFlowSlotArr) {
                        if (stateFlowSlot != null) {
                            AtomicReference atomicReference = stateFlowSlot.f24714a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (symbol = StateFlowKt.b)) {
                                    Symbol symbol2 = StateFlowKt.f24713a;
                                    if (obj4 != symbol2) {
                                        while (!atomicReference.compareAndSet(obj4, symbol2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((CancellableContinuationImpl) obj4).resumeWith(Unit.f24250a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, symbol)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i2 = this.h;
                    if (i2 == i4) {
                        this.h = i4 + 1;
                        return true;
                    }
                    abstractSharedFlowSlotArr = this.d;
                }
                abstractSharedFlowSlotArr2 = abstractSharedFlowSlotArr;
                i4 = i2;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public final void setValue(Object obj) {
        if (obj == null) {
            obj = NullSurrogateKt.f24716a;
        }
        k(null, obj);
    }
}
