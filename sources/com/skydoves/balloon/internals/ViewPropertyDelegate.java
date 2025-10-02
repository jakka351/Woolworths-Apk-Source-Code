package com.skydoves.balloon.internals;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0004"}, d2 = {"Lcom/skydoves/balloon/internals/ViewPropertyDelegate;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/properties/ReadWriteProperty;", "", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ViewPropertyDelegate<T> implements ReadWriteProperty<Object, T> {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f19021a;
    public Object b;

    public ViewPropertyDelegate(Object obj, Function0 function0) {
        this.f19021a = function0;
        this.b = obj;
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public final Object getValue(Object obj, KProperty property) {
        Intrinsics.h(property, "property");
        return this.b;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public final void setValue(Object obj, KProperty property, Object obj2) {
        Intrinsics.h(property, "property");
        if (Intrinsics.c(this.b, obj2)) {
            return;
        }
        this.b = obj2;
        this.f19021a.invoke();
    }
}
