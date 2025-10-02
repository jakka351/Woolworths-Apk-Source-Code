package me.oriient.ui.contentview.models;

import androidx.annotation.Keep;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ui.contentview.utils.ExtensionsKt;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H\u0096\u0002J\u0011\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0086\u0002J\u0011\u0010\u000b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\bH\u0086\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\t\u0010\u0011\u001a\u00020\u0000H\u0086\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lme/oriient/ui/contentview/models/Degrees;", "", "value", "", "(F)V", "getValue", "()F", "compareTo", "", "other", "div", "minus", "plus", "times", "i", "toString", "", "unaryMinus", "Companion", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Degrees implements Comparable<Degrees> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final float value;

    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"Lme/oriient/ui/contentview/models/Degrees$Companion;", "", "()V", "normalize", "", "angle", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float normalize(float angle) {
            return angle > BitmapDescriptorFactory.HUE_RED ? 360.0f - angle : -angle;
        }

        private Companion() {
        }
    }

    public Degrees(float f) {
        this.value = f;
    }

    @NotNull
    public final Degrees div(int other) {
        return ExtensionsKt.getDg(this.value / other);
    }

    public final float getValue() {
        return this.value;
    }

    @NotNull
    public final Degrees minus(@NotNull Degrees other) {
        Intrinsics.h(other, "other");
        return ExtensionsKt.getDg(this.value - other.value);
    }

    @NotNull
    public final Degrees plus(@NotNull Degrees other) {
        Intrinsics.h(other, "other");
        return ExtensionsKt.getDg(this.value + other.value);
    }

    @NotNull
    public final Degrees times(int i) {
        return new Degrees(this.value * i);
    }

    @NotNull
    public String toString() {
        return android.support.v4.media.session.a.r(new StringBuilder("RotationDegrees(value="), this.value, ')');
    }

    @NotNull
    public final Degrees unaryMinus() {
        return ExtensionsKt.getDg(-this.value);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull Degrees other) {
        Intrinsics.h(other, "other");
        return Float.compare(this.value, other.value);
    }
}
