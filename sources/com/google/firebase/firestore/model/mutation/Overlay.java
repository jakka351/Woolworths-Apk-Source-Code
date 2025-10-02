package com.google.firebase.firestore.model.mutation;

import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes6.dex */
public abstract class Overlay {
    public static Overlay a(int i, Mutation mutation) {
        return new AutoValue_Overlay(i, mutation);
    }

    public abstract int b();

    public abstract Mutation c();
}
