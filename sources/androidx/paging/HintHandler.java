package androidx.paging;

import androidx.paging.ViewportHint;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/HintHandler;", "", "HintFlow", "State", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HintHandler {

    /* renamed from: a, reason: collision with root package name */
    public final State f3538a = new State(this);

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/HintHandler$HintFlow;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class HintFlow {

        /* renamed from: a, reason: collision with root package name */
        public ViewportHint f3539a;
        public final SharedFlowImpl b = SharedFlowKt.b(1, 0, BufferOverflow.e, 2);
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/HintHandler$State;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public final class State {
        public ViewportHint.Access c;

        /* renamed from: a, reason: collision with root package name */
        public final HintFlow f3540a = new HintFlow();
        public final HintFlow b = new HintFlow();
        public final ReentrantLock d = new ReentrantLock();

        public State(HintHandler hintHandler) {
        }

        public final void a(ViewportHint.Access access, Function2 function2) {
            ReentrantLock reentrantLock = this.d;
            try {
                reentrantLock.lock();
                if (access != null) {
                    this.c = access;
                }
                function2.invoke(this.f3540a, this.b);
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public final SharedFlowImpl a(LoadType loadType) {
        int iOrdinal = loadType.ordinal();
        State state = this.f3538a;
        if (iOrdinal == 1) {
            return state.f3540a.b;
        }
        if (iOrdinal == 2) {
            return state.b.b;
        }
        throw new IllegalArgumentException("invalid load type for hints");
    }
}
