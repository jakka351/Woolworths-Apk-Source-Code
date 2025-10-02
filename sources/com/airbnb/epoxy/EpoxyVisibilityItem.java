package com.airbnb.epoxy;

import android.graphics.Rect;
import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/epoxy/EpoxyVisibilityItem;", "", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@VisibleForTesting
/* loaded from: classes4.dex */
public final class EpoxyVisibilityItem {
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public Integer m;
    public Integer n;
    public Integer o;

    /* renamed from: a, reason: collision with root package name */
    public final Rect f13319a = new Rect();
    public int l = 8;

    public EpoxyVisibilityItem(Integer num) {
        this.b = -1;
        int iIntValue = num.intValue();
        this.i = false;
        this.j = false;
        this.k = false;
        this.b = iIntValue;
        this.m = null;
        this.n = null;
        this.o = null;
    }
}
