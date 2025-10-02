package com.google.android.gms.wallet.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.wallet.R;
import com.google.android.gms.wallet.button.ButtonOptions;

/* loaded from: classes2.dex */
public final class PayButton extends FrameLayout implements View.OnClickListener {

    @Nullable
    private View.OnClickListener zza;
    private ButtonOptions.Builder zzb;

    @Nullable
    private View zzc;
    private final zzf zzd;

    public PayButton(@NonNull Context context) {
        this(context, null);
    }

    private final void zza(ButtonOptions buttonOptions) throws Resources.NotFoundException {
        Drawable rippleDrawable;
        removeAllViews();
        zzg zzgVar = new zzg(new ContextThemeWrapper(getContext(), buttonOptions.getButtonTheme() == 2 ? R.style.PayButtonGenericLightTheme : R.style.PayButtonGenericDarkTheme), null);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(zzgVar.getContext()).inflate(R.layout.paybutton_generic, (ViewGroup) zzgVar, true).findViewById(R.id.pay_button_view);
        Context context = zzgVar.getContext();
        int cornerRadius = buttonOptions.getCornerRadius();
        GradientDrawable gradientDrawable = (GradientDrawable) zzh.zza(context, R.attr.payButtonGenericBackground).mutate();
        float f = cornerRadius;
        gradientDrawable.setCornerRadius(f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.payButtonGenericRippleColor});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(color);
        if (PlatformVersion.isAtLeastLollipop()) {
            rippleDrawable = new RippleDrawable(colorStateListValueOf, gradientDrawable, null);
        } else {
            GradientDrawable gradientDrawable2 = (GradientDrawable) zzh.zza(context, R.attr.payButtonGenericRippleMask).mutate();
            gradientDrawable2.setCornerRadius(f);
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, gradientDrawable2});
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, layerDrawable);
            stateListDrawable.addState(new int[0], gradientDrawable);
            rippleDrawable = stateListDrawable;
        }
        linearLayout.setBackground(rippleDrawable);
        zzgVar.setContentDescription(zzgVar.getContext().getString(R.string.gpay_logo_description));
        this.zzc = zzgVar;
        addView(zzgVar);
        this.zzc.setOnClickListener(this);
    }

    public void initialize(@NonNull ButtonOptions buttonOptions) throws Resources.NotFoundException {
        ButtonOptions.Builder builder = this.zzb;
        if (buttonOptions.getButtonType() != 0) {
            ButtonOptions.this.zza = buttonOptions.getButtonType();
        }
        if (buttonOptions.getButtonTheme() != 0) {
            ButtonOptions.this.zzb = buttonOptions.getButtonTheme();
        }
        if (buttonOptions.zze) {
            builder.setCornerRadius(buttonOptions.getCornerRadius());
        }
        if (buttonOptions.getAllowedPaymentMethods() != null) {
            ButtonOptions.this.zzd = buttonOptions.getAllowedPaymentMethods();
        }
        if (isInEditMode()) {
            zza(this.zzb.build());
            return;
        }
        removeAllViews();
        ButtonOptions buttonOptionsBuild = this.zzb.build();
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(getContext(), 232100000) != 0) {
            zza(buttonOptionsBuild);
            Log.e("PayButton", "Failed to create latest buttonView: Google Play Services version is outdated.");
        } else {
            if (TextUtils.isEmpty(buttonOptionsBuild.getAllowedPaymentMethods())) {
                Log.e("PayButton", "Failed to create buttonView: allowedPaymentMethods cannot be empty.");
                return;
            }
            View viewZza = zzf.zza((Context) Preconditions.checkNotNull(getContext()), buttonOptionsBuild);
            this.zzc = viewZza;
            if (viewZza == null) {
                Log.e("PayButton", "Failed to create buttonView");
            } else {
                addView(viewZza);
                this.zzc.setOnClickListener(this);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NonNull View view) {
        Callback.g(view);
        try {
            View.OnClickListener onClickListener = this.zza;
            if (onClickListener != null && view == this.zzc) {
                onClickListener.onClick(this);
            }
        } finally {
            Callback.h();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.zza = onClickListener;
    }

    public PayButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PayButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        ButtonOptions.Builder builderNewBuilder = ButtonOptions.newBuilder();
        this.zzb = builderNewBuilder;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PayButtonAttributes);
        int i2 = typedArrayObtainStyledAttributes.getInt(R.styleable.PayButtonAttributes_buttonTheme, 1);
        int iApplyDimension = (int) TypedValue.applyDimension(1, 100.0f, Resources.getSystem().getDisplayMetrics());
        int i3 = R.styleable.PayButtonAttributes_cornerRadius;
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(i3, iApplyDimension);
        ButtonOptions buttonOptions = ButtonOptions.this;
        buttonOptions.zzb = i2;
        buttonOptions.zzc = dimensionPixelSize;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            ButtonOptions.this.zze = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        builderNewBuilder.setButtonType(1);
        this.zzd = new zzf();
        if (isInEditMode()) {
            zza(this.zzb.build());
        }
    }
}
