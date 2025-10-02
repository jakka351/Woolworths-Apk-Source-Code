package com.airbnb.epoxy;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/epoxy/ViewStubData;", "", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ViewStubData {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f13325a;
    public final ViewStub b;
    public final int c;

    public ViewStubData(ViewGroup viewGroup, ViewStub viewStub, int i) {
        Intrinsics.h(viewGroup, "viewGroup");
        this.f13325a = viewGroup;
        this.b = viewStub;
        this.c = i;
    }

    public final void a() {
        ViewGroup viewGroup = this.f13325a;
        int i = this.c;
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            viewGroup.removeView(childAt);
        } else {
            throw new IllegalStateException("No view exists at position " + i);
        }
    }
}
