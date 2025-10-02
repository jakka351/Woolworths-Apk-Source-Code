package androidx.databinding;

import androidx.databinding.ViewDataBindingKtx;
import java.lang.ref.ReferenceQueue;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements CreateWeakListener {
    @Override // androidx.databinding.CreateWeakListener
    public final WeakListener a(ViewDataBinding viewDataBinding, int i, ReferenceQueue referenceQueue) {
        Intrinsics.e(referenceQueue);
        return new ViewDataBindingKtx.StateFlowListener(viewDataBinding, i, referenceQueue).f;
    }
}
