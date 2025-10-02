package au.com.woolworths.android.onesite.modules.customviews.statefulbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.navigation.ui.a;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import au.com.woolworths.android.onesite.base.ui.databinding.StatefulButtonCheckedBinding;
import au.com.woolworths.android.onesite.utils.Extensions;
import com.google.android.material.button.MaterialButton;
import com.woolworths.R;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\n2\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lau/com/woolworths/android/onesite/modules/customviews/statefulbutton/StatefulButton;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lau/com/woolworths/android/onesite/modules/customviews/statefulbutton/StatefulButtonClickHandler;", "handler", "", "setClickHandler", "(Lau/com/woolworths/android/onesite/modules/customviews/statefulbutton/StatefulButtonClickHandler;)V", "Landroid/content/res/ColorStateList;", "tint", "setBackgroundTintList", "(Landroid/content/res/ColorStateList;)V", "Lau/com/woolworths/android/onesite/modules/customviews/statefulbutton/StatefulButtonState;", "state", "setStatefulButtonState", "(Lau/com/woolworths/android/onesite/modules/customviews/statefulbutton/StatefulButtonState;)V", "", "resId", "setEndDrawable", "(Ljava/lang/Integer;)V", "Type", "Companion", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class StatefulButton extends FrameLayout {
    public static final /* synthetic */ int i = 0;
    public final MaterialButton d;
    public final MaterialButton e;
    public final ImageView f;
    public StatefulButtonState g;
    public final StatefulButtonCheckedBinding h;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/android/onesite/modules/customviews/statefulbutton/StatefulButton$Companion;", "", "", "LOADING_PROGRESS_BAR_TRANSLATION_Z", "F", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/customviews/statefulbutton/StatefulButton$Type;", "", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Type {
        public static final /* synthetic */ Type[] e;
        public static final /* synthetic */ EnumEntries f;
        public final int d;

        static {
            Type[] typeArr = {new Type("CONTAINED_BUTTON", 0, R.attr.materialButtonStyle), new Type("OUTLINED_BUTTON", 1, R.attr.materialButtonOutlinedStyle)};
            e = typeArr;
            f = EnumEntriesKt.a(typeArr);
        }

        public Type(String str, int i, int i2) {
            this.d = i2;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) e.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[StatefulButtonState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                StatefulButtonState statefulButtonState = StatefulButtonState.d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                StatefulButtonState statefulButtonState2 = StatefulButtonState.d;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                StatefulButtonState statefulButtonState3 = StatefulButtonState.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StatefulButton(@NotNull Context context, @NotNull AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        Intrinsics.h(context, "context");
        Intrinsics.h(attributeSet, "attributeSet");
        this.g = StatefulButtonState.d;
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        int i2 = StatefulButtonCheckedBinding.C;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        StatefulButtonCheckedBinding statefulButtonCheckedBinding = (StatefulButtonCheckedBinding) ViewDataBinding.q((LayoutInflater) systemService, R.layout.stateful_button_checked, this, true, null);
        Intrinsics.g(statefulButtonCheckedBinding, "inflate(...)");
        this.h = statefulButtonCheckedBinding;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, au.com.woolworths.android.onesite.base.R.styleable.e, 0, 0);
        Type type = (Type) Type.f.get(typedArrayObtainStyledAttributes.getInteger(1, 0));
        int color = typedArrayObtainStyledAttributes.getColor(0, Extensions.a(R.attr.colorPrimary, context));
        typedArrayObtainStyledAttributes.recycle();
        if (type == null) {
            Intrinsics.p("buttonType");
            throw null;
        }
        int i3 = type.d;
        MaterialButton materialButton = new MaterialButton(context, null, i3);
        materialButton.setId(R.id.stateful_button_normal);
        materialButton.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.d = materialButton;
        addView(materialButton);
        MaterialButton materialButton2 = new MaterialButton(context, null, i3);
        materialButton2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        materialButton2.setClickable(false);
        materialButton2.setEnabled(false);
        this.e = materialButton2;
        ImageView imageView = new ImageView(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.stateful_button_loading_spinner_size);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.stateful_button_loading_spinner_stroke);
        CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(context);
        circularProgressDrawable.d(dimensionPixelSize2);
        circularProgressDrawable.b(color);
        circularProgressDrawable.start();
        imageView.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        Intrinsics.f(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        imageView.setTranslationZ(10.0f);
        imageView.setImageDrawable(circularProgressDrawable);
        this.f = imageView;
        View view = this.e;
        if (view == null) {
            Intrinsics.p("loadingButton");
            throw null;
        }
        addView(view);
        View view2 = this.f;
        if (view2 == null) {
            Intrinsics.p("loadingProgressBar");
            throw null;
        }
        addView(view2);
        setStatefulButtonState(this.g);
    }

    public final void a(String normalText, String checkedText) {
        Intrinsics.h(normalText, "normalText");
        Intrinsics.h(checkedText, "checkedText");
        MaterialButton materialButton = this.d;
        if (materialButton == null) {
            Intrinsics.p("normalButton");
            throw null;
        }
        materialButton.setText(normalText);
        MaterialButton materialButton2 = this.d;
        if (materialButton2 == null) {
            Intrinsics.p("normalButton");
            throw null;
        }
        materialButton2.requestLayout();
        this.h.A.setText(checkedText);
    }

    @Override // android.view.View
    public final boolean performClick() {
        MaterialButton materialButton = this.d;
        if (materialButton != null) {
            materialButton.performClick();
            return super.performClick();
        }
        Intrinsics.p("normalButton");
        throw null;
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList tint) {
        MaterialButton materialButton = this.d;
        if (materialButton == null) {
            Intrinsics.p("normalButton");
            throw null;
        }
        materialButton.setBackgroundTintList(tint);
        MaterialButton materialButton2 = this.e;
        if (materialButton2 != null) {
            materialButton2.setBackgroundTintList(tint);
        } else {
            Intrinsics.p("loadingButton");
            throw null;
        }
    }

    public final void setClickHandler(@NotNull StatefulButtonClickHandler handler) {
        Intrinsics.h(handler, "handler");
        MaterialButton materialButton = this.d;
        if (materialButton != null) {
            materialButton.setOnClickListener(new a(5, handler, this));
        } else {
            Intrinsics.p("normalButton");
            throw null;
        }
    }

    public final void setEndDrawable(@DrawableRes @Nullable Integer resId) {
        MaterialButton materialButton = this.d;
        if (materialButton == null) {
            Intrinsics.p("normalButton");
            throw null;
        }
        materialButton.setIconResource(resId != null ? resId.intValue() : 0);
        MaterialButton materialButton2 = this.d;
        if (materialButton2 != null) {
            materialButton2.setIconGravity(4);
        } else {
            Intrinsics.p("normalButton");
            throw null;
        }
    }

    public final void setStatefulButtonState(@NotNull StatefulButtonState state) {
        Intrinsics.h(state, "state");
        this.g = state;
        this.h.L(state);
        int iOrdinal = state.ordinal();
        if (iOrdinal == 0) {
            MaterialButton materialButton = this.d;
            if (materialButton == null) {
                Intrinsics.p("normalButton");
                throw null;
            }
            materialButton.setVisibility(0);
            MaterialButton materialButton2 = this.d;
            if (materialButton2 == null) {
                Intrinsics.p("normalButton");
                throw null;
            }
            materialButton2.setEnabled(true);
            MaterialButton materialButton3 = this.e;
            if (materialButton3 == null) {
                Intrinsics.p("loadingButton");
                throw null;
            }
            materialButton3.setVisibility(8);
            ImageView imageView = this.f;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            } else {
                Intrinsics.p("loadingProgressBar");
                throw null;
            }
        }
        if (iOrdinal == 1) {
            MaterialButton materialButton4 = this.d;
            if (materialButton4 == null) {
                Intrinsics.p("normalButton");
                throw null;
            }
            materialButton4.setVisibility(8);
            MaterialButton materialButton5 = this.e;
            if (materialButton5 == null) {
                Intrinsics.p("loadingButton");
                throw null;
            }
            materialButton5.setVisibility(0);
            ImageView imageView2 = this.f;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
                return;
            } else {
                Intrinsics.p("loadingProgressBar");
                throw null;
            }
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            MaterialButton materialButton6 = this.d;
            if (materialButton6 == null) {
                Intrinsics.p("normalButton");
                throw null;
            }
            materialButton6.setVisibility(8);
            MaterialButton materialButton7 = this.e;
            if (materialButton7 == null) {
                Intrinsics.p("loadingButton");
                throw null;
            }
            materialButton7.setVisibility(8);
            ImageView imageView3 = this.f;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
                return;
            } else {
                Intrinsics.p("loadingProgressBar");
                throw null;
            }
        }
        MaterialButton materialButton8 = this.d;
        if (materialButton8 == null) {
            Intrinsics.p("normalButton");
            throw null;
        }
        materialButton8.setVisibility(0);
        MaterialButton materialButton9 = this.d;
        if (materialButton9 == null) {
            Intrinsics.p("normalButton");
            throw null;
        }
        materialButton9.setEnabled(false);
        MaterialButton materialButton10 = this.e;
        if (materialButton10 == null) {
            Intrinsics.p("loadingButton");
            throw null;
        }
        materialButton10.setVisibility(8);
        ImageView imageView4 = this.f;
        if (imageView4 != null) {
            imageView4.setVisibility(8);
        } else {
            Intrinsics.p("loadingProgressBar");
            throw null;
        }
    }
}
