package com.woolworths.scanlibrary.util.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;

/* loaded from: classes7.dex */
public class PriceView extends RelativeLayout {
    public int d;
    public int e;
    public final int f;
    public float g;
    public final boolean h;
    public String i;
    public TextView j;
    public TextView k;
    public TextView l;
    public TextView m;

    public PriceView(Context context) {
        super(context);
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = BitmapDescriptorFactory.HUE_RED;
        this.h = false;
        this.i = "";
        a(context);
    }

    public final void a(Context context) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        if (layoutInflater != null) {
            View viewInflate = layoutInflater.inflate(R.layout.custom_price_view, (ViewGroup) this, true);
            this.j = (TextView) viewInflate.findViewById(R.id.txtItemPrice);
            this.k = (TextView) viewInflate.findViewById(R.id.txtItemPriceCents);
            this.l = (TextView) viewInflate.findViewById(R.id.labelDollar);
            this.m = (TextView) viewInflate.findViewById(R.id.unit);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.k.getLayoutParams();
            int i = layoutParams.leftMargin;
            int i2 = layoutParams.rightMargin;
            int i3 = layoutParams.bottomMargin;
            int i4 = this.f;
            layoutParams.setMargins(i, i4, i2, i3);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.l.getLayoutParams();
            layoutParams2.setMargins(layoutParams2.leftMargin, i4, layoutParams2.rightMargin, layoutParams2.bottomMargin);
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.m.getLayoutParams();
            layoutParams3.setMargins(layoutParams3.leftMargin, i4, layoutParams3.rightMargin, layoutParams3.bottomMargin);
            b();
            if (this.h) {
                this.m.setText(this.i);
                this.m.setVisibility(0);
            } else {
                this.m.setVisibility(8);
            }
        }
        int i5 = this.d;
        int i6 = this.e;
        this.d = i5;
        this.e = i6;
        b();
    }

    public final void b() {
        this.l.setTextSize(0, this.g / 2.0f);
        this.k.setTextSize(0, this.g / 2.0f);
        this.j.setTextSize(0, this.g);
        this.m.setTextSize(0, this.g / 2.0f);
        this.j.setText(String.valueOf(this.d));
        this.k.setText(String.format("%02d", Integer.valueOf(this.e)));
        this.m.setText(this.i);
    }

    public void setCents(int i) {
        this.e = i;
        b();
    }

    public void setDollar(int i) {
        this.d = i;
        b();
    }

    public void setTextSize(float f) {
        this.g = f;
        b();
    }

    public void setUnit(String str) {
        this.i = str;
        b();
    }

    public PriceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = BitmapDescriptorFactory.HUE_RED;
        this.h = false;
        this.i = "";
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.woolworths.scanlibrary.R.styleable.c, 0, 0);
        this.h = typedArrayObtainStyledAttributes.getBoolean(2, false);
        this.i = typedArrayObtainStyledAttributes.getString(5);
        this.g = typedArrayObtainStyledAttributes.getDimension(3, getResources().getDimensionPixelSize(R.dimen.sng_default_price_view_size));
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, getResources().getDimensionPixelSize(R.dimen.sng_default_price_view_top_margin));
        this.e = typedArrayObtainStyledAttributes.getInt(0, 0);
        this.d = typedArrayObtainStyledAttributes.getInt(1, 0);
        a(context);
    }
}
