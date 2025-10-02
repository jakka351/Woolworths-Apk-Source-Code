package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.TextInputLayout;
import com.woolworths.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes6.dex */
abstract class DateFormatTextWatcher extends TextWatcherAdapter {
    public final TextInputLayout d;
    public final String e;
    public final SimpleDateFormat f;
    public final CalendarConstraints g;
    public final String h;
    public final a i;
    public b j;
    public int k = 0;

    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.material.datepicker.a] */
    public DateFormatTextWatcher(final String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.e = str;
        this.f = simpleDateFormat;
        this.d = textInputLayout;
        this.g = calendarConstraints;
        this.h = textInputLayout.getContext().getString(R.string.mtrl_picker_out_of_range);
        this.i = new Runnable() { // from class: com.google.android.material.datepicker.a
            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                DateFormatTextWatcher dateFormatTextWatcher = this.d;
                TextInputLayout textInputLayout2 = dateFormatTextWatcher.d;
                SimpleDateFormat simpleDateFormat2 = dateFormatTextWatcher.f;
                Context context = textInputLayout2.getContext();
                textInputLayout2.setError(androidx.constraintlayout.core.state.a.j(context.getString(R.string.mtrl_picker_invalid_format), "\n", String.format(context.getString(R.string.mtrl_picker_invalid_format_use), str.replace(' ', (char) 160)), "\n", String.format(context.getString(R.string.mtrl_picker_invalid_format_example), simpleDateFormat2.format(new Date(UtcDates.f().getTimeInMillis())).replace(' ', (char) 160))));
                dateFormatTextWatcher.a();
            }
        };
    }

    public void a() {
    }

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) || editable.length() == 0) {
            return;
        }
        int length = editable.length();
        String str = this.e;
        if (length >= str.length() || editable.length() < this.k) {
            return;
        }
        char cCharAt = str.charAt(editable.length());
        if (Character.isLetterOrDigit(cCharAt)) {
            return;
        }
        editable.append(cCharAt);
    }

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.k = charSequence.length();
    }

    public abstract void c(Long l);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.google.android.material.datepicker.b, java.lang.Runnable] */
    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Resources.NotFoundException, ParseException {
        CalendarConstraints calendarConstraints = this.g;
        TextInputLayout textInputLayout = this.d;
        a aVar = this.i;
        textInputLayout.removeCallbacks(aVar);
        textInputLayout.removeCallbacks(this.j);
        textInputLayout.setError(null);
        c(null);
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.e.length()) {
            return;
        }
        try {
            Date date = this.f.parse(charSequence.toString());
            textInputLayout.setError(null);
            final long time = date.getTime();
            if (calendarConstraints.f.d0(time)) {
                Calendar calendarC = UtcDates.c(calendarConstraints.d.d);
                calendarC.set(5, 1);
                if (calendarC.getTimeInMillis() <= time) {
                    Month month = calendarConstraints.e;
                    int i4 = month.h;
                    Calendar calendarC2 = UtcDates.c(month.d);
                    calendarC2.set(5, i4);
                    if (time <= calendarC2.getTimeInMillis()) {
                        c(Long.valueOf(date.getTime()));
                        return;
                    }
                }
            }
            ?? r7 = new Runnable() { // from class: com.google.android.material.datepicker.b
                @Override // java.lang.Runnable
                public final void run() throws Resources.NotFoundException {
                    String strB = DateStrings.b(time);
                    DateFormatTextWatcher dateFormatTextWatcher = this.d;
                    dateFormatTextWatcher.d.setError(String.format(dateFormatTextWatcher.h, strB.replace(' ', (char) 160)));
                    dateFormatTextWatcher.a();
                }
            };
            this.j = r7;
            textInputLayout.post(r7);
        } catch (ParseException unused) {
            textInputLayout.post(aVar);
        }
    }
}
