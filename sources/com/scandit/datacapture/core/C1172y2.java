package com.scandit.datacapture.core;

import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeTextureBinding;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.y2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1172y2 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f18993a;
    private final NativeTextureBinding b;
    private final Size2 c;
    private final boolean d;

    public C1172y2(ArrayList textureTransformation, NativeTextureBinding sourceFrame, Size2 frameSize, boolean z) {
        Intrinsics.h(textureTransformation, "textureTransformation");
        Intrinsics.h(sourceFrame, "sourceFrame");
        Intrinsics.h(frameSize, "frameSize");
        this.f18993a = textureTransformation;
        this.b = sourceFrame;
        this.c = frameSize;
        this.d = z;
    }

    public final Size2 a() {
        return this.c;
    }

    public final boolean b() {
        return this.d;
    }

    public final NativeTextureBinding c() {
        return this.b;
    }

    public final ArrayList d() {
        return this.f18993a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1172y2)) {
            return false;
        }
        C1172y2 c1172y2 = (C1172y2) obj;
        return Intrinsics.c(this.f18993a, c1172y2.f18993a) && Intrinsics.c(this.b, c1172y2.b) && Intrinsics.c(this.c, c1172y2.c) && this.d == c1172y2.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f18993a.hashCode() * 31)) * 31)) * 31;
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RenderData(textureTransformation=");
        sb.append(this.f18993a);
        sb.append(", sourceFrame=");
        sb.append(this.b);
        sb.append(", frameSize=");
        sb.append(this.c);
        sb.append(", hasValidPreviewFrame=");
        return androidx.camera.core.impl.b.s(sb, this.d, ')');
    }
}
