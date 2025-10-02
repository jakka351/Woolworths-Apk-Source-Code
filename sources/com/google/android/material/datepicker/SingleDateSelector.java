package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import com.google.android.material.resources.MaterialAttributes;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Locale;

@RestrictTo
/* loaded from: classes6.dex */
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new AnonymousClass2();
    public Long d;

    /* renamed from: com.google.android.material.datepicker.SingleDateSelector$2, reason: invalid class name */
    public class AnonymousClass2 implements Parcelable.Creator<SingleDateSelector> {
        @Override // android.os.Parcelable.Creator
        public final SingleDateSelector createFromParcel(Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.d = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        public final SingleDateSelector[] newArray(int i) {
            return new SingleDateSelector[i];
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final int C(Context context) {
        return MaterialAttributes.c(context, R.attr.materialCalendarTheme, MaterialDatePicker.class.getCanonicalName()).data;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final String P1(Context context) {
        Resources resources = context.getResources();
        Long l = this.d;
        return l == null ? resources.getString(R.string.mtrl_picker_date_header_unselected) : resources.getString(R.string.mtrl_picker_date_header_selected, DateStrings.d(l.longValue(), Locale.getDefault()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final ArrayList R1() {
        return new ArrayList();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final Object T0() {
        return this.d;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final void V0(long j) {
        this.d = Long.valueOf(j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final boolean r0() {
        return this.d != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    @Override // com.google.android.material.datepicker.DateSelector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View u2(android.view.LayoutInflater r9, android.view.ViewGroup r10, com.google.android.material.datepicker.CalendarConstraints r11, final com.google.android.material.datepicker.OnSelectionChangedListener r12) throws android.content.res.Resources.NotFoundException {
        /*
            r8 = this;
            r0 = 2131559171(0x7f0d0303, float:1.8743679E38)
            r1 = 0
            android.view.View r9 = r9.inflate(r0, r10, r1)
            r10 = 2131363118(0x7f0a052e, float:1.8346036E38)
            android.view.View r10 = r9.findViewById(r10)
            r4 = r10
            com.google.android.material.textfield.TextInputLayout r4 = (com.google.android.material.textfield.TextInputLayout) r4
            android.widget.EditText r10 = r4.getEditText()
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = ""
            if (r0 == 0) goto L23
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r2 = r0.toLowerCase(r2)
            goto L24
        L23:
            r2 = r1
        L24:
            java.lang.String r3 = "lge"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3c
            if (r0 == 0) goto L34
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r1 = r0.toLowerCase(r1)
        L34:
            java.lang.String r0 = "samsung"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L41
        L3c:
            r0 = 17
            r10.setInputType(r0)
        L41:
            java.text.SimpleDateFormat r3 = com.google.android.material.datepicker.UtcDates.d()
            android.content.res.Resources r0 = r9.getResources()
            java.lang.String r2 = com.google.android.material.datepicker.UtcDates.e(r0, r3)
            r4.setPlaceholderText(r2)
            java.lang.Long r0 = r8.d
            if (r0 == 0) goto L5b
            java.lang.String r0 = r3.format(r0)
            r10.setText(r0)
        L5b:
            com.google.android.material.datepicker.SingleDateSelector$1 r0 = new com.google.android.material.datepicker.SingleDateSelector$1
            r7 = r4
            r1 = r8
            r5 = r11
            r6 = r12
            r0.<init>(r2, r3, r4, r5)
            r10.addTextChangedListener(r0)
            android.widget.EditText[] r10 = new android.widget.EditText[]{r10}
            com.google.android.material.datepicker.DateSelector.b2(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.SingleDateSelector.u2(android.view.LayoutInflater, android.view.ViewGroup, com.google.android.material.datepicker.CalendarConstraints, com.google.android.material.datepicker.OnSelectionChangedListener):android.view.View");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.d);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final String y1(Context context) {
        Resources resources = context.getResources();
        Long l = this.d;
        return resources.getString(R.string.mtrl_picker_announce_current_selection, l == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : DateStrings.d(l.longValue(), Locale.getDefault()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final ArrayList z0() {
        ArrayList arrayList = new ArrayList();
        Long l = this.d;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }
}
