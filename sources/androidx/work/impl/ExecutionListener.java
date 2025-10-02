package androidx.work.impl;

import androidx.annotation.RestrictTo;
import androidx.work.impl.model.WorkGenerationalId;

@RestrictTo
/* loaded from: classes.dex */
public interface ExecutionListener {
    void d(WorkGenerationalId workGenerationalId, boolean z);
}
