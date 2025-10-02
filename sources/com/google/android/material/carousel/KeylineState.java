package com.google.android.material.carousel;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
final class KeylineState {

    /* renamed from: a, reason: collision with root package name */
    public final float f14537a;
    public final List b;
    public final int c;
    public final int d;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final float f14538a;
        public final float b;
        public Keyline d;
        public Keyline e;
        public final ArrayList c = new ArrayList();
        public int f = -1;
        public int g = -1;
        public float h = BitmapDescriptorFactory.HUE_RED;
        public int i = -1;

        public Builder(float f, float f2) {
            this.f14538a = f;
            this.b = f2;
        }

        public final void a(float f, float f2, float f3, boolean z, boolean z2) {
            float fAbs;
            float f4 = f3 / 2.0f;
            float f5 = f - f4;
            float f6 = f4 + f;
            float f7 = this.b;
            if (f6 > f7) {
                fAbs = Math.abs(f6 - Math.max(f6 - f3, f7));
            } else {
                fAbs = BitmapDescriptorFactory.HUE_RED;
                if (f5 < BitmapDescriptorFactory.HUE_RED) {
                    fAbs = Math.abs(f5 - Math.min(f5 + f3, BitmapDescriptorFactory.HUE_RED));
                }
            }
            b(f, f2, f3, z, z2, fAbs, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }

        public final void b(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5, float f6) {
            if (f3 <= BitmapDescriptorFactory.HUE_RED) {
                return;
            }
            ArrayList arrayList = this.c;
            if (z2) {
                if (z) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i = this.i;
                if (i != -1 && i != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.i = arrayList.size();
            }
            Keyline keyline = new Keyline(Float.MIN_VALUE, f, f2, f3, z2, f4, f5, f6);
            if (z) {
                if (this.d == null) {
                    this.d = keyline;
                    this.f = arrayList.size();
                }
                if (this.g != -1 && arrayList.size() - this.g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f3 != this.d.d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.e = keyline;
                this.g = arrayList.size();
            } else {
                if (this.d == null && f3 < this.h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.e != null && f3 > this.h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.h = f3;
            arrayList.add(keyline);
        }

        public final void c(float f, float f2, int i, boolean z, float f3) {
            if (i <= 0 || f3 <= BitmapDescriptorFactory.HUE_RED) {
                return;
            }
            for (int i2 = 0; i2 < i; i2++) {
                a((i2 * f3) + f, f2, f3, z, false);
            }
        }

        public final KeylineState d() {
            if (this.d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList2 = this.c;
                int size = arrayList2.size();
                float f = this.f14538a;
                if (i >= size) {
                    return new KeylineState(f, arrayList, this.f, this.g);
                }
                Keyline keyline = (Keyline) arrayList2.get(i);
                arrayList.add(new Keyline((i * f) + (this.d.b - (this.f * f)), keyline.b, keyline.c, keyline.d, keyline.e, keyline.f, keyline.g, keyline.h));
                i++;
            }
        }
    }

    public static final class Keyline {

        /* renamed from: a, reason: collision with root package name */
        public final float f14539a;
        public final float b;
        public final float c;
        public final float d;
        public final boolean e;
        public final float f;
        public final float g;
        public final float h;

        public Keyline(float f, float f2, float f3, float f4, boolean z, float f5, float f6, float f7) {
            this.f14539a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            this.e = z;
            this.f = f5;
            this.g = f6;
            this.h = f7;
        }
    }

    public KeylineState(float f, ArrayList arrayList, int i, int i2) {
        this.f14537a = f;
        this.b = Collections.unmodifiableList(arrayList);
        this.c = i;
        this.d = i2;
    }

    public final Keyline a() {
        return (Keyline) this.b.get(this.c);
    }

    public final Keyline b() {
        return (Keyline) this.b.get(0);
    }

    public final Keyline c() {
        return (Keyline) this.b.get(this.d);
    }

    public final Keyline d() {
        return (Keyline) this.b.get(r0.size() - 1);
    }
}
