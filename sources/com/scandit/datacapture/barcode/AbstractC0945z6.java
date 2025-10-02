package com.scandit.datacapture.barcode;

import android.graphics.Path;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;

/* renamed from: com.scandit.datacapture.barcode.z6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC0945z6 {

    /* renamed from: a, reason: collision with root package name */
    private final Quadrilateral f18286a;
    private final Path b;

    public /* synthetic */ AbstractC0945z6(Quadrilateral quadrilateral, Path path, int i) {
        this(quadrilateral, path);
    }

    public final Quadrilateral a() {
        return this.f18286a;
    }

    public final Path b() {
        return this.b;
    }

    private AbstractC0945z6(Quadrilateral quadrilateral, Path path) {
        this.f18286a = quadrilateral;
        this.b = path;
    }
}
