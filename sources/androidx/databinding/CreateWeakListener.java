package androidx.databinding;

import androidx.annotation.RestrictTo;
import java.lang.ref.ReferenceQueue;

@RestrictTo
/* loaded from: classes2.dex */
interface CreateWeakListener {
    WeakListener a(ViewDataBinding viewDataBinding, int i, ReferenceQueue referenceQueue);
}
