package io.card.payment;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DateKeyListener;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.dynatrace.android.callback.Callback;
import io.card.payment.i18n.LocalizedStrings;
import io.card.payment.i18n.StringKey;
import io.card.payment.ui.Appearance;
import io.card.payment.ui.ViewUtil;

/* loaded from: classes7.dex */
public final class DataEntryActivity extends Activity implements TextWatcher {
    public static final /* synthetic */ int y = 0;
    public int d = 1;
    public int e = 100;
    public TextView f;
    public EditText g;
    public CardNumberValidator h;
    public EditText i;
    public Validator j;
    public EditText k;
    public Validator l;
    public EditText m;
    public Validator n;
    public EditText o;
    public Validator p;
    public ImageView q;
    public Button r;
    public Button s;
    public CreditCard t;
    public boolean u;
    public String v;
    public boolean w;
    public int x;

    public final void a() {
        int i = 100;
        while (true) {
            int i2 = i + 1;
            EditText editText = (EditText) findViewById(i);
            if (editText == null) {
                return;
            }
            if (editText.getText().length() == 0 && editText.requestFocus()) {
                return;
            } else {
                i = i2;
            }
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        EditText editText = this.g;
        if (editText == null || editable != editText.getText()) {
            EditText editText2 = this.i;
            if (editText2 == null || editable != editText2.getText()) {
                EditText editText3 = this.k;
                if (editText3 == null || editable != editText3.getText()) {
                    EditText editText4 = this.m;
                    if (editText4 == null || editable != editText4.getText()) {
                        EditText editText5 = this.o;
                        if (editText5 != null && editable == editText5.getText()) {
                            if (!this.p.b() || this.p.isValid()) {
                                d(this.o);
                            } else {
                                this.o.setTextColor(Appearance.p);
                            }
                        }
                    } else if (!this.n.b() || this.n.isValid()) {
                        d(this.m);
                    } else {
                        this.m.setTextColor(Appearance.p);
                    }
                } else if (!this.l.b()) {
                    d(this.k);
                } else if (this.l.isValid()) {
                    d(this.k);
                    a();
                } else {
                    this.k.setTextColor(Appearance.p);
                }
            } else if (!this.j.b()) {
                d(this.i);
            } else if (this.j.isValid()) {
                d(this.i);
                a();
            } else {
                this.i.setTextColor(Appearance.p);
            }
        } else {
            if (!this.h.b()) {
                d(this.g);
            } else if (this.h.isValid()) {
                d(this.g);
                a();
            } else {
                this.g.setTextColor(Appearance.p);
            }
            if (this.k != null) {
                CardType cardTypeFromCardNumber = CardType.fromCardNumber(this.h.d.toString());
                FixedLengthValidator fixedLengthValidator = (FixedLengthValidator) this.l;
                int iCvvLength = cardTypeFromCardNumber.cvvLength();
                fixedLengthValidator.d = iCvvLength;
                this.k.setHint(iCvvLength == 4 ? "1234" : "123");
            }
        }
        e();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void c() {
        if (this.t == null) {
            this.t = new CreditCard();
        }
        if (this.i != null) {
            CreditCard creditCard = this.t;
            ExpiryValidator expiryValidator = (ExpiryValidator) this.j;
            creditCard.expiryMonth = expiryValidator.d;
            creditCard.expiryYear = expiryValidator.e;
        }
        String str = this.h.d;
        CreditCard creditCard2 = this.t;
        CreditCard creditCard3 = new CreditCard(str, creditCard2.expiryMonth, creditCard2.expiryYear, this.l.getValue(), this.n.getValue(), this.p.getValue());
        Intent intent = new Intent();
        intent.putExtra(CardIOActivity.EXTRA_SCAN_RESULT, creditCard3);
        if (getIntent().hasExtra(CardIOActivity.EXTRA_CAPTURED_CARD_IMAGE)) {
            intent.putExtra(CardIOActivity.EXTRA_CAPTURED_CARD_IMAGE, getIntent().getByteArrayExtra(CardIOActivity.EXTRA_CAPTURED_CARD_IMAGE));
        }
        setResult(CardIOActivity.RESULT_CARD_INFO, intent);
        finish();
    }

    public final void d(EditText editText) {
        if (this.w) {
            editText.setTextColor(this.x);
        } else {
            editText.setTextColor(-12303292);
        }
    }

    public final void e() {
        this.r.setEnabled(this.h.isValid() && this.j.isValid() && this.l.isValid() && this.n.isValid() && this.p.isValid());
        if (this.u && this.h.isValid() && this.j.isValid() && this.l.isValid() && this.n.isValid() && this.p.isValid()) {
            c();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        setResult(CardIOActivity.RESULT_ENTRY_CANCELED);
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        super.onCreate(bundle);
        if (getIntent().getExtras() == null) {
            onBackPressed();
            return;
        }
        boolean booleanExtra = getIntent().getBooleanExtra(CardIOActivity.EXTRA_KEEP_APPLICATION_THEME, false);
        this.w = booleanExtra;
        if (!booleanExtra || getApplicationInfo().theme == 0) {
            setTheme(android.R.style.Theme.Holo.Light);
        } else {
            setTheme(getApplicationInfo().theme);
        }
        this.x = new TextView(this).getTextColors().getDefaultColor();
        this.v = "12dip";
        LocalizedStrings.f23883a.d(getIntent().getStringExtra(CardIOActivity.EXTRA_LANGUAGE_OR_LOCALE));
        int iE = ViewUtil.e(this, "4dip");
        RelativeLayout relativeLayout = new RelativeLayout(this);
        if (!this.w) {
            relativeLayout.setBackgroundColor(Appearance.g);
        }
        ScrollView scrollView = new ScrollView(this);
        int i = this.d;
        this.d = i + 1;
        scrollView.setId(i);
        int i2 = -1;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        relativeLayout.addView(scrollView, layoutParams);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout, -1, -1);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        this.t = (CreditCard) getIntent().getParcelableExtra(CardIOActivity.EXTRA_SCAN_RESULT);
        this.u = getIntent().getBooleanExtra("debug_autoAcceptResult", false);
        CreditCard creditCard = this.t;
        if (creditCard != null) {
            String str = creditCard.cardNumber;
            CardNumberValidator cardNumberValidator = new CardNumberValidator();
            cardNumberValidator.d = str;
            this.h = cardNumberValidator;
            this.q = new ImageView(this);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            this.q.setPadding(0, 0, 0, iE);
            layoutParams3.weight = 1.0f;
            this.q.setImageBitmap(CardIOActivity.v);
            linearLayout2.addView(this.q, layoutParams3);
            ViewUtil.a(this.q, null, null, null, "8dip");
            z = false;
        } else {
            TextView textView = new TextView(this);
            this.f = textView;
            textView.setTextSize(24.0f);
            if (!this.w) {
                this.f.setTextColor(Appearance.e);
            }
            linearLayout2.addView(this.f);
            ViewUtil.b(this.f, null, null, null, "8dip");
            ViewGroup.LayoutParams layoutParams4 = this.f.getLayoutParams();
            layoutParams4.width = -2;
            layoutParams4.height = -2;
            LinearLayout linearLayout3 = new LinearLayout(this);
            linearLayout3.setOrientation(1);
            ViewUtil.b(linearLayout3, null, "4dip", null, "4dip");
            TextView textView2 = new TextView(this);
            ViewUtil.b(textView2, this.v, null, null, null);
            textView2.setText(LocalizedStrings.a(StringKey.s));
            if (!this.w) {
                textView2.setTextColor(Appearance.q);
            }
            linearLayout3.addView(textView2, -2, -2);
            EditText editText = new EditText(this);
            this.g = editText;
            int i3 = this.e;
            z = false;
            this.e = i3 + 1;
            editText.setId(i3);
            this.g.setMaxLines(1);
            this.g.setImeOptions(6);
            this.g.setTextAppearance(getApplicationContext(), android.R.attr.textAppearanceLarge);
            this.g.setInputType(3);
            this.g.setHint("1234 5678 1234 5678");
            if (!this.w) {
                this.g.setHintTextColor(-3355444);
            }
            CardNumberValidator cardNumberValidator2 = new CardNumberValidator();
            this.h = cardNumberValidator2;
            this.g.addTextChangedListener(cardNumberValidator2);
            this.g.addTextChangedListener(this);
            this.g.setFilters(new InputFilter[]{new DigitsKeyListener(), this.h});
            i2 = -1;
            linearLayout3.addView(this.g, -1, -2);
            linearLayout2.addView(linearLayout3, -1, -1);
        }
        LinearLayout linearLayout4 = new LinearLayout(this);
        ViewGroup.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(i2, -2);
        ViewUtil.b(linearLayout4, null, "4dip", null, "4dip");
        boolean z5 = z;
        linearLayout4.setOrientation(z5 ? 1 : 0);
        boolean booleanExtra2 = getIntent().getBooleanExtra(CardIOActivity.EXTRA_REQUIRE_EXPIRY, z5);
        boolean booleanExtra3 = getIntent().getBooleanExtra(CardIOActivity.EXTRA_REQUIRE_CVV, z5);
        boolean booleanExtra4 = getIntent().getBooleanExtra(CardIOActivity.EXTRA_REQUIRE_POSTAL_CODE, z5);
        if (booleanExtra2) {
            LinearLayout linearLayout5 = new LinearLayout(this);
            z2 = booleanExtra4;
            z3 = booleanExtra2;
            z4 = booleanExtra3;
            ViewGroup.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(z5 ? 1 : 0, -1, 1.0f);
            linearLayout5.setOrientation(1);
            TextView textView3 = new TextView(this);
            if (!this.w) {
                textView3.setTextColor(Appearance.q);
            }
            textView3.setText(LocalizedStrings.a(StringKey.o));
            ViewUtil.b(textView3, this.v, null, null, null);
            linearLayout5.addView(textView3, -2, -2);
            EditText editText2 = new EditText(this);
            this.i = editText2;
            int i4 = this.e;
            this.e = i4 + 1;
            editText2.setId(i4);
            this.i.setMaxLines(1);
            this.i.setImeOptions(6);
            this.i.setTextAppearance(getApplicationContext(), android.R.attr.textAppearanceLarge);
            this.i.setInputType(3);
            this.i.setHint(LocalizedStrings.a(StringKey.p));
            if (!this.w) {
                this.i.setHintTextColor(-3355444);
            }
            CreditCard creditCard2 = this.t;
            if (creditCard2 != null) {
                int i5 = creditCard2.expiryMonth;
                int i6 = creditCard2.expiryYear;
                ExpiryValidator expiryValidator = new ExpiryValidator();
                expiryValidator.d = i5;
                expiryValidator.e = i6;
                expiryValidator.f = i5 > 0 && i6 > 0;
                if (i6 < 2000) {
                    expiryValidator.e = i6 + 2000;
                }
                this.j = expiryValidator;
            } else {
                this.j = new ExpiryValidator();
            }
            if (this.j.b()) {
                this.i.setText(this.j.getValue());
            }
            this.i.addTextChangedListener(this.j);
            this.i.addTextChangedListener(this);
            this.i.setFilters(new InputFilter[]{new DateKeyListener(), this.j});
            linearLayout5.addView(this.i, -1, -2);
            linearLayout4.addView(linearLayout5, layoutParams6);
            ViewUtil.a(linearLayout5, null, null, (z4 || z2) ? "4dip" : null, null);
        } else {
            z2 = booleanExtra4;
            z3 = booleanExtra2;
            z4 = booleanExtra3;
            this.j = new AlwaysValid();
        }
        if (z4) {
            LinearLayout linearLayout6 = new LinearLayout(this);
            ViewGroup.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(0, -1, 1.0f);
            linearLayout6.setOrientation(1);
            TextView textView4 = new TextView(this);
            if (!this.w) {
                textView4.setTextColor(Appearance.q);
            }
            ViewUtil.b(textView4, this.v, null, null, null);
            textView4.setText(LocalizedStrings.a(StringKey.l));
            linearLayout6.addView(textView4, -2, -2);
            EditText editText3 = new EditText(this);
            this.k = editText3;
            int i7 = this.e;
            this.e = i7 + 1;
            editText3.setId(i7);
            this.k.setMaxLines(1);
            this.k.setImeOptions(6);
            this.k.setTextAppearance(getApplicationContext(), android.R.attr.textAppearanceLarge);
            this.k.setInputType(3);
            this.k.setHint("123");
            if (!this.w) {
                this.k.setHintTextColor(-3355444);
            }
            int iCvvLength = this.t != null ? CardType.fromCardNumber(this.h.d).cvvLength() : 4;
            FixedLengthValidator fixedLengthValidator = new FixedLengthValidator();
            fixedLengthValidator.d = iCvvLength;
            this.l = fixedLengthValidator;
            this.k.setFilters(new InputFilter[]{new DigitsKeyListener(), this.l});
            this.k.addTextChangedListener(this.l);
            this.k.addTextChangedListener(this);
            linearLayout6.addView(this.k, -1, -2);
            linearLayout4.addView(linearLayout6, layoutParams7);
            ViewUtil.a(linearLayout6, z3 ? "4dip" : null, null, z2 ? "4dip" : null, null);
        } else {
            this.l = new AlwaysValid();
        }
        if (z2) {
            LinearLayout linearLayout7 = new LinearLayout(this);
            ViewGroup.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(0, -1, 1.0f);
            linearLayout7.setOrientation(1);
            TextView textView5 = new TextView(this);
            if (!this.w) {
                textView5.setTextColor(Appearance.q);
            }
            ViewUtil.b(textView5, this.v, null, null, null);
            textView5.setText(LocalizedStrings.a(StringKey.m));
            linearLayout7.addView(textView5, -2, -2);
            boolean booleanExtra5 = getIntent().getBooleanExtra(CardIOActivity.EXTRA_RESTRICT_POSTAL_CODE_TO_NUMERIC_ONLY, false);
            EditText editText4 = new EditText(this);
            this.m = editText4;
            int i8 = this.e;
            this.e = i8 + 1;
            editText4.setId(i8);
            this.m.setMaxLines(1);
            this.m.setImeOptions(6);
            this.m.setTextAppearance(getApplicationContext(), android.R.attr.textAppearanceLarge);
            if (booleanExtra5) {
                this.m.setInputType(3);
            } else {
                this.m.setInputType(1);
            }
            if (!this.w) {
                this.m.setHintTextColor(-3355444);
            }
            MaxLengthValidator maxLengthValidator = new MaxLengthValidator(20);
            this.n = maxLengthValidator;
            this.m.addTextChangedListener(maxLengthValidator);
            this.m.addTextChangedListener(this);
            linearLayout7.addView(this.m, -1, -2);
            linearLayout4.addView(linearLayout7, layoutParams8);
            ViewUtil.a(linearLayout7, (z3 || z4) ? "4dip" : null, null, null, null);
        } else {
            this.n = new AlwaysValid();
        }
        linearLayout2.addView(linearLayout4, layoutParams5);
        if (getIntent().getBooleanExtra(CardIOActivity.EXTRA_REQUIRE_CARDHOLDER_NAME, false)) {
            LinearLayout linearLayout8 = new LinearLayout(this);
            ViewUtil.b(linearLayout8, null, "4dip", null, null);
            linearLayout8.setOrientation(1);
            TextView textView6 = new TextView(this);
            if (!this.w) {
                textView6.setTextColor(Appearance.q);
            }
            ViewUtil.b(textView6, this.v, null, null, null);
            textView6.setText(LocalizedStrings.a(StringKey.n));
            linearLayout8.addView(textView6, -2, -2);
            EditText editText5 = new EditText(this);
            this.o = editText5;
            int i9 = this.e;
            this.e = i9 + 1;
            editText5.setId(i9);
            this.o.setMaxLines(1);
            this.o.setImeOptions(6);
            this.o.setTextAppearance(getApplicationContext(), android.R.attr.textAppearanceLarge);
            this.o.setInputType(1);
            if (!this.w) {
                this.o.setHintTextColor(-3355444);
            }
            MaxLengthValidator maxLengthValidator2 = new MaxLengthValidator(175);
            this.p = maxLengthValidator2;
            this.o.addTextChangedListener(maxLengthValidator2);
            this.o.addTextChangedListener(this);
            linearLayout8.addView(this.o, -1, -2);
            linearLayout2.addView(linearLayout8, -1, -2);
        } else {
            this.p = new AlwaysValid();
        }
        linearLayout.addView(linearLayout2, layoutParams2);
        ViewUtil.a(linearLayout2, "16dip", "20dip", "16dip", "20dip");
        LinearLayout linearLayout9 = new LinearLayout(this);
        int i10 = this.d;
        this.d = i10 + 1;
        linearLayout9.setId(i10);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams9.addRule(12);
        linearLayout9.setPadding(0, iE, 0, 0);
        linearLayout9.setBackgroundColor(0);
        layoutParams.addRule(2, linearLayout9.getId());
        this.r = new Button(this);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-1, -2, 1.0f);
        this.r.setText(LocalizedStrings.a(StringKey.k));
        this.r.setOnClickListener(new View.OnClickListener() { // from class: io.card.payment.DataEntryActivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Callback.g(view);
                try {
                    DataEntryActivity dataEntryActivity = DataEntryActivity.this;
                    int i11 = DataEntryActivity.y;
                    dataEntryActivity.c();
                } finally {
                    Callback.h();
                }
            }
        });
        this.r.setEnabled(false);
        linearLayout9.addView(this.r, layoutParams10);
        ViewUtil.c(this.r, true, this, this.w);
        ViewUtil.b(this.r, "5dip", null, "5dip", null);
        ViewUtil.a(this.r, "8dip", "8dip", "8dip", "8dip");
        if (!this.w) {
            this.r.setTextSize(16.0f);
        }
        this.s = new Button(this);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-1, -2, 1.0f);
        this.s.setText(LocalizedStrings.a(StringKey.d));
        this.s.setOnClickListener(new View.OnClickListener() { // from class: io.card.payment.DataEntryActivity.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Callback.g(view);
                try {
                    DataEntryActivity.this.onBackPressed();
                } finally {
                    Callback.h();
                }
            }
        });
        linearLayout9.addView(this.s, layoutParams11);
        ViewUtil.c(this.s, false, this, this.w);
        ViewUtil.b(this.s, "5dip", null, "5dip", null);
        ViewUtil.a(this.s, "4dip", "8dip", "8dip", "8dip");
        if (!this.w) {
            this.s.setTextSize(16.0f);
        }
        relativeLayout.addView(linearLayout9, layoutParams9);
        requestWindowFeature(8);
        setContentView(relativeLayout);
        Drawable drawable = getIntent().getBooleanExtra(CardIOActivity.EXTRA_USE_PAYPAL_ACTIONBAR_ICON, true) ? getResources().getDrawable(R.drawable.cio_ic_paypal_monogram) : null;
        if (z3 && this.j.isValid()) {
            afterTextChanged(this.i.getEditableText());
        }
        TextView textView7 = this.f;
        String strA = LocalizedStrings.a(StringKey.t);
        setTitle("card.io - " + strA);
        if (getActionBar() == null) {
            if (textView7 != null) {
                textView7.setText(strA);
                return;
            }
            return;
        }
        ActionBar actionBar = getActionBar();
        actionBar.setBackgroundDrawable(Appearance.f);
        actionBar.setTitle(strA);
        TextView textView8 = (TextView) findViewById(Resources.getSystem().getIdentifier("action_bar_title", "id", "android"));
        if (textView8 != null) {
            textView8.setTextColor(-1);
        }
        actionBar.setDisplayHomeAsUpEnabled(false);
        if (drawable != null) {
            actionBar.setIcon(drawable);
        } else {
            actionBar.setDisplayShowHomeEnabled(false);
        }
        if (textView7 != null) {
            textView7.setVisibility(8);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        getWindow().setFlags(0, 1024);
        getWindow().addFlags(8192);
        e();
        if (this.g != null || this.i == null || this.j.isValid()) {
            a();
        } else {
            this.i.requestFocus();
        }
        if (this.g == null && this.i == null && this.k == null && this.m == null && this.o == null) {
            return;
        }
        getWindow().setSoftInputMode(5);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
