package com.cyberfend.cyfsecurity;

import YU.Um;
import YU.Un;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.dynatrace.android.callback.Callback;

/* loaded from: classes4.dex */
public class CCADialogActivity extends AppCompatActivity {
    public Button t;
    public CircleProgressBar u;
    public final Un.Fi v = new Un.Fi() { // from class: com.cyberfend.cyfsecurity.CCADialogActivity.1
        @Override // YU.Un.Fi
        public final void a(final float f) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.cyberfend.cyfsecurity.CCADialogActivity.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    CCADialogActivity.this.u.setProgress(f);
                }
            });
        }
    };

    /* renamed from: com.cyberfend.cyfsecurity.CCADialogActivity$2, reason: invalid class name */
    class AnonymousClass2 implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Callback.g(view);
            try {
                Um um = Um.J;
                int i = um.b;
                if (i == 1) {
                    um.o(2);
                } else if (i == 3) {
                    um.o(0);
                }
            } finally {
                Callback.h();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.woolworths.R.layout.activity_ccadialog);
        setFinishOnTouchOutside(false);
        this.u = (CircleProgressBar) findViewById(com.woolworths.R.id.dialogActivity_dialog_progressBar);
        String stringExtra = getIntent().getStringExtra(CircleProgressBar.a("ZF^/y@XGG"));
        String stringExtra2 = getIntent().getStringExtra(CircleProgressBar.a("ZF^/`L_XCFE"));
        String stringExtra3 = getIntent().getStringExtra(CircleProgressBar.a("ZF^/nHBHGM\u0000]sPVLD"));
        ((TextView) findViewById(com.woolworths.R.id.dialogActivity_dialog_title)).setText(stringExtra);
        ((TextView) findViewById(com.woolworths.R.id.dialogActivity_dialog_message)).setText(stringExtra2);
        Button button = (Button) findViewById(com.woolworths.R.id.dialogActivity_dialog_button);
        this.t = button;
        button.setText(stringExtra3);
        this.t.setOnClickListener(new AnonymousClass2());
        int intExtra = getIntent().getIntExtra(CircleProgressBar.a("MmzbH\toDNNR"), getResources().getColor(com.woolworths.R.color.akamaiCCAcolorPrimary));
        this.t.setTextColor(intExtra);
        this.u.setProgressBarColor(intExtra);
        Un.c.a(this.v);
    }
}
