package androidx.compose.ui.graphics.colorspace;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ConnectorKt {

    /* renamed from: a, reason: collision with root package name */
    public static final MutableIntObjectMap f1793a;

    static {
        Rgb rgb = ColorSpaces.e;
        int i = rgb.c;
        Connector$Companion$identity$1 connector$Companion$identity$1 = new Connector$Companion$identity$1(rgb, rgb, 1);
        int i2 = rgb.c;
        Oklab oklab = ColorSpaces.x;
        int i3 = (oklab.c << 6) | i2;
        Connector connector = new Connector(rgb, oklab, 0);
        int i4 = (i2 << 6) | oklab.c;
        Connector connector2 = new Connector(oklab, rgb, 0);
        MutableIntObjectMap mutableIntObjectMap = IntObjectMapKt.f679a;
        MutableIntObjectMap mutableIntObjectMap2 = new MutableIntObjectMap();
        mutableIntObjectMap2.h(i | (i << 6), connector$Companion$identity$1);
        mutableIntObjectMap2.h(i3, connector);
        mutableIntObjectMap2.h(i4, connector2);
        f1793a = mutableIntObjectMap2;
    }
}
