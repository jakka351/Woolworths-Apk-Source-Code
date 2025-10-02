package au.com.woolworths.feature.shared.copy.to.clipboard;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.core.content.IntentCompat;
import au.com.woolworths.android.onesite.navigation.Activities;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shared/copy/to/clipboard/CopyToClipboardActionActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "copy-to-clipboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CopyToClipboardActionActivity extends ComponentActivity {
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Activities.CopyToClipboardActionActivity.Extras extras = (Activities.CopyToClipboardActionActivity.Extras) IntentCompat.a(getIntent(), "EXTRA_DATA", Activities.CopyToClipboardActionActivity.Extras.class);
        String str = extras != null ? extras.d : null;
        String str2 = extras != null ? extras.e : null;
        if (str != null && !StringsKt.D(str)) {
            Object systemService = getSystemService("clipboard");
            Intrinsics.f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            String string = getString(com.woolworths.R.string.copy_to_clipboard_action_label);
            Intrinsics.g(string, "getString(...)");
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(string, str));
            if (str2 != null && !StringsKt.D(str2)) {
                Toast.makeText(getApplicationContext(), str2, 0).show();
            }
        }
        finish();
    }
}
