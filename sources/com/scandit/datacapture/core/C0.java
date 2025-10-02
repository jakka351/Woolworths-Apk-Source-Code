package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData;
import java.util.LinkedHashMap;
import java.util.Stack;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class C0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f18301a;
    private final Stack b = new Stack();
    private final LinkedHashMap c = new LinkedHashMap();

    public C0(int i) {
        this.f18301a = i;
        b();
    }

    public final void a(NativeCameraFrameData cameraFrameData) {
        Intrinsics.h(cameraFrameData, "cameraFrameData");
        if (this.b.size() < this.f18301a) {
            this.b.push(cameraFrameData);
        }
    }

    public final void b() {
        this.b.clear();
        this.c.clear();
        int i = this.f18301a;
        for (int i2 = 0; i2 < i; i2++) {
            NativeCameraFrameData cameraFrameData = NativeCameraFrameData.createEmpty();
            this.b.push(cameraFrameData);
            LinkedHashMap linkedHashMap = this.c;
            Intrinsics.g(cameraFrameData, "cameraFrameData");
            NativeFrameData nativeFrameDataAsFrameData = cameraFrameData.asFrameData();
            Intrinsics.g(nativeFrameDataAsFrameData, "cameraFrameData.asFrameData()");
            linkedHashMap.put(cameraFrameData, nativeFrameDataAsFrameData);
        }
    }

    public final NativeCameraFrameData a() {
        if (this.b.isEmpty()) {
            return null;
        }
        return (NativeCameraFrameData) this.b.pop();
    }
}
