package androidx.browser.trusted;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.browser.trusted.TrustedWebActivityDisplayMode;
import androidx.browser.trusted.sharing.ShareData;
import androidx.browser.trusted.sharing.ShareTarget;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class TrustedWebActivityIntentBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f218a;
    public List c;
    public Bundle d;
    public ShareData e;
    public ShareTarget f;
    public final CustomTabsIntent.Builder b = new CustomTabsIntent.Builder();
    public TrustedWebActivityDisplayMode g = new TrustedWebActivityDisplayMode.DefaultMode();
    public int h = 0;

    public TrustedWebActivityIntentBuilder(Uri uri) {
        this.f218a = uri;
    }

    public final TrustedWebActivityIntent a(CustomTabsSession customTabsSession) {
        if (customTabsSession == null) {
            throw new NullPointerException("CustomTabsSession is required for launching a TWA");
        }
        CustomTabsIntent.Builder builder = this.b;
        builder.b(customTabsSession);
        Intent intent = builder.a().f208a;
        intent.setData(this.f218a);
        intent.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
        if (this.c != null) {
            intent.putExtra("android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS", new ArrayList(this.c));
        }
        Bundle bundle = this.d;
        if (bundle != null) {
            intent.putExtra("androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS", bundle);
        }
        List list = Collections.EMPTY_LIST;
        ShareTarget shareTarget = this.f;
        if (shareTarget != null && this.e != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("androidx.browser.trusted.sharing.KEY_ACTION", shareTarget.f220a);
            bundle2.putString("androidx.browser.trusted.sharing.KEY_METHOD", shareTarget.b);
            bundle2.putString("androidx.browser.trusted.sharing.KEY_ENCTYPE", shareTarget.c);
            ShareTarget.Params params = shareTarget.d;
            Bundle bundle3 = new Bundle();
            bundle3.putString("androidx.browser.trusted.sharing.KEY_TITLE", params.f222a);
            bundle3.putString("androidx.browser.trusted.sharing.KEY_TEXT", params.b);
            List<ShareTarget.FileFormField> list2 = params.c;
            if (list2 != null) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (ShareTarget.FileFormField fileFormField : list2) {
                    fileFormField.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString("androidx.browser.trusted.sharing.KEY_FILE_NAME", fileFormField.f221a);
                    bundle4.putStringArrayList("androidx.browser.trusted.sharing.KEY_ACCEPTED_TYPES", new ArrayList<>(fileFormField.b));
                    arrayList.add(bundle4);
                }
                bundle3.putParcelableArrayList("androidx.browser.trusted.sharing.KEY_FILES", arrayList);
            }
            bundle2.putBundle("androidx.browser.trusted.sharing.KEY_PARAMS", bundle3);
            intent.putExtra("androidx.browser.trusted.extra.SHARE_TARGET", bundle2);
            ShareData shareData = this.e;
            shareData.getClass();
            Bundle bundle5 = new Bundle();
            bundle5.putString("androidx.browser.trusted.sharing.KEY_TITLE", shareData.f219a);
            bundle5.putString("androidx.browser.trusted.sharing.KEY_TEXT", shareData.b);
            List list3 = shareData.c;
            if (list3 != null) {
                bundle5.putParcelableArrayList("androidx.browser.trusted.sharing.KEY_URIS", new ArrayList<>(list3));
            }
            intent.putExtra("androidx.browser.trusted.extra.SHARE_DATA", bundle5);
            List list4 = this.e.c;
            if (list4 != null) {
                list = list4;
            }
        }
        intent.putExtra("androidx.browser.trusted.extra.DISPLAY_MODE", this.g.toBundle());
        intent.putExtra("androidx.browser.trusted.extra.SCREEN_ORIENTATION", this.h);
        return new TrustedWebActivityIntent(intent, list);
    }

    public final CustomTabsIntent b() {
        return this.b.a();
    }

    public final Uri c() {
        return this.f218a;
    }

    public final void d(CustomTabColorSchemeParams customTabColorSchemeParams) {
        CustomTabsIntent.Builder builder = this.b;
        builder.getClass();
        builder.e = customTabColorSchemeParams.b();
    }
}
