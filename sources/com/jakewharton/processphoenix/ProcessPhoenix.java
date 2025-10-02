package com.jakewharton.processphoenix;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class ProcessPhoenix extends Activity {
    public static final /* synthetic */ int d = 0;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("phoenix_restart_intents");
        startActivities((Intent[]) parcelableArrayListExtra.toArray(new Intent[parcelableArrayListExtra.size()]));
        finish();
        Runtime.getRuntime().exit(0);
    }
}
