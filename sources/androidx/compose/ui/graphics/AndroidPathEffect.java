package androidx.compose.ui.graphics;

import android.graphics.DashPathEffect;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/AndroidPathEffect;", "Landroidx/compose/ui/graphics/PathEffect;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AndroidPathEffect implements PathEffect {

    /* renamed from: a, reason: collision with root package name */
    public final DashPathEffect f1762a;

    public AndroidPathEffect(DashPathEffect dashPathEffect) {
        this.f1762a = dashPathEffect;
    }

    public final android.graphics.PathEffect a() {
        return this.f1762a;
    }
}
