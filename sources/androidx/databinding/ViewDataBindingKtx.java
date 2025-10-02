package androidx.databinding;

import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/databinding/ViewDataBindingKtx;", "", "StateFlowListener", "databindingKtx_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@RestrictTo
/* loaded from: classes2.dex */
public final class ViewDataBindingKtx {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2549a = new a();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"Landroidx/databinding/ViewDataBindingKtx$StateFlowListener;", "Landroidx/databinding/ObservableReference;", "Lkotlinx/coroutines/flow/Flow;", "", "databindingKtx_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StateFlowListener implements ObservableReference<Flow<? extends Object>> {
        public WeakReference d;
        public Job e;
        public final WeakListener f;

        public StateFlowListener(ViewDataBinding viewDataBinding, int i, ReferenceQueue referenceQueue) {
            Intrinsics.h(referenceQueue, "referenceQueue");
            this.f = new WeakListener(viewDataBinding, i, this, referenceQueue);
        }

        @Override // androidx.databinding.ObservableReference
        public final void b(LifecycleOwner lifecycleOwner) {
            WeakReference weakReference = this.d;
            if ((weakReference != null ? (LifecycleOwner) weakReference.get() : null) == lifecycleOwner) {
                return;
            }
            Job job = this.e;
            if (job != null) {
                ((JobSupport) job).cancel((CancellationException) null);
            }
            if (lifecycleOwner == null) {
                this.d = null;
                return;
            }
            this.d = new WeakReference(lifecycleOwner);
            Flow flow = (Flow) this.f.c;
            if (flow != null) {
                Job job2 = this.e;
                if (job2 != null) {
                    ((JobSupport) job2).cancel((CancellationException) null);
                }
                this.e = BuildersKt.c(LifecycleOwnerKt.a(lifecycleOwner), null, null, new ViewDataBindingKtx$StateFlowListener$startCollection$1(lifecycleOwner, flow, this, null), 3);
            }
        }

        @Override // androidx.databinding.ObservableReference
        public final void c(Object obj) {
            Job job = this.e;
            if (job != null) {
                ((JobSupport) job).cancel((CancellationException) null);
            }
            this.e = null;
        }

        @Override // androidx.databinding.ObservableReference
        public final void d(Object obj) {
            LifecycleOwner lifecycleOwner;
            Flow flow = (Flow) obj;
            WeakReference weakReference = this.d;
            if (weakReference == null || (lifecycleOwner = (LifecycleOwner) weakReference.get()) == null || flow == null) {
                return;
            }
            Job job = this.e;
            if (job != null) {
                ((JobSupport) job).cancel((CancellationException) null);
            }
            this.e = BuildersKt.c(LifecycleOwnerKt.a(lifecycleOwner), null, null, new ViewDataBindingKtx$StateFlowListener$startCollection$1(lifecycleOwner, flow, this, null), 3);
        }
    }

    public static final void a(ViewDataBinding viewDataBinding, int i, StateFlow stateFlow) {
        Intrinsics.h(viewDataBinding, "viewDataBinding");
        viewDataBinding.r = true;
        try {
            viewDataBinding.K(i, stateFlow, f2549a);
        } finally {
            viewDataBinding.r = false;
        }
    }
}
