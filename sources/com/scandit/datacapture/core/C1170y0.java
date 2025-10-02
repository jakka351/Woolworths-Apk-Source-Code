package com.scandit.datacapture.core;

import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.CameraPosition;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.y0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1170y0 {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f18991a = new LinkedHashMap();

    public final Camera a(CameraPosition position) {
        Object obj;
        Intrinsics.h(position, "position");
        LinkedHashMap linkedHashMap = this.f18991a;
        int i = AbstractC1161x0.f18986a[position.ordinal()];
        if (i == 1) {
            obj = C1134u0.f18875a;
        } else {
            if (i != 2) {
                throw new IllegalStateException(("Unsupported camera position " + position).toString());
            }
            obj = C1143v0.f18977a;
        }
        return (Camera) linkedHashMap.get(obj);
    }

    public final void a(CameraPosition position, Camera camera) {
        Object obj;
        Intrinsics.h(position, "position");
        Intrinsics.h(camera, "camera");
        LinkedHashMap linkedHashMap = this.f18991a;
        int i = AbstractC1161x0.f18986a[position.ordinal()];
        if (i == 1) {
            obj = C1134u0.f18875a;
        } else if (i == 2) {
            obj = C1143v0.f18977a;
        } else {
            throw new IllegalStateException(("Unsupported camera position " + position).toString());
        }
        linkedHashMap.put(obj, camera);
    }
}
