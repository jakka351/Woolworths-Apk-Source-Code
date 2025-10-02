package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.annotation.RestrictTo;
import androidx.core.util.Pair;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.textfield.TextInputLayout;
import com.woolworths.R;
import java.util.ArrayList;

@RestrictTo
/* loaded from: classes6.dex */
public class RangeDateSelector implements DateSelector<Pair<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new AnonymousClass3();
    public String d;
    public Long e;
    public Long f;
    public Long g;
    public Long h;

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$3, reason: invalid class name */
    public class AnonymousClass3 implements Parcelable.Creator<RangeDateSelector> {
        @Override // android.os.Parcelable.Creator
        public final RangeDateSelector createFromParcel(Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.e = null;
            rangeDateSelector.f = null;
            rangeDateSelector.g = null;
            rangeDateSelector.h = null;
            rangeDateSelector.e = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.f = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        public final RangeDateSelector[] newArray(int i) {
            return new RangeDateSelector[i];
        }
    }

    public static void a(RangeDateSelector rangeDateSelector, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, OnSelectionChangedListener onSelectionChangedListener) throws Resources.NotFoundException {
        Long l = rangeDateSelector.g;
        if (l == null || rangeDateSelector.h == null) {
            if (textInputLayout.getError() != null && rangeDateSelector.d.contentEquals(textInputLayout.getError())) {
                textInputLayout.setError(null);
            }
            if (textInputLayout2.getError() != null && " ".contentEquals(textInputLayout2.getError())) {
                textInputLayout2.setError(null);
            }
            onSelectionChangedListener.a();
        } else if (l.longValue() <= rangeDateSelector.h.longValue()) {
            Long l2 = rangeDateSelector.g;
            rangeDateSelector.e = l2;
            Long l3 = rangeDateSelector.h;
            rangeDateSelector.f = l3;
            onSelectionChangedListener.b(new Pair(l2, l3));
        } else {
            textInputLayout.setError(rangeDateSelector.d);
            textInputLayout2.setError(" ");
            onSelectionChangedListener.a();
        }
        if (!TextUtils.isEmpty(textInputLayout.getError())) {
            textInputLayout.getError();
        } else {
            if (TextUtils.isEmpty(textInputLayout2.getError())) {
                return;
            }
            textInputLayout2.getError();
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final int C(Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return MaterialAttributes.c(context, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(R.dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? R.attr.materialCalendarTheme : R.attr.materialCalendarFullscreenTheme, MaterialDatePicker.class.getCanonicalName()).data;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final String P1(Context context) {
        Resources resources = context.getResources();
        Long l = this.e;
        if (l == null && this.f == null) {
            return resources.getString(R.string.mtrl_picker_range_header_unselected);
        }
        Long l2 = this.f;
        if (l2 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_start_selected, DateStrings.b(l.longValue()));
        }
        if (l == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_end_selected, DateStrings.b(l2.longValue()));
        }
        Pair pairA = DateStrings.a(l, l2);
        return resources.getString(R.string.mtrl_picker_range_header_selected, pairA.f2463a, pairA.b);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final ArrayList R1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(this.e, this.f));
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final Object T0() {
        return new Pair(this.e, this.f);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final void V0(long j) {
        Long l = this.e;
        if (l == null) {
            this.e = Long.valueOf(j);
        } else if (this.f == null && l.longValue() <= j) {
            this.f = Long.valueOf(j);
        } else {
            this.f = null;
            this.e = Long.valueOf(j);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final boolean r0() {
        Long l = this.e;
        return (l == null || this.f == null || l.longValue() > this.f.longValue()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    @Override // com.google.android.material.datepicker.DateSelector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View u2(android.view.LayoutInflater r11, android.view.ViewGroup r12, com.google.android.material.datepicker.CalendarConstraints r13, final com.google.android.material.datepicker.OnSelectionChangedListener r14) throws android.content.res.Resources.NotFoundException {
        /*
            r10 = this;
            r0 = 2131559172(0x7f0d0304, float:1.874368E38)
            r1 = 0
            android.view.View r11 = r11.inflate(r0, r12, r1)
            r12 = 2131363120(0x7f0a0530, float:1.834604E38)
            android.view.View r12 = r11.findViewById(r12)
            r4 = r12
            com.google.android.material.textfield.TextInputLayout r4 = (com.google.android.material.textfield.TextInputLayout) r4
            r12 = 2131363119(0x7f0a052f, float:1.8346038E38)
            android.view.View r12 = r11.findViewById(r12)
            r7 = r12
            com.google.android.material.textfield.TextInputLayout r7 = (com.google.android.material.textfield.TextInputLayout) r7
            android.widget.EditText r12 = r4.getEditText()
            android.widget.EditText r9 = r7.getEditText()
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = ""
            if (r0 == 0) goto L31
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r2 = r0.toLowerCase(r2)
            goto L32
        L31:
            r2 = r1
        L32:
            java.lang.String r3 = "lge"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4a
            if (r0 == 0) goto L42
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r1 = r0.toLowerCase(r1)
        L42:
            java.lang.String r0 = "samsung"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L52
        L4a:
            r0 = 17
            r12.setInputType(r0)
            r9.setInputType(r0)
        L52:
            android.content.res.Resources r0 = r11.getResources()
            r1 = 2132018311(0x7f140487, float:1.9674925E38)
            java.lang.String r0 = r0.getString(r1)
            r10.d = r0
            java.text.SimpleDateFormat r3 = com.google.android.material.datepicker.UtcDates.d()
            java.lang.Long r0 = r10.e
            if (r0 == 0) goto L72
            java.lang.String r0 = r3.format(r0)
            r12.setText(r0)
            java.lang.Long r0 = r10.e
            r10.g = r0
        L72:
            java.lang.Long r0 = r10.f
            if (r0 == 0) goto L81
            java.lang.String r0 = r3.format(r0)
            r9.setText(r0)
            java.lang.Long r0 = r10.f
            r10.h = r0
        L81:
            android.content.res.Resources r0 = r11.getResources()
            java.lang.String r2 = com.google.android.material.datepicker.UtcDates.e(r0, r3)
            r4.setPlaceholderText(r2)
            r7.setPlaceholderText(r2)
            com.google.android.material.datepicker.RangeDateSelector$1 r0 = new com.google.android.material.datepicker.RangeDateSelector$1
            r6 = r4
            r1 = r10
            r5 = r13
            r8 = r14
            r0.<init>(r2, r3, r4, r5)
            r12.addTextChangedListener(r0)
            com.google.android.material.datepicker.RangeDateSelector$2 r0 = new com.google.android.material.datepicker.RangeDateSelector$2
            r4 = r7
            r0.<init>(r2, r3, r4, r5)
            r9.addTextChangedListener(r0)
            android.widget.EditText[] r12 = new android.widget.EditText[]{r12, r9}
            com.google.android.material.datepicker.DateSelector.b2(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.RangeDateSelector.u2(android.view.LayoutInflater, android.view.ViewGroup, com.google.android.material.datepicker.CalendarConstraints, com.google.android.material.datepicker.OnSelectionChangedListener):android.view.View");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.e);
        parcel.writeValue(this.f);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final String y1(Context context) {
        Resources resources = context.getResources();
        Pair pairA = DateStrings.a(this.e, this.f);
        Object obj = pairA.f2463a;
        String string = obj == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : (String) obj;
        Object obj2 = pairA.b;
        return resources.getString(R.string.mtrl_picker_announce_current_range_selection, string, obj2 == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : (String) obj2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final ArrayList z0() {
        ArrayList arrayList = new ArrayList();
        Long l = this.e;
        if (l != null) {
            arrayList.add(l);
        }
        Long l2 = this.f;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }
}
