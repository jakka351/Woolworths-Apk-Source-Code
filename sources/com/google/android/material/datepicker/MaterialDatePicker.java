package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentTransaction;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.dialog.InsetDialogOnTouchListener;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.woolworths.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public final class MaterialDatePicker<S> extends DialogFragment {
    public TextView A;
    public CheckableImageButton B;
    public MaterialShapeDrawable C;
    public Button D;
    public boolean E;
    public CharSequence F;
    public CharSequence G;
    public final LinkedHashSet d = new LinkedHashSet();
    public final LinkedHashSet e = new LinkedHashSet();
    public final LinkedHashSet f = new LinkedHashSet();
    public final LinkedHashSet g = new LinkedHashSet();
    public int h;
    public DateSelector i;
    public PickerFragment j;
    public CalendarConstraints k;
    public DayViewDecorator l;
    public MaterialCalendar m;
    public int n;
    public CharSequence o;
    public boolean p;
    public int q;
    public int r;
    public CharSequence s;
    public int t;
    public CharSequence u;
    public int v;
    public CharSequence w;
    public int x;
    public CharSequence y;
    public TextView z;

    public static final class Builder<S> {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface InputMode {
    }

    public static int Q1(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Month month = new Month(UtcDates.f());
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding);
        int i = month.g;
        return android.support.v4.media.session.a.c(i, 1, dimensionPixelOffset2, (dimensionPixelSize * i) + (dimensionPixelOffset * 2));
    }

    public static boolean R1(int i, Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(MaterialAttributes.c(context, R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()).data, new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    public final DateSelector I1() {
        if (this.i == null) {
            this.i = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.fragment.app.Fragment, com.google.android.material.datepicker.MaterialTextInputPicker] */
    public final void b2() {
        Context contextRequireContext = requireContext();
        int iC = this.h;
        if (iC == 0) {
            iC = I1().C(contextRequireContext);
        }
        DateSelector dateSelectorI1 = I1();
        CalendarConstraints calendarConstraints = this.k;
        DayViewDecorator dayViewDecorator = this.l;
        MaterialCalendar materialCalendar = new MaterialCalendar();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", iC);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelectorI1);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.g);
        materialCalendar.setArguments(bundle);
        this.m = materialCalendar;
        if (this.q == 1) {
            DateSelector dateSelectorI12 = I1();
            CalendarConstraints calendarConstraints2 = this.k;
            ?? materialTextInputPicker = new MaterialTextInputPicker();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", iC);
            bundle2.putParcelable("DATE_SELECTOR_KEY", dateSelectorI12);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
            materialTextInputPicker.setArguments(bundle2);
            materialCalendar = materialTextInputPicker;
        }
        this.j = materialCalendar;
        this.z.setText((this.q == 1 && getResources().getConfiguration().orientation == 2) ? this.G : this.F);
        String strP1 = I1().P1(getContext());
        this.A.setContentDescription(I1().y1(requireContext()));
        this.A.setText(strP1);
        FragmentTransaction fragmentTransactionE = getChildFragmentManager().e();
        fragmentTransactionE.j(R.id.mtrl_calendar_frame, this.j, null);
        fragmentTransactionE.f();
        this.j.E1(new OnSelectionChangedListener<Object>() { // from class: com.google.android.material.datepicker.MaterialDatePicker.4
            @Override // com.google.android.material.datepicker.OnSelectionChangedListener
            public final void a() {
                MaterialDatePicker.this.D.setEnabled(false);
            }

            @Override // com.google.android.material.datepicker.OnSelectionChangedListener
            public final void b(Object obj) {
                MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
                String strP12 = materialDatePicker.I1().P1(materialDatePicker.getContext());
                materialDatePicker.A.setContentDescription(materialDatePicker.I1().y1(materialDatePicker.requireContext()));
                materialDatePicker.A.setText(strP12);
                materialDatePicker.D.setEnabled(materialDatePicker.I1().r0());
            }
        });
    }

    public final void h2(CheckableImageButton checkableImageButton) {
        this.B.setContentDescription(this.q == 1 ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.h = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.i = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.k = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.l = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.n = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.o = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.q = bundle.getInt("INPUT_MODE_KEY");
        this.r = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.s = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.t = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.u = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.v = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.w = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.x = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.y = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.o;
        if (text == null) {
            text = requireContext().getResources().getText(this.n);
        }
        this.F = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.G = text;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Context contextRequireContext = requireContext();
        Context contextRequireContext2 = requireContext();
        int iC = this.h;
        if (iC == 0) {
            iC = I1().C(contextRequireContext2);
        }
        Dialog dialog = new Dialog(contextRequireContext, iC);
        Context context = dialog.getContext();
        this.p = R1(android.R.attr.windowFullscreen, context);
        this.C = new MaterialShapeDrawable(context, null, R.attr.materialCalendarStyle, 2132084115);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, com.google.android.material.R.styleable.C, R.attr.materialCalendarStyle, 2132084115);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.C.k(context);
        this.C.m(ColorStateList.valueOf(color));
        this.C.l(ViewCompat.k(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.p ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.p) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(Q1(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(Q1(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.A = textView;
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        textView.setAccessibilityLiveRegion(1);
        this.B = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.z = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.B.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.B;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AppCompatResources.b(R.drawable.material_ic_calendar_black_24dp, context));
        stateListDrawable.addState(new int[0], AppCompatResources.b(R.drawable.material_ic_edit_black_24dp, context));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.B.setChecked(this.q != 0);
        ViewCompat.A(this.B, null);
        h2(this.B);
        this.B.setOnClickListener(new au.com.woolworths.base.shopapp.customviews.a(this, 14));
        this.D = (Button) viewInflate.findViewById(R.id.confirm_button);
        if (I1().r0()) {
            this.D.setEnabled(true);
        } else {
            this.D.setEnabled(false);
        }
        this.D.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.s;
        if (charSequence != null) {
            this.D.setText(charSequence);
        } else {
            int i = this.r;
            if (i != 0) {
                this.D.setText(i);
            }
        }
        CharSequence charSequence2 = this.u;
        if (charSequence2 != null) {
            this.D.setContentDescription(charSequence2);
        } else if (this.t != 0) {
            this.D.setContentDescription(getContext().getResources().getText(this.t));
        }
        this.D.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialDatePicker.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
                Callback.g(view);
                try {
                    Iterator it = materialDatePicker.d.iterator();
                    while (it.hasNext()) {
                        MaterialPickerOnPositiveButtonClickListener materialPickerOnPositiveButtonClickListener = (MaterialPickerOnPositiveButtonClickListener) it.next();
                        materialDatePicker.I1().getClass();
                        materialPickerOnPositiveButtonClickListener.a();
                    }
                    materialDatePicker.dismiss();
                    Callback.h();
                } catch (Throwable th) {
                    Callback.h();
                    throw th;
                }
            }
        });
        Button button = (Button) viewInflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.w;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i2 = this.v;
            if (i2 != 0) {
                button.setText(i2);
            }
        }
        CharSequence charSequence4 = this.y;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.x != 0) {
            button.setContentDescription(getContext().getResources().getText(this.x));
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialDatePicker.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
                Callback.g(view);
                try {
                    Iterator it = materialDatePicker.e.iterator();
                    while (it.hasNext()) {
                        ((View.OnClickListener) it.next()).onClick(view);
                    }
                    materialDatePicker.dismiss();
                    Callback.h();
                } catch (Throwable th) {
                    Callback.h();
                    throw th;
                }
            }
        });
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.h);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.i);
        CalendarConstraints calendarConstraints = this.k;
        CalendarConstraints.Builder builder = new CalendarConstraints.Builder();
        int i = CalendarConstraints.Builder.c;
        int i2 = CalendarConstraints.Builder.c;
        builder.b = new DateValidatorPointForward(Long.MIN_VALUE);
        long j = calendarConstraints.d.i;
        long j2 = calendarConstraints.e.i;
        builder.f14561a = Long.valueOf(calendarConstraints.g.i);
        int i3 = calendarConstraints.h;
        CalendarConstraints.DateValidator dateValidator = calendarConstraints.f;
        builder.b = dateValidator;
        MaterialCalendar materialCalendar = this.m;
        Month month = materialCalendar == null ? null : materialCalendar.i;
        if (month != null) {
            builder.f14561a = Long.valueOf(month.i);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", dateValidator);
        Month monthB = Month.b(j);
        Month monthB2 = Month.b(j2);
        CalendarConstraints.DateValidator dateValidator2 = (CalendarConstraints.DateValidator) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = builder.f14561a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new CalendarConstraints(monthB, monthB2, dateValidator2, l == null ? null : Month.b(l.longValue()), i3));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.l);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.n);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.o);
        bundle.putInt("INPUT_MODE_KEY", this.q);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.r);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.s);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.t);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.u);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.v);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.w);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.x);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.y);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() throws Resources.NotFoundException {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.p) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.C);
            if (!this.E) {
                final View viewFindViewById = requireView().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListD = DrawableUtils.d(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListD != null ? Integer.valueOf(colorStateListD.getDefaultColor()) : null;
                boolean z = numValueOf == null || numValueOf.intValue() == 0;
                int iC = MaterialColors.c(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z) {
                    numValueOf = Integer.valueOf(iC);
                }
                WindowCompat.b(window, false);
                window.getContext();
                window.getContext();
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
                new WindowInsetsControllerCompat(window, window.getDecorView()).e(MaterialColors.f(0) || MaterialColors.f(numValueOf.intValue()));
                new WindowInsetsControllerCompat(window, window.getDecorView()).d(MaterialColors.f(0) || MaterialColors.f(iC));
                final int paddingTop = viewFindViewById.getPaddingTop();
                final int i = viewFindViewById.getLayoutParams().height;
                ViewCompat.I(viewFindViewById, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.datepicker.MaterialDatePicker.3
                    @Override // androidx.core.view.OnApplyWindowInsetsListener
                    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                        int i2 = windowInsetsCompat.e(519).b;
                        View view2 = viewFindViewById;
                        int i3 = i;
                        if (i3 >= 0) {
                            view2.getLayoutParams().height = i3 + i2;
                            view2.setLayoutParams(view2.getLayoutParams());
                        }
                        view2.setPadding(view2.getPaddingLeft(), paddingTop + i2, view2.getPaddingRight(), view2.getPaddingBottom());
                        return windowInsetsCompat;
                    }
                });
                this.E = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.C, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new InsetDialogOnTouchListener(requireDialog(), rect));
        }
        b2();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        this.j.d.clear();
        super.onStop();
    }
}
