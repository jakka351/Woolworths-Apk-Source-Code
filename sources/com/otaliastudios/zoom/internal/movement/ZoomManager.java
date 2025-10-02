package com.otaliastudios.zoom.internal.movement;

import com.otaliastudios.zoom.OverZoomRangeProvider;
import com.otaliastudios.zoom.ZoomEngine;
import com.otaliastudios.zoom.ZoomLogger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/otaliastudios/zoom/internal/movement/ZoomManager;", "Lcom/otaliastudios/zoom/internal/movement/MovementManager;", "Companion", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class ZoomManager extends MovementManager {
    public static final ZoomLogger k = new ZoomLogger("ZoomManager");
    public final ZoomEngine b;
    public float c;
    public float d;
    public int e;
    public float f;
    public int g;
    public OverZoomRangeProvider h;
    public boolean i;
    public boolean j;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/otaliastudios/zoom/internal/movement/ZoomManager$Companion;", "", "Lcom/otaliastudios/zoom/ZoomLogger;", "LOG", "Lcom/otaliastudios/zoom/ZoomLogger;", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    public ZoomManager(ZoomEngine zoomEngine, Function0 function0) {
        super(function0);
        this.b = zoomEngine;
        this.d = 0.8f;
        this.f = 2.5f;
        this.h = OverZoomRangeProvider.f16810a;
        this.i = true;
        this.j = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float b(float r7, boolean r8) {
        /*
            r6 = this;
            float r0 = r6.d()
            float r1 = r6.c()
            if (r8 == 0) goto L36
            boolean r8 = r6.j
            if (r8 == 0) goto L36
            com.otaliastudios.zoom.OverZoomRangeProvider r8 = r6.h
            com.otaliastudios.zoom.ZoomEngine r2 = r6.b
            float r8 = r8.a(r2)
            r3 = 0
            int r4 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            com.otaliastudios.zoom.ZoomLogger r5 = com.otaliastudios.zoom.internal.movement.ZoomManager.k
            if (r4 >= 0) goto L23
            r5.getClass()
            if (r4 >= 0) goto L23
            r8 = r3
        L23:
            float r0 = r0 - r8
            com.otaliastudios.zoom.OverZoomRangeProvider r8 = r6.h
            float r8 = r8.a(r2)
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 >= 0) goto L34
            r5.getClass()
            if (r2 >= 0) goto L34
            goto L35
        L34:
            r3 = r8
        L35:
            float r1 = r1 + r3
        L36:
            int r8 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r8 >= 0) goto L62
            int r8 = r6.g
            int r2 = r6.e
            if (r8 == r2) goto L46
            if (r8 != 0) goto L44
            r0 = r1
            goto L62
        L44:
            r1 = r0
            goto L62
        L46:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r2 = "maxZoom is less than minZoom: "
            r8.<init>(r2)
            r8.append(r1)
            java.lang.String r1 = " < "
            r8.append(r1)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L62:
            float r7 = kotlin.ranges.RangesKt.b(r7, r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.otaliastudios.zoom.internal.movement.ZoomManager.b(float, boolean):float");
    }

    public final float c() {
        int i = this.g;
        if (i == 0) {
            return this.f * this.c;
        }
        if (i == 1) {
            return this.f;
        }
        throw new IllegalArgumentException(Intrinsics.m(Integer.valueOf(this.g), "Unknown ZoomType "));
    }

    public final float d() {
        int i = this.e;
        if (i == 0) {
            return this.d * this.c;
        }
        if (i == 1) {
            return this.d;
        }
        throw new IllegalArgumentException(Intrinsics.m(Integer.valueOf(this.e), "Unknown ZoomType "));
    }
}
