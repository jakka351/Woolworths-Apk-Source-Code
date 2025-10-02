package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.medallia.digital.mobilesdk.j1;
import com.medallia.digital.mobilesdk.x3;

/* loaded from: classes6.dex */
class k4 extends m4 {
    private static final float k = 1.0f;
    private static final float l = 4.0f;
    private static final int m = 15;
    private static final int n = 10;
    private static final int o = 600;
    private static final double p = 0.2d;
    private static final float q = 0.7f;
    private TextView g;
    private ImageView h;
    private x4 i;
    private View j;

    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            k4 k4Var = k4.this;
            l4 l4Var = k4Var.f16593a;
            if (l4Var != null && l4Var.f) {
                k4Var.e = motionEvent.getAction() == 0;
            }
            return false;
        }
    }

    public class b extends v4 {

        public class a extends v4 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f16567a;

            public a(String str) {
                this.f16567a = str;
            }

            @Override // com.medallia.digital.mobilesdk.v4
            public void a() {
                super.a();
                k4 k4Var = k4.this;
                k4Var.setContentDescription(this.f16567a + " " + k4Var.f16593a.b + " ");
            }
        }

        public b() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            w7.b().c().execute(new a(x3.e().a(k4.h(), k4.this.f, x3.c.ALERT, (x3.a) null)));
        }
    }

    public k4(l4 l4Var, Context context, String str) {
        super(l4Var, context, str);
    }

    private int a(int i) {
        return (i * getResources().getDisplayMetrics().densityDpi) / 160;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String h() {
        ConfigurationContract configurationContractA = t0.c().a();
        y3 localization = configurationContractA != null ? configurationContractA.getLocalization() : null;
        return (localization == null || localization.f() == null) ? "" : localization.f().getLocalUrl();
    }

    private void i() {
        View view = this.j;
        if (view == null) {
            return;
        }
        view.setOnTouchListener(new a());
    }

    private void j() {
        w7.b().a().execute(new b());
    }

    @Override // com.medallia.digital.mobilesdk.m4
    public boolean b() {
        return this.f16593a.f;
    }

    @Override // com.medallia.digital.mobilesdk.m4
    public boolean c() {
        return this.f16593a.k;
    }

    @Override // com.medallia.digital.mobilesdk.m4
    public boolean d() {
        return false;
    }

    @Override // com.medallia.digital.mobilesdk.m4
    public View e() {
        return this.h;
    }

    @Override // com.medallia.digital.mobilesdk.m4
    public View f() {
        return this.g;
    }

    private GradientDrawable a(int i, int i2) {
        return a(Integer.valueOf(i), (float[]) null, i2);
    }

    @Override // com.medallia.digital.mobilesdk.m4
    public RelativeLayout b(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.medallia_view_banner, (ViewGroup) this.b, false);
        x4 x4Var = new x4(getContext(), null, 0, R.style.MedalliaDefaultShadowStyle);
        this.i = x4Var;
        x4Var.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.d.removeAllViews();
        this.d.addView(this.i);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -1);
        if (this.f16593a.e == j1.c.TOP) {
            layoutParams.setMargins(0, 0, 0, a(10));
        } else {
            layoutParams.setMargins(0, a(10), 0, 0);
        }
        this.c.setLayoutParams(layoutParams);
        this.i.addView(this.c);
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.medallia_banner_root_view);
        this.j = viewInflate.findViewById(R.id.text_container);
        i();
        TextView textView = (TextView) viewInflate.findViewById(R.id.medallia_banner_title_text_view);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.medallia_banner_message_text_view);
        this.g = (TextView) viewInflate.findViewById(R.id.medallia_positive_view);
        this.h = (ImageView) viewInflate.findViewById(R.id.medallia_negative_view);
        String str = this.f16593a.f16581a;
        if (str != null) {
            textView2.setText(str);
            textView2.setAlpha(q);
            a(textView2, this.f16593a.m, 0);
        }
        String str2 = this.f16593a.b;
        if (str2 != null) {
            textView.setText(str2);
            j();
            a(textView, this.f16593a.m, 1);
        }
        if (!TextUtils.isEmpty(this.f16593a.c)) {
            try {
                relativeLayout.setBackgroundColor(Color.parseColor(this.f16593a.c));
            } catch (Exception unused) {
                a4.f("Error on set banner background color");
            }
        }
        if (!TextUtils.isEmpty(this.f16593a.d)) {
            try {
                textView.setTextColor(Color.parseColor(this.f16593a.d));
                textView2.setTextColor(Color.parseColor(this.f16593a.d));
            } catch (Exception unused2) {
                a4.f("Error on set banner background color");
            }
        }
        if (this.f16593a.f) {
            this.g.setVisibility(0);
            try {
                a(this.g, this.f16593a.m, 1);
                if (!TextUtils.isEmpty(this.f16593a.i)) {
                    this.g.setBackgroundColor(Color.parseColor(this.f16593a.i));
                }
                if (!TextUtils.isEmpty(this.f16593a.h)) {
                    this.g.setTextColor(Color.parseColor(this.f16593a.h));
                }
                if (!TextUtils.isEmpty(this.f16593a.g)) {
                    this.g.setText(this.f16593a.g);
                }
            } catch (Exception unused3) {
                a4.f("Error on set banner action button");
            }
            this.h.setVisibility(0);
            try {
                Drawable drawable = i4.c().b() != null ? i4.c().b().getDrawable(R.drawable.md_close_banner) : null;
                if (drawable != null && !TextUtils.isEmpty(this.f16593a.j)) {
                    drawable.setColorFilter(Color.parseColor(this.f16593a.j), PorterDuff.Mode.MULTIPLY);
                    this.h.setImageDrawable(drawable);
                }
            } catch (Exception unused4) {
                a4.c("Error on set banner close button color");
            }
        } else {
            this.g.setVisibility(8);
            this.h.setVisibility(8);
        }
        if (this.f16593a.l) {
            if (getResources().getConfiguration().smallestScreenWidthDp < o || i4.c().b().getResources().getConfiguration().orientation != 2) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.c.getLayoutParams();
                layoutParams2.setMargins(a(10), a(10), a(10), a(10));
                this.c.setLayoutParams(layoutParams2);
            } else {
                ((Activity) i4.c().d().getBaseContext()).getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
                int i = (int) (r9.widthPixels * p);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.c.getLayoutParams();
                layoutParams3.setMargins(i, a(10), i, a(10));
                this.c.setLayoutParams(layoutParams3);
            }
        }
        a();
        return relativeLayout;
    }

    private GradientDrawable a(int i, String str) {
        float f = i;
        return a(new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f, f, f}, Color.parseColor(str));
    }

    private GradientDrawable a(Integer num, float[] fArr, int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i);
        if (fArr != null) {
            gradientDrawable.setCornerRadii(fArr);
        }
        if (num != null) {
            gradientDrawable.setCornerRadius(num.intValue());
        }
        return gradientDrawable;
    }

    private GradientDrawable a(float[] fArr, int i) {
        return a((Integer) null, fArr, i);
    }

    @Override // com.medallia.digital.mobilesdk.m4
    public void a() {
        float f = getResources().getDisplayMetrics().density;
        this.i.b(true);
        this.i.b(1.0f * f);
        this.i.a(f * l);
    }

    private void a(TextView textView, String str, int i) {
        if (str == null || textView == null) {
            return;
        }
        try {
            textView.setTypeface(Typeface.create(str, i));
        } catch (Exception unused) {
            a4.c("Failed on setting font: ".concat(str));
        }
    }
}
