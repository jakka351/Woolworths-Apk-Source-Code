package com.google.gson;

import java.lang.reflect.Field;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class FieldAttributes {

    /* renamed from: a, reason: collision with root package name */
    public final Field f15914a;

    public FieldAttributes(Field field) {
        Objects.requireNonNull(field);
        this.f15914a = field;
    }

    public final String toString() {
        return this.f15914a.toString();
    }
}
