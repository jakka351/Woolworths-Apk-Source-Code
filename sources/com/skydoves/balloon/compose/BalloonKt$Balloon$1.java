package com.skydoves.balloon.compose;

import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BalloonKt$Balloon$1 extends Lambda implements Function1<LayoutCoordinates, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutCoordinates coordinates = (LayoutCoordinates) obj;
        Intrinsics.h(coordinates, "coordinates");
        coordinates.a();
        throw null;
    }
}
