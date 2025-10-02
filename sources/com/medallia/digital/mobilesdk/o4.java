package com.medallia.digital.mobilesdk;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dynatrace.android.callback.Callback;
import com.medallia.digital.mobilesdk.Broadcasts;
import java.io.File;

/* loaded from: classes6.dex */
class o4 extends Dialog {
    private static final int t = 10;
    private static final int u = 25;
    private static final String v = "#004ccb";

    /* renamed from: a, reason: collision with root package name */
    private TextView f16620a;
    private ImageView b;
    private ImageView c;
    private TextView d;
    private TextView e;
    private ThanksButton f;
    private TextView g;
    private ImageView h;
    private View i;
    private final j2 j;
    private final r7 k;
    private final RelativeLayout l;
    private LinearLayout m;
    private e n;
    private d o;
    private boolean p;
    private v5 q;
    private v5 r;
    private MDAppearanceMode s;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Callback.g(view);
            try {
                a4.e("Thank You Prompt was closed by close button");
                o4.this.n.close();
            } finally {
                Callback.h();
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Callback.g(view);
            try {
                a4.e("Thank You Prompt was closed by x button");
                o4.this.n.close();
            } finally {
                Callback.h();
            }
        }
    }

    public class c extends ClickableSpan {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ URLSpan f16623a;

        public c(URLSpan uRLSpan) {
            this.f16623a = uRLSpan;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (o4.this.o.a(this.f16623a.getURL())) {
                Broadcasts.d.a(Broadcasts.d.a.formBlockedUrl, o4.this.j.getFormId(), o4.this.j.getFormType(), this.f16623a.getURL());
                return;
            }
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(this.f16623a.getURL()));
                intent.setFlags(268435456);
                intent.addCategory("android.intent.category.BROWSABLE");
                i4.c().d().startActivity(intent);
                o4.this.n.close();
            } catch (Exception e) {
                a4.c(e.getMessage());
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    public interface d {
        boolean a(String str);
    }

    public interface e {
        void close();
    }

    public o4(Context context, j2 j2Var, boolean z, v5 v5Var, v5 v5Var2, MDAppearanceMode mDAppearanceMode) {
        super(context, R.style.MedalliaTYPDialog);
        this.p = false;
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        setContentView(R.layout.medallia_thank_you_promt_dialog);
        this.l = (RelativeLayout) findViewById(R.id.medallia_thank_you_prompt_root_view);
        this.j = j2Var;
        this.k = j2Var.i();
        d();
        a(z, v5Var, v5Var2, mDAppearanceMode);
        f();
        a();
        b();
        e();
        c();
    }

    private int a(int i) {
        return (i * i4.c().b().getResources().getDisplayMetrics().densityDpi) / 160;
    }

    private void d() {
        this.c = (ImageView) findViewById(R.id.medallia_logo_image);
        this.d = (TextView) findViewById(R.id.thank_you_title);
        this.e = (TextView) findViewById(R.id.thank_you_subtitle);
        this.f = (ThanksButton) findViewById(R.id.thank_you_button);
        this.g = (TextView) findViewById(R.id.thank_you_power_by);
        this.f16620a = (TextView) findViewById(R.id.medallia_typ_form_title);
        this.b = (ImageView) findViewById(R.id.medallia_modal_close_button);
        this.h = (ImageView) findViewById(R.id.powerBy_logo);
        this.m = (LinearLayout) findViewById(R.id.poweredby_container);
        this.i = findViewById(R.id.medallia_delimiter);
    }

    private void e() {
        MDAppearanceMode mDAppearanceMode;
        v5 v5Var;
        r7 r7Var = this.k;
        if (r7Var != null) {
            String strN = r7Var.n();
            String strL = this.k.l();
            String strE = this.k.e();
            String strA = this.k.a();
            try {
                if (this.p && (v5Var = this.q) != null) {
                    strE = v5Var.c().c();
                    strA = this.q.b().a();
                }
            } catch (Exception unused) {
                a4.f("Error on set thank you prompt content text and background dark mode color");
            }
            if (!this.j.isPoweredByVisible()) {
                this.g.setVisibility(8);
                this.h.setVisibility(8);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.m.getLayoutParams();
                layoutParams.setMargins(0, 0, 0, a(25));
                this.m.setLayoutParams(layoutParams);
            } else if (this.p && (mDAppearanceMode = this.s) != null && mDAppearanceMode.equals(MDAppearanceMode.dark)) {
                this.h.setImageResource(R.drawable.md_dark_logo_power_by);
                this.g.setTextColor(-1);
            }
            if (TextUtils.isEmpty(strN)) {
                this.d.setVisibility(8);
            } else {
                b(this.d, YU.a.h("<html>", strN, "</html>"));
                a(this.d, this.k.g());
            }
            if (TextUtils.isEmpty(strL)) {
                this.e.setVisibility(8);
            } else {
                b(this.e, YU.a.h("<html>", strL, "</html>"));
                a(this.e, this.k.g());
            }
            if (!TextUtils.isEmpty(strE)) {
                try {
                    this.d.setTextColor(Color.parseColor(strE));
                    this.e.setTextColor(Color.parseColor(strE));
                } catch (Exception unused2) {
                    a4.f("Error on set thank you prompt content color");
                }
            }
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            try {
                this.l.setBackgroundColor(Color.parseColor(strA));
            } catch (Exception unused3) {
                a4.f("Error on set thank you content background color");
            }
        }
    }

    private void f() {
        v5 v5Var;
        String title = this.j.getTitle();
        String titleTextColor = this.j.getTitleTextColor();
        String titleBackgroundColor = this.j.getTitleBackgroundColor();
        try {
            if (this.p && (v5Var = this.r) != null) {
                titleTextColor = v5Var.c().b();
                titleBackgroundColor = this.r.b().b();
                this.i.setBackgroundColor(Color.parseColor(titleBackgroundColor));
            }
        } catch (Exception unused) {
            a4.f("Error on set prompt title text and background dark mode color");
        }
        if (!TextUtils.isEmpty(title)) {
            this.f16620a.setText(title);
        }
        if (!TextUtils.isEmpty(titleTextColor)) {
            try {
                this.f16620a.setTextColor(Color.parseColor(titleTextColor));
                this.b.setColorFilter(Color.parseColor(titleTextColor), PorterDuff.Mode.SRC_IN);
                r7 r7Var = this.k;
                if (r7Var != null && !TextUtils.isEmpty(r7Var.o())) {
                    this.b.setContentDescription(this.k.o());
                }
            } catch (Exception unused2) {
                a4.f("Error on set prompt title text color");
            }
        }
        if (TextUtils.isEmpty(titleBackgroundColor)) {
            return;
        }
        try {
            this.f16620a.setBackgroundColor(Color.parseColor(titleBackgroundColor));
        } catch (Exception unused3) {
            a4.f("Error on set prompt title background color");
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        this.f = null;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        a4.b("TYP dispatchTouchEvent");
        Broadcasts.j.a(Broadcasts.j.a.TouchEvent, motionEvent.getAction());
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        dismiss();
    }

    private void b() {
        MDAppearanceMode mDAppearanceMode;
        r7 r7Var = this.k;
        if (r7Var != null) {
            String strH = r7Var.h();
            String strI = this.k.i();
            MDGifView mDGifView = (MDGifView) findViewById(R.id.GifImageView);
            if (!this.k.q()) {
                this.c.setVisibility(8);
                return;
            }
            this.c.setVisibility(0);
            if (this.p && (mDAppearanceMode = this.s) != null && mDAppearanceMode.equals(MDAppearanceMode.dark)) {
                this.c.setImageResource(R.drawable.md_place_dark_holder_image);
                strI = this.k.f();
            }
            if (!TextUtils.isEmpty(strI)) {
                File fileD = g2.d(strI);
                if (fileD.exists()) {
                    if (strI.endsWith(".gif")) {
                        mDGifView.setGifImageUri(Uri.fromFile(fileD));
                        if (!TextUtils.isEmpty(strH)) {
                            mDGifView.setContentDescription(strH);
                        }
                        mDGifView.setVisibility(0);
                        mDGifView.play();
                        this.c.setVisibility(8);
                    } else {
                        this.c.setImageBitmap(BitmapFactory.decodeFile(fileD.getAbsolutePath()));
                        mDGifView.setVisibility(8);
                    }
                }
            }
            if (TextUtils.isEmpty(strH)) {
                return;
            }
            this.c.setContentDescription(strH);
        }
    }

    private void c() {
        this.f.setOnClickListener(new a());
        this.b.setOnClickListener(new b());
    }

    private String a(String str) {
        return str.replace("&lt", "<").replace("&gt&lt/", "</").replace("&gt", ">");
    }

    public void b(TextView textView, String str) {
        Spannable spannable = (Spannable) Html.fromHtml(a(str));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannable);
        for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannable.length(), URLSpan.class)) {
            a(spannableStringBuilder, uRLSpan);
        }
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void a() {
        v5 v5Var;
        r7 r7Var = this.k;
        if (r7Var != null) {
            String strC = r7Var.c();
            String strD = this.k.d();
            String strB = this.k.b();
            try {
                if (this.p && (v5Var = this.q) != null) {
                    strD = v5Var.c().a();
                    strB = this.q.a().a();
                }
            } catch (Exception unused) {
                a4.f("Error on set thank you close button text and background dark mode color");
            }
            if (!this.k.p()) {
                this.f.setVisibility(8);
                return;
            }
            if (!TextUtils.isEmpty(strC)) {
                this.f.setText(strC);
                this.f.setAllCaps(false);
            }
            if (!TextUtils.isEmpty(strD)) {
                try {
                    this.f.setTextColor(Color.parseColor(strD));
                } catch (Exception unused2) {
                    a4.f("Error on set thank you close button text color");
                }
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            if (TextUtils.isEmpty(strB)) {
                gradientDrawable.setColor(Color.parseColor(v));
            } else {
                try {
                    gradientDrawable.setColor(Color.parseColor(strB));
                } catch (Exception unused3) {
                    a4.f("Error on set thank you close button background color");
                }
            }
            gradientDrawable.setCornerRadius(10.0f);
            this.f.requestFocus();
            this.f.setBackground(gradientDrawable);
        }
    }

    public void a(SpannableStringBuilder spannableStringBuilder, URLSpan uRLSpan) {
        spannableStringBuilder.setSpan(new c(uRLSpan), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
        spannableStringBuilder.removeSpan(uRLSpan);
    }

    private void a(TextView textView, String str) {
        if (str == null || textView == null) {
            return;
        }
        try {
            textView.setTypeface(Typeface.create(str, 0));
        } catch (Exception unused) {
            a4.c("Failed on setting font: ".concat(str));
        }
    }

    public void a(d dVar) {
        this.o = dVar;
    }

    public void a(e eVar) {
        this.n = eVar;
    }

    private void a(boolean z, v5 v5Var, v5 v5Var2, MDAppearanceMode mDAppearanceMode) {
        j2 j2Var;
        if (this.k == null || (j2Var = this.j) == null || !j2Var.isDarkModeEnabled()) {
            return;
        }
        this.p = this.j.isDarkModeEnabled();
        if (z) {
            this.q = v5Var;
            this.r = v5Var2;
            this.s = mDAppearanceMode;
        } else {
            this.s = v7.c().a();
            this.q = v7.c().a(this.k.m());
            this.r = v7.c().a(this.j.getHeaderThemeName());
        }
    }
}
