package androidx.work.impl;

import androidx.annotation.RestrictTo;
import androidx.work.impl.model.WorkSpec;

@RestrictTo
/* loaded from: classes.dex */
public interface Scheduler {
    boolean a();

    void b(String str);

    void c(WorkSpec... workSpecArr);
}
