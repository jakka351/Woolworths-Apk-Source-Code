package com.google.android.material.datepicker;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.material.dialog.InsetDialogOnTouchListener;
import com.google.android.material.dialog.MaterialDialogs;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.woolworths.R;

@RestrictTo
/* loaded from: classes6.dex */
public class MaterialStyledDatePickerDialog extends DatePickerDialog {
    public final InsetDrawable d;
    public final Rect e;

    public MaterialStyledDatePickerDialog(@NonNull Context context) {
        super(context, 0, null, -1, -1, -1);
        Context context2 = getContext();
        int i = MaterialAttributes.c(getContext(), R.attr.colorSurface, getClass().getCanonicalName()).data;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context2, null, android.R.attr.datePickerStyle, 2132083139);
        materialShapeDrawable.m(ColorStateList.valueOf(i));
        Rect rectA = MaterialDialogs.a(context2, android.R.attr.datePickerStyle, 2132083139);
        this.e = rectA;
        this.d = new InsetDrawable((Drawable) materialShapeDrawable, rectA.left, rectA.top, rectA.right, rectA.bottom);
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(this.d);
        getWindow().getDecorView().setOnTouchListener(new InsetDialogOnTouchListener(this, this.e));
    }
}
