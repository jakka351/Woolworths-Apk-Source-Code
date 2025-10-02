package com.woolworths.scanlibrary.ui.metrowifi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import com.woolworths.scanlibrary.base.dagger.NoBackHandler;
import com.woolworths.scanlibrary.databinding.ActivityUseMetroWifiBinding;
import com.woolworths.scanlibrary.ui.home.HomeActivity;
import com.woolworths.scanlibrary.util.extensions.ContextExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/ui/metrowifi/UseMetroWifiActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UseMetroWifiActivity extends AppCompatActivity {
    public static final /* synthetic */ int v = 0;
    public ActivityUseMetroWifiBinding t;
    public final UseMetroWifiActivity$wifiStateChangeBroadcastReceiver$1 u = new BroadcastReceiver() { // from class: com.woolworths.scanlibrary.ui.metrowifi.UseMetroWifiActivity$wifiStateChangeBroadcastReceiver$1
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            NetworkInfo networkInfo;
            if (intent == null || !StringsKt.y(intent.getAction(), "android.net.wifi.STATE_CHANGE", false) || (networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo")) == null || !networkInfo.isConnected()) {
                return;
            }
            int i = UseMetroWifiActivity.v;
            HomeActivity.Companion.a(this.f21277a, (6 & 2) != 0, null);
        }
    };

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/metrowifi/UseMetroWifiActivity$Companion;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityUseMetroWifiBinding activityUseMetroWifiBinding = (ActivityUseMetroWifiBinding) DataBindingUtil.d(this, R.layout.activity_use_metro_wifi);
        this.t = activityUseMetroWifiBinding;
        if (activityUseMetroWifiBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        setSupportActionBar(activityUseMetroWifiBinding.y.y);
        ActivityUseMetroWifiBinding activityUseMetroWifiBinding2 = this.t;
        if (activityUseMetroWifiBinding2 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityUseMetroWifiBinding2.y.z.setText(getResources().getString(R.string.sng_label_enable_wifi));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.u();
        }
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.s(false);
        }
        ActivityUseMetroWifiBinding activityUseMetroWifiBinding3 = this.t;
        if (activityUseMetroWifiBinding3 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        TextView txtMessageTwo = activityUseMetroWifiBinding3.B;
        Intrinsics.g(txtMessageTwo, "txtMessageTwo");
        String string = getString(R.string.sng_label_store_wifi_available);
        Intrinsics.g(string, "getString(...)");
        String string2 = getString(R.string.sng_label_woolworth_free_wifi);
        Intrinsics.g(string2, "getString(...)");
        SpannableString spannableString = new SpannableString(string);
        int iC = StringsKt.C(string, string2, 0, false, 6);
        spannableString.setSpan(new ForegroundColorSpan(getColor(R.color.sng_color_primary)), iC, string2.length() + iC, 33);
        txtMessageTwo.setText(spannableString);
        txtMessageTwo.setTextColor(getColor(R.color.black_color));
        ActivityUseMetroWifiBinding activityUseMetroWifiBinding4 = this.t;
        if (activityUseMetroWifiBinding4 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        final int i = 0;
        activityUseMetroWifiBinding4.z.setOnClickListener(new View.OnClickListener(this) { // from class: com.woolworths.scanlibrary.ui.metrowifi.a
            public final /* synthetic */ UseMetroWifiActivity e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                UseMetroWifiActivity useMetroWifiActivity = this.e;
                switch (i2) {
                    case 0:
                        int i3 = UseMetroWifiActivity.v;
                        Callback.g(view);
                        try {
                            useMetroWifiActivity.startActivity(new Intent("android.net.wifi.PICK_WIFI_NETWORK"));
                            return;
                        } finally {
                        }
                    default:
                        int i4 = UseMetroWifiActivity.v;
                        Callback.g(view);
                        try {
                            HomeActivity.Companion.a(useMetroWifiActivity, (6 & 2) != 0, null);
                            return;
                        } finally {
                        }
                }
            }
        });
        ActivityUseMetroWifiBinding activityUseMetroWifiBinding5 = this.t;
        if (activityUseMetroWifiBinding5 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        final int i2 = 1;
        activityUseMetroWifiBinding5.A.setOnClickListener(new View.OnClickListener(this) { // from class: com.woolworths.scanlibrary.ui.metrowifi.a
            public final /* synthetic */ UseMetroWifiActivity e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                UseMetroWifiActivity useMetroWifiActivity = this.e;
                switch (i22) {
                    case 0:
                        int i3 = UseMetroWifiActivity.v;
                        Callback.g(view);
                        try {
                            useMetroWifiActivity.startActivity(new Intent("android.net.wifi.PICK_WIFI_NETWORK"));
                            return;
                        } finally {
                        }
                    default:
                        int i4 = UseMetroWifiActivity.v;
                        Callback.g(view);
                        try {
                            HomeActivity.Companion.a(useMetroWifiActivity, (6 & 2) != 0, null);
                            return;
                        } finally {
                        }
                }
            }
        });
        getF().a(this, new NoBackHandler(true));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        unregisterReceiver(this.u);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        registerReceiver(this.u, new IntentFilter("android.net.wifi.STATE_CHANGE"), "android.permission.CHANGE_WIFI_STATE", null);
        if (ContextExtKt.b(this)) {
            HomeActivity.Companion.a(this, (6 & 2) != 0, null);
        }
    }
}
