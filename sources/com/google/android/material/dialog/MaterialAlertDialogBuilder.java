package com.google.android.material.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.woolworths.R;

/* loaded from: classes6.dex */
public class MaterialAlertDialogBuilder extends AlertDialog.Builder {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialShapeDrawable f14572a;
    public final Rect b;

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialAlertDialogBuilder(@NonNull Context context) {
        TypedValue typedValueA = MaterialAttributes.a(R.attr.materialAlertDialogTheme, context);
        int i = typedValueA == null ? 0 : typedValueA.data;
        Context contextA = MaterialThemeOverlay.a(context, null, R.attr.alertDialogStyle, 2132083136);
        contextA = i != 0 ? new ContextThemeWrapper(contextA, i) : contextA;
        TypedValue typedValueA2 = MaterialAttributes.a(R.attr.materialAlertDialogTheme, context);
        super(contextA, typedValueA2 != null ? typedValueA2.data : 0);
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        this.b = MaterialDialogs.a(context2, R.attr.alertDialogStyle, 2132083136);
        int iD = MaterialColors.d(context2, R.attr.colorSurface, getClass().getCanonicalName());
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, com.google.android.material.R.styleable.y, R.attr.alertDialogStyle, 2132083136);
        int color = typedArrayObtainStyledAttributes.getColor(4, iD);
        typedArrayObtainStyledAttributes.recycle();
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context2, null, R.attr.alertDialogStyle, 2132083136);
        materialShapeDrawable.k(context2);
        materialShapeDrawable.m(ColorStateList.valueOf(color));
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
        float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
        if (typedValue.type == 5 && dimension >= BitmapDescriptorFactory.HUE_RED) {
            ShapeAppearanceModel.Builder builderG = materialShapeDrawable.d.f14634a.g();
            builderG.b(dimension);
            materialShapeDrawable.setShapeAppearanceModel(builderG.a());
        }
        this.f14572a = materialShapeDrawable;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog create() {
        AlertDialog alertDialogCreate = super.create();
        Window window = alertDialogCreate.getWindow();
        View decorView = window.getDecorView();
        MaterialShapeDrawable materialShapeDrawable = this.f14572a;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.l(ViewCompat.k(decorView));
        }
        Rect rect = this.b;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) materialShapeDrawable, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new InsetDialogOnTouchListener(alertDialogCreate, rect));
        return alertDialogCreate;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setAdapter(listAdapter, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setCancelable(boolean z) {
        return (MaterialAlertDialogBuilder) super.setCancelable(z);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
        return (MaterialAlertDialogBuilder) super.setCursor(cursor, onClickListener, str);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setCustomTitle(View view) {
        return (MaterialAlertDialogBuilder) super.setCustomTitle(view);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setIcon(int i) {
        return (MaterialAlertDialogBuilder) super.setIcon(i);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setIconAttribute(int i) {
        return (MaterialAlertDialogBuilder) super.setIconAttribute(i);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setItems(int i, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setItems(i, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setMessage(int i) {
        return (MaterialAlertDialogBuilder) super.setMessage(i);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setMultiChoiceItems(int i, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder) super.setMultiChoiceItems(i, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNegativeButton(i, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setNegativeButtonIcon(Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setNegativeButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setNeutralButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNeutralButton(i, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setNeutralButtonIcon(Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setNeutralButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return (MaterialAlertDialogBuilder) super.setOnCancelListener(onCancelListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return (MaterialAlertDialogBuilder) super.setOnDismissListener(onDismissListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        return (MaterialAlertDialogBuilder) super.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
        return (MaterialAlertDialogBuilder) super.setOnKeyListener(onKeyListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setPositiveButton(i, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setPositiveButtonIcon(Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setPositiveButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setSingleChoiceItems(int i, int i2, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(i, i2, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setTitle(int i) {
        return (MaterialAlertDialogBuilder) super.setTitle(i);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setView(int i) {
        return (MaterialAlertDialogBuilder) super.setView(i);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setIcon(Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setItems(charSequenceArr, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setMessage(CharSequence charSequence) {
        return (MaterialAlertDialogBuilder) super.setMessage(charSequence);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder) super.setMultiChoiceItems(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNegativeButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNeutralButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setPositiveButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setSingleChoiceItems(Cursor cursor, int i, String str, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(cursor, i, str, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setTitle(CharSequence charSequence) {
        return (MaterialAlertDialogBuilder) super.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setView(View view) {
        return (MaterialAlertDialogBuilder) super.setView(view);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder) super.setMultiChoiceItems(cursor, str, str2, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setSingleChoiceItems(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(charSequenceArr, i, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public final AlertDialog.Builder setSingleChoiceItems(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(listAdapter, i, onClickListener);
    }
}
