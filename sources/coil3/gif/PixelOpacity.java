package coil3.gif;

import coil3.annotation.ExperimentalCoilApi;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/gif/PixelOpacity;", "", "coil-gif_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ExperimentalCoilApi
/* loaded from: classes4.dex */
public final class PixelOpacity {
    public static final PixelOpacity d;
    public static final PixelOpacity e;
    public static final /* synthetic */ PixelOpacity[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        PixelOpacity pixelOpacity = new PixelOpacity("UNCHANGED", 0);
        d = pixelOpacity;
        PixelOpacity pixelOpacity2 = new PixelOpacity("TRANSLUCENT", 1);
        PixelOpacity pixelOpacity3 = new PixelOpacity("OPAQUE", 2);
        e = pixelOpacity3;
        PixelOpacity[] pixelOpacityArr = {pixelOpacity, pixelOpacity2, pixelOpacity3};
        f = pixelOpacityArr;
        g = EnumEntriesKt.a(pixelOpacityArr);
    }

    public static PixelOpacity valueOf(String str) {
        return (PixelOpacity) Enum.valueOf(PixelOpacity.class, str);
    }

    public static PixelOpacity[] values() {
        return (PixelOpacity[]) f.clone();
    }
}
