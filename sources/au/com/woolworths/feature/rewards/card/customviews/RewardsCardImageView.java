package au.com.woolworths.feature.rewards.card.customviews;

import YU.a;
import android.content.Context;
import android.graphics.Camera;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\rR\"\u0010\u0017\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\r¨\u0006\u001a"}, d2 = {"Lau/com/woolworths/feature/rewards/card/customviews/RewardsCardImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "roll", "", "setRoll", "(F)V", "g", "F", "getMaxRotation", "()F", "setMaxRotation", "maxRotation", "h", "getRatio", "setRatio", "ratio", "LowPassFilter", "Companion", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsCardImageView extends AppCompatImageView {

    /* renamed from: g, reason: from kotlin metadata */
    public float maxRotation;

    /* renamed from: h, reason: from kotlin metadata */
    public float ratio;
    public final Camera i;
    public final LowPassFilter j;
    public final Matrix k;
    public float l;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/card/customviews/RewardsCardImageView$Companion;", "", "", "DEFAULT_MAX_ROTATION", "F", "DEFAULT_RATIO", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/card/customviews/RewardsCardImageView$LowPassFilter;", "", "Companion", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LowPassFilter {

        /* renamed from: a, reason: collision with root package name */
        public long f5819a;
        public long b;
        public float c;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/card/customviews/RewardsCardImageView$LowPassFilter$Companion;", "", "", "DEFAULT_TIME_CONSTANT", "F", "NANOSECONDS_PER_SECOND", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsCardImageView(@NotNull Context context) {
        super(context);
        Intrinsics.h(context, "context");
        this.maxRotation = 25.0f;
        this.ratio = 1.0f;
        Camera camera = new Camera();
        this.i = camera;
        this.j = new LowPassFilter();
        this.k = new Matrix();
        Context context2 = getContext();
        Intrinsics.g(context2, "getContext(...)");
        new CustomDeviceRotationSensor(context2);
        camera.setLocation(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -24.0f);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private final void setRoll(float roll) {
        if (roll >= 90.0f) {
            roll -= 180.0f;
        } else if (roll <= -90.0f) {
            roll += 180.0f;
        }
        float f = this.maxRotation;
        float fB = RangesKt.b(roll / (this.ratio * f), -1.0f, 1.0f) * f;
        LowPassFilter lowPassFilter = this.j;
        if (lowPassFilter.f5819a == 0) {
            lowPassFilter.f5819a = System.nanoTime();
        }
        long jNanoTime = System.nanoTime();
        float f2 = 1;
        long j = lowPassFilter.b + 1;
        lowPassFilter.b = j;
        float fMax = 0.06f / ((f2 / (j / (Math.max(jNanoTime - lowPassFilter.f5819a, 1L) / 1.0E9f))) + 0.06f);
        float fA = a.a(f2, fMax, fB, lowPassFilter.c * fMax);
        lowPassFilter.c = fA;
        c(fA, this.i);
    }

    public final void c(float f, Camera camera) {
        float[] fArr = {1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f};
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        Matrix matrix = this.k;
        matrix.setValues(fArr);
        camera.save();
        camera.rotateY(f);
        camera.getMatrix(matrix);
        camera.restore();
        matrix.preTranslate(-measuredWidth, -measuredHeight);
        matrix.preScale(getMeasuredWidth() / getDrawable().getIntrinsicWidth(), getMeasuredHeight() / getDrawable().getIntrinsicHeight());
        matrix.postTranslate(measuredWidth, measuredHeight);
        setImageMatrix(matrix);
        this.l = f;
    }

    public final float getMaxRotation() {
        return this.maxRotation;
    }

    public final float getRatio() {
        return this.ratio;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        c(this.l, this.i);
    }

    public final void setMaxRotation(float f) {
        this.maxRotation = f;
    }

    public final void setRatio(float f) {
        this.ratio = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsCardImageView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.h(context, "context");
        Intrinsics.h(attrs, "attrs");
        this.maxRotation = 25.0f;
        this.ratio = 1.0f;
        Camera camera = new Camera();
        this.i = camera;
        this.j = new LowPassFilter();
        this.k = new Matrix();
        Context context2 = getContext();
        Intrinsics.g(context2, "getContext(...)");
        new CustomDeviceRotationSensor(context2);
        camera.setLocation(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -24.0f);
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
