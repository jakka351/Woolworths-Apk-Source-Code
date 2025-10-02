package com.cisco.or.sdk.activity;

import android.content.Intent;
import android.net.wifi.WifiNetworkSuggestion;
import android.net.wifi.hotspot2.ConfigParser;
import android.net.wifi.hotspot2.PasspointConfiguration;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.media3.exoplayer.source.mediaparser.a;
import com.cisco.or.sdk.utils.SharedPrefs;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/cisco/or/sdk/activity/SDKActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SDKActivity extends AppCompatActivity {
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && intent != null && intent.hasExtra("android.provider.extra.WIFI_NETWORK_RESULT_LIST")) {
            ArrayList<Integer> integerArrayListExtra = intent.getIntegerArrayListExtra("android.provider.extra.WIFI_NETWORK_RESULT_LIST");
            Intrinsics.e(integerArrayListExtra);
            Iterator<Integer> it = integerArrayListExtra.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                if (next != null && next.intValue() == 0) {
                    new SharedPrefs(this).b(true);
                    Log.d("TAG", "OpenRoaming is initialized. ADD_WIFI_RESULT_SUCCESS");
                } else if (next != null && next.intValue() == 1) {
                    Log.d("TAG", "OpenRoaming is initialized. ADD_WIFI_RESULT_ADD_OR_UPDATE_FAILED");
                } else if (next != null && next.intValue() == 2) {
                    Log.d("TAG", "OpenRoaming is initialized. ADD_WIFI_RESULT_ALREADY_EXISTS");
                } else {
                    Log.d("TAG", "OpenRoaming is initialized. rejected");
                }
            }
        }
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        setContentView(R.layout.activity_s_d_k);
        if (Build.VERSION.SDK_INT < 30 || (extras = getIntent().getExtras()) == null) {
            return;
        }
        byte[] byteArray = extras.getByteArray("profileData");
        WifiNetworkSuggestion wifiNetworkSuggestionBuild = a.l().setPasspointConfig(new PasspointConfiguration(ConfigParser.parsePasspointConfig("application/x-wifi-config", byteArray))).build();
        Intrinsics.g(wifiNetworkSuggestionBuild, "Builder().setPasspointCo…(passpointConfig).build()");
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        arrayList.add(wifiNetworkSuggestionBuild);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelableArrayList("android.provider.extra.WIFI_NETWORK_LIST", arrayList);
        Intent intent = new Intent("android.settings.WIFI_ADD_NETWORKS");
        intent.putExtras(bundle2);
        startActivityForResult(intent, 0);
    }
}
