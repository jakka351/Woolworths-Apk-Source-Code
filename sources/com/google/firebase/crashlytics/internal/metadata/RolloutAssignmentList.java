package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class RolloutAssignmentList {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f15299a = new ArrayList();
    public final int b = 128;

    public final synchronized List a() {
        return Collections.unmodifiableList(new ArrayList(this.f15299a));
    }

    public final synchronized boolean b(List list) {
        this.f15299a.clear();
        if (list.size() <= this.b) {
            return this.f15299a.addAll(list);
        }
        Logger.f15258a.f(null, "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.b);
        return this.f15299a.addAll(list.subList(0, this.b));
    }
}
