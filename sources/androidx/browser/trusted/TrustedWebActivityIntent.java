package androidx.browser.trusted;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class TrustedWebActivityIntent {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f217a;
    public final List b;

    public TrustedWebActivityIntent(Intent intent, List list) {
        this.f217a = intent;
        this.b = list;
    }

    public final Intent a() {
        return this.f217a;
    }

    public final void b(Context context) {
        Iterator it = this.b.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            Intent intent = this.f217a;
            if (!zHasNext) {
                context.startActivity(intent, null);
                return;
            } else {
                context.grantUriPermission(intent.getPackage(), (Uri) it.next(), 1);
            }
        }
    }
}
