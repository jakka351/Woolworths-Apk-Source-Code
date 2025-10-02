package au.com.woolworths.feature.shop.myorders.details.progressstepper;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.OneShotPreDrawListener;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.shop.myorders.details.models.ProgressStepTypeApiDataKt;
import au.com.woolworths.feature.shop.myorders.details.models.ProgressStepper;
import au.com.woolworths.shared.ui.compose.progressstepper.ProgressStepType;
import au.com.woolworths.shared.ui.compose.progressstepper.ProgressStepperKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR.\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R+\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R+\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R+\u0010%\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u001f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/progressstepper/ProgressStepperContainer;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lau/com/woolworths/feature/shop/myorders/details/models/ProgressStepper;", "value", "d", "Lau/com/woolworths/feature/shop/myorders/details/models/ProgressStepper;", "getProgressStepper", "()Lau/com/woolworths/feature/shop/myorders/details/models/ProgressStepper;", "setProgressStepper", "(Lau/com/woolworths/feature/shop/myorders/details/models/ProgressStepper;)V", "progressStepper", "<set-?>", "e", "Landroidx/compose/runtime/MutableState;", "get_totalSteps", "()I", "set_totalSteps", "(I)V", "_totalSteps", "f", "get_currentStepPosition", "set_currentStepPosition", "_currentStepPosition", "Lau/com/woolworths/shared/ui/compose/progressstepper/ProgressStepType;", "g", "get_currentStepProgressStepperType", "()Lau/com/woolworths/shared/ui/compose/progressstepper/ProgressStepType;", "set_currentStepProgressStepperType", "(Lau/com/woolworths/shared/ui/compose/progressstepper/ProgressStepType;)V", "_currentStepProgressStepperType", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProgressStepperContainer extends FrameLayout {

    /* renamed from: d, reason: from kotlin metadata */
    public ProgressStepper progressStepper;

    /* renamed from: e, reason: from kotlin metadata */
    public final MutableState _totalSteps;

    /* renamed from: f, reason: from kotlin metadata */
    public final MutableState _currentStepPosition;

    /* renamed from: g, reason: from kotlin metadata */
    public final MutableState _currentStepProgressStepperType;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProgressStepperContainer(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.h(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int get_currentStepPosition() {
        return ((Number) ((SnapshotMutableStateImpl) this._currentStepPosition).getD()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProgressStepType get_currentStepProgressStepperType() {
        return (ProgressStepType) ((SnapshotMutableStateImpl) this._currentStepProgressStepperType).getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int get_totalSteps() {
        return ((Number) ((SnapshotMutableStateImpl) this._totalSteps).getD()).intValue();
    }

    private final void set_currentStepPosition(int i) {
        ((SnapshotMutableStateImpl) this._currentStepPosition).setValue(Integer.valueOf(i));
    }

    private final void set_currentStepProgressStepperType(ProgressStepType progressStepType) {
        ((SnapshotMutableStateImpl) this._currentStepProgressStepperType).setValue(progressStepType);
    }

    private final void set_totalSteps(int i) {
        ((SnapshotMutableStateImpl) this._totalSteps).setValue(Integer.valueOf(i));
    }

    @Nullable
    public final ProgressStepper getProgressStepper() {
        return this.progressStepper;
    }

    public final void setProgressStepper(@Nullable ProgressStepper progressStepper) {
        this.progressStepper = progressStepper;
        if (progressStepper != null) {
            set_totalSteps(progressStepper.b);
            set_currentStepPosition(progressStepper.d);
            set_currentStepProgressStepperType(ProgressStepTypeApiDataKt.a(progressStepper.c));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProgressStepperContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.h(context, "context");
    }

    public /* synthetic */ ProgressStepperContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProgressStepperContainer(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        this._totalSteps = SnapshotStateKt.f(0);
        this._currentStepPosition = SnapshotStateKt.f(0);
        this._currentStepProgressStepperType = SnapshotStateKt.f(ProgressStepType.f);
        OneShotPreDrawListener.a(this, new Runnable(this) { // from class: au.com.woolworths.feature.shop.myorders.details.progressstepper.ProgressStepperContainer$special$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                final ProgressStepperContainer progressStepperContainer = this;
                if (progressStepperContainer.getProgressStepper() != null) {
                    ComposeView composeView = new ComposeView(context, null, 6, 0);
                    composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.progressstepper.ProgressStepperContainer$1$1$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Composer composer = (Composer) obj;
                            if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                                composer.j();
                            } else {
                                final ProgressStepperContainer progressStepperContainer2 = progressStepperContainer;
                                CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-553817420, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.progressstepper.ProgressStepperContainer$1$1$1$1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj3, Object obj4) {
                                        Composer composer2 = (Composer) obj3;
                                        if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                            composer2.j();
                                        } else {
                                            ProgressStepperContainer progressStepperContainer3 = progressStepperContainer2;
                                            ProgressStepperKt.a(null, 0L, progressStepperContainer3.get_totalSteps(), progressStepperContainer3.get_currentStepPosition(), progressStepperContainer3.get_currentStepProgressStepperType(), false, null, composer2, 0, 99);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, composer));
                            }
                            return Unit.f24250a;
                        }
                    }, true, 283538008));
                    progressStepperContainer.addView(composeView);
                }
            }
        });
    }
}
