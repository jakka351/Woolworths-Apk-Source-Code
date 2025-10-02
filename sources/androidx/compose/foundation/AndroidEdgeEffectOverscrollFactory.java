package androidx.compose.foundation;

import android.content.Context;
import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/AndroidEdgeEffectOverscrollFactory;", "Landroidx/compose/foundation/OverscrollFactory;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class AndroidEdgeEffectOverscrollFactory implements OverscrollFactory {

    /* renamed from: a, reason: collision with root package name */
    public final Context f825a;
    public final Density b;
    public final long c;
    public final PaddingValues d;

    public AndroidEdgeEffectOverscrollFactory(Context context, Density density, long j, PaddingValues paddingValues) {
        this.f825a = context;
        this.b = density;
        this.c = j;
        this.d = paddingValues;
    }

    @Override // androidx.compose.foundation.OverscrollFactory
    public final AndroidEdgeEffectOverscrollEffect a() {
        return new AndroidEdgeEffectOverscrollEffect(this.f825a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AndroidEdgeEffectOverscrollFactory.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.f(obj, "null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
        AndroidEdgeEffectOverscrollFactory androidEdgeEffectOverscrollFactory = (AndroidEdgeEffectOverscrollFactory) obj;
        return Intrinsics.c(this.f825a, androidEdgeEffectOverscrollFactory.f825a) && Intrinsics.c(this.b, androidEdgeEffectOverscrollFactory.b) && Color.c(this.c, androidEdgeEffectOverscrollFactory.c) && Intrinsics.c(this.d, androidEdgeEffectOverscrollFactory.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f825a.hashCode() * 31)) * 31;
        int i = Color.l;
        return this.d.hashCode() + b.b(iHashCode, 31, this.c);
    }
}
