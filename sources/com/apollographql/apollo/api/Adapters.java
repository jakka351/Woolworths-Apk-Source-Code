package com.apollographql.apollo.api;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Adapters {

    /* renamed from: a, reason: collision with root package name */
    public static final Adapters$StringAdapter$1 f13493a;
    public static final Adapters$IntAdapter$1 b;
    public static final Adapters$DoubleAdapter$1 c;
    public static final Adapters$FloatAdapter$1 d;
    public static final Adapters$LongAdapter$1 e;
    public static final Adapters$BooleanAdapter$1 f;
    public static final Adapters$AnyAdapter$1 g;
    public static final Adapters$UploadAdapter$1 h;
    public static final NullableAdapter i;
    public static final NullableAdapter j;
    public static final NullableAdapter k;
    public static final NullableAdapter l;
    public static final NullableAdapter m;

    static {
        Adapters$StringAdapter$1 adapters$StringAdapter$1 = new Adapters$StringAdapter$1();
        f13493a = adapters$StringAdapter$1;
        Adapters$IntAdapter$1 adapters$IntAdapter$1 = new Adapters$IntAdapter$1();
        b = adapters$IntAdapter$1;
        Adapters$DoubleAdapter$1 adapters$DoubleAdapter$1 = new Adapters$DoubleAdapter$1();
        c = adapters$DoubleAdapter$1;
        d = new Adapters$FloatAdapter$1();
        e = new Adapters$LongAdapter$1();
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = new Adapters$BooleanAdapter$1();
        f = adapters$BooleanAdapter$1;
        Adapters$AnyAdapter$1 adapters$AnyAdapter$1 = new Adapters$AnyAdapter$1();
        g = adapters$AnyAdapter$1;
        h = new Adapters$UploadAdapter$1();
        i = b(adapters$StringAdapter$1);
        j = b(adapters$DoubleAdapter$1);
        k = b(adapters$IntAdapter$1);
        l = b(adapters$BooleanAdapter$1);
        m = b(adapters$AnyAdapter$1);
    }

    public static final ListAdapter a(Adapter adapter) {
        Intrinsics.h(adapter, "<this>");
        return new ListAdapter(adapter);
    }

    public static final NullableAdapter b(Adapter adapter) {
        Intrinsics.h(adapter, "<this>");
        return new NullableAdapter(adapter);
    }

    public static final ObjectAdapter c(Adapter adapter, boolean z) {
        Intrinsics.h(adapter, "<this>");
        return new ObjectAdapter(adapter, z);
    }

    public static final PresentAdapter d(Adapter adapter) {
        Intrinsics.h(adapter, "<this>");
        return new PresentAdapter(adapter);
    }
}
