package com.otaliastudios.zoom;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.otaliastudios.zoom.internal.matrix.MatrixUpdate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lcom/otaliastudios/zoom/internal/matrix/MatrixUpdate$Builder;"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
final class ZoomEngine$moveTo$update$1 extends Lambda implements Function1<MatrixUpdate.Builder, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MatrixUpdate.Builder obtain = (MatrixUpdate.Builder) obj;
        Intrinsics.h(obtain, "$this$obtain");
        obtain.f16821a = BitmapDescriptorFactory.HUE_RED;
        obtain.b = false;
        AbsolutePoint absolutePoint = new AbsolutePoint(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        obtain.d = null;
        obtain.c = absolutePoint;
        obtain.e = false;
        obtain.f = false;
        return Unit.f24250a;
    }
}
