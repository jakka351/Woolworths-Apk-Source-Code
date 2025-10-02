package com.scandit.datacapture.core.ui.style;

import android.support.v4.media.session.a;
import androidx.annotation.ColorInt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.core.AbstractC1027i1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB#\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\"\u0010\u0007\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/scandit/datacapture/core/ui/style/Brush;", "", "", "fillColor", "strokeColor", "", "preserveAlpha", "copy", "other", "equals", "hashCode", "", "toString", "a", "I", "getFillColor", "()I", "b", "getStrokeColor", "", "c", "F", "getStrokeWidth", "()F", "strokeWidth", "<init>", "(IIF)V", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class Brush {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int fillColor;

    /* renamed from: b, reason: from kotlin metadata */
    private final int strokeColor;

    /* renamed from: c, reason: from kotlin metadata */
    private final float strokeWidth;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0004"}, d2 = {"Lcom/scandit/datacapture/core/ui/style/Brush$Companion;", "", "Lcom/scandit/datacapture/core/ui/style/Brush;", "transparent", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Brush transparent() {
            return new Brush(0, 0, BitmapDescriptorFactory.HUE_RED);
        }

        private Companion() {
        }
    }

    public Brush(@ColorInt int i, @ColorInt int i2, float f) {
        this.fillColor = i;
        this.strokeColor = i2;
        this.strokeWidth = f;
    }

    @JvmStatic
    @NotNull
    public static final Brush transparent() {
        return INSTANCE.transparent();
    }

    @NotNull
    public final Brush copy(@ColorInt int fillColor, @ColorInt int strokeColor, boolean preserveAlpha) {
        if (preserveAlpha) {
            return new Brush((fillColor & 16777215) | ((this.fillColor >>> 24) << 24), (strokeColor & 16777215) | ((this.strokeColor >>> 24) << 24), this.strokeWidth);
        }
        if (preserveAlpha) {
            throw new NoWhenBranchMatchedException();
        }
        return new Brush(fillColor, strokeColor, this.strokeWidth);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Brush.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.f(other, "null cannot be cast to non-null type com.scandit.datacapture.core.ui.style.Brush");
        Brush brush = (Brush) other;
        return this.fillColor == brush.fillColor && this.strokeColor == brush.strokeColor && this.strokeWidth == brush.strokeWidth;
    }

    public final int getFillColor() {
        return this.fillColor;
    }

    public final int getStrokeColor() {
        return this.strokeColor;
    }

    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    public int hashCode() {
        return Float.hashCode(this.strokeWidth) + (((this.fillColor * 31) + this.strokeColor) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Brush{fillColor=");
        sb.append(AbstractC1027i1.a(this.fillColor));
        sb.append(", strokeColor=");
        sb.append(AbstractC1027i1.a(this.strokeColor));
        sb.append(", strokeWidth=");
        return a.r(sb, this.strokeWidth, '}');
    }
}
