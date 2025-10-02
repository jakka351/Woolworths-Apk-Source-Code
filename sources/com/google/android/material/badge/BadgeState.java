package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo
/* loaded from: classes6.dex */
public final class BadgeState {

    /* renamed from: a, reason: collision with root package name */
    public final State f14518a;
    public final State b = new State();
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final int k;

    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new AnonymousClass1();
        public Integer A;
        public Integer B;
        public Integer C;
        public Integer D;
        public Integer E;
        public Integer F;
        public Boolean G;
        public int d;
        public Integer e;
        public Integer f;
        public Integer g;
        public Integer h;
        public Integer i;
        public Integer j;
        public Integer k;
        public String m;
        public Locale q;
        public CharSequence r;
        public CharSequence s;
        public int t;
        public int u;
        public Integer v;
        public Integer x;
        public Integer y;
        public Integer z;
        public int l = 255;
        public int n = -2;
        public int o = -2;
        public int p = -2;
        public Boolean w = Boolean.TRUE;

        /* renamed from: com.google.android.material.badge.BadgeState$State$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                State state = new State();
                state.l = 255;
                state.n = -2;
                state.o = -2;
                state.p = -2;
                state.w = Boolean.TRUE;
                state.d = parcel.readInt();
                state.e = (Integer) parcel.readSerializable();
                state.f = (Integer) parcel.readSerializable();
                state.g = (Integer) parcel.readSerializable();
                state.h = (Integer) parcel.readSerializable();
                state.i = (Integer) parcel.readSerializable();
                state.j = (Integer) parcel.readSerializable();
                state.k = (Integer) parcel.readSerializable();
                state.l = parcel.readInt();
                state.m = parcel.readString();
                state.n = parcel.readInt();
                state.o = parcel.readInt();
                state.p = parcel.readInt();
                state.r = parcel.readString();
                state.s = parcel.readString();
                state.t = parcel.readInt();
                state.v = (Integer) parcel.readSerializable();
                state.x = (Integer) parcel.readSerializable();
                state.y = (Integer) parcel.readSerializable();
                state.z = (Integer) parcel.readSerializable();
                state.A = (Integer) parcel.readSerializable();
                state.B = (Integer) parcel.readSerializable();
                state.C = (Integer) parcel.readSerializable();
                state.F = (Integer) parcel.readSerializable();
                state.D = (Integer) parcel.readSerializable();
                state.E = (Integer) parcel.readSerializable();
                state.w = (Boolean) parcel.readSerializable();
                state.q = (Locale) parcel.readSerializable();
                state.G = (Boolean) parcel.readSerializable();
                return state;
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.d);
            parcel.writeSerializable(this.e);
            parcel.writeSerializable(this.f);
            parcel.writeSerializable(this.g);
            parcel.writeSerializable(this.h);
            parcel.writeSerializable(this.i);
            parcel.writeSerializable(this.j);
            parcel.writeSerializable(this.k);
            parcel.writeInt(this.l);
            parcel.writeString(this.m);
            parcel.writeInt(this.n);
            parcel.writeInt(this.o);
            parcel.writeInt(this.p);
            CharSequence charSequence = this.r;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence2 = this.s;
            parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
            parcel.writeInt(this.t);
            parcel.writeSerializable(this.v);
            parcel.writeSerializable(this.x);
            parcel.writeSerializable(this.y);
            parcel.writeSerializable(this.z);
            parcel.writeSerializable(this.A);
            parcel.writeSerializable(this.B);
            parcel.writeSerializable(this.C);
            parcel.writeSerializable(this.F);
            parcel.writeSerializable(this.D);
            parcel.writeSerializable(this.E);
            parcel.writeSerializable(this.w);
            parcel.writeSerializable(this.q);
            parcel.writeSerializable(this.G);
        }
    }

    public BadgeState(Context context, State state) throws XmlPullParserException, Resources.NotFoundException, IOException {
        AttributeSet attributeSetAsAttributeSet;
        int styleAttribute;
        int next;
        state = state == null ? new State() : state;
        int i = state.d;
        if (i != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(a.k(i, new StringBuilder("Can't load badge resource ID #0x")));
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSetAsAttributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayD = ThemeEnforcement.d(context, attributeSetAsAttributeSet, R.styleable.c, com.woolworths.R.attr.badgeStyle, styleAttribute == 0 ? 2132084073 : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.c = typedArrayD.getDimensionPixelSize(4, -1);
        this.i = context.getResources().getDimensionPixelSize(com.woolworths.R.dimen.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(com.woolworths.R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.d = typedArrayD.getDimensionPixelSize(14, -1);
        this.e = typedArrayD.getDimension(12, resources.getDimension(com.woolworths.R.dimen.m3_badge_size));
        this.g = typedArrayD.getDimension(17, resources.getDimension(com.woolworths.R.dimen.m3_badge_with_text_size));
        this.f = typedArrayD.getDimension(3, resources.getDimension(com.woolworths.R.dimen.m3_badge_size));
        this.h = typedArrayD.getDimension(13, resources.getDimension(com.woolworths.R.dimen.m3_badge_with_text_size));
        this.k = typedArrayD.getInt(24, 1);
        State state2 = this.b;
        int i2 = state.l;
        state2.l = i2 == -2 ? 255 : i2;
        int i3 = state.n;
        if (i3 != -2) {
            state2.n = i3;
        } else if (typedArrayD.hasValue(23)) {
            this.b.n = typedArrayD.getInt(23, 0);
        } else {
            this.b.n = -1;
        }
        String str = state.m;
        if (str != null) {
            this.b.m = str;
        } else if (typedArrayD.hasValue(7)) {
            this.b.m = typedArrayD.getString(7);
        }
        State state3 = this.b;
        state3.r = state.r;
        CharSequence charSequence = state.s;
        state3.s = charSequence == null ? context.getString(com.woolworths.R.string.mtrl_badge_numberless_content_description) : charSequence;
        State state4 = this.b;
        int i4 = state.t;
        state4.t = i4 == 0 ? com.woolworths.R.plurals.mtrl_badge_content_description : i4;
        int i5 = state.u;
        state4.u = i5 == 0 ? com.woolworths.R.string.mtrl_exceed_max_badge_number_content_description : i5;
        Boolean bool = state.w;
        state4.w = Boolean.valueOf(bool == null || bool.booleanValue());
        State state5 = this.b;
        int i6 = state.o;
        state5.o = i6 == -2 ? typedArrayD.getInt(21, -2) : i6;
        State state6 = this.b;
        int i7 = state.p;
        state6.p = i7 == -2 ? typedArrayD.getInt(22, -2) : i7;
        State state7 = this.b;
        Integer num = state.h;
        state7.h = Integer.valueOf(num == null ? typedArrayD.getResourceId(5, com.woolworths.R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        State state8 = this.b;
        Integer num2 = state.i;
        state8.i = Integer.valueOf(num2 == null ? typedArrayD.getResourceId(6, 0) : num2.intValue());
        State state9 = this.b;
        Integer num3 = state.j;
        state9.j = Integer.valueOf(num3 == null ? typedArrayD.getResourceId(15, com.woolworths.R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        State state10 = this.b;
        Integer num4 = state.k;
        state10.k = Integer.valueOf(num4 == null ? typedArrayD.getResourceId(16, 0) : num4.intValue());
        State state11 = this.b;
        Integer num5 = state.e;
        state11.e = Integer.valueOf(num5 == null ? MaterialResources.a(context, typedArrayD, 1).getDefaultColor() : num5.intValue());
        State state12 = this.b;
        Integer num6 = state.g;
        state12.g = Integer.valueOf(num6 == null ? typedArrayD.getResourceId(8, 2132083487) : num6.intValue());
        Integer num7 = state.f;
        if (num7 != null) {
            this.b.f = num7;
        } else if (typedArrayD.hasValue(9)) {
            this.b.f = Integer.valueOf(MaterialResources.a(context, typedArrayD, 9).getDefaultColor());
        } else {
            this.b.f = Integer.valueOf(new TextAppearance(context, this.b.g.intValue()).j.getDefaultColor());
        }
        State state13 = this.b;
        Integer num8 = state.v;
        state13.v = Integer.valueOf(num8 == null ? typedArrayD.getInt(2, 8388661) : num8.intValue());
        State state14 = this.b;
        Integer num9 = state.x;
        state14.x = Integer.valueOf(num9 == null ? typedArrayD.getDimensionPixelSize(11, resources.getDimensionPixelSize(com.woolworths.R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        State state15 = this.b;
        Integer num10 = state.y;
        state15.y = Integer.valueOf(num10 == null ? typedArrayD.getDimensionPixelSize(10, resources.getDimensionPixelSize(com.woolworths.R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        State state16 = this.b;
        Integer num11 = state.z;
        state16.z = Integer.valueOf(num11 == null ? typedArrayD.getDimensionPixelOffset(18, 0) : num11.intValue());
        State state17 = this.b;
        Integer num12 = state.A;
        state17.A = Integer.valueOf(num12 == null ? typedArrayD.getDimensionPixelOffset(25, 0) : num12.intValue());
        State state18 = this.b;
        Integer num13 = state.B;
        state18.B = Integer.valueOf(num13 == null ? typedArrayD.getDimensionPixelOffset(19, state18.z.intValue()) : num13.intValue());
        State state19 = this.b;
        Integer num14 = state.C;
        state19.C = Integer.valueOf(num14 == null ? typedArrayD.getDimensionPixelOffset(26, state19.A.intValue()) : num14.intValue());
        State state20 = this.b;
        Integer num15 = state.F;
        state20.F = Integer.valueOf(num15 == null ? typedArrayD.getDimensionPixelOffset(20, 0) : num15.intValue());
        State state21 = this.b;
        Integer num16 = state.D;
        state21.D = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        State state22 = this.b;
        Integer num17 = state.E;
        state22.E = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        State state23 = this.b;
        Boolean bool2 = state.G;
        state23.G = Boolean.valueOf(bool2 == null ? typedArrayD.getBoolean(0, false) : bool2.booleanValue());
        typedArrayD.recycle();
        Locale locale = state.q;
        if (locale == null) {
            this.b.q = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.b.q = locale;
        }
        this.f14518a = state;
    }
}
