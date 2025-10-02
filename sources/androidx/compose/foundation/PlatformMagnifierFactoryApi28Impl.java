package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@RequiresApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactoryApi28Impl;", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "PlatformMagnifierImpl", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlatformMagnifierFactoryApi28Impl implements PlatformMagnifierFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final PlatformMagnifierFactoryApi28Impl f845a = new PlatformMagnifierFactoryApi28Impl();

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactoryApi28Impl$PlatformMagnifierImpl;", "Landroidx/compose/foundation/PlatformMagnifier;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @RequiresApi
    @SourceDebugExtension
    public static class PlatformMagnifierImpl implements PlatformMagnifier {

        /* renamed from: a, reason: collision with root package name */
        public final Magnifier f846a;

        public PlatformMagnifierImpl(Magnifier magnifier) {
            this.f846a = magnifier;
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        public final long a() {
            Magnifier magnifier = this.f846a;
            return (magnifier.getWidth() << 32) | (magnifier.getHeight() & 4294967295L);
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        public final void b() {
            this.f846a.update();
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        public void c(long j, float f, long j2) {
            this.f846a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        public final void dismiss() {
            this.f846a.dismiss();
        }
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    public final PlatformMagnifier a(View view, boolean z, long j, float f, float f2, boolean z2, Density density, float f3) {
        return new PlatformMagnifierImpl(new Magnifier(view));
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    public final boolean b() {
        return false;
    }
}
