package com.google.firebase.firestore.core;

import com.google.firebase.firestore.util.Assert;

/* loaded from: classes6.dex */
public class TargetIdGenerator {

    /* renamed from: a, reason: collision with root package name */
    public int f15466a;

    public TargetIdGenerator(int i, int i2) {
        Assert.b((i & 1) == i, "Generator ID %d contains more than %d reserved bits", Integer.valueOf(i), 1);
        Assert.b((i2 & 1) == i, "Cannot supply target ID from different generator ID", new Object[0]);
        this.f15466a = i2;
    }
}
