package com.tbuonomo.viewpagerdotsindicator;

import kotlin.Metadata;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tbuonomo/viewpagerdotsindicator/OnPageChangeListenerHelper;", "", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public abstract class OnPageChangeListenerHelper {

    /* renamed from: a, reason: collision with root package name */
    public int f19116a = -1;
    public int b = -1;

    public abstract int a();

    public final void b(float f, int i) {
        float f2 = i + f;
        float fA = a() - 1;
        if (f2 == fA) {
            f2 = fA - 1.0E-4f;
        }
        int i2 = (int) f2;
        int i3 = i2 + 1;
        if (i3 > fA || i2 == -1) {
            return;
        }
        c(f2 % 1, i2, i3);
        int i4 = this.f19116a;
        if (i4 != -1) {
            if (i2 > i4) {
                IntProgressionIterator it = RangesKt.o(i4, i2).iterator();
                while (it.f) {
                    d(it.nextInt());
                }
            }
            int i5 = this.b;
            if (i3 < i5) {
                d(i5);
                IntProgressionIterator it2 = new IntRange(i2 + 2, this.b, 1).iterator();
                while (it2.f) {
                    d(it2.nextInt());
                }
            }
        }
        this.f19116a = i2;
        this.b = i3;
    }

    public abstract void c(float f, int i, int i2);

    public abstract void d(int i);
}
