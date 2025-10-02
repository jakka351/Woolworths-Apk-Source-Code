package me.oriient.ipssdk.api.models;

import android.graphics.Canvas;
import android.graphics.Picture;
import androidx.annotation.Keep;
import com.caverock.androidsvg.SVG;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u0011"}, d2 = {"Lme/oriient/ipssdk/api/models/IPSSvgImage;", "", "svg", "Lcom/caverock/androidsvg/SVG;", "(Lcom/caverock/androidsvg/SVG;)V", "height", "", "getHeight", "()D", "width", "getWidth", "renderToCanvas", "", "canvas", "Landroid/graphics/Canvas;", "renderToPicture", "Landroid/graphics/Picture;", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IPSSvgImage {

    @NotNull
    private final SVG svg;

    public IPSSvgImage(@NotNull SVG svg) {
        Intrinsics.h(svg, "svg");
        this.svg = svg;
    }

    public final double getHeight() {
        return this.svg.b();
    }

    public final double getWidth() {
        return this.svg.c();
    }

    public final void renderToCanvas(@NotNull Canvas canvas) {
        Intrinsics.h(canvas, "canvas");
        this.svg.f(canvas);
    }

    @NotNull
    public final Picture renderToPicture() {
        return this.svg.h(null);
    }
}
