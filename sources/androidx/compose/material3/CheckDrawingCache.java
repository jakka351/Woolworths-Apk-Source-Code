package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPathMeasure;
import androidx.compose.ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/CheckDrawingCache;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CheckDrawingCache {

    /* renamed from: a, reason: collision with root package name */
    public final AndroidPath f1408a;
    public final AndroidPathMeasure b;
    public final AndroidPath c;

    public CheckDrawingCache() {
        AndroidPath androidPathA = AndroidPath_androidKt.a();
        AndroidPathMeasure androidPathMeasureA = AndroidPathMeasure_androidKt.a();
        AndroidPath androidPathA2 = AndroidPath_androidKt.a();
        this.f1408a = androidPathA;
        this.b = androidPathMeasureA;
        this.c = androidPathA2;
    }
}
